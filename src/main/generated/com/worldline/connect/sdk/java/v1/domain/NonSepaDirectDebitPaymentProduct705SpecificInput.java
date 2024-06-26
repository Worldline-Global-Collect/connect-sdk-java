/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * UK Direct Debit specific input fields
 */
public class NonSepaDirectDebitPaymentProduct705SpecificInput {

    private String authorisationId;

    private BankAccountBban bankAccountBban;

    private String transactionType;

    /**
     * Core reference number for the direct debit instruction in UK
     */
    public String getAuthorisationId() {
        return authorisationId;
    }

    /**
     * Core reference number for the direct debit instruction in UK
     */
    public void setAuthorisationId(String value) {
        this.authorisationId = value;
    }

    /**
     * Object containing account holder name and bank account information
     */
    public BankAccountBban getBankAccountBban() {
        return bankAccountBban;
    }

    /**
     * Object containing account holder name and bank account information
     */
    public void setBankAccountBban(BankAccountBban value) {
        this.bankAccountBban = value;
    }

    /**
     * <ul class="paragraph-width">
     * <li>first-payment - First payment direct debit
     * <li>nth-payment - Direct Debit (n-th payment)
     * <li>re-presented - Re-presented direct debit (after failed attempt)
     * <li>final-payment - Final payment direct debit
     * <li>new-or-reinstated - (zero N) New or reinstated direct debit instruction
     * <li>cancellation - (zero C) Cancellation of direct debit instruction
     * <li>conversion-of-paper-DDI-to-electronic-DDI - (zero S) Conversion of paper DDI to electronic DDI (only used once, when migrating from traditional direct debit to AUDDIS
     * </ul>
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * <ul class="paragraph-width">
     * <li>first-payment - First payment direct debit
     * <li>nth-payment - Direct Debit (n-th payment)
     * <li>re-presented - Re-presented direct debit (after failed attempt)
     * <li>final-payment - Final payment direct debit
     * <li>new-or-reinstated - (zero N) New or reinstated direct debit instruction
     * <li>cancellation - (zero C) Cancellation of direct debit instruction
     * <li>conversion-of-paper-DDI-to-electronic-DDI - (zero S) Conversion of paper DDI to electronic DDI (only used once, when migrating from traditional direct debit to AUDDIS
     * </ul>
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }
}
