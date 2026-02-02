/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MobilePaymentMethodSpecificInput extends AbstractMobilePaymentMethodSpecificInput {

    private DecryptedPaymentData decryptedPaymentData;

    private String encryptedPaymentData;

    private Boolean isRecurring;

    private String merchantInitiatedReasonIndicator;

    private MobilePaymentProduct320SpecificInput paymentProduct320SpecificInput;

    /**
     * The payment data if you do the decryption of the encrypted payment data yourself.
     */
    public DecryptedPaymentData getDecryptedPaymentData() {
        return decryptedPaymentData;
    }

    /**
     * The payment data if you do the decryption of the encrypted payment data yourself.
     */
    public void setDecryptedPaymentData(DecryptedPaymentData value) {
        this.decryptedPaymentData = value;
    }

    /**
     * The payment data if we will do the decryption of the encrypted payment data.<br>
     * <p>Typically you'd use encryptedCustomerInput in the root of the create payment request to provide the encrypted payment data instead.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, the encrypted payment data is the <a href="https://developer.apple.com/documentation/passkit/pkpayment" target="_blank">PKPayment</a>.token.paymentData object passed as a string (with all quotation marks escaped).
     * <li>For Google Pay, the encrypted payment data can be found in property paymentMethodData.tokenizationData.token of the <a href="https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentData" target="_blank">PaymentData</a>.toJson() result.
     * </ul>
     */
    public String getEncryptedPaymentData() {
        return encryptedPaymentData;
    }

    /**
     * The payment data if we will do the decryption of the encrypted payment data.<br>
     * <p>Typically you'd use encryptedCustomerInput in the root of the create payment request to provide the encrypted payment data instead.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, the encrypted payment data is the <a href="https://developer.apple.com/documentation/passkit/pkpayment" target="_blank">PKPayment</a>.token.paymentData object passed as a string (with all quotation marks escaped).
     * <li>For Google Pay, the encrypted payment data can be found in property paymentMethodData.tokenizationData.token of the <a href="https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentData" target="_blank">PaymentData</a>.toJson() result.
     * </ul>
     */
    public void setEncryptedPaymentData(String value) {
        this.encryptedPaymentData = value;
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
     * Indicates reason behind the merchant initiated transaction. These are industry specific.<br>
     * Possible values:
     * <ul class="paragraph-width"><li>delayedCharges - Delayed charges are performed to process a supplemental account charge after original services have been rendered and respective payment has been processed. This is typically used in hotel, cruise lines and vehicle rental environments to perform a supplemental payment after the original services are rendered.</li>
     * <li>noShow - Cardholders can use their cards to make a guaranteed reservation with certain merchant segments. A guaranteed reservation ensures that the reservation will be honored and allows a merchant to perform a No Show transaction to charge the cardholder a penalty according to the merchant’s cancellation policy. For merchants that accept token-based payment credentials to guarantee a reservation, it is necessary to perform a customer initiated (Account Verification) at the time of reservation to be able perform a No Show transaction later.</li></ul>
     */
    public String getMerchantInitiatedReasonIndicator() {
        return merchantInitiatedReasonIndicator;
    }

    /**
     * Indicates reason behind the merchant initiated transaction. These are industry specific.<br>
     * Possible values:
     * <ul class="paragraph-width"><li>delayedCharges - Delayed charges are performed to process a supplemental account charge after original services have been rendered and respective payment has been processed. This is typically used in hotel, cruise lines and vehicle rental environments to perform a supplemental payment after the original services are rendered.</li>
     * <li>noShow - Cardholders can use their cards to make a guaranteed reservation with certain merchant segments. A guaranteed reservation ensures that the reservation will be honored and allows a merchant to perform a No Show transaction to charge the cardholder a penalty according to the merchant’s cancellation policy. For merchants that accept token-based payment credentials to guarantee a reservation, it is necessary to perform a customer initiated (Account Verification) at the time of reservation to be able perform a No Show transaction later.</li></ul>
     */
    public void setMerchantInitiatedReasonIndicator(String value) {
        this.merchantInitiatedReasonIndicator = value;
    }

    /**
     * Object containing information specific to Google Pay
     */
    public MobilePaymentProduct320SpecificInput getPaymentProduct320SpecificInput() {
        return paymentProduct320SpecificInput;
    }

    /**
     * Object containing information specific to Google Pay
     */
    public void setPaymentProduct320SpecificInput(MobilePaymentProduct320SpecificInput value) {
        this.paymentProduct320SpecificInput = value;
    }
}
