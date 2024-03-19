/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class LabelTemplateElement {

    private String attributeKey = null;

    private String mask = null;

    /**
     * Name of the attribute that is shown to the customer on selection pages or screens
     */
    public String getAttributeKey() {
        return attributeKey;
    }

    /**
     * Name of the attribute that is shown to the customer on selection pages or screens
     */
    public void setAttributeKey(String value) {
        this.attributeKey = value;
    }

    /**
     * Regular mask for the attributeKey<br>
     * Note: The mask is optional as not every field has a mask
     */
    public String getMask() {
        return mask;
    }

    /**
     * Regular mask for the attributeKey<br>
     * Note: The mask is optional as not every field has a mask
     */
    public void setMask(String value) {
        this.mask = value;
    }
}
