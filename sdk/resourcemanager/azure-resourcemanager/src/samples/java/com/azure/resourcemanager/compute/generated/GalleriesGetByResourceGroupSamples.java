// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.GalleryExpandParams;
import com.azure.resourcemanager.compute.models.SelectPermissions;

/** Samples for Galleries GetByResourceGroup. */
public final class GalleriesGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-01-03/GalleryRP/examples/galleryExamples/CommunityGallery_Get.json
     */
    /**
     * Sample code: Get a community gallery.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getACommunityGallery(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleries()
            .getByResourceGroupWithResponse("myResourceGroup", "myGalleryName", null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-01-03/GalleryRP/examples/galleryExamples/Gallery_Get_WithSelectPermissions.json
     */
    /**
     * Sample code: Get a gallery with select permissions.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAGalleryWithSelectPermissions(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleries()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myGalleryName", SelectPermissions.PERMISSIONS, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-01-03/GalleryRP/examples/galleryExamples/Gallery_Get.json
     */
    /**
     * Sample code: Get a gallery.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAGallery(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleries()
            .getByResourceGroupWithResponse("myResourceGroup", "myGalleryName", null, null, Context.NONE);
    }

    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2022-01-03/GalleryRP/examples/galleryExamples/Gallery_Get_WithExpandSharingProfileGroups.json
     */
    /**
     * Sample code: Get a gallery with expand sharingProfile groups.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getAGalleryWithExpandSharingProfileGroups(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getGalleries()
            .getByResourceGroupWithResponse(
                "myResourceGroup", "myGalleryName", null, GalleryExpandParams.SHARING_PROFILE_GROUPS, Context.NONE);
    }
}
