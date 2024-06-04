/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class ThirdPartyStatusResponse {

    private String thirdPartyStatus;

    /**
     * The status returned by the third party.
     * 
     * Possible values:
     * <ul class="paragraph-width"><li>WAITING - The customer has not connected to the third party</li>
     * <li>INITIALIZED - Authentication in progress</li>
     * <li>AUTHORIZED - Payment in progress</li>
     * <li>COMPLETED - The customer has completed the payment at the third party</li></ul>
     */
    public String getThirdPartyStatus() {
        return thirdPartyStatus;
    }

    /**
     * The status returned by the third party.
     * 
     * Possible values:
     * <ul class="paragraph-width"><li>WAITING - The customer has not connected to the third party</li>
     * <li>INITIALIZED - Authentication in progress</li>
     * <li>AUTHORIZED - Payment in progress</li>
     * <li>COMPLETED - The customer has completed the payment at the third party</li></ul>
     */
    public void setThirdPartyStatus(String value) {
        this.thirdPartyStatus = value;
    }
}
