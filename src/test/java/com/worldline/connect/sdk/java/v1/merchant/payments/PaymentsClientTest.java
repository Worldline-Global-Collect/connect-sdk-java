package com.worldline.connect.sdk.java.v1.merchant.payments;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.apache.http.impl.io.EmptyInputStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.CallContext;
import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.Communicator;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.authentication.Authenticator;
import com.worldline.connect.sdk.java.authentication.V1HMACAuthenticator;
import com.worldline.connect.sdk.java.communication.CommunicationException;
import com.worldline.connect.sdk.java.communication.Connection;
import com.worldline.connect.sdk.java.communication.MetadataProvider;
import com.worldline.connect.sdk.java.communication.NotFoundException;
import com.worldline.connect.sdk.java.communication.ResponseException;
import com.worldline.connect.sdk.java.communication.ResponseHandler;
import com.worldline.connect.sdk.java.communication.ResponseHeader;
import com.worldline.connect.sdk.java.v1.ApiException;
import com.worldline.connect.sdk.java.v1.DeclinedPaymentException;
import com.worldline.connect.sdk.java.v1.IdempotenceException;
import com.worldline.connect.sdk.java.v1.PlatformException;
import com.worldline.connect.sdk.java.v1.ReferenceException;
import com.worldline.connect.sdk.java.v1.ValidationException;
import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.Card;
import com.worldline.connect.sdk.java.v1.domain.CardPaymentMethodSpecificInput;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentResponse;
import com.worldline.connect.sdk.java.v1.domain.Customer;
import com.worldline.connect.sdk.java.v1.domain.Order;

class PaymentsClientTest {

    private Communicator communicator;

    private Connection connection;

    @BeforeEach
    void initializeCommunicator() {
        connection = mock(Connection.class);

        URI apiEndpoint = URI.create("http://localhost");
        Authenticator authenticator = new V1HMACAuthenticator("test", "test");
        MetadataProvider metadataProvider = new MetadataProvider("Worldline");
        communicator = Factory.createCommunicator(apiEndpoint, connection, authenticator, metadataProvider);
    }

    /**
     * Tests that a non-failure response will not throw an exception.
     */
    @Test
    @SuppressWarnings("resource")
    void testCreateSuccess() {
        Client client = Factory.createClient(communicator);
        String responseBody = getResource("pending_approval.json");
        mockPost(201, responseBody);

        CreatePaymentRequest body = createRequest();

        CreatePaymentResponse response = client.v1().merchant("merchantId").payments().create(body);
        assertEquals("000002000020142549460000100001", response.getPayment().getId());
        assertEquals("PENDING_APPROVAL", response.getPayment().getStatus());
    }

    /**
     * Tests that a failure response with a payment result will throw a {@link DeclinedPaymentException}.
     */
    @Test
    @SuppressWarnings("resource")
    void testCreateRejected() {
        Client client = Factory.createClient(communicator);
        String responseBody = getResource("rejected.json");
        mockPost(400, responseBody);

        CreatePaymentRequest body = createRequest();

        PaymentsClient paymentsClient = client.v1().merchant("merchantId").payments();

        DeclinedPaymentException exception = assertThrows(DeclinedPaymentException.class, () -> paymentsClient.create(body));

        assertTrue(exception.toString().contains("payment '000002000020142544360000100001'"));
        assertTrue(exception.toString().contains("status 'REJECTED'"));
        assertTrue(exception.toString().contains(responseBody));
        assertNotNull(exception.getCreatePaymentResult());
        assertEquals("000002000020142544360000100001", exception.getCreatePaymentResult().getPayment().getId());
        assertEquals("REJECTED", exception.getCreatePaymentResult().getPayment().getStatus());
    }

    /**
     * Tests that a 400 failure response without a payment result will throw a {@link ValidationException}.
     */
    @Test
    @SuppressWarnings("resource")
    void testCreateInvalidRequest() {
        Client client = Factory.createClient(communicator);
        String responseBody = getResource("invalid_request.json");
        mockPost(400, responseBody);

        CreatePaymentRequest body = createRequest();

        PaymentsClient paymentsClient = client.v1().merchant("merchantId").payments();

        ValidationException exception = assertThrows(ValidationException.class, () -> paymentsClient.create(body));

        assertTrue(exception.toString().contains(responseBody));
    }

    /**
     * Tests that a 401 failure response without a payment result will throw a {@link ApiException}.
     */
    @Test
    @SuppressWarnings("resource")
    void testCreateInvalidAuthorization() {

        Client client = Factory.createClient(communicator);
        String responseBody = getResource("invalid_authorization.json");
        mockPost(401, responseBody);

        CreatePaymentRequest body = createRequest();

        PaymentsClient paymentsClient = client.v1().merchant("merchantId").payments();

        ApiException exception = assertThrows(ApiException.class, () -> paymentsClient.create(body));

        assertTrue(exception.toString().contains(responseBody));
    }

