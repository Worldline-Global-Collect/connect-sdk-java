/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.payments;

import java.util.ArrayList;
import java.util.List;

import com.worldline.connect.sdk.java.communication.ParamRequest;
import com.worldline.connect.sdk.java.communication.RequestParam;

/**
 * Query parameters for
 * <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/get.html">Get payment</a>
 */
public class GetPaymentParams implements ParamRequest {

    private Boolean returnOperations;

    /**
     * This property only works for the multiple partial captures payments. If set to true, in the response of this call you will get an array called operations, that will include objects for captures and refunds associated with the given paymentId.
     */
    public Boolean getReturnOperations() {
        return returnOperations;
    }

    /**
     * This property only works for the multiple partial captures payments. If set to true, in the response of this call you will get an array called operations, that will include objects for captures and refunds associated with the given paymentId.
     */
    public void setReturnOperations(Boolean value) {
        this.returnOperations = value;
    }

    @Override
    public List<RequestParam> toRequestParameters() {
        List<RequestParam> result = new ArrayList<>();
        if (returnOperations != null) {
            result.add(new RequestParam("returnOperations", returnOperations.toString()));
        }
        return result;
    }
}
