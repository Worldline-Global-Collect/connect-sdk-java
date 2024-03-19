/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MandateSepaDirectDebit extends MandateSepaDirectDebitWithMandateId {

    private Creditor creditor = null;

    /**
     * Object containing information on the creditor
     */
    public Creditor getCreditor() {
        return creditor;
    }

    /**
     * Object containing information on the creditor
     */
    public void setCreditor(Creditor value) {
        this.creditor = value;
    }
}
