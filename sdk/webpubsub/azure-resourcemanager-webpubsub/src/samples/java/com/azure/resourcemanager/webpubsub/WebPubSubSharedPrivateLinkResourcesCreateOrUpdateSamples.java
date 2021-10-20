// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub;

/** Samples for WebPubSubSharedPrivateLinkResources CreateOrUpdate. */
public final class WebPubSubSharedPrivateLinkResourcesCreateOrUpdateSamples {
    /**
     * Sample code: WebPubSubSharedPrivateLinkResources_CreateOrUpdate.
     *
     * @param webPubSubManager Entry point to WebPubSubManager. REST API for Azure WebPubSub Service.
     */
    public static void webPubSubSharedPrivateLinkResourcesCreateOrUpdate(
        com.azure.resourcemanager.webpubsub.WebPubSubManager webPubSubManager) {
        webPubSubManager
            .webPubSubSharedPrivateLinkResources()
            .define("upstream")
            .withExistingWebPubSub("myResourceGroup", "myWebPubSubService")
            .withGroupId("sites")
            .withPrivateLinkResourceId(
                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.Web/sites/myWebApp")
            .withRequestMessage("Please approve")
            .create();
    }
}