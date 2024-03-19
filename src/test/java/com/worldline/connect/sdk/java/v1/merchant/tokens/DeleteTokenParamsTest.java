package com.worldline.connect.sdk.java.v1.merchant.tokens;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import com.worldline.connect.sdk.java.communication.RequestParam;
import com.worldline.connect.sdk.java.util.RequestParamMatcher;

class DeleteTokenParamsTest {

    @Test
    void testToRequestParameters() {
        DeleteTokenParams params = new DeleteTokenParams();
        List<Matcher<? super RequestParam>> matchers = new ArrayList<>();

        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setMandateCancelDate("20160610");
        matchers.add(new RequestParamMatcher("mandateCancelDate", "20160610"));
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));

        params.setMandateCancelDate(null);
        matchers.remove(0);
        assertThat(params.toRequestParameters(), containsInAnyOrder(matchers));
    }
}
