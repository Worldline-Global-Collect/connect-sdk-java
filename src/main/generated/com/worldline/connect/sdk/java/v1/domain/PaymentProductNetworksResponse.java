/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class PaymentProductNetworksResponse {

    private List<String> networks;

    /**
     * Array containing network entries for a payment product. The strings that represent the networks in the array are identical to the strings that the payment product vendors use in their documentation.
     * For instance: "Visa" for <a href="https://developer.apple.com/reference/passkit/pkpaymentnetwork" target="_blank">Apple Pay</a>, and "VISA" for <a href="https://developers.google.com/pay/api/android/reference/object#CardParameters" target="_blank">Google Pay</a>.
     */
    public List<String> getNetworks() {
        return networks;
    }

    /**
     * Array containing network entries for a payment product. The strings that represent the networks in the array are identical to the strings that the payment product vendors use in their documentation.
     * For instance: "Visa" for <a href="https://developer.apple.com/reference/passkit/pkpaymentnetwork" target="_blank">Apple Pay</a>, and "VISA" for <a href="https://developers.google.com/pay/api/android/reference/object#CardParameters" target="_blank">Google Pay</a>.
     */
    public void setNetworks(List<String> value) {
        this.networks = value;
    }
}
