/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class BankTransferPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

    private FraudResults fraudResults;

    /**
     * Object containing the results of the fraud screening
     */
    public FraudResults getFraudResults() {
        return fraudResults;
    }

    /**
     * Object containing the results of the fraud screening
     */
    public void setFraudResults(FraudResults value) {
        this.fraudResults = value;
    }
}
