/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

/**
 * Array containing installment options their details and characteristics
 */
public class InstallmentOptions {

    private InstallmentDisplayHints displayHints;

    private String id;

    private List<Installments> installmentPlans;

    /**
     * Object containing information for the client on how best to display the installment options
     */
    public InstallmentDisplayHints getDisplayHints() {
        return displayHints;
    }

    /**
     * Object containing information for the client on how best to display the installment options
     */
    public void setDisplayHints(InstallmentDisplayHints value) {
        this.displayHints = value;
    }

    /**
     * The ID of the installment option in our system
     */
    public String getId() {
        return id;
    }

    /**
     * The ID of the installment option in our system
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Object containing information about installment plans
     */
    public List<Installments> getInstallmentPlans() {
        return installmentPlans;
    }

    /**
     * Object containing information about installment plans
     */
    public void setInstallmentPlans(List<Installments> value) {
        this.installmentPlans = value;
    }
}
