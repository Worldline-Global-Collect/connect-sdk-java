/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Response to the cancelation of a payment
 */
public class CancelPaymentResponse {

    private CancelPaymentCardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput = null;

    private CancelPaymentMobilePaymentMethodSpecificOutput mobilePaymentMethodSpecificOutput = null;

    private Payment payment = null;

    /**
     * Object that holds specific information on cancelled card payments
     */
    public CancelPaymentCardPaymentMethodSpecificOutput getCardPaymentMethodSpecificOutput() {
        return cardPaymentMethodSpecificOutput;
    }

    /**
     * Object that holds specific information on cancelled card payments
     */
    public void setCardPaymentMethodSpecificOutput(CancelPaymentCardPaymentMethodSpecificOutput value) {
        this.cardPaymentMethodSpecificOutput = value;
    }

    /**
     * Object that holds specific information on cancelled mobile payments
     */
    public CancelPaymentMobilePaymentMethodSpecificOutput getMobilePaymentMethodSpecificOutput() {
        return mobilePaymentMethodSpecificOutput;
    }

    /**
     * Object that holds specific information on cancelled mobile payments
     */
    public void setMobilePaymentMethodSpecificOutput(CancelPaymentMobilePaymentMethodSpecificOutput value) {
        this.mobilePaymentMethodSpecificOutput = value;
    }

    /**
     * Object that holds the payment related properties
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Object that holds the payment related properties
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }
}
