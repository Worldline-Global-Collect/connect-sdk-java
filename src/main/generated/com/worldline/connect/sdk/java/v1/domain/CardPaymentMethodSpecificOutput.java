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

    private Boolean clickToPayUsed;

    private CardFraudResults fraudResults;

    private String initialSchemeTransactionId;

    private NetworkTokenData networkTokenData;

    private Boolean networkTokenUsed;

    private String originalTransactionLinkId;

    private String paymentAccountReference;

    private String schemeTransactionId;

    private ThreeDSecureResults threeDSecureResults;

    private String token;

    private String transactionLinkId;

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
     * Indicates if a Click to Pay token was used during the payment.
     */
    public Boolean getClickToPayUsed() {
        return clickToPayUsed;
    }

    /**
     * Indicates if a Click to Pay token was used during the payment.
     */
    public void setClickToPayUsed(Boolean value) {
        this.clickToPayUsed = value;
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
     * The unique Mastercard transactionLinkId of the initial transaction. Strongly advised to be submitted for any merchantInitiated (unscheduledCardOnFileRequestor) or recurring transaction (recurringPaymentSequenceIndicator set to recurring or in case of a last recurring transaction to last).<br><br>If the originalTransactionLinkId is empty, we will, where possible, apply the best available match.
     */
    public String getOriginalTransactionLinkId() {
        return originalTransactionLinkId;
    }

    /**
     * The unique Mastercard transactionLinkId of the initial transaction. Strongly advised to be submitted for any merchantInitiated (unscheduledCardOnFileRequestor) or recurring transaction (recurringPaymentSequenceIndicator set to recurring or in case of a last recurring transaction to last).<br><br>If the originalTransactionLinkId is empty, we will, where possible, apply the best available match.
     */
    public void setOriginalTransactionLinkId(String value) {
        this.originalTransactionLinkId = value;
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

    /**
     * The unique Mastercard transactionLinkId of this transaction.<br>Should be stored by you for a first cardholderInitiated (unscheduledCardOnFileRequestor) or zero-value authorization transaction.<br><br>Use this value as the originalTransactionLinkId for any subsequent merchantInitiated (unscheduledCardOnFileRequestor) or recurring transaction (recurringPaymentSequenceIndicator set to recurring or in case of a last recurring transaction to last).
     */
    public String getTransactionLinkId() {
        return transactionLinkId;
    }

    /**
     * The unique Mastercard transactionLinkId of this transaction.<br>Should be stored by you for a first cardholderInitiated (unscheduledCardOnFileRequestor) or zero-value authorization transaction.<br><br>Use this value as the originalTransactionLinkId for any subsequent merchantInitiated (unscheduledCardOnFileRequestor) or recurring transaction (recurringPaymentSequenceIndicator set to recurring or in case of a last recurring transaction to last).
     */
    public void setTransactionLinkId(String value) {
        this.transactionLinkId = value;
    }
}
