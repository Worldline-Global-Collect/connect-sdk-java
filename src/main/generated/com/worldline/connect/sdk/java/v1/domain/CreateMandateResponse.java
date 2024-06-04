/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CreateMandateResponse {

    private MandateResponse mandate;

    private MandateMerchantAction merchantAction;

    /**
     * Object containing information on a mandate
     */
    public MandateResponse getMandate() {
        return mandate;
    }

    /**
     * Object containing information on a mandate
     */
    public void setMandate(MandateResponse value) {
        this.mandate = value;
    }

    /**
     * Object that contains the action, including the needed data, that you should perform next, showing the redirect to a third party to complete the payment or like showing instructions
     */
    public MandateMerchantAction getMerchantAction() {
        return merchantAction;
    }

    /**
     * Object that contains the action, including the needed data, that you should perform next, showing the redirect to a third party to complete the payment or like showing instructions
     */
    public void setMerchantAction(MandateMerchantAction value) {
        this.merchantAction = value;
    }
}
