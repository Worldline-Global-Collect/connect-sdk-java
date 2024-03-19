package com.worldline.connect.sdk.java.webhooks;

import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.json.DefaultMarshaller;
import com.worldline.connect.sdk.java.json.Marshaller;
import com.worldline.connect.sdk.java.util.ReflectionUtil;
import com.worldline.connect.sdk.java.v1.webhooks.WebhooksHelper;

class WebhooksTest {

    @Test
    void testCreateHelper() {
        WebhooksHelper helper = Webhooks.v1().createHelper(InMemorySecretKeyStore.INSTANCE);

        SignatureValidator signatureValidator = ReflectionUtil.getField(helper, "signatureValidator", SignatureValidator.class);

        assertSame(DefaultMarshaller.INSTANCE, ReflectionUtil.getField(helper, "marshaller", Marshaller.class));
        assertSame(InMemorySecretKeyStore.INSTANCE, ReflectionUtil.getField(signatureValidator, "secretKeyStore", SecretKeyStore.class));
    }
}
