/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RefundEWalletMethodSpecificOutput extends RefundMethodSpecificOutput {

    private RefundPaymentProduct840SpecificOutput paymentProduct840SpecificOutput;

    /**
     * PayPal (payment product 840) specific details
     */
    public RefundPaymentProduct840SpecificOutput getPaymentProduct840SpecificOutput() {
        return paymentProduct840SpecificOutput;
    }

    /**
     * PayPal (payment product 840) specific details
     */
    public void setPaymentProduct840SpecificOutput(RefundPaymentProduct840SpecificOutput value) {
        this.paymentProduct840SpecificOutput = value;
    }
}
