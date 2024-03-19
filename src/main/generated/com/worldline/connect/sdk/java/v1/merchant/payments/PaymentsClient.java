/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.payments;

import java.util.Map;
import java.util.TreeMap;

import com.worldline.connect.sdk.java.ApiResource;
import com.worldline.connect.sdk.java.CallContext;
import com.worldline.connect.sdk.java.communication.ResponseException;
import com.worldline.connect.sdk.java.v1.ApiException;
import com.worldline.connect.sdk.java.v1.AuthorizationException;
import com.worldline.connect.sdk.java.v1.DeclinedPaymentException;
import com.worldline.connect.sdk.java.v1.DeclinedRefundException;
import com.worldline.connect.sdk.java.v1.ExceptionFactory;
import com.worldline.connect.sdk.java.v1.IdempotenceException;
import com.worldline.connect.sdk.java.v1.PlatformException;
import com.worldline.connect.sdk.java.v1.ReferenceException;
import com.worldline.connect.sdk.java.v1.ValidationException;
import com.worldline.connect.sdk.java.v1.domain.ApprovePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CancelApprovalPaymentResponse;
import com.worldline.connect.sdk.java.v1.domain.CancelPaymentResponse;
import com.worldline.connect.sdk.java.v1.domain.CapturePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CaptureResponse;
import com.worldline.connect.sdk.java.v1.domain.CapturesResponse;
import com.worldline.connect.sdk.java.v1.domain.CompletePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CompletePaymentResponse;
import com.worldline.connect.sdk.java.v1.domain.CreateDisputeRequest;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentRequest;
import com.worldline.connect.sdk.java.v1.domain.CreatePaymentResponse;
import com.worldline.connect.sdk.java.v1.domain.CreateTokenResponse;
import com.worldline.connect.sdk.java.v1.domain.DeviceFingerprintDetails;
import com.worldline.connect.sdk.java.v1.domain.DisputeResponse;
import com.worldline.connect.sdk.java.v1.domain.DisputesResponse;
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.FindPaymentsResponse;
import com.worldline.connect.sdk.java.v1.domain.PaymentApprovalResponse;
import com.worldline.connect.sdk.java.v1.domain.PaymentErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.PaymentResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundRequest;
import com.worldline.connect.sdk.java.v1.domain.RefundResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundsResponse;
import com.worldline.connect.sdk.java.v1.domain.ThirdPartyStatusResponse;
import com.worldline.connect.sdk.java.v1.domain.TokenizePaymentRequest;

/**
 * Payments client. Thread-safe.
 */
