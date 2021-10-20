// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub;

import com.azure.core.util.Context;
import com.azure.resourcemanager.webpubsub.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpoint;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionState;
import com.azure.resourcemanager.webpubsub.models.PrivateLinkServiceConnectionStatus;

/** Samples for WebPubSubPrivateEndpointConnections Update. */
public final class WebPubSubPrivateEndpointConnectionsUpdateSamples {
    /**
     * Sample code: WebPubSubPrivateEndpointConnections_Update.
     *
     * @param webPubSubManager Entry point to WebPubSubManager. REST API for Azure WebPubSub Service.
     */
    public static void webPubSubPrivateEndpointConnectionsUpdate(
        com.azure.resourcemanager.webpubsub.WebPubSubManager webPubSubManager) {
        webPubSubManager
            .webPubSubPrivateEndpointConnections()
            .updateWithResponse(
                "mywebpubsubservice.1fa229cd-bf3f-47f0-8c49-afb36723997e",
                "myResourceGroup",
                "myWebPubSubService",
                new PrivateEndpointConnectionInner()
                    .withPrivateEndpoint(
                        new PrivateEndpoint()
                            .withId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourcegroups/myResourceGroup/providers/Microsoft.Network/privateEndpoints/myPrivateEndpoint"))
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkServiceConnectionState()
                            .withStatus(PrivateLinkServiceConnectionStatus.APPROVED)
                            .withActionsRequired("None")),
                Context.NONE);
    }
}