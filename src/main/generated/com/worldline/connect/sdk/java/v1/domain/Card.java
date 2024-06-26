/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class Card extends CardWithoutCvv {

    private String cvv;

    private String partialPin;

    /**
     * Card Verification Value, a 3 or 4 digit code used as an additional security feature for card not present transactions.
     */
    public String getCvv() {
        return cvv;
    }

    /**
     * Card Verification Value, a 3 or 4 digit code used as an additional security feature for card not present transactions.
     */
    public void setCvv(String value) {
        this.cvv = value;
    }

    /**
     * The first 2 digits of the card's PIN code. May be optionally submitted for South Korean cards (paymentProductIds 180, 181, 182, 183, 184, 185 and 186). Submitting this property may improve your authorization rate.
     */
    public String getPartialPin() {
        return partialPin;
    }

    /**
     * The first 2 digits of the card's PIN code. May be optionally submitted for South Korean cards (paymentProductIds 180, 181, 182, 183, 184, 185 and 186). Submitting this property may improve your authorization rate.
     */
    public void setPartialPin(String value) {
        this.partialPin = value;
    }
}
