/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class ApprovePayoutRequest {

    private String datePayout = null;

    /**
     * The desired date for the payout<br>
     * Format: YYYYMMDD
     */
    public String getDatePayout() {
        return datePayout;
    }

    /**
     * The desired date for the payout<br>
     * Format: YYYYMMDD
     */
    public void setDatePayout(String value) {
        this.datePayout = value;
    }
}
