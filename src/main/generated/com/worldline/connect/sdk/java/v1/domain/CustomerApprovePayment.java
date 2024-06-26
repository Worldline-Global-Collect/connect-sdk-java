/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CustomerApprovePayment {

    private String accountType;

    /**
     * Type of the customer account that is used to place this order. Can have one of the following values:
     * <ul class="paragraph-width"><li>none - The account that was used to place the order is a guest account or no account was used at all
     * <li>created - The customer account was created during this transaction
     * <li>existing - The customer account was an already existing account prior to this transaction</ul>
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Type of the customer account that is used to place this order. Can have one of the following values:
     * <ul class="paragraph-width"><li>none - The account that was used to place the order is a guest account or no account was used at all
     * <li>created - The customer account was created during this transaction
     * <li>existing - The customer account was an already existing account prior to this transaction</ul>
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }
}
