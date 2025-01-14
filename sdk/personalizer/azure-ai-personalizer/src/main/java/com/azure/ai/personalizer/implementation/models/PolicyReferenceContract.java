// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Reference to the policy within the evaluation. */
@Fluent
public final class PolicyReferenceContract {
    /*
     * Evaluation Id of the evaluation.
     */
    @JsonProperty(value = "evaluationId", required = true)
    private String evaluationId;

    /*
     * Name of the learning settings.
     */
    @JsonProperty(value = "policyName", required = true)
    private String policyName;

    /**
     * Get the evaluationId property: Evaluation Id of the evaluation.
     *
     * @return the evaluationId value.
     */
    public String getEvaluationId() {
        return this.evaluationId;
    }

    /**
     * Set the evaluationId property: Evaluation Id of the evaluation.
     *
     * @param evaluationId the evaluationId value to set.
     * @return the PolicyReferenceContract object itself.
     */
    public PolicyReferenceContract setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * Get the policyName property: Name of the learning settings.
     *
     * @return the policyName value.
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * Set the policyName property: Name of the learning settings.
     *
     * @param policyName the policyName value to set.
     * @return the PolicyReferenceContract object itself.
     */
    public PolicyReferenceContract setPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }
}
