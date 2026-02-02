/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * The object containing the frequency and interval between recurring payments.
 */
public class Frequency {

    private String interval;

    private Integer intervalFrequency;

    /**
     * <p>The interval between recurring payments specified as days, weeks, quarters, or years.</p> 
     *  <p>Allowed values:</p> <ul><li>days</li><li>weeks</li><li>months</li><li>quarters</li><li>years</li></ul>
     */
    public String getInterval() {
        return interval;
    }

    /**
     * <p>The interval between recurring payments specified as days, weeks, quarters, or years.</p> 
     *  <p>Allowed values:</p> <ul><li>days</li><li>weeks</li><li>months</li><li>quarters</li><li>years</li></ul>
     */
    public void setInterval(String value) {
        this.interval = value;
    }

    /**
     * The number of days, weeks, months, quarters, or years between recurring payments.
     */
    public Integer getIntervalFrequency() {
        return intervalFrequency;
    }

    /**
     * The number of days, weeks, months, quarters, or years between recurring payments.
     */
    public void setIntervalFrequency(Integer value) {
        this.intervalFrequency = value;
    }
}
