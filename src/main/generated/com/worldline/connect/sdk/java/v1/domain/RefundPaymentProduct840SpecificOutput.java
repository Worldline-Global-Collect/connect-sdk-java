/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * PayPal refund details
 */
public class RefundPaymentProduct840SpecificOutput {

    private RefundPaymentProduct840CustomerAccount customerAccount = null;

    /**
     * Object containing the PayPal account details
     */
    public RefundPaymentProduct840CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Object containing the PayPal account details
     */
    public void setCustomerAccount(RefundPaymentProduct840CustomerAccount value) {
        this.customerAccount = value;
    }
}
