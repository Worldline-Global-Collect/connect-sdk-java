/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class TrustlyBankAccount {

    private String accountLastDigits;

    private String bankName;

    private String clearinghouse;

    private String personIdentificationNumber;

    /**
     * The last digits of the account number
     */
    public String getAccountLastDigits() {
        return accountLastDigits;
    }

    /**
     * The last digits of the account number
     */
    public void setAccountLastDigits(String value) {
        this.accountLastDigits = value;
    }

    /**
     * The name of the bank
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * The name of the bank
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * The country of the clearing house
     */
    public String getClearinghouse() {
        return clearinghouse;
    }

    /**
     * The country of the clearing house
     */
    public void setClearinghouse(String value) {
        this.clearinghouse = value;
    }

    /**
     * The ID number of the account holder
     */
    public String getPersonIdentificationNumber() {
        return personIdentificationNumber;
    }

    /**
     * The ID number of the account holder
     */
    public void setPersonIdentificationNumber(String value) {
        this.personIdentificationNumber = value;
    }
}
