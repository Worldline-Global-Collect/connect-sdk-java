/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class TokenNonSepaDirectDebit extends AbstractToken {

    private CustomerToken customer = null;

    private MandateNonSepaDirectDebit mandate = null;

    /**
     * Object containing the details of the customer
     */
    public CustomerToken getCustomer() {
        return customer;
    }

    /**
     * Object containing the details of the customer
     */
    public void setCustomer(CustomerToken value) {
        this.customer = value;
    }

    /**
     * Object containing the mandate details
     */
    public MandateNonSepaDirectDebit getMandate() {
        return mandate;
    }

    /**
     * Object containing the mandate details
     */
    public void setMandate(MandateNonSepaDirectDebit value) {
        this.mandate = value;
    }
}
