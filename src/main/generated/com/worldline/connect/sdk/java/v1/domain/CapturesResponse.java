/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class CapturesResponse {

    private List<Capture> captures;

    /**
     * The list of all captures performed on the requested payment.
     */
    public List<Capture> getCaptures() {
        return captures;
    }

    /**
     * The list of all captures performed on the requested payment.
     */
    public void setCaptures(List<Capture> value) {
        this.captures = value;
    }
}
