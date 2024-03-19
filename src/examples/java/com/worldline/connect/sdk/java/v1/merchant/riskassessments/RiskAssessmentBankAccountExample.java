/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.riskassessments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.Address;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.BankAccountBban;
import com.worldline.connect.sdk.java.v1.domain.CustomerRiskAssessment;
import com.worldline.connect.sdk.java.v1.domain.OrderRiskAssessment;
import com.worldline.connect.sdk.java.v1.domain.RiskAssessmentBankAccount;
import com.worldline.connect.sdk.java.v1.domain.RiskAssessmentResponse;

public class RiskAssessmentBankAccountExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            BankAccountBban bankAccountBban = new BankAccountBban();
            bankAccountBban.setAccountNumber("0532013000");
            bankAccountBban.setBankCode("37040044");
            bankAccountBban.setCountryCode("DE");

            AmountOfMoney amountOfMoney = new AmountOfMoney();
            amountOfMoney.setAmount(100L);
            amountOfMoney.setCurrencyCode("EUR");

            Address billingAddress = new Address();
            billingAddress.setCountryCode("US");

            CustomerRiskAssessment customer = new CustomerRiskAssessment();
            customer.setBillingAddress(billingAddress);
            customer.setLocale("en_US");

            OrderRiskAssessment order = new OrderRiskAssessment();
            order.setAmountOfMoney(amountOfMoney);
            order.setCustomer(customer);

            RiskAssessmentBankAccount body = new RiskAssessmentBankAccount();
            body.setBankAccountBban(bankAccountBban);
            body.setOrder(order);

            RiskAssessmentResponse response = client.v1().merchant("merchantId").riskassessments().bankaccounts(body);
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
