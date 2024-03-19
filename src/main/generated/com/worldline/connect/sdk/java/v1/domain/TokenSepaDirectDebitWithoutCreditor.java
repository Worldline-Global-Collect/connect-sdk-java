/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class TokenSepaDirectDebitWithoutCreditor extends AbstractToken {

    private CustomerTokenWithContactDetails customer = null;

    private MandateSepaDirectDebitWithoutCreditor mandate = null;

    /**
     * Object containing the details of the customer
     */
    public CustomerTokenWithContactDetails getCustomer() {
        return customer;
    }

    /**
     * Object containing the details of the customer
     */
    public void setCustomer(CustomerTokenWithContactDetails value) {
        this.customer = value;
    }

    /**
     * Object containing the mandate details
     */
    public MandateSepaDirectDebitWithoutCreditor getMandate() {
        return mandate;
    }

    /**
     * Object containing the mandate details
     */
    public void setMandate(MandateSepaDirectDebitWithoutCreditor value) {
        this.mandate = value;
    }
}
