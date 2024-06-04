/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

/**
 * Input for the retrieval of a customer's details.
 */
public class GetCustomerDetailsRequest {

    private String countryCode;

    private List<KeyValuePair> values;

    /**
     * The code of the country where the customer should reside.
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * The code of the country where the customer should reside.
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * A list of keys with a value used to retrieve the details of a customer. Depending on the country code, different keys are required. These can be determined with a getPaymentProduct call and using payment product properties with the property usedForLookup set to true.
     */
    public List<KeyValuePair> getValues() {
        return values;
    }

    /**
     * A list of keys with a value used to retrieve the details of a customer. Depending on the country code, different keys are required. These can be determined with a getPaymentProduct call and using payment product properties with the property usedForLookup set to true.
     */
    public void setValues(List<KeyValuePair> value) {
        this.values = value;
    }
}
