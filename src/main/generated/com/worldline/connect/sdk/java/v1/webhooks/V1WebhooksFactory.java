/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.webhooks;

import com.worldline.connect.sdk.java.json.DefaultMarshaller;
import com.worldline.connect.sdk.java.webhooks.SecretKeyStore;

/**
 * Worldline Global Collect platform factory for several v1 webhooks components.
 */
public final class V1WebhooksFactory {

    /**
     * Creates a {@link WebhooksHelperBuilder} that will use the given {@link SecretKeyStore}.
     */
    public WebhooksHelperBuilder createHelperBuilder(SecretKeyStore secretKeyStore) {
        return new WebhooksHelperBuilder()
                .withMarshaller(DefaultMarshaller.INSTANCE)
                .withSecretKeyStore(secretKeyStore);
    }

    /**
     * Creates a {@link WebhooksHelper} that will use the given {@link SecretKeyStore}.
     */
    public WebhooksHelper createHelper(SecretKeyStore secretKeyStore) {
        return createHelperBuilder(secretKeyStore).build();
    }
}
