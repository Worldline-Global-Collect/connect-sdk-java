/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CardPaymentMethodSpecificInputBase extends AbstractCardPaymentMethodSpecificInput {

    private ThreeDSecureBase threeDSecure;

    /**
     * Object containing specific data regarding 3-D Secure
     */
    public ThreeDSecureBase getThreeDSecure() {
        return threeDSecure;
    }

    /**
     * Object containing specific data regarding 3-D Secure
     */
    public void setThreeDSecure(ThreeDSecureBase value) {
        this.threeDSecure = value;
    }
}
