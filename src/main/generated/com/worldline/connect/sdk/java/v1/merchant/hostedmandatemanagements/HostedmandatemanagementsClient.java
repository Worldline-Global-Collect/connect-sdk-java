/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.hostedmandatemanagements;

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
import com.worldline.connect.sdk.java.v1.domain.CreateHostedMandateManagementRequest;
import com.worldline.connect.sdk.java.v1.domain.CreateHostedMandateManagementResponse;
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.GetHostedMandateManagementResponse;

/**
 * Hostedmandatemanagements client. Thread-safe.
 */
public class HostedmandatemanagementsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public HostedmandatemanagementsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}/hostedmandatemanagements
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedmandatemanagements/create.html">Create hosted mandate management</a>
     *
     * @param body CreateHostedMandateManagementRequest
     * @return CreateHostedMandateManagementResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CreateHostedMandateManagementResponse create(CreateHostedMandateManagementRequest body) {
        return create(body, null);
    }

    /**
     * Resource /{merchantId}/hostedmandatemanagements
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedmandatemanagements/create.html">Create hosted mandate management</a>
     *
     * @param body CreateHostedMandateManagementRequest
     * @param context CallContext
     * @return CreateHostedMandateManagementResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CreateHostedMandateManagementResponse create(CreateHostedMandateManagementRequest body, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/hostedmandatemanagements", null);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    CreateHostedMandateManagementResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/hostedmandatemanagements/{hostedMandateManagementId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedmandatemanagements/get.html">Get hosted mandate management status</a>
     *
     * @param hostedMandateManagementId String
     * @return GetHostedMandateManagementResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public GetHostedMandateManagementResponse get(String hostedMandateManagementId) {
        return get(hostedMandateManagementId, null);
    }

    /**
     * Resource /{merchantId}/hostedmandatemanagements/{hostedMandateManagementId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/hostedmandatemanagements/get.html">Get hosted mandate management status</a>
     *
     * @param hostedMandateManagementId String
     * @param context CallContext
     * @return GetHostedMandateManagementResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws IdempotenceException if an idempotent request caused a conflict (HTTP status code 409)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public GetHostedMandateManagementResponse get(String hostedMandateManagementId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("hostedMandateManagementId", hostedMandateManagementId);
        String uri = instantiateUri("/v1/{merchantId}/hostedmandatemanagements/{hostedMandateManagementId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    GetHostedMandateManagementResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
