package com.worldline.connect.sdk.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.localserver.LocalServerTestBase;
import org.apache.http.protocol.HttpRequestHandler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import com.worldline.connect.sdk.java.authentication.Authenticator;
import com.worldline.connect.sdk.java.authentication.V1HMACAuthenticator;
import com.worldline.connect.sdk.java.communication.Connection;
import com.worldline.connect.sdk.java.communication.DefaultConnection;
import com.worldline.connect.sdk.java.communication.MetadataProvider;
import com.worldline.connect.sdk.java.communication.RequestParam;
import com.worldline.connect.sdk.java.json.Marshaller;
import com.worldline.connect.sdk.java.v1.DeclinedPaymentException;
import com.worldline.connect.sdk.java.v1.IdempotenceException;
import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.Card;
import com.worldline.connect.sdk.java.v1.domain.CardPaymentMethodSpecificInput;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentResponse;
import com.worldline.connect.sdk.java.v1.domain.Customer;
import com.worldline.connect.sdk.java.v1.domain.Order;
import com.worldline.connect.sdk.java.v1.merchant.payments.PaymentsClient;

class CommunicatorTest {

    private static final URI BASE_URI = URI.create("https://api.preprod.connect.worldline-solutions.com");

    private Connection connection;
    private Authenticator authenticator;
    private MetadataProvider metadataProvider;
    private Marshaller marshaller;

    @BeforeEach
    void initMocks() {
        connection = mock(Connection.class);
        authenticator = mock(Authenticator.class);
        metadataProvider = mock(MetadataProvider.class);
        marshaller = mock(Marshaller.class);
    }

    @Nested
    class ToAbsoluteURI {

        @Test
        void testWithoutRequestParams() {
            @SuppressWarnings("resource")
            Communicator communicator = new Communicator(BASE_URI, connection, authenticator, metadataProvider, marshaller);

            URI uri = communicator.toAbsoluteURI("v1/merchant/20000/convertamount", Collections.emptyList());
            assertEquals(URI.create("https://api.preprod.connect.worldline-solutions.com/v1/merchant/20000/convertamount"), uri);

            uri = communicator.toAbsoluteURI("/v1/merchant/20000/convertamount", Collections.emptyList());
            assertEquals(URI.create("https://api.preprod.connect.worldline-solutions.com/v1/merchant/20000/convertamount"), uri);
        }

        @Test
        void testWithRequestParams() {
            List<RequestParam> requestParams = Arrays.asList(
                    new RequestParam("amount", "123"),
                    new RequestParam("source", "USD"),
                    new RequestParam("target", "EUR"),
                    new RequestParam("dummy", "é&%=")
            );

            @SuppressWarnings("resource")
            Communicator communicator = new Communicator(BASE_URI, connection, authenticator, metadataProvider, marshaller);

            URI uri = communicator.toAbsoluteURI("v1/merchant/20000/convertamount", requestParams);
            assertEquals(URI.create("https://api.preprod.connect.worldline-solutions.com/v1/merchant/20000/convertamount?amount=123&source=USD&target=EUR&dummy=%C3%A9%26%25%3D"), uri);

            uri = communicator.toAbsoluteURI("/v1/merchant/20000/convertamount", requestParams);
            assertEquals(URI.create("https://api.preprod.connect.worldline-solutions.com/v1/merchant/20000/convertamount?amount=123&source=USD&target=EUR&dummy=%C3%A9%26%25%3D"), uri);
        }
    }

    @Nested
    class Idempotence extends LocalServerTestBase {

        private HttpRequestHandler requestHandler;

        @BeforeEach
        void setup() throws Exception {
            setUp();

            requestHandler = mock(HttpRequestHandler.class);
        }

        @AfterEach
        void shutdown() throws Exception {
            shutDown();
        }

        @Test
        void testFirstRequest() throws Exception {
            String body = getResource("idempotence_success.json");
            String idempotenceKey = UUID.randomUUID().toString();

            Map<String, String> responseHeaders = new HashMap<>(1);
            responseHeaders.put("Location", "http://localhost/v1/20000/payments/000002000020142549460000100001");

            Map<String, String> requestHeaders = new HashMap<>();

            doAnswer(setResponse(body, 201, responseHeaders, requestHeaders)).when(requestHandler).handle(any(), any(), any());

            serverBootstrap.registerHandler("/v1/20000/payments", requestHandler);
            HttpHost host = start();

            CallContext context = new CallContext().withIdempotenceKey(idempotenceKey);

            try (Client client = createClient(host)) {
                CreatePaymentRequest request = createRequest();

                CreatePaymentResponse response = client.v1().merchant("20000").payments().create(request, context);

                assertNotNull(response);
                assertNotNull(response.getPayment());
                assertNotNull(response.getPayment().getId());
            }

            assertEquals(idempotenceKey, requestHeaders.get("X-GCS-Idempotence-Key"));

            assertEquals(idempotenceKey, context.getIdempotenceKey());
            assertNull(context.getIdempotenceRequestTimestamp());
        }

