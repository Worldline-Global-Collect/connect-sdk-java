/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Please find below specific input fields for payment product 4101 (UPI)
 */
public class RedirectPaymentProduct4101SpecificInputBase extends AbstractRedirectPaymentProduct4101SpecificInput {

    private String displayName;

    /**
     * The merchant name as shown to the customer in some payment applications.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The merchant name as shown to the customer in some payment applications.
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }
}
