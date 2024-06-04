/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class Order {

    private AdditionalOrderInput additionalInput;

    private AmountOfMoney amountOfMoney;

    private Customer customer;

    private List<LineItem> items;

    private OrderReferences references;

    private Seller seller;

    private Shipping shipping;

    private ShoppingCart shoppingCart;

    /**
     * Object containing additional input on the order
     */
    public AdditionalOrderInput getAdditionalInput() {
        return additionalInput;
    }

    /**
     * Object containing additional input on the order
     */
    public void setAdditionalInput(AdditionalOrderInput value) {
        this.additionalInput = value;
    }

    /**
     * Object containing amount and ISO currency code attributes
     */
    public AmountOfMoney getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * Object containing amount and ISO currency code attributes
     */
    public void setAmountOfMoney(AmountOfMoney value) {
        this.amountOfMoney = value;
    }

    /**
     * Object containing the details of the customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Object containing the details of the customer
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Shopping cart data
     *
     * @deprecated Use shoppingCart.items instead
     */
    @Deprecated
    public List<LineItem> getItems() {
        return items;
    }

    /**
     * Shopping cart data
     *
     * @deprecated Use shoppingCart.items instead
     */
    @Deprecated
    public void setItems(List<LineItem> value) {
        this.items = value;
    }

    /**
     * Object that holds all reference properties that are linked to this transaction
     */
    public OrderReferences getReferences() {
        return references;
    }

    /**
     * Object that holds all reference properties that are linked to this transaction
     */
    public void setReferences(OrderReferences value) {
        this.references = value;
    }

    /**
     * Object containing seller details
     *
     * @deprecated Use Merchant.seller instead
     */
    @Deprecated
    public Seller getSeller() {
        return seller;
    }

    /**
     * Object containing seller details
     *
     * @deprecated Use Merchant.seller instead
     */
    @Deprecated
    public void setSeller(Seller value) {
        this.seller = value;
    }

    /**
     * Object containing information regarding shipping / delivery
     */
    public Shipping getShipping() {
        return shipping;
    }

    /**
     * Object containing information regarding shipping / delivery
     */
    public void setShipping(Shipping value) {
        this.shipping = value;
    }

    /**
     * Shopping cart data, including items and specific amounts.
     */
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    /**
     * Shopping cart data, including items and specific amounts.
     */
    public void setShoppingCart(ShoppingCart value) {
        this.shoppingCart = value;
    }
}
