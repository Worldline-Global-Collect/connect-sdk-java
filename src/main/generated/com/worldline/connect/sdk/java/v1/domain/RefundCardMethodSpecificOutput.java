/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RefundCardMethodSpecificOutput extends RefundMethodSpecificOutput {

    private String authorisationCode;

    private CardEssentials card;

    /**
     * Card Authorization code as returned by the acquirer
     */
    public String getAuthorisationCode() {
        return authorisationCode;
    }

    /**
     * Card Authorization code as returned by the acquirer
     */
    public void setAuthorisationCode(String value) {
        this.authorisationCode = value;
    }

    /**
     * Object containing card details
     */
    public CardEssentials getCard() {
        return card;
    }

    /**
     * Object containing card details
     */
    public void setCard(CardEssentials value) {
        this.card = value;
    }
}
