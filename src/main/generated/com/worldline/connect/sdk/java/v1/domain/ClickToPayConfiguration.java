/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object containing the configuration parameters for each scheme supporting Click to Pay for the provided country and currency combination. These parameters initialize SRC System SDK for the scheme. This object is only returned for card products with allowsClickToPay set to true.
 */
public class ClickToPayConfiguration {

    private ClickToPayConfigurationMastercard mastercard;

    private ClickToPayConfigurationVisa visa;

    /**
     * Scheme onboarding value returned for the card products supporting Click to Pay with Mastercard.
     */
    public ClickToPayConfigurationMastercard getMastercard() {
        return mastercard;
    }

    /**
     * Scheme onboarding value returned for the card products supporting Click to Pay with Mastercard.
     */
    public void setMastercard(ClickToPayConfigurationMastercard value) {
        this.mastercard = value;
    }

    /**
     * Scheme onboarding value returned for the card products supporting Click to Pay with Visa.
     */
    public ClickToPayConfigurationVisa getVisa() {
        return visa;
    }

    /**
     * Scheme onboarding value returned for the card products supporting Click to Pay with Visa.
     */
    public void setVisa(ClickToPayConfigurationVisa value) {
        this.visa = value;
    }
}
