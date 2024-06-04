/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AbstractCardPaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

    private String acquirerPromotionCode;

    private String authorizationMode;

    private String customerReference;

    private String initialSchemeTransactionId;

    private CardRecurrenceDetails recurring;

    private String recurringPaymentSequenceIndicator;

    private Boolean requiresApproval;

    private Boolean skipAuthentication;

    private Boolean skipFraudService;

    private String token;

    private Boolean tokenize;

    private String transactionChannel;

    private String unscheduledCardOnFileIndicator;

    private String unscheduledCardOnFileRequestor;

    private String unscheduledCardOnFileSequenceIndicator;

    public String getAcquirerPromotionCode() {
        return acquirerPromotionCode;
    }

    public void setAcquirerPromotionCode(String value) {
        this.acquirerPromotionCode = value;
    }

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

    /**
     * @deprecated Use recurring.recurringPaymentSequenceIndicator instead
     */
    @Deprecated
    public String getRecurringPaymentSequenceIndicator() {
        return recurringPaymentSequenceIndicator;
    }

    /**
     * @deprecated Use recurring.recurringPaymentSequenceIndicator instead
     */
    @Deprecated
    public void setRecurringPaymentSequenceIndicator(String value) {
        this.recurringPaymentSequenceIndicator = value;
    }

    public Boolean getRequiresApproval() {
        return requiresApproval;
    }

    public void setRequiresApproval(Boolean value) {
        this.requiresApproval = value;
    }

    /**
     * @deprecated Use threeDSecure.skipAuthentication instead
     */
    @Deprecated
    public Boolean getSkipAuthentication() {
        return skipAuthentication;
    }

    /**
     * @deprecated Use threeDSecure.skipAuthentication instead
     */
    @Deprecated
    public void setSkipAuthentication(Boolean value) {
        this.skipAuthentication = value;
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

    public String getTransactionChannel() {
        return transactionChannel;
    }

    public void setTransactionChannel(String value) {
        this.transactionChannel = value;
    }

    /**
     * @deprecated Use unscheduledCardOnFileSequenceIndicator instead
     */
    @Deprecated
    public String getUnscheduledCardOnFileIndicator() {
        return unscheduledCardOnFileIndicator;
    }

    /**
     * @deprecated Use unscheduledCardOnFileSequenceIndicator instead
     */
    @Deprecated
    public void setUnscheduledCardOnFileIndicator(String value) {
        this.unscheduledCardOnFileIndicator = value;
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
