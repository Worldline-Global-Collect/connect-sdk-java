package com.worldline.connect.sdk.java.communication;

import static com.worldline.connect.sdk.java.util.DefaultConnectionAssertions.assertMaxConnections;
import static com.worldline.connect.sdk.java.util.DefaultConnectionAssertions.assertNoProxy;
import static com.worldline.connect.sdk.java.util.DefaultConnectionAssertions.assertProxy;
import static com.worldline.connect.sdk.java.util.DefaultConnectionAssertions.assertRequestConfig;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItems;
import static org.hamcrest.Matchers.not;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.config.Registry;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.NoConnectionReuseStrategy;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.conn.DefaultHttpClientConnectionOperator;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.impl.execchain.ClientExecChain;
import org.apache.http.impl.execchain.MainClientExec;
import org.apache.http.localserver.LocalServerTestBase;
import org.apache.http.protocol.HttpRequestHandler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer;

import com.worldline.connect.sdk.java.BodyHandler;
import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.Communicator;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.ProxyConfiguration;
import com.worldline.connect.sdk.java.authentication.Authenticator;
import com.worldline.connect.sdk.java.authentication.V1HMACAuthenticator;
import com.worldline.connect.sdk.java.domain.UploadableFile;
import com.worldline.connect.sdk.java.logging.CommunicatorLogger;
import com.worldline.connect.sdk.java.util.ReflectionUtil;
import com.worldline.connect.sdk.java.util.ResponseHeaderMatcher;
import com.worldline.connect.sdk.java.v1.DeclinedPaymentException;
import com.worldline.connect.sdk.java.v1.PlatformException;
import com.worldline.connect.sdk.java.v1.ValidationException;
import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.Card;
import com.worldline.connect.sdk.java.v1.domain.CardPaymentMethodSpecificInput;
import com.worldline.connect.sdk.java.v1.domain.ConvertAmount;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentResponse;
import com.worldline.connect.sdk.java.v1.domain.Customer;
import com.worldline.connect.sdk.java.v1.domain.Order;
import com.worldline.connect.sdk.java.v1.domain.TestConnection;
import com.worldline.connect.sdk.java.v1.merchant.payments.PaymentsClient;
import com.worldline.connect.sdk.java.v1.merchant.services.ConvertAmountParams;
import com.worldline.connect.sdk.java.v1.merchant.services.ServicesClient;

class DefaultConnectionTest {

    private static final int CONNECT_TIMEOUT = 10000;
    private static final int SOCKET_TIMEOUT  = 20000;
    private static final int MAX_CONNECTIONS = 100;

    @Nested
    class Construct {

        @Test
        @SuppressWarnings("resource")
        void testConstructWithoutProxy() {
            DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, null);
            assertConnectionReuse(connection, true);
            assertNoProxy(connection);
            assertHttpsProtocols(connection, CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS);
        }

