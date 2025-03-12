/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object holding data that describes a network token
 */
public class NetworkTokenData {

    private String networkToken;

    private String tokenExpiryDate;

    private String tokenReferenceId;

    /**
     * The network token alternative for the full Permanent Account Number. To receive a non-obfuscated network token please contact your account manager.
     */
    public String getNetworkToken() {
        return networkToken;
    }

    /**
     * The network token alternative for the full Permanent Account Number. To receive a non-obfuscated network token please contact your account manager.
     */
    public void setNetworkToken(String value) {
        this.networkToken = value;
    }

    /**
     * The expiry date of the network token.
     */
    public String getTokenExpiryDate() {
        return tokenExpiryDate;
    }

    /**
     * The expiry date of the network token.
     */
    public void setTokenExpiryDate(String value) {
        this.tokenExpiryDate = value;
    }

    /**
     * A unique identifier that can be used with Visa Token Service (VTS) or Mastercard Digital Enablement Service (MDES) to retrieve token details. It remains valid as long as the token is valid. Note: A prefix "V:" is added to show that this is a network token for a Visa product and "M:" to show that this is a network token for a Mastercard product. 
     */
    public String getTokenReferenceId() {
        return tokenReferenceId;
    }

    /**
     * A unique identifier that can be used with Visa Token Service (VTS) or Mastercard Digital Enablement Service (MDES) to retrieve token details. It remains valid as long as the token is valid. Note: A prefix "V:" is added to show that this is a network token for a Visa product and "M:" to show that this is a network token for a Mastercard product. 
     */
    public void setTokenReferenceId(String value) {
        this.tokenReferenceId = value;
    }
}
