/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class PaymentProductFieldDisplayElement {

    private String id;

    private String label;

    private String type;

    private String value;

    /**
     * The ID of the display element.
     */
    public String getId() {
        return id;
    }

    /**
     * The ID of the display element.
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * The label of the display element.
     */
    public String getLabel() {
        return label;
    }

    /**
     * The label of the display element.
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * The type of the display element. Indicates how the value should be presented. Possible values are:
     * <ul class="paragraph-width">
     * <li>STRING - as plain text
     * <li>CURRENCY - as an amount in cents displayed with a decimal separator and the currency of the payment
     * <li>PERCENTAGE - as a number with a percentage sign
     * <li>INTEGER - as an integer
     * <li>URI - as a link
     * </ul>
     */
    public String getType() {
        return type;
    }

    /**
     * The type of the display element. Indicates how the value should be presented. Possible values are:
     * <ul class="paragraph-width">
     * <li>STRING - as plain text
     * <li>CURRENCY - as an amount in cents displayed with a decimal separator and the currency of the payment
     * <li>PERCENTAGE - as a number with a percentage sign
     * <li>INTEGER - as an integer
     * <li>URI - as a link
     * </ul>
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * the value of the display element.
     */
    public String getValue() {
        return value;
    }

    /**
     * the value of the display element.
     */
    public void setValue(String value) {
        this.value = value;
    }
}
