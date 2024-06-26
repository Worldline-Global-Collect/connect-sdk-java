/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class DisputeOutput {

    private AmountOfMoney amountOfMoney;

    private String contactPerson;

    private DisputeCreationDetail creationDetails;

    private String emailAddress;

    private List<HostedFile> files;

    private DisputeReference reference;

    private String replyTo;

    private String requestMessage;

    private String responseMessage;

    /**
     * Object containing amount and ISO currency code attributes
     */
    public AmountOfMoney getAmountOfMoney() {
        return amountOfMoney;
    }

    /**
     * Object containing amount and ISO currency code attributes
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
     * Object containing various details related to this dispute’s creation.
     */
    public DisputeCreationDetail getCreationDetails() {
        return creationDetails;
    }

    /**
     * Object containing various details related to this dispute’s creation.
     */
    public void setCreationDetails(DisputeCreationDetail value) {
        this.creationDetails = value;
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
     * An array containing all files related to this dispute.
     */
    public List<HostedFile> getFiles() {
        return files;
    }

    /**
     * An array containing all files related to this dispute.
     */
    public void setFiles(List<HostedFile> value) {
        this.files = value;
    }

    /**
     * A collection of reference information related to this dispute.
     */
    public DisputeReference getReference() {
        return reference;
    }

    /**
     * A collection of reference information related to this dispute.
     */
    public void setReference(DisputeReference value) {
        this.reference = value;
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

    /**
     * The return message sent from the GlobalCollect platform to you.
     */
    public String getResponseMessage() {
        return responseMessage;
    }

    /**
     * The return message sent from the GlobalCollect platform to you.
     */
    public void setResponseMessage(String value) {
        this.responseMessage = value;
    }
}
