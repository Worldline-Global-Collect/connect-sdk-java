/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CreateDisputeRequest {

    private AmountOfMoney amountOfMoney;

    private String contactPerson;

    private String emailAddress;

    private String replyTo;

    private String requestMessage;

    /**
     * The amount of money that is to be disputed.
     */
    public AmountOfMoney getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * The amount of money that is to be disputed.
     */
    public void setAmountOfMoney(AmountOfMoney value) {
        this.amountOfMoney = value;
    }

    /**
     * The name of the person on your side who can be contacted regarding this dispute.
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * The name of the person on your side who can be contacted regarding this dispute.
     */
    public void setContactPerson(String value) {
        this.contactPerson = value;
    }

    /**
     * The email address of the contact person.
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * The email address of the contact person.
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * The email address to which the reply message will be sent.
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * The email address to which the reply message will be sent.
     */
    public void setReplyTo(String value) {
        this.replyTo = value;
    }

    /**
     * The message sent from you to Worldline.
     */
    public String getRequestMessage() {
        return requestMessage;
    }

    /**
     * The message sent from you to Worldline.
     */
    public void setRequestMessage(String value) {
        this.requestMessage = value;
    }
}
