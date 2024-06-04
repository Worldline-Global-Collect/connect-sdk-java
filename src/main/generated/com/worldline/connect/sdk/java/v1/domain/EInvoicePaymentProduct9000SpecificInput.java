/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class EInvoicePaymentProduct9000SpecificInput {

    private BankAccountIban bankAccountIban;

    private String installmentId;

    /**
     * Object containing the bank account details of the customer.
     */
    public BankAccountIban getBankAccountIban() {
        return bankAccountIban;
    }

    /**
     * Object containing the bank account details of the customer.
     */
    public void setBankAccountIban(BankAccountIban value) {
        this.bankAccountIban = value;
    }

    /**
     * The ID of the installment plan selected by the customer. Installment plans can be retrieved with <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/products/get.html">Get payment product</a>.
     */
    public String getInstallmentId() {
        return installmentId;
    }

    /**
     * The ID of the installment plan selected by the customer. Installment plans can be retrieved with <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/products/get.html">Get payment product</a>.
     */
    public void setInstallmentId(String value) {
        this.installmentId = value;
    }
}
