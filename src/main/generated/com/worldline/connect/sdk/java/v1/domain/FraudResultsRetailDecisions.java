/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class FraudResultsRetailDecisions {

    private String fraudCode;

    private String fraudNeural;

    private String fraudRCF;

    /**
     * Result of the fraud service.
     * Provides additional information about the fraud result
     */
    public String getFraudCode() {
        return fraudCode;
    }

    /**
     * Result of the fraud service.
     * Provides additional information about the fraud result
     */
    public void setFraudCode(String value) {
        this.fraudCode = value;
    }

    /**
     * Returns the raw score of the neural
     */
    public String getFraudNeural() {
        return fraudNeural;
    }

    /**
     * Returns the raw score of the neural
     */
    public void setFraudNeural(String value) {
        this.fraudNeural = value;
    }

    /**
     * Result of the fraud service
     * Represent sets of fraud rules returned during the evaluation of the transaction
     */
    public String getFraudRCF() {
        return fraudRCF;
    }

    /**
     * Result of the fraud service
     * Represent sets of fraud rules returned during the evaluation of the transaction
     */
    public void setFraudRCF(String value) {
        this.fraudRCF = value;
    }
}
