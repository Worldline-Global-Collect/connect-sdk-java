/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MandateResponse {

    private String alias;

    private MandateCustomer customer;

    private String customerReference;

    private String recurrenceType;

    private String status;

    private String uniqueMandateReference;

    /**
     * An alias for the mandate. This can be used to visually represent the mandate.<br>
     * Do not include any unobfuscated sensitive data in the alias.<br>
     * Default value if not provided is the obfuscated IBAN of the customer.
     */
    public String getAlias() {
        return alias;
    }

    /**
     * An alias for the mandate. This can be used to visually represent the mandate.<br>
     * Do not include any unobfuscated sensitive data in the alias.<br>
     * Default value if not provided is the obfuscated IBAN of the customer.
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Customer object containing customer specific inputs
     */
    public MandateCustomer getCustomer() {
        return customer;
    }

    /**
     * Customer object containing customer specific inputs
     */
    public void setCustomer(MandateCustomer value) {
        this.customer = value;
    }

    /**
     * The unique identifier of the customer to which this mandate is applicable
     */
    public String getCustomerReference() {
        return customerReference;
    }

    /**
     * The unique identifier of the customer to which this mandate is applicable
     */
    public void setCustomerReference(String value) {
        this.customerReference = value;
    }

    /**
     * Specifieds whether the mandate is for one-off or recurring payments.
     */
    public String getRecurrenceType() {
        return recurrenceType;
    }

    /**
     * Specifieds whether the mandate is for one-off or recurring payments.
     */
    public void setRecurrenceType(String value) {
        this.recurrenceType = value;
    }

    /**
     * The status of the mandate. Possible values are:
     * <ul class="paragraph-width">
     * <li>ACTIVE
     * <li>EXPIRED
     * <li>CREATED
     * <li>REVOKED
     * <li>WAITING_FOR_REFERENCE
     * <li>BLOCKED
     * <li>USED
     * </ul><br>
     */
    public String getStatus() {
        return status;
    }

    /**
     * The status of the mandate. Possible values are:
     * <ul class="paragraph-width">
     * <li>ACTIVE
     * <li>EXPIRED
     * <li>CREATED
     * <li>REVOKED
     * <li>WAITING_FOR_REFERENCE
     * <li>BLOCKED
     * <li>USED
     * </ul><br>
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * The unique identifier of the mandate
     */
    public String getUniqueMandateReference() {
        return uniqueMandateReference;
    }

    /**
     * The unique identifier of the mandate
     */
    public void setUniqueMandateReference(String value) {
        this.uniqueMandateReference = value;
    }
}
