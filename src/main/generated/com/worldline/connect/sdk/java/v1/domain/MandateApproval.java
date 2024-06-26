/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class MandateApproval {

    private String mandateSignatureDate;

    private String mandateSignaturePlace;

    private Boolean mandateSigned;

    /**
     * The date when the mandate was signed<br>
     * Format: YYYYMMDD
     */
    public String getMandateSignatureDate() {
        return mandateSignatureDate;
    }

    /**
     * The date when the mandate was signed<br>
     * Format: YYYYMMDD
     */
    public void setMandateSignatureDate(String value) {
        this.mandateSignatureDate = value;
    }

    /**
     * The city where the mandate was signed
     */
    public String getMandateSignaturePlace() {
        return mandateSignaturePlace;
    }

    /**
     * The city where the mandate was signed
     */
    public void setMandateSignaturePlace(String value) {
        this.mandateSignaturePlace = value;
    }

    /**
     * <ul class="paragraph-width"><li>true = Mandate is signed
     * <li>false = Mandate is not signed
     * </ul>
     */
    public Boolean getMandateSigned() {
        return mandateSigned;
    }

    /**
     * <ul class="paragraph-width"><li>true = Mandate is signed
     * <li>false = Mandate is not signed
     * </ul>
     */
    public void setMandateSigned(Boolean value) {
        this.mandateSigned = value;
    }
}
