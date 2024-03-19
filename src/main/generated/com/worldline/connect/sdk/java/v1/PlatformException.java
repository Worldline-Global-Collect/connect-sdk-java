/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1;

import java.util.List;

import com.worldline.connect.sdk.java.v1.domain.APIError;

/**
 * Represents an error response from the Worldline Global Collect platform when something went wrong at the Worldline Global Collect platform or further downstream.
 */
@SuppressWarnings("serial")
public class PlatformException extends ApiException {

    public PlatformException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
        super("the Worldline Global Collect platform returned an error response", statusCode, responseBody, errorId, errors);
    }

    public PlatformException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
        super(message, statusCode, responseBody, errorId, errors);
    }
}
