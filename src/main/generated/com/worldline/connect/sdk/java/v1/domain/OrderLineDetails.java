/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class OrderLineDetails {

    private Long discountAmount;

    private Long googleProductCategoryId;

    private Long lineAmountTotal;

    private String naicsCommodityCode;

    private String productCategory;

    private String productCode;

    private String productImageUrl;

    private String productName;

    private Long productPrice;

    private String productSku;

    private String productType;

    private String productUrl;

    private Long quantity;

    private Long taxAmount;

    private String unit;

    /**
     * Discount on the line item, with the last two digits implied as decimal places
     */
    public Long getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Discount on the line item, with the last two digits implied as decimal places
     */
    public void setDiscountAmount(Long value) {
        this.discountAmount = value;
    }

    /**
     * The Google product category ID for the item.
     */
    public Long getGoogleProductCategoryId() {
        return googleProductCategoryId;
    }

    /**
     * The Google product category ID for the item.
     */
    public void setGoogleProductCategoryId(Long value) {
        this.googleProductCategoryId = value;
    }

    /**
     * Total amount for the line item
     */
    public Long getLineAmountTotal() {
        return lineAmountTotal;
    }

    /**
     * Total amount for the line item
     */
    public void setLineAmountTotal(Long value) {
        this.lineAmountTotal = value;
    }

    /**
     * The UNSPC commodity code of the item.
     */
    public String getNaicsCommodityCode() {
        return naicsCommodityCode;
    }

    /**
     * The UNSPC commodity code of the item.
     */
    public void setNaicsCommodityCode(String value) {
        this.naicsCommodityCode = value;
    }

    /**
     * The category of the product (i.e. home appliance). This property can be used for fraud screening on the Ogone Platform.
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * The category of the product (i.e. home appliance). This property can be used for fraud screening on the Ogone Platform.
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Product or UPC Code, left justified<br>
     * Note: Must not be all spaces or all zeros
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Product or UPC Code, left justified<br>
     * Note: Must not be all spaces or all zeros
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * The URL of the image of the purchased product.
     */
    public String getProductImageUrl() {
        return productImageUrl;
    }

    /**
     * The URL of the image of the purchased product.
     */
    public void setProductImageUrl(String value) {
        this.productImageUrl = value;
    }

    /**
     * The name of the product. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * The name of the product. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * The price of one unit of the product, the value should be zero or greater
     */
    public Long getProductPrice() {
        return productPrice;
    }

    /**
     * The price of one unit of the product, the value should be zero or greater
     */
    public void setProductPrice(Long value) {
        this.productPrice = value;
    }

    /**
     * Product SKU number
     */
    public String getProductSku() {
        return productSku;
    }

    /**
     * Product SKU number
     */
    public void setProductSku(String value) {
        this.productSku = value;
    }

    /**
     * Code used to classify items that are purchased<br>
     * Note: Must not be all spaces or all zeros
     */
    public String getProductType() {
        return productType;
    }

    /**
     * Code used to classify items that are purchased<br>
     * Note: Must not be all spaces or all zeros
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * The URL of the product page on your website.
     */
    public String getProductUrl() {
        return productUrl;
    }

    /**
     * The URL of the product page on your website.
     */
    public void setProductUrl(String value) {
        this.productUrl = value;
    }

    /**
     * Quantity of the units being purchased, should be greater than zero<br>
     * Note: Must not be all spaces or all zeros
     */
    public Long getQuantity() {
        return quantity;
    }

    /**
     * Quantity of the units being purchased, should be greater than zero<br>
     * Note: Must not be all spaces or all zeros
     */
    public void setQuantity(Long value) {
        this.quantity = value;
    }

    /**
     * Tax on the line item, with the last two digits implied as decimal places
     */
    public Long getTaxAmount() {
        return taxAmount;
    }

    /**
     * Tax on the line item, with the last two digits implied as decimal places
     */
    public void setTaxAmount(Long value) {
        this.taxAmount = value;
    }

    /**
     * Indicates the line item unit of measure; for example: each, kit, pair, gallon, month, etc.
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Indicates the line item unit of measure; for example: each, kit, pair, gallon, month, etc.
     */
    public void setUnit(String value) {
        this.unit = value;
    }
}
