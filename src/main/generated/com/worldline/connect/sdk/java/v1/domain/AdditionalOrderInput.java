/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AdditionalOrderInput {

    private AccountFundingRecipient accountFundingRecipient;

    private AirlineData airlineData;

    private Installments installments;

    @SuppressWarnings("deprecation")
    private Level3SummaryData level3SummaryData;

    @SuppressWarnings("deprecation")
    private LoanRecipient loanRecipient;

    private LodgingData lodgingData;

    private Long numberOfInstallments;

    private String orderDate;

    private OrderTypeInformation typeInformation;

    /**
     * Object containing specific data regarding the recipient of an account funding transaction
     */
    public AccountFundingRecipient getAccountFundingRecipient() {
        return accountFundingRecipient;
    }

    /**
     * Object containing specific data regarding the recipient of an account funding transaction
     */
    public void setAccountFundingRecipient(AccountFundingRecipient value) {
        this.accountFundingRecipient = value;
    }

    /**
     * Object that holds airline specific data
     */
    public AirlineData getAirlineData() {
        return airlineData;
    }

    /**
     * Object that holds airline specific data
     */
    public void setAirlineData(AirlineData value) {
        this.airlineData = value;
    }

    /**
     * Object containing data related to installments which can be used for card payments and only with some acquirers. In case you send in the details of this object, only the combination of card products and acquirers that do support installments will be shown on the MyCheckout hosted payment pages.
     */
    public Installments getInstallments() {
        return installments;
    }

    /**
     * Object containing data related to installments which can be used for card payments and only with some acquirers. In case you send in the details of this object, only the combination of card products and acquirers that do support installments will be shown on the MyCheckout hosted payment pages.
     */
    public void setInstallments(Installments value) {
        this.installments = value;
    }

    /**
     * Object that holds Level3 summary data
     *
     * @deprecated Use Order.shoppingCart.amountBreakdown instead
     */
    @Deprecated
    public Level3SummaryData getLevel3SummaryData() {
        return level3SummaryData;
    }

    /**
     * Object that holds Level3 summary data
     *
     * @deprecated Use Order.shoppingCart.amountBreakdown instead
     */
    @Deprecated
    public void setLevel3SummaryData(Level3SummaryData value) {
        this.level3SummaryData = value;
    }

    /**
     * Object containing specific data regarding the recipient of a loan in the UK
     *
     * @deprecated No replacement
     */
    @Deprecated
    public LoanRecipient getLoanRecipient() {
        return loanRecipient;
    }

    /**
     * Object containing specific data regarding the recipient of a loan in the UK
     *
     * @deprecated No replacement
     */
    @Deprecated
    public void setLoanRecipient(LoanRecipient value) {
        this.loanRecipient = value;
    }

    /**
     * Object that holds lodging specific data
     */
    public LodgingData getLodgingData() {
        return lodgingData;
    }

    /**
     * Object that holds lodging specific data
     */
    public void setLodgingData(LodgingData value) {
        this.lodgingData = value;
    }

    /**
     * The number of installments in which this transaction will be paid, which can be used for card payments. Only used with some acquirers. In case you send in the details of this object, only the combination of card products and acquirers that do support installments will be shown on the MyCheckout hosted payment pages.
     *
     * @deprecated Use installments.numberOfInstallments instead
     */
    @Deprecated
    public Long getNumberOfInstallments() {
        return numberOfInstallments;
    }

    /**
     * The number of installments in which this transaction will be paid, which can be used for card payments. Only used with some acquirers. In case you send in the details of this object, only the combination of card products and acquirers that do support installments will be shown on the MyCheckout hosted payment pages.
     *
     * @deprecated Use installments.numberOfInstallments instead
     */
    @Deprecated
    public void setNumberOfInstallments(Long value) {
        this.numberOfInstallments = value;
    }

    /**
     * Date and time of order<br>
     * Format: YYYYMMDDHH24MISS
     */
    public String getOrderDate() {
        return orderDate;
    }

    /**
     * Date and time of order<br>
     * Format: YYYYMMDDHH24MISS
     */
    public void setOrderDate(String value) {
        this.orderDate = value;
    }

    /**
     * Object that holds the purchase and usage type indicators
     */
    public OrderTypeInformation getTypeInformation() {
        return typeInformation;
    }

    /**
     * Object that holds the purchase and usage type indicators
     */
    public void setTypeInformation(OrderTypeInformation value) {
        this.typeInformation = value;
    }
}
