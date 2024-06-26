/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class ApprovePaymentRequest {

    private Long amount;

    private ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput directDebitPaymentMethodSpecificInput;

    private OrderApprovePayment order;

    private ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput sepaDirectDebitPaymentMethodSpecificInput;

    /**
     * In case you want to approve the capture of a different lower amount you can specify this here (specified in cents, where single digit currencies are presumed to have 2 digits)
     */
    public Long getAmount() {
        return amount;
    }

    /**
     * In case you want to approve the capture of a different lower amount you can specify this here (specified in cents, where single digit currencies are presumed to have 2 digits)
     */
    public void setAmount(Long value) {
        this.amount = value;
    }

    /**
     * Object that holds non-SEPA Direct Debit specific input data
     */
    public ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput getDirectDebitPaymentMethodSpecificInput() {
        return directDebitPaymentMethodSpecificInput;
    }

    /**
     * Object that holds non-SEPA Direct Debit specific input data
     */
    public void setDirectDebitPaymentMethodSpecificInput(ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput value) {
        this.directDebitPaymentMethodSpecificInput = value;
    }

    /**
     * Object that holds the order data
     */
    public OrderApprovePayment getOrder() {
        return order;
    }

    /**
     * Object that holds the order data
     */
    public void setOrder(OrderApprovePayment value) {
        this.order = value;
    }

    /**
     * Object that holds SEPA Direct Debit specific input data
     */
    public ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput getSepaDirectDebitPaymentMethodSpecificInput() {
        return sepaDirectDebitPaymentMethodSpecificInput;
    }

    /**
     * Object that holds SEPA Direct Debit specific input data
     */
    public void setSepaDirectDebitPaymentMethodSpecificInput(ApprovePaymentSepaDirectDebitPaymentMethodSpecificInput value) {
        this.sepaDirectDebitPaymentMethodSpecificInput = value;
    }
}
