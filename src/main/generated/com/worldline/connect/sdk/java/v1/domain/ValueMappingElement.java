/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class ValueMappingElement {

    private List<PaymentProductFieldDisplayElement> displayElements;

    private String displayName;

    private String value;

    /**
     * List of extra data of the value.
     */
    public List<PaymentProductFieldDisplayElement> getDisplayElements() {
        return displayElements;
    }

    /**
     * List of extra data of the value.
     */
    public void setDisplayElements(List<PaymentProductFieldDisplayElement> value) {
        this.displayElements = value;
    }

    /**
     * Key name
     *
     * @deprecated Use displayElements instead with ID 'displayName'
     */
    @Deprecated
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Key name
     *
     * @deprecated Use displayElements instead with ID 'displayName'
     */
    @Deprecated
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Value corresponding to the key
     */
    public String getValue() {
        return value;
    }

    /**
     * Value corresponding to the key
     */
    public void setValue(String value) {
        this.value = value;
    }
}
