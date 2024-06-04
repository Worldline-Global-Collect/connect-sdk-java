/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class BankDetailsResponse {

    private BankAccountBban bankAccountBban;

    private BankAccountIban bankAccountIban;

    private BankData bankData;

    private Swift swift;

    /**
     * Object that holds the Basic Bank Account Number (BBAN) data
     */
    public BankAccountBban getBankAccountBban() {
        return bankAccountBban;
    }

    /**
     * Object that holds the Basic Bank Account Number (BBAN) data
     */
    public void setBankAccountBban(BankAccountBban value) {
        this.bankAccountBban = value;
    }

    /**
     * Object that holds the International Bank Account Number (IBAN) data
     */
    public BankAccountIban getBankAccountIban() {
        return bankAccountIban;
    }

    /**
     * Object that holds the International Bank Account Number (IBAN) data
     */
    public void setBankAccountIban(BankAccountIban value) {
        this.bankAccountIban = value;
    }

    /**
     * Object that holds the reformatted bank account data
     */
    public BankData getBankData() {
        return bankData;
    }

    /**
     * Object that holds the reformatted bank account data
     */
    public void setBankData(BankData value) {
        this.bankData = value;
    }

    /**
     * Object that holds all the SWIFT routing information
     */
    public Swift getSwift() {
        return swift;
    }

    /**
     * Object that holds all the SWIFT routing information
     */
    public void setSwift(Swift value) {
        this.swift = value;
    }
}
