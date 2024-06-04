/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object containing information on purchased gift card(s)
 */
public class GiftCardPurchase {

    private AmountOfMoney amountOfMoney;

    private Integer numberOfGiftCards;

    /**
     * Object containing information on an amount of money
     */
    public AmountOfMoney getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * Object containing information on an amount of money
     */
    public void setAmountOfMoney(AmountOfMoney value) {
        this.amountOfMoney = value;
    }

    /**
     * Number of gift cards that are purchased through this transaction
     */
    public Integer getNumberOfGiftCards() {
        return numberOfGiftCards;
    }

    /**
     * Number of gift cards that are purchased through this transaction
     */
    public void setNumberOfGiftCards(Integer value) {
        this.numberOfGiftCards = value;
    }
}
