/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RetailDecisionsCCFraudCheckOutput {

    private String fraudCode;

    private String fraudNeural;

    private String fraudRCF;

    /**
     * Provides additional information about the fraud result
     */
    public String getFraudCode() {
        return fraudCode;
    }

    /**
     * Provides additional information about the fraud result
     */
    public void setFraudCode(String value) {
        this.fraudCode = value;
    }

    /**
     * The raw score returned by the Neural check returned by the evaluation of the transaction
     */
    public String getFraudNeural() {
        return fraudNeural;
    }

    /**
     * The raw score returned by the Neural check returned by the evaluation of the transaction
     */
    public void setFraudNeural(String value) {
        this.fraudNeural = value;
    }

    /**
     * List of RuleCategoryFlags as setup in the Retail Decisions system that lead to the result
     */
    public String getFraudRCF() {
        return fraudRCF;
    }

    /**
     * List of RuleCategoryFlags as setup in the Retail Decisions system that lead to the result
     */
    public void setFraudRCF(String value) {
        this.fraudRCF = value;
    }
}
