/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RefundRequest {

    private AmountOfMoney amountOfMoney;

    private BankRefundMethodSpecificInput bankRefundMethodSpecificInput;

    private RefundCustomer customer;

    private String refundDate;

    private String refundReason;

    private RefundReferences refundReferences;

    /**
     * Object containing amount and ISO currency code attributes
     */
    public AmountOfMoney getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * Object containing amount and ISO currency code attributes
     */
    public void setAmountOfMoney(AmountOfMoney value) {
        this.amountOfMoney = value;
    }

    /**
     * Object containing the specific input details for a bank refund
     */
    public BankRefundMethodSpecificInput getBankRefundMethodSpecificInput() {
        return bankRefundMethodSpecificInput;
    }

    /**
     * Object containing the specific input details for a bank refund
     */
    public void setBankRefundMethodSpecificInput(BankRefundMethodSpecificInput value) {
        this.bankRefundMethodSpecificInput = value;
    }

    /**
     * Object containing the details of the customer
     */
    public RefundCustomer getCustomer() {
        return customer;
    }

    /**
     * Object containing the details of the customer
     */
    public void setCustomer(RefundCustomer value) {
        this.customer = value;
    }

    /**
     * Refund date<br>
     * Format: YYYYMMDD
     */
    public String getRefundDate() {
        return refundDate;
    }

    /**
     * Refund date<br>
     * Format: YYYYMMDD
     */
    public void setRefundDate(String value) {
        this.refundDate = value;
    }

    /**
     * <p>The reasons for the refund request. Possible values are:</p>
     *  <ul> 
     * <li>RETURN</li> 
     * <li>CORRECTION</li>
     *  <li>PRE_DISPUTE</li>
     *  <li>SUBSCRIPTION</li>
     *  <li>SERVICE_LATE_CANCELLATION</li>
     *  <li>OTHER</li>
     * </ul>
     */
    public String getRefundReason() {
        return refundReason;
    }

    /**
     * <p>The reasons for the refund request. Possible values are:</p>
     *  <ul> 
     * <li>RETURN</li> 
     * <li>CORRECTION</li>
     *  <li>PRE_DISPUTE</li>
     *  <li>SUBSCRIPTION</li>
     *  <li>SERVICE_LATE_CANCELLATION</li>
     *  <li>OTHER</li>
     * </ul>
     */
    public void setRefundReason(String value) {
        this.refundReason = value;
    }

    /**
     * Object that holds all reference properties that are linked to this refund
     */
    public RefundReferences getRefundReferences() {
        return refundReferences;
    }

    /**
     * Object that holds all reference properties that are linked to this refund
     */
    public void setRefundReferences(RefundReferences value) {
        this.refundReferences = value;
    }
}
