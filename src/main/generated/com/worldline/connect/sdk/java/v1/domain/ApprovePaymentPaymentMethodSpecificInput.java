/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class ApprovePaymentPaymentMethodSpecificInput {

    private String dateCollect;

    private String token;

    /**
     * The desired date for the collection<br>
     * Format: YYYYMMDD
     */
    public String getDateCollect() {
        return dateCollect;
    }

    /**
     * The desired date for the collection<br>
     * Format: YYYYMMDD
     */
    public void setDateCollect(String value) {
        this.dateCollect = value;
    }

    /**
     * Token containing tokenized bank account details
     */
    public String getToken() {
        return token;
    }

    /**
     * Token containing tokenized bank account details
     */
    public void setToken(String value) {
        this.token = value;
    }
}
