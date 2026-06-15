/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

/**
 * Output of the retrieval of the IIN details request
 */
public class GetIINDetailsResponse {

    private String binProductType;

    private List<IINDetail> coBrands;

    private String countryCode;

    private Boolean isAllowedInContext;

    private String issuerName;

    private Integer paymentProductId;

    /**
     * Indicates the type or segments of consumer's BIN is issued. It helps to offer targeted benefits to the consumers, and helps to request exemption for additional authentications. The possible values are: <ul><li>CONSUMER</li><li>COMMERCIAL</li><li>VIRTUAL</li><li>ALL</li><li>OTHER</li></ul>
     */
    public String getBinProductType() {
        return binProductType;
    }

    /**
     * Indicates the type or segments of consumer's BIN is issued. It helps to offer targeted benefits to the consumers, and helps to request exemption for additional authentications. The possible values are: <ul><li>CONSUMER</li><li>COMMERCIAL</li><li>VIRTUAL</li><li>ALL</li><li>OTHER</li></ul>
     */
    public void setBinProductType(String value) {
        this.binProductType = value;
    }

    /**
     * Populated only if the card has multiple brands.
     * A list with for every brand of the card, the payment product identifier associated with that brand, and if you submitted a payment context, whether that payment product is allowed in the context.
     */
    public List<IINDetail> getCoBrands() {
        return coBrands;
    }

    /**
     * Populated only if the card has multiple brands.
     * A list with for every brand of the card, the payment product identifier associated with that brand, and if you submitted a payment context, whether that payment product is allowed in the context.
     */
    public void setCoBrands(List<IINDetail> value) {
        this.coBrands = value;
    }

    /**
     * The ISO 3166-1 alpha-2 country code of the country where the card was issued. If we don't know where the card was issued, then the countryCode will return the value '99'.
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * The ISO 3166-1 alpha-2 country code of the country where the card was issued. If we don't know where the card was issued, then the countryCode will return the value '99'.
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

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
     * The name of the card issuer associated with the card.
     */
    public String getIssuerName() {
        return issuerName;
    }

    /**
     * The name of the card issuer associated with the card.
     */
    public void setIssuerName(String value) {
        this.issuerName = value;
    }

    /**
     * The payment product identifier associated with the card. If the card has multiple brands, then we select the most appropriate payment product based on your configuration and the payment context, if you submitted one.<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values
     */
    public Integer getPaymentProductId() {
        return paymentProductId;
    }

    /**
     * The payment product identifier associated with the card. If the card has multiple brands, then we select the most appropriate payment product based on your configuration and the payment context, if you submitted one.<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values
     */
    public void setPaymentProductId(Integer value) {
        this.paymentProductId = value;
    }
}
