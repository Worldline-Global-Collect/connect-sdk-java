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
import com.worldline.connect.sdk.java.v1.domain.CardWithoutCvv;
import com.worldline.connect.sdk.java.v1.domain.CompletePaymentCardPaymentMethodSpecificInput;
import com.worldline.connect.sdk.java.v1.domain.CompletePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CompletePaymentResponse;

public class CompletePaymentExample {

    @SuppressWarnings("unused")
    public void example() throws URISyntaxException, IOException {
        try (Client client = getClient()) {
            CardWithoutCvv card = new CardWithoutCvv();
            card.setCardNumber("67030000000000003");
            card.setCardholderName("Wile E. Coyote");
            card.setExpiryDate("1299");

            CompletePaymentCardPaymentMethodSpecificInput cardPaymentMethodSpecificInput = new CompletePaymentCardPaymentMethodSpecificInput();
            cardPaymentMethodSpecificInput.setCard(card);

            CompletePaymentRequest body = new CompletePaymentRequest();
            body.setCardPaymentMethodSpecificInput(cardPaymentMethodSpecificInput);

            CompletePaymentResponse response = client.v1().merchant("merchantId").payments().complete("paymentId", body);
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
