/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CapturePaymentRequest {

    private Long amount;

    private Boolean isFinal;

    /**
     * Here you can specify the amount that you want to capture (specified in cents, where single digit currencies are presumed to have 2 digits).<br>
     * The amount can be lower than the amount that was authorized, but not higher.<br>
     * If left empty, the full amount will be captured and the request will be final.<br>
     * If the full amount is captured, the request will also be final.
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Here you can specify the amount that you want to capture (specified in cents, where single digit currencies are presumed to have 2 digits).<br>
     * The amount can be lower than the amount that was authorized, but not higher.<br>
     * If left empty, the full amount will be captured and the request will be final.<br>
     * If the full amount is captured, the request will also be final.
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * This property indicates whether this will be the final capture of this transaction.
     * The default value for this property is false.
     */
    public Boolean getIsFinal() {
        return isFinal;
    }

    /**
     * This property indicates whether this will be the final capture of this transaction.
     * The default value for this property is false.
     */
    public void setIsFinal(Boolean value) {
        this.isFinal = value;
    }
}
