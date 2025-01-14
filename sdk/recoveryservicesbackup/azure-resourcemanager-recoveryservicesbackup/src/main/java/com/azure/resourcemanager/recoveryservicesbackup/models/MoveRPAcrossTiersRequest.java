// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MoveRPAcrossTiersRequest model. */
@Fluent
public final class MoveRPAcrossTiersRequest {
    /*
     * Gets the class type.
     */
    @JsonProperty(value = "objectType")
    private String objectType;

    /*
     * Source tier from where RP needs to be moved
     */
    @JsonProperty(value = "sourceTierType")
    private RecoveryPointTierType sourceTierType;

    /*
     * Target tier where RP needs to be moved
     */
    @JsonProperty(value = "targetTierType")
    private RecoveryPointTierType targetTierType;

    /**
     * Get the objectType property: Gets the class type.
     *
     * @return the objectType value.
     */
    public String objectType() {
        return this.objectType;
    }

    /**
     * Set the objectType property: Gets the class type.
     *
     * @param objectType the objectType value to set.
     * @return the MoveRPAcrossTiersRequest object itself.
     */
    public MoveRPAcrossTiersRequest withObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get the sourceTierType property: Source tier from where RP needs to be moved.
     *
     * @return the sourceTierType value.
     */
    public RecoveryPointTierType sourceTierType() {
        return this.sourceTierType;
    }

    /**
     * Set the sourceTierType property: Source tier from where RP needs to be moved.
     *
     * @param sourceTierType the sourceTierType value to set.
     * @return the MoveRPAcrossTiersRequest object itself.
     */
    public MoveRPAcrossTiersRequest withSourceTierType(RecoveryPointTierType sourceTierType) {
        this.sourceTierType = sourceTierType;
        return this;
    }

    /**
     * Get the targetTierType property: Target tier where RP needs to be moved.
     *
     * @return the targetTierType value.
     */
    public RecoveryPointTierType targetTierType() {
        return this.targetTierType;
    }

    /**
     * Set the targetTierType property: Target tier where RP needs to be moved.
     *
     * @param targetTierType the targetTierType value to set.
     * @return the MoveRPAcrossTiersRequest object itself.
     */
    public MoveRPAcrossTiersRequest withTargetTierType(RecoveryPointTierType targetTierType) {
        this.targetTierType = targetTierType;
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
