/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RefundMethodSpecificOutput {

    private Integer refundProductId;

    private Long totalAmountPaid;

    private Long totalAmountRefunded;

    /**
     * Refund product identifier<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refundproducts.html">refund products</a> for a full overview of possible values.
     */
    public Integer getRefundProductId() {
        return refundProductId;
    }

    /**
     * Refund product identifier<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refundproducts.html">refund products</a> for a full overview of possible values.
     */
    public void setRefundProductId(Integer value) {
        this.refundProductId = value;
    }

    /**
     * Total paid amount (in cents and always with 2 decimals)
     */
    public Long getTotalAmountPaid() {
        return totalAmountPaid;
    }

    /**
     * Total paid amount (in cents and always with 2 decimals)
     */
    public void setTotalAmountPaid(Long value) {
        this.totalAmountPaid = value;
    }

    public Long getTotalAmountRefunded() {
        return totalAmountRefunded;
    }

    public void setTotalAmountRefunded(Long value) {
        this.totalAmountRefunded = value;
    }
}
