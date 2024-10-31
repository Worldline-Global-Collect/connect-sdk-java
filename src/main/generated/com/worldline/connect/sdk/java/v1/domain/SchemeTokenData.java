/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class SchemeTokenData {

    private String cardholderName;

    private String cryptogram;

    private String eci;

    private String networkToken;

    private String tokenExpiryDate;

    /**
     * The card holder's name on the card. Minimum length of 2, maximum length of 51 characters.
     */
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * The card holder's name on the card. Minimum length of 2, maximum length of 51 characters.
     */
    public void setCardholderName(String value) {
        this.cardholderName = value;
    }

    /**
     * The Token Cryptogram is a dynamic one-time use value that is used to verify the authenticity of the transaction and the integrity of the data used in the generation of the Token Cryptogram. Visa calls this the Token Authentication Verification Value (TAVV) cryptogram.
     */
    public String getCryptogram() {
        return cryptogram;
    }

    /**
     * The Token Cryptogram is a dynamic one-time use value that is used to verify the authenticity of the transaction and the integrity of the data used in the generation of the Token Cryptogram. Visa calls this the Token Authentication Verification Value (TAVV) cryptogram.
     */
    public void setCryptogram(String value) {
        this.cryptogram = value;
    }

    /**
     * The Electronic Commerce Indicator you got with the Token Cryptogram
     */
    public String getEci() {
        return eci;
    }

    /**
     * The Electronic Commerce Indicator you got with the Token Cryptogram
     */
    public void setEci(String value) {
        this.eci = value;
    }

    /**
     * The network token. Note: This is called Payment Token in the EMVCo documentation
     */
    public String getNetworkToken() {
        return networkToken;
    }

    /**
     * The network token. Note: This is called Payment Token in the EMVCo documentation
     */
    public void setNetworkToken(String value) {
        this.networkToken = value;
    }

    /**
     * The expiry date of the network token
     */
    public String getTokenExpiryDate() {
        return tokenExpiryDate;
    }

    /**
     * The expiry date of the network token
     */
    public void setTokenExpiryDate(String value) {
        this.tokenExpiryDate = value;
    }
}
