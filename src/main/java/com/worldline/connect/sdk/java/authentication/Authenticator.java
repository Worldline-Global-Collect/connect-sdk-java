package com.worldline.connect.sdk.java.authentication;

import java.net.URI;
import java.util.List;

import com.worldline.connect.sdk.java.communication.RequestHeader;

/**
 * Used to authenticate requests to the Worldline Global Collect platform. Thread-safe.
 */
public interface Authenticator {

    /**
     * Returns a value that can be used for the "Authorization" header.
     *
     * @param httpMethod The HTTP method.
     * @param resourceUri The {@link URI} of the resource.
     * @param requestHeaders
     *            A list of {@link RequestHeader}s. This list may not be
     *            modified and may not contain headers with the same name.
     */
    String getAuthorization(String httpMethod, URI resourceUri, List<RequestHeader> requestHeaders);
}
