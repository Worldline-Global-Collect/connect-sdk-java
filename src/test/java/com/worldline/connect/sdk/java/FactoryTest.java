package com.worldline.connect.sdk.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.authentication.Authenticator;
import com.worldline.connect.sdk.java.authentication.AuthorizationType;
import com.worldline.connect.sdk.java.authentication.V1HMACAuthenticator;
import com.worldline.connect.sdk.java.communication.Connection;
import com.worldline.connect.sdk.java.communication.DefaultConnection;
import com.worldline.connect.sdk.java.communication.MetadataProvider;
import com.worldline.connect.sdk.java.communication.RequestHeader;
import com.worldline.connect.sdk.java.json.DefaultMarshaller;
import com.worldline.connect.sdk.java.util.DefaultConnectionAssertions;
import com.worldline.connect.sdk.java.util.ReflectionUtil;

class FactoryTest {

    static final URI PROPERTIES_URI;
    static final String API_KEY_ID     = "someKey";
    static final String SECRET_API_KEY = "someSecret";

    static {
        try {
            PROPERTIES_URI = FactoryTest.class.getResource("configuration.properties").toURI();
        } catch (URISyntaxException e) {
            InstantiationError error = new InstantiationError(e.getMessage());
            error.initCause(e);
            throw error;
        }
    }

    @Test
    void testCreateConfiguration() {
        CommunicatorConfiguration configuration = Factory.createConfiguration(PROPERTIES_URI, API_KEY_ID, SECRET_API_KEY);
        assertEquals(URI.create("https://api.preprod.connect.worldline-solutions.com"), configuration.getApiEndpoint());
        assertEquals(AuthorizationType.V1HMAC, configuration.getAuthorizationType());
        assertEquals(-1, configuration.getConnectTimeout());
        assertEquals(-1, configuration.getSocketTimeout());
        assertEquals(100, configuration.getMaxConnections());
        assertEquals(API_KEY_ID, configuration.getApiKeyId());
        assertEquals(SECRET_API_KEY, configuration.getSecretApiKey());
        assertNull(configuration.getProxyConfiguration());
    }

    @Test
    void testCreateCommunicator() {
        @SuppressWarnings("resource")
        Communicator communicator = Factory.createCommunicator(PROPERTIES_URI, API_KEY_ID, SECRET_API_KEY);

        assertSame(DefaultMarshaller.INSTANCE, communicator.getMarshaller());

        @SuppressWarnings("resource")
        Connection connection = ReflectionUtil.getField(communicator, "connection", Connection.class);
        @SuppressWarnings("resource")
        DefaultConnection defaultConnection = assertInstanceOf(DefaultConnection.class, connection);
        DefaultConnectionAssertions.assertConnection(defaultConnection, -1, -1, 100, null);

        Authenticator authenticator = ReflectionUtil.getField(communicator, "authenticator", Authenticator.class);
        assertTrue(authenticator instanceof V1HMACAuthenticator);
        assertEquals(API_KEY_ID, ReflectionUtil.getField(authenticator, "apiKeyId", String.class));
        assertEquals(SECRET_API_KEY, ReflectionUtil.getField(authenticator, "secretApiKey", String.class));

        MetadataProvider metadataProvider = ReflectionUtil.getField(communicator, "metadataProvider", MetadataProvider.class);
        assertEquals(MetadataProvider.class, metadataProvider.getClass());
        Collection<RequestHeader> requestHeaders = metadataProvider.getServerMetadataHeaders();
        assertEquals(1, requestHeaders.size());
        RequestHeader requestHeader = requestHeaders.iterator().next();
        assertEquals("X-GCS-ServerMetaInfo", requestHeader.getName());
    }
}
