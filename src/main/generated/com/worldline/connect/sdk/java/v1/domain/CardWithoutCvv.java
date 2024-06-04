/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CardWithoutCvv extends CardEssentials {

    private String issueNumber;

    /**
     * Issue number on the card (if applicable)
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * Issue number on the card (if applicable)
     */
    public void setIssueNumber(String value) {
        this.issueNumber = value;
    }
}
