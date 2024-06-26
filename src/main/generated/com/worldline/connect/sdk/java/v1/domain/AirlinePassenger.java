/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AirlinePassenger {

    private String firstName;

    private String surname;

    private String surnamePrefix;

    private String title;

    /**
     * First name of the passenger (this property is used for fraud screening on the Ogone Payment Platform)
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * First name of the passenger (this property is used for fraud screening on the Ogone Payment Platform)
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Surname of the passenger (this property is used for fraud screening on the Ogone Payment Platform)
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Surname of the passenger (this property is used for fraud screening on the Ogone Payment Platform)
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Surname prefix of the passenger (this property is used for fraud screening on the Ogone Payment Platform)
     */
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * Surname prefix of the passenger (this property is used for fraud screening on the Ogone Payment Platform)
     */
    public void setSurnamePrefix(String value) {
        this.surnamePrefix = value;
    }

    /**
     * Title of the passenger (this property is used for fraud screening on the Ogone Payment Platform)
     */
    public String getTitle() {
        return title;
    }

    /**
     * Title of the passenger (this property is used for fraud screening on the Ogone Payment Platform)
     */
    public void setTitle(String value) {
        this.title = value;
    }
}
