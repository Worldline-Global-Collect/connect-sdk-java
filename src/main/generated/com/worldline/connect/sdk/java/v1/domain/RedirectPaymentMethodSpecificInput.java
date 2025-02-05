/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class RedirectPaymentMethodSpecificInput extends AbstractRedirectPaymentMethodSpecificInput {

    private Boolean isRecurring;

    private RedirectPaymentProduct4101SpecificInput paymentProduct4101SpecificInput;

    private RedirectPaymentProduct809SpecificInput paymentProduct809SpecificInput;

    private RedirectPaymentProduct840SpecificInput paymentProduct840SpecificInput;

    private RedirectPaymentProduct861SpecificInput paymentProduct861SpecificInput;

    private RedirectPaymentProduct863SpecificInput paymentProduct863SpecificInput;

    private RedirectPaymentProduct869SpecificInput paymentProduct869SpecificInput;

    private RedirectPaymentProduct882SpecificInput paymentProduct882SpecificInput;

    private RedirectionData redirectionData;

    private String returnUrl;

    /**
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public Boolean getIsRecurring() {
        return isRecurring;
    }

    /**
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public void setIsRecurring(Boolean value) {
        this.isRecurring = value;
    }

    /**
     * Object containing specific input required for UPI (Payment product ID 4101)
     */
    public RedirectPaymentProduct4101SpecificInput getPaymentProduct4101SpecificInput() {
        return paymentProduct4101SpecificInput;
    }

    /**
     * Object containing specific input required for UPI (Payment product ID 4101)
     */
    public void setPaymentProduct4101SpecificInput(RedirectPaymentProduct4101SpecificInput value) {
        this.paymentProduct4101SpecificInput = value;
    }

    /**
     * Object containing specific input required for Dutch iDeal payments (Payment product ID 809)
     */
    public RedirectPaymentProduct809SpecificInput getPaymentProduct809SpecificInput() {
        return paymentProduct809SpecificInput;
    }

    /**
     * Object containing specific input required for Dutch iDeal payments (Payment product ID 809)
     */
    public void setPaymentProduct809SpecificInput(RedirectPaymentProduct809SpecificInput value) {
        this.paymentProduct809SpecificInput = value;
    }

    /**
     * Object containing specific input required for PayPal payments (Payment product ID 840)
     */
    public RedirectPaymentProduct840SpecificInput getPaymentProduct840SpecificInput() {
        return paymentProduct840SpecificInput;
    }

    /**
     * Object containing specific input required for PayPal payments (Payment product ID 840)
     */
    public void setPaymentProduct840SpecificInput(RedirectPaymentProduct840SpecificInput value) {
        this.paymentProduct840SpecificInput = value;
    }

    /**
     * Object containing specific input required for AliPay payments (Payment product ID 861)
     */
    public RedirectPaymentProduct861SpecificInput getPaymentProduct861SpecificInput() {
        return paymentProduct861SpecificInput;
    }

    /**
     * Object containing specific input required for AliPay payments (Payment product ID 861)
     */
    public void setPaymentProduct861SpecificInput(RedirectPaymentProduct861SpecificInput value) {
        this.paymentProduct861SpecificInput = value;
    }

    /**
     * Object containing specific input required for We Chat Pay payments (Payment product ID 863)
     */
    public RedirectPaymentProduct863SpecificInput getPaymentProduct863SpecificInput() {
        return paymentProduct863SpecificInput;
    }

    /**
     * Object containing specific input required for We Chat Pay payments (Payment product ID 863)
     */
    public void setPaymentProduct863SpecificInput(RedirectPaymentProduct863SpecificInput value) {
        this.paymentProduct863SpecificInput = value;
    }

    /**
     * Object containing specific input required for China UnionPay payments (Payment product ID 869)
     */
    public RedirectPaymentProduct869SpecificInput getPaymentProduct869SpecificInput() {
        return paymentProduct869SpecificInput;
    }

    /**
     * Object containing specific input required for China UnionPay payments (Payment product ID 869)
     */
    public void setPaymentProduct869SpecificInput(RedirectPaymentProduct869SpecificInput value) {
        this.paymentProduct869SpecificInput = value;
    }

    /**
     * Object containing specific input required for Indian Net Banking payments (Payment product ID 882)
     */
    public RedirectPaymentProduct882SpecificInput getPaymentProduct882SpecificInput() {
        return paymentProduct882SpecificInput;
    }

    /**
     * Object containing specific input required for Indian Net Banking payments (Payment product ID 882)
     */
    public void setPaymentProduct882SpecificInput(RedirectPaymentProduct882SpecificInput value) {
        this.paymentProduct882SpecificInput = value;
    }

    /**
     * Object containing browser specific redirection related data
     */
    public RedirectionData getRedirectionData() {
        return redirectionData;
    }

    /**
     * Object containing browser specific redirection related data
     */
    public void setRedirectionData(RedirectionData value) {
        this.redirectionData = value;
    }

    /**
     * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.<br>
     * Note: The provided URL should be absolute and contain the https:// protocol. IP addresses are not supported, neither localhost. For use on mobile devices a custom protocol can be used in the form of <i>protocol</i>://. This protocol must be registered on the device first.<br>
     * URLs without a protocol will be rejected.
     *
     * @deprecated Use redirectionData.returnUrl instead
     */
    @Deprecated
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * The URL that the customer is redirect to after the payment flow has finished. You can add any number of key value pairs in the query string that, for instance help you to identify the customer when they return to your site. Please note that we will also append some additional key value pairs that will also help you with this identification process.<br>
     * Note: The provided URL should be absolute and contain the https:// protocol. IP addresses are not supported, neither localhost. For use on mobile devices a custom protocol can be used in the form of <i>protocol</i>://. This protocol must be registered on the device first.<br>
     * URLs without a protocol will be rejected.
     *
     * @deprecated Use redirectionData.returnUrl instead
     */
    @Deprecated
    public void setReturnUrl(String value) {
        this.returnUrl = value;
    }
}
