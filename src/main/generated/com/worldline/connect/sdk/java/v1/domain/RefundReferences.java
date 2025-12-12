/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RefundReferences {

    private String descriptor;

    private String merchantReference;

    /**
     * <p>Descriptive text that is used towards customer during refund. The maximum allowed length varies per payment product: </p> 
     *  <ul>
     * <li>Wero - 50 characters</li>
     * </ul>
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * <p>Descriptive text that is used towards customer during refund. The maximum allowed length varies per payment product: </p> 
     *  <ul>
     * <li>Wero - 50 characters</li>
     * </ul>
     */
    public void setDescriptor(String value) {
        this.descriptor = value;
    }

    /**
     * <div class="alert alert-info">Note that the maximum length of this field for transactions processed on the GlobalCollect platform is 30.</div> Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * <div class="alert alert-info">Note that the maximum length of this field for transactions processed on the GlobalCollect platform is 30.</div> Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }
}
