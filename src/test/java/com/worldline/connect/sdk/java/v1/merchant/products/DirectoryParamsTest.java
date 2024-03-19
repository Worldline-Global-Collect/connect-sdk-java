package com.worldline.connect.sdk.java.v1.merchant.products;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.communication.RequestParam;
import com.worldline.connect.sdk.java.util.RequestParamMatcher;

class DirectoryParamsTest {

    @Test
    void testToRequestParameters() {
        DirectoryParams params = new DirectoryParams();
        List<Matcher<? super RequestParam>> matchers = new ArrayList<>();

        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setCountryCode("NL");
        matchers.add(new RequestParamMatcher("countryCode", "NL"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setCurrencyCode("EUR");
        matchers.add(new RequestParamMatcher("currencyCode", "EUR"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setCountryCode(null);
        matchers.remove(0);
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));
    }
}
