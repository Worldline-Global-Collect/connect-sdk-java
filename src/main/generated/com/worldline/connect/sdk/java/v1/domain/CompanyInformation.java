/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CompanyInformation {

    private String name;

    private String vatNumber;

    /**
     * Name of company, as a customer
     */
    public String getName() {
        return name;
    }

    /**
     * Name of company, as a customer
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Local VAT number of the company
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * Local VAT number of the company
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }
}
