/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MandateSepaDirectDebitWithoutCreditor {

    private BankAccountIban bankAccountIban;

    private String customerContractIdentifier;

    private Debtor debtor;

    private Boolean isRecurring;

    private MandateApproval mandateApproval;

    private String preNotification;

    /**
     * Object containing Account holder and IBAN information
     */
    public BankAccountIban getBankAccountIban() {
        return bankAccountIban;
    }

    /**
     * Object containing Account holder and IBAN information
     */
    public void setBankAccountIban(BankAccountIban value) {
        this.bankAccountIban = value;
    }

    /**
     * Identifies the contract between customer and merchant
     */
    public String getCustomerContractIdentifier() {
        return customerContractIdentifier;
    }

    /**
     * Identifies the contract between customer and merchant
     */
    public void setCustomerContractIdentifier(String value) {
        this.customerContractIdentifier = value;
    }

    /**
     * Object containing information on the debtor
     */
    public Debtor getDebtor() {
        return debtor;
    }

    /**
     * Object containing information on the debtor
     */
    public void setDebtor(Debtor value) {
        this.debtor = value;
    }

    /**
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public Boolean getIsRecurring() {
        return isRecurring;
    }

    /**
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public void setIsRecurring(Boolean value) {
        this.isRecurring = value;
    }

    /**
     * Object containing the details of the mandate approval
     */
    public MandateApproval getMandateApproval() {
        return mandateApproval;
    }

    /**
     * Object containing the details of the mandate approval
     */
    public void setMandateApproval(MandateApproval value) {
        this.mandateApproval = value;
    }

    /**
     * Indicates whether a pre-notification should be sent to the customer.<br>
     * <ul class="paragraph-width">
     * <li>do-not-send - Do not send a pre-notification
     * <li>send-on-first-collection - Send a pre-notification
     * </ul>
     */
    public String getPreNotification() {
        return preNotification;
    }

    /**
     * Indicates whether a pre-notification should be sent to the customer.<br>
     * <ul class="paragraph-width">
     * <li>do-not-send - Do not send a pre-notification
     * <li>send-on-first-collection - Send a pre-notification
     * </ul>
     */
    public void setPreNotification(String value) {
        this.preNotification = value;
    }
}
