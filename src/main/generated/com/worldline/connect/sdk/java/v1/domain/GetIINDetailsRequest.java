/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Input for the retrieval of the IIN details request.
 */
public class GetIINDetailsRequest {

    private String bin;

    private PaymentContext paymentContext;

    /**
     * The first digits of the credit card number from left to right with a minimum of 6 digits. Providing additional digits can result in more co-brands being returned.
     */
    public String getBin() {
        return bin;
    }

    /**
     * The first digits of the credit card number from left to right with a minimum of 6 digits. Providing additional digits can result in more co-brands being returned.
     */
    public void setBin(String value) {
        this.bin = value;
    }

    /**
     * Optional payment context to refine the IIN lookup to filter out payment products not applicable to your payment.
     */
    public PaymentContext getPaymentContext() {
        return paymentContext;
    }

    /**
     * Optional payment context to refine the IIN lookup to filter out payment products not applicable to your payment.
     */
    public void setPaymentContext(PaymentContext value) {
        this.paymentContext = value;
    }
}
