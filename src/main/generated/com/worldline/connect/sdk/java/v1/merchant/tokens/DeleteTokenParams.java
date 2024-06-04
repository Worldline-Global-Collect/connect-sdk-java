/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.tokens;

import java.util.ArrayList;
import java.util.List;

import com.worldline.connect.sdk.java.communication.ParamRequest;
import com.worldline.connect.sdk.java.communication.RequestParam;

/**
 * Query parameters for
 * <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/delete.html">Delete token</a>
 */
public class DeleteTokenParams implements ParamRequest {

    private String mandateCancelDate;

    /**
     * Date of the mandate cancellation<br>
     * Format: YYYYMMDD
     */
    public String getMandateCancelDate() {
        return mandateCancelDate;
    }

    /**
     * Date of the mandate cancellation<br>
     * Format: YYYYMMDD
     */
    public void setMandateCancelDate(String value) {
        this.mandateCancelDate = value;
    }

    @Override
    public List<RequestParam> toRequestParameters() {
        List<RequestParam> result = new ArrayList<>();
        if (mandateCancelDate != null) {
            result.add(new RequestParam("mandateCancelDate", mandateCancelDate));
        }
        return result;
    }
}
