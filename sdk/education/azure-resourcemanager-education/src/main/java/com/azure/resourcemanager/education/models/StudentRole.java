// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.education.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for StudentRole. */
public final class StudentRole extends ExpandableStringEnum<StudentRole> {
    /** Static value Student for StudentRole. */
    public static final StudentRole STUDENT = fromString("Student");

    /** Static value Admin for StudentRole. */
    public static final StudentRole ADMIN = fromString("Admin");

    /**
     * Creates or finds a StudentRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding StudentRole.
     */
    @JsonCreator
    public static StudentRole fromString(String name) {
        return fromString(name, StudentRole.class);
    }

    /**
     * Gets known StudentRole values.
     *
     * @return known StudentRole values.
     */
    public static Collection<StudentRole> values() {
        return values(StudentRole.class);
    }
}
