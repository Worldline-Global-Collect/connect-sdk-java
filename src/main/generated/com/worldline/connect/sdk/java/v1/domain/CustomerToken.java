/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CustomerToken extends CustomerBase {

    private Address billingAddress;

    private PersonalInformationToken personalInformation;

    /**
     * Object containing the billing address details
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Object containing the billing address details
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    /**
     * Object containing personal information of the customer
     */
    public PersonalInformationToken getPersonalInformation() {
        return personalInformation;
    }

    /**
     * Object containing personal information of the customer
     */
    public void setPersonalInformation(PersonalInformationToken value) {
        this.personalInformation = value;
    }
}
