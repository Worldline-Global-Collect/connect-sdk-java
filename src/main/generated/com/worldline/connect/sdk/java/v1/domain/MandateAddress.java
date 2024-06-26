/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Address details of the consumer
 */
public class MandateAddress {

    private String city;

    private String countryCode;

    private String houseNumber;

    private String street;

    private String zip;

    /**
     * City
     */
    public String getCity() {
        return city;
    }

    /**
     * City
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
     * House number
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House number
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Streetname
     */
    public String getStreet() {
        return street;
    }

    /**
     * Streetname
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Zip code
     */
    public String getZip() {
        return zip;
    }

    /**
     * Zip code
     */
    public void setZip(String value) {
        this.zip = value;
    }
}
