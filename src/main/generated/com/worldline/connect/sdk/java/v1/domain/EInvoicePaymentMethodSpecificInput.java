/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class EInvoicePaymentMethodSpecificInput extends AbstractEInvoicePaymentMethodSpecificInput {

    private Boolean acceptedTermsAndConditions;

    private EInvoicePaymentProduct9000SpecificInput paymentProduct9000SpecificInput;

    /**
     * Indicates that the customer has read and accepted the terms and conditions of the product before proceeding with the payment. This must be done before the payment can continue. An URL to the terms and conditions can be retrieved with <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/products/get.html">Get payment product</a>.
     */
    public Boolean getAcceptedTermsAndConditions() {
        return acceptedTermsAndConditions;
    }

    /**
     * Indicates that the customer has read and accepted the terms and conditions of the product before proceeding with the payment. This must be done before the payment can continue. An URL to the terms and conditions can be retrieved with <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/products/get.html">Get payment product</a>.
     */
    public void setAcceptedTermsAndConditions(Boolean value) {
        this.acceptedTermsAndConditions = value;
    }

    /**
     * Object that holds the specific data for AfterPay Installments (payment product 9000).
     */
    public EInvoicePaymentProduct9000SpecificInput getPaymentProduct9000SpecificInput() {
        return paymentProduct9000SpecificInput;
    }

    /**
     * Object that holds the specific data for AfterPay Installments (payment product 9000).
     */
    public void setPaymentProduct9000SpecificInput(EInvoicePaymentProduct9000SpecificInput value) {
        this.paymentProduct9000SpecificInput = value;
    }
}
