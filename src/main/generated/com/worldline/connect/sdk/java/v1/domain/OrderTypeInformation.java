/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class OrderTypeInformation {

    private String fundingType;

    private String purchaseType;

    private String transactionType;

    private String usageType;

    /**
     * Identifies the funding type being authenticated. Possible values are:<ul class="paragraph-width">
     * <li>personToPerson = When it is person to person funding (P2P)
     * <li>agentCashOut = When fund is being paid out to final recipient in Cash by company's agent.
     * <li>businessToConsumer = When fund is being transferred from business to consumer (B2C)
     * <li>businessToBusiness = When fund is being transferred from business to business (B2B)
     * <li>prefundingStagedWallet = When funding is being used to load the funds into the wallet account.
     * <li>storedValueDigitalWallet = When funding is being used to load the funds into a stored value digital wallet.
     * <li>fundingGiftCardForPersonalUse = When funding a gift card for personal use.
     * <li>fundingGiftCardForSomeoneElse = When funding a gift card for someone else.</ul>
     */
    public String getFundingType() {
        return fundingType;
    }

    /**
     * Identifies the funding type being authenticated. Possible values are:<ul class="paragraph-width">
     * <li>personToPerson = When it is person to person funding (P2P)
     * <li>agentCashOut = When fund is being paid out to final recipient in Cash by company's agent.
     * <li>businessToConsumer = When fund is being transferred from business to consumer (B2C)
     * <li>businessToBusiness = When fund is being transferred from business to business (B2B)
     * <li>prefundingStagedWallet = When funding is being used to load the funds into the wallet account.
     * <li>storedValueDigitalWallet = When funding is being used to load the funds into a stored value digital wallet.
     * <li>fundingGiftCardForPersonalUse = When funding a gift card for personal use.
     * <li>fundingGiftCardForSomeoneElse = When funding a gift card for someone else.</ul>
     */
    public void setFundingType(String value) {
        this.fundingType = value;
    }

    /**
     * Possible values are:<ul class="paragraph-width">
     * <li>physical
     * <li>digital
     * </ul>
     */
    public String getPurchaseType() {
        return purchaseType;
    }

    /**
     * Possible values are:<ul class="paragraph-width">
     * <li>physical
     * <li>digital
     * </ul>
     */
    public void setPurchaseType(String value) {
        this.purchaseType = value;
    }

    /**
     * Identifies the type of transaction being authenticated.
     * Possible values are:<ul class="paragraph-width">
     * <li>purchase = The purpose of the transaction is to purchase goods or services (Default)
     * <li>check-acceptance = The purpose of the transaction is to accept a 'check'/'cheque'
     * <li>account-funding = The purpose of the transaction is to fund an account
     * <li>quasi-cash = The purpose of the transaction is to buy a quasi cash type product that is representative of actual cash such as money orders, traveler's checks, foreign currency, lottery tickets or casino gaming chips
     * <li>prepaid-activation-or-load = The purpose of the transaction is to activate or load a prepaid card
     * </ul>
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Identifies the type of transaction being authenticated.
     * Possible values are:<ul class="paragraph-width">
     * <li>purchase = The purpose of the transaction is to purchase goods or services (Default)
     * <li>check-acceptance = The purpose of the transaction is to accept a 'check'/'cheque'
     * <li>account-funding = The purpose of the transaction is to fund an account
     * <li>quasi-cash = The purpose of the transaction is to buy a quasi cash type product that is representative of actual cash such as money orders, traveler's checks, foreign currency, lottery tickets or casino gaming chips
     * <li>prepaid-activation-or-load = The purpose of the transaction is to activate or load a prepaid card
     * </ul>
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Possible values are:<ul class="paragraph-width">
     * <li>private
     * <li>commercial
     * </ul>
     */
    public String getUsageType() {
        return usageType;
    }

    /**
     * Possible values are:<ul class="paragraph-width">
     * <li>private
     * <li>commercial
     * </ul>
     */
    public void setUsageType(String value) {
        this.usageType = value;
    }
}
