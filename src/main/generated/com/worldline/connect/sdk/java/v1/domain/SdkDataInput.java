/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class SdkDataInput {

    private DeviceRenderOptions deviceRenderOptions = null;

    private String sdkAppId = null;

    private String sdkEncryptedData = null;

    private String sdkEphemeralPublicKey = null;

    private String sdkMaxTimeout = null;

    private String sdkReferenceNumber = null;

    private String sdkTransactionId = null;

    /**
     * Object containing rendering options of the device.
     */
    public DeviceRenderOptions getDeviceRenderOptions() {
        return deviceRenderOptions;
    }

    /**
     * Object containing rendering options of the device.
     */
    public void setDeviceRenderOptions(DeviceRenderOptions value) {
        this.deviceRenderOptions = value;
    }

    /**
     * Universally unique ID created upon all installations and updates of your app on a c Device. This will be newly generated and stored by the 3DS SDK for each installation or update
     */
    public String getSdkAppId() {
        return sdkAppId;
    }

    /**
     * Universally unique ID created upon all installations and updates of your app on a c Device. This will be newly generated and stored by the 3DS SDK for each installation or update
     */
    public void setSdkAppId(String value) {
        this.sdkAppId = value;
    }

    /**
     * JWE Object containing data encrypted by the 3-D Secure SDK
     */
    public String getSdkEncryptedData() {
        return sdkEncryptedData;
    }

    /**
     * JWE Object containing data encrypted by the 3-D Secure SDK
     */
    public void setSdkEncryptedData(String value) {
        this.sdkEncryptedData = value;
    }

    /**
     * Public key component of the ephemeral key pair generated by the 3-D Secure SDK and used to establish session keys between the 3-D Secure SDK and ACS.
     */
    public String getSdkEphemeralPublicKey() {
        return sdkEphemeralPublicKey;
    }

    /**
     * Public key component of the ephemeral key pair generated by the 3-D Secure SDK and used to establish session keys between the 3-D Secure SDK and ACS.
     */
    public void setSdkEphemeralPublicKey(String value) {
        this.sdkEphemeralPublicKey = value;
    }

    /**
     * Indicates maximum amount of time (in minutes) for all exchanges. Minimum amount of minutes is 5.
     */
    public String getSdkMaxTimeout() {
        return sdkMaxTimeout;
    }

    /**
     * Indicates maximum amount of time (in minutes) for all exchanges. Minimum amount of minutes is 5.
     */
    public void setSdkMaxTimeout(String value) {
        this.sdkMaxTimeout = value;
    }

    /**
     * Identifies the vendor and version for the 3-D Secure SDK that is integrated in your app, assigned by EMVCo when the 3-D Secure SDK is approved.
     */
    public String getSdkReferenceNumber() {
        return sdkReferenceNumber;
    }

    /**
     * Identifies the vendor and version for the 3-D Secure SDK that is integrated in your app, assigned by EMVCo when the 3-D Secure SDK is approved.
     */
    public void setSdkReferenceNumber(String value) {
        this.sdkReferenceNumber = value;
    }

    /**
     * Universally unique transaction identifier assigned by the 3-D Secure SDK to identify a single transaction.
     */
    public String getSdkTransactionId() {
        return sdkTransactionId;
    }

    /**
     * Universally unique transaction identifier assigned by the 3-D Secure SDK to identify a single transaction.
     */
    public void setSdkTransactionId(String value) {
        this.sdkTransactionId = value;
    }
}
