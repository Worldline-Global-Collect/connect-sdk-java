/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CardPayoutMethodSpecificInput extends AbstractPayoutMethodSpecificInput {

    private Card card;

    private Integer paymentProductId;

    private PayoutRecipient recipient;

    private String token;

    /**
     * Object containing the card details.
     */
    public Card getCard() {
        return card;
    }

    /**
     * Object containing the card details.
     */
    public void setCard(Card value) {
        this.card = value;
    }

    /**
     * Payment product identifier<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
     */
    public Integer getPaymentProductId() {
        return paymentProductId;
    }

    /**
     * Payment product identifier<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
     */
    public void setPaymentProductId(Integer value) {
        this.paymentProductId = value;
    }

    /**
     * Object containing the details of the recipient of the payout
     */
    public PayoutRecipient getRecipient() {
        return recipient;
    }

    /**
     * Object containing the details of the recipient of the payout
     */
    public void setRecipient(PayoutRecipient value) {
        this.recipient = value;
    }

    /**
     * ID of the token that holds previously stored card data.<br> If both the token and card are provided, then the card takes precedence over the token.
     */
    public String getToken() {
        return token;
    }

    /**
     * ID of the token that holds previously stored card data.<br> If both the token and card are provided, then the card takes precedence over the token.
     */
    public void setToken(String value) {
        this.token = value;
    }
}
