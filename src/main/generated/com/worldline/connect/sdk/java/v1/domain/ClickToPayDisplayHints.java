/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class ClickToPayDisplayHints {

    private String logo;

    /**
     * Partial URL that you can reference for the image of Click to Pay. You can use our server-side resize functionality by appending '?size={{width}}x{{height}}' to the full URL, where width and height are specified in pixels. The resized image will always keep its correct aspect ratio.
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Partial URL that you can reference for the image of Click to Pay. You can use our server-side resize functionality by appending '?size={{width}}x{{height}}' to the full URL, where width and height are specified in pixels. The resized image will always keep its correct aspect ratio.
     */
    public void setLogo(String value) {
        this.logo = value;
    }
}
