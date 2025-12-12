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
     * <p><strong>ECI (Electronic Commerce Indicator)</strong> indicates the level of authentication obtained for a transaction. Possible values for each level of authentication are listed below.</p>
     *  
     * <ul class="paragraph-width">
     * <li style="margin-bottom: 10px"><strong>For ValidationResult = Y (Successful Authentication)</strong>
     * <ul>
     * <li>MC &amp;#8594; ECI 02</li>
     * <li>Visa, CB, Amex, JCB, DCI, UPI &amp;#8594; ECI 05</li>
     * </ul>
     * </li>
     * <li style="margin-bottom: 10px"><strong>For ValidationResult = A (Attempt)</strong>
     * <ul>
     * <li>MC &amp;#8594; ECI 01</li>
     * <li>Visa, Amex, JCB, DCI, UPI &amp;#8594; ECI 06</li>
     * <li>CB &amp;#8594; 06 (or null from ACS - populate as 06)</li>
     * </ul>
     * </li>
     * <li><strong>For ValidationResult = I (Exemption Accepted)</strong>- for all below values, ECI must be sent with the resulted CAVV
     * <ul>
     * <li>MC &amp;#8594; ECI 06 (PSD2 Exemption)</li>
     * <li>Visa &amp;#8594; ECI 07 (TRA Exemption) or ECI 05 (other exemptions)</li>
     * <li>CB, JCB, UPI &amp;#8594; ECI 05</li>
     * <li>Amex, DCI &amp;#8594; ECI 05/0</li>
     * </ul>
     * </li>
     * </ul>
     */
    public Integer getEci() {
        return eci;
    }

    /**
     * <p><strong>ECI (Electronic Commerce Indicator)</strong> indicates the level of authentication obtained for a transaction. Possible values for each level of authentication are listed below.</p>
     *  
     * <ul class="paragraph-width">
     * <li style="margin-bottom: 10px"><strong>For ValidationResult = Y (Successful Authentication)</strong>
     * <ul>
     * <li>MC &amp;#8594; ECI 02</li>
     * <li>Visa, CB, Amex, JCB, DCI, UPI &amp;#8594; ECI 05</li>
     * </ul>
     * </li>
     * <li style="margin-bottom: 10px"><strong>For ValidationResult = A (Attempt)</strong>
     * <ul>
     * <li>MC &amp;#8594; ECI 01</li>
     * <li>Visa, Amex, JCB, DCI, UPI &amp;#8594; ECI 06</li>
     * <li>CB &amp;#8594; 06 (or null from ACS - populate as 06)</li>
     * </ul>
     * </li>
     * <li><strong>For ValidationResult = I (Exemption Accepted)</strong>- for all below values, ECI must be sent with the resulted CAVV
     * <ul>
     * <li>MC &amp;#8594; ECI 06 (PSD2 Exemption)</li>
     * <li>Visa &amp;#8594; ECI 07 (TRA Exemption) or ECI 05 (other exemptions)</li>
     * <li>CB, JCB, UPI &amp;#8594; ECI 05</li>
     * <li>Amex, DCI &amp;#8594; ECI 05/0</li>
     * </ul>
     * </li>
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
     * The transaction status given by the 3D Secure provider. Possible values below: 
     * <ul>
     * <li>Y: Cardholder successfully authenticated</li>
     * <li>A: Authentication attempt (merchant attempted, issuer not participating or ACS unavailable)</li>
     * <li>I: Informational only (SCA exemption accepted)</li>
     * </ul>
     */
    public String getValidationResult() {
        return validationResult;
    }

    /**
     * The transaction status given by the 3D Secure provider. Possible values below: 
     * <ul>
     * <li>Y: Cardholder successfully authenticated</li>
     * <li>A: Authentication attempt (merchant attempted, issuer not participating or ACS unavailable)</li>
     * <li>I: Informational only (SCA exemption accepted)</li>
     * </ul>
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
