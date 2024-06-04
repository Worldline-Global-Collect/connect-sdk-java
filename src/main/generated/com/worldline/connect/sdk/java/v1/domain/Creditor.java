/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class Creditor {

    private String additionalAddressInfo;

    private String city;

    private String countryCode;

    private String houseNumber;

    private String iban;

    private String id;

    private String name;

    private String referenceParty;

    private String referencePartyId;

    private String street;

    private String zip;

    /**
     * Additional information about the creditor's address, like Suite II, Apartment 2a
     */
    public String getAdditionalAddressInfo() {
        return additionalAddressInfo;
    }

    /**
     * Additional information about the creditor's address, like Suite II, Apartment 2a
     */
    public void setAdditionalAddressInfo(String value) {
        this.additionalAddressInfo = value;
    }

    /**
     * City of the creditor address
     */
    public String getCity() {
        return city;
    }

    /**
     * City of the creditor address
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * ISO 3166-1 alpha-2 country code
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * ISO 3166-1 alpha-2 country code
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * House number of the creditor address
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House number of the creditor address
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Creditor IBAN number<br>
     * The IBAN is the International Bank Account Number. It is an internationally agreed format for the bank account number and includes the ISO country code and two check digits.
     */
    public String getIban() {
        return iban;
    }

    /**
     * Creditor IBAN number<br>
     * The IBAN is the International Bank Account Number. It is an internationally agreed format for the bank account number and includes the ISO country code and two check digits.
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Creditor identifier
     */
    public String getId() {
        return id;
    }

    /**
     * Creditor identifier
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Name of the collecting creditor
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the collecting creditor
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Creditor type of the legal reference of the collecting entity
     */
    public String getReferenceParty() {
        return referenceParty;
    }

    /**
     * Creditor type of the legal reference of the collecting entity
     */
    public void setReferenceParty(String value) {
        this.referenceParty = value;
    }

    /**
     * Legal reference of the collecting creditor
     */
    public String getReferencePartyId() {
        return referencePartyId;
    }

    /**
     * Legal reference of the collecting creditor
     */
    public void setReferencePartyId(String value) {
        this.referencePartyId = value;
    }

    /**
     * Street of the creditor address
     */
    public String getStreet() {
        return street;
    }

    /**
     * Street of the creditor address
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * ZIP code of the creditor address
     */
    public String getZip() {
        return zip;
    }

    /**
     * ZIP code of the creditor address
     */
    public void setZip(String value) {
        this.zip = value;
    }
}
