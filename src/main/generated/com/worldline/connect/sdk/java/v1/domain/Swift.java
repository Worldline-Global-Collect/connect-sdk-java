/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class Swift {

    private String bic;

    private String category;

    private String chipsUID;

    private String extraInfo;

    private String poBoxCountry;

    private String poBoxLocation;

    private String poBoxNumber;

    private String poBoxZip;

    private String routingBic;

    private String services;

    /**
     * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank or even branch. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
     */
    public String getBic() {
        return bic;
    }

    /**
     * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank or even branch. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
     */
    public void setBic(String value) {
        this.bic = value;
    }

    /**
     * SWIFT category
     */
    public String getCategory() {
        return category;
    }

    /**
     * SWIFT category
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Clearing House Interbank Payments System (CHIPS) UID<br>
     * CHIPS is one half of the primary US network of large-value domestic and international payments.
     */
    public String getChipsUID() {
        return chipsUID;
    }

    /**
     * Clearing House Interbank Payments System (CHIPS) UID<br>
     * CHIPS is one half of the primary US network of large-value domestic and international payments.
     */
    public void setChipsUID(String value) {
        this.chipsUID = value;
    }

    /**
     * SWIFT extra information
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * SWIFT extra information
     */
    public void setExtraInfo(String value) {
        this.extraInfo = value;
    }

    /**
     * Institution PO Box country
     */
    public String getPoBoxCountry() {
        return poBoxCountry;
    }

    /**
     * Institution PO Box country
     */
    public void setPoBoxCountry(String value) {
        this.poBoxCountry = value;
    }

    /**
     * Institution PO Box location
     */
    public String getPoBoxLocation() {
        return poBoxLocation;
    }

    /**
     * Institution PO Box location
     */
    public void setPoBoxLocation(String value) {
        this.poBoxLocation = value;
    }

    /**
     * Institution PO Box number
     */
    public String getPoBoxNumber() {
        return poBoxNumber;
    }

    /**
     * Institution PO Box number
     */
    public void setPoBoxNumber(String value) {
        this.poBoxNumber = value;
    }

    /**
     * Institution PO Box ZIP
     */
    public String getPoBoxZip() {
        return poBoxZip;
    }

    /**
     * Institution PO Box ZIP
     */
    public void setPoBoxZip(String value) {
        this.poBoxZip = value;
    }

    /**
     * Payment routing BIC
     */
    public String getRoutingBic() {
        return routingBic;
    }

    /**
     * Payment routing BIC
     */
    public void setRoutingBic(String value) {
        this.routingBic = value;
    }

    /**
     * SWIFT services
     */
    public String getServices() {
        return services;
    }

    /**
     * SWIFT services
     */
    public void setServices(String value) {
        this.services = value;
    }
}
