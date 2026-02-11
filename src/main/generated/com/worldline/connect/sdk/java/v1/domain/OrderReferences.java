/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class OrderReferences {

    private String descriptor;

    private OrderInvoiceData invoiceData;

    private Long merchantOrderId;

    private String merchantReference;

    private String providerId;

    private String providerMerchantId;

    /**
     * Descriptive text that is used towards to customer, either during an online checkout at a third party and/or on the statement of the customer. For card transactions this is usually referred to as a Soft Descriptor. The maximum allowed length varies per card acquirer:
     * <ul class="paragraph-width"><li>AIB - 22 characters
     * <li>American Express - 25 characters
     * <li>Bambora - 22 characters
     * <li>First Data APAC and AUS - 25 characters
     * <li>Chase - not supported
     * <li>INICIS (INIPAY) - 22-30 characters
     * <li>Lidio - 30 characters
     * <li>Worldline TAP UK - 22 characters
     * <li>Worldline TAP EU - 22 characters
     * </ul>
     * Note that we advise you to use 22 characters as the max length as beyond this our experience is that issuers will start to truncate. We currently also only allow per API call overrides for AIB and Barclays<br>
     * For alternative payment products the maximum allowed length varies per payment product:
     * <ul class="paragraph-width"><li>402 e-Przelewy - 30 characters
     * <li>404 INICIS - 80 characters
     * <li>802 Nordea ePayment Finland - 234 characters
     * <li>809 iDeal - 32 characters
     * <li>840 PayPal - 127 characters
     * <li>861 Alipay - 256 characters
     * <li>863 WeChat Pay - 32 characters
     * <li>900 Wero - 50 characters
     * <li>1504 Konbini - 80 characters
     * </ul>
     * All other payment products don't support a descriptor.
     */
    public String getDescriptor() {
        return descriptor;
    }

    /**
     * Descriptive text that is used towards to customer, either during an online checkout at a third party and/or on the statement of the customer. For card transactions this is usually referred to as a Soft Descriptor. The maximum allowed length varies per card acquirer:
     * <ul class="paragraph-width"><li>AIB - 22 characters
     * <li>American Express - 25 characters
     * <li>Bambora - 22 characters
     * <li>First Data APAC and AUS - 25 characters
     * <li>Chase - not supported
     * <li>INICIS (INIPAY) - 22-30 characters
     * <li>Lidio - 30 characters
     * <li>Worldline TAP UK - 22 characters
     * <li>Worldline TAP EU - 22 characters
     * </ul>
     * Note that we advise you to use 22 characters as the max length as beyond this our experience is that issuers will start to truncate. We currently also only allow per API call overrides for AIB and Barclays<br>
     * For alternative payment products the maximum allowed length varies per payment product:
     * <ul class="paragraph-width"><li>402 e-Przelewy - 30 characters
     * <li>404 INICIS - 80 characters
     * <li>802 Nordea ePayment Finland - 234 characters
     * <li>809 iDeal - 32 characters
     * <li>840 PayPal - 127 characters
     * <li>861 Alipay - 256 characters
     * <li>863 WeChat Pay - 32 characters
     * <li>900 Wero - 50 characters
     * <li>1504 Konbini - 80 characters
     * </ul>
     * All other payment products don't support a descriptor.
     */
    public void setDescriptor(String value) {
        this.descriptor = value;
    }

    /**
     * Object containing additional invoice data
     */
    public OrderInvoiceData getInvoiceData() {
        return invoiceData;
    }

    /**
     * Object containing additional invoice data
     */
    public void setInvoiceData(OrderInvoiceData value) {
        this.invoiceData = value;
    }

    /**
     * Your order identifier<br>
     * Note: This does not need to have a unique value for each transaction. This allows your to link multiple transactions to the same logical order in your system.
     */
    public Long getMerchantOrderId() {
        return merchantOrderId;
    }

    /**
     * Your order identifier<br>
     * Note: This does not need to have a unique value for each transaction. This allows your to link multiple transactions to the same logical order in your system.
     */
    public void setMerchantOrderId(Long value) {
        this.merchantOrderId = value;
    }

    /**
     * <div class="alert alert-info">Note that the maximum length of this field for transactions processed on the GlobalCollect platform is 30.</div> <div class="alert alert-info">Note that the maximum length of this field for transactions processed on the WL Online Payment Acceptance Platform platform is 50.</div> Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
     */
    public String getMerchantReference() {
        return merchantReference;
    }

    /**
     * <div class="alert alert-info">Note that the maximum length of this field for transactions processed on the GlobalCollect platform is 30.</div> <div class="alert alert-info">Note that the maximum length of this field for transactions processed on the WL Online Payment Acceptance Platform platform is 50.</div> Your unique reference of the transaction that is also returned in our report files. This is almost always used for your reconciliation of our report files.
     */
    public void setMerchantReference(String value) {
        this.merchantReference = value;
    }

    /**
     * Provides an additional means of reconciliation for Gateway merchants
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Provides an additional means of reconciliation for Gateway merchants
     */
    public void setProviderId(String value) {
        this.providerId = value;
    }

    /**
     * Provides an additional means of reconciliation, this is the MerchantId used at the provider
     */
    public String getProviderMerchantId() {
        return providerMerchantId;
    }

    /**
     * Provides an additional means of reconciliation, this is the MerchantId used at the provider
     */
    public void setProviderMerchantId(String value) {
        this.providerMerchantId = value;
    }
}
