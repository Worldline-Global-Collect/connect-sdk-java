/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CardEssentials {

    private String cardNumber;

    private String cardholderName;

    private String expiryDate;

    /**
     * The complete credit/debit card number
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * The complete credit/debit card number
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * The card holder's name on the card. Minimum length of 2, maximum length of 51 characters.
     */
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * The card holder's name on the card. Minimum length of 2, maximum length of 51 characters.
     */
    public void setCardholderName(String value) {
        this.cardholderName = value;
    }

    /**
     * Expiry date of the card<br>
     * Format: MMYY
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Expiry date of the card<br>
     * Format: MMYY
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }
}
