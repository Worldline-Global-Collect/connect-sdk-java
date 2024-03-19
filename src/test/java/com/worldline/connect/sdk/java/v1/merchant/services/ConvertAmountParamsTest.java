package com.worldline.connect.sdk.java.v1.merchant.services;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.communication.RequestParam;
import com.worldline.connect.sdk.java.util.RequestParamMatcher;

class ConvertAmountParamsTest {

    @Test
    void testToRequestParameters() {
        ConvertAmountParams params = new ConvertAmountParams();
        List<Matcher<? super RequestParam>> matchers = new ArrayList<>();

        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setAmount(1000L);
        matchers.add(new RequestParamMatcher("amount", "1000"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setSource("EUR");
        matchers.add(new RequestParamMatcher("source", "EUR"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setTarget("USD");
        matchers.add(new RequestParamMatcher("target", "USD"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setAmount(null);
        matchers.remove(0);
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));
    }
}
