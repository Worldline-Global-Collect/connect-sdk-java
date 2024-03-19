/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.refunds;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.FindRefundsResponse;

public class FindRefundsExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            FindRefundsParams query = new FindRefundsParams();
            query.setHostedCheckoutId("15c09dac-bf44-486a-af6b-edfd8680a166");
            query.setMerchantReference("AcmeOrder0001");
            query.setMerchantOrderId(123456L);
            query.setOffset(0);
            query.setLimit(10);

            FindRefundsResponse response = client.v1().merchant("merchantId").refunds().find(query);
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
