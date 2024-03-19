/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class SdkDataOutput {

    private String sdkTransactionId = null;

    /**
     * Universally unique transaction identifier assigned by the 3-D Secure SDK to identify this transaction.
     */
    public String getSdkTransactionId() {
        return sdkTransactionId;
    }

    /**
     * Universally unique transaction identifier assigned by the 3-D Secure SDK to identify this transaction.
     */
    public void setSdkTransactionId(String value) {
        this.sdkTransactionId = value;
    }
}
