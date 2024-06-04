/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class ValidationBankAccountCheck {

    private String code;

    private String description;

    private String result;

    /**
     * Code of the bank account validation check
     */
    public String getCode() {
        return code;
    }

    /**
     * Code of the bank account validation check
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Description of check performed
     */
    public String getDescription() {
        return description;
    }

    /**
     * Description of check performed
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Result of the bank account validation check performed, with the following possible results:
     * <ul class="paragraph-width">
     * <li>PASSED - The check passed
     * <li>ERROR - The check did not pass
     * <li>WARNING - Depending on your needs this either needs to be treated as a passed or error response. It depends on your business logic and for what purpose you want to use the validated bank account details.
     * <li>NOTCHECKED - This check was not performed, usually because one of the earlier checks already caused an error response to be triggered
     * </ul>
     */
    public String getResult() {
        return result;
    }

    /**
     * Result of the bank account validation check performed, with the following possible results:
     * <ul class="paragraph-width">
     * <li>PASSED - The check passed
     * <li>ERROR - The check did not pass
     * <li>WARNING - Depending on your needs this either needs to be treated as a passed or error response. It depends on your business logic and for what purpose you want to use the validated bank account details.
     * <li>NOTCHECKED - This check was not performed, usually because one of the earlier checks already caused an error response to be triggered
     * </ul>
     */
    public void setResult(String value) {
        this.result = value;
    }
}
