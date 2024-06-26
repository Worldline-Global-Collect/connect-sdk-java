/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class ContactDetails extends ContactDetailsBase {

    private String faxNumber;

    private String mobilePhoneNumber;

    private String phoneNumber;

    private String workPhoneNumber;

    /**
     * Fax number of the customer
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Fax number of the customer
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * International version of the mobile phone number of the customer including the leading + (i.e. +16127779311).
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * International version of the mobile phone number of the customer including the leading + (i.e. +16127779311).
     */
    public void setMobilePhoneNumber(String value) {
        this.mobilePhoneNumber = value;
    }

    /**
     * Phone number of the customer. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Phone number of the customer. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * International version of the work phone number of the customer including the leading + (i.e. +31235671500)
     */
    public String getWorkPhoneNumber() {
        return workPhoneNumber;
    }

    /**
     * International version of the work phone number of the customer including the leading + (i.e. +31235671500)
     */
    public void setWorkPhoneNumber(String value) {
        this.workPhoneNumber = value;
    }
}
