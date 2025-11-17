/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object containing 3D secure details.
 */
public class ExternalCardholderAuthenticationData {

    private String acsTransactionId;

    private String appliedExemption;

    private String cavv;

    private String cavvAlgorithm;

    private String directoryServerTransactionId;

    private Integer eci;

    private Integer schemeRiskScore;

    private String threeDSecureVersion;

    private String threeDServerTransactionId;

    private String validationResult;

    private String xid;

    /**
     * Identifier of the authenticated transaction at the ACS/Issuer.
     */
    public String getAcsTransactionId() {
        return acsTransactionId;
    }

    /**
     * Identifier of the authenticated transaction at the ACS/Issuer.
     */
    public void setAcsTransactionId(String value) {
        this.acsTransactionId = value;
    }

    /**
     * When you request an exemptions via your non-Worldline 3D Secure provider successfully, you need to provide in this property the exemption that was granted, in combination with all 3DS results given by issuer.<br>Possible values:<ul><li>transaction-risk-analysis - You have determined that this transaction is of low risk and are willing to take the liability. Please note that your fraud rate needs to stay below thresholds to allow your use of this exemption.</li><li>low-value - The value of the transaction is below 30 EUR. Please note that the issuer will still require every 5th low-value transaction pithing 24 hours to be strongly authenticated. The issuer will also keep track of the cumulative amount authorized on the card. When this exceeds 100 EUR strong customer authentication is also required.</li><li>whitelist - You have been whitelisted by the customer at the issuer.</li></ul>
     */
    public String getAppliedExemption() {
        return appliedExemption;
    }

    /**
     * When you request an exemptions via your non-Worldline 3D Secure provider successfully, you need to provide in this property the exemption that was granted, in combination with all 3DS results given by issuer.<br>Possible values:<ul><li>transaction-risk-analysis - You have determined that this transaction is of low risk and are willing to take the liability. Please note that your fraud rate needs to stay below thresholds to allow your use of this exemption.</li><li>low-value - The value of the transaction is below 30 EUR. Please note that the issuer will still require every 5th low-value transaction pithing 24 hours to be strongly authenticated. The issuer will also keep track of the cumulative amount authorized on the card. When this exceeds 100 EUR strong customer authentication is also required.</li><li>whitelist - You have been whitelisted by the customer at the issuer.</li></ul>
     */
    public void setAppliedExemption(String value) {
        this.appliedExemption = value;
    }

    /**
     * The CAVV (cardholder authentication verification value) or AAV (accountholder authentication value) provides an authentication validation value.
     */
    public String getCavv() {
        return cavv;
    }

    /**
     * The CAVV (cardholder authentication verification value) or AAV (accountholder authentication value) provides an authentication validation value.
     */
    public void setCavv(String value) {
        this.cavv = value;
    }

    /**
     * The algorithm, from your 3D Secure provider, used to generate the authentication CAVV.
     */
    public String getCavvAlgorithm() {
        return cavvAlgorithm;
    }

    /**
     * The algorithm, from your 3D Secure provider, used to generate the authentication CAVV.
     */
    public void setCavvAlgorithm(String value) {
        this.cavvAlgorithm = value;
    }

    /**
     * The 3-D Secure Directory Server transaction ID that is used for the 3D Authentication
     */
    public String getDirectoryServerTransactionId() {
        return directoryServerTransactionId;
    }

    /**
     * The 3-D Secure Directory Server transaction ID that is used for the 3D Authentication
     */
    public void setDirectoryServerTransactionId(String value) {
        this.directoryServerTransactionId = value;
    }

    /**
     * Electronic Commerce Indicator provides authentication validation results returned after AUTHENTICATIONVALIDATION
     * <ul class="paragraph-width"><li>0 = No authentication, Internet (no liability shift, not a 3D Secure transaction)
     * <li>1 = Authentication attempted (MasterCard)
     * <li>2 = Successful authentication (MasterCard)
     * <li>5 = Successful authentication (Visa, Diners Club, Amex)
     * <li>6 = Authentication attempted (Visa, Diners Club, Amex)
     * <li>7 = No authentication, Internet (no liability shift, not a 3D Secure transaction)
     * <li>(empty) = Not checked or not enrolled
     * </ul>
     */
    public Integer getEci() {
        return eci;
    }

    /**
     * Electronic Commerce Indicator provides authentication validation results returned after AUTHENTICATIONVALIDATION
     * <ul class="paragraph-width"><li>0 = No authentication, Internet (no liability shift, not a 3D Secure transaction)
     * <li>1 = Authentication attempted (MasterCard)
     * <li>2 = Successful authentication (MasterCard)
     * <li>5 = Successful authentication (Visa, Diners Club, Amex)
     * <li>6 = Authentication attempted (Visa, Diners Club, Amex)
     * <li>7 = No authentication, Internet (no liability shift, not a 3D Secure transaction)
     * <li>(empty) = Not checked or not enrolled
     * </ul>
     */
    public void setEci(Integer value) {
        this.eci = value;
    }

    /**
     * Global score calculated by the Carte Bancaire (130) Scoring platform. Possible values from 0 to 99.
     */
    public Integer getSchemeRiskScore() {
        return schemeRiskScore;
    }

    /**
     * Global score calculated by the Carte Bancaire (130) Scoring platform. Possible values from 0 to 99.
     */
    public void setSchemeRiskScore(Integer value) {
        this.schemeRiskScore = value;
    }

    /**
     * The 3-D Secure version used for the authentication. Possible values:
     * <ul class="paragraph-width">
     * <li>v1
     * <li>v2
     * <li>1.0.2
     * <li>2.1.0
     * <li>2.2.0
     * <li>2.3
     * <li>2.3.0
     * <li>2.3.1
     * <li>2.3.1.1
     * </ul>
     */
    public String getThreeDSecureVersion() {
        return threeDSecureVersion;
    }

    /**
     * The 3-D Secure version used for the authentication. Possible values:
     * <ul class="paragraph-width">
     * <li>v1
     * <li>v2
     * <li>1.0.2
     * <li>2.1.0
     * <li>2.2.0
     * <li>2.3
     * <li>2.3.0
     * <li>2.3.1
     * <li>2.3.1.1
     * </ul>
     */
    public void setThreeDSecureVersion(String value) {
        this.threeDSecureVersion = value;
    }

    /**
     * The 3-D Secure Server transaction ID that is used for the 3-D Secure version 2 Authentication.
     *
     * @deprecated No replacement
     */
    @Deprecated
    public String getThreeDServerTransactionId() {
        return threeDServerTransactionId;
    }

    /**
     * The 3-D Secure Server transaction ID that is used for the 3-D Secure version 2 Authentication.
     *
     * @deprecated No replacement
     */
    @Deprecated
    public void setThreeDServerTransactionId(String value) {
        this.threeDServerTransactionId = value;
    }

    /**
     * The 3D Secure authentication result from your 3D Secure provider.
     */
    public String getValidationResult() {
        return validationResult;
    }

    /**
     * The 3D Secure authentication result from your 3D Secure provider.
     */
    public void setValidationResult(String value) {
        this.validationResult = value;
    }

    /**
     * The transaction ID that is used for the 3D Authentication
     */
    public String getXid() {
        return xid;
    }

    /**
     * The transaction ID that is used for the 3D Authentication
     */
    public void setXid(String value) {
        this.xid = value;
    }
}
