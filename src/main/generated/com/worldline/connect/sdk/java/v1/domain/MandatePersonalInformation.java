/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MandatePersonalInformation {

    private MandatePersonalName name;

    private String title;

    /**
     * Object containing the name details of the customer
     */
    public MandatePersonalName getName() {
        return name;
    }

    /**
     * Object containing the name details of the customer
     */
    public void setName(MandatePersonalName value) {
        this.name = value;
    }

    /**
     * Object containing the title of the customer (Mr, Miss or Mrs)
     */
    public String getTitle() {
        return title;
    }

    /**
     * Object containing the title of the customer (Mr, Miss or Mrs)
     */
    public void setTitle(String value) {
        this.title = value;
    }
}
