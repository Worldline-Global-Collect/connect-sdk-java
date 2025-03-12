/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Card payment specific response data
 */
public class CardPaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

    private String authorisationCode;

    private CardEssentials card;

    private CardFraudResults fraudResults;

    private String initialSchemeTransactionId;

    private NetworkTokenData networkTokenData;

    private Boolean networkTokenUsed;

    private String paymentAccountReference;

    private String schemeTransactionId;

    private ThreeDSecureResults threeDSecureResults;

    private String token;

    /**
     * Card Authorization code as returned by the acquirer
     */
    public String getAuthorisationCode() {
        return authorisationCode;
    }

    /**
     * Card Authorization code as returned by the acquirer
     */
    public void setAuthorisationCode(String value) {
        this.authorisationCode = value;
    }

    /**
     * Object containing card details
     */
    public CardEssentials getCard() {
        return card;
    }

    /**
     * Object containing card details
     */
    public void setCard(CardEssentials value) {
        this.card = value;
    }

    /**
     * Fraud results contained in the CardFraudResults object
     */
    public CardFraudResults getFraudResults() {
        return fraudResults;
    }

    /**
     * Fraud results contained in the CardFraudResults object
     */
    public void setFraudResults(CardFraudResults value) {
        this.fraudResults = value;
    }

    /**
     * The unique scheme transactionId of the initial transaction that was performed with SCA.<br>Should be stored by the merchant to allow it to be submitted in future transactions.
     */
    public String getInitialSchemeTransactionId() {
        return initialSchemeTransactionId;
    }

    /**
     * The unique scheme transactionId of the initial transaction that was performed with SCA.<br>Should be stored by the merchant to allow it to be submitted in future transactions.
     */
    public void setInitialSchemeTransactionId(String value) {
        this.initialSchemeTransactionId = value;
    }

    /**
     * Object holding data that describes a network token.
     */
    public NetworkTokenData getNetworkTokenData() {
        return networkTokenData;
    }

    /**
     * Object holding data that describes a network token.
     */
    public void setNetworkTokenData(NetworkTokenData value) {
        this.networkTokenData = value;
    }

    /**
     * Indicates if a network token was used during the payment.
     */
    public Boolean getNetworkTokenUsed() {
        return networkTokenUsed;
    }

    /**
     * Indicates if a network token was used during the payment.
     */
    public void setNetworkTokenUsed(Boolean value) {
        this.networkTokenUsed = value;
    }

    /**
     * A unique reference to the primary account number. Payment Account Reference provides a consolidated view of transactions associated with a PAN and its affiliated tokens, making it easier to identify customers and their associated transactions across payment channels.
     */
    public String getPaymentAccountReference() {
        return paymentAccountReference;
    }

    /**
     * A unique reference to the primary account number. Payment Account Reference provides a consolidated view of transactions associated with a PAN and its affiliated tokens, making it easier to identify customers and their associated transactions across payment channels.
     */
    public void setPaymentAccountReference(String value) {
        this.paymentAccountReference = value;
    }

    /**
     * The unique scheme transactionId of this transaction.<br>Should be stored by the merchant to allow it to be submitted in future transactions. Use this value in case the initialSchemeTransactionId property is empty.
     */
    public String getSchemeTransactionId() {
        return schemeTransactionId;
    }

    /**
     * The unique scheme transactionId of this transaction.<br>Should be stored by the merchant to allow it to be submitted in future transactions. Use this value in case the initialSchemeTransactionId property is empty.
     */
    public void setSchemeTransactionId(String value) {
        this.schemeTransactionId = value;
    }

    /**
     * 3D Secure results object
     */
    public ThreeDSecureResults getThreeDSecureResults() {
        return threeDSecureResults;
    }

    /**
     * 3D Secure results object
     */
    public void setThreeDSecureResults(ThreeDSecureResults value) {
        this.threeDSecureResults = value;
    }

    /**
     * If a token was used for or created during the payment, then the ID of that token.
     */
    public String getToken() {
        return token;
    }

    /**
     * If a token was used for or created during the payment, then the ID of that token.
     */
    public void setToken(String value) {
        this.token = value;
    }
}
