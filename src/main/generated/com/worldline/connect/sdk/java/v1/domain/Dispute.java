/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class Dispute {

    private DisputeOutput disputeOutput;

    private String id;

    private String paymentId;

    private String status;

    private DisputeStatusOutput statusOutput;

    /**
     * This property contains the creationDetails and default information regarding a dispute.
     */
    public DisputeOutput getDisputeOutput() {
        return disputeOutput;
    }

    /**
     * This property contains the creationDetails and default information regarding a dispute.
     */
    public void setDisputeOutput(DisputeOutput value) {
        this.disputeOutput = value;
    }

    /**
     * Dispute ID for a given merchant.
     */
    public String getId() {
        return id;
    }

    /**
     * Dispute ID for a given merchant.
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * The ID of the payment that is being disputed.
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * The ID of the payment that is being disputed.
     */
    public void setPaymentId(String value) {
        this.paymentId = value;
    }

    /**
     * Current dispute status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Current dispute status.
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * This property contains the output for a dispute regarding the status of the dispute.
     */
    public DisputeStatusOutput getStatusOutput() {
        return statusOutput;
    }

    /**
     * This property contains the output for a dispute regarding the status of the dispute.
     */
    public void setStatusOutput(DisputeStatusOutput value) {
        this.statusOutput = value;
    }
}
