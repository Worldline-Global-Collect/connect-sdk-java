/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class BankRefundMethodSpecificInput {

    private BankAccountBbanRefund bankAccountBban;

    private BankAccountIban bankAccountIban;

    private String countryCode;

    /**
     * Object that holds the Basic Bank Account Number (BBAN) data
     */
    public BankAccountBbanRefund getBankAccountBban() {
        return bankAccountBban;
    }

    /**
     * Object that holds the Basic Bank Account Number (BBAN) data
     */
    public void setBankAccountBban(BankAccountBbanRefund value) {
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
     * ISO 3166-1 alpha-2 country code of the country where money will be refunded to
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * ISO 3166-1 alpha-2 country code of the country where money will be refunded to
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }
}
