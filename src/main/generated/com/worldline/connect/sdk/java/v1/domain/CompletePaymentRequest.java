/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CompletePaymentRequest {

    private CompletePaymentCardPaymentMethodSpecificInput cardPaymentMethodSpecificInput;

    private Merchant merchant;

    private Order order;

    /**
     * Object containing the specific input details for card payments
     */
    public CompletePaymentCardPaymentMethodSpecificInput getCardPaymentMethodSpecificInput() {
        return cardPaymentMethodSpecificInput;
    }

    /**
     * Object containing the specific input details for card payments
     */
    public void setCardPaymentMethodSpecificInput(CompletePaymentCardPaymentMethodSpecificInput value) {
        this.cardPaymentMethodSpecificInput = value;
    }

    /**
     * Object containing information on you, the merchant
     */
    public Merchant getMerchant() {
        return merchant;
    }

    /**
     * Object containing information on you, the merchant
     */
    public void setMerchant(Merchant value) {
        this.merchant = value;
    }

    /**
     * Order object containing order related data
     */
    public Order getOrder() {
        return order;
    }

    /**
     * Order object containing order related data
     */
    public void setOrder(Order value) {
        this.order = value;
    }
}
