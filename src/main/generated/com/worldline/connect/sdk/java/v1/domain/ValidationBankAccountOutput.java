/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class ValidationBankAccountOutput {

    private List<ValidationBankAccountCheck> checks;

    private String newBankName;

    private String reformattedAccountNumber;

    private String reformattedBankCode;

    private String reformattedBranchCode;

    /**
     * Array of checks performed with the results of each check
     */
    public List<ValidationBankAccountCheck> getChecks() {
        return checks;
    }

    /**
     * Array of checks performed with the results of each check
     */
    public void setChecks(List<ValidationBankAccountCheck> value) {
        this.checks = value;
    }

    /**
     * Bank name, matching the bank code of the request
     */
    public String getNewBankName() {
        return newBankName;
    }

    /**
     * Bank name, matching the bank code of the request
     */
    public void setNewBankName(String value) {
        this.newBankName = value;
    }

    /**
     * Reformatted account number according to local clearing rules
     */
    public String getReformattedAccountNumber() {
        return reformattedAccountNumber;
    }

    /**
     * Reformatted account number according to local clearing rules
     */
    public void setReformattedAccountNumber(String value) {
        this.reformattedAccountNumber = value;
    }

    /**
     * Reformatted bank code according to local clearing rules
     */
    public String getReformattedBankCode() {
        return reformattedBankCode;
    }

    /**
     * Reformatted bank code according to local clearing rules
     */
    public void setReformattedBankCode(String value) {
        this.reformattedBankCode = value;
    }

    /**
     * Reformatted branch code according to local clearing rules
     */
    public String getReformattedBranchCode() {
        return reformattedBranchCode;
    }

    /**
     * Reformatted branch code according to local clearing rules
     */
    public void setReformattedBranchCode(String value) {
        this.reformattedBranchCode = value;
    }
}
