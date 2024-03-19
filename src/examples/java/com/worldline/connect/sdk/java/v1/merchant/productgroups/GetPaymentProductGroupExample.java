/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.productgroups;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.PaymentProductGroupResponse;

public class GetPaymentProductGroupExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            GetProductgroupParams query = new GetProductgroupParams();
            query.setCountryCode("US");
            query.setCurrencyCode("USD");
            query.setLocale("en_US");
            query.setAmount(1000L);
            query.setIsRecurring(true);
            query.setIsInstallments(true);
            query.addHide("fields");

            PaymentProductGroupResponse response = client.v1().merchant("merchantId").productgroups().get("cards", query);
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
