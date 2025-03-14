// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.FirewallPolicyRuleCollectionGroupInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ListFirewallPolicyRuleCollectionGroups API service call. */
@Fluent
public final class FirewallPolicyRuleCollectionGroupListResult {
    /*
     * List of FirewallPolicyRuleCollectionGroups in a FirewallPolicy.
     */
    @JsonProperty(value = "value")
    private List<FirewallPolicyRuleCollectionGroupInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of FirewallPolicyRuleCollectionGroups in a FirewallPolicy.
     *
     * @return the value value.
     */
    public List<FirewallPolicyRuleCollectionGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of FirewallPolicyRuleCollectionGroups in a FirewallPolicy.
     *
     * @param value the value value to set.
     * @return the FirewallPolicyRuleCollectionGroupListResult object itself.
     */
    public FirewallPolicyRuleCollectionGroupListResult withValue(List<FirewallPolicyRuleCollectionGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the FirewallPolicyRuleCollectionGroupListResult object itself.
     */
    public FirewallPolicyRuleCollectionGroupListResult withNextLink(String nextLink) {
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
