/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object containing data related to the customer
 */
public class CustomerRiskAssessment {

    private CustomerAccountRiskAssessment account;

    private String accountType;

    private Address billingAddress;

    private ContactDetailsRiskAssessment contactDetails;

    private CustomerDeviceRiskAssessment device;

    private Boolean isPreviousCustomer;

    private String locale;

    private PersonalInformationRiskAssessment personalInformation;

    private AddressPersonal shippingAddress;

    /**
     * Object containing data related to the account the customer has with you
     */
    public CustomerAccountRiskAssessment getAccount() {
        return account;
    }

    /**
     * Object containing data related to the account the customer has with you
     */
    public void setAccount(CustomerAccountRiskAssessment value) {
        this.account = value;
    }

    /**
     * Type of the customer account that is used to place this order. Can have one of the following values:
     * <ul class="paragraph-width"><li>none - The account that was used to place the order is a guest account or no account was used at all
     * <li>created - The customer account was created during this transaction
     * <li>existing - The customer account was an already existing account prior to this transaction</ul>
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Type of the customer account that is used to place this order. Can have one of the following values:
     * <ul class="paragraph-width"><li>none - The account that was used to place the order is a guest account or no account was used at all
     * <li>created - The customer account was created during this transaction
     * <li>existing - The customer account was an already existing account prior to this transaction</ul>
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Object containing billing address details
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Object containing billing address details
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    /**
     * Object containing contact details like email address
     */
    public ContactDetailsRiskAssessment getContactDetails() {
        return contactDetails;
    }

    /**
     * Object containing contact details like email address
     */
    public void setContactDetails(ContactDetailsRiskAssessment value) {
        this.contactDetails = value;
    }

    /**
     * Object containing information on the device and browser of the customer
     */
    public CustomerDeviceRiskAssessment getDevice() {
        return device;
    }

    /**
     * Object containing information on the device and browser of the customer
     */
    public void setDevice(CustomerDeviceRiskAssessment value) {
        this.device = value;
    }

    /**
     * Specifies if the customer has a history of online shopping with the merchant
     * <ul class="paragraph-width">
     * <li>true - The customer is a known returning customer
     * <li>false - The customer is new/unknown customer
     * </ul>
     */
    public Boolean getIsPreviousCustomer() {
        return isPreviousCustomer;
    }

    /**
     * Specifies if the customer has a history of online shopping with the merchant
     * <ul class="paragraph-width">
     * <li>true - The customer is a known returning customer
     * <li>false - The customer is new/unknown customer
     * </ul>
     */
    public void setIsPreviousCustomer(Boolean value) {
        this.isPreviousCustomer = value;
    }

    /**
     * The locale that the customer should be addressed in (for 3rd parties). Note that some 3rd party providers only support the languageCode part of the locale, in those cases we will only use part of the locale provided.
     */
    public String getLocale() {
        return locale;
    }

    /**
     * The locale that the customer should be addressed in (for 3rd parties). Note that some 3rd party providers only support the languageCode part of the locale, in those cases we will only use part of the locale provided.
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * Object containing personal information like name, date of birth and gender
     */
    public PersonalInformationRiskAssessment getPersonalInformation() {
        return personalInformation;
    }

    /**
     * Object containing personal information like name, date of birth and gender
     */
    public void setPersonalInformation(PersonalInformationRiskAssessment value) {
        this.personalInformation = value;
    }

    /**
     * Object containing shipping address details
     *
     * @deprecated Use Order.shipping.address instead
     */
    @Deprecated
    public AddressPersonal getShippingAddress() {
        return shippingAddress;
    }

    /**
     * Object containing shipping address details
     *
     * @deprecated Use Order.shipping.address instead
     */
    @Deprecated
    public void setShippingAddress(AddressPersonal value) {
        this.shippingAddress = value;
    }
}
