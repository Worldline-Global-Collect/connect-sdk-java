/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * An object that contains the reload amount and balance threshold for the automatic reload payment.
 */
public class AutomaticReloadBillingDetails extends BaseBillingDetails {

    private Long automaticReloadPaymentThresholdAmount;

    /**
     * The balance an account reaches for the automatic reload amount to be applied.
     */
    public Long getAutomaticReloadPaymentThresholdAmount() {
        return automaticReloadPaymentThresholdAmount;
    }

    /**
     * The balance an account reaches for the automatic reload amount to be applied.
     */
    public void setAutomaticReloadPaymentThresholdAmount(Long value) {
        this.automaticReloadPaymentThresholdAmount = value;
    }
}
