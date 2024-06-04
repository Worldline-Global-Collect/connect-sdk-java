/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.productgroups;

import java.util.Map;
import java.util.TreeMap;

import com.worldline.connect.sdk.java.ApiResource;
import com.worldline.connect.sdk.java.CallContext;
import com.worldline.connect.sdk.java.communication.ResponseException;
import com.worldline.connect.sdk.java.v1.ApiException;
import com.worldline.connect.sdk.java.v1.AuthorizationException;
import com.worldline.connect.sdk.java.v1.ExceptionFactory;
import com.worldline.connect.sdk.java.v1.IdempotenceException;
import com.worldline.connect.sdk.java.v1.PlatformException;
import com.worldline.connect.sdk.java.v1.ReferenceException;
import com.worldline.connect.sdk.java.v1.ValidationException;
import com.worldline.connect.sdk.java.v1.domain.DeviceFingerprintRequest;
import com.worldline.connect.sdk.java.v1.domain.DeviceFingerprintResponse;
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.PaymentProductGroupResponse;
import com.worldline.connect.sdk.java.v1.domain.PaymentProductGroups;

/**
 * Productgroups client. Thread-safe.
 */
public class ProductgroupsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public ProductgroupsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}/productgroups
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/productgroups/find.html">Get payment product groups</a>
     *
     * @param query FindProductgroupsParams
     * @return PaymentProductGroups
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public PaymentProductGroups find(FindProductgroupsParams query) {
        return find(query, null);
    }

    /**
     * Resource /{merchantId}/productgroups
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/productgroups/find.html">Get payment product groups</a>
     *
     * @param query FindProductgroupsParams
     * @param context CallContext
     * @return PaymentProductGroups
     * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public PaymentProductGroups find(FindProductgroupsParams query, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/productgroups", null);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    query,
                    PaymentProductGroups.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/productgroups/{paymentProductGroupId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/productgroups/get.html">Get payment product group</a>
     *
     * @param paymentProductGroupId String
     * @param query GetProductgroupParams
     * @return PaymentProductGroupResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public PaymentProductGroupResponse get(String paymentProductGroupId, GetProductgroupParams query) {
        return get(paymentProductGroupId, query, null);
    }

    /**
     * Resource /{merchantId}/productgroups/{paymentProductGroupId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/productgroups/get.html">Get payment product group</a>
     *
     * @param paymentProductGroupId String
     * @param query GetProductgroupParams
     * @param context CallContext
     * @return PaymentProductGroupResponse
     * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public PaymentProductGroupResponse get(String paymentProductGroupId, GetProductgroupParams query, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentProductGroupId", paymentProductGroupId);
        String uri = instantiateUri("/v1/{merchantId}/productgroups/{paymentProductGroupId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    query,
                    PaymentProductGroupResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/productgroups/{paymentProductGroupId}/deviceFingerprint
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/productgroups/deviceFingerprint.html">Get device fingerprint</a>
     *
     * @param paymentProductGroupId String
     * @param body DeviceFingerprintRequest
     * @return DeviceFingerprintResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public DeviceFingerprintResponse deviceFingerprint(String paymentProductGroupId, DeviceFingerprintRequest body) {
        return deviceFingerprint(paymentProductGroupId, body, null);
    }

    /**
     * Resource /{merchantId}/productgroups/{paymentProductGroupId}/deviceFingerprint
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/productgroups/deviceFingerprint.html">Get device fingerprint</a>
     *
     * @param paymentProductGroupId String
     * @param body DeviceFingerprintRequest
     * @param context CallContext
     * @return DeviceFingerprintResponse
     * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public DeviceFingerprintResponse deviceFingerprint(String paymentProductGroupId, DeviceFingerprintRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentProductGroupId", paymentProductGroupId);
        String uri = instantiateUri("/v1/{merchantId}/productgroups/{paymentProductGroupId}/deviceFingerprint", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    DeviceFingerprintResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
