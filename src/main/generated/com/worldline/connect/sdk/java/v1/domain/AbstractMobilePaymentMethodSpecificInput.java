/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AbstractMobilePaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

    private String authorizationMode;

    private String customerReference;

    private String initialSchemeTransactionId;

    private CardRecurrenceDetails recurring;

    private Boolean requiresApproval;

    private Boolean skipFraudService;

    private String token;

    private Boolean tokenize;

    private String unscheduledCardOnFileRequestor;

    private String unscheduledCardOnFileSequenceIndicator;

    public String getAuthorizationMode() {
        return authorizationMode;
    }

    public void setAuthorizationMode(String value) {
        this.authorizationMode = value;
    }

    public String getCustomerReference() {
        return customerReference;
    }

    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    public String getInitialSchemeTransactionId() {
        return initialSchemeTransactionId;
    }

    public void setInitialSchemeTransactionId(String value) {
        this.initialSchemeTransactionId = value;
    }

    public CardRecurrenceDetails getRecurring() {
        return recurring;
    }

    public void setRecurring(CardRecurrenceDetails value) {
        this.recurring = value;
    }

    public Boolean getRequiresApproval() {
        return requiresApproval;
    }

    public void setRequiresApproval(Boolean value) {
        this.requiresApproval = value;
    }

    public Boolean getSkipFraudService() {
        return skipFraudService;
    }

    public void setSkipFraudService(Boolean value) {
        this.skipFraudService = value;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String value) {
        this.token = value;
    }

    public Boolean getTokenize() {
        return tokenize;
    }

    public void setTokenize(Boolean value) {
        this.tokenize = value;
    }

    public String getUnscheduledCardOnFileRequestor() {
        return unscheduledCardOnFileRequestor;
    }

    public void setUnscheduledCardOnFileRequestor(String value) {
        this.unscheduledCardOnFileRequestor = value;
    }

    public String getUnscheduledCardOnFileSequenceIndicator() {
        return unscheduledCardOnFileSequenceIndicator;
    }

    public void setUnscheduledCardOnFileSequenceIndicator(String value) {
        this.unscheduledCardOnFileSequenceIndicator = value;
    }
}
