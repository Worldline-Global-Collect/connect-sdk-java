/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RefundOutput extends OrderOutput {

    private Long amountPaid;

    private RefundBankMethodSpecificOutput bankRefundMethodSpecificOutput;

    private RefundCardMethodSpecificOutput cardRefundMethodSpecificOutput;

    private RefundCashMethodSpecificOutput cashRefundMethodSpecificOutput;

    private RefundEInvoiceMethodSpecificOutput eInvoiceRefundMethodSpecificOutput;

    private RefundEWalletMethodSpecificOutput eWalletRefundMethodSpecificOutput;

    private RefundMobileMethodSpecificOutput mobileRefundMethodSpecificOutput;

    private String paymentMethod;

    /**
     * Amount paid
     */
    public Long getAmountPaid() {
        return amountPaid;
    }

    /**
     * Amount paid
     */
    public void setAmountPaid(Long value) {
        this.amountPaid = value;
    }

    /**
     * Object containing specific bank refund details
     */
    public RefundBankMethodSpecificOutput getBankRefundMethodSpecificOutput() {
        return bankRefundMethodSpecificOutput;
    }

    /**
     * Object containing specific bank refund details
     */
    public void setBankRefundMethodSpecificOutput(RefundBankMethodSpecificOutput value) {
        this.bankRefundMethodSpecificOutput = value;
    }

    /**
     * Object containing specific card refund details
     */
    public RefundCardMethodSpecificOutput getCardRefundMethodSpecificOutput() {
        return cardRefundMethodSpecificOutput;
    }

    /**
     * Object containing specific card refund details
     */
    public void setCardRefundMethodSpecificOutput(RefundCardMethodSpecificOutput value) {
        this.cardRefundMethodSpecificOutput = value;
    }

    /**
     * Object containing specific cash refund details
     */
    public RefundCashMethodSpecificOutput getCashRefundMethodSpecificOutput() {
        return cashRefundMethodSpecificOutput;
    }

    /**
     * Object containing specific cash refund details
     */
    public void setCashRefundMethodSpecificOutput(RefundCashMethodSpecificOutput value) {
        this.cashRefundMethodSpecificOutput = value;
    }

    /**
     * Object containing specific e-invoice refund details
     */
    public RefundEInvoiceMethodSpecificOutput getEInvoiceRefundMethodSpecificOutput() {
        return eInvoiceRefundMethodSpecificOutput;
    }

    /**
     * Object containing specific e-invoice refund details
     */
    public void setEInvoiceRefundMethodSpecificOutput(RefundEInvoiceMethodSpecificOutput value) {
        this.eInvoiceRefundMethodSpecificOutput = value;
    }

    /**
     * Object containing specific eWallet refund details
     */
    public RefundEWalletMethodSpecificOutput getEWalletRefundMethodSpecificOutput() {
        return eWalletRefundMethodSpecificOutput;
    }

    /**
     * Object containing specific eWallet refund details
     */
    public void setEWalletRefundMethodSpecificOutput(RefundEWalletMethodSpecificOutput value) {
        this.eWalletRefundMethodSpecificOutput = value;
    }

    /**
     * Object containing specific mobile refund details
     */
    public RefundMobileMethodSpecificOutput getMobileRefundMethodSpecificOutput() {
        return mobileRefundMethodSpecificOutput;
    }

    /**
     * Object containing specific mobile refund details
     */
    public void setMobileRefundMethodSpecificOutput(RefundMobileMethodSpecificOutput value) {
        this.mobileRefundMethodSpecificOutput = value;
    }

    /**
     * Payment method identifier used by the our payment engine with the following possible values:
     * <ul class="paragraph-width">
     * <li>bankRefund
     * <li>bankTransfer
     * <li>card
     * <li>cash
     * <li>directDebit
     * <li>eInvoice
     * <li>invoice
     * <li>redirect
     * </ul>
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Payment method identifier used by the our payment engine with the following possible values:
     * <ul class="paragraph-width">
     * <li>bankRefund
     * <li>bankTransfer
     * <li>card
     * <li>cash
     * <li>directDebit
     * <li>eInvoice
     * <li>invoice
     * <li>redirect
     * </ul>
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }
}
