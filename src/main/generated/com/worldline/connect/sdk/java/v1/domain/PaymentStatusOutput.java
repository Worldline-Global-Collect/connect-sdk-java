/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class PaymentStatusOutput extends OrderStatusOutput {

    private Boolean isAuthorized;

    private Boolean isRefundable;

    private String threeDSecureStatus;

    /**
     * Indicates if the transaction has been authorized
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public Boolean getIsAuthorized() {
        return isAuthorized;
    }

    /**
     * Indicates if the transaction has been authorized
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public void setIsAuthorized(Boolean value) {
        this.isAuthorized = value;
    }

    /**
     * Flag indicating if the payment can be refunded
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public Boolean getIsRefundable() {
        return isRefundable;
    }

    /**
     * Flag indicating if the payment can be refunded
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public void setIsRefundable(Boolean value) {
        this.isRefundable = value;
    }

    /**
     * The 3D Secure status, with the following possible values:
     * <ul class="paragraph-width"><li>ENROLLED: the card is enrolled for 3D Secure authentication. The customer can be redirected to a 3D Secure access control server (ACS)
     * <li>NOT_ENROLLED: the card is not enrolled for 3D Secure authentication
     * <li>INVALID_PARES_OR_NOT_COMPLETED: the PARes is invalid, or the customer did not complete the 3D Secure authentication
     * <li>AUTHENTICATED: the customer has passed the 3D Secure authentication
     * <li>NOT_AUTHENTICATED: the customer failed the 3D Secure authentication
     * <li>NOT_PARTICIPATING: the cardholder has not set up their card for 2-step 3D Secure.
     * </ul>Note that this status will only be set for payments that make use of 2-step 3D Secure.
     */
    public String getThreeDSecureStatus() {
        return threeDSecureStatus;
    }

    /**
     * The 3D Secure status, with the following possible values:
     * <ul class="paragraph-width"><li>ENROLLED: the card is enrolled for 3D Secure authentication. The customer can be redirected to a 3D Secure access control server (ACS)
     * <li>NOT_ENROLLED: the card is not enrolled for 3D Secure authentication
     * <li>INVALID_PARES_OR_NOT_COMPLETED: the PARes is invalid, or the customer did not complete the 3D Secure authentication
     * <li>AUTHENTICATED: the customer has passed the 3D Secure authentication
     * <li>NOT_AUTHENTICATED: the customer failed the 3D Secure authentication
     * <li>NOT_PARTICIPATING: the cardholder has not set up their card for 2-step 3D Secure.
     * </ul>Note that this status will only be set for payments that make use of 2-step 3D Secure.
     */
    public void setThreeDSecureStatus(String value) {
        this.threeDSecureStatus = value;
    }
}
