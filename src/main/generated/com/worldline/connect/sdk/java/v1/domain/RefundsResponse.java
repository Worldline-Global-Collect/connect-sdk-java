/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class RefundsResponse {

    private List<RefundResult> refunds = null;

    /**
     * The list of all refunds performed on the requested payment.
     */
    public List<RefundResult> getRefunds() {
        return refunds;
    }

    /**
     * The list of all refunds performed on the requested payment.
     */
    public void setRefunds(List<RefundResult> value) {
        this.refunds = value;
    }
}
