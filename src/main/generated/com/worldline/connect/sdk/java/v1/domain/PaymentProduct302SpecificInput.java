/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class PaymentProduct302SpecificInput {

    private AutomaticReloadBillingDetails automaticReloadBilling;

    private String billingAgreement;

    private DeferredBillingDetails deferredBilling;

    private String managementUrl;

    private String paymentDescription;

    private RecurringBillingDetails regularBilling;

    private String tokenNotificationUrl;

    private RecurringBillingDetails trialBilling;

    /**
     * An object that contains the reload amount and balance threshold for the automatic reload payment.
     */
    public AutomaticReloadBillingDetails getAutomaticReloadBilling() {
        return automaticReloadBilling;
    }

    /**
     * An object that contains the reload amount and balance threshold for the automatic reload payment.
     */
    public void setAutomaticReloadBilling(AutomaticReloadBillingDetails value) {
        this.automaticReloadBilling = value;
    }

    /**
     * A localized description shown to inform the user about the billing terms before authorization. It can include details or conditions of payment, and may describe how customer can cancel payments. 
     */
    public String getBillingAgreement() {
        return billingAgreement;
    }

    /**
     * A localized description shown to inform the user about the billing terms before authorization. It can include details or conditions of payment, and may describe how customer can cancel payments. 
     */
    public void setBillingAgreement(String value) {
        this.billingAgreement = value;
    }

    /**
     * An object that contains details about the deferred payment.
     */
    public DeferredBillingDetails getDeferredBilling() {
        return deferredBilling;
    }

    /**
     * An object that contains details about the deferred payment.
     */
    public void setDeferredBilling(DeferredBillingDetails value) {
        this.deferredBilling = value;
    }

    /**
     * A URL to a web page where the customer can update or delete the payment method for the recurring, deferred or automatic reload payment made with Apple Pay.
     */
    public String getManagementUrl() {
        return managementUrl;
    }

    /**
     * A URL to a web page where the customer can update or delete the payment method for the recurring, deferred or automatic reload payment made with Apple Pay.
     */
    public void setManagementUrl(String value) {
        this.managementUrl = value;
    }

    /**
     * The description of the payment used to identify the transaction purpose.
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * The description of the payment used to identify the transaction purpose.
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * An object that contains the regular billing cycle for the recurring payment, including start and end dates, an interval, and an interval count.
     */
    public RecurringBillingDetails getRegularBilling() {
        return regularBilling;
    }

    /**
     * An object that contains the regular billing cycle for the recurring payment, including start and end dates, an interval, and an interval count.
     */
    public void setRegularBilling(RecurringBillingDetails value) {
        this.regularBilling = value;
    }

    /**
     * A URL you provide to receive life-cycle notifications from the Apple Pay servers about the Apple Pay merchant token for the recurring payment. 
     */
    public String getTokenNotificationUrl() {
        return tokenNotificationUrl;
    }

    /**
     * A URL you provide to receive life-cycle notifications from the Apple Pay servers about the Apple Pay merchant token for the recurring payment. 
     */
    public void setTokenNotificationUrl(String value) {
        this.tokenNotificationUrl = value;
    }

    /**
     * An object that contains the trial billing cycle for the recurring payment.
     */
    public RecurringBillingDetails getTrialBilling() {
        return trialBilling;
    }

    /**
     * An object that contains the trial billing cycle for the recurring payment.
     */
    public void setTrialBilling(RecurringBillingDetails value) {
        this.trialBilling = value;
    }
}
