/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.webhooks;

import com.worldline.connect.sdk.java.v1.webhooks.V1WebhooksFactory;

/**
 * Worldline Global Collect platform factory for several webhooks components.
 */
public final class Webhooks {

    private static final V1WebhooksFactory V1 = new V1WebhooksFactory();

    private Webhooks() {
    }

    public static V1WebhooksFactory v1() {
        return V1;
    }
}
