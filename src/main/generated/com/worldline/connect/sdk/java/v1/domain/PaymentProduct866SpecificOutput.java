/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Alipay+ (payment product 866) specific details
 */
public class PaymentProduct866SpecificOutput {

    private String walletUsed;

    /**
     * The wallet your customer used when completing the payment with Alipay+.
     */
    public String getWalletUsed() {
        return walletUsed;
    }

    /**
     * The wallet your customer used when completing the payment with Alipay+.
     */
    public void setWalletUsed(String value) {
        this.walletUsed = value;
    }
}
