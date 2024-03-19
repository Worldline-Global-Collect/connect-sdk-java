/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

public class AdditionalOrderInputAirlineData {

    private AirlineData airlineData = null;

    private LodgingData lodgingData = null;

    /**
     * Object that holds airline specific data
     */
    public AirlineData getAirlineData() {
        return airlineData;
    }

    /**
     * Object that holds airline specific data
     */
    public void setAirlineData(AirlineData value) {
        this.airlineData = value;
    }

    /**
     * Object that holds lodging specific data
     */
    public LodgingData getLodgingData() {
        return lodgingData;
    }

    /**
     * Object that holds lodging specific data
     */
    public void setLodgingData(LodgingData value) {
        this.lodgingData = value;
    }
}
