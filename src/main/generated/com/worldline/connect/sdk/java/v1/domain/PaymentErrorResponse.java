/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class PaymentErrorResponse {

    private String errorId;

    private List<APIError> errors;

    private CreatePaymentResult paymentResult;

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
     * Object that contains details on the created payment in case one has been created
     */
    public CreatePaymentResult getPaymentResult() {
        return paymentResult;
    }

    /**
     * Object that contains details on the created payment in case one has been created
     */
    public void setPaymentResult(CreatePaymentResult value) {
        this.paymentResult = value;
    }
}
