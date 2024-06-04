/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AfrName {

    private String firstName;

    private String surname;

    /**
     * Given name(s) or first name(s) of the recipient of an account funding transaction.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Given name(s) or first name(s) of the recipient of an account funding transaction.
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Surname(s) or last name(s) of the customer
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Surname(s) or last name(s) of the customer
     */
    public void setSurname(String value) {
        this.surname = value;
    }
}
