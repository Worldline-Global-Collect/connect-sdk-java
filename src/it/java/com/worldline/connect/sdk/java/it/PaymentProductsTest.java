package com.worldline.connect.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.v1.domain.Directory;
import com.worldline.connect.sdk.java.v1.domain.PaymentProducts;
import com.worldline.connect.sdk.java.v1.merchant.products.DirectoryParams;
import com.worldline.connect.sdk.java.v1.merchant.products.FindProductsParams;

class PaymentProductsTest extends ItTest {

    /**
     * Smoke test for products service.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        FindProductsParams params = new FindProductsParams();
        params.setCountryCode("NL");
        params.setCurrencyCode("EUR");

        try (Client client = getClient()) {
            PaymentProducts response = client.v1().merchant(getMerchantId()).products().find(params);

            assertTrue(response.getPaymentProducts().size() > 0);
        }
    }

    /**
     * Smoke test for product directories service.
     */
    @Test
    void testDirectories() throws URISyntaxException, IOException {

        DirectoryParams params = new DirectoryParams();
        params.setCountryCode("NL");
        params.setCurrencyCode("EUR");

        try (Client client = getClient()) {
            Directory response = client.v1().merchant(getMerchantId()).products().directory(809, params);

            assertTrue(response.getEntries().size() > 0);
        }
    }
}
