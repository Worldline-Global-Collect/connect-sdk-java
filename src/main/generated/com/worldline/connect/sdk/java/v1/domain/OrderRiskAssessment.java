/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class OrderRiskAssessment {

    private AdditionalOrderInputAirlineData additionalInput;

    private AmountOfMoney amountOfMoney;

    private CustomerRiskAssessment customer;

    private ShippingRiskAssessment shipping;

    /**
     * Object containing additional input on the order
     */
    public AdditionalOrderInputAirlineData getAdditionalInput() {
        return additionalInput;
    }

    /**
     * Object containing additional input on the order
     */
    public void setAdditionalInput(AdditionalOrderInputAirlineData value) {
        this.additionalInput = value;
    }

    /**
     * Object containing amount and ISO currency code attributes
     */
    public AmountOfMoney getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * Object containing amount and ISO currency code attributes
     */
    public void setAmountOfMoney(AmountOfMoney value) {
        this.amountOfMoney = value;
    }

    /**
     * Object containing the details of the customer
     */
    public CustomerRiskAssessment getCustomer() {
        return customer;
    }

    /**
     * Object containing the details of the customer
     */
    public void setCustomer(CustomerRiskAssessment value) {
        this.customer = value;
    }

    /**
     * Object containing information regarding shipping / delivery
     */
    public ShippingRiskAssessment getShipping() {
        return shipping;
    }

    /**
     * Object containing information regarding shipping / delivery
     */
    public void setShipping(ShippingRiskAssessment value) {
        this.shipping = value;
    }
}
