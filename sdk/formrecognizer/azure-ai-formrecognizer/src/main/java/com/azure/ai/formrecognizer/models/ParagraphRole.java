// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collection;

/** Defines values for ParagraphRole. */
public final class ParagraphRole extends ExpandableStringEnum<ParagraphRole> {
    /** Static value pageHeader for ParagraphRole. */
    public static final ParagraphRole PAGE_HEADER = fromString("pageHeader");

    /** Static value pageFooter for ParagraphRole. */
    public static final ParagraphRole PAGE_FOOTER = fromString("pageFooter");

    /** Static value pageNumber for ParagraphRole. */
    public static final ParagraphRole PAGE_NUMBER = fromString("pageNumber");

    /** Static value title for ParagraphRole. */
    public static final ParagraphRole TITLE = fromString("title");

    /** Static value sectionHeading for ParagraphRole. */
    public static final ParagraphRole SECTION_HEADING = fromString("sectionHeading");

    /** Static value footnote for ParagraphRole. */
    public static final ParagraphRole FOOTNOTE = fromString("footnote");

    /**
     * Creates or finds a ParagraphRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ParagraphRole.
     */
    @JsonCreator
    public static ParagraphRole fromString(String name) {
        return fromString(name, ParagraphRole.class);
    }

    /** @return known ParagraphRole values. */
    public static Collection<ParagraphRole> values() {
        return values(ParagraphRole.class);
    }
}
