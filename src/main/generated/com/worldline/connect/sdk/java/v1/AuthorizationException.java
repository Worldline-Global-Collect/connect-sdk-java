/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1;

import java.util.List;

import com.worldline.connect.sdk.java.v1.domain.APIError;

/**
 * Represents an error response from the Worldline Global Collect platform when authorization failed.
 */
@SuppressWarnings("serial")
public class AuthorizationException extends ApiException {

    public AuthorizationException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
        super("the Worldline Global Collect platform returned an authorization error response", statusCode, responseBody, errorId, errors);
    }

    public AuthorizationException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
        super(message, statusCode, responseBody, errorId, errors);
    }
}