    /**
     * Tests that a 409 failure response with a duplicate request code but without an idempotence key will throw a
     * {@link ReferenceException}.
     */
    @Test
    @SuppressWarnings("resource")
    void testCreateReferenceError() {
        Client client = Factory.createClient(communicator);
        String responseBody = getResource("duplicate_request.json");
        mockPost(409, responseBody);

        CreatePaymentRequest body = createRequest();

        PaymentsClient paymentsClient = client.v1().merchant("merchantId").payments();

        ApiException exception = assertThrows(ApiException.class, () -> paymentsClient.create(body));

        assertTrue(exception.toString().contains(responseBody));
    }

    /**
     * Tests that a 409 failure response with a duplicate request code and an idempotence key will throw an {@link IdempotenceException}.
     */
    @Test
    @SuppressWarnings("resource")
    void testCreateIdempotenceError() {
        Client client = Factory.createClient(communicator);
        String responseBody = getResource("duplicate_request.json");
        mockPost(409, responseBody);

        CreatePaymentRequest body = createRequest();

        CallContext context = new CallContext().withIdempotenceKey("key");

        PaymentsClient paymentsClient = client.v1().merchant("merchantId").payments();

        IdempotenceException exception = assertThrows(IdempotenceException.class, () -> paymentsClient.create(body, context));

        assertTrue(exception.toString().contains(responseBody));
        assertEquals(context.getIdempotenceKey(), exception.getIdempotenceKey());
    }

    /**
     * Tests that a 404 response with a non-JSON response will throw a {@link NotFoundException}.
     */
    @Test
    @SuppressWarnings("resource")
    void testCreateNotFound() {
        Client client = Factory.createClient(communicator);
        String responseBody = getResource("not_found.html");
        mockPost(404, responseBody, new ResponseHeader("content-type", "text/html"));

        CreatePaymentRequest body = createRequest();

        PaymentsClient paymentsClient = client.v1().merchant("merchantId").payments();

        NotFoundException exception = assertThrows(NotFoundException.class, () -> paymentsClient.create(body));

        assertNotNull(exception.getCause());
        assertEquals(ResponseException.class, exception.getCause().getClass());
        assertTrue(exception.getCause().toString().contains(responseBody));
    }

    /**
     * Tests that a 405 response with a non-JSON response will throw a {@link CommunicationException}.
     */
    @Test
    @SuppressWarnings("resource")
    void testCreateMethodNotAllowed() {
        Client client = Factory.createClient(communicator);
        String responseBody = getResource("method_not_allowed.html");
        mockPost(405, responseBody, new ResponseHeader("content-type", "text/html"));

        CreatePaymentRequest body = createRequest();

        PaymentsClient paymentsClient = client.v1().merchant("merchantId").payments();

        CommunicationException exception = assertThrows(CommunicationException.class, () -> paymentsClient.create(body));

        assertNotNull(exception.getCause());
        assertEquals(ResponseException.class, exception.getCause().getClass());
        assertTrue(exception.getCause().toString().contains(responseBody));
    }

    /**
     * Tests that a 500 response with a JSON response with no body will throw a {@link PlatformException} and not a {@link NullPointerException}.
     */
    @Test
    @SuppressWarnings("resource")
    void testCreateInternalServerErrorWithoutBody() {
        Client client = Factory.createClient(communicator);
        String responseBody = null;
        mockPost(500, responseBody, new ResponseHeader("content-type", "text/html"));

        CreatePaymentRequest body = createRequest();

        PaymentsClient paymentsClient = client.v1().merchant("merchantId").payments();

        PlatformException exception = assertThrows(PlatformException.class, () -> paymentsClient.create(body));

        assertEquals("", exception.getResponseBody());
        assertNull(exception.getErrorId());
        assertEquals(0, exception.getErrors().size());
    }

    @SuppressWarnings({ "unchecked", "resource" })
    private <R> void mockPost(int statusCode, String responseBody, ResponseHeader... headers) {
        when(connection.post(any(), any(), anyString(), any())).thenAnswer(i -> {
            ResponseHandler<R> responseHandler = i.getArgument(3, ResponseHandler.class);
            InputStream bodyStream = responseBody != null ? toInputStream(responseBody) : EmptyInputStream.INSTANCE;
            return responseHandler.handleResponse(statusCode, bodyStream, Arrays.asList(headers));
        });
    }

    private String getResource(String resource) {
        StringWriter sw = new StringWriter();
        try (Reader reader = new InputStreamReader(getClass().getResourceAsStream(resource), StandardCharsets.UTF_8)) {
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

    private InputStream toInputStream(String content) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (OutputStreamWriter output = new OutputStreamWriter(baos, StandardCharsets.UTF_8)) {
            output.write(content);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
        return new ByteArrayInputStream(baos.toByteArray());
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
