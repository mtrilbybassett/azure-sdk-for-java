// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.resources.fluent.models.ManagementLockObjectInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of locks. */
@Fluent
public final class ManagementLockListResult {
    /*
     * The list of locks.
     */
    @JsonProperty(value = "value")
    private List<ManagementLockObjectInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of locks.
     *
     * @return the value value.
     */
    public List<ManagementLockObjectInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of locks.
     *
     * @param value the value value to set.
     * @return the ManagementLockListResult object itself.
     */
    public ManagementLockListResult withValue(List<ManagementLockObjectInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ManagementLockListResult object itself.
     */
    public ManagementLockListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
