/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

/**
 * This object has the numeric representation of the current capture status, timestamp of last status change and performable action on the current capture resource. In case of failed captures and negative scenarios, detailed error information is listed.
 */
public class CaptureStatusOutput {

    private Boolean isRefundable;

    private Boolean isRetriable;

    private List<KeyValuePair> providerRawOutput;

    private Integer statusCode;

    private String statusCodeChangeDateTime;

    /**
     * Flag indicating if a capture can be refunded 
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public Boolean getIsRefundable() {
        return isRefundable;
    }

    /**
     * Flag indicating if a capture can be refunded 
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public void setIsRefundable(Boolean value) {
        this.isRefundable = value;
    }

    /**
     * Flag indicating whether a rejected capture may be retried by you without incurring a fee 
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public Boolean getIsRetriable() {
        return isRetriable;
    }

    /**
     * Flag indicating whether a rejected capture may be retried by you without incurring a fee 
     * <ul class="paragraph-width"><li>true
     * <li>false
     * </ul>
     */
    public void setIsRetriable(Boolean value) {
        this.isRetriable = value;
    }

    /**
     * This is the raw response returned by the acquirer. This property contains unprocessed data directly returned by the acquirer. It's recommended for data analysis only due to its dynamic nature, which may undergo future changes.
     */
    public List<KeyValuePair> getProviderRawOutput() {
        return providerRawOutput;
    }

    /**
     * This is the raw response returned by the acquirer. This property contains unprocessed data directly returned by the acquirer. It's recommended for data analysis only due to its dynamic nature, which may undergo future changes.
     */
    public void setProviderRawOutput(List<KeyValuePair> value) {
        this.providerRawOutput = value;
    }

    /**
     * Numeric status code of the legacy API. It is returned to ease the migration from the legacy APIs to Worldline Connect. You should not write new business logic based on this property as it will be deprecated in a future version of the API. The value can also be found in the GlobalCollect Payment Console, in the Ogone BackOffice and in report files.
     */
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Numeric status code of the legacy API. It is returned to ease the migration from the legacy APIs to Worldline Connect. You should not write new business logic based on this property as it will be deprecated in a future version of the API. The value can also be found in the GlobalCollect Payment Console, in the Ogone BackOffice and in report files.
     */
    public void setStatusCode(Integer value) {
        this.statusCode = value;
    }

    /**
     * Date and time of capture<br>
     *  Format: YYYYMMDDHH24MISS
     */
    public String getStatusCodeChangeDateTime() {
        return statusCodeChangeDateTime;
    }

    /**
     * Date and time of capture<br>
     *  Format: YYYYMMDDHH24MISS
     */
    public void setStatusCodeChangeDateTime(String value) {
        this.statusCodeChangeDateTime = value;
    }
}
