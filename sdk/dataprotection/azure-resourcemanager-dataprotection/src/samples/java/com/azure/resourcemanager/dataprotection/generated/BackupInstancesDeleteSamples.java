// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.Context;

/** Samples for BackupInstances Delete. */
public final class BackupInstancesDeleteSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2021-07-01/examples/BackupInstanceOperations/DeleteBackupInstance.json
     */
    /**
     * Sample code: Delete BackupInstance.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void deleteBackupInstance(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager.backupInstances().delete("PratikPrivatePreviewVault1", "000pikumar", "testInstance1", Context.NONE);
    }
}