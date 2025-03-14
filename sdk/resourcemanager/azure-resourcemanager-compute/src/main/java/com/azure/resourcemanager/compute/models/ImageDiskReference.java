// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The source image used for creating the disk. */
@Fluent
public final class ImageDiskReference {
    /*
     * A relative uri containing either a Platform Image Repository, user
     * image, or Azure Compute Gallery image reference.
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * A relative uri containing a direct shared Azure Compute Gallery image
     * reference.
     */
    @JsonProperty(value = "sharedGalleryImageId")
    private String sharedGalleryImageId;

    /*
     * A relative uri containing a community Azure Compute Gallery image
     * reference.
     */
    @JsonProperty(value = "communityGalleryImageId")
    private String communityGalleryImageId;

    /*
     * If the disk is created from an image's data disk, this is an index that
     * indicates which of the data disks in the image to use. For OS disks,
     * this field is null.
     */
    @JsonProperty(value = "lun")
    private Integer lun;

    /**
     * Get the id property: A relative uri containing either a Platform Image Repository, user image, or Azure Compute
     * Gallery image reference.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: A relative uri containing either a Platform Image Repository, user image, or Azure Compute
     * Gallery image reference.
     *
     * @param id the id value to set.
     * @return the ImageDiskReference object itself.
     */
    public ImageDiskReference withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the sharedGalleryImageId property: A relative uri containing a direct shared Azure Compute Gallery image
     * reference.
     *
     * @return the sharedGalleryImageId value.
     */
    public String sharedGalleryImageId() {
        return this.sharedGalleryImageId;
    }

    /**
     * Set the sharedGalleryImageId property: A relative uri containing a direct shared Azure Compute Gallery image
     * reference.
     *
     * @param sharedGalleryImageId the sharedGalleryImageId value to set.
     * @return the ImageDiskReference object itself.
     */
    public ImageDiskReference withSharedGalleryImageId(String sharedGalleryImageId) {
        this.sharedGalleryImageId = sharedGalleryImageId;
        return this;
    }

    /**
     * Get the communityGalleryImageId property: A relative uri containing a community Azure Compute Gallery image
     * reference.
     *
     * @return the communityGalleryImageId value.
     */
    public String communityGalleryImageId() {
        return this.communityGalleryImageId;
    }

    /**
     * Set the communityGalleryImageId property: A relative uri containing a community Azure Compute Gallery image
     * reference.
     *
     * @param communityGalleryImageId the communityGalleryImageId value to set.
     * @return the ImageDiskReference object itself.
     */
    public ImageDiskReference withCommunityGalleryImageId(String communityGalleryImageId) {
        this.communityGalleryImageId = communityGalleryImageId;
        return this;
    }

    /**
     * Get the lun property: If the disk is created from an image's data disk, this is an index that indicates which of
     * the data disks in the image to use. For OS disks, this field is null.
     *
     * @return the lun value.
     */
    public Integer lun() {
        return this.lun;
    }

    /**
     * Set the lun property: If the disk is created from an image's data disk, this is an index that indicates which of
     * the data disks in the image to use. For OS disks, this field is null.
     *
     * @param lun the lun value to set.
     * @return the ImageDiskReference object itself.
     */
    public ImageDiskReference withLun(Integer lun) {
        this.lun = lun;
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
