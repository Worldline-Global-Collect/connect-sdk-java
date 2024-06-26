/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Please find below specific input fields for payment product 4101 (UPI)
 */
public class RedirectPaymentProduct4101SpecificInput {

    private String displayName;

    private String integrationType;

    private String virtualPaymentAddress;

    /**
     * The merchant name as shown to the customer in some payment applications.
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The merchant name as shown to the customer in some payment applications.
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * The value of this property must be 'vpa', 'desktopQRCode', or 'urlIntent'.
     */
    public String getIntegrationType() {
        return integrationType;
    }

    /**
     * The value of this property must be 'vpa', 'desktopQRCode', or 'urlIntent'.
     */
    public void setIntegrationType(String value) {
        this.integrationType = value;
    }

    /**
     * The Virtual Payment Address (VPA) of the customer. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
     */
    public String getVirtualPaymentAddress() {
        return virtualPaymentAddress;
    }

    /**
     * The Virtual Payment Address (VPA) of the customer. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
     */
    public void setVirtualPaymentAddress(String value) {
        this.virtualPaymentAddress = value;
    }
}
