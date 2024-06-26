/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class DeviceFingerprintDetails {

    private String paymentId;

    private String rawDeviceFingerprintOutput;

    /**
     * The ID of the payment that is linked to the Device Fingerprint data.
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * The ID of the payment that is linked to the Device Fingerprint data.
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * The detailed data that was collected during the Device Fingerprint collection. The structure will be different depending on the collection method and device fingerprint partner used. Please contact us if you want more information on the details that are returned in this string.
     */
    public String getRawDeviceFingerprintOutput() {
        return rawDeviceFingerprintOutput;
    }

    /**
     * The detailed data that was collected during the Device Fingerprint collection. The structure will be different depending on the collection method and device fingerprint partner used. Please contact us if you want more information on the details that are returned in this string.
     */
    public void setRawDeviceFingerprintOutput(String value) {
        this.rawDeviceFingerprintOutput = value;
    }
}
