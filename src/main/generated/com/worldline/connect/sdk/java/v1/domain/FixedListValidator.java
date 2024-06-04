/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class FixedListValidator {

    private List<String> allowedValues;

    /**
     * List of the allowed values that the field will be validated against
     */
    public List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * List of the allowed values that the field will be validated against
     */
    public void setAllowedValues(List<String> value) {
        this.allowedValues = value;
    }
}
