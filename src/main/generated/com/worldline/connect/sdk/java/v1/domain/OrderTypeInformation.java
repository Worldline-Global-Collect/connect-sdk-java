/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class OrderTypeInformation {

    private String fundingType;

    private String paymentCode;

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
     * Payment code to support account funding transactions. Possible values are:<br><ul class="paragraph-width"><li>accountManagement</li><li>paymentAllowance</li><li>settlementOfAnnuity</li><li>unemploymentDisabilityBenefit</li><li>businessExpenses</li><li>bonusPayment</li><li>busTransportRelatedBusiness</li><li>cashManagementTransfer</li><li>paymentOfCableTVBill</li><li>governmentInstituteIssued</li><li>creditCardPayment</li><li>creditCardBill</li><li>charity</li><li>collectionPayment</li><li>commercialPayment</li><li>commission</li><li>compensation</li><li>copyright</li><li>debitCardPayment</li><li>deposit</li><li>dividend</li><li>studyFees</li><li>electricityBill</li><li>energies</li><li>generalFees</li><li>ferry</li><li>foreignExchange</li><li>gasBill</li><li>unemployedCompensation</li><li>governmentPayment</li><li>healthInsurance</li><li>reimbursementCreditCard</li><li>reimbursementDebitCard</li><li>carInsurancePremium</li><li>insuranceClaim</li><li>installment</li><li>insurancePremium</li><li>investmentPayment</li><li>intraCompany</li><li>interest</li><li>incomeTax</li><li>investment</li><li>laborInsurance</li><li>licenseFree</li><li>lifeInsurance</li><li>loan</li><li>medicalServices</li><li>mobilePersonToBusiness</li><li>mobilePersonToPerson</li><li>mobileTopUp</li><li>notSpecified</li><li>other</li><li>anotherTelecomBill</li><li>payroll</li><li>pensionFundContribution</li><li>pensionPayment</li><li>telephoneBill</li><li>propertyInsurance</li><li>generalLease</li><li>rent</li><li>railwayPayment</li><li>royalties</li><li>salary</li><li>savingsPayment</li><li>securities</li><li>socialSecurity</li><li>study</li><li>subscription</li><li>supplierPayment</li><li>taxRefund</li><li>taxPayment</li><li>telecommunicationsBill</li><li>tradeServices</li><li>treasuryPayment</li><li>travelPayment</li><li>utilityBill</li><li>valueAddedTaxPayment</li><li>withHolding</li><li>waterBill</li></ul>.
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * Payment code to support account funding transactions. Possible values are:<br><ul class="paragraph-width"><li>accountManagement</li><li>paymentAllowance</li><li>settlementOfAnnuity</li><li>unemploymentDisabilityBenefit</li><li>businessExpenses</li><li>bonusPayment</li><li>busTransportRelatedBusiness</li><li>cashManagementTransfer</li><li>paymentOfCableTVBill</li><li>governmentInstituteIssued</li><li>creditCardPayment</li><li>creditCardBill</li><li>charity</li><li>collectionPayment</li><li>commercialPayment</li><li>commission</li><li>compensation</li><li>copyright</li><li>debitCardPayment</li><li>deposit</li><li>dividend</li><li>studyFees</li><li>electricityBill</li><li>energies</li><li>generalFees</li><li>ferry</li><li>foreignExchange</li><li>gasBill</li><li>unemployedCompensation</li><li>governmentPayment</li><li>healthInsurance</li><li>reimbursementCreditCard</li><li>reimbursementDebitCard</li><li>carInsurancePremium</li><li>insuranceClaim</li><li>installment</li><li>insurancePremium</li><li>investmentPayment</li><li>intraCompany</li><li>interest</li><li>incomeTax</li><li>investment</li><li>laborInsurance</li><li>licenseFree</li><li>lifeInsurance</li><li>loan</li><li>medicalServices</li><li>mobilePersonToBusiness</li><li>mobilePersonToPerson</li><li>mobileTopUp</li><li>notSpecified</li><li>other</li><li>anotherTelecomBill</li><li>payroll</li><li>pensionFundContribution</li><li>pensionPayment</li><li>telephoneBill</li><li>propertyInsurance</li><li>generalLease</li><li>rent</li><li>railwayPayment</li><li>royalties</li><li>salary</li><li>savingsPayment</li><li>securities</li><li>socialSecurity</li><li>study</li><li>subscription</li><li>supplierPayment</li><li>taxRefund</li><li>taxPayment</li><li>telecommunicationsBill</li><li>tradeServices</li><li>treasuryPayment</li><li>travelPayment</li><li>utilityBill</li><li>valueAddedTaxPayment</li><li>withHolding</li><li>waterBill</li></ul>.
     */
    public void setPaymentCode(String value) {
        this.paymentCode = value;
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
