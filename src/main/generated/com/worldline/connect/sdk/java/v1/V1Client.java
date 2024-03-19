/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1;

import java.util.Map;
import java.util.TreeMap;

import com.worldline.connect.sdk.java.ApiResource;
import com.worldline.connect.sdk.java.v1.merchant.MerchantClient;

/**
 * V1 client. Thread-safe.
 */
public class V1Client extends ApiResource {

    public V1Client(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}
     *
     * @param merchantId String
     * @return MerchantClient
     */
    public MerchantClient merchant(String merchantId) {
        Map<String, String> subContext = new TreeMap<>();
        subContext.put("merchantId", merchantId);
        return new MerchantClient(this, subContext);
    }
}
