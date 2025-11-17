/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.captures;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.CreateDisputeRequest;
import com.worldline.connect.sdk.java.v1.domain.DisputeResponse;

public class CreateCaptureDisputeExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            AmountOfMoney amountOfMoney = new AmountOfMoney();
            amountOfMoney.setAmount(1234L);
            amountOfMoney.setCurrencyCode("USD");

            CreateDisputeRequest body = new CreateDisputeRequest();
            body.setAmountOfMoney(amountOfMoney);
            body.setContactPerson("Wile Coyote");
            body.setEmailAddress("wile.e.coyote@acmelabs.com");
            body.setReplyTo("r.runner@acmelabs.com");
            body.setRequestMessage("This is the message from the merchant to GlobalCollect. It is a a freeform text field.");

            DisputeResponse response = client.v1().merchant("merchantId").captures().dispute("captureId", body);
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
