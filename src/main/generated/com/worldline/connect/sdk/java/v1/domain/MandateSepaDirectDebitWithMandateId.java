/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MandateSepaDirectDebitWithMandateId extends MandateSepaDirectDebitWithoutCreditor {

    private String mandateId = null;

    /**
     * Unique mandate identifier
     */
    public String getMandateId() {
        return mandateId;
    }

    /**
     * Unique mandate identifier
     */
    public void setMandateId(String value) {
        this.mandateId = value;
    }
}
