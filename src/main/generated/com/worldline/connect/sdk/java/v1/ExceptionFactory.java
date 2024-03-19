/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1;

import java.util.Collections;
import java.util.List;

import com.worldline.connect.sdk.java.CallContext;
import com.worldline.connect.sdk.java.v1.domain.APIError;
import com.worldline.connect.sdk.java.v1.domain.ErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.PaymentErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.PayoutErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.RefundErrorResponse;

/**
 * Factory for exceptions thrown by Worldline Global Collect platform API v1 resources.
 */
public class ExceptionFactory {

    public RuntimeException createException(int statusCode, String responseBody, Object errorObject, CallContext context) {
        if (errorObject instanceof PaymentErrorResponse) {
            PaymentErrorResponse paymentErrorResponse = (PaymentErrorResponse) errorObject;
            if (paymentErrorResponse.getPaymentResult() != null) {
                return new DeclinedPaymentException(statusCode, responseBody, paymentErrorResponse);
            }
            return createException(statusCode, responseBody, paymentErrorResponse.getErrorId(), paymentErrorResponse.getErrors(), context);
        }
        if (errorObject instanceof PayoutErrorResponse) {
            PayoutErrorResponse payoutErrorResponse = (PayoutErrorResponse) errorObject;
            if (payoutErrorResponse.getPayoutResult() != null) {
                return new DeclinedPayoutException(statusCode, responseBody, payoutErrorResponse);
            }
            return createException(statusCode, responseBody, payoutErrorResponse.getErrorId(), payoutErrorResponse.getErrors(), context);
        }
        if (errorObject instanceof RefundErrorResponse) {
            RefundErrorResponse refundErrorResponse = (RefundErrorResponse) errorObject;
            if (refundErrorResponse.getRefundResult() != null) {
                return new DeclinedRefundException(statusCode, responseBody, refundErrorResponse);
            }
            return createException(statusCode, responseBody, refundErrorResponse.getErrorId(), refundErrorResponse.getErrors(), context);
        }
        if (errorObject instanceof ErrorResponse) {
            ErrorResponse errorResponse = (ErrorResponse) errorObject;
            return createException(statusCode, responseBody, errorResponse.getErrorId(), errorResponse.getErrors(), context);
        }
        if (errorObject == null) {
            return createException(statusCode, responseBody, null, Collections.<APIError>emptyList(), context);
        }
        throw new IllegalArgumentException("unsupported error object type: " + errorObject.getClass().getName());
    }

    private RuntimeException createException(int statusCode, String responseBody, String errorId, List<APIError> errors, CallContext context) {
        switch (statusCode) {
        case 400:
            return new ValidationException(statusCode, responseBody, errorId, errors);
        case 403:
            return new AuthorizationException(statusCode, responseBody, errorId, errors);
        case 404:
            return new ReferenceException(statusCode, responseBody, errorId, errors);
        case 409:
            if (isIdempotenceError(errors, context)) {
                String idempotenceKey = context.getIdempotenceKey();
                Long idempotenceRequestTimestamp = context.getIdempotenceRequestTimestamp();
                return new IdempotenceException(idempotenceKey, idempotenceRequestTimestamp, statusCode, responseBody, errorId, errors);
            }
            return new ReferenceException(statusCode, responseBody, errorId, errors);
        case 410:
            return new ReferenceException(statusCode, responseBody, errorId, errors);
        case 500:
            return new PlatformException(statusCode, responseBody, errorId, errors);
        case 502:
            return new PlatformException(statusCode, responseBody, errorId, errors);
        case 503:
            return new PlatformException(statusCode, responseBody, errorId, errors);
        default:
            return new ApiException(statusCode, responseBody, errorId, errors);
        }
    }

    private static boolean isIdempotenceError(List<APIError> errors, CallContext context) {
        return context != null
                && context.getIdempotenceKey() != null
                && errors.size() == 1
                && "1409".equals(errors.get(0).getCode());
    }
}
