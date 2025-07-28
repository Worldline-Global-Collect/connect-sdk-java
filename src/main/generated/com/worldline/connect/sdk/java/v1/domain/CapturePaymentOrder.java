/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CapturePaymentOrder {

    private CapturePaymentOrderAdditionalInput additionalInput;

    private CapturePaymentOrderReferences references;

    /**
     * Object containing additional input on the order
     */
    public CapturePaymentOrderAdditionalInput getAdditionalInput() {
        return additionalInput;
    }

    /**
     * Object containing additional input on the order
     */
    public void setAdditionalInput(CapturePaymentOrderAdditionalInput value) {
        this.additionalInput = value;
    }

    /**
     * Object that holds all reference properties that are linked to this transaction
     */
    public CapturePaymentOrderReferences getReferences() {
        return references;
    }

    /**
     * Object that holds all reference properties that are linked to this transaction
     */
    public void setReferences(CapturePaymentOrderReferences value) {
        this.references = value;
    }
}
