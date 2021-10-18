// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Video source allows for content from a Video Analyzer video resource to be ingested into a pipeline. Currently
 * supported only with batch pipelines.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.VideoSource")
@Fluent
public final class VideoSource extends SourceNodeBase {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoSource.class);

    /*
     * Name of the Video Analyzer video resource to be used as the source.
     */
    @JsonProperty(value = "videoName", required = true)
    private String videoName;

    /*
     * Describes a sequence of datetime ranges. The video source only picks up
     * recorded media within these ranges.
     */
    @JsonProperty(value = "timeSequences", required = true)
    private TimeSequenceBase timeSequences;

    /**
     * Get the videoName property: Name of the Video Analyzer video resource to be used as the source.
     *
     * @return the videoName value.
     */
    public String videoName() {
        return this.videoName;
    }

    /**
     * Set the videoName property: Name of the Video Analyzer video resource to be used as the source.
     *
     * @param videoName the videoName value to set.
     * @return the VideoSource object itself.
     */
    public VideoSource withVideoName(String videoName) {
        this.videoName = videoName;
        return this;
    }

    /**
     * Get the timeSequences property: Describes a sequence of datetime ranges. The video source only picks up recorded
     * media within these ranges.
     *
     * @return the timeSequences value.
     */
    public TimeSequenceBase timeSequences() {
        return this.timeSequences;
    }

    /**
     * Set the timeSequences property: Describes a sequence of datetime ranges. The video source only picks up recorded
     * media within these ranges.
     *
     * @param timeSequences the timeSequences value to set.
     * @return the VideoSource object itself.
     */
    public VideoSource withTimeSequences(TimeSequenceBase timeSequences) {
        this.timeSequences = timeSequences;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VideoSource withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (videoName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property videoName in model VideoSource"));
        }
        if (timeSequences() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property timeSequences in model VideoSource"));
        } else {
            timeSequences().validate();
        }
    }
}