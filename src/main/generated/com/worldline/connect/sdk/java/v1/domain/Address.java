/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class Address {

    private String additionalInfo;

    private String city;

    private String countryCode;

    private String houseNumber;

    private String state;

    private String stateCode;

    private String street;

    private String zip;

    /**
     * Additional address information. The additionalInfo is truncated after 10 characters for payments, refunds or payouts that are processed by the WL Online Payment Acceptance platform
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Additional address information. The additionalInfo is truncated after 10 characters for payments, refunds or payouts that are processed by the WL Online Payment Acceptance platform
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * City<br>
     * Note: For payments with product 1503 the maximum length is not 40 but 20.
     */
    public String getCity() {
        return city;
    }

    /**
     * City<br>
     * Note: For payments with product 1503 the maximum length is not 40 but 20.
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
     * House number. The houseNumber is truncated after 10 characters for payments, refunds or payouts that are processed by the WL Online Payment Acceptance platform
     */
    public String getHouseNumber() {
        return houseNumber;
    }

    /**
     * House number. The houseNumber is truncated after 10 characters for payments, refunds or payouts that are processed by the WL Online Payment Acceptance platform
     */
    public void setHouseNumber(String value) {
        this.houseNumber = value;
    }

    /**
     * Full name of the state or province
     */
    public String getState() {
        return state;
    }

    /**
     * Full name of the state or province
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * ISO 3166-2 alpha-3 state code<br>
     * Notes:<br><ul class="paragraph-width"><li>The maximum length for 3-D Secure version 2 is AN3 for payments that are processed by the GlobalCollect platform</li><li>The maximum length for paymentProductId 1503 (Boleto) is AN2 for payments that are processed by the GlobalCollect platform</li><li>The maximum length is 3 for payments that are processed by the WL Online Payment Acceptance platform</li></ul>
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * ISO 3166-2 alpha-3 state code<br>
     * Notes:<br><ul class="paragraph-width"><li>The maximum length for 3-D Secure version 2 is AN3 for payments that are processed by the GlobalCollect platform</li><li>The maximum length for paymentProductId 1503 (Boleto) is AN2 for payments that are processed by the GlobalCollect platform</li><li>The maximum length is 3 for payments that are processed by the WL Online Payment Acceptance platform</li></ul>
     */
    public void setStateCode(String value) {
        this.stateCode = value;
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
     * Zip code<br>
     * Note: For payments with product 1503 the maximum length is not 10 but 8.
     */
    public String getZip() {
        return zip;
    }

    /**
     * Zip code<br>
     * Note: For payments with product 1503 the maximum length is not 10 but 8.
     */
    public void setZip(String value) {
        this.zip = value;
    }
}
