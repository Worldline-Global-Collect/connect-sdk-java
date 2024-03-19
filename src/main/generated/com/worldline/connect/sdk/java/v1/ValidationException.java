/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1;

import java.util.List;

import com.worldline.connect.sdk.java.v1.domain.APIError;

/**
 * Represents an error response from the Worldline Global Collect platform when validation of requests failed.
 */
@SuppressWarnings("serial")
public class ValidationException extends ApiException {

    public ValidationException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
        super("the Worldline Global Collect platform returned an incorrect request error response", statusCode, responseBody, errorId, errors);
    }

    public ValidationException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
        super(message, statusCode, responseBody, errorId, errors);
    }
}
