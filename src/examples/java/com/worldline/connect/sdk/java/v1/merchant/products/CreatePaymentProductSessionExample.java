/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.products;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentProductSessionRequest;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentProductSessionResponse;
import com.worldline.connect.sdk.java.v1.domain.MobilePaymentProductSession302SpecificInput;

public class CreatePaymentProductSessionExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            MobilePaymentProductSession302SpecificInput paymentProductSession302SpecificInput = new MobilePaymentProductSession302SpecificInput();
            paymentProductSession302SpecificInput.setDisplayName("Worldline");
            paymentProductSession302SpecificInput.setDomainName("pay1.checkout.worldline-solutions.com");
            paymentProductSession302SpecificInput.setValidationUrl("<VALIDATION URL RECEIVED FROM APPLE>");

            CreatePaymentProductSessionRequest body = new CreatePaymentProductSessionRequest();
            body.setPaymentProductSession302SpecificInput(paymentProductSession302SpecificInput);

            CreatePaymentProductSessionResponse response = client.v1().merchant("merchantId").products().sessions(302, body);
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
