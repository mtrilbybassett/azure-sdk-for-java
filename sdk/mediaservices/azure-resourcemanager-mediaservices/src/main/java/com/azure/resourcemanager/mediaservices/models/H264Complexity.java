// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for H264Complexity. */
public final class H264Complexity extends ExpandableStringEnum<H264Complexity> {
    /** Static value Speed for H264Complexity. */
    public static final H264Complexity SPEED = fromString("Speed");

    /** Static value Balanced for H264Complexity. */
    public static final H264Complexity BALANCED = fromString("Balanced");

    /** Static value Quality for H264Complexity. */
    public static final H264Complexity QUALITY = fromString("Quality");

    /**
     * Creates or finds a H264Complexity from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding H264Complexity.
     */
    @JsonCreator
    public static H264Complexity fromString(String name) {
        return fromString(name, H264Complexity.class);
    }

    /**
     * Gets known H264Complexity values.
     *
     * @return known H264Complexity values.
     */
    public static Collection<H264Complexity> values() {
        return values(H264Complexity.class);
    }
}
