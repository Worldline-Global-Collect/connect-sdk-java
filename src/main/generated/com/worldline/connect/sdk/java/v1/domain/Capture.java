/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class Capture extends AbstractOrderStatus {

    private CaptureOutput captureOutput;

    private String status;

    private CaptureStatusOutput statusOutput;

    /**
     * Object containing capture details
     */
    public CaptureOutput getCaptureOutput() {
        return captureOutput;
    }

    /**
     * Object containing capture details
     */
    public void setCaptureOutput(CaptureOutput value) {
        this.captureOutput = value;
    }

    /**
     * Current high-level status of the captures in a human-readable form. Possible values are:<ul class="paragraph-width"><li>CREATED - The capture has been created on our side</li><li>CAPTURE_REQUESTED - The transaction is in the queue to be captured</li><li>CAPTURED - The transaction has been captured and we have received online confirmation</li><li>PAID - We have matched the incoming funds to the transaction</li><li>CANCELLED - You have cancelled the capture</li><li>REJECTED_CAPTURE - The capture has been rejected</li><li>REVERSED - The capture has been reversed</li><li>CHARGEBACK_NOTIFICATION - We have received a notification of chargeback and this status informs you that your account will be debited for a particular transaction</li><li>CHARGEBACKED - The transaction has been chargebacked</li></ul><br>Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Current high-level status of the captures in a human-readable form. Possible values are:<ul class="paragraph-width"><li>CREATED - The capture has been created on our side</li><li>CAPTURE_REQUESTED - The transaction is in the queue to be captured</li><li>CAPTURED - The transaction has been captured and we have received online confirmation</li><li>PAID - We have matched the incoming funds to the transaction</li><li>CANCELLED - You have cancelled the capture</li><li>REJECTED_CAPTURE - The capture has been rejected</li><li>REVERSED - The capture has been reversed</li><li>CHARGEBACK_NOTIFICATION - We have received a notification of chargeback and this status informs you that your account will be debited for a particular transaction</li><li>CHARGEBACKED - The transaction has been chargebacked</li></ul><br>Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/statuses.html">Statuses</a> for a full overview of possible values.
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * This object has the numeric representation of the current capture status, timestamp of last status change and performable action on the current capture resource. In case of failed captures and negative scenarios, detailed error information is listed.
     */
    public CaptureStatusOutput getStatusOutput() {
        return statusOutput;
    }

    /**
     * This object has the numeric representation of the current capture status, timestamp of last status change and performable action on the current capture resource. In case of failed captures and negative scenarios, detailed error information is listed.
     */
    public void setStatusOutput(CaptureStatusOutput value) {
        this.statusOutput = value;
    }
}
