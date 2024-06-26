/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * PayPal account details
 */
public class RefundPaymentProduct840CustomerAccount {

    private String customerAccountStatus;

    private String customerAddressStatus;

    private String payerId;

    /**
     * Status of the PayPal account.<br>
     * Possible values are:
     * <ul class="paragraph-width"><li>verified - PayPal has verified the funding means for this account
     * <li>unverified - PayPal has not verified the funding means for this account
     * </ul>
     */
    public String getCustomerAccountStatus() {
        return customerAccountStatus;
    }

    /**
     * Status of the PayPal account.<br>
     * Possible values are:
     * <ul class="paragraph-width"><li>verified - PayPal has verified the funding means for this account
     * <li>unverified - PayPal has not verified the funding means for this account
     * </ul>
     */
    public void setCustomerAccountStatus(String value) {
        this.customerAccountStatus = value;
    }

    /**
     * Status of the customer's shipping address as registered by PayPal<br>
     * Possible values are:
     * <ul class="paragraph-width"><li>none - Status is unknown at PayPal
     * <li>confirmed - The address has been confirmed
     * <li>unconfirmed - The address has not been confirmed
     * </ul>
     */
    public String getCustomerAddressStatus() {
        return customerAddressStatus;
    }

    /**
     * Status of the customer's shipping address as registered by PayPal<br>
     * Possible values are:
     * <ul class="paragraph-width"><li>none - Status is unknown at PayPal
     * <li>confirmed - The address has been confirmed
     * <li>unconfirmed - The address has not been confirmed
     * </ul>
     */
    public void setCustomerAddressStatus(String value) {
        this.customerAddressStatus = value;
    }

    /**
     * The unique identifier of a PayPal account and will never change in the life cycle of a PayPal account
     */
    public String getPayerId() {
        return payerId;
    }

    /**
     * The unique identifier of a PayPal account and will never change in the life cycle of a PayPal account
     */
    public void setPayerId(String value) {
        this.payerId = value;
    }
}
