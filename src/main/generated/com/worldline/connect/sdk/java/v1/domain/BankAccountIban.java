/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class BankAccountIban extends BankAccount {

    private String iban;

    /**
     * The IBAN is the International Bank Account Number. It is an internationally agreed format for the BBAN and includes the ISO country code and two check digits.
     */
    public String getIban() {
        return iban;
    }

    /**
     * The IBAN is the International Bank Account Number. It is an internationally agreed format for the BBAN and includes the ISO country code and two check digits.
     */
    public void setIban(String value) {
        this.iban = value;
    }
}
