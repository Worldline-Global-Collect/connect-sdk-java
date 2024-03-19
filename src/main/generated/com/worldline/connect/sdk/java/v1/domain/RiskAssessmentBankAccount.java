/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RiskAssessmentBankAccount extends RiskAssessment {

    private BankAccountBban bankAccountBban = null;

    private BankAccountIban bankAccountIban = null;

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

    /**
     * Object containing account holder name and IBAN information
     */
    public BankAccountIban getBankAccountIban() {
        return bankAccountIban;
    }

    /**
     * Object containing account holder name and IBAN information
     */
    public void setBankAccountIban(BankAccountIban value) {
        this.bankAccountIban = value;
    }
}
