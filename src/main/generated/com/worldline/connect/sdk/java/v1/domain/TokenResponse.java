/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class TokenResponse {

    private TokenCard card = null;

    private TokenEWallet eWallet = null;

    private String id = null;

    private TokenNonSepaDirectDebit nonSepaDirectDebit = null;

    private String originalPaymentId = null;

    private Integer paymentProductId = null;

    private TokenSepaDirectDebit sepaDirectDebit = null;

    /**
     * Object containing card details
     */
    public TokenCard getCard() {
        return card;
    }

    /**
     * Object containing card details
     */
    public void setCard(TokenCard value) {
        this.card = value;
    }

    /**
     * Object containing eWallet details
     */
    public TokenEWallet getEWallet() {
        return eWallet;
    }

    /**
     * Object containing eWallet details
     */
    public void setEWallet(TokenEWallet value) {
        this.eWallet = value;
    }

    /**
     * ID of the token
     */
    public String getId() {
        return id;
    }

    /**
     * ID of the token
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Object containing the non SEPA Direct Debit details
     */
    public TokenNonSepaDirectDebit getNonSepaDirectDebit() {
        return nonSepaDirectDebit;
    }

    /**
     * Object containing the non SEPA Direct Debit details
     */
    public void setNonSepaDirectDebit(TokenNonSepaDirectDebit value) {
        this.nonSepaDirectDebit = value;
    }

    /**
     * The initial Payment ID of the transaction from which the token has been created
     */
    public String getOriginalPaymentId() {
        return originalPaymentId;
    }

    /**
     * The initial Payment ID of the transaction from which the token has been created
     */
    public void setOriginalPaymentId(String value) {
        this.originalPaymentId = value;
    }

    /**
     * Payment product identifier<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
     */
    public Integer getPaymentProductId() {
        return paymentProductId;
    }

    /**
     * Payment product identifier<br>
     * Please see <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/paymentproducts.html">payment products</a> for a full overview of possible values.
     */
    public void setPaymentProductId(Integer value) {
        this.paymentProductId = value;
    }

    /**
     * Object containing the SEPA Direct Debit details
     */
    public TokenSepaDirectDebit getSepaDirectDebit() {
        return sepaDirectDebit;
    }

    /**
     * Object containing the SEPA Direct Debit details
     */
    public void setSepaDirectDebit(TokenSepaDirectDebit value) {
        this.sepaDirectDebit = value;
    }
}
