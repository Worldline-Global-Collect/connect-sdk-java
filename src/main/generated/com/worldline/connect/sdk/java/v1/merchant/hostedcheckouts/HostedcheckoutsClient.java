/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.hostedcheckouts;

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
import com.worldline.connect.sdk.java.v1.domain.CreateHostedCheckoutRequest;
import com.worldline.connect.sdk.java.v1.domain.CreateHostedCheckoutResponse;
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.GetHostedCheckoutResponse;

/**
 * Hostedcheckouts client. Thread-safe.
 */
public class HostedcheckoutsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public HostedcheckoutsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}/hostedcheckouts
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedcheckouts/create.html">Create hosted checkout</a>
     *
     * @param body CreateHostedCheckoutRequest
     * @return CreateHostedCheckoutResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CreateHostedCheckoutResponse create(CreateHostedCheckoutRequest body) {
        return create(body, null);
    }

    /**
     * Resource /{merchantId}/hostedcheckouts
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedcheckouts/create.html">Create hosted checkout</a>
     *
     * @param body CreateHostedCheckoutRequest
     * @param context CallContext
     * @return CreateHostedCheckoutResponse
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
    public CreateHostedCheckoutResponse create(CreateHostedCheckoutRequest body, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/hostedcheckouts", null);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    CreateHostedCheckoutResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/hostedcheckouts/{hostedCheckoutId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedcheckouts/get.html">Get hosted checkout status</a>
     *
     * @param hostedCheckoutId String
     * @return GetHostedCheckoutResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public GetHostedCheckoutResponse get(String hostedCheckoutId) {
        return get(hostedCheckoutId, null);
    }

    /**
     * Resource /{merchantId}/hostedcheckouts/{hostedCheckoutId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedcheckouts/get.html">Get hosted checkout status</a>
     *
     * @param hostedCheckoutId String
     * @param context CallContext
     * @return GetHostedCheckoutResponse
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
    public GetHostedCheckoutResponse get(String hostedCheckoutId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("hostedCheckoutId", hostedCheckoutId);
        String uri = instantiateUri("/v1/{merchantId}/hostedcheckouts/{hostedCheckoutId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    GetHostedCheckoutResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/hostedcheckouts/{hostedCheckoutId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedcheckouts/delete.html">Delete hosted checkout</a>
     *
     * @param hostedCheckoutId String
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public void delete(String hostedCheckoutId) {
        delete(hostedCheckoutId, null);
    }

    /**
     * Resource /{merchantId}/hostedcheckouts/{hostedCheckoutId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedcheckouts/delete.html">Delete hosted checkout</a>
     *
     * @param hostedCheckoutId String
     * @param context CallContext
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
    public void delete(String hostedCheckoutId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("hostedCheckoutId", hostedCheckoutId);
        String uri = instantiateUri("/v1/{merchantId}/hostedcheckouts/{hostedCheckoutId}", pathContext);
        try {
            communicator.delete(
                    uri,
                    getClientHeaders(),
                    null,
                    void.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
