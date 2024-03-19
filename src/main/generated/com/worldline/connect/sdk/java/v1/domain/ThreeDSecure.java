/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * Object containing specific data regarding 3-D Secure
 */
public class ThreeDSecure extends AbstractThreeDSecure {

    private ExternalCardholderAuthenticationData externalCardholderAuthenticationData = null;

    private RedirectionData redirectionData = null;

    /**
     * Object containing 3D secure details.
     */
    public ExternalCardholderAuthenticationData getExternalCardholderAuthenticationData() {
        return externalCardholderAuthenticationData;
    }

    /**
     * Object containing 3D secure details.
     */
    public void setExternalCardholderAuthenticationData(ExternalCardholderAuthenticationData value) {
        this.externalCardholderAuthenticationData = value;
    }

    /**
     * Object containing browser specific redirection related data
     */
    public RedirectionData getRedirectionData() {
        return redirectionData;
    }

    /**
     * Object containing browser specific redirection related data
     */
    public void setRedirectionData(RedirectionData value) {
        this.redirectionData = value;
    }
}
