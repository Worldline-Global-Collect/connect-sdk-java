/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class PayoutErrorResponse {

    private String errorId;

    private List<APIError> errors;

    private PayoutResult payoutResult;

    /**
     * Unique reference, for debugging purposes, of this error response
     */
    public String getErrorId() {
        return errorId;
    }

    /**
     * Unique reference, for debugging purposes, of this error response
     */
    public void setErrorId(String value) {
        this.errorId = value;
    }

    /**
     * List of one or more errors
     */
    public List<APIError> getErrors() {
        return errors;
    }

    /**
     * List of one or more errors
     */
    public void setErrors(List<APIError> value) {
        this.errors = value;
    }

    /**
     * Object that contains details on the created payout in case one has been created
     */
    public PayoutResult getPayoutResult() {
        return payoutResult;
    }

    /**
     * Object that contains details on the created payout in case one has been created
     */
    public void setPayoutResult(PayoutResult value) {
        this.payoutResult = value;
    }
}
