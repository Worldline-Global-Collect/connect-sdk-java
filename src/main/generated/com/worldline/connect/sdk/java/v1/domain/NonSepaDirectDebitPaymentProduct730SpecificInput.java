/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * ACH specific input fields
 */
public class NonSepaDirectDebitPaymentProduct730SpecificInput {

    private BankAccountBban bankAccountBban;

    /**
     * Object containing account holder name and bank account information
     */
    public BankAccountBban getBankAccountBban() {
        return bankAccountBban;
    }

    /**
     * Object containing account holder name and bank account information
     */
    public void setBankAccountBban(BankAccountBban value) {
        this.bankAccountBban = value;
    }
}
