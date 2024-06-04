/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1;

import java.util.Optional;

import com.worldline.connect.sdk.java.v1.domain.PayoutErrorResponse;
import com.worldline.connect.sdk.java.v1.domain.PayoutResult;

/**
 * Represents an error response from a payout call.
 */
@SuppressWarnings("serial")
public class DeclinedPayoutException extends DeclinedTransactionException {

    private final PayoutErrorResponse response;

    public DeclinedPayoutException(int statusCode, String responseBody, PayoutErrorResponse response) {
        super(buildMessage(response), statusCode, responseBody,
                response != null ? response.getErrorId() : null,
                response != null ? response.getErrors() : null);
        this.response = response;
    }

    private static String buildMessage(PayoutErrorResponse response) {
        return Optional.ofNullable(response)
                .map(PayoutErrorResponse::getPayoutResult)
                .map(payoutResult -> String.format("declined payout '%s' with status '%s'", payoutResult.getId(), payoutResult.getStatus()))
                .orElse("the Worldline Global Collect platform returned a declined payout response");
    }

    /**
     * @return The result of creating a payout if available, or {@code null} otherwise.
     */
    public PayoutResult getPayoutResult() {
        return response == null ? null : response.getPayoutResult();
    }
}
