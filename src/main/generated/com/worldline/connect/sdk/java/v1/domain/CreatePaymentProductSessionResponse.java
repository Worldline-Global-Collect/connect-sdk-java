/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CreatePaymentProductSessionResponse {

    private MobilePaymentProductSession302SpecificOutput paymentProductSession302SpecificOutput;

    /**
     * Object containing the Apple Pay session object.
     */
    public MobilePaymentProductSession302SpecificOutput getPaymentProductSession302SpecificOutput() {
        return paymentProductSession302SpecificOutput;
    }

    /**
     * Object containing the Apple Pay session object.
     */
    public void setPaymentProductSession302SpecificOutput(MobilePaymentProductSession302SpecificOutput value) {
        this.paymentProductSession302SpecificOutput = value;
    }
}
