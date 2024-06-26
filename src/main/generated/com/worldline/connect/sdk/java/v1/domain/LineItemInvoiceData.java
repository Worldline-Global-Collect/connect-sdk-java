/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class LineItemInvoiceData {

    private String description;

    private String merchantLinenumber;

    private String merchantPagenumber;

    private String nrOfItems;

    private Long pricePerItem;

    /**
     * Shopping cart item description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Shopping cart item description
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Line number for printed invoice or order of items in the cart<br>
     * Should be a numeric string
     */
    public String getMerchantLinenumber() {
        return merchantLinenumber;
    }

    /**
     * Line number for printed invoice or order of items in the cart<br>
     * Should be a numeric string
     */
    public void setMerchantLinenumber(String value) {
        this.merchantLinenumber = value;
    }

    /**
     * Page number for printed invoice<br>
     * Should be a numeric string
     */
    public String getMerchantPagenumber() {
        return merchantPagenumber;
    }

    /**
     * Page number for printed invoice<br>
     * Should be a numeric string
     */
    public void setMerchantPagenumber(String value) {
        this.merchantPagenumber = value;
    }

    /**
     * Quantity of the item
     */
    public String getNrOfItems() {
        return nrOfItems;
    }

    /**
     * Quantity of the item
     */
    public void setNrOfItems(String value) {
        this.nrOfItems = value;
    }

    /**
     * Price per item
     */
    public Long getPricePerItem() {
        return pricePerItem;
    }

    /**
     * Price per item
     */
    public void setPricePerItem(Long value) {
        this.pricePerItem = value;
    }
}
