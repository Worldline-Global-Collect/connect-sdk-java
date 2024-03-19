/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class ErrorResponse {

    private String errorId = null;

    private List<APIError> errors = null;

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
}
