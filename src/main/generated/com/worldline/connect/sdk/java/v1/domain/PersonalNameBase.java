/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class PersonalNameBase {

    private String firstName;

    private String surname;

    private String surnamePrefix;

    /**
     * Given name(s) or first name(s) of the customer
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Given name(s) or first name(s) of the customer
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Middle name - In between first name and surname - of the customer
     */
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * Middle name - In between first name and surname - of the customer
     */
    public void setSurnamePrefix(String value) {
        this.surnamePrefix = value;
    }
}
