package com.worldline.connect.sdk.java.v1.merchant.productgroups;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.communication.RequestParam;
import com.worldline.connect.sdk.java.util.RequestParamMatcher;

class FindProductgroupsParamsTest {

    @Test
    void testToRequestParameters() {
        FindProductgroupsParams params = new FindProductgroupsParams();
        List<Matcher<? super RequestParam>> matchers = new ArrayList<>();

        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setAmount(1000L);
        matchers.add(new RequestParamMatcher("amount", "1000"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setCountryCode("NL");
        matchers.add(new RequestParamMatcher("countryCode", "NL"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setCurrencyCode("EUR");
        matchers.add(new RequestParamMatcher("currencyCode", "EUR"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setIsRecurring(true);
        matchers.add(new RequestParamMatcher("isRecurring", "true"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setLocale("nl_NL");
        matchers.add(new RequestParamMatcher("locale", "nl_NL"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.addHide("fields");
        matchers.add(new RequestParamMatcher("hide", "fields"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.addHide("accountsOnFile");
        matchers.add(new RequestParamMatcher("hide", "accountsOnFile"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setAmount(null);
        matchers.remove(0);
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));
    }
}
