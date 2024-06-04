/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class OrderInvoiceData {

    private String additionalData;

    private String invoiceDate;

    private String invoiceNumber;

    private List<String> textQualifiers;

    /**
     * Additional data for printed invoices
     */
    public String getAdditionalData() {
        return additionalData;
    }

    /**
     * Additional data for printed invoices
     */
    public void setAdditionalData(String value) {
        this.additionalData = value;
    }

    /**
     * Date and time on invoice<br>
     * Format: YYYYMMDDHH24MISS
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Date and time on invoice<br>
     * Format: YYYYMMDDHH24MISS
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Your invoice number (on printed invoice) that is also returned in our report files
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Your invoice number (on printed invoice) that is also returned in our report files
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Array of 3 text qualifiers, each with a max length of 10 characters
     */
    public List<String> getTextQualifiers() {
        return textQualifiers;
    }

    /**
     * Array of 3 text qualifiers, each with a max length of 10 characters
     */
    public void setTextQualifiers(List<String> value) {
        this.textQualifiers = value;
    }
}
