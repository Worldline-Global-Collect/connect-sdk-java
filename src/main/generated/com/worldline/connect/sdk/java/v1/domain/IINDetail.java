/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Output of the retrieval of the IIN details request
 */
public class IINDetail {

    private Boolean isAllowedInContext;

    private Integer paymentProductId;

    /**
     * Populated only if you submitted a payment context.
     * <ul class="paragraph-width"><li>true - The payment product is allowed in the submitted context.
     * <li>false - The payment product is not allowed in the submitted context. Note that in this case, none of the brands of the card will be allowed in the submitted context.</ul>
     */
    public Boolean getIsAllowedInContext() {
        return isAllowedInContext;
    }

    /**
     * Populated only if you submitted a payment context.
     * <ul class="paragraph-width"><li>true - The payment product is allowed in the submitted context.
     * <li>false - The payment product is not allowed in the submitted context. Note that in this case, none of the brands of the card will be allowed in the submitted context.</ul>
     */
    public void setIsAllowedInContext(Boolean value) {
        this.isAllowedInContext = value;
    }

    /**
     * Payment product identifier<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
     */
    public Integer getPaymentProductId() {
        return paymentProductId;
    }

    /**
     * Payment product identifier<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
     */
    public void setPaymentProductId(Integer value) {
        this.paymentProductId = value;
    }
}
