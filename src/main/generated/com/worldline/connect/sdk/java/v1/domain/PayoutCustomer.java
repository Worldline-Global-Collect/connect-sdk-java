/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class PayoutCustomer {

    private Address address;

    private CompanyInformation companyInformation;

    private ContactDetailsBase contactDetails;

    private String merchantCustomerId;

    private PersonalName name;

    /**
     * Object containing address details
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Object containing address details
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Object containing company information
     */
    public CompanyInformation getCompanyInformation() {
        return companyInformation;
    }

    /**
     * Object containing company information
     */
    public void setCompanyInformation(CompanyInformation value) {
        this.companyInformation = value;
    }

    /**
     * Object containing contact details like email address and phone number
     */
    public ContactDetailsBase getContactDetails() {
        return contactDetails;
    }

    /**
     * Object containing contact details like email address and phone number
     */
    public void setContactDetails(ContactDetailsBase value) {
        this.contactDetails = value;
    }

    /**
     * Your identifier for the customer. It can be used as a search criteria in the GlobalCollect Payment Console and is also included in the GlobalCollect report files. It is used in the fraud-screening process for payments on the Ogone Payment Platform.
     */
    public String getMerchantCustomerId() {
        return merchantCustomerId;
    }

    /**
     * Your identifier for the customer. It can be used as a search criteria in the GlobalCollect Payment Console and is also included in the GlobalCollect report files. It is used in the fraud-screening process for payments on the Ogone Payment Platform.
     */
    public void setMerchantCustomerId(String value) {
        this.merchantCustomerId = value;
    }

    /**
     * Object containing PersonalName object
     */
    public PersonalName getName() {
        return name;
    }

    /**
     * Object containing PersonalName object
     */
    public void setName(PersonalName value) {
        this.name = value;
    }
}
