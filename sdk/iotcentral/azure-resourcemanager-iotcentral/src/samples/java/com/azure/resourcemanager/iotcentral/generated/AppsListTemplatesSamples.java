// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.generated;

import com.azure.core.util.Context;

/** Samples for Apps ListTemplates. */
public final class AppsListTemplatesSamples {
    /*
     * x-ms-original-file: specification/iotcentral/resource-manager/Microsoft.IoTCentral/stable/2021-06-01/examples/Apps_Templates.json
     */
    /**
     * Sample code: Apps_ListTemplates.
     *
     * @param manager Entry point to IotCentralManager.
     */
    public static void appsListTemplates(com.azure.resourcemanager.iotcentral.IotCentralManager manager) {
        manager.apps().listTemplates(Context.NONE);
    }
}