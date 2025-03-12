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
     * The first 2 digits of the card's PIN code. May be optionally submitted for the following payment products:
     * <ul class="paragraph-width"><li>BC Card (paymentProductId 180)</li>
     * <li>Hana Card (paymentProductId 181)</li>
     * <li>Hyundai Card (paymentProductId 182)</li>
     * <li>KB Card (paymentProductId 183)</li>
     * <li>Lotte Card (paymentProductId 184)</li>
     * <li>NH Card (paymentProductId 185)</li>
     * <li>Samsung Card (paymentProductId 186)</li>
     * <li>Shinhan Card (paymentProductId 187)</li></ul>
     * Submitting this property may improve your authorization rate.
     */
    public String getPartialPin() {
        return partialPin;
    }

    /**
     * The first 2 digits of the card's PIN code. May be optionally submitted for the following payment products:
     * <ul class="paragraph-width"><li>BC Card (paymentProductId 180)</li>
     * <li>Hana Card (paymentProductId 181)</li>
     * <li>Hyundai Card (paymentProductId 182)</li>
     * <li>KB Card (paymentProductId 183)</li>
     * <li>Lotte Card (paymentProductId 184)</li>
     * <li>NH Card (paymentProductId 185)</li>
     * <li>Samsung Card (paymentProductId 186)</li>
     * <li>Shinhan Card (paymentProductId 187)</li></ul>
     * Submitting this property may improve your authorization rate.
     */
    public void setPartialPin(String value) {
        this.partialPin = value;
    }
}
