/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class SepaDirectDebitPaymentMethodSpecificInputBase extends AbstractSepaDirectDebitPaymentMethodSpecificInput {

    private SepaDirectDebitPaymentProduct771SpecificInputBase paymentProduct771SpecificInput = null;

    /**
     * Object containing information specific to SEPA Direct Debit
     */
    public SepaDirectDebitPaymentProduct771SpecificInputBase getPaymentProduct771SpecificInput() {
        return paymentProduct771SpecificInput;
    }

    /**
     * Object containing information specific to SEPA Direct Debit
     */
    public void setPaymentProduct771SpecificInput(SepaDirectDebitPaymentProduct771SpecificInputBase value) {
        this.paymentProduct771SpecificInput = value;
    }
}
