/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MobilePaymentProduct320SpecificInput {

    private String cardholderName;

    private GPayThreeDSecure threeDSecure;

    /**
     * The card holder's name on the card. Minimum length of 2, maximum length of 51 characters.<br>
     * The encrypted payment data can be found in property paymentMethodData.tokenizationData.info.billingAddress.name of the <a href="https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentData">PaymentData</a>.toJson() result.
     */
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * The card holder's name on the card. Minimum length of 2, maximum length of 51 characters.<br>
     * The encrypted payment data can be found in property paymentMethodData.tokenizationData.info.billingAddress.name of the <a href="https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentData">PaymentData</a>.toJson() result.
     */
    public void setCardholderName(String value) {
        this.cardholderName = value;
    }

    /**
     * Object containing specific data regarding 3-D Secure
     */
    public GPayThreeDSecure getThreeDSecure() {
        return threeDSecure;
    }

    /**
     * Object containing specific data regarding 3-D Secure
     */
    public void setThreeDSecure(GPayThreeDSecure value) {
        this.threeDSecure = value;
    }
}
