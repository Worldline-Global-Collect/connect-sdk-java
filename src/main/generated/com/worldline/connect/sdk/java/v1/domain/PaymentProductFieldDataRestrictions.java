/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class PaymentProductFieldDataRestrictions {

    private Boolean isRequired = null;

    private PaymentProductFieldValidators validators = null;

    /**
     * <ul class="paragraph-width">
     * <li>true - Indicates that this field is required
     * <li>false - Indicates that this field is optional
     * </ul>
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * <ul class="paragraph-width">
     * <li>true - Indicates that this field is required
     * <li>false - Indicates that this field is optional
     * </ul>
     */
    public void setIsRequired(Boolean value) {
        this.isRequired = value;
    }

    /**
     * Object containing the details of the validations on the field
     */
    public PaymentProductFieldValidators getValidators() {
        return validators;
    }

    /**
     * Object containing the details of the validations on the field
     */
    public void setValidators(PaymentProductFieldValidators value) {
        this.validators = value;
    }
}
