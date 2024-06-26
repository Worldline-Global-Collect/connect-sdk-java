/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class GetHostedMandateManagementResponse {

    private MandateResponse mandate;

    private String status;

    /**
     * When a mandate has been created during the hosted mandate management session this object will return the details.
     */
    public MandateResponse getMandate() {
        return mandate;
    }

    /**
     * When a mandate has been created during the hosted mandate management session this object will return the details.
     */
    public void setMandate(MandateResponse value) {
        this.mandate = value;
    }

    /**
     * This is the status of the hosted mandate management. Possible values are:
     * <ul class="paragraph-width">
     * <li>IN_PROGRESS - The session has been created, but no mandate has been created yet.
     * <li>MANDATE_CREATED - A mandate has been created, the customer might still need to sign the mandate.
     * <li>FAILED - There was an error while creating the mandate, the session can not continue.
     * <li>CANCELLED_BY_CONSUMER - The session was cancelled before a mandate was created</ul>.
     */
    public String getStatus() {
        return status;
    }

    /**
     * This is the status of the hosted mandate management. Possible values are:
     * <ul class="paragraph-width">
     * <li>IN_PROGRESS - The session has been created, but no mandate has been created yet.
     * <li>MANDATE_CREATED - A mandate has been created, the customer might still need to sign the mandate.
     * <li>FAILED - There was an error while creating the mandate, the session can not continue.
     * <li>CANCELLED_BY_CONSUMER - The session was cancelled before a mandate was created</ul>.
     */
    public void setStatus(String value) {
        this.status = value;
    }
}
