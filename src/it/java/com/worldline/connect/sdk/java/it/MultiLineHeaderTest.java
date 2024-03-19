package com.worldline.connect.sdk.java.it;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.Client;
import com.worldline.connect.sdk.java.Communicator;
import com.worldline.connect.sdk.java.CommunicatorConfiguration;
import com.worldline.connect.sdk.java.Factory;
import com.worldline.connect.sdk.java.communication.MetadataProvider;
import com.worldline.connect.sdk.java.communication.MetadataProviderBuilder;
import com.worldline.connect.sdk.java.communication.RequestHeader;
import com.worldline.connect.sdk.java.v1.domain.Directory;
import com.worldline.connect.sdk.java.v1.merchant.products.DirectoryParams;

class MultiLineHeaderTest extends ItTest {

    /**
     * Smoke test for products service.
     */
    @Test
    void test() throws URISyntaxException, IOException {
        CommunicatorConfiguration configuration = getCommunicatorConfiguration();

        String multiLineHeader = " some value  \r\n \n with  some \r\n  spaces ";
        MetadataProvider metadataProvider = new MetadataProviderBuilder("Worldline")
                .withAdditionalRequestHeader(new RequestHeader("X-GCS-MultiLineHeader", multiLineHeader))
                .build();

        DirectoryParams params = new DirectoryParams();
        params.setCountryCode("NL");
        params.setCurrencyCode("EUR");

        @SuppressWarnings("resource")
        Communicator communicator = Factory.createCommunicatorBuilder(configuration)
                .withMetadataProvider(metadataProvider)
                .build();
        try (Client client = Factory.createClient(communicator)) {
            Directory response = client.v1().merchant(getMerchantId()).products().directory(809, params);

            assertTrue(response.getEntries().size() > 0);
        }
    }
}
