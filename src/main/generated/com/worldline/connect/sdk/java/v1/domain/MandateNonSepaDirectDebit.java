/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MandateNonSepaDirectDebit {

    private TokenNonSepaDirectDebitPaymentProduct705SpecificData paymentProduct705SpecificData;

    private TokenNonSepaDirectDebitPaymentProduct730SpecificData paymentProduct730SpecificData;

    /**
     * Object containing specific data for Direct Debit UK
     */
    public TokenNonSepaDirectDebitPaymentProduct705SpecificData getPaymentProduct705SpecificData() {
        return paymentProduct705SpecificData;
    }

    /**
     * Object containing specific data for Direct Debit UK
     */
    public void setPaymentProduct705SpecificData(TokenNonSepaDirectDebitPaymentProduct705SpecificData value) {
        this.paymentProduct705SpecificData = value;
    }

    /**
     * Object containing specific data for ACH
     */
    public TokenNonSepaDirectDebitPaymentProduct730SpecificData getPaymentProduct730SpecificData() {
        return paymentProduct730SpecificData;
    }

    /**
     * Object containing specific data for ACH
     */
    public void setPaymentProduct730SpecificData(TokenNonSepaDirectDebitPaymentProduct730SpecificData value) {
        this.paymentProduct730SpecificData = value;
    }
}
