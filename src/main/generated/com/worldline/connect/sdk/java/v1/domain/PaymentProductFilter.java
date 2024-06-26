/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class PaymentProductFilter {

    private List<String> groups;

    private List<Integer> products;

    /**
     * List containing all payment product groups that should either be restricted to in or excluded from the payment context. Currently, there is only one group, called 'cards'.
     */
    public List<String> getGroups() {
        return groups;
    }

    /**
     * List containing all payment product groups that should either be restricted to in or excluded from the payment context. Currently, there is only one group, called 'cards'.
     */
    public void setGroups(List<String> value) {
        this.groups = value;
    }

    /**
     * List containing all payment product ids that should either be restricted to in or excluded from the payment context.
     */
    public List<Integer> getProducts() {
        return products;
    }

    /**
     * List containing all payment product ids that should either be restricted to in or excluded from the payment context.
     */
    public void setProducts(List<Integer> value) {
        this.products = value;
    }
}
