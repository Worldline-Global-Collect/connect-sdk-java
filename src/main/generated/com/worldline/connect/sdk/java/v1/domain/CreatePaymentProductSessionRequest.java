/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CreatePaymentProductSessionRequest {

    private MobilePaymentProductSession302SpecificInput paymentProductSession302SpecificInput = null;

    /**
     * Object containing details for creating an Apple Pay session.
     */
    public MobilePaymentProductSession302SpecificInput getPaymentProductSession302SpecificInput() {
        return paymentProductSession302SpecificInput;
    }

    /**
     * Object containing details for creating an Apple Pay session.
     */
    public void setPaymentProductSession302SpecificInput(MobilePaymentProductSession302SpecificInput value) {
        this.paymentProductSession302SpecificInput = value;
    }
}
