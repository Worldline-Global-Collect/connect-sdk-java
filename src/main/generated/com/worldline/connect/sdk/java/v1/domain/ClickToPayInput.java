/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object holding data that is required to process card transaction with Click to Pay.
 */
public class ClickToPayInput {

    private String checkoutResponseSignature;

    /**
     * The checkoutResponseSignature is a token (JWS) that signs the Checkout response returned by the SRC System after a successful Click to Pay payment. It is used to call the Click to Pay SRCI Server Payload API.
     */
    public String getCheckoutResponseSignature() {
        return checkoutResponseSignature;
    }

    /**
     * The checkoutResponseSignature is a token (JWS) that signs the Checkout response returned by the SRC System after a successful Click to Pay payment. It is used to call the Click to Pay SRCI Server Payload API.
     */
    public void setCheckoutResponseSignature(String value) {
        this.checkoutResponseSignature = value;
    }
}
