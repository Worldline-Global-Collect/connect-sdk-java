/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MobilePaymentMethodSpecificInputHostedCheckout extends AbstractMobilePaymentMethodSpecificInput {

    private MobilePaymentProduct302SpecificInputHostedCheckout paymentProduct302SpecificInput;

    private MobilePaymentProduct320SpecificInputHostedCheckout paymentProduct320SpecificInput;

    /**
     * Object containing information specific to Apple Pay
     */
    public MobilePaymentProduct302SpecificInputHostedCheckout getPaymentProduct302SpecificInput() {
        return paymentProduct302SpecificInput;
    }

    /**
     * Object containing information specific to Apple Pay
     */
    public void setPaymentProduct302SpecificInput(MobilePaymentProduct302SpecificInputHostedCheckout value) {
        this.paymentProduct302SpecificInput = value;
    }

    /**
     * Object containing information specific to Google Pay (paymentProductId 320)
     */
    public MobilePaymentProduct320SpecificInputHostedCheckout getPaymentProduct320SpecificInput() {
        return paymentProduct320SpecificInput;
    }

    /**
     * Object containing information specific to Google Pay (paymentProductId 320)
     */
    public void setPaymentProduct320SpecificInput(MobilePaymentProduct320SpecificInputHostedCheckout value) {
        this.paymentProduct320SpecificInput = value;
    }
}
