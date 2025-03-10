// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Response body structure for starting data flow debug session. */
@Fluent
public final class AddDataFlowToDebugSessionResponseInner {
    /*
     * The ID of data flow debug job version.
     */
    @JsonProperty(value = "jobVersion")
    private String jobVersion;

    /**
     * Get the jobVersion property: The ID of data flow debug job version.
     *
     * @return the jobVersion value.
     */
    public String jobVersion() {
        return this.jobVersion;
    }

    /**
     * Set the jobVersion property: The ID of data flow debug job version.
     *
     * @param jobVersion the jobVersion value to set.
     * @return the AddDataFlowToDebugSessionResponseInner object itself.
     */
    public AddDataFlowToDebugSessionResponseInner withJobVersion(String jobVersion) {
        this.jobVersion = jobVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
