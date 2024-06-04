/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AddressPersonal extends Address {

    private PersonalName name;

    /**
     * Object that holds the name elements
     */
    public PersonalName getName() {
        return name;
    }

    /**
     * Object that holds the name elements
     */
    public void setName(PersonalName value) {
        this.name = value;
    }
}
