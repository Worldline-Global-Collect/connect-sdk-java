/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CreatePayoutRequest {

    private AmountOfMoney amountOfMoney;

    private BankAccountBban bankAccountBban;

    private BankAccountIban bankAccountIban;

    private BankTransferPayoutMethodSpecificInput bankTransferPayoutMethodSpecificInput;

    private CardPayoutMethodSpecificInput cardPayoutMethodSpecificInput;

    private PayoutCustomer customer;

    private PayoutMerchant merchant;

    private String payoutDate;

    private PayoutDetails payoutDetails;

    private String payoutText;

    private PayoutReferences references;

    private String swiftCode;

    /**
     * Object containing amount and ISO currency code attributes
     *
     * @deprecated Moved to PayoutDetails
     */
    @Deprecated
    public AmountOfMoney getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * Object containing amount and ISO currency code attributes
     *
     * @deprecated Moved to PayoutDetails
     */
    @Deprecated
    public void setAmountOfMoney(AmountOfMoney value) {
        this.amountOfMoney = value;
    }

    /**
     * Object containing account holder name and bank account information. This property can only be used for payouts in the UK.
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public BankAccountBban getBankAccountBban() {
        return bankAccountBban;
    }

    /**
     * Object containing account holder name and bank account information. This property can only be used for payouts in the UK.
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public void setBankAccountBban(BankAccountBban value) {
        this.bankAccountBban = value;
    }

    /**
     * Object containing account holder and IBAN information.
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public BankAccountIban getBankAccountIban() {
        return bankAccountIban;
    }

    /**
     * Object containing account holder and IBAN information.
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public void setBankAccountIban(BankAccountIban value) {
        this.bankAccountIban = value;
    }

    /**
     * Object containing the specific input details for bank transfer payouts.
     */
    public BankTransferPayoutMethodSpecificInput getBankTransferPayoutMethodSpecificInput() {
        return bankTransferPayoutMethodSpecificInput;
    }

    /**
     * Object containing the specific input details for bank transfer payouts.
     */
    public void setBankTransferPayoutMethodSpecificInput(BankTransferPayoutMethodSpecificInput value) {
        this.bankTransferPayoutMethodSpecificInput = value;
    }

    /**
     * Object containing the specific input details for card payouts.
     */
    public CardPayoutMethodSpecificInput getCardPayoutMethodSpecificInput() {
        return cardPayoutMethodSpecificInput;
    }

    /**
     * Object containing the specific input details for card payouts.
     */
    public void setCardPayoutMethodSpecificInput(CardPayoutMethodSpecificInput value) {
        this.cardPayoutMethodSpecificInput = value;
    }

    /**
     * Object containing the details of the customer.
     *
     * @deprecated Moved to PayoutDetails
     */
    @Deprecated
    public PayoutCustomer getCustomer() {
        return customer;
    }

    /**
     * Object containing the details of the customer.
     *
     * @deprecated Moved to PayoutDetails
     */
    @Deprecated
    public void setCustomer(PayoutCustomer value) {
        this.customer = value;
    }

    /**
     * Object containing information on you, the merchant
     */
    public PayoutMerchant getMerchant() {
        return merchant;
    }

    /**
     * Object containing information on you, the merchant
     */
    public void setMerchant(PayoutMerchant value) {
        this.merchant = value;
    }

    /**
     * Date of the payout sent to the bank by us<br>
     * Format: YYYYMMDD
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public String getPayoutDate() {
        return payoutDate;
    }

    /**
     * Date of the payout sent to the bank by us<br>
     * Format: YYYYMMDD
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public void setPayoutDate(String value) {
        this.payoutDate = value;
    }

    /**
     * Object containing the details for Create Payout Request
     */
    public PayoutDetails getPayoutDetails() {
        return payoutDetails;
    }

    /**
     * Object containing the details for Create Payout Request
     */
    public void setPayoutDetails(PayoutDetails value) {
        this.payoutDetails = value;
    }

    /**
     * Text to be printed on the bank account statement of the beneficiary. The maximum allowed length might differ per country. The data will be automatically truncated to the maximum allowed length.
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public String getPayoutText() {
        return payoutText;
    }

    /**
     * Text to be printed on the bank account statement of the beneficiary. The maximum allowed length might differ per country. The data will be automatically truncated to the maximum allowed length.
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public void setPayoutText(String value) {
        this.payoutText = value;
    }

    /**
     * Object that holds all reference properties that are linked to this transaction
     *
     * @deprecated Moved to PayoutDetails
     */
    @Deprecated
    public PayoutReferences getReferences() {
        return references;
    }

    /**
     * Object that holds all reference properties that are linked to this transaction
     *
     * @deprecated Moved to PayoutDetails
     */
    @Deprecated
    public void setReferences(PayoutReferences value) {
        this.references = value;
    }

    /**
     * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public String getSwiftCode() {
        return swiftCode;
    }

    /**
     * The BIC is the Business Identifier Code, also known as SWIFT or Bank Identifier code. It is a code with an internationally agreed format to Identify a specific bank. The BIC contains 8 or 11 positions: the first 4 contain the bank code, followed by the country code and location code.
     *
     * @deprecated Moved to BankTransferPayoutMethodSpecificInput
     */
    @Deprecated
    public void setSwiftCode(String value) {
        this.swiftCode = value;
    }
}
