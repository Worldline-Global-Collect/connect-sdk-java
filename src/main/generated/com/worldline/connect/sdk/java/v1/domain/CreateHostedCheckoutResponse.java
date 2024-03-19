/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class CreateHostedCheckoutResponse {

    private String RETURNMAC = null;

    private String hostedCheckoutId = null;

    private List<String> invalidTokens = null;

    private String merchantReference = null;

    private String partialRedirectUrl = null;

    /**
     * When the customer is returned to your site we will append this property and value to the query-string. You should store this data, so you can identify the returning customer.
     */
    public String getRETURNMAC() {
        return RETURNMAC;
    }

    /**
     * When the customer is returned to your site we will append this property and value to the query-string. You should store this data, so you can identify the returning customer.
     */
    public void setRETURNMAC(String value) {
        this.RETURNMAC = value;
    }

    /**
     * This is the ID under which the data for this checkout can be retrieved.
     */
    public String getHostedCheckoutId() {
        return hostedCheckoutId;
    }

    /**
     * This is the ID under which the data for this checkout can be retrieved.
     */
    public void setHostedCheckoutId(String value) {
        this.hostedCheckoutId = value;
    }

    /**
     * Tokens that are submitted in the request are validated. In case any of the tokens can't be used anymore they are returned in this array. You should most likely remove those tokens from your system.
     */
    public List<String> getInvalidTokens() {
        return invalidTokens;
    }

    /**
     * Tokens that are submitted in the request are validated. In case any of the tokens can't be used anymore they are returned in this array. You should most likely remove those tokens from your system.
     */
    public void setInvalidTokens(List<String> value) {
        this.invalidTokens = value;
    }

    /**
     * If a payment is created during this hosted checkout, then it will use this merchantReference. This is the merchantReference you provided in the Create Hosted Checkout request, or if you did not provide one, a reference generated by Connect. This allows you to to link a webhook related to the created payment back to this hosted checkout using the webhook's paymentOutput.references.merchantReference.<br><br>This property is intended primarily for hosted checkouts on the Ogone Payment Platform. On the GlobalCollect platform, you can also use <span class="property">hostedCheckoutSpecificOutput.hostedCheckoutId</span>.
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * If a payment is created during this hosted checkout, then it will use this merchantReference. This is the merchantReference you provided in the Create Hosted Checkout request, or if you did not provide one, a reference generated by Connect. This allows you to to link a webhook related to the created payment back to this hosted checkout using the webhook's paymentOutput.references.merchantReference.<br><br>This property is intended primarily for hosted checkouts on the Ogone Payment Platform. On the GlobalCollect platform, you can also use <span class="property">hostedCheckoutSpecificOutput.hostedCheckoutId</span>.
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }

    /**
     * The partial URL as generated by our system. You will need to add the protocol and the relevant subdomain to this URL, before redirecting your customer to this URL. A special 'payment' subdomain will always work so you can always add 'https://payment.' at the beginning of this response value to view your MyCheckout hosted payment pages.
     */
    public String getPartialRedirectUrl() {
        return partialRedirectUrl;
    }

    /**
     * The partial URL as generated by our system. You will need to add the protocol and the relevant subdomain to this URL, before redirecting your customer to this URL. A special 'payment' subdomain will always work so you can always add 'https://payment.' at the beginning of this response value to view your MyCheckout hosted payment pages.
     */
    public void setPartialRedirectUrl(String value) {
        this.partialRedirectUrl = value;
    }
}