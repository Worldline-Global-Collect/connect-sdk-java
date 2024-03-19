package com.worldline.connect.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.v1.domain.PaymentProductGroupResponse;
import com.worldline.connect.sdk.java.v1.merchant.productgroups.GetProductgroupParams;

class PaymentProductGroupsTest extends ItTest {

    /**
     * Smoke test for product groups service.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        GetProductgroupParams params = new GetProductgroupParams();
        params.setCountryCode("NL");
        params.setCurrencyCode("EUR");

        try (Client client = getClient()) {
            PaymentProductGroupResponse response = client.v1().merchant(getMerchantId()).productgroups().get("cards", params);

            assertEquals("cards", response.getId());
        }
    }
}
