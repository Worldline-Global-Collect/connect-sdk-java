/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class BoletoBancarioRequirednessValidator {

    private Integer fiscalNumberLength = null;

    /**
     * When performing a payment with Boleto Bancario, some values are only required when the fiscalnumber has a specific length. The length the fiscalnumber has to have to make the field required is defined here.
     * For example the CompanyName is required when the fiscalnumber is a CNPJ. The firstname and surname are required when the fiscalnumber is a CPF.
     */
    public Integer getFiscalNumberLength() {
        return fiscalNumberLength;
    }

    /**
     * When performing a payment with Boleto Bancario, some values are only required when the fiscalnumber has a specific length. The length the fiscalnumber has to have to make the field required is defined here.
     * For example the CompanyName is required when the fiscalnumber is a CNPJ. The firstname and surname are required when the fiscalnumber is a CPF.
     */
    public void setFiscalNumberLength(Integer value) {
        this.fiscalNumberLength = value;
    }
}