        @Test
        @SuppressWarnings("resource")
        void testConstructWithProxyWithoutAuthentication() {
            ProxyConfiguration proxyConfiguration = new ProxyConfiguration(URI.create("http://test-proxy"));

            DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, proxyConfiguration);
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, proxyConfiguration);
            assertConnectionReuse(connection, true);
            assertProxy(connection, proxyConfiguration);
            assertHttpsProtocols(connection, CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS);
        }

        @Test
        @SuppressWarnings("resource")
        void testConstructWithProxyWithAuthentication() {
            ProxyConfiguration proxyConfiguration = new ProxyConfiguration(URI.create("http://test-proxy"), "test-username", "test-password");

            DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, proxyConfiguration);
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, proxyConfiguration);
            assertConnectionReuse(connection, true);
            assertProxy(connection, proxyConfiguration);
            assertHttpsProtocols(connection, CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS);
        }

        @Test
        @SuppressWarnings("resource")
        void testConstructWithMaxConnectionsWithoutProxy() {
            DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, MAX_CONNECTIONS);
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, MAX_CONNECTIONS, null);
            assertConnectionReuse(connection, true);
            assertNoProxy(connection);
            assertHttpsProtocols(connection, CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS);
        }

        @Test
        @SuppressWarnings("resource")
        void testConstructWithMaxConnectionsWithProxy() {
            ProxyConfiguration proxyConfiguration = new ProxyConfiguration(URI.create("http://test-proxy"));

            DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, MAX_CONNECTIONS, proxyConfiguration);
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, MAX_CONNECTIONS, proxyConfiguration);
            assertConnectionReuse(connection, true);
            assertProxy(connection, proxyConfiguration);
            assertHttpsProtocols(connection, CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS);
        }

        @Test
        @SuppressWarnings("resource")
        void testConstructWithHttpsProtocols() {
            Set<String> httpsProtocols = new HashSet<>(Arrays.asList("TLSv1", "TLSv1.1", "TLSv1.2"));

            DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, MAX_CONNECTIONS, null, httpsProtocols);
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, MAX_CONNECTIONS, null);
            assertConnectionReuse(connection, true);
            assertNoProxy(connection);
            assertHttpsProtocols(connection, httpsProtocols);
        }

        @Test
        @SuppressWarnings("resource")
        void testConstructWithZeroHttpsProtocols() {
            Set<String> httpsProtocols = Collections.emptySet();

            DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, MAX_CONNECTIONS, null, httpsProtocols);
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, MAX_CONNECTIONS, null);
            assertConnectionReuse(connection, true);
            assertNoProxy(connection);
            assertHttpsProtocols(connection, CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS);
        }

        @Test
        @SuppressWarnings("resource")
        void testConstructWithNullHttpsProtocols() {
            Set<String> httpsProtocols = null;

            DefaultConnection connection = new DefaultConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT, MAX_CONNECTIONS, null, httpsProtocols);
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, MAX_CONNECTIONS, null);
            assertConnectionReuse(connection, true);
            assertNoProxy(connection);
            assertHttpsProtocols(connection, CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS);
        }

        @Test
        @SuppressWarnings("resource")
        void testConstructWithMinimalBuilder() {
            DefaultConnection connection = new DefaultConnectionBuilder(CONNECT_TIMEOUT, SOCKET_TIMEOUT)
                    .build();
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, CommunicatorConfiguration.DEFAULT_MAX_CONNECTIONS, null);
            assertConnectionReuse(connection, true);
            assertNoProxy(connection);
            assertHttpsProtocols(connection, CommunicatorConfiguration.DEFAULT_HTTPS_PROTOCOLS);
        }

        @Test
        @SuppressWarnings("resource")
        void testConstructWithFullBuilder() {
            ProxyConfiguration proxyConfiguration = new ProxyConfiguration(URI.create("http://test-proxy"));
            Set<String> httpsProtocols = new HashSet<>(Arrays.asList("TLSv1", "TLSv1.1", "TLSv1.2"));

            DefaultConnection connection = new DefaultConnectionBuilder(CONNECT_TIMEOUT, SOCKET_TIMEOUT)
                    .withMaxConnections(MAX_CONNECTIONS)
                    .withConnectionReuse(false)
                    .withProxyConfiguration(proxyConfiguration)
                    .withHttpsProtocols(httpsProtocols)
                    .build();
            assertRequestConfig(connection, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
            assertMaxConnections(connection, MAX_CONNECTIONS, proxyConfiguration);
            assertConnectionReuse(connection, false);
            assertProxy(connection, proxyConfiguration);
            assertHttpsProtocols(connection, httpsProtocols);
        }

        @SuppressWarnings("resource")
        private void assertConnectionReuse(DefaultConnection connection, boolean connectionReuse) {
            CloseableHttpClient httpClient = ReflectionUtil.getField(connection, "httpClient", CloseableHttpClient.class);
            ClientExecChain execChain = ReflectionUtil.getField(httpClient, "execChain", ClientExecChain.class);
            while (execChain != null && !(execChain instanceof MainClientExec)) {
                execChain = ReflectionUtil.getField(execChain, "requestExecutor", ClientExecChain.class);
            }
            assertNotNull(execChain);
            ConnectionReuseStrategy reuseStrategy = ReflectionUtil.getField(execChain, "reuseStrategy", ConnectionReuseStrategy.class);

            if (connectionReuse) {
                assertNotNull(reuseStrategy);
                assertNotSame(NoConnectionReuseStrategy.INSTANCE, reuseStrategy);
            } else {
                assertSame(NoConnectionReuseStrategy.INSTANCE, reuseStrategy);
            }
        }

        @SuppressWarnings("resource")
        private void assertHttpsProtocols(DefaultConnection connection, Set<String> httpsProtocols) {
            CloseableHttpClient httpClient = ReflectionUtil.getField(connection, "httpClient", CloseableHttpClient.class);
            PoolingHttpClientConnectionManager connectionManager = ReflectionUtil.getField(httpClient, "connManager", PoolingHttpClientConnectionManager.class);
            DefaultHttpClientConnectionOperator connectionOperator = ReflectionUtil.getField(connectionManager, "connectionOperator", DefaultHttpClientConnectionOperator.class);
            Registry<?> socketFactoryRegistry = ReflectionUtil.getField(connectionOperator, "socketFactoryRegistry", Registry.class);
            SSLConnectionSocketFactory sslConnectionSocketFactory = (SSLConnectionSocketFactory) socketFactoryRegistry.lookup("https");
            String[] supportedProtocols = ReflectionUtil.getField(sslConnectionSocketFactory, "supportedProtocols", String[].class);
            assertNotNull(supportedProtocols);
            assertEquals(httpsProtocols, new HashSet<>(Arrays.asList(supportedProtocols)));
        }
    }

    @Nested
    class Logging extends LocalServerTestBase {

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
        void testTestConnection() throws Exception {
            // GET with no query params

            serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(setOKJsonResponse("testConnection.json"));

            try (Client client = createClient(host)) {
                client.enableLogging(logger);

                TestConnection response = client.v1().merchant("1234").services().testconnection();

                assertNotNull(response);
                assertEquals("OK", response.getResult());
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "testConnection");
        }

        @Test
        void testConvertAmount() throws Exception {
            // GET with query params

            serverBootstrap.registerHandler("/v1/1234/services/convert/amount", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(setOKJsonResponse("convertAmount.json"));

            try (Client client = createClient(host)) {
                client.enableLogging(logger);

                ConvertAmountParams query = new ConvertAmountParams();
                query.setAmount(1000L);
                query.setSource("EUR");
                query.setTarget("USD");
                ConvertAmount response = client.v1().merchant("1234").services().convertAmount(query);

                assertNotNull(response);
                assertNotNull(response.getConvertedAmount());
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "convertAmount");
        }

        @Test
        void testDeleteToken() throws Exception {
            // POST with no request body and a void response

            serverBootstrap.registerHandler("/v1/1234/tokens/5678", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(setVoidResponse());

            try (Client client = createClient(host)) {
                client.enableLogging(logger);

                client.v1().merchant("1234").tokens().delete("5678", null);
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "deleteToken");
        }

        @Test
        void testCreatePayment() throws Exception {
            // POST with a success (201) response

            serverBootstrap.registerHandler("/v1/1234/payments", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(setCreatedJsonResponse("createPayment.json", "http://localhost/v1/1234/payments/000000123410000595980000100001"));

            try (Client client = createClient(host)) {
                client.enableLogging(logger);

                AmountOfMoney amountOfMoney = new AmountOfMoney();
                amountOfMoney.setCurrencyCode("CAD");
                amountOfMoney.setAmount(2345L);

                Address billingAddress = new Address();
                billingAddress.setCountryCode("CA");

                Customer customer = new Customer();
                customer.setBillingAddress(billingAddress);

                Order order = new Order();
                order.setAmountOfMoney(amountOfMoney);
                order.setCustomer(customer);

                Card card = new Card();
                card.setCvv("123");
                card.setCardNumber("1234567890123456");
                card.setExpiryDate("1220");

                CardPaymentMethodSpecificInput paymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
                paymentMethodSpecificInput.setPaymentProductId(1);
                paymentMethodSpecificInput.setCard(card);

                CreatePaymentRequest request = new CreatePaymentRequest();
                request.setOrder(order);
                request.setCardPaymentMethodSpecificInput(paymentMethodSpecificInput);

                CreatePaymentResponse response = client.v1().merchant("1234").payments().create(request);

                assertNotNull(response);
                assertNotNull(response.getPayment());
                assertNotNull(response.getPayment().getId());
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "createPayment");
        }

        @Test
        void testCreatePaymentInvalidCardNumber() throws Exception {
            // an exception is thrown after logging the response

            serverBootstrap.registerHandler("/v1/1234/payments", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(setJsonResponse("createPayment.failure.invalidCardNumber.json", 400));

            try (Client client = createClient(host)) {
                client.enableLogging(logger);

                AmountOfMoney amountOfMoney = new AmountOfMoney();
                amountOfMoney.setCurrencyCode("CAD");
                amountOfMoney.setAmount(2345L);

                Address billingAddress = new Address();
                billingAddress.setCountryCode("CA");

                Customer customer = new Customer();
                customer.setBillingAddress(billingAddress);

                Order order = new Order();
                order.setAmountOfMoney(amountOfMoney);
                order.setCustomer(customer);

                Card card = new Card();
                card.setCvv("123");
                card.setCardNumber("1234567890123456");
                card.setExpiryDate("1220");

                CardPaymentMethodSpecificInput paymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
                paymentMethodSpecificInput.setPaymentProductId(1);
                paymentMethodSpecificInput.setCard(card);

                CreatePaymentRequest request = new CreatePaymentRequest();
                request.setOrder(order);
                request.setCardPaymentMethodSpecificInput(paymentMethodSpecificInput);

                PaymentsClient paymentsClient = client.v1().merchant("1234").payments();

                assertThrows(ValidationException.class, () -> paymentsClient.create(request));
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "createPayment.failure.invalidCardNumber");
        }

        @Test
        void testCreatePaymentRejected() throws Exception {
            // an exception is thrown after logging the response

            serverBootstrap.registerHandler("/v1/1234/payments", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(setJsonResponse("createPayment.failure.rejected.json", 402));

            try (Client client = createClient(host)) {
                client.enableLogging(logger);

                AmountOfMoney amountOfMoney = new AmountOfMoney();
                amountOfMoney.setCurrencyCode("CAD");
                amountOfMoney.setAmount(2345L);

                Address billingAddress = new Address();
                billingAddress.setCountryCode("CA");

                Customer customer = new Customer();
                customer.setBillingAddress(billingAddress);

                Order order = new Order();
                order.setAmountOfMoney(amountOfMoney);
                order.setCustomer(customer);

                Card card = new Card();
                card.setCvv("123");
                card.setCardNumber("1234567890123452");
                card.setExpiryDate("1220");

                CardPaymentMethodSpecificInput paymentMethodSpecificInput = new CardPaymentMethodSpecificInput();
                paymentMethodSpecificInput.setPaymentProductId(1);
                paymentMethodSpecificInput.setCard(card);

                CreatePaymentRequest request = new CreatePaymentRequest();
                request.setOrder(order);
                request.setCardPaymentMethodSpecificInput(paymentMethodSpecificInput);

                PaymentsClient paymentsClient = client.v1().merchant("1234").payments();

                DeclinedPaymentException exception = assertThrows(DeclinedPaymentException.class, () -> paymentsClient.create(request));

                assertNotNull(exception.getCreatePaymentResult());
                assertNotNull(exception.getCreatePaymentResult().getPayment());
                assertNotNull(exception.getCreatePaymentResult().getPayment().getId());
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "createPayment.failure.rejected");
        }

        @Test
        void testBinaryRequestWithKnownLength() throws Exception {
            serverBootstrap.registerHandler("/binaryRequest", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            byte[] data = new byte[1024];
            new Random().nextBytes(data);

            UploadableFile file = new UploadableFile("dummyFile", new ByteArrayInputStream(data), "application/octetstream", data.length);

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", file);

            setupRequestHandler(setVoidResponse());

            try (Communicator communicator = createCommunicator(host)) {
                communicator.enableLogging(logger);

                communicator.post("/binaryRequest", new ArrayList<>(), null, multipart, Void.class, null);
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "binaryRequest");

            assertThat(requestEntry.message, containsString("Content-Length="));
            assertThat(requestEntry.message, not(containsString("Transfer-Encoding=\"chunked\"")));
        }

        @Test
        void testBinaryRequestWithUnknownLength() throws Exception {
            serverBootstrap.registerHandler("/binaryRequest", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            byte[] data = new byte[1024];
            new Random().nextBytes(data);

            UploadableFile file = new UploadableFile("dummyFile", new ByteArrayInputStream(data), "application/octetstream");

            MultipartFormDataObject multipart = new MultipartFormDataObject();
            multipart.addFile("file", file);

            setupRequestHandler(setVoidResponse());

            try (Communicator communicator = createCommunicator(host)) {
                communicator.enableLogging(logger);

                communicator.post("/binaryRequest", new ArrayList<>(), null, multipart, Void.class, null);
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "binaryRequest");

            assertThat(requestEntry.message, not(containsString("Content-Length=")));
            assertThat(requestEntry.message, containsString("Transfer-Encoding=\"chunked\""));
        }

        @Test
        void testBinaryResponse() throws Exception {
            serverBootstrap.registerHandler("/binaryContent", requestHandler);
            HttpHost host = start();

            URI uri = toURI(host, "/binaryContent");

            TestLogger logger = new TestLogger();

            byte[] data = new byte[1024];
            new Random().nextBytes(data);

            setupRequestHandler(setBinaryResponse(data, 200));

            // also test that the response handler is called correctly
            ResponseHandler<?> responseHandler = (statusCode, bodyStream, headers) -> {
                ByteArrayOutputStream output = new ByteArrayOutputStream(data.length);
                try {
                    byte[] buffer = new byte[data.length];
                    int len;
                    while ((len = bodyStream.read(buffer)) != -1) {
                        output.write(buffer, 0, len);
                    }
                } catch (IOException e) {
                    throw new IllegalStateException(e);
                }

                assertEquals(200, statusCode);
                assertArrayEquals(data, output.toByteArray());
                assertThat(headers, hasItems(
                        new ResponseHeaderMatcher("Dummy", ""),
                        new ResponseHeaderMatcher("Content-Type", "application/octet-stream"),
                        new ResponseHeaderMatcher("Content-Length", "1024")
                ));

                return null;
            };

            try (Connection connection = createConnection()) {
                connection.enableLogging(logger);

                connection.get(uri, new ArrayList<>(), responseHandler);
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "binaryResponse");
        }

        @Test
        void testVoidContent() throws Exception {
            // reuse delete token
            serverBootstrap.registerHandler("/v1/1234/tokens/5678", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(setVoidResponse());

            // also test that the body handler is called correctly
            BodyHandler bodyHandler = (bodyStream, headers) -> assertEquals(-1, bodyStream.read());

            try (Communicator communicator = createCommunicator(host)) {
                communicator.enableLogging(logger);

                communicator.delete("/v1/1234/tokens/5678", null, null, bodyHandler, null);
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "deleteToken");
        }

        @Test
        void testUnknownServerError() throws Exception {
            // an exception is thrown after logging the response

            serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(setJsonResponse("unknownServerError.json", 500));

            try (Client client = createClient(host)) {
                client.enableLogging(logger);

                ServicesClient servicesClient = client.v1().merchant("1234").services();

                assertThrows(PlatformException.class, servicesClient::testconnection);
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "testConnection", "unknownServerError");
        }

        @Test
        void testNonJson() throws Exception {
            // an exception is thrown after logging the response

            serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(setHtmlResponse("notFound.html", 404));

            try (Client client = createClient(host)) {
                client.enableLogging(logger);

                ServicesClient servicesClient = client.v1().merchant("1234").services();

                assertThrows(NotFoundException.class, servicesClient::testconnection);
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry responseEntry = logger.entries.get(1);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertRequestAndResponse(requestEntry.message, responseEntry.message, "testConnection", "notFound");
        }

        @Test
        void testReadTimeout() throws Exception {
            // an exception is thrown before logging the response

            serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            setupRequestHandler(delayedAnswer(setHtmlResponse("notFound.html", 404), 100));

            try (Client client = createClient(host, 1000, 10)) {
                client.enableLogging(logger);

                ServicesClient servicesClient = client.v1().merchant("1234").services();

                assertThrows(CommunicationException.class, servicesClient::testconnection);
            }

            assertEquals(2, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            TestLoggerEntry errorEntry = logger.entries.get(1);

            assertNotNull(errorEntry.message);
            assertNotNull(errorEntry.thrown);

            assertRequestAndError(requestEntry.message, errorEntry.message, "testConnection");

            assertEquals(SocketTimeoutException.class, errorEntry.thrown.getClass());
        }

        @Test
        void testLogRequestOnly() throws Exception {
            // logging is disabled after the request is logged but before the response is logged

            serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            try (Client client = createClient(host)) {
                client.enableLogging(logger);

                setupRequestHandler(disableLogging(setOKJsonResponse("testConnection.json"), client));

                TestConnection response = client.v1().merchant("1234").services().testconnection();

                assertNotNull(response);
                assertEquals("OK", response.getResult());
            }

            assertEquals(1, logger.entries.size());

            TestLoggerEntry requestEntry = logger.entries.get(0);

            assertNotNull(requestEntry.message);
            assertNull(requestEntry.thrown);

            assertRequest(requestEntry.message, "testConnection");
        }

        @Test
        void testLogResponseOnly() throws Exception {
            // logging is enabled after the request is logged but before the response is logged

            serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            try (Client client = createClient(host)) {
                setupRequestHandler(enableLogging(setOKJsonResponse("testConnection.json"), client, logger));

                TestConnection response = client.v1().merchant("1234").services().testconnection();

                assertNotNull(response);
                assertEquals("OK", response.getResult());
            }

            assertEquals(1, logger.entries.size());

            TestLoggerEntry responseEntry = logger.entries.get(0);

            assertNotNull(responseEntry.message);
            assertNull(responseEntry.thrown);

            assertResponse(responseEntry.message, "testConnection");
        }

        @Test
        void testLogErrorOnly() throws Exception {
            // logging is enabled after the request is logged but before the error is logged

            serverBootstrap.registerHandler("/v1/1234/services/testconnection", requestHandler);
            HttpHost host = start();

            TestLogger logger = new TestLogger();

            try (Client client = createClient(host, 1000, 100)) {
                setupRequestHandler(enableLogging(delayedAnswer(setHtmlResponse("notFound.html", 404), 200), client, logger));

                ServicesClient servicesClient = client.v1().merchant("1234").services();

                assertThrows(CommunicationException.class, servicesClient::testconnection);
            }

            assertEquals(1, logger.entries.size());

            TestLoggerEntry errorEntry = logger.entries.get(0);

            assertNotNull(errorEntry.message);
            assertNotNull(errorEntry.thrown);

            assertError(errorEntry.message);

            assertEquals(SocketTimeoutException.class, errorEntry.thrown.getClass());
        }

        // assertion utility methods

        private String assertRequestAndResponse(String requestMessage, String responseMessage, String resourcePrefix) throws IOException {
            return assertRequestAndResponse(requestMessage, responseMessage, resourcePrefix, resourcePrefix);
        }

        private String assertRequestAndResponse(String requestMessage, String responseMessage, String requestResourcePrefix, String responseResourcePrefix) throws IOException {

            String requestId = assertRequest(requestMessage, requestResourcePrefix);
            requestId = assertResponse(responseMessage, responseResourcePrefix, requestId);
            return requestId;
        }

        private String assertRequestAndError(String requestMessage, String errorMessage, String resourcePrefix) throws IOException {

            String requestId = assertRequest(requestMessage, resourcePrefix);
            requestId = assertError(errorMessage, requestId);
            return requestId;
        }

        private String assertRequest(String requestMessage, String resourcePrefix) throws IOException {
            String requestResource = resourcePrefix + ".request";

            Pattern requestPattern = Pattern.compile(normalizeLineBreaks(readResource(requestResource)), Pattern.DOTALL);

            Matcher requestMatcher = requestPattern.matcher(normalizeLineBreaks(requestMessage));
            assertTrue(requestMatcher.matches(), "request message '" + requestMessage + "' does not match pattern " + requestPattern);

            String requestId = requestMatcher.group(1);

            return requestId;
        }

        private String assertResponse(String responseMessage, String resourcePrefix) throws IOException {
            return assertResponse(responseMessage, resourcePrefix, null);
        }

        private String assertResponse(String responseMessage, String resourcePrefix, String requestId) throws IOException {
            String responseResource = resourcePrefix + ".response";
            Pattern responsePattern = Pattern.compile(normalizeLineBreaks(readResource(responseResource)), Pattern.DOTALL);

            Matcher responseMatcher = responsePattern.matcher(normalizeLineBreaks(responseMessage));
            assertTrue(responseMatcher.matches(), "response message '" + responseMessage + "' does not match pattern " + responsePattern);

            String responseRequestId = responseMatcher.group(1);
            if (requestId != null) {
                assertEquals(requestId, responseRequestId,
                        "response requestId '" + responseRequestId + "' does not match request requestId '" + requestId + "'");
            } else {
                requestId = responseRequestId;
            }

            return requestId;
        }

        private String assertError(String errorMessage) throws IOException {
            return assertError(errorMessage, null);
        }

        private String assertError(String errorMessage, String requestId) throws IOException {
            String errorResource = "generic.error";
            Pattern errorPattern = Pattern.compile(normalizeLineBreaks(readResource(errorResource)), Pattern.DOTALL);

            Matcher errorMatcher = errorPattern.matcher(normalizeLineBreaks(errorMessage));
            assertTrue(errorMatcher.matches(), "error message '" + errorMessage + "' does not match pattern " + errorPattern);

            String errorRequestId = errorMatcher.group(1);
            if (requestId != null) {
                assertEquals(requestId, errorRequestId,
                        "error requestId '" + errorRequestId + "' does not match earlier requestId '" + requestId + "'");
            } else {
                requestId = errorRequestId;
            }

            return requestId;
        }

        // Mockito answer utility methods

        private void setupRequestHandler(Answer<Void> answer) throws IOException, HttpException {
            doAnswer(answer).when(requestHandler).handle(any(), any(), any());
        }

        private Answer<Void> setVoidResponse() {
            return setVoidResponse(Collections.emptyMap());
        }

        private Answer<Void> setVoidResponse(Map<String, String> additionalHeaders) {
            return i -> {
                HttpResponse response = i.getArgument(1, HttpResponse.class);

                response.setStatusCode(204);

                response.setHeader("Dummy", null);

                for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
                    response.setHeader(entry.getKey(), entry.getValue());
                }

                return null;
            };
        }

        private Answer<Void> setOKJsonResponse(String resource) {
            return setJsonResponse(resource, 200, Collections.emptyMap());
        }

        private Answer<Void> setCreatedJsonResponse(String resource, String location) {
            return setJsonResponse(resource, 201, Collections.singletonMap("Location", location));
        }

        private Answer<Void> setJsonResponse(String resource, int statusCode) {
            return setJsonResponse(resource, statusCode, Collections.emptyMap());
        }

        private Answer<Void> setJsonResponse(String resource, int statusCode, Map<String, String> additionalHeaders) {
            return i -> {
                HttpResponse response = i.getArgument(1, HttpResponse.class);

                response.setStatusCode(statusCode);
                response.setHeader("Content-Type", "application/json");

                response.setHeader("Dummy", null);

                for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
                    response.setHeader(entry.getKey(), entry.getValue());
                }

                response.setEntity(createEntity(resource));

                return null;
            };
        }

        private Answer<Void> setHtmlResponse(String resource, int statusCode) {
            return setHtmlResponse(resource, statusCode, Collections.emptyMap());
        }

        private Answer<Void> setHtmlResponse(String resource, int statusCode, Map<String, String> additionalHeaders) {
            return i -> {
                HttpResponse response = i.getArgument(1, HttpResponse.class);

                response.setStatusCode(statusCode);
                response.setHeader("Content-Type", "text/html");

                response.setHeader("Dummy", null);

                for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
                    response.setHeader(entry.getKey(), entry.getValue());
                }

                response.setEntity(createEntity(resource));

                return null;
            };
        }

        private Answer<Void> setBinaryResponse(byte[] data, int statusCode) {
            return setBinaryResponse(data, statusCode, Collections.emptyMap());
        }

        private Answer<Void> setBinaryResponse(byte[] data, int statusCode, Map<String, String> additionalHeaders) {
            return i -> {
                HttpResponse response = i.getArgument(1, HttpResponse.class);

                response.setStatusCode(statusCode);
                response.setHeader("Content-Type", "application/octet-stream");

                response.setHeader("Dummy", null);

                for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
                    response.setHeader(entry.getKey(), entry.getValue());
                }

                response.setEntity(new ByteArrayEntity(data, ContentType.APPLICATION_OCTET_STREAM));

                return null;
            };
        }

        private <T> Answer<T> delayedAnswer(Answer<? extends T> answer, int delay) {
            return i -> {
                Thread.sleep(delay);
                return answer.answer(i);
            };
        }

        private <T> Answer<T> enableLogging(Answer<? extends T> answer, Client client, CommunicatorLogger communicatorLogger) {
            return i -> {
                client.enableLogging(communicatorLogger);
                return answer.answer(i);
            };
        }

        private <T> Answer<T> disableLogging(Answer<? extends T> answer, Client client) {
            return i -> {
                client.disableLogging();
                return answer.answer(i);
            };
        }

        @SuppressWarnings("resource")
        private InputStreamEntity createEntity(String resource) {
            return new InputStreamEntity(getClass().getResourceAsStream(resource));
        }

        // general utility methods

        private URI toURI(HttpHost host, String path) throws URISyntaxException {
            return new URI(host.getSchemeName(), null, host.getHostName(), host.getPort(), path, null, null);
        }

        private Connection createConnection() {
            return createConnection(CONNECT_TIMEOUT, SOCKET_TIMEOUT);
        }

        private Connection createConnection(int connectTimeout, int socketTimeout) {
            return new DefaultConnection(connectTimeout, socketTimeout);
        }

        private Communicator createCommunicator(HttpHost host) throws URISyntaxException {
            return createCommunicator(host, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
        }

        @SuppressWarnings("resource")
        private Communicator createCommunicator(HttpHost host, int connectTimeout, int socketTimeout) throws URISyntaxException {
            URI uri = toURI(host, null);

            Connection connection = new DefaultConnection(connectTimeout, socketTimeout);
            Authenticator authenticator = new V1HMACAuthenticator("apiKey", "secret");
            MetadataProvider metadataProvider = new MetadataProvider("Worldline");
            return Factory.createCommunicator(uri, connection, authenticator, metadataProvider);
        }

        private Client createClient(HttpHost host) throws URISyntaxException {
            return createClient(host, CONNECT_TIMEOUT, SOCKET_TIMEOUT);
        }

        @SuppressWarnings("resource")
        private Client createClient(HttpHost host, int connectTimeout, int socketTimeout) throws URISyntaxException {
            Communicator communicator = createCommunicator(host, connectTimeout, socketTimeout);
            return Factory.createClient(communicator);
        }

        private String readResource(String resource) throws IOException {
            StringBuilder result = new StringBuilder();
            try (Reader reader = new InputStreamReader(getClass().getResourceAsStream(resource), StandardCharsets.UTF_8)) {
                char[] buffer = new char[4096];
                int len;
                while ((len = reader.read(buffer)) != -1) {
                    result.append(buffer, 0, len);
                }
            }
            return result.toString();
        }

        private String normalizeLineBreaks(String value) {
            // Normalize line breaks to always use the same, regardless of the operating system
            return value.replace("\r", "");
        }
    }

    private static final class TestLogger implements CommunicatorLogger {

        private List<TestLoggerEntry> entries = new ArrayList<>();

        @Override
        public void log(String message) {
            log(message, null);
        }

        @Override
        public void log(String message, Throwable thrown) {
            entries.add(new TestLoggerEntry(message, thrown));
        }
    }

    private static final class TestLoggerEntry {

        private final String message;
        private final Throwable thrown;

        TestLoggerEntry(String message, Throwable thrown) {
            this.message = message;
            this.thrown = thrown;
        }
    }
}
