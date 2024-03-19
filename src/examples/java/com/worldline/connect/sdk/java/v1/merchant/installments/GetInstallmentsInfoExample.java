/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.installments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.GetInstallmentRequest;
import com.worldline.connect.sdk.java.v1.domain.InstallmentOptionsResponse;

public class GetInstallmentsInfoExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            AmountOfMoney amountOfMoney = new AmountOfMoney();
            amountOfMoney.setAmount(123L);
            amountOfMoney.setCurrencyCode("EUR");

            GetInstallmentRequest body = new GetInstallmentRequest();
            body.setAmountOfMoney(amountOfMoney);
            body.setBin("123455");
            body.setCountryCode("NL");
            body.setPaymentProductId(123);

            InstallmentOptionsResponse response = client.v1().merchant("merchantId").installments().getInstallmentsInfo(body);
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
