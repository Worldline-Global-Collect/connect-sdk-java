/*
 * This class was auto-generated from the API references found at
 * https://apireference.connect.worldline-solutions.com/
 */

package com.worldline.connect.sdk.java.v1.domain;

import java.util.List;

public class RiskAssessmentResponse {

    private List<ResultDoRiskAssessment> results;

    /**
     * Object that contains the results of the performed fraudchecks
     */
    public List<ResultDoRiskAssessment> getResults() {
        return results;
    }

    /**
     * Object that contains the results of the performed fraudchecks
     */
    public void setResults(List<ResultDoRiskAssessment> value) {
        this.results = value;
    }
}
