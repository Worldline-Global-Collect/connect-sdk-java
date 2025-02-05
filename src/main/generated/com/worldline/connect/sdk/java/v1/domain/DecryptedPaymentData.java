/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class DecryptedPaymentData {

    private String authMethod;

    private String cardholderName;

    private String cryptogram;

    private String dpan;

    private Integer eci;

    private String expiryDate;

    private String pan;

    private String paymentMethod;

    /**
     * The type of payment credential which the customer used.
     * <ul class="paragraph-width">
     * <li>For Google Pay, maps to the paymentMethodDetails.authMethod property in the encrypted payment data.
     * </ul>.
     *
     * @deprecated Use decryptedPaymentData.paymentMethod instead
     */
    @Deprecated
    public String getAuthMethod() {
        return authMethod;
    }

    /**
     * The type of payment credential which the customer used.
     * <ul class="paragraph-width">
     * <li>For Google Pay, maps to the paymentMethodDetails.authMethod property in the encrypted payment data.
     * </ul>.
     *
     * @deprecated Use decryptedPaymentData.paymentMethod instead
     */
    @Deprecated
    public void setAuthMethod(String value) {
        this.authMethod = value;
    }

    /**
     * The card holder's name on the card. Minimum length of 2, maximum length of 51 characters.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the cardholderName property in the encrypted payment data.
     * <li>For Google Pay this is not available in the encrypted payment data, and can be omitted.
     * </ul>
     */
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * The card holder's name on the card. Minimum length of 2, maximum length of 51 characters.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the cardholderName property in the encrypted payment data.
     * <li>For Google Pay this is not available in the encrypted payment data, and can be omitted.
     * </ul>
     */
    public void setCardholderName(String value) {
        this.cardholderName = value;
    }

    /**
     * The 3D secure online payment cryptogram.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the paymentData.onlinePaymentCryptogram property in the encrypted payment data.
     * <li>For Google Pay, maps to the paymentMethodDetails.cryptogram property in the encrypted payment data.
     * </ul>
     * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
     */
    public String getCryptogram() {
        return cryptogram;
    }

    /**
     * The 3D secure online payment cryptogram.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the paymentData.onlinePaymentCryptogram property in the encrypted payment data.
     * <li>For Google Pay, maps to the paymentMethodDetails.cryptogram property in the encrypted payment data.
     * </ul>
     * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
     */
    public void setCryptogram(String value) {
        this.cryptogram = value;
    }

    /**
     * The device specific PAN.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the applicationPrimaryAccountNumber property in the encrypted payment data.
     * <li>For Google Pay, maps to the paymentMethodDetails.dpan property in the encrypted payment data.
     * </ul>
     * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
     */
    public String getDpan() {
        return dpan;
    }

    /**
     * The device specific PAN.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the applicationPrimaryAccountNumber property in the encrypted payment data.
     * <li>For Google Pay, maps to the paymentMethodDetails.dpan property in the encrypted payment data.
     * </ul>
     * Not allowed for Google Pay if the authMethod in the response of Google is PAN_ONLY.
     */
    public void setDpan(String value) {
        this.dpan = value;
    }

    /**
     * The eci is Electronic Commerce Indicator.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the paymentData.eciIndicator property in the encrypted payment data.
     * <li>For Google Pay, maps to the paymentMethodDetails.eciIndicator property in the encrypted payment data.
     * </ul>
     */
    public Integer getEci() {
        return eci;
    }

    /**
     * The eci is Electronic Commerce Indicator.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the paymentData.eciIndicator property in the encrypted payment data.
     * <li>For Google Pay, maps to the paymentMethodDetails.eciIndicator property in the encrypted payment data.
     * </ul>
     */
    public void setEci(Integer value) {
        this.eci = value;
    }

    /**
     * Expiry date of the card<br>
     * Format: MMYY.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the applicationExpirationDate property in the encrypted payment data. This property is formatted as YYMMDD, so this needs to be converted to get a correctly formatted expiry date.
     * <li>For Google Pay, maps to the paymentMethodDetails.expirationMonth and paymentMethodDetails.expirationYear properties in the encrypted payment data. These need to be combined to get a correctly formatted expiry date.
     * </ul>
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Expiry date of the card<br>
     * Format: MMYY.
     * <ul class="paragraph-width">
     * <li>For Apple Pay, maps to the applicationExpirationDate property in the encrypted payment data. This property is formatted as YYMMDD, so this needs to be converted to get a correctly formatted expiry date.
     * <li>For Google Pay, maps to the paymentMethodDetails.expirationMonth and paymentMethodDetails.expirationYear properties in the encrypted payment data. These need to be combined to get a correctly formatted expiry date.
     * </ul>
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * The non-device specific complete credit/debit card number (also know as the PAN).
     * <ul class="paragraph-width">
     * <li>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
     * <li>For Google Pay, maps to the paymentMethodDetails.pan property in the encrypted payment data.
     * </ul>
     * Not allowed for Google Pay if the authMethod in the response of Google is CRYPTOGRAM_3DS.
     */
    public String getPan() {
        return pan;
    }

    /**
     * The non-device specific complete credit/debit card number (also know as the PAN).
     * <ul class="paragraph-width">
     * <li>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
     * <li>For Google Pay, maps to the paymentMethodDetails.pan property in the encrypted payment data.
     * </ul>
     * Not allowed for Google Pay if the authMethod in the response of Google is CRYPTOGRAM_3DS.
     */
    public void setPan(String value) {
        this.pan = value;
    }

    /**
     * <ul class="paragraph-width">
     * <li>In case Google provides in the response as authMethod: CRYPTOGRAM_3DS send in as value of this property TOKENIZED_CARD.
     * <li>In case Google provides in the response as authMethod: PAN_ONLY send in as value of this property CARD.
     * </ul>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * <ul class="paragraph-width">
     * <li>In case Google provides in the response as authMethod: CRYPTOGRAM_3DS send in as value of this property TOKENIZED_CARD.
     * <li>In case Google provides in the response as authMethod: PAN_ONLY send in as value of this property CARD.
     * </ul>For Apple Pay this is not available in the encrypted payment data, and must be omitted.
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }
}
