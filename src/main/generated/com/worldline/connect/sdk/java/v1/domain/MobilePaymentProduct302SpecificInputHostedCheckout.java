/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MobilePaymentProduct302SpecificInputHostedCheckout {

    private String businessName = null;

    /**
     * Used as an input for the Apple Pay payment button. Your default business name is configured in the Configuration Center. In case you want to use another business name than the one configured in the Configuration Center, provide your company name in a human readable form.
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Used as an input for the Apple Pay payment button. Your default business name is configured in the Configuration Center. In case you want to use another business name than the one configured in the Configuration Center, provide your company name in a human readable form.
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }
}
