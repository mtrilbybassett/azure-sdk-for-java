// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.Duration;
import java.util.List;

/** Describes all the properties for encoding a video with the H.264 codec. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.H264Video")
@Fluent
public final class H264Video extends Video {
    /*
     * Tells the encoder how to choose its encoding settings. The default value
     * is Balanced.
     */
    @JsonProperty(value = "complexity")
    private H264Complexity complexity;

    /*
     * The collection of output H.264 layers to be produced by the encoder.
     */
    @JsonProperty(value = "layers")
    private List<H264Layer> layers;

    /*
     * The video rate control mode
     */
    @JsonProperty(value = "rateControlMode")
    private H264RateControlMode rateControlMode;

    /*
     * Whether or not the encoder should insert key frames at scene changes. If
     * not specified, the default is false. This flag should be set to true
     * only when the encoder is being configured to produce a single output
     * video.
     */
    @JsonProperty(value = "sceneChangeDetection")
    private Boolean sceneChangeDetection;

    /**
     * Get the complexity property: Tells the encoder how to choose its encoding settings. The default value is
     * Balanced.
     *
     * @return the complexity value.
     */
    public H264Complexity complexity() {
        return this.complexity;
    }

    /**
     * Set the complexity property: Tells the encoder how to choose its encoding settings. The default value is
     * Balanced.
     *
     * @param complexity the complexity value to set.
     * @return the H264Video object itself.
     */
    public H264Video withComplexity(H264Complexity complexity) {
        this.complexity = complexity;
        return this;
    }

    /**
     * Get the layers property: The collection of output H.264 layers to be produced by the encoder.
     *
     * @return the layers value.
     */
    public List<H264Layer> layers() {
        return this.layers;
    }

    /**
     * Set the layers property: The collection of output H.264 layers to be produced by the encoder.
     *
     * @param layers the layers value to set.
     * @return the H264Video object itself.
     */
    public H264Video withLayers(List<H264Layer> layers) {
        this.layers = layers;
        return this;
    }

    /**
     * Get the rateControlMode property: The video rate control mode.
     *
     * @return the rateControlMode value.
     */
    public H264RateControlMode rateControlMode() {
        return this.rateControlMode;
    }

    /**
     * Set the rateControlMode property: The video rate control mode.
     *
     * @param rateControlMode the rateControlMode value to set.
     * @return the H264Video object itself.
     */
    public H264Video withRateControlMode(H264RateControlMode rateControlMode) {
        this.rateControlMode = rateControlMode;
        return this;
    }

    /**
     * Get the sceneChangeDetection property: Whether or not the encoder should insert key frames at scene changes. If
     * not specified, the default is false. This flag should be set to true only when the encoder is being configured to
     * produce a single output video.
     *
     * @return the sceneChangeDetection value.
     */
    public Boolean sceneChangeDetection() {
        return this.sceneChangeDetection;
    }

    /**
     * Set the sceneChangeDetection property: Whether or not the encoder should insert key frames at scene changes. If
     * not specified, the default is false. This flag should be set to true only when the encoder is being configured to
     * produce a single output video.
     *
     * @param sceneChangeDetection the sceneChangeDetection value to set.
     * @return the H264Video object itself.
     */
    public H264Video withSceneChangeDetection(Boolean sceneChangeDetection) {
        this.sceneChangeDetection = sceneChangeDetection;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H264Video withKeyFrameInterval(Duration keyFrameInterval) {
        super.withKeyFrameInterval(keyFrameInterval);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H264Video withStretchMode(StretchMode stretchMode) {
        super.withStretchMode(stretchMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H264Video withSyncMode(VideoSyncMode syncMode) {
        super.withSyncMode(syncMode);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public H264Video withLabel(String label) {
        super.withLabel(label);
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
        if (layers() != null) {
            layers().forEach(e -> e.validate());
        }
    }
}
