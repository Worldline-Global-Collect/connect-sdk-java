/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class DisputesResponse {

    private List<Dispute> disputes;

    /**
     * Array containing disputes and their characteristics.
     */
    public List<Dispute> getDisputes() {
        return disputes;
    }

    /**
     * Array containing disputes and their characteristics.
     */
    public void setDisputes(List<Dispute> value) {
        this.disputes = value;
    }
}
