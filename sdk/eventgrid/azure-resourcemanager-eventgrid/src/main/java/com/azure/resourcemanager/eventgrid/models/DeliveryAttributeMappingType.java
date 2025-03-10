// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DeliveryAttributeMappingType. */
public final class DeliveryAttributeMappingType extends ExpandableStringEnum<DeliveryAttributeMappingType> {
    /** Static value Static for DeliveryAttributeMappingType. */
    public static final DeliveryAttributeMappingType STATIC = fromString("Static");

    /** Static value Dynamic for DeliveryAttributeMappingType. */
    public static final DeliveryAttributeMappingType DYNAMIC = fromString("Dynamic");

    /**
     * Creates or finds a DeliveryAttributeMappingType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DeliveryAttributeMappingType.
     */
    @JsonCreator
    public static DeliveryAttributeMappingType fromString(String name) {
        return fromString(name, DeliveryAttributeMappingType.class);
    }

    /**
     * Gets known DeliveryAttributeMappingType values.
     *
     * @return known DeliveryAttributeMappingType values.
     */
    public static Collection<DeliveryAttributeMappingType> values() {
        return values(DeliveryAttributeMappingType.class);
    }
}