public class PaymentsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public PaymentsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}/payments
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/create.html">Create payment</a>
     *
     * @param body CreatePaymentRequest
     * @return CreatePaymentResponse
     * @throws DeclinedPaymentException if the Worldline Global Collect platform declined / rejected the payment. The payment result will be available from the exception.
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CreatePaymentResponse create(CreatePaymentRequest body) {
        return create(body, null);
    }

    /**
     * Resource /{merchantId}/payments
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/create.html">Create payment</a>
     *
     * @param body CreatePaymentRequest
     * @param context CallContext
     * @return CreatePaymentResponse
     * @throws DeclinedPaymentException if the Worldline Global Collect platform declined / rejected the payment. The payment result will be available from the exception.
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
    public CreatePaymentResponse create(CreatePaymentRequest body, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/payments", null);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    CreatePaymentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = PaymentErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/find.html">Find payments</a>
     *
     * @param query FindPaymentsParams
     * @return FindPaymentsResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public FindPaymentsResponse find(FindPaymentsParams query) {
        return find(query, null);
    }

    /**
     * Resource /{merchantId}/payments
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/find.html">Find payments</a>
     *
     * @param query FindPaymentsParams
     * @param context CallContext
     * @return FindPaymentsResponse
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
    public FindPaymentsResponse find(FindPaymentsParams query, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/payments", null);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    query,
                    FindPaymentsResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/get.html">Get payment</a>
     *
     * @param paymentId String
     * @return PaymentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public PaymentResponse get(String paymentId) {
        return get(paymentId, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/get.html">Get payment</a>
     *
     * @param paymentId String
     * @param context CallContext
     * @return PaymentResponse
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
    public PaymentResponse get(String paymentId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    PaymentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/complete
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/complete.html">Complete payment</a>
     *
     * @param paymentId String
     * @param body CompletePaymentRequest
     * @return CompletePaymentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CompletePaymentResponse complete(String paymentId, CompletePaymentRequest body) {
        return complete(paymentId, body, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/complete
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/complete.html">Complete payment</a>
     *
     * @param paymentId String
     * @param body CompletePaymentRequest
     * @param context CallContext
     * @return CompletePaymentResponse
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
    public CompletePaymentResponse complete(String paymentId, CompletePaymentRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/complete", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    CompletePaymentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/thirdpartystatus
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/thirdPartyStatus.html">Third party status poll</a>
     *
     * @param paymentId String
     * @return ThirdPartyStatusResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public ThirdPartyStatusResponse thirdPartyStatus(String paymentId) {
        return thirdPartyStatus(paymentId, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/thirdpartystatus
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/thirdPartyStatus.html">Third party status poll</a>
     *
     * @param paymentId String
     * @param context CallContext
     * @return ThirdPartyStatusResponse
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
    public ThirdPartyStatusResponse thirdPartyStatus(String paymentId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/thirdpartystatus", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    ThirdPartyStatusResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/tokenize
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/tokenize.html">Create a token from payment</a>
     *
     * @param paymentId String
     * @param body TokenizePaymentRequest
     * @return CreateTokenResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CreateTokenResponse tokenize(String paymentId, TokenizePaymentRequest body) {
        return tokenize(paymentId, body, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/tokenize
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/tokenize.html">Create a token from payment</a>
     *
     * @param paymentId String
     * @param body TokenizePaymentRequest
     * @param context CallContext
     * @return CreateTokenResponse
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
    public CreateTokenResponse tokenize(String paymentId, TokenizePaymentRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/tokenize", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    CreateTokenResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/processchallenged
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/processchallenged.html">Approves challenged payment</a>
     *
     * @param paymentId String
     * @return PaymentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public PaymentResponse processchallenged(String paymentId) {
        return processchallenged(paymentId, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/processchallenged
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/processchallenged.html">Approves challenged payment</a>
     *
     * @param paymentId String
     * @param context CallContext
     * @return PaymentResponse
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
    public PaymentResponse processchallenged(String paymentId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/processchallenged", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    null,
                    PaymentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/approve
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/approve.html">Approve payment</a>
     *
     * @param paymentId String
     * @param body ApprovePaymentRequest
     * @return PaymentApprovalResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public PaymentApprovalResponse approve(String paymentId, ApprovePaymentRequest body) {
        return approve(paymentId, body, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/approve
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/approve.html">Approve payment</a>
     *
     * @param paymentId String
     * @param body ApprovePaymentRequest
     * @param context CallContext
     * @return PaymentApprovalResponse
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
    public PaymentApprovalResponse approve(String paymentId, ApprovePaymentRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/approve", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    PaymentApprovalResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/capture
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/capture.html">Capture payment</a>
     *
     * @param paymentId String
     * @param body CapturePaymentRequest
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
    public CaptureResponse capture(String paymentId, CapturePaymentRequest body) {
        return capture(paymentId, body, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/capture
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/capture.html">Capture payment</a>
     *
     * @param paymentId String
     * @param body CapturePaymentRequest
     * @param context CallContext
     * @return CaptureResponse
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
    public CaptureResponse capture(String paymentId, CapturePaymentRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/capture", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    CaptureResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/cancelapproval
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/cancelapproval.html">Undo capture payment</a>
     *
     * @param paymentId String
     * @return CancelApprovalPaymentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CancelApprovalPaymentResponse cancelapproval(String paymentId) {
        return cancelapproval(paymentId, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/cancelapproval
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/cancelapproval.html">Undo capture payment</a>
     *
     * @param paymentId String
     * @param context CallContext
     * @return CancelApprovalPaymentResponse
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
    public CancelApprovalPaymentResponse cancelapproval(String paymentId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/cancelapproval", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    null,
                    CancelApprovalPaymentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/captures
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/captures.html">Get captures of payment</a>
     *
     * @param paymentId String
     * @return CapturesResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CapturesResponse captures(String paymentId) {
        return captures(paymentId, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/captures
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/captures.html">Get captures of payment</a>
     *
     * @param paymentId String
     * @param context CallContext
     * @return CapturesResponse
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
    public CapturesResponse captures(String paymentId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/captures", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    CapturesResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/refund
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/refund.html">Create refund</a>
     *
     * @param paymentId String
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
    public RefundResponse refund(String paymentId, RefundRequest body) {
        return refund(paymentId, body, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/refund
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/refund.html">Create refund</a>
     *
     * @param paymentId String
     * @param body RefundRequest
     * @param context CallContext
     * @return RefundResponse
     * @throws DeclinedRefundException if the Worldline Global Collect platform declined / rejected the refund. The refund result will be available from the exception.
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
    public RefundResponse refund(String paymentId, RefundRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/refund", pathContext);
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
     * Resource /{merchantId}/payments/{paymentId}/refunds
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/refunds.html">Get refunds of payment</a>
     *
     * @param paymentId String
     * @return RefundsResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public RefundsResponse refunds(String paymentId) {
        return refunds(paymentId, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/refunds
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/refunds.html">Get refunds of payment</a>
     *
     * @param paymentId String
     * @param context CallContext
     * @return RefundsResponse
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
    public RefundsResponse refunds(String paymentId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/refunds", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    RefundsResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/cancel
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/cancel.html">Cancel payment</a>
     *
     * @param paymentId String
     * @return CancelPaymentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public CancelPaymentResponse cancel(String paymentId) {
        return cancel(paymentId, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/cancel
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/cancel.html">Cancel payment</a>
     *
     * @param paymentId String
     * @param context CallContext
     * @return CancelPaymentResponse
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
    public CancelPaymentResponse cancel(String paymentId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/cancel", pathContext);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    null,
                    CancelPaymentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/dispute
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/dispute.html">Create dispute</a>
     *
     * @param paymentId String
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
    public DisputeResponse dispute(String paymentId, CreateDisputeRequest body) {
        return dispute(paymentId, body, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/dispute
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/dispute.html">Create dispute</a>
     *
     * @param paymentId String
     * @param body CreateDisputeRequest
     * @param context CallContext
     * @return DisputeResponse
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
    public DisputeResponse dispute(String paymentId, CreateDisputeRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/dispute", pathContext);
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

    /**
     * Resource /{merchantId}/payments/{paymentId}/disputes
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/disputes.html">Get disputes</a>
     *
     * @param paymentId String
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
    public DisputesResponse disputes(String paymentId) {
        return disputes(paymentId, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/disputes
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/disputes.html">Get disputes</a>
     *
     * @param paymentId String
     * @param context CallContext
     * @return DisputesResponse
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
    public DisputesResponse disputes(String paymentId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/disputes", pathContext);
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
     * Resource /{merchantId}/payments/{paymentId}/devicefingerprint
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/devicefingerprint.html">Get Device Fingerprint details</a>
     *
     * @param paymentId String
     * @return DeviceFingerprintDetails
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public DeviceFingerprintDetails devicefingerprint(String paymentId) {
        return devicefingerprint(paymentId, null);
    }

    /**
     * Resource /{merchantId}/payments/{paymentId}/devicefingerprint
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/payments/devicefingerprint.html">Get Device Fingerprint details</a>
     *
     * @param paymentId String
     * @param context CallContext
     * @return DeviceFingerprintDetails
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
    public DeviceFingerprintDetails devicefingerprint(String paymentId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("paymentId", paymentId);
        String uri = instantiateUri("/v1/{merchantId}/payments/{paymentId}/devicefingerprint", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    DeviceFingerprintDetails.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
