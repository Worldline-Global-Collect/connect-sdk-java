/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class ProtectionEligibility {

    private String eligibility;

    private String type;

    /**
     * Possible values: <ul class="paragraph-width"> <li> Eligible <li> PartiallyEligible <li> Ineligible </ul>
     */
    public String getEligibility() {
        return eligibility;
    }

    /**
     * Possible values: <ul class="paragraph-width"> <li> Eligible <li> PartiallyEligible <li> Ineligible </ul>
     */
    public void setEligibility(String value) {
        this.eligibility = value;
    }

    /**
     * Possible values: <ul class="paragraph-width"> <li> ItemNotReceivedEligible <li> UnauthorizedPaymentEligible <li> Ineligible </ul>
     */
    public String getType() {
        return type;
    }

    /**
     * Possible values: <ul class="paragraph-width"> <li> ItemNotReceivedEligible <li> UnauthorizedPaymentEligible <li> Ineligible </ul>
     */
    public void setType(String value) {
        this.type = value;
    }
}
