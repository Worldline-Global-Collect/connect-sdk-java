/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CustomerTokenWithContactDetails extends CustomerToken {

    private ContactDetailsToken contactDetails;

    /**
     * Object containing contact details like email address and phone number
     */
    public ContactDetailsToken getContactDetails() {
        return contactDetails;
    }

    /**
     * Object containing contact details like email address and phone number
     */
    public void setContactDetails(ContactDetailsToken value) {
        this.contactDetails = value;
    }
}
