/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AbstractRedirectPaymentMethodSpecificInput extends AbstractPaymentMethodSpecificInput {

    private Integer expirationPeriod;

    private String recurringPaymentSequenceIndicator;

    private Boolean requiresApproval;

    private String token;

    private Boolean tokenize;

    public Integer getExpirationPeriod() {
        return expirationPeriod;
    }

    public void setExpirationPeriod(Integer value) {
        this.expirationPeriod = value;
    }

    public String getRecurringPaymentSequenceIndicator() {
        return recurringPaymentSequenceIndicator;
    }

    public void setRecurringPaymentSequenceIndicator(String value) {
        this.recurringPaymentSequenceIndicator = value;
    }

    public Boolean getRequiresApproval() {
        return requiresApproval;
    }

    public void setRequiresApproval(Boolean value) {
        this.requiresApproval = value;
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
}
