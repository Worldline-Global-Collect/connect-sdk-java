/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class ShoppingCart {

    private List<AmountBreakdown> amountBreakdown;

    private GiftCardPurchase giftCardPurchase;

    private Boolean isPreOrder;

    private List<LineItem> items;

    private String preOrderItemAvailabilityDate;

    private Boolean reOrderIndicator;

    /**
     * Determines the type of the amount.
     */
    public List<AmountBreakdown> getAmountBreakdown() {
        return amountBreakdown;
    }

    /**
     * Determines the type of the amount.
     */
    public void setAmountBreakdown(List<AmountBreakdown> value) {
        this.amountBreakdown = value;
    }

    /**
     * Object containing information on purchased gift card(s)
     */
    public GiftCardPurchase getGiftCardPurchase() {
        return giftCardPurchase;
    }

    /**
     * Object containing information on purchased gift card(s)
     */
    public void setGiftCardPurchase(GiftCardPurchase value) {
        this.giftCardPurchase = value;
    }

    /**
     * The customer is pre-ordering one or more items
     */
    public Boolean getIsPreOrder() {
        return isPreOrder;
    }

    /**
     * The customer is pre-ordering one or more items
     */
    public void setIsPreOrder(Boolean value) {
        this.isPreOrder = value;
    }

    /**
     * Shopping cart data
     */
    public List<LineItem> getItems() {
        return items;
    }

    /**
     * Shopping cart data
     */
    public void setItems(List<LineItem> value) {
        this.items = value;
    }

    /**
     * Date (YYYYMMDD) when the preordered item becomes available
     */
    public String getPreOrderItemAvailabilityDate() {
        return preOrderItemAvailabilityDate;
    }

    /**
     * Date (YYYYMMDD) when the preordered item becomes available
     */
    public void setPreOrderItemAvailabilityDate(String value) {
        this.preOrderItemAvailabilityDate = value;
    }

    /**
     * Indicates whether the cardholder is reordering previously purchased item(s)
     * <p>true = the customer is re-ordering at least one of the items again
     * <p>false = this is the first time the customer is ordering these items
     */
    public Boolean getReOrderIndicator() {
        return reOrderIndicator;
    }

    /**
     * Indicates whether the cardholder is reordering previously purchased item(s)
     * <p>true = the customer is re-ordering at least one of the items again
     * <p>false = this is the first time the customer is ordering these items
     */
    public void setReOrderIndicator(Boolean value) {
        this.reOrderIndicator = value;
    }
}
