/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class CreateHostedMandateManagementRequest {

    private HostedMandateInfo createMandateInfo = null;

    private HostedMandateManagementSpecificInput hostedMandateManagementSpecificInput = null;

    /**
     * Object containing partial information needed for the creation of the mandate. The recurrencetype, signature type of the mandate and reference to the customer are mandatory. You can also supply any personal information you already know about the customer so they have to fill in less details.
     */
    public HostedMandateInfo getCreateMandateInfo() {
        return createMandateInfo;
    }

    /**
     * Object containing partial information needed for the creation of the mandate. The recurrencetype, signature type of the mandate and reference to the customer are mandatory. You can also supply any personal information you already know about the customer so they have to fill in less details.
     */
    public void setCreateMandateInfo(HostedMandateInfo value) {
        this.createMandateInfo = value;
    }

    /**
     * Object containing hosted mandate management specific data
     */
    public HostedMandateManagementSpecificInput getHostedMandateManagementSpecificInput() {
        return hostedMandateManagementSpecificInput;
    }

    /**
     * Object containing hosted mandate management specific data
     */
    public void setHostedMandateManagementSpecificInput(HostedMandateManagementSpecificInput value) {
        this.hostedMandateManagementSpecificInput = value;
    }
}
