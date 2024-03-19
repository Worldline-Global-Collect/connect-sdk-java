package com.worldline.connect.sdk.java.communication;

import java.io.InputStream;
import java.util.List;

/**
 * An interface for handling responses from the Worldline Global Collect platform.
 */
public interface ResponseHandler<R> {

    /**
     * @param statusCode The HTTP status code that was returned by the Worldline Global Collect platform.
     * @param bodyStream The raw response body that was returned by the Worldline Global Collect platform. Note that it will be closed outside of this method.
     * @param headers The headers that were returned by the Worldline Global Collect platform. Never {@code null}.
     */
    R handleResponse(int statusCode, InputStream bodyStream, List<ResponseHeader> headers);
}
