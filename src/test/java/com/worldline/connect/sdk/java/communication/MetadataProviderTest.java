package com.worldline.connect.sdk.java.communication;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.worldline.connect.sdk.java.communication.MetadataProvider.ServerMetaInfo;
import com.worldline.connect.sdk.java.domain.ShoppingCartExtension;
import com.worldline.connect.sdk.java.json.DefaultMarshaller;
import com.worldline.connect.sdk.java.util.RequestHeaderMatcher;
import com.worldline.connect.sdk.java.util.ShoppingCartExtensionMatcher;

class MetadataProviderTest {

    @Test
    void testGetServerMetadataHeadersFull() {
        ShoppingCartExtension shoppingCartExtension = new ShoppingCartExtension("Worldline.Creator", "Extension", "1.0", "ExtensionId");

        MetadataProvider metadataProvider = new MetadataProviderBuilder("Worldline.Integrator")
                .withShoppingCartExtension(shoppingCartExtension)
                .build();

        Collection<RequestHeader> requestHeaders = metadataProvider.getServerMetadataHeaders();
        assertEquals(1, requestHeaders.size());

        RequestHeader requestHeader = requestHeaders.iterator().next();
        assertServerMetaInfo(metadataProvider, "Worldline.Integrator", shoppingCartExtension, requestHeader);
    }

    @Test
    void testGetServerMetadataHeadersFullNoShoppingCartExtensionId() {
        ShoppingCartExtension shoppingCartExtension = new ShoppingCartExtension("Worldline.Creator", "Extension", "1.0");

        MetadataProvider metadataProvider = new MetadataProviderBuilder("Worldline.Integrator")
                .withShoppingCartExtension(shoppingCartExtension)
                .build();

        Collection<RequestHeader> requestHeaders = metadataProvider.getServerMetadataHeaders();
        assertEquals(1, requestHeaders.size());

        RequestHeader requestHeader = requestHeaders.iterator().next();
        assertServerMetaInfo(metadataProvider, "Worldline.Integrator", shoppingCartExtension, requestHeader);
    }

    @Test
    void testGetServerMetadataHeadersNoAdditionalHeaders() {
        MetadataProvider metadataProvider = new MetadataProvider("Worldline");

        Collection<RequestHeader> requestHeaders = metadataProvider.getServerMetadataHeaders();
        assertEquals(1, requestHeaders.size());

        RequestHeader requestHeader = requestHeaders.iterator().next();
        assertServerMetaInfo(metadataProvider, "Worldline", null, requestHeader);
    }

    @Test
    void testGetServerMetadataHeadersWithAdditionalHeaders() {
        List<RequestHeader> additionalHeaders = Arrays.asList(
                new RequestHeader("Header1", "Value1"),
                new RequestHeader("Header2", "Value2"),
                new RequestHeader("Header3", "Value3")
        );

        MetadataProviderBuilder builder = new MetadataProviderBuilder("Worldline");
        // add directly, to bypass the checks - this test is also for validation in MetadataProvider
        builder.additionalRequestHeaders.addAll(additionalHeaders);

        MetadataProvider metadataProvider = new MetadataProvider(builder);

        Collection<RequestHeader> requestHeaders = metadataProvider.getServerMetadataHeaders();
        assertEquals(4, requestHeaders.size());

        Iterator<RequestHeader> requestHeaderIterator = requestHeaders.iterator();

        RequestHeader requestHeader = requestHeaderIterator.next();
        assertServerMetaInfo(metadataProvider, "Worldline", null, requestHeader);

        for (RequestHeader additionalHeader : additionalHeaders) {
            assertTrue(requestHeaderIterator.hasNext());
            requestHeader = requestHeaderIterator.next();
            assertThat(requestHeader, new RequestHeaderMatcher(additionalHeader));
        }
    }

    @ParameterizedTest
    @MethodSource("prohibitedHeaders")
    void testConstructorWithProhibitedHeader(String headerName) {
        MetadataProviderBuilder builder = new MetadataProviderBuilder("Worldline");
        // add directly, to bypass the checks - this test is also for validation in MetadataProvider
        builder.additionalRequestHeaders.add(new RequestHeader("Header1", "Value1"));
        builder.additionalRequestHeaders.add(new RequestHeader(headerName, UUID.randomUUID().toString()));
        builder.additionalRequestHeaders.add(new RequestHeader("Header2", "Value2"));

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new MetadataProvider(builder));
        assertThat(exception.getMessage(), containsString(headerName));
    }

    static Collection<String> prohibitedHeaders() {
        return MetadataProvider.PROHIBITED_HEADERS;
    }

    private void assertServerMetaInfo(MetadataProvider metadataProvider,
            String integrator,
            ShoppingCartExtension shoppingCartExtension,
            RequestHeader requestHeader) {

        assertEquals("X-GCS-ServerMetaInfo", requestHeader.getName());
        assertNotNull(requestHeader.getValue());

        String serverMetaInfoJson = new String(Base64.getDecoder().decode(requestHeader.getValue()), StandardCharsets.UTF_8);

        ServerMetaInfo serverMetaInfo = DefaultMarshaller.INSTANCE.unmarshal(serverMetaInfoJson, ServerMetaInfo.class);
        assertEquals(metadataProvider.getPlatformIdentifier(), serverMetaInfo.platformIdentifier);
        assertEquals(metadataProvider.getSdkIdentifier(), serverMetaInfo.sdkIdentifier);
        assertEquals("Worldline", serverMetaInfo.sdkCreator);
        assertEquals(integrator, serverMetaInfo.integrator);
        if (shoppingCartExtension == null) {
            assertNull(serverMetaInfo.shoppingCartExtension);
        } else {
            assertThat(serverMetaInfo.shoppingCartExtension, new ShoppingCartExtensionMatcher(shoppingCartExtension));
        }
    }
}
