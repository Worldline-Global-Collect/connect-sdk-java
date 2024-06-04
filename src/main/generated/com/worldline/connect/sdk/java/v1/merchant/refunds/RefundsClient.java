/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.refunds;

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
import com.worldline.connect.sdk.java.v1.domain.ApproveRefundRequest;
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.FindRefundsResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundResponse;

/**
 * Refunds client. Thread-safe.
 */
public class RefundsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public RefundsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}/refunds
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/find.html">Find refunds</a>
     *
     * @param query FindRefundsParams
     * @return FindRefundsResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public FindRefundsResponse find(FindRefundsParams query) {
        return find(query, null);
    }

    /**
     * Resource /{merchantId}/refunds
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/find.html">Find refunds</a>
     *
     * @param query FindRefundsParams
     * @param context CallContext
     * @return FindRefundsResponse
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
    public FindRefundsResponse find(FindRefundsParams query, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/refunds", null);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    query,
                    FindRefundsResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/refunds/{refundId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/get.html">Get refund</a>
     *
     * @param refundId String
     * @return RefundResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public RefundResponse get(String refundId) {
        return get(refundId, null);
    }

    /**
     * Resource /{merchantId}/refunds/{refundId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/get.html">Get refund</a>
     *
     * @param refundId String
     * @param context CallContext
     * @return RefundResponse
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
    public RefundResponse get(String refundId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("refundId", refundId);
        String uri = instantiateUri("/v1/{merchantId}/refunds/{refundId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    RefundResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/refunds/{refundId}/approve
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/approve.html">Approve refund</a>
     *
     * @param refundId String
     * @param body ApproveRefundRequest
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public void approve(String refundId, ApproveRefundRequest body) {
        approve(refundId, body, null);
    }

    /**
     * Resource /{merchantId}/refunds/{refundId}/approve
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/approve.html">Approve refund</a>
     *
     * @param refundId String
     * @param body ApproveRefundRequest
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
    public void approve(String refundId, ApproveRefundRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("refundId", refundId);
        String uri = instantiateUri("/v1/{merchantId}/refunds/{refundId}/approve", pathContext);
        try {
            communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    void.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/refunds/{refundId}/cancel
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/cancel.html">Cancel refund</a>
     *
     * @param refundId String
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public void cancel(String refundId) {
        cancel(refundId, null);
    }

    /**
     * Resource /{merchantId}/refunds/{refundId}/cancel
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/cancel.html">Cancel refund</a>
     *
     * @param refundId String
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
    public void cancel(String refundId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("refundId", refundId);
        String uri = instantiateUri("/v1/{merchantId}/refunds/{refundId}/cancel", pathContext);
        try {
            communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    null,
                    void.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/refunds/{refundId}/cancelapproval
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/cancelapproval.html">Undo approve refund</a>
     *
     * @param refundId String
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public void cancelapproval(String refundId) {
        cancelapproval(refundId, null);
    }

    /**
     * Resource /{merchantId}/refunds/{refundId}/cancelapproval
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/refunds/cancelapproval.html">Undo approve refund</a>
     *
     * @param refundId String
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
    public void cancelapproval(String refundId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("refundId", refundId);
        String uri = instantiateUri("/v1/{merchantId}/refunds/{refundId}/cancelapproval", pathContext);
        try {
            communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
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
