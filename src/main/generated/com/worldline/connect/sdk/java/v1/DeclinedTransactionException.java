/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1;

import java.util.List;

import com.worldline.connect.sdk.java.v1.domain.APIError;

/**
 * Represents an error response from a create payment, payout or refund call.
 */
@SuppressWarnings("serial")
public abstract class DeclinedTransactionException extends ApiException {

    protected DeclinedTransactionException(int statusCode, String responseBody, String errorId, List<APIError> errors) {
        super(statusCode, responseBody, errorId, errors);
    }

    protected DeclinedTransactionException(String message, int statusCode, String responseBody, String errorId, List<APIError> errors) {
        super(message, statusCode, responseBody, errorId, errors);
    }
}
