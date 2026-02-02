/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * An object that contains details about the deferred payment.
 */
public class DeferredBillingDetails extends BaseBillingDetails {

    private String deferredPaymentDate;

    private String freeCancellationDate;

    private String freeCancellationDateTimeZone;

    /**
     * The date of the payment in in YYYYMMDD format that will take place in the future.
     */
    public String getDeferredPaymentDate() {
        return deferredPaymentDate;
    }

    /**
     * The date of the payment in in YYYYMMDD format that will take place in the future.
     */
    public void setDeferredPaymentDate(String value) {
        this.deferredPaymentDate = value;
    }

    /**
     * The date until which customers can cancel their recurring payment without charges in YYYYMMDDHH24MISS format.
     */
    public String getFreeCancellationDate() {
        return freeCancellationDate;
    }

    /**
     * The date until which customers can cancel their recurring payment without charges in YYYYMMDDHH24MISS format.
     */
    public void setFreeCancellationDate(String value) {
        this.freeCancellationDate = value;
    }

    /**
     * The IANA timezone identifier that provides the correct local context for interpreting the free cancellation deadline displayed on the payment sheet.
     */
    public String getFreeCancellationDateTimeZone() {
        return freeCancellationDateTimeZone;
    }

    /**
     * The IANA timezone identifier that provides the correct local context for interpreting the free cancellation deadline displayed on the payment sheet.
     */
    public void setFreeCancellationDateTimeZone(String value) {
        this.freeCancellationDateTimeZone = value;
    }
}
