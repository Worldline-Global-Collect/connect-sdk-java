/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Output of the retrieval of the privacy policy
 */
public class GetPrivacyPolicyResponse {

    private String htmlContent = null;

    /**
     * HTML content to be displayed to the user
     */
    public String getHtmlContent() {
        return htmlContent;
    }

    /**
     * HTML content to be displayed to the user
     */
    public void setHtmlContent(String value) {
        this.htmlContent = value;
    }
}