        @Test
        void testSecondRequest() throws Exception {
            String body = getResource("idempotence_success.json");

            long idempotenceRequestTimestamp = System.currentTimeMillis();

            Map<String, String> responseHeaders = new HashMap<>(2);
            responseHeaders.put("Location", "http://localhost/v1/20000/payments/000002000020142549460000100001");
            responseHeaders.put("X-GCS-Idempotence-Request-Timestamp", Long.toString(idempotenceRequestTimestamp));

            Map<String, String> requestHeaders = new HashMap<>();

            doAnswer(setResponse(body, 201, responseHeaders, requestHeaders)).when(requestHandler).handle(any(), any(), any());

            serverBootstrap.registerHandler("/v1/20000/payments", requestHandler);
            HttpHost host = start();

            String idempotenceKey = UUID.randomUUID().toString();
            CallContext context = new CallContext().withIdempotenceKey(idempotenceKey);

            try (Client client = createClient(host)) {
                CreatePaymentRequest request = createRequest();

                CreatePaymentResponse response = client.v1().merchant("20000").payments().create(request, context);

                assertNotNull(response);
                assertNotNull(response.getPayment());
                assertNotNull(response.getPayment().getId());
            }

            assertEquals(idempotenceKey, requestHeaders.get("X-GCS-Idempotence-Key"));

            assertEquals(idempotenceKey, context.getIdempotenceKey());
            assertEquals(idempotenceRequestTimestamp, context.getIdempotenceRequestTimestamp());
        }

        @Test
        void testFirstFailure() throws Exception {
            String body = getResource("idempotence_rejected.json");

            Map<String, String> responseHeaders = new HashMap<>();

            Map<String, String> requestHeaders = new HashMap<>();

            doAnswer(setResponse(body, 402, responseHeaders, requestHeaders)).when(requestHandler).handle(any(), any(), any());

            serverBootstrap.registerHandler("/v1/20000/payments", requestHandler);
            HttpHost host = start();

            String idempotenceKey = UUID.randomUUID().toString();
            CallContext context = new CallContext().withIdempotenceKey(idempotenceKey);

            try (Client client = createClient(host)) {
                CreatePaymentRequest request = createRequest();

                PaymentsClient paymentsClient = client.v1().merchant("20000").payments();

                DeclinedPaymentException exception = assertThrows(DeclinedPaymentException.class, () -> paymentsClient.create(request, context));

                assertEquals(402, exception.getStatusCode());
                assertEquals(body, exception.getResponseBody());
            }

            assertEquals(idempotenceKey, requestHeaders.get("X-GCS-Idempotence-Key"));

            assertEquals(idempotenceKey, context.getIdempotenceKey());
            assertNull(context.getIdempotenceRequestTimestamp());
        }

        @Test
        void testSecondFailure() throws Exception {
            String body = getResource("idempotence_rejected.json");

            long idempotenceRequestTimestamp = System.currentTimeMillis();

            Map<String, String> responseHeaders = new HashMap<>(2);
            responseHeaders.put("X-GCS-Idempotence-Request-Timestamp", Long.toString(idempotenceRequestTimestamp));

            Map<String, String> requestHeaders = new HashMap<>();

            doAnswer(setResponse(body, 402, responseHeaders, requestHeaders)).when(requestHandler).handle(any(), any(), any());

            serverBootstrap.registerHandler("/v1/20000/payments", requestHandler);
            HttpHost host = start();

            String idempotenceKey = UUID.randomUUID().toString();
            CallContext context = new CallContext().withIdempotenceKey(idempotenceKey);

            try (Client client = createClient(host)) {
                CreatePaymentRequest request = createRequest();

                PaymentsClient paymentsClient = client.v1().merchant("20000").payments();

                DeclinedPaymentException exception = assertThrows(DeclinedPaymentException.class, () -> paymentsClient.create(request, context));

                assertEquals(402, exception.getStatusCode());
                assertEquals(body, exception.getResponseBody());
            }

            assertEquals(idempotenceKey, requestHeaders.get("X-GCS-Idempotence-Key"));

            assertEquals(idempotenceKey, context.getIdempotenceKey());
            assertEquals(idempotenceRequestTimestamp, context.getIdempotenceRequestTimestamp());
        }

