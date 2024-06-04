/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.services;

import java.util.Map;

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
import com.worldline.connect.sdk.java.v1.domain.BankDetailsRequest;
import com.worldline.connect.sdk.java.v1.domain.BankDetailsResponse;
import com.worldline.connect.sdk.java.v1.domain.ConvertAmount;
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.GetIINDetailsRequest;
import com.worldline.connect.sdk.java.v1.domain.GetIINDetailsResponse;
import com.worldline.connect.sdk.java.v1.domain.GetPrivacyPolicyResponse;
import com.worldline.connect.sdk.java.v1.domain.TestConnection;

/**
 * Services client. Thread-safe.
 */
public class ServicesClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public ServicesClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}/services/convert/amount
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/convertAmount.html">Convert amount</a>
     *
     * @param query ConvertAmountParams
     * @return ConvertAmount
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public ConvertAmount convertAmount(ConvertAmountParams query) {
        return convertAmount(query, null);
    }

    /**
     * Resource /{merchantId}/services/convert/amount
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/convertAmount.html">Convert amount</a>
     *
     * @param query ConvertAmountParams
     * @param context CallContext
     * @return ConvertAmount
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
    public ConvertAmount convertAmount(ConvertAmountParams query, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/services/convert/amount", null);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    query,
                    ConvertAmount.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/services/convert/bankaccount
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/bankaccount.html">Convert bankaccount</a>
     *
     * @param body BankDetailsRequest
     * @return BankDetailsResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public BankDetailsResponse bankaccount(BankDetailsRequest body) {
        return bankaccount(body, null);
    }

    /**
     * Resource /{merchantId}/services/convert/bankaccount
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/bankaccount.html">Convert bankaccount</a>
     *
     * @param body BankDetailsRequest
     * @param context CallContext
     * @return BankDetailsResponse
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
    public BankDetailsResponse bankaccount(BankDetailsRequest body, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/services/convert/bankaccount", null);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    BankDetailsResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/services/getIINdetails
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/getIINdetails.html">Get IIN details</a>
     *
     * @param body GetIINDetailsRequest
     * @return GetIINDetailsResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public GetIINDetailsResponse getIINdetails(GetIINDetailsRequest body) {
        return getIINdetails(body, null);
    }

    /**
     * Resource /{merchantId}/services/getIINdetails
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/getIINdetails.html">Get IIN details</a>
     *
     * @param body GetIINDetailsRequest
     * @param context CallContext
     * @return GetIINDetailsResponse
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
    public GetIINDetailsResponse getIINdetails(GetIINDetailsRequest body, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/services/getIINdetails", null);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    GetIINDetailsResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/services/privacypolicy
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/privacypolicy.html">Get privacy policy</a>
     *
     * @param query PrivacypolicyParams
     * @return GetPrivacyPolicyResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public GetPrivacyPolicyResponse privacypolicy(PrivacypolicyParams query) {
        return privacypolicy(query, null);
    }

    /**
     * Resource /{merchantId}/services/privacypolicy
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/privacypolicy.html">Get privacy policy</a>
     *
     * @param query PrivacypolicyParams
     * @param context CallContext
     * @return GetPrivacyPolicyResponse
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
    public GetPrivacyPolicyResponse privacypolicy(PrivacypolicyParams query, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/services/privacypolicy", null);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    query,
                    GetPrivacyPolicyResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/services/testconnection
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/testconnection.html">Test connection</a>
     *
     * @return TestConnection
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public TestConnection testconnection() {
        return testconnection(null);
    }

    /**
     * Resource /{merchantId}/services/testconnection
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/services/testconnection.html">Test connection</a>
     *
     * @param context CallContext
     * @return TestConnection
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
    public TestConnection testconnection(CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/services/testconnection", null);
        try {
            return communicator.get(
                    uri,
                    getClientHeaders(),
                    null,
                    TestConnection.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
