/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Scheme onboarding value returned for the card products supporting Click to Pay with Visa.
 */
public class ClickToPayConfigurationVisa extends ClickToPaySchemeConfigurationBase {

    private String encryptionKey;

    private String nModulus;

    /**
     * Key ID of the encryption key to encrypt card information before sending it to Visa.
     */
    public String getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * Key ID of the encryption key to encrypt card information before sending it to Visa.
     */
    public void setEncryptionKey(String value) {
        this.encryptionKey = value;
    }

    /**
     * Modulus of the encryption key to encrypt card information before sending it to Visa.
     */
    public String getNModulus() {
        return nModulus;
    }

    /**
     * Modulus of the encryption key to encrypt card information before sending it to Visa.
     */
    public void setNModulus(String value) {
        this.nModulus = value;
    }
}
