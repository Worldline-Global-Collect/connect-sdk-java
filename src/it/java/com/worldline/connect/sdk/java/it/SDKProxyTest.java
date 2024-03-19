package com.worldline.connect.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URISyntaxException;

import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.ApiResource;
import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.Communicator;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.ProxyConfiguration;
import com.worldline.connect.sdk.java.communication.DefaultConnection;
import com.worldline.connect.sdk.java.v1.domain.ConvertAmount;
import com.worldline.connect.sdk.java.v1.merchant.services.ConvertAmountParams;
import com.worldline.connect.sdk.java.v1.merchant.services.ServicesClient;

class SDKProxyTest extends ItTest {

    /**
     * Smoke test for using a proxy configured through SDK properties.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        ConvertAmountParams request = new ConvertAmountParams();
        request.setAmount(123L);
        request.setSource("USD");
        request.setTarget("EUR");

        try (Client client = getClientWithProxy()) {
            ServicesClient services = client.v1().merchant(getMerchantId()).services();

            CommunicatorConfiguration configuration = getCommunicatorConfigurationWithProxy();
            assertNotNull(configuration.getProxyConfiguration());
            assertProxySet(services, configuration.getProxyConfiguration());

            ConvertAmount response = services.convertAmount(request);

            assertNotNull(response.getConvertedAmount());
        }
    }

    @SuppressWarnings("resource")
    private void assertProxySet(ApiResource resource, ProxyConfiguration proxyConfiguration) {
        Communicator communicator = getField(resource, "communicator", Communicator.class);
        DefaultConnection connection = getField(communicator, "connection", DefaultConnection.class);
        CloseableHttpClient httpClient = getField(connection, "httpClient", CloseableHttpClient.class);
        DefaultProxyRoutePlanner routePlanner = getField(httpClient, "routePlanner", DefaultProxyRoutePlanner.class);
        HttpHost proxy = getField(routePlanner, "proxy", HttpHost.class);
        assertEquals(proxyConfiguration.getScheme(), proxy.getSchemeName());
        assertEquals(proxyConfiguration.getPort(), proxy.getPort());

        BasicCredentialsProvider credentialsProvider = getField(httpClient, "credentialsProvider", BasicCredentialsProvider.class);
        AuthScope authScope = new AuthScope(proxy);
        Credentials credentials = credentialsProvider.getCredentials(authScope);
        assertTrue(credentials instanceof UsernamePasswordCredentials);
        UsernamePasswordCredentials usernamePasswordCredentials = (UsernamePasswordCredentials) credentials;
        assertEquals(proxyConfiguration.getUsername(), usernamePasswordCredentials.getUserName());
        assertEquals(proxyConfiguration.getPassword(), usernamePasswordCredentials.getPassword());
    }

    private <T> T getField(Object object, String fieldName, Class<T> fieldType) {
        Class<?> clazz = object.getClass();
        while (clazz != Object.class) {
            try {
                Field field = clazz.getDeclaredField(fieldName);
                field.setAccessible(true);
                Object fieldValue = field.get(object);
                return assertInstanceOf(fieldType, fieldValue);
            } catch (@SuppressWarnings("unused") NoSuchFieldException e) {
                // try next class
            } catch (IllegalAccessException e) {
                // should no longer occur
                throw new IllegalStateException(e);
            }

            clazz = clazz.getSuperclass();
        }

        return null;
    }
}
