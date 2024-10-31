package com.worldline.connect.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.v1.domain.ConvertAmount;
import com.worldline.connect.sdk.java.v1.merchant.services.ConvertAmountParams;
import com.worldline.connect.sdk.java.v1.merchant.services.ServicesClient;

class SDKProxyTest extends ItTest {

    /**
     * Smoke test for using a proxy configured through SDK properties.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        ConvertAmountParams request = new ConvertAmountParams();
        request.setAmount(123L);
        request.setSource("USD");
        request.setTarget("EUR");

        try (Client client = getClientWithProxy()) {
            ServicesClient services = client.v1().merchant(getMerchantId()).services();

            ConvertAmount response = services.convertAmount(request);

            assertNotNull(response.getConvertedAmount());
        }
    }
}
