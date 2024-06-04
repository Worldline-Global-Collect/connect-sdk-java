/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

/**
 * The response contains the details of the installment options
 */
public class InstallmentOptionsResponse {

    private List<InstallmentOptions> installmentOptions;

    /**
     * Array containing installment options their details and characteristics
     */
    public List<InstallmentOptions> getInstallmentOptions() {
        return installmentOptions;
    }

    /**
     * Array containing installment options their details and characteristics
     */
    public void setInstallmentOptions(List<InstallmentOptions> value) {
        this.installmentOptions = value;
    }
}
