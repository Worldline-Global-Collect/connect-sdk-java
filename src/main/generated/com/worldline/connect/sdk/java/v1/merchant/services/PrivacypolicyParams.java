/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.services;

import java.util.ArrayList;
import java.util.List;

import com.worldline.connect.sdk.java.communication.ParamRequest;
import com.worldline.connect.sdk.java.communication.RequestParam;

/**
 * Query parameters for
 * <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/privacypolicy.html">Get privacy policy</a>
 */
public class PrivacypolicyParams implements ParamRequest {

    private String locale;

    private Integer paymentProductId;

    /**
     * Locale in which the privacy policy should be returned. Uses your default locale when none is provided.
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Locale in which the privacy policy should be returned. Uses your default locale when none is provided.
     */
    public void setLocale(String value) {
        this.locale = value;
    }

    /**
     * ID of the payment product for which you wish to retrieve the privacy policy. When no ID is provided you will receive all privacy policies for your payment products.
     */
    public Integer getPaymentProductId() {
        return paymentProductId;
    }

    /**
     * ID of the payment product for which you wish to retrieve the privacy policy. When no ID is provided you will receive all privacy policies for your payment products.
     */
    public void setPaymentProductId(Integer value) {
        this.paymentProductId = value;
    }

    @Override
    public List<RequestParam> toRequestParameters() {
        List<RequestParam> result = new ArrayList<>();
        if (locale != null) {
            result.add(new RequestParam("locale", locale));
        }
        if (paymentProductId != null) {
            result.add(new RequestParam("paymentProductId", paymentProductId.toString()));
        }
        return result;
    }
}
