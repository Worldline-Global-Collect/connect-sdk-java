/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AmountOfMoney {

    private Long amount;

    private String currencyCode;

    /**
     * Amount in cents and always having 2 decimals
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Amount in cents and always having 2 decimals
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Three-letter ISO currency code representing the currency for the amount
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Three-letter ISO currency code representing the currency for the amount
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }
}
