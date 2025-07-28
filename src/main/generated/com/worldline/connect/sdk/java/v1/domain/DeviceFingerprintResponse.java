/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class DeviceFingerprintResponse {

    private String deviceFingerprintTransactionId;

    private String html;

    /**
     * Contains the unique id which is used by the device fingerprint collector script. This must be used to set the property fraudFields.deviceFingerprintTransactionId in either in the CreatePayment.order.customer.device.deviceFingerprintTransactionId, the CreateRiskAssessmentCards.order.customer.device.deviceFingerprintTransactionId or the CreateRiskAssessmentBankaccounts.order.customer.device.deviceFingerprintTransactionId.
     */
    public String getDeviceFingerprintTransactionId() {
        return deviceFingerprintTransactionId;
    }

    /**
     * Contains the unique id which is used by the device fingerprint collector script. This must be used to set the property fraudFields.deviceFingerprintTransactionId in either in the CreatePayment.order.customer.device.deviceFingerprintTransactionId, the CreateRiskAssessmentCards.order.customer.device.deviceFingerprintTransactionId or the CreateRiskAssessmentBankaccounts.order.customer.device.deviceFingerprintTransactionId.
     */
    public void setDeviceFingerprintTransactionId(String value) {
        this.deviceFingerprintTransactionId = value;
    }

    /**
     * Contains the ready-to-use device fingerprint collector script. You have to inject it into your page and call it when the customer presses the final payment submit button. For Cybersource, the script must be added to the body of the page.<br>
     * You should only call it once per payment request.
     */
    public String getHtml() {
        return html;
    }

    /**
     * Contains the ready-to-use device fingerprint collector script. You have to inject it into your page and call it when the customer presses the final payment submit button. For Cybersource, the script must be added to the body of the page.<br>
     * You should only call it once per payment request.
     */
    public void setHtml(String value) {
        this.html = value;
    }
}
