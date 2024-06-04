/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AbstractThreeDSecure {

    private AmountOfMoney authenticationAmount;

    private String authenticationFlow;

    private String challengeCanvasSize;

    private String challengeIndicator;

    private String exemptionRequest;

    private ThreeDSecureData priorThreeDSecureData;

    private SdkDataInput sdkData;

    private Boolean skipAuthentication;

    private String transactionRiskLevel;

    public AmountOfMoney getAuthenticationAmount() {
        return authenticationAmount;
    }

    public void setAuthenticationAmount(AmountOfMoney value) {
        this.authenticationAmount = value;
    }

    public String getAuthenticationFlow() {
        return authenticationFlow;
    }

    public void setAuthenticationFlow(String value) {
        this.authenticationFlow = value;
    }

    public String getChallengeCanvasSize() {
        return challengeCanvasSize;
    }

    public void setChallengeCanvasSize(String value) {
        this.challengeCanvasSize = value;
    }

    public String getChallengeIndicator() {
        return challengeIndicator;
    }

    public void setChallengeIndicator(String value) {
        this.challengeIndicator = value;
    }

    public String getExemptionRequest() {
        return exemptionRequest;
    }

    public void setExemptionRequest(String value) {
        this.exemptionRequest = value;
    }

    public ThreeDSecureData getPriorThreeDSecureData() {
        return priorThreeDSecureData;
    }

    public void setPriorThreeDSecureData(ThreeDSecureData value) {
        this.priorThreeDSecureData = value;
    }

    public SdkDataInput getSdkData() {
        return sdkData;
    }

    public void setSdkData(SdkDataInput value) {
        this.sdkData = value;
    }

    public Boolean getSkipAuthentication() {
        return skipAuthentication;
    }

    public void setSkipAuthentication(Boolean value) {
        this.skipAuthentication = value;
    }

    public String getTransactionRiskLevel() {
        return transactionRiskLevel;
    }

    public void setTransactionRiskLevel(String value) {
        this.transactionRiskLevel = value;
    }
}
