/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.captures;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.v1.ApiException;
import com.worldline.connect.sdk.java.v1.DeclinedRefundException;
import com.worldline.connect.sdk.java.v1.domain.APIError;
import com.worldline.connect.sdk.java.v1.domain.AmountOfMoney;
import com.worldline.connect.sdk.java.v1.domain.RefundReferences;
import com.worldline.connect.sdk.java.v1.domain.RefundRequest;
import com.worldline.connect.sdk.java.v1.domain.RefundResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundResult;

public class CreateRefundCaptureExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            AmountOfMoney amountOfMoney = new AmountOfMoney();
            amountOfMoney.setAmount(500L);
            amountOfMoney.setCurrencyCode("EUR");

            RefundReferences refundReferences = new RefundReferences();
            refundReferences.setMerchantReference("AcmeOrder0001");

            RefundRequest body = new RefundRequest();
            body.setAmountOfMoney(amountOfMoney);
            body.setRefundReferences(refundReferences);

            try {
                RefundResponse response = client.v1().merchant("merchantId").captures().refund("captureId", body);
            } catch (DeclinedRefundException e) {
                handleDeclinedRefund(e.getRefundResult());
            } catch (ApiException e) {
                handleApiErrors(e.getErrors());
            }
        }
    }

    private Client getClient() throws URISyntaxException {
        String apiKeyId = System.getProperty("connect.api.apiKeyId", "someKey");
        String secretApiKey = System.getProperty("connect.api.secretApiKey", "someSecret");

        URL propertiesUrl = getClass().getResource("/example-configuration.properties");
        CommunicatorConfiguration configuration = Factory.createConfiguration(propertiesUrl.toURI(), apiKeyId, secretApiKey);
        return Factory.createClient(configuration);
    }

    @SuppressWarnings("unused")
    private void handleDeclinedRefund(RefundResult refundResult) {
        // handle the result here
    }

    @SuppressWarnings("unused")
    private void handleApiErrors(List<APIError> errors) {
        // handle the errors here
    }
}
