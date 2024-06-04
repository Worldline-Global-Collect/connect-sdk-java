/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * @deprecated Use ShoppingCart.amountBreakdown instead
 */
@Deprecated
public class Level3SummaryData {

    private Long discountAmount;

    private Long dutyAmount;

    private Long shippingAmount;

    /**
     * Discount on the entire transaction, with the last 2 digits are implied decimal places
     *
     * @deprecated Use ShoppingCart.amountBreakdown with type DISCOUNT instead
     */
    @Deprecated
    public Long getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Discount on the entire transaction, with the last 2 digits are implied decimal places
     *
     * @deprecated Use ShoppingCart.amountBreakdown with type DISCOUNT instead
     */
    @Deprecated
    public void setDiscountAmount(Long value) {
        this.discountAmount = value;
    }

    /**
     * Duty on the entire transaction, with the last 2 digits are implied decimal places
     *
     * @deprecated Use ShoppingCart.amountBreakdown with type DUTY instead
     */
    @Deprecated
    public Long getDutyAmount() {
        return dutyAmount;
    }

    /**
     * Duty on the entire transaction, with the last 2 digits are implied decimal places
     *
     * @deprecated Use ShoppingCart.amountBreakdown with type DUTY instead
     */
    @Deprecated
    public void setDutyAmount(Long value) {
        this.dutyAmount = value;
    }

    /**
     * Shippingcost on the entire transaction, with the last 2 digits are implied decimal places
     *
     * @deprecated Use ShoppingCart.amountBreakdown with type SHIPPING instead
     */
    @Deprecated
    public Long getShippingAmount() {
        return shippingAmount;
    }

    /**
     * Shippingcost on the entire transaction, with the last 2 digits are implied decimal places
     *
     * @deprecated Use ShoppingCart.amountBreakdown with type SHIPPING instead
     */
    @Deprecated
    public void setShippingAmount(Long value) {
        this.shippingAmount = value;
    }
}
