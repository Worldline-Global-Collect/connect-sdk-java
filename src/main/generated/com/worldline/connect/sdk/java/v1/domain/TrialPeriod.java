/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

/**
 * The object containing information on the trial period duration and the interval between payments during that period.
 */
public class TrialPeriod {

    private Integer duration;

    private String interval;

    /**
     * The number of days, weeks, months, or years before the trial period ends.
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * The number of days, weeks, months, or years before the trial period ends.
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * The interval for the trial period to finish specified as days, weeks, months, quarters, or years.
     */
    public String getInterval() {
        return interval;
    }

    /**
     * The interval for the trial period to finish specified as days, weeks, months, quarters, or years.
     */
    public void setInterval(String value) {
        this.interval = value;
    }
}
