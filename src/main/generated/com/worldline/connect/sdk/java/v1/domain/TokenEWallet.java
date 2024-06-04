/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class TokenEWallet extends AbstractToken {

    private CustomerToken customer;

    private TokenEWalletData data;

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
     * Object containing the eWallet tokenizable data
     */
    public TokenEWalletData getData() {
        return data;
    }

    /**
     * Object containing the eWallet tokenizable data
     */
    public void setData(TokenEWalletData value) {
        this.data = value;
    }
}
