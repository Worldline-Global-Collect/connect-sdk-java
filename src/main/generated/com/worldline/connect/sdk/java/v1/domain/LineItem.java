/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class LineItem {

    private AmountOfMoney amountOfMoney;

    private LineItemInvoiceData invoiceData;

    private LineItemLevel3InterchangeInformation level3InterchangeInformation;

    private OrderLineDetails orderLineDetails;

    /**
     * Object containing amount and ISO currency code attributes<br>
     * Note: make sure you submit the amount and currency code for each line item
     */
    public AmountOfMoney getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * Object containing amount and ISO currency code attributes<br>
     * Note: make sure you submit the amount and currency code for each line item
     */
    public void setAmountOfMoney(AmountOfMoney value) {
        this.amountOfMoney = value;
    }

    /**
     * Object containing the line items of the invoice or shopping cart. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
     */
    public LineItemInvoiceData getInvoiceData() {
        return invoiceData;
    }

    /**
     * Object containing the line items of the invoice or shopping cart. The '+' character is not allowed in this property for transactions that are processed by TechProcess Payment Platform.
     */
    public void setInvoiceData(LineItemInvoiceData value) {
        this.invoiceData = value;
    }

    /**
     * Object containing additional information that when supplied can have a beneficial effect on the discountrates
     *
     * @deprecated Use orderLineDetails instead
     */
    @Deprecated
    public LineItemLevel3InterchangeInformation getLevel3InterchangeInformation() {
        return level3InterchangeInformation;
    }

    /**
     * Object containing additional information that when supplied can have a beneficial effect on the discountrates
     *
     * @deprecated Use orderLineDetails instead
     */
    @Deprecated
    public void setLevel3InterchangeInformation(LineItemLevel3InterchangeInformation value) {
        this.level3InterchangeInformation = value;
    }

    /**
     * Object containing additional information that when supplied can have a beneficial effect on the discountrates
     */
    public OrderLineDetails getOrderLineDetails() {
        return orderLineDetails;
    }

    /**
     * Object containing additional information that when supplied can have a beneficial effect on the discountrates
     */
    public void setOrderLineDetails(OrderLineDetails value) {
        this.orderLineDetails = value;
    }
}
