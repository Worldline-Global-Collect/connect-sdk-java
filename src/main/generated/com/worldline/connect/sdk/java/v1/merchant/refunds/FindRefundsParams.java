/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.refunds;

import java.util.ArrayList;
import java.util.List;

import com.worldline.connect.sdk.java.communication.ParamRequest;
import com.worldline.connect.sdk.java.communication.RequestParam;

/**
 * Query parameters for
 * <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/find.html">Find refunds</a>
 */
public class FindRefundsParams implements ParamRequest {

    private String hostedCheckoutId;

    private String merchantReference;

    private Long merchantOrderId;

    private Integer offset;

    private Integer limit;

    /**
     * Your hosted checkout identifier to filter on.
     */
    public String getHostedCheckoutId() {
        return hostedCheckoutId;
    }

    /**
     * Your hosted checkout identifier to filter on.
     */
    public void setHostedCheckoutId(String value) {
        this.hostedCheckoutId = value;
    }

    /**
     * Your unique transaction reference to filter on.
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * Your unique transaction reference to filter on.
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }

    /**
     * Your order identifier to filter on.
     */
    public Long getMerchantOrderId() {
        return merchantOrderId;
    }

    /**
     * Your order identifier to filter on.
     */
    public void setMerchantOrderId(Long value) {
        this.merchantOrderId = value;
    }

    /**
     * The zero-based index of the first refund in the result. If omitted, the offset will be 0.
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * The zero-based index of the first refund in the result. If omitted, the offset will be 0.
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * The maximum number of refunds to return, with a maximum of 100. If omitted, the limit will be 10.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * The maximum number of refunds to return, with a maximum of 100. If omitted, the limit will be 10.
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    @Override
    public List<RequestParam> toRequestParameters() {
        List<RequestParam> result = new ArrayList<>();
        if (hostedCheckoutId != null) {
            result.add(new RequestParam("hostedCheckoutId", hostedCheckoutId));
        }
        if (merchantReference != null) {
            result.add(new RequestParam("merchantReference", merchantReference));
        }
        if (merchantOrderId != null) {
            result.add(new RequestParam("merchantOrderId", merchantOrderId.toString()));
        }
        if (offset != null) {
            result.add(new RequestParam("offset", offset.toString()));
        }
        if (limit != null) {
            result.add(new RequestParam("limit", limit.toString()));
        }
        return result;
    }
}
