/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1;

import com.worldline.connect.sdk.java.v1.domain.CreatePaymentResult;
import com.worldline.connect.sdk.java.v1.domain.Payment;
import com.worldline.connect.sdk.java.v1.domain.PaymentErrorResponse;

/**
 * Represents an error response from a create payment call.
 */
@SuppressWarnings("serial")
public class DeclinedPaymentException extends DeclinedTransactionException {

    private final PaymentErrorResponse errors;

    public DeclinedPaymentException(int statusCode, String responseBody, PaymentErrorResponse errors) {
        super(buildMessage(errors), statusCode, responseBody, errors != null ? errors.getErrorId() : null, errors != null ? errors.getErrors() : null);
        this.errors = errors;
    }

    private static String buildMessage(PaymentErrorResponse errors) {
        Payment payment = errors != null && errors.getPaymentResult() != null ? errors.getPaymentResult().getPayment() : null;
        if (payment != null) {
            return "declined payment '" + payment.getId() + "' with status '" + payment.getStatus() + "'";
        }
        return "the Worldline Global Collect platform returned a declined payment response";
    }

    /**
     * @return The result of creating a payment if available, otherwise returns {@code null}.
     */
    public CreatePaymentResult getCreatePaymentResult() {
        return errors == null ? null : errors.getPaymentResult();
    }
}
