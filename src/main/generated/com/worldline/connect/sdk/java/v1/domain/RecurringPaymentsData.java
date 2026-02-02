/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * The object containing reference data for the text that can be displayed on MyCheckout hosted payment page with subscription information.<br><br>Note:<br><br>The data in this object is only meant for displaying recurring payments-related data on your checkout page.<br>You still need to submit all the recurring payment-related data in the corresponding payment product-specific input. (example: cardPaymentMethodSpecificInput.recurring and cardPaymentMethodSpecificInput.isRecurring)
 */
public class RecurringPaymentsData {

    private PaymentProduct302SpecificInput paymentProduct302SpecificInput;

    private String recurringEndDate;

    private Frequency recurringInterval;

    private String recurringStartDate;

    private TrialInformation trialInformation;

    /**
     * The object containing information specific to Apple Pay
     */
    public PaymentProduct302SpecificInput getPaymentProduct302SpecificInput() {
        return paymentProduct302SpecificInput;
    }

    /**
     * The object containing information specific to Apple Pay
     */
    public void setPaymentProduct302SpecificInput(PaymentProduct302SpecificInput value) {
        this.paymentProduct302SpecificInput = value;
    }

    /**
     * The date that the recurring payment ends in YYYYMMDD format.
     */
    public String getRecurringEndDate() {
        return recurringEndDate;
    }

    /**
     * The date that the recurring payment ends in YYYYMMDD format.
     */
    public void setRecurringEndDate(String value) {
        this.recurringEndDate = value;
    }

    /**
     * The object containing the frequency and interval between recurring payments.
     */
    public Frequency getRecurringInterval() {
        return recurringInterval;
    }

    /**
     * The object containing the frequency and interval between recurring payments.
     */
    public void setRecurringInterval(Frequency value) {
        this.recurringInterval = value;
    }

    /**
     * The date that the first recurring payment starts in YYYYMMDD format.
     */
    public String getRecurringStartDate() {
        return recurringStartDate;
    }

    /**
     * The date that the first recurring payment starts in YYYYMMDD format.
     */
    public void setRecurringStartDate(String value) {
        this.recurringStartDate = value;
    }

    /**
     * The object containing data of the trial period: no-cost or discounted time-constrained trial subscription period. 
     */
    public TrialInformation getTrialInformation() {
        return trialInformation;
    }

    /**
     * The object containing data of the trial period: no-cost or discounted time-constrained trial subscription period. 
     */
    public void setTrialInformation(TrialInformation value) {
        this.trialInformation = value;
    }
}
