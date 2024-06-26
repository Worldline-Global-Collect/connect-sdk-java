/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class Seller {

    private Address address;

    private String channelCode;

    private String description;

    private String externalReferenceId;

    private String geocode;

    private String id;

    private String invoiceNumber;

    private Boolean isForeignRetailer;

    private String mcc;

    private String name;

    private String phoneNumber;

    private String type;

    /**
     * Object containing the seller address details
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Object containing the seller address details
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * This property is specific to Visa Argentina. Channelcode according to Prisma. Please contact the acquirer to get the full list you need to use.
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * This property is specific to Visa Argentina. Channelcode according to Prisma. Please contact the acquirer to get the full list you need to use.
     */
    public void setChannelCode(String value) {
        this.channelCode = value;
    }

    /**
     * Description of the seller
     */
    public String getDescription() {
        return description;
    }

    /**
     * Description of the seller
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Seller ID assigned by the Merchant Aggregator
     */
    public String getExternalReferenceId() {
        return externalReferenceId;
    }

    /**
     * Seller ID assigned by the Merchant Aggregator
     */
    public void setExternalReferenceId(String value) {
        this.externalReferenceId = value;
    }

    /**
     * The sellers geocode
     */
    public String getGeocode() {
        return geocode;
    }

    /**
     * The sellers geocode
     */
    public void setGeocode(String value) {
        this.geocode = value;
    }

    /**
     * The sellers identifier
     */
    public String getId() {
        return id;
    }

    /**
     * The sellers identifier
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Invoice number of the payment
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Invoice number of the payment
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Indicates if the retailer is considered foreign or domestic when compared to the location of the marketplace. Possible values:
     * <ul class="paragraph-width"><li>true - The retailer is considered foreign because they are located in a different country than the marketplace. For marketplaces located in the European Economic Area (EEA) and UK (and Gibraltar), this includes transactions where the marketplace is within the EEA and UK (and Gibraltar), but the retailer is located outside of the EEA and UK (and Gibraltar)
     * <li>false - The retailer is considered domestic because they are located in the same country as the marketplace. For marketplaces located in the European Economic Area (EEA) and UK (and Gibraltar), this includes transactions where the retailer is also located within the EEA and UK (and Gibraltar).</ul>
     */
    public Boolean getIsForeignRetailer() {
        return isForeignRetailer;
    }

    /**
     * Indicates if the retailer is considered foreign or domestic when compared to the location of the marketplace. Possible values:
     * <ul class="paragraph-width"><li>true - The retailer is considered foreign because they are located in a different country than the marketplace. For marketplaces located in the European Economic Area (EEA) and UK (and Gibraltar), this includes transactions where the marketplace is within the EEA and UK (and Gibraltar), but the retailer is located outside of the EEA and UK (and Gibraltar)
     * <li>false - The retailer is considered domestic because they are located in the same country as the marketplace. For marketplaces located in the European Economic Area (EEA) and UK (and Gibraltar), this includes transactions where the retailer is also located within the EEA and UK (and Gibraltar).</ul>
     */
    public void setIsForeignRetailer(Boolean value) {
        this.isForeignRetailer = value;
    }

    /**
     * Merchant category code
     */
    public String getMcc() {
        return mcc;
    }

    /**
     * Merchant category code
     */
    public void setMcc(String value) {
        this.mcc = value;
    }

    /**
     * Name of the seller
     */
    public String getName() {
        return name;
    }

    /**
     * Name of the seller
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Main Phone Number
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Main Phone Number
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Seller type. Possible values:
     * <ul class="paragraph-width"><li>passport
     * <li>dni
     * <li>arg-identity-card
     * <li>civic-notebook
     * <li>enrollment-book
     * <li>cuil
     * <li>cuit
     * <li>general-register
     * <li>election-title
     * <li>cpf
     * <li>cnpj
     * <li>ssn
     * <li>citizen-ship
     * <li>col-identity-card
     * <li>alien-registration
     * </ul>
     */
    public String getType() {
        return type;
    }

    /**
     * Seller type. Possible values:
     * <ul class="paragraph-width"><li>passport
     * <li>dni
     * <li>arg-identity-card
     * <li>civic-notebook
     * <li>enrollment-book
     * <li>cuil
     * <li>cuit
     * <li>general-register
     * <li>election-title
     * <li>cpf
     * <li>cnpj
     * <li>ssn
     * <li>citizen-ship
     * <li>col-identity-card
     * <li>alien-registration
     * </ul>
     */
    public void setType(String value) {
        this.type = value;
    }
}
