/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Please find below specific input fields for payment product 816 (giropay)
 */
public class RedirectPaymentProduct816SpecificInput {

    private BankAccountIban bankAccountIban = null;

    /**
     * Object containing the bank account details of the customer
     */
    public BankAccountIban getBankAccountIban() {
        return bankAccountIban;
    }

    /**
     * Object containing the bank account details of the customer
     */
    public void setBankAccountIban(BankAccountIban value) {
        this.bankAccountIban = value;
    }
}
