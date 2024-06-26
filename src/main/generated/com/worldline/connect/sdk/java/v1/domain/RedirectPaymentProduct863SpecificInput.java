/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RedirectPaymentProduct863SpecificInput {

    private String integrationType;

    private String openId;

    /**
     * The type of integration with WeChat. Possible values:
     * <ul class="paragraph-width"><li>desktopQRCode - used on desktops, the customer opens the WeChat app by scanning a QR code.
     * <li>urlIntent - used in mobile apps or on mobile web pages, the customer opens the WeChat app using a URL intent.
     * <li>nativeInApp - used in mobile apps that use the WeChat Pay SDK.
     * <li>javaScriptAPI - used for WeChat official accounts. Requires the QQ browser to function.
     * <li>miniProgram - used for Mini Programs.
     * </ul>
     */
    public String getIntegrationType() {
        return integrationType;
    }

    /**
     * The type of integration with WeChat. Possible values:
     * <ul class="paragraph-width"><li>desktopQRCode - used on desktops, the customer opens the WeChat app by scanning a QR code.
     * <li>urlIntent - used in mobile apps or on mobile web pages, the customer opens the WeChat app using a URL intent.
     * <li>nativeInApp - used in mobile apps that use the WeChat Pay SDK.
     * <li>javaScriptAPI - used for WeChat official accounts. Requires the QQ browser to function.
     * <li>miniProgram - used for Mini Programs.
     * </ul>
     */
    public void setIntegrationType(String value) {
        this.integrationType = value;
    }

    /**
     * An openId of a customer.
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * An openId of a customer.
     */
    public void setOpenId(String value) {
        this.openId = value;
    }
}
