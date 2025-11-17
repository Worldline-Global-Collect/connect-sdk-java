/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.captures;

import java.util.Map;
import java.util.TreeMap;

import com.worldline.connect.sdk.java.ApiResource;
import com.worldline.connect.sdk.java.CallContext;
import com.worldline.connect.sdk.java.communication.ResponseException;
import com.worldline.connect.sdk.java.v1.ApiException;
import com.worldline.connect.sdk.java.v1.AuthorizationException;
import com.worldline.connect.sdk.java.v1.DeclinedRefundException;
import com.worldline.connect.sdk.java.v1.ExceptionFactory;
import com.worldline.connect.sdk.java.v1.IdempotenceException;
import com.worldline.connect.sdk.java.v1.PlatformException;
import com.worldline.connect.sdk.java.v1.ReferenceException;
import com.worldline.connect.sdk.java.v1.ValidationException;
import com.worldline.connect.sdk.java.v1.domain.CaptureResponse;
import com.worldline.connect.sdk.java.v1.domain.CreateDisputeRequest;
import com.worldline.connect.sdk.java.v1.domain.DisputeResponse;
import com.worldline.connect.sdk.java.v1.domain.DisputesResponse;
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundRequest;
import com.worldline.connect.sdk.java.v1.domain.RefundResponse;

/**
 * Captures client. Thread-safe.
 */
public class CapturesClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public CapturesClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}/captures/{captureId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/captures/get.html">Get capture</a>
     *
     * @param captureId String
     * @return CaptureResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CaptureResponse get(String captureId) {
        return get(captureId, null);
    }

    /**
     * Resource /{merchantId}/captures/{captureId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/captures/get.html">Get capture</a>
     *
     * @param captureId String
     * @param context CallContext
     * @return CaptureResponse
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
    public CaptureResponse get(String captureId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("captureId", captureId);
        String uri = instantiateUri("/v1/{merchantId}/captures/{captureId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    CaptureResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/captures/{captureId}/refund
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/captures/refund.html">Create Refund</a>
     *
     * @param captureId String
     * @param body RefundRequest
     * @return RefundResponse
     * @throws DeclinedRefundException if the Worldline Global Collect platform declined / rejected the refund. The refund result will be available from the exception.
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public RefundResponse refund(String captureId, RefundRequest body) {
        return refund(captureId, body, null);
    }

    /**
     * Resource /{merchantId}/captures/{captureId}/refund
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/captures/refund.html">Create Refund</a>
     *
     * @param captureId String
     * @param body RefundRequest
     * @param context CallContext
     * @return RefundResponse
     * @throws DeclinedRefundException if the Worldline Global Collect platform declined / rejected the refund. The refund result will be available from the exception.
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
    public RefundResponse refund(String captureId, RefundRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("captureId", captureId);
        String uri = instantiateUri("/v1/{merchantId}/captures/{captureId}/refund", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    RefundResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = RefundErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/captures/{captureId}/disputes
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/captures/disputes.html">Get disputes</a>
     *
     * @param captureId String
     * @return DisputesResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public DisputesResponse disputes(String captureId) {
        return disputes(captureId, null);
    }

    /**
     * Resource /{merchantId}/captures/{captureId}/disputes
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/captures/disputes.html">Get disputes</a>
     *
     * @param captureId String
     * @param context CallContext
     * @return DisputesResponse
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
    public DisputesResponse disputes(String captureId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("captureId", captureId);
        String uri = instantiateUri("/v1/{merchantId}/captures/{captureId}/disputes", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    DisputesResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/captures/{captureId}/dispute
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/captures/dispute.html">Create dispute</a>
     *
     * @param captureId String
     * @param body CreateDisputeRequest
     * @return DisputeResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public DisputeResponse dispute(String captureId, CreateDisputeRequest body) {
        return dispute(captureId, body, null);
    }

    /**
     * Resource /{merchantId}/captures/{captureId}/dispute
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/captures/dispute.html">Create dispute</a>
     *
     * @param captureId String
     * @param body CreateDisputeRequest
     * @param context CallContext
     * @return DisputeResponse
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
    public DisputeResponse dispute(String captureId, CreateDisputeRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("captureId", captureId);
        String uri = instantiateUri("/v1/{merchantId}/captures/{captureId}/dispute", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    DisputeResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
