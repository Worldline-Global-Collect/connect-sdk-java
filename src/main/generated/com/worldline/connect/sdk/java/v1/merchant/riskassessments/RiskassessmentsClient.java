/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.merchant.riskassessments;

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
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.RiskAssessmentBankAccount;
import com.worldline.connect.sdk.java.v1.domain.RiskAssessmentCard;
import com.worldline.connect.sdk.java.v1.domain.RiskAssessmentResponse;

/**
 * Riskassessments client. Thread-safe.
 */
public class RiskassessmentsClient extends ApiResource {

    private static final ExceptionFactory EXCEPTION_FACTORY = new ExceptionFactory();

    public RiskassessmentsClient(ApiResource parent, Map<String, String> pathContext) {
        super(parent, pathContext);
    }

    /**
     * Resource /{merchantId}/riskassessments/bankaccounts
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/riskassessments/bankaccounts.html">Risk-assess bankaccount</a>
     *
     * @param body RiskAssessmentBankAccount
     * @return RiskAssessmentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public RiskAssessmentResponse bankaccounts(RiskAssessmentBankAccount body) {
        return bankaccounts(body, null);
    }

    /**
     * Resource /{merchantId}/riskassessments/bankaccounts
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/riskassessments/bankaccounts.html">Risk-assess bankaccount</a>
     *
     * @param body RiskAssessmentBankAccount
     * @param context CallContext
     * @return RiskAssessmentResponse
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
    public RiskAssessmentResponse bankaccounts(RiskAssessmentBankAccount body, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/riskassessments/bankaccounts", null);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    RiskAssessmentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }

    /**
     * Resource /{merchantId}/riskassessments/cards
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/riskassessments/cards.html">Risk-assess card</a>
     *
     * @param body RiskAssessmentCard
     * @return RiskAssessmentResponse
     * @throws ValidationException if the request was not correct and couldn't be processed (HTTP status code 400)
     * @throws AuthorizationException if the request was not allowed (HTTP status code 403)
     * @throws ReferenceException if an object was attempted to be referenced that doesn't exist or has been removed,
     *            or there was a conflict (HTTP status code 404, 409 or 410)
     * @throws PlatformException if something went wrong at the Worldline Global Collect platform,
     *            the Worldline Global Collect platform was unable to process a message from a downstream partner/acquirer,
     *            or the service that you're trying to reach is temporary unavailable (HTTP status code 500, 502 or 503)
     * @throws ApiException if the Worldline Global Collect platform returned any other error
     */
    public RiskAssessmentResponse cards(RiskAssessmentCard body) {
        return cards(body, null);
    }

    /**
     * Resource /{merchantId}/riskassessments/cards
     * - <a href="https://apireference.connect.worldline-solutions.com/s2sapi/v1/en_US/java/riskassessments/cards.html">Risk-assess card</a>
     *
     * @param body RiskAssessmentCard
     * @param context CallContext
     * @return RiskAssessmentResponse
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
    public RiskAssessmentResponse cards(RiskAssessmentCard body, CallContext context) {
        String uri = instantiateUri("/v1/{merchantId}/riskassessments/cards", null);
        try {
            return communicator.post(
                    uri,
                    getClientHeaders(),
                    null,
                    body,
                    RiskAssessmentResponse.class,
                    context);
        } catch (ResponseException e) {
            final Class<?> errorType = ErrorResponse.class;
            final Object errorObject = communicator.getMarshaller().unmarshal(e.getBody(), errorType);
            throw EXCEPTION_FACTORY.createException(e.getStatusCode(), e.getBody(), errorObject, context);
        }
    }
}
