/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.products;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.GetCustomerDetailsRequest;
import com.worldline.connect.sdk.java.v1.domain.GetCustomerDetailsResponse;
import com.worldline.connect.sdk.java.v1.domain.KeyValuePair;

public class GetCustomerDetailsExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            List<KeyValuePair> values = new ArrayList<>();

            KeyValuePair value1 = new KeyValuePair();
            value1.setKey("fiscalNumber");
            value1.setValue("01234567890");

            values.add(value1);

            GetCustomerDetailsRequest body = new GetCustomerDetailsRequest();
            body.setCountryCode("SE");
            body.setValues(values);

            GetCustomerDetailsResponse response = client.v1().merchant("merchantId").products().customerDetails(9000, body);
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
