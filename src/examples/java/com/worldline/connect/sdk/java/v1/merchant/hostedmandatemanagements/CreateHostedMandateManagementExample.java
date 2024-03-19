/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.hostedmandatemanagements;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.CreateHostedMandateManagementRequest;
import com.worldline.connect.sdk.java.v1.domain.CreateHostedMandateManagementResponse;
import com.worldline.connect.sdk.java.v1.domain.HostedMandateInfo;
import com.worldline.connect.sdk.java.v1.domain.HostedMandateManagementSpecificInput;

public class CreateHostedMandateManagementExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            HostedMandateInfo createMandateInfo = new HostedMandateInfo();
            createMandateInfo.setCustomerReference("idonthaveareference");
            createMandateInfo.setRecurrenceType("RECURRING");
            createMandateInfo.setSignatureType("UNSIGNED");

            HostedMandateManagementSpecificInput hostedMandateManagementSpecificInput = new HostedMandateManagementSpecificInput();
            hostedMandateManagementSpecificInput.setLocale("fr_FR");
            hostedMandateManagementSpecificInput.setReturnUrl("http://www.example.com");
            hostedMandateManagementSpecificInput.setVariant("101");

            CreateHostedMandateManagementRequest body = new CreateHostedMandateManagementRequest();
            body.setCreateMandateInfo(createMandateInfo);
            body.setHostedMandateManagementSpecificInput(hostedMandateManagementSpecificInput);

            CreateHostedMandateManagementResponse response = client.v1().merchant("merchantId").hostedmandatemanagements().create(body);
        }
    }

    private Client getClient() throws URISyntaxException {
        String apiKeyId = System.getProperty("connect.api.apiKeyId", "someKey");
        String secretApiKey = System.getProperty("connect.api.secretApiKey", "someSecret");

        URL propertiesUrl = getClass().getResource("/example-configuration.properties");
        CommunicatorConfiguration configuration = Factory.createConfiguration(propertiesUrl.toURI(), apiKeyId, secretApiKey);
        return Factory.createClient(configuration);
    }
}
