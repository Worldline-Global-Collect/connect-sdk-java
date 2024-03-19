/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MobileThreeDSecureChallengeParameters {

    private String acsReferenceNumber = null;

    private String acsSignedContent = null;

    private String acsTransactionId = null;

    private String threeDServerTransactionId = null;

    /**
     * The unique identifier assigned by the EMVCo Secretariat upon testing and approval.
     */
    public String getAcsReferenceNumber() {
        return acsReferenceNumber;
    }

    /**
     * The unique identifier assigned by the EMVCo Secretariat upon testing and approval.
     */
    public void setAcsReferenceNumber(String value) {
        this.acsReferenceNumber = value;
    }

    /**
     * Contains the JWS object created by the ACS for the challenge (ARes).
     */
    public String getAcsSignedContent() {
        return acsSignedContent;
    }

    /**
     * Contains the JWS object created by the ACS for the challenge (ARes).
     */
    public void setAcsSignedContent(String value) {
        this.acsSignedContent = value;
    }

    /**
     * The ACS Transaction ID for a prior 3-D Secure authenticated transaction (for example, the first recurring transaction that was authenticated with the customer).
     */
    public String getAcsTransactionId() {
        return acsTransactionId;
    }

    /**
     * The ACS Transaction ID for a prior 3-D Secure authenticated transaction (for example, the first recurring transaction that was authenticated with the customer).
     */
    public void setAcsTransactionId(String value) {
        this.acsTransactionId = value;
    }

    /**
     * The 3-D Secure version 2 transaction ID that is used for the 3D Authentication
     */
    public String getThreeDServerTransactionId() {
        return threeDServerTransactionId;
    }

    /**
     * The 3-D Secure version 2 transaction ID that is used for the 3D Authentication
     */
    public void setThreeDServerTransactionId(String value) {
        this.threeDServerTransactionId = value;
    }
}
