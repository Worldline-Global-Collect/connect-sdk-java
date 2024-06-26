/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object containing data regarding the 3D Secure authentication
 */
public class ThreeDSecureData {

    private String acsTransactionId;

    private String method;

    private String utcTimestamp;

    /**
     * The ACS Transaction ID for a prior 3-D Secure authenticated transaction (for example, the first recurring transaction that was authenticated with the customer)
     */
    public String getAcsTransactionId() {
        return acsTransactionId;
    }

    /**
     * The ACS Transaction ID for a prior 3-D Secure authenticated transaction (for example, the first recurring transaction that was authenticated with the customer)
     */
    public void setAcsTransactionId(String value) {
        this.acsTransactionId = value;
    }

    /**
     * Method of authentication used for this transaction.
     * 
     * Possible values:
     * <ul class="paragraph-width"><li>frictionless = The authentication went without a challenge</li>
     * <li>challenged = Cardholder was challenged</li>
     * <li>avs-verified = The authentication was verified by AVS</li>
     * <li>other = Another issuer method was used to authenticate this transaction</li></ul>
     */
    public String getMethod() {
        return method;
    }

    /**
     * Method of authentication used for this transaction.
     * 
     * Possible values:
     * <ul class="paragraph-width"><li>frictionless = The authentication went without a challenge</li>
     * <li>challenged = Cardholder was challenged</li>
     * <li>avs-verified = The authentication was verified by AVS</li>
     * <li>other = Another issuer method was used to authenticate this transaction</li></ul>
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Timestamp in UTC (YYYYMMDDHHmm) of the 3-D Secure authentication of this transaction
     */
    public String getUtcTimestamp() {
        return utcTimestamp;
    }

    /**
     * Timestamp in UTC (YYYYMMDDHHmm) of the 3-D Secure authentication of this transaction
     */
    public void setUtcTimestamp(String value) {
        this.utcTimestamp = value;
    }
}
