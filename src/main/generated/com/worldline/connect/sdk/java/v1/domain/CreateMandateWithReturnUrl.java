/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CreateMandateWithReturnUrl extends CreateMandateBase {

    private String returnUrl;

    /**
     * Return URL to use if the mandate signing requires redirection.
     */
    public String getReturnUrl() {
        return returnUrl;
    }

    /**
     * Return URL to use if the mandate signing requires redirection.
     */
    public void setReturnUrl(String value) {
        this.returnUrl = value;
    }
}
