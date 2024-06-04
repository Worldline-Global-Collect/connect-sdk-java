/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class TokenNonSepaDirectDebitPaymentProduct705SpecificData {

    private String authorisationId;

    private BankAccountBban bankAccountBban;

    /**
     * Core reference number for the direct debit instruction in UK
     */
    public String getAuthorisationId() {
        return authorisationId;
    }

    /**
     * Core reference number for the direct debit instruction in UK
     */
    public void setAuthorisationId(String value) {
        this.authorisationId = value;
    }

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
