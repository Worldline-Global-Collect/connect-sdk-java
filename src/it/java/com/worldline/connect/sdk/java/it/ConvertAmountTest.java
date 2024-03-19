package com.worldline.connect.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.v1.domain.ConvertAmount;
import com.worldline.connect.sdk.java.v1.merchant.services.ConvertAmountParams;

class ConvertAmountTest extends ItTest {

    /**
     * Smoke test for convert amount service.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        ConvertAmountParams request = new ConvertAmountParams();
        request.setAmount(123L);
        request.setSource("USD");
        request.setTarget("EUR");

        try (Client client = getClient()) {
            ConvertAmount response = client.v1().merchant(getMerchantId()).services().convertAmount(request);

            assertNotNull(response.getConvertedAmount());
        }
    }

    /**
     * Smoke test for convert amount service with connection reuse turned off.
     */
    @Test
    void testWithoutConnectionReuse() throws URISyntaxException, IOException {

        ConvertAmountParams request = new ConvertAmountParams();
        request.setAmount(123L);
        request.setSource("USD");
        request.setTarget("EUR");

        try (Client client = getClientWithoutConnectionReuse()) {
            ConvertAmount response = client.v1().merchant(getMerchantId()).services().convertAmount(request);

            assertNotNull(response.getConvertedAmount());

            response = client.v1().merchant(getMerchantId()).services().convertAmount(request);

            assertNotNull(response.getConvertedAmount());
        }
    }
}
