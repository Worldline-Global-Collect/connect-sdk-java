/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CreateTokenRequest {

    private TokenCard card;

    private TokenEWallet eWallet;

    private String encryptedCustomerInput;

    private TokenNonSepaDirectDebit nonSepaDirectDebit;

    private Integer paymentProductId;

    private TokenSepaDirectDebitWithoutCreditor sepaDirectDebit;

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
     * Data that was encrypted client side containing all customer entered data elements like card data.<br>
     * Note: Because this data can only be submitted once to our system and contains encrypted card data you should not store it. As the data was captured within the context of a client session you also need to submit it to us before the session has expired.
     */
    public String getEncryptedCustomerInput() {
        return encryptedCustomerInput;
    }

    /**
     * Data that was encrypted client side containing all customer entered data elements like card data.<br>
     * Note: Because this data can only be submitted once to our system and contains encrypted card data you should not store it. As the data was captured within the context of a client session you also need to submit it to us before the session has expired.
     */
    public void setEncryptedCustomerInput(String value) {
        this.encryptedCustomerInput = value;
    }

    /**
     * Object containing non SEPA Direct Debit details
     */
    public TokenNonSepaDirectDebit getNonSepaDirectDebit() {
        return nonSepaDirectDebit;
    }

    /**
     * Object containing non SEPA Direct Debit details
     */
    public void setNonSepaDirectDebit(TokenNonSepaDirectDebit value) {
        this.nonSepaDirectDebit = value;
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
     * Object containing SEPA Direct Debit details
     */
    public TokenSepaDirectDebitWithoutCreditor getSepaDirectDebit() {
        return sepaDirectDebit;
    }

    /**
     * Object containing SEPA Direct Debit details
     */
    public void setSepaDirectDebit(TokenSepaDirectDebitWithoutCreditor value) {
        this.sepaDirectDebit = value;
    }
}
