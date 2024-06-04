/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class NonSepaDirectDebitPaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

    private String dateCollect;

    private String directDebitText;

    private Boolean isRecurring;

    private NonSepaDirectDebitPaymentProduct705SpecificInput paymentProduct705SpecificInput;

    private NonSepaDirectDebitPaymentProduct730SpecificInput paymentProduct730SpecificInput;

    private String recurringPaymentSequenceIndicator;

    private Boolean requiresApproval;

    private String token;

    private Boolean tokenize;

    /**
     * Direct Debit payment collection date<br>
     * Format: YYYYMMDD
     */
    public String getDateCollect() {
        return dateCollect;
    }

    /**
     * Direct Debit payment collection date<br>
     * Format: YYYYMMDD
     */
    public void setDateCollect(String value) {
        this.dateCollect = value;
    }

    /**
     * Descriptor intended to identify the transaction on the customer's bank statement
     */
    public String getDirectDebitText() {
        return directDebitText;
    }

    /**
     * Descriptor intended to identify the transaction on the customer's bank statement
     */
    public void setDirectDebitText(String value) {
        this.directDebitText = value;
    }

    /**
     * Indicates if this transaction is of a one-off or a recurring type
     * <ul class="paragraph-width"><li>true - This is recurring
     * <li>false - This is one-off
     * </ul>
     */
    public Boolean getIsRecurring() {
        return isRecurring;
    }

    /**
     * Indicates if this transaction is of a one-off or a recurring type
     * <ul class="paragraph-width"><li>true - This is recurring
     * <li>false - This is one-off
     * </ul>
     */
    public void setIsRecurring(Boolean value) {
        this.isRecurring = value;
    }

    /**
     * Object containing UK Direct Debit specific details
     */
    public NonSepaDirectDebitPaymentProduct705SpecificInput getPaymentProduct705SpecificInput() {
        return paymentProduct705SpecificInput;
    }

    /**
     * Object containing UK Direct Debit specific details
     */
    public void setPaymentProduct705SpecificInput(NonSepaDirectDebitPaymentProduct705SpecificInput value) {
        this.paymentProduct705SpecificInput = value;
    }

    /**
     * Object containing ACH specific details
     */
    public NonSepaDirectDebitPaymentProduct730SpecificInput getPaymentProduct730SpecificInput() {
        return paymentProduct730SpecificInput;
    }

    /**
     * Object containing ACH specific details
     */
    public void setPaymentProduct730SpecificInput(NonSepaDirectDebitPaymentProduct730SpecificInput value) {
        this.paymentProduct730SpecificInput = value;
    }

    /**
     * <ul class="paragraph-width"><li>first = This transaction is the first of a series of recurring transactions
     * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions
     * <li>last = This transaction is the last transaction of a series of recurring transactions
     * </ul>
     */
    public String getRecurringPaymentSequenceIndicator() {
        return recurringPaymentSequenceIndicator;
    }

    /**
     * <ul class="paragraph-width"><li>first = This transaction is the first of a series of recurring transactions
     * <li>recurring = This transaction is a subsequent transaction in a series of recurring transactions
     * <li>last = This transaction is the last transaction of a series of recurring transactions
     * </ul>
     */
    public void setRecurringPaymentSequenceIndicator(String value) {
        this.recurringPaymentSequenceIndicator = value;
    }

    /**
     * <ul class="paragraph-width"><li>true - The payment requires approval before the funds will be captured using the Approve payment or Capture payment API.
     * <li>false - The payment does not require approval, and the funds will be captured automatically.
     * </ul>
     */
    public Boolean getRequiresApproval() {
        return requiresApproval;
    }

    /**
     * <ul class="paragraph-width"><li>true - The payment requires approval before the funds will be captured using the Approve payment or Capture payment API.
     * <li>false - The payment does not require approval, and the funds will be captured automatically.
     * </ul>
     */
    public void setRequiresApproval(Boolean value) {
        this.requiresApproval = value;
    }

    /**
     * ID of the stored token that contains the bank account details to be debited
     */
    public String getToken() {
        return token;
    }

    /**
     * ID of the stored token that contains the bank account details to be debited
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Indicates if this transaction should be tokenized
     * <ul class="paragraph-width"><li>true - Tokenize the transaction
     * <li>false - Do not tokenize the transaction, unless it would be tokenized by other means such as auto-tokenization of recurring payments.
     * </ul>
     */
    public Boolean getTokenize() {
        return tokenize;
    }

    /**
     * Indicates if this transaction should be tokenized
     * <ul class="paragraph-width"><li>true - Tokenize the transaction
     * <li>false - Do not tokenize the transaction, unless it would be tokenized by other means such as auto-tokenization of recurring payments.
     * </ul>
     */
    public void setTokenize(Boolean value) {
        this.tokenize = value;
    }
}
