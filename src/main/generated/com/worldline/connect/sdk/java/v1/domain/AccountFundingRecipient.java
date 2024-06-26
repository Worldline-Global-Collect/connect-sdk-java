/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object containing specific data regarding the recipient of an account funding transaction
 */
public class AccountFundingRecipient {

    private String accountNumber;

    private String accountNumberType;

    private Address address;

    private String dateOfBirth;

    private AfrName name;

    private String partialPan;

    /**
     * Should be populated with the value of the corresponding accountNumberType of the recipient.
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Should be populated with the value of the corresponding accountNumberType of the recipient.
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Defines the account number type of the recipient. Possible values are:
     * <ul class="paragraph-width">
     * <li>cash = Mode of payment is cash to the recipient.
     * <li>walletId = Digital wallet ID.
     * <li>routingNumber = Routing Transit Number is a code used by financial institutions to identify other financial institutions.
     * <li>iban = International Bank Account Number, is a standard international numbering system for identifying bank accounts.
     * <li>bicNumber = Bank Identification Code is a number that is used to identify a specific bank.
     * <li>giftCard = Gift card is a type of prepaid card that contains a specific amount of money that can be used at participating stores and marketplaces.
     * </ul>
     */
    public String getAccountNumberType() {
        return accountNumberType;
    }

    /**
     * Defines the account number type of the recipient. Possible values are:
     * <ul class="paragraph-width">
     * <li>cash = Mode of payment is cash to the recipient.
     * <li>walletId = Digital wallet ID.
     * <li>routingNumber = Routing Transit Number is a code used by financial institutions to identify other financial institutions.
     * <li>iban = International Bank Account Number, is a standard international numbering system for identifying bank accounts.
     * <li>bicNumber = Bank Identification Code is a number that is used to identify a specific bank.
     * <li>giftCard = Gift card is a type of prepaid card that contains a specific amount of money that can be used at participating stores and marketplaces.
     * </ul>
     */
    public void setAccountNumberType(String value) {
        this.accountNumberType = value;
    }

    /**
     * Object containing the address details of the recipient of an account funding transaction.
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Object containing the address details of the recipient of an account funding transaction.
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * The date of birth of the recipient<br>
     * Format: YYYYMMDD
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * The date of birth of the recipient<br>
     * Format: YYYYMMDD
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * Object containing the name details of the recipient of an account funding transaction.
     */
    public AfrName getName() {
        return name;
    }

    /**
     * Object containing the name details of the recipient of an account funding transaction.
     */
    public void setName(AfrName value) {
        this.name = value;
    }

    /**
     * Either partialPan or accountnumber is required for merchants that use Merchant Category Code (MCC) 6012 for transactions involving UK costumers.
     */
    public String getPartialPan() {
        return partialPan;
    }

    /**
     * Either partialPan or accountnumber is required for merchants that use Merchant Category Code (MCC) 6012 for transactions involving UK costumers.
     */
    public void setPartialPan(String value) {
        this.partialPan = value;
    }
}
