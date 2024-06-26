/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RefundResult extends AbstractOrderStatus {

    private RefundOutput refundOutput;

    private String status;

    private OrderStatusOutput statusOutput;

    /**
     * Object containing refund details
     */
    public RefundOutput getRefundOutput() {
        return refundOutput;
    }

    /**
     * Object containing refund details
     */
    public void setRefundOutput(RefundOutput value) {
        this.refundOutput = value;
    }

    /**
     * Current high-level status of the refund in a human-readable form. Possible values are:
     * <ul class="paragraph-width">
     * <li>CREATED - The transaction has been created. This is the initial state once a new refund is created.
     * <li>PENDING_APPROVAL - The transaction is awaiting approval from you to proceed with the processing of the refund
     * <li>REJECTED - The refund has been rejected
     * <li>REFUND_REQUESTED - The transaction is in the queue to be refunded
     * <li>REFUNDED - We have successfully refunded the customer
     * <li>REJECTED_CAPTURE - The refund was rejected by the bank or us during processing
     * <li>CANCELLED - You have cancelled the transaction
     * </ul><br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Current high-level status of the refund in a human-readable form. Possible values are:
     * <ul class="paragraph-width">
     * <li>CREATED - The transaction has been created. This is the initial state once a new refund is created.
     * <li>PENDING_APPROVAL - The transaction is awaiting approval from you to proceed with the processing of the refund
     * <li>REJECTED - The refund has been rejected
     * <li>REFUND_REQUESTED - The transaction is in the queue to be refunded
     * <li>REFUNDED - We have successfully refunded the customer
     * <li>REJECTED_CAPTURE - The refund was rejected by the bank or us during processing
     * <li>CANCELLED - You have cancelled the transaction
     * </ul><br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * This object has the numeric representation of the current refund status, timestamp of last status change and performable action on the current refund resource.<br>
     * In case of a rejected refund, detailed error information is listed.
     */
    public OrderStatusOutput getStatusOutput() {
        return statusOutput;
    }

    /**
     * This object has the numeric representation of the current refund status, timestamp of last status change and performable action on the current refund resource.<br>
     * In case of a rejected refund, detailed error information is listed.
     */
    public void setStatusOutput(OrderStatusOutput value) {
        this.statusOutput = value;
    }
}
