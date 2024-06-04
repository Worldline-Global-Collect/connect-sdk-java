/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class FindPaymentsResponse {

    private Integer limit;

    private Integer offset;

    private List<Payment> payments;

    private Integer totalCount;

    /**
     * The limit you used in the request.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * The limit you used in the request.
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * The offset you used in the request.
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * The offset you used in the request.
     */
    public void setOffset(Integer value) {
        this.offset = value;
    }

    /**
     * A list of payments that matched your filter, starting at the given offset and limited to the given limit.
     */
    public List<Payment> getPayments() {
        return payments;
    }

    /**
     * A list of payments that matched your filter, starting at the given offset and limited to the given limit.
     */
    public void setPayments(List<Payment> value) {
        this.payments = value;
    }

    /**
     * The total number of payments that matched your filter.
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * The total number of payments that matched your filter.
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }
}
