/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * @deprecated No replacement
 */
@Deprecated
public class CashPaymentProduct1503SpecificInput {

    private String returnUrl;

    /**
     * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.<br>
     * Note: The provided URL should be absolute and contain the https:// protocol. IP addresses are not supported, neither localhost. For use on mobile devices a custom protocol can be used in the form of <i>protocol</i>://. This protocol must be registered on the device first.<br>
     * URLs without a protocol will be rejected.
     *
     * @deprecated No replacement, since Boleto Bancario no longer needs a return URL
     */
    @Deprecated
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.<br>
     * Note: The provided URL should be absolute and contain the https:// protocol. IP addresses are not supported, neither localhost. For use on mobile devices a custom protocol can be used in the form of <i>protocol</i>://. This protocol must be registered on the device first.<br>
     * URLs without a protocol will be rejected.
     *
     * @deprecated No replacement, since Boleto Bancario no longer needs a return URL
     */
    @Deprecated
    public void setReturnUrl(String value) {
        this.returnUrl = value;
    }
}
