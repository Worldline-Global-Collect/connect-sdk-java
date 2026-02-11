/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

/**
 * Definition of the details of a single payment product group
 */
public class PaymentProductGroup {

    private List<AccountOnFile> accountsOnFile;

    private Boolean allowsClickToPay;

    private Boolean allowsInstallments;

    private ClickToPayConfiguration clickToPayConfiguration;

    private Boolean deviceFingerprintEnabled;

    private PaymentProductDisplayHints displayHints;

    private List<PaymentProductField> fields;

    private String id;

    /**
     * Only populated in the Client API
     */
    public List<AccountOnFile> getAccountsOnFile() {
        return accountsOnFile;
    }

    /**
     * Only populated in the Client API
     */
    public void setAccountsOnFile(List<AccountOnFile> value) {
        this.accountsOnFile = value;
    }

    /**
     * Indicates if the product supports Click to Pay: 
     * <ul>
     * <li>true - This payment supports Click to Pay</li>
     * <li>false - This payment does not support Click to Pay</li>
     * </ul>
     */
    public Boolean getAllowsClickToPay() {
        return allowsClickToPay;
    }

    /**
     * Indicates if the product supports Click to Pay: 
     * <ul>
     * <li>true - This payment supports Click to Pay</li>
     * <li>false - This payment does not support Click to Pay</li>
     * </ul>
     */
    public void setAllowsClickToPay(Boolean value) {
        this.allowsClickToPay = value;
    }

    /**
     * Indicates if the product supports installments
     * <ul class="paragraph-width">
     * <li>true - This payment supports installments
     * <li>false - This payment does not support installments
     * </ul>
     */
    public Boolean getAllowsInstallments() {
        return allowsInstallments;
    }

    /**
     * Indicates if the product supports installments
     * <ul class="paragraph-width">
     * <li>true - This payment supports installments
     * <li>false - This payment does not support installments
     * </ul>
     */
    public void setAllowsInstallments(Boolean value) {
        this.allowsInstallments = value;
    }

    /**
     * Object containing the configuration parameters for each scheme supporting Click to Pay for the provided country and currency combination. These parameters initialize SRC System SDK for the scheme. This object is only returned for card products with allowsClickToPay set to true.
     */
    public ClickToPayConfiguration getClickToPayConfiguration() {
        return clickToPayConfiguration;
    }

    /**
     * Object containing the configuration parameters for each scheme supporting Click to Pay for the provided country and currency combination. These parameters initialize SRC System SDK for the scheme. This object is only returned for card products with allowsClickToPay set to true.
     */
    public void setClickToPayConfiguration(ClickToPayConfiguration value) {
        this.clickToPayConfiguration = value;
    }

    /**
     * Indicates if device fingerprint is enabled for the product group
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public Boolean getDeviceFingerprintEnabled() {
        return deviceFingerprintEnabled;
    }

    /**
     * Indicates if device fingerprint is enabled for the product group
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public void setDeviceFingerprintEnabled(Boolean value) {
        this.deviceFingerprintEnabled = value;
    }

    /**
     * Object containing display hints like the order of the group when shown in a list, the name of the group and the logo. Note that the order of the group is the lowest order among the payment products that belong to the group.
     */
    public PaymentProductDisplayHints getDisplayHints() {
        return displayHints;
    }

    /**
     * Object containing display hints like the order of the group when shown in a list, the name of the group and the logo. Note that the order of the group is the lowest order among the payment products that belong to the group.
     */
    public void setDisplayHints(PaymentProductDisplayHints value) {
        this.displayHints = value;
    }

    /**
     * Object containing all the fields and their details that are associated with this payment product group. If you are not interested in the these fields you can have us filter them out (using hide=fields in the query-string)
     */
    public List<PaymentProductField> getFields() {
        return fields;
    }

    /**
     * Object containing all the fields and their details that are associated with this payment product group. If you are not interested in the these fields you can have us filter them out (using hide=fields in the query-string)
     */
    public void setFields(List<PaymentProductField> value) {
        this.fields = value;
    }

    /**
     * The ID of the payment product group in our system
     */
    public String getId() {
        return id;
    }

    /**
     * The ID of the payment product group in our system
     */
    public void setId(String value) {
        this.id = value;
    }
}