        @Test
        void testDuplicateRequest() throws Exception {

            String body = getResource("idempotence_duplicate_failure.json");

            long idempotenceRequestTimestamp = System.currentTimeMillis();

            Map<String, String> responseHeaders = new HashMap<>(2);
            responseHeaders.put("Location", "http://localhost/v1/20000/payments/000002000020142549460000100001");
            responseHeaders.put("X-GCS-Idempotence-Request-Timestamp", Long.toString(idempotenceRequestTimestamp));

            Map<String, String> requestHeaders = new HashMap<>();

            doAnswer(setResponse(body, 409, responseHeaders, requestHeaders)).when(requestHandler).handle(any(), any(), any());

            serverBootstrap.registerHandler("/v1/20000/payments", requestHandler);
            HttpHost host = start();

            String idempotenceKey = UUID.randomUUID().toString();
            CallContext context = new CallContext().withIdempotenceKey(idempotenceKey);

            try (Client client = createClient(host)) {
                CreatePaymentRequest request = createRequest();

                PaymentsClient paymentsClient = client.v1().merchant("20000").payments();

                IdempotenceException exception = assertThrows(IdempotenceException.class, () -> paymentsClient.create(request, context));

                assertEquals(409, exception.getStatusCode());
                assertEquals(body, exception.getResponseBody());
                assertEquals(idempotenceKey, exception.getIdempotenceKey());
                assertEquals(idempotenceRequestTimestamp, exception.getIdempotenceRequestTimestamp());
            }

            assertEquals(idempotenceKey, requestHeaders.get("X-GCS-Idempotence-Key"));

            assertEquals(idempotenceKey, context.getIdempotenceKey());
            assertEquals(idempotenceRequestTimestamp, context.getIdempotenceRequestTimestamp());
        }

        private String getResource(String resource) {
            StringWriter sw = new StringWriter();
            try (Reader reader = new InputStreamReader(getClass().getResourceAsStream(resource))) {
                char[] buffer = new char[1024];
                int len;
                while ((len = reader.read(buffer)) != -1) {
                    sw.write(buffer, 0, len);
                }
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
            return sw.toString();
        }

        private Answer<Void> setResponse(String body, int statusCode, Map<String, String> responseHeaders, Map<String, String> requestHeaders) {
            return i -> {
                HttpRequest request = i.getArgument(0, HttpRequest.class);
                HttpResponse response = i.getArgument(1, HttpResponse.class);

                if (requestHeaders != null) {
                    for (Header header : request.getAllHeaders()) {
                        requestHeaders.put(header.getName(), header.getValue());
                    }
                }

                response.setStatusCode(statusCode);
                response.setHeader("Content-Type", "application/json");

                for (Map.Entry<String, String> entry : responseHeaders.entrySet()) {
                    response.setHeader(entry.getKey(), entry.getValue());
                }

                response.setEntity(new StringEntity(body, ContentType.APPLICATION_JSON));

                return null;
            };
        }

        @SuppressWarnings("resource")
        private Client createClient(HttpHost host) {
            Connection connection = new DefaultConnection(500, 500);
            Authenticator authenticator = new V1HMACAuthenticator("apiKey", "secret");
            MetadataProvider metadataProvider = new MetadataProvider("Worldline");
            return Factory.createClient(URI.create(host.toURI()), connection, authenticator, metadataProvider);
        }

        private CreatePaymentRequest createRequest() {
            CreatePaymentRequest body = new CreatePaymentRequest();

            Order order = new Order();

            AmountOfMoney amountOfMoney = new AmountOfMoney();
            amountOfMoney.setAmount(2345L);
            amountOfMoney.setCurrencyCode("CAD");
            order.setAmountOfMoney(amountOfMoney);

            Customer customer = new Customer();

            Address billingAddress = new Address();
            billingAddress.setCountryCode("CA");
            customer.setBillingAddress(billingAddress);

            order.setCustomer(customer);

            CardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
            cardPaymentMethodSpecificInput.setPaymentProductId(1);

            Card card = new Card();
            card.setCvv("123");
            card.setCardNumber("4567350000427977");
            card.setExpiryDate("1220");
            cardPaymentMethodSpecificInput.setCard(card);

            body.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);

            return body;
        }
    }
}
