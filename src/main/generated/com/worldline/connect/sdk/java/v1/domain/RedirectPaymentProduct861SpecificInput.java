/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RedirectPaymentProduct861SpecificInput {

    private Boolean mobileDevice;

    /**
     * This indicates that a customer is on a mobile device and it is used to distinguish whether a customer should be redirected to AliPay Desktop or Mobile. Alternatively, if you cannot determine whether a customer is on a mobile device or not, a customer can be redirected to AliPay Mobile if the property CreatePaymentRequest.order.customer.device.userAgent is supplied.
     */
    public Boolean getMobileDevice() {
        return mobileDevice;
    }

    /**
     * This indicates that a customer is on a mobile device and it is used to distinguish whether a customer should be redirected to AliPay Desktop or Mobile. Alternatively, if you cannot determine whether a customer is on a mobile device or not, a customer can be redirected to AliPay Mobile if the property CreatePaymentRequest.order.customer.device.userAgent is supplied.
     */
    public void setMobileDevice(Boolean value) {
        this.mobileDevice = value;
    }
}
