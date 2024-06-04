/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class PersonalInformation {

    private String dateOfBirth;

    private String gender;

    private PersonalIdentification identification;

    private PersonalName name;

    /**
     * The date of birth of the customer<br>
     * Format: YYYYMMDD
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * The date of birth of the customer<br>
     * Format: YYYYMMDD
     */
    public void setDateOfBirth(String value) {
        this.dateOfBirth = value;
    }

    /**
     * The gender of the customer, possible values are:
     * <ul class="paragraph-width">
     * <li>male
     * <li>female
     * <li>unknown or empty
     * </ul>
     */
    public String getGender() {
        return gender;
    }

    /**
     * The gender of the customer, possible values are:
     * <ul class="paragraph-width">
     * <li>male
     * <li>female
     * <li>unknown or empty
     * </ul>
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Object containing identification documents information
     */
    public PersonalIdentification getIdentification() {
        return identification;
    }

    /**
     * Object containing identification documents information
     */
    public void setIdentification(PersonalIdentification value) {
        this.identification = value;
    }

    /**
     * Object containing the name details of the customer
     */
    public PersonalName getName() {
        return name;
    }

    /**
     * Object containing the name details of the customer
     */
    public void setName(PersonalName value) {
        this.name = value;
    }
}
