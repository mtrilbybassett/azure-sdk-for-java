// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.Context;

/** Samples for ItemLevelRecoveryConnections Revoke. */
public final class ItemLevelRecoveryConnectionsRevokeSamples {
    /*
     * x-ms-original-file: specification/recoveryservicesbackup/resource-manager/Microsoft.RecoveryServices/stable/2022-02-01/examples/AzureIaasVm/Revoke_Ilr.json
     */
    /**
     * Sample code: Revoke Instant Item Level Recovery for Azure Vm.
     *
     * @param manager Entry point to RecoveryServicesBackupManager.
     */
    public static void revokeInstantItemLevelRecoveryForAzureVm(
        com.azure.resourcemanager.recoveryservicesbackup.RecoveryServicesBackupManager manager) {
        manager
            .itemLevelRecoveryConnections()
            .revokeWithResponse(
                "PySDKBackupTestRsVault",
                "PythonSDKBackupTestRg",
                "Azure",
                "iaasvmcontainer;iaasvmcontainerv2;pysdktestrg;pysdktestv2vm1",
                "vm;iaasvmcontainerv2;pysdktestrg;pysdktestv2vm1",
                "1",
                Context.NONE);
    }
}
