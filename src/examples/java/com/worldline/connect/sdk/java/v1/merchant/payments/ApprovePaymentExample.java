/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.payments;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.domain.ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput;
import com.worldline.connect.sdk.java.v1.domain.ApprovePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.OrderApprovePayment;
import com.worldline.connect.sdk.java.v1.domain.OrderReferencesApprovePayment;
import com.worldline.connect.sdk.java.v1.domain.PaymentApprovalResponse;

public class ApprovePaymentExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput directDebitPaymentMethodSpecificInput = new ApprovePaymentNonSepaDirectDebitPaymentMethodSpecificInput();
            directDebitPaymentMethodSpecificInput.setDateCollect("20150201");
            directDebitPaymentMethodSpecificInput.setToken("bfa8a7e4-4530-455a-858d-204ba2afb77e");

            OrderReferencesApprovePayment references = new OrderReferencesApprovePayment();
            references.setMerchantReference("AcmeOrder0001");

            OrderApprovePayment order = new OrderApprovePayment();
            order.setReferences(references);

            ApprovePaymentRequest body = new ApprovePaymentRequest();
            body.setAmount(2980L);
            body.setDirectDebitPaymentMethodSpecificInput(directDebitPaymentMethodSpecificInput);
            body.setOrder(order);

            PaymentApprovalResponse response = client.v1().merchant("merchantId").payments().approve("paymentId", body);
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
