/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RedirectPaymentMethodSpecificInputBase extends AbstractRedirectPaymentMethodSpecificInput {

    private RedirectPaymentProduct4101SpecificInputBase paymentProduct4101SpecificInput;

    private RedirectPaymentProduct840SpecificInputBase paymentProduct840SpecificInput;

    /**
     * Object containing specific input required for payment product 4101 (UPI)
     */
    public RedirectPaymentProduct4101SpecificInputBase getPaymentProduct4101SpecificInput() {
        return paymentProduct4101SpecificInput;
    }

    /**
     * Object containing specific input required for payment product 4101 (UPI)
     */
    public void setPaymentProduct4101SpecificInput(RedirectPaymentProduct4101SpecificInputBase value) {
        this.paymentProduct4101SpecificInput = value;
    }

    /**
     * Object containing specific input required for PayPal payments (Payment product ID 840)
     */
    public RedirectPaymentProduct840SpecificInputBase getPaymentProduct840SpecificInput() {
        return paymentProduct840SpecificInput;
    }

    /**
     * Object containing specific input required for PayPal payments (Payment product ID 840)
     */
    public void setPaymentProduct840SpecificInput(RedirectPaymentProduct840SpecificInputBase value) {
        this.paymentProduct840SpecificInput = value;
    }
}
