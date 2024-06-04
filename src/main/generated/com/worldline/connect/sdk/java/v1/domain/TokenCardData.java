/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class TokenCardData {

    private CardWithoutCvv cardWithoutCvv;

    private String firstTransactionDate;

    private String providerReference;

    /**
     * Object containing the card details (without CVV)
     */
    public CardWithoutCvv getCardWithoutCvv() {
        return cardWithoutCvv;
    }

    /**
     * Object containing the card details (without CVV)
     */
    public void setCardWithoutCvv(CardWithoutCvv value) {
        this.cardWithoutCvv = value;
    }

    /**
     * Date of the first transaction (for ATOS)<br>
     * Format: YYYYMMDD
     */
    public String getFirstTransactionDate() {
        return firstTransactionDate;
    }

    /**
     * Date of the first transaction (for ATOS)<br>
     * Format: YYYYMMDD
     */
    public void setFirstTransactionDate(String value) {
        this.firstTransactionDate = value;
    }

    /**
     * Reference of the provider (of the first transaction) - used to store the ATOS Transaction Certificate
     */
    public String getProviderReference() {
        return providerReference;
    }

    /**
     * Reference of the provider (of the first transaction) - used to store the ATOS Transaction Certificate
     */
    public void setProviderReference(String value) {
        this.providerReference = value;
    }
}
