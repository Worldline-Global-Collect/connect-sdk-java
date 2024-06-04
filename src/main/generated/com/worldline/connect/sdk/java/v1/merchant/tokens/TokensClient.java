/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.tokens;

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
import com.worldline.connect.sdk.java.v1.domain.ApproveTokenRequest;
import com.worldline.connect.sdk.java.v1.domain.CreateTokenRequest;
import com.worldline.connect.sdk.java.v1.domain.CreateTokenResponse;
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.TokenResponse;
import com.worldline.connect.sdk.java.v1.domain.UpdateTokenRequest;

/**
 * Tokens client. Thread-safe.
 */
public class TokensClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public TokensClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}/tokens
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/create.html">Create token</a>
     *
     * @param body CreateTokenRequest
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
    public CreateTokenResponse create(CreateTokenRequest body) {
        return create(body, null);
    }

    /**
     * Resource /{merchantId}/tokens
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/create.html">Create token</a>
     *
     * @param body CreateTokenRequest
     * @param context CallContext
     * @return CreateTokenResponse
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
    public CreateTokenResponse create(CreateTokenRequest body, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/tokens", null);
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
     * Resource /{merchantId}/tokens/{tokenId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/get.html">Get token</a>
     *
     * @param tokenId String
     * @return TokenResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public TokenResponse get(String tokenId) {
        return get(tokenId, null);
    }

    /**
     * Resource /{merchantId}/tokens/{tokenId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/get.html">Get token</a>
     *
     * @param tokenId String
     * @param context CallContext
     * @return TokenResponse
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
    public TokenResponse get(String tokenId, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("tokenId", tokenId);
        String uri = instantiateUri("/v1/{merchantId}/tokens/{tokenId}", pathContext);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    TokenResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/tokens/{tokenId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/update.html">Update token</a>
     *
     * @param tokenId String
     * @param body UpdateTokenRequest
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public void update(String tokenId, UpdateTokenRequest body) {
        update(tokenId, body, null);
    }

    /**
     * Resource /{merchantId}/tokens/{tokenId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/update.html">Update token</a>
     *
     * @param tokenId String
     * @param body UpdateTokenRequest
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
    public void update(String tokenId, UpdateTokenRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("tokenId", tokenId);
        String uri = instantiateUri("/v1/{merchantId}/tokens/{tokenId}", pathContext);
        try {
            communicator.put(
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
     * Resource /{merchantId}/tokens/{tokenId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/delete.html">Delete token</a>
     *
     * @param tokenId String
     * @param query DeleteTokenParams
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public void delete(String tokenId, DeleteTokenParams query) {
        delete(tokenId, query, null);
    }

    /**
     * Resource /{merchantId}/tokens/{tokenId}
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/delete.html">Delete token</a>
     *
     * @param tokenId String
     * @param query DeleteTokenParams
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
    public void delete(String tokenId, DeleteTokenParams query, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("tokenId", tokenId);
        String uri = instantiateUri("/v1/{merchantId}/tokens/{tokenId}", pathContext);
        try {
            communicator.delete(
                    uri,
                    getClientHeaders(),
                    query,
                    void.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/tokens/{tokenId}/approvesepadirectdebit
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/approvesepadirectdebit.html">Approve SEPA DD mandate</a>
     *
     * @param tokenId String
     * @param body ApproveTokenRequest
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public void approvesepadirectdebit(String tokenId, ApproveTokenRequest body) {
        approvesepadirectdebit(tokenId, body, null);
    }

    /**
     * Resource /{merchantId}/tokens/{tokenId}/approvesepadirectdebit
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/tokens/approvesepadirectdebit.html">Approve SEPA DD mandate</a>
     *
     * @param tokenId String
     * @param body ApproveTokenRequest
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
    public void approvesepadirectdebit(String tokenId, ApproveTokenRequest body, CallContext context) {
        Map<String, String> pathContext = new TreeMap<>();
        pathContext.put("tokenId", tokenId);
        String uri = instantiateUri("/v1/{merchantId}/tokens/{tokenId}/approvesepadirectdebit", pathContext);
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
}
