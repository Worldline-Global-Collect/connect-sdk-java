/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Please find below specific input fields for payment product 882 (Net Banking)
 */
public class RedirectPaymentProduct882SpecificInput {

    private String issuerId;

    /**
     * ID of the issuing bank of the customer. A list of available issuerIDs can be obtained by using the retrieve payment product directory API.
     */
    public String getIssuerId() {
        return issuerId;
    }

    /**
     * ID of the issuing bank of the customer. A list of available issuerIDs can be obtained by using the retrieve payment product directory API.
     */
    public void setIssuerId(String value) {
        this.issuerId = value;
    }
}
