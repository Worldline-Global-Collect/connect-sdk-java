/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CapturePaymentShipping {

    private AddressPersonal address;

    private String emailAddress;

    private String shippedFromZip;

    private String trackingNumber;

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
}
