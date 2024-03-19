/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1;

import com.worldline.connect.sdk.java.v1.domain.RefundErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundResult;

/**
 * Represents an error response from a refund call.
 */
@SuppressWarnings("serial")
public class DeclinedRefundException extends DeclinedTransactionException {

    private final RefundErrorResponse errors;

    public DeclinedRefundException(int statusCode, String responseBody, RefundErrorResponse errors) {
        super(buildMessage(errors), statusCode, responseBody, errors != null ? errors.getErrorId() : null, errors != null ? errors.getErrors() : null);
        this.errors = errors;
    }

    private static String buildMessage(RefundErrorResponse errors) {
        RefundResult refund = errors != null ? errors.getRefundResult() : null;
        if (refund != null) {
            return "declined refund '" + refund.getId() + "' with status '" + refund.getStatus() + "'";
        }
        return "the Worldline Global Collect platform returned a declined refund response";
    }

    /**
     * @return The result of creating a refund if available, otherwise returns {@code null}.
     */
    public RefundResult getRefundResult() {
        return errors == null ? null : errors.getRefundResult();
    }
}
