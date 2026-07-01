/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MobilePaymentMethodSpecificOutput extends AbstractPaymentMethodSpecificOutput {

    private String authorisationCode;

    private CardFraudResults fraudResults;

    private String initialSchemeTransactionId;

    private String network;

    private String originalTransactionLinkId;

    private MobilePaymentData paymentData;

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
     * The network that was used for the refund
     */
    public String getNetwork() {
        return network;
    }

    /**
     * The network that was used for the refund
     */
    public void setNetwork(String value) {
        this.network = value;
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
     * Object containing payment details
     */
    public MobilePaymentData getPaymentData() {
        return paymentData;
    }

    /**
     * Object containing payment details
     */
    public void setPaymentData(MobilePaymentData value) {
        this.paymentData = value;
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
