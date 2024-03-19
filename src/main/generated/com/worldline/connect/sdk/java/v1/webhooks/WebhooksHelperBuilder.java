/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.webhooks;

import com.worldline.connect.sdk.java.json.Marshaller;
import com.worldline.connect.sdk.java.webhooks.SecretKeyStore;

/**
 * Builder for a {@link WebhooksHelper} object.
 */
public class WebhooksHelperBuilder {

    private Marshaller marshaller;

    private SecretKeyStore secretKeyStore;

    /**
     * Sets the {@link Marshaller} to use.
     */
    public WebhooksHelperBuilder withMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
        return this;
    }

    /**
     * Sets the {@link SecretKeyStore} to use.
     */
    public WebhooksHelperBuilder withSecretKeyStore(SecretKeyStore secretKeyStore) {
        this.secretKeyStore = secretKeyStore;
        return this;
    }

    /**
     * Creates a fully initialized {@link WebhooksHelper} object.
     *
     * @throws IllegalArgumentException if not all required components are set
     */
    public WebhooksHelper build() {
        return new WebhooksHelper(marshaller, secretKeyStore);
    }
}
