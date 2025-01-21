/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

/**
 * This object contains the results of the Cybersource Decision Manager assessment. Cybersource is a fraud detection tool leveraging data networks, configurable rules, intelligence, and device fingerprinting to identify risky transactions.
 */
public class CybersourceDecisionManager {

    private String clauseName;

    private Integer fraudScore;

    private String policyApplied;

    private List<String> reasonCodes;

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
     * Result of the Cybersource Decision Manager check. This contains the normalized fraud score from a scale of 0 to 100. A higher score indicates an increased risk of fraud.
     */
    public Integer getFraudScore() {
        return fraudScore;
    }

    /**
     * Result of the Cybersource Decision Manager check. This contains the normalized fraud score from a scale of 0 to 100. A higher score indicates an increased risk of fraud.
     */
    public void setFraudScore(Integer value) {
        this.fraudScore = value;
    }

    /**
     * Name of the policy that was applied during the evaluation of this transaction.
     */
    public String getPolicyApplied() {
        return policyApplied;
    }

    /**
     * Name of the policy that was applied during the evaluation of this transaction.
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
}
