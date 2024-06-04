/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Output for the retrieval of a customer's details.
 */
public class GetCustomerDetailsResponse {

    private String city;

    private String country;

    private String emailAddress;

    private String firstName;

    private String fiscalNumber;

    private String languageCode;

    private String phoneNumber;

    private String street;

    private String surname;

    private String zip;

    /**
     * The city in which the customer resides.
     */
    public String getCity() {
        return city;
    }

    /**
     * The city in which the customer resides.
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * The country in which the customer resides.
     */
    public String getCountry() {
        return country;
    }

    /**
     * The country in which the customer resides.
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * The email address registered to the customer.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * The email address registered to the customer.
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * The first name of the customer
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * The first name of the customer
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * The fiscal number (SSN) for the customer.
     */
    public String getFiscalNumber() {
        return fiscalNumber;
    }

    /**
     * The fiscal number (SSN) for the customer.
     */
    public void setFiscalNumber(String value) {
        this.fiscalNumber = value;
    }

    /**
     * The code of the language used by the customer.
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * The code of the language used by the customer.
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * The phone number registered to the customer.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * The phone number registered to the customer.
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * The street on which the customer resides.
     */
    public String getStreet() {
        return street;
    }

    /**
     * The street on which the customer resides.
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * The surname or family name of the customer.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * The surname or family name of the customer.
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * The ZIP or postal code for the area in which the customer resides.
     */
    public String getZip() {
        return zip;
    }

    /**
     * The ZIP or postal code for the area in which the customer resides.
     */
    public void setZip(String value) {
        this.zip = value;
    }
}
