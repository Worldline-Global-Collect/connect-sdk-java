/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class MicrosoftFraudResults {

    private String clauseName;

    private String deviceCountryCode;

    private String deviceId;

    private Integer fraudScore;

    private String policyApplied;

    private List<String> reasonCodes;

    private String trueIpAddress;

    private String userDeviceType;

    /**
     * Name of the clause within the applied policy that was triggered during the evaluation of this transaction.
     */
    public String getClauseName() {
        return clauseName;
    }

    /**
     * Name of the clause within the applied policy that was triggered during the evaluation of this transaction.
     */
    public void setClauseName(String value) {
        this.clauseName = value;
    }

    /**
     * The country of the customer determined by Microsoft Device Fingerprinting.
     */
    public String getDeviceCountryCode() {
        return deviceCountryCode;
    }

    /**
     * The country of the customer determined by Microsoft Device Fingerprinting.
     */
    public void setDeviceCountryCode(String value) {
        this.deviceCountryCode = value;
    }

    /**
     * This is the device fingerprint value. Based on the amount of data that the device fingerprint collector script was able to collect, this will be a proxy ID for the device used by the customer. 
     */
    public String getDeviceId() {
        return deviceId;
    }

    /**
     * This is the device fingerprint value. Based on the amount of data that the device fingerprint collector script was able to collect, this will be a proxy ID for the device used by the customer. 
     */
    public void setDeviceId(String value) {
        this.deviceId = value;
    }

    /**
     * Result of the Microsoft Fraud Protection check. This contains the normalized fraud score from a scale of 0 to 100. A higher score indicates an increased risk of fraud.
     */
    public Integer getFraudScore() {
        return fraudScore;
    }

    /**
     * Result of the Microsoft Fraud Protection check. This contains the normalized fraud score from a scale of 0 to 100. A higher score indicates an increased risk of fraud.
     */
    public void setFraudScore(Integer value) {
        this.fraudScore = value;
    }

    /**
     * Name of the policy that was applied on during the evaluation of this transaction.
     */
    public String getPolicyApplied() {
        return policyApplied;
    }

    /**
     * Name of the policy that was applied on during the evaluation of this transaction.
     */
    public void setPolicyApplied(String value) {
        this.policyApplied = value;
    }

    /**
     * List of one or more reason codes.
     */
    public List<String> getReasonCodes() {
        return reasonCodes;
    }

    /**
     * List of one or more reason codes.
     */
    public void setReasonCodes(List<String> value) {
        this.reasonCodes = value;
    }

    /**
     * The true IP address as determined by Microsoft Device Fingerprinting.
     */
    public String getTrueIpAddress() {
        return trueIpAddress;
    }

    /**
     * The true IP address as determined by Microsoft Device Fingerprinting.
     */
    public void setTrueIpAddress(String value) {
        this.trueIpAddress = value;
    }

    /**
     * The type of device used by the customer.
     */
    public String getUserDeviceType() {
        return userDeviceType;
    }

    /**
     * The type of device used by the customer.
     */
    public void setUserDeviceType(String value) {
        this.userDeviceType = value;
    }
}
