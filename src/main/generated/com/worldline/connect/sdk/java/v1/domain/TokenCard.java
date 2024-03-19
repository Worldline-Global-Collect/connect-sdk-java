/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class TokenCard extends AbstractToken {

    private CustomerToken customer = null;

    private TokenCardData data = null;

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
     * Object containing the card tokenizable details
     */
    public TokenCardData getData() {
        return data;
    }

    /**
     * Object containing the card tokenizable details
     */
    public void setData(TokenCardData value) {
        this.data = value;
    }
}
