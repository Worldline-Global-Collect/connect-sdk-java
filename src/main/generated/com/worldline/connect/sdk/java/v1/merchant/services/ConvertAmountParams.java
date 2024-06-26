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
 * <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/convertAmount.html">Convert amount</a>
 */
public class ConvertAmountParams implements ParamRequest {

    private String source;

    private String target;

    private Long amount;

    /**
     * Three-letter ISO currency code representing the source currency
     */
    public String getSource() {
        return source;
    }

    /**
     * Three-letter ISO currency code representing the source currency
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Three-letter ISO currency code representing the target currency
     */
    public String getTarget() {
        return target;
    }

    /**
     * Three-letter ISO currency code representing the target currency
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Amount to be converted in cents and always having 2 decimals
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * Amount to be converted in cents and always having 2 decimals
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    @Override
    public List<RequestParam> toRequestParameters() {
        List<RequestParam> result = new ArrayList<>();
        if (source != null) {
            result.add(new RequestParam("source", source));
        }
        if (target != null) {
            result.add(new RequestParam("target", target));
        }
        if (amount != null) {
            result.add(new RequestParam("amount", amount.toString()));
        }
        return result;
    }
}
