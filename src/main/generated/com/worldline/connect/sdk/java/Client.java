/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java;

import java.io.Closeable;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.TimeUnit;

import com.worldline.connect.sdk.java.communication.PooledConnection;
import com.worldline.connect.sdk.java.json.MarshallerSyntaxException;
import com.worldline.connect.sdk.java.logging.BodyObfuscator;
import com.worldline.connect.sdk.java.logging.CommunicatorLogger;
import com.worldline.connect.sdk.java.logging.HeaderObfuscator;
import com.worldline.connect.sdk.java.logging.LoggingCapable;
import com.worldline.connect.sdk.java.logging.ObfuscationCapable;
import com.worldline.connect.sdk.java.v1.V1Client;

/**
 * Worldline Global Collect platform client.
 * <p>
 * This client and all its child clients are bound to one specific value for the <i>X-GCS-ClientMetaInfo</i> header.
 * To get a new client with a different header value, use {@link #withClientMetaInfo(String)}.
 * <p>
 * Thread-safe.
 */
public class Client extends ApiResource implements Closeable, LoggingCapable, ObfuscationCapable {

    private static final Charset CHARSET = StandardCharsets.UTF_8;

    public Client(Communicator communicator) {
        this(communicator, null);
    }

    private Client(Communicator communicator, String clientMetaInfo) {
        super(communicator, clientMetaInfo, null);
    }

    /**
     * Returns a new {@link Client} which uses the passed meta data for the
     * <i>X-GCS-ClientMetaInfo</i> header.
     *
     * @param clientMetaInfo
     *            JSON string containing the meta data for the client
     * @throws MarshallerSyntaxException
     *            if the given clientMetaInfo is not a valid JSON string
     */
    public Client withClientMetaInfo(String clientMetaInfo) {
        if (this.clientMetaInfo == null && clientMetaInfo == null) {
            return this;
        }
        if (clientMetaInfo == null) {
            return new Client(communicator, null);
        }
        // Checking to see if this is valid JSON (no JSON parse exceptions)
        communicator.getMarshaller().unmarshal(clientMetaInfo, Object.class);

        clientMetaInfo = Base64.getEncoder().encodeToString(clientMetaInfo.getBytes(CHARSET));

        return clientMetaInfo.equals(this.clientMetaInfo) ? this : new Client(communicator, clientMetaInfo);
    }

    /**
     * Utility method that delegates the call to this client's communicator.
     *
     * @see Communicator#closeIdleConnections(long, TimeUnit)
     * @see PooledConnection#closeIdleConnections(long, TimeUnit)
     */
    public void closeIdleConnections(long idleTime, TimeUnit timeUnit) {
        communicator.closeIdleConnections(idleTime, timeUnit);
    }

    /**
     * Utility method that delegates the call to this client's communicator.
     *
     * @see Communicator#closeExpiredConnections()
     * @see PooledConnection#closeExpiredConnections()
     */
    public void closeExpiredConnections() {
        communicator.closeExpiredConnections();
    }

    @Override
    public void setBodyObfuscator(BodyObfuscator bodyObfuscator) {
        // delegate to the communicator
        communicator.setBodyObfuscator(bodyObfuscator);
    }

    @Override
    public void setHeaderObfuscator(HeaderObfuscator headerObfuscator) {
        // delegate to the communicator
        communicator.setHeaderObfuscator(headerObfuscator);
    }

    @Override
    public void enableLogging(CommunicatorLogger communicatorLogger) {
        // delegate to the communicator
        communicator.enableLogging(communicatorLogger);
    }

    @Override
    public void disableLogging() {
        // delegate to the communicator
        communicator.disableLogging();
    }

    /**
     * Releases any system resources associated with this object.
     */
    @Override
    public void close() throws IOException {
        communicator.close();
    }

    public V1Client v1() {
        return new V1Client(this, null);
    }
}
