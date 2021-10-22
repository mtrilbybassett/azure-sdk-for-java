// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.implementation;

import com.azure.resourcemanager.synapse.fluent.models.DataConnectionValidationListResultInner;
import com.azure.resourcemanager.synapse.models.DataConnectionValidationListResult;
import com.azure.resourcemanager.synapse.models.DataConnectionValidationResult;
import java.util.Collections;
import java.util.List;

public final class DataConnectionValidationListResultImpl implements DataConnectionValidationListResult {
    private DataConnectionValidationListResultInner innerObject;

    private final com.azure.resourcemanager.synapse.SynapseManager serviceManager;

    DataConnectionValidationListResultImpl(
        DataConnectionValidationListResultInner innerObject,
        com.azure.resourcemanager.synapse.SynapseManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<DataConnectionValidationResult> value() {
        List<DataConnectionValidationResult> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DataConnectionValidationListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.synapse.SynapseManager manager() {
        return this.serviceManager;
    }
}