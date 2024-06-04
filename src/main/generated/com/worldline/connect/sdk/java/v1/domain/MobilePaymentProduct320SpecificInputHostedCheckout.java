/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MobilePaymentProduct320SpecificInputHostedCheckout {

    private String merchantName;

    private String merchantOrigin;

    private GPayThreeDSecure threeDSecure;

    /**
     * Used as an input for the Google Pay payment sheet. Provide your company name in a human readable form.
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * Used as an input for the Google Pay payment sheet. Provide your company name in a human readable form.
     */
    public void setMerchantName(String value) {
        this.merchantName = value;
    }

    /**
     * Used as an input for the Google Pay payment sheet. Provide the url of your webshop. For international (non-ASCII) domains, please use <a href="https://en.wikipedia.org/wiki/Punycode">Punycode</a>.
     */
    public String getMerchantOrigin() {
        return merchantOrigin;
    }

    /**
     * Used as an input for the Google Pay payment sheet. Provide the url of your webshop. For international (non-ASCII) domains, please use <a href="https://en.wikipedia.org/wiki/Punycode">Punycode</a>.
     */
    public void setMerchantOrigin(String value) {
        this.merchantOrigin = value;
    }

    /**
     * Object containing specific data regarding 3-D Secure
     */
    public GPayThreeDSecure getThreeDSecure() {
        return threeDSecure;
    }

    /**
     * Object containing specific data regarding 3-D Secure
     */
    public void setThreeDSecure(GPayThreeDSecure value) {
        this.threeDSecure = value;
    }
}
