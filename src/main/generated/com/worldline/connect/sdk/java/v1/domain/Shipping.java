/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object containing information regarding shipping / delivery
 */
public class Shipping {

    private AddressPersonal address;

    private String addressIndicator;

    private String carrier;

    private String comments;

    private String emailAddress;

    private String firstUsageDate;

    private String instructions;

    private Boolean isFirstUsage;

    private String shippedFromZip;

    private String trackingNumber;

    private String type;

    /**
     * Object containing address information
     */
    public AddressPersonal getAddress() {
        return address;
    }

    /**
     * Object containing address information
     */
    public void setAddress(AddressPersonal value) {
        this.address = value;
    }

    /**
     * Indicates shipping method chosen for the transaction. Possible values:
     * <ul class="paragraph-width"><li>same-as-billing = the shipping address is the same as the billing address
     * <li>another-verified-address-on-file-with-merchant = the address used for shipping is another verified address of the customer that is on file with you
     * <li>different-than-billing = shipping address is different from the billing address
     * <li>ship-to-store = goods are shipped to a store (shipping address = store address)
     * <li>digital-goods = electronic delivery of digital goods
     * <li>travel-and-event-tickets-not-shipped = travel and/or event tickets that are not shipped
     * <li>other = other means of delivery</ul>
     */
    public String getAddressIndicator() {
        return addressIndicator;
    }

    /**
     * Indicates shipping method chosen for the transaction. Possible values:
     * <ul class="paragraph-width"><li>same-as-billing = the shipping address is the same as the billing address
     * <li>another-verified-address-on-file-with-merchant = the address used for shipping is another verified address of the customer that is on file with you
     * <li>different-than-billing = shipping address is different from the billing address
     * <li>ship-to-store = goods are shipped to a store (shipping address = store address)
     * <li>digital-goods = electronic delivery of digital goods
     * <li>travel-and-event-tickets-not-shipped = travel and/or event tickets that are not shipped
     * <li>other = other means of delivery</ul>
     */
    public void setAddressIndicator(String value) {
        this.addressIndicator = value;
    }

    /**
     * Indicates the carrier that will deliver the products.
     */
    public String getCarrier() {
        return carrier;
    }

    /**
     * Indicates the carrier that will deliver the products.
     */
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Comments included during shipping
     */
    public String getComments() {
        return comments;
    }

    /**
     * Comments included during shipping
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Email address linked to the shipping
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Email address linked to the shipping
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Date (YYYYMMDD) when the shipping details for this transaction were first used.
     */
    public String getFirstUsageDate() {
        return firstUsageDate;
    }

    /**
     * Date (YYYYMMDD) when the shipping details for this transaction were first used.
     */
    public void setFirstUsageDate(String value) {
        this.firstUsageDate = value;
    }

    /**
     * <p>The delivery instructions or preferences for the shipment. The instructions that informed the delivery carrier about handling requirements, delivery methods, and any special considerations to ensure successful delivery. </p>Possible values:<ul> <li>signature-required = A signature is required upon delivery.</li><li>identification-required = Recipient needs to provide identification.</li><li>contactless-delivery = Delivery should be contactless.</li><li>leave-at-door = Leave the package at the recipient's door.</li><li>leave-at-curb = Leave the package at the curbside.</li><li>leave-with-neighbor = Leave the package with a neighbor.</li><li>express = Expedite the delivery process.</li><li>tracked = The delivery is tracked with real-time updates.</li><li>untracked = The delivery is untracked, with no real-time updates.</li></ul>
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * <p>The delivery instructions or preferences for the shipment. The instructions that informed the delivery carrier about handling requirements, delivery methods, and any special considerations to ensure successful delivery. </p>Possible values:<ul> <li>signature-required = A signature is required upon delivery.</li><li>identification-required = Recipient needs to provide identification.</li><li>contactless-delivery = Delivery should be contactless.</li><li>leave-at-door = Leave the package at the recipient's door.</li><li>leave-at-curb = Leave the package at the curbside.</li><li>leave-with-neighbor = Leave the package with a neighbor.</li><li>express = Expedite the delivery process.</li><li>tracked = The delivery is tracked with real-time updates.</li><li>untracked = The delivery is untracked, with no real-time updates.</li></ul>
     */
    public void setInstructions(String value) {
        this.instructions = value;
    }

    /**
     * Indicator if this shipping address is used for the first time to ship an order
     * <p>true = the shipping details are used for the first time with this transaction
     * <p>false = the shipping details have been used for other transactions in the past
     */
    public Boolean getIsFirstUsage() {
        return isFirstUsage;
    }

    /**
     * Indicator if this shipping address is used for the first time to ship an order
     * <p>true = the shipping details are used for the first time with this transaction
     * <p>false = the shipping details have been used for other transactions in the past
     */
    public void setIsFirstUsage(Boolean value) {
        this.isFirstUsage = value;
    }

    /**
     * The zip/postal code of the location from which the goods were shipped.
     */
    public String getShippedFromZip() {
        return shippedFromZip;
    }

    /**
     * The zip/postal code of the location from which the goods were shipped.
     */
    public void setShippedFromZip(String value) {
        this.shippedFromZip = value;
    }

    /**
     * Shipment tracking number
     */
    public String getTrackingNumber() {
        return trackingNumber;
    }

    /**
     * Shipment tracking number
     */
    public void setTrackingNumber(String value) {
        this.trackingNumber = value;
    }

    /**
     * Indicates the merchandise delivery timeframe. Possible values:
     * <ul class="paragraph-width"><li>electronic = For electronic delivery (services or digital goods)</li>
     * <li>same-day = For same day deliveries</li>
     * <li>overnight = For overnight deliveries</li>
     * <li>2-day-or-more = For two day or more delivery time for payments that are processed by the GlobalCollect platform</li>
     * <li>2-day-or-more = For two day or more delivery time for payments that are processed by the Ogone platform</li>
     * <li>priority = For prioritized deliveries for payments that are processed by the WL Online Payment Acceptance platform</li>
     * <li>ground = For deliveries via ground for payments that are processed by the WL Online Payment Acceptance platform</li>
     * <li>to-store = For deliveries to a store for payments that are processed by the WL Online Payment Acceptance platform</li>
     * </ul>
     */
    public String getType() {
        return type;
    }

    /**
     * Indicates the merchandise delivery timeframe. Possible values:
     * <ul class="paragraph-width"><li>electronic = For electronic delivery (services or digital goods)</li>
     * <li>same-day = For same day deliveries</li>
     * <li>overnight = For overnight deliveries</li>
     * <li>2-day-or-more = For two day or more delivery time for payments that are processed by the GlobalCollect platform</li>
     * <li>2-day-or-more = For two day or more delivery time for payments that are processed by the Ogone platform</li>
     * <li>priority = For prioritized deliveries for payments that are processed by the WL Online Payment Acceptance platform</li>
     * <li>ground = For deliveries via ground for payments that are processed by the WL Online Payment Acceptance platform</li>
     * <li>to-store = For deliveries to a store for payments that are processed by the WL Online Payment Acceptance platform</li>
     * </ul>
     */
    public void setType(String value) {
        this.type = value;
    }
}
