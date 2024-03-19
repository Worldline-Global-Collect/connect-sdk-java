package com.worldline.connect.sdk.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Properties;

import com.worldline.connect.sdk.java.authentication.Authenticator;
import com.worldline.connect.sdk.java.authentication.AuthorizationType;
import com.worldline.connect.sdk.java.authentication.V1HMACAuthenticator;
import com.worldline.connect.sdk.java.communication.Connection;
import com.worldline.connect.sdk.java.communication.DefaultConnectionBuilder;
import com.worldline.connect.sdk.java.communication.MetadataProvider;
import com.worldline.connect.sdk.java.communication.MetadataProviderBuilder;
import com.worldline.connect.sdk.java.json.DefaultMarshaller;

/**
 * Worldline Global Collect platform factory for several SDK components.
 */
public final class Factory {

    private Factory() {
    }

    /**
     * Creates a {@link CommunicatorConfiguration} based on the configuration
     * values in {@code configurationFileUri} and {@code authorizationId} and
     * {@code authorizationSecret}.
     */
    public static CommunicatorConfiguration createConfiguration(URI configurationFileUri, String authorizationId, String authorizationSecret) {
        Properties properties = new Properties();
        try (InputStream configurationFileInputStream = configurationFileUri.toURL().openStream()) {
            properties.load(configurationFileInputStream);
            return new CommunicatorConfiguration(properties)
                    .withAuthorizationId(authorizationId)
                    .withAuthorizationSecret(authorizationSecret);
        } catch (IOException e) {
            throw new IllegalStateException("Unable to load properties", e);
        }
    }

    /**
     * Creates a {@link CommunicatorBuilder} based on the configuration values in
     * {@code configurationFileUri}, {@code authorizationId} and {@code authorizationSecret}.
     */
    public static CommunicatorBuilder createCommunicatorBuilder(URI configurationFileUri, String authorizationId, String authorizationSecret) {
        CommunicatorConfiguration configuration = createConfiguration(configurationFileUri, authorizationId, authorizationSecret);
        return createCommunicatorBuilder(configuration);
    }

    /**
     * Creates a {@link CommunicatorBuilder} based on the passed configuration.
     */
    @SuppressWarnings("resource")
    public static CommunicatorBuilder createCommunicatorBuilder(CommunicatorConfiguration configuration) {

        MetadataProvider metadataProvider = new MetadataProviderBuilder(configuration.getIntegrator())
                .withShoppingCartExtension(configuration.getShoppingCartExtension())
                .build();

        return new CommunicatorBuilder()
                .withAPIEndpoint(configuration.getApiEndpoint())
                .withConnection(new DefaultConnectionBuilder(configuration.getConnectTimeout(), configuration.getSocketTimeout())
                        .withMaxConnections(configuration.getMaxConnections())
                        .withConnectionReuse(configuration.isConnectionReuse())
                        .withProxyConfiguration(configuration.getProxyConfiguration())
                        .withHttpsProtocols(configuration.getHttpsProtocols())
                        .build()
                )
                .withMetadataProvider(metadataProvider)
                .withAuthenticator(getAuthenticator(configuration))
                .withMarshaller(DefaultMarshaller.INSTANCE);
    }

    /**
     * Creates an {@link Authenticator} based on the passed configuration.
     */
    private static Authenticator getAuthenticator(CommunicatorConfiguration configuration) {
        if (configuration.getAuthorizationType() == AuthorizationType.V1HMAC) {
            return new V1HMACAuthenticator(configuration.getApiKeyId(), configuration.getSecretApiKey());
        }
        throw new IllegalStateException("Unknown authorizationType " + configuration.getAuthorizationType());
    }

    /**
     * Creates a {@link Communicator} based on the configuration values in
     * {@code configurationFileUri}, {@code authorizationId} and {@code authorizationSecret}.
     */
    public static Communicator createCommunicator(URI configurationFileUri, String authorizationId, String authorizationSecret) {
        CommunicatorConfiguration configuration = createConfiguration(configurationFileUri, authorizationId, authorizationSecret);
        return createCommunicator(configuration);
    }

    /**
     * Creates a {@link Communicator} based on the passed configuration.
     */
    public static Communicator createCommunicator(CommunicatorConfiguration configuration) {
        CommunicatorBuilder communicatorBuilder = createCommunicatorBuilder(configuration);
        return communicatorBuilder.build();
    }

    /**
     * Creates a {@link Communicator} based on the passed parameters.
     */
    public static Communicator createCommunicator(URI apiEndpoint, Connection connection, Authenticator authenticator, MetadataProvider metadataProvider) {
        return new Communicator(apiEndpoint, connection, authenticator, metadataProvider, DefaultMarshaller.INSTANCE);
    }

    /**
     * Creates a {@link Client} based on the configuration values in
     * {@code configurationFileUri}, {@code authorizationId} and {@code authorizationSecret}.
     */
    @SuppressWarnings("resource")
    public static Client createClient(URI configurationFileUri, String authorizationId, String authorizationSecret) {
        Communicator communicator = createCommunicator(configurationFileUri, authorizationId, authorizationSecret);
        return createClient(communicator);
    }

    /**
     * Creates a {@link Client} based on the passed configuration.
     */
    @SuppressWarnings("resource")
    public static Client createClient(CommunicatorConfiguration configuration) {
        Communicator communicator = createCommunicator(configuration);
        return createClient(communicator);
    }

    /**
     * Creates a {@link Client} based on the passed parameters.
     */
    @SuppressWarnings("resource")
    public static Client createClient(URI apiEndpoint, Connection connection, Authenticator authenticator, MetadataProvider metadataProvider) {
        Communicator communicator = createCommunicator(apiEndpoint, connection, authenticator, metadataProvider);
        return createClient(communicator);
    }

    /**
     * Creates a {@link Client} based on the passed {@link Communicator}.
     */
    public static Client createClient(Communicator communicator) {
        return new Client(communicator);
    }
}
