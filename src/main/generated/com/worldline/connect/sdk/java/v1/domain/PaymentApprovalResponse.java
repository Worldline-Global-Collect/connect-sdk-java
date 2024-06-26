/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class PaymentApprovalResponse {

    private ApprovePaymentCardPaymentMethodSpecificOutput cardPaymentMethodSpecificOutput;

    private ApprovePaymentMobilePaymentMethodSpecificOutput mobilePaymentMethodSpecificOutput;

    private Payment payment;

    private ApprovePaymentCardPaymentMethodSpecificOutput paymentMethodSpecificOutput;

    /**
     * Object containing additional card payment method specific details
     */
    public ApprovePaymentCardPaymentMethodSpecificOutput getCardPaymentMethodSpecificOutput() {
        return cardPaymentMethodSpecificOutput;
    }

    /**
     * Object containing additional card payment method specific details
     */
    public void setCardPaymentMethodSpecificOutput(ApprovePaymentCardPaymentMethodSpecificOutput value) {
        this.cardPaymentMethodSpecificOutput = value;
    }

    /**
     * Object containing additional mobile payment method specific details
     */
    public ApprovePaymentMobilePaymentMethodSpecificOutput getMobilePaymentMethodSpecificOutput() {
        return mobilePaymentMethodSpecificOutput;
    }

    /**
     * Object containing additional mobile payment method specific details
     */
    public void setMobilePaymentMethodSpecificOutput(ApprovePaymentMobilePaymentMethodSpecificOutput value) {
        this.mobilePaymentMethodSpecificOutput = value;
    }

    /**
     * Object that holds the payment data
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * Object that holds the payment data
     */
    public void setPayment(Payment value) {
        this.payment = value;
    }

    /**
     * Object containing additional payment method specific details<br>
     * Deprecated: this property does not support different outputs for payment methods other than cards. Please use cardPaymentMethodSpecificOutput instead.
     *
     * @deprecated Use cardPaymentMethodSpecificOutput instead
     */
    @Deprecated
    public ApprovePaymentCardPaymentMethodSpecificOutput getPaymentMethodSpecificOutput() {
        return paymentMethodSpecificOutput;
    }

    /**
     * Object containing additional payment method specific details<br>
     * Deprecated: this property does not support different outputs for payment methods other than cards. Please use cardPaymentMethodSpecificOutput instead.
     *
     * @deprecated Use cardPaymentMethodSpecificOutput instead
     */
    @Deprecated
    public void setPaymentMethodSpecificOutput(ApprovePaymentCardPaymentMethodSpecificOutput value) {
        this.paymentMethodSpecificOutput = value;
    }
}
