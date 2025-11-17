/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class WebhooksEvent {

    private String apiVersion;

    private CaptureResponse capture;

    private String created;

    private DisputeResponse dispute;

    private String id;

    private String merchantId;

    private PaymentResponse payment;

    private PayoutResponse payout;

    private RefundResponse refund;

    private TokenResponse token;

    private String type;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String value) {
        this.apiVersion = value;
    }

    public CaptureResponse getCapture() {
        return capture;
    }

    public void setCapture(CaptureResponse value) {
        this.capture = value;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String value) {
        this.created = value;
    }

    public DisputeResponse getDispute() {
        return dispute;
    }

    public void setDispute(DisputeResponse value) {
        this.dispute = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    public PaymentResponse getPayment() {
        return payment;
    }

    public void setPayment(PaymentResponse value) {
        this.payment = value;
    }

    public PayoutResponse getPayout() {
        return payout;
    }

    public void setPayout(PayoutResponse value) {
        this.payout = value;
    }

    public RefundResponse getRefund() {
        return refund;
    }

    public void setRefund(RefundResponse value) {
        this.refund = value;
    }

    public TokenResponse getToken() {
        return token;
    }

    public void setToken(TokenResponse value) {
        this.token = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }
}
