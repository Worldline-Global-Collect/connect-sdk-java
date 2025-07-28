/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CapturePaymentOrderReferences {

    private String merchantCaptureReference;

    /**
     * Your (unique) reference for the capture that you can use to reconcile our report files
     */
    public String getMerchantCaptureReference() {
        return merchantCaptureReference;
    }

    /**
     * Your (unique) reference for the capture that you can use to reconcile our report files
     */
    public void setMerchantCaptureReference(String value) {
        this.merchantCaptureReference = value;
    }
}
