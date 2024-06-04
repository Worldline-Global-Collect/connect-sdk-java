/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class DeviceFingerprintRequest {

    private String collectorCallback;

    /**
     * You can supply a JavaScript function call that will be called after the device fingerprint data collecting using the provided JavaScript snippet is finished. This will then be added to the snippet that is returned in the property html.
     */
    public String getCollectorCallback() {
        return collectorCallback;
    }

    /**
     * You can supply a JavaScript function call that will be called after the device fingerprint data collecting using the provided JavaScript snippet is finished. This will then be added to the snippet that is returned in the property html.
     */
    public void setCollectorCallback(String value) {
        this.collectorCallback = value;
    }
}
