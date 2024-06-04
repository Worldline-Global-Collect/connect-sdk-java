/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class PaymentProducts {

    private List<PaymentProduct> paymentProducts;

    /**
     * Array containing payment products and their characteristics
     */
    public List<PaymentProduct> getPaymentProducts() {
        return paymentProducts;
    }

    /**
     * Array containing payment products and their characteristics
     */
    public void setPaymentProducts(List<PaymentProduct> value) {
        this.paymentProducts = value;
    }
}
