/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.services;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.BankAccountBban;
import com.worldline.connect.sdk.java.v1.domain.BankDetailsRequest;
import com.worldline.connect.sdk.java.v1.domain.BankDetailsResponse;

public class ConvertBankAccountExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            BankAccountBban bankAccountBban = new BankAccountBban();
            bankAccountBban.setAccountNumber("0532013000");
            bankAccountBban.setBankCode("37040044");
            bankAccountBban.setCountryCode("DE");

            BankDetailsRequest body = new BankDetailsRequest();
            body.setBankAccountBban(bankAccountBban);

            BankDetailsResponse response = client.v1().merchant("merchantId").services().bankaccount(body);
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
