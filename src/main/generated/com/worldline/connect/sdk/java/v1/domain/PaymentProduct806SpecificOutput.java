/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class PaymentProduct806SpecificOutput {

    private Address billingAddress;

    private TrustlyBankAccount customerAccount;

    /**
     * Object containing the billing address details of the customer
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Object containing the billing address details of the customer
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    /**
     * Object containing the account details
     */
    public TrustlyBankAccount getCustomerAccount() {
        return customerAccount;
    }

    /**
     * Object containing the account details
     */
    public void setCustomerAccount(TrustlyBankAccount value) {
        this.customerAccount = value;
    }
}
