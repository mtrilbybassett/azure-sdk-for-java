// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.resourcemanager.dataprotection.fluent.models.ExportJobsResultInner;

/** An immutable client-side representation of ExportJobsResult. */
public interface ExportJobsResult {
    /**
     * Gets the blobUrl property: URL of the blob into which the serialized string of list of jobs is exported.
     *
     * @return the blobUrl value.
     */
    String blobUrl();

    /**
     * Gets the blobSasKey property: SAS key to access the blob.
     *
     * @return the blobSasKey value.
     */
    String blobSasKey();

    /**
     * Gets the excelFileBlobUrl property: URL of the blob into which the ExcelFile is uploaded.
     *
     * @return the excelFileBlobUrl value.
     */
    String excelFileBlobUrl();

    /**
     * Gets the excelFileBlobSasKey property: SAS key to access the ExcelFile blob.
     *
     * @return the excelFileBlobSasKey value.
     */
    String excelFileBlobSasKey();

    /**
     * Gets the inner com.azure.resourcemanager.dataprotection.fluent.models.ExportJobsResultInner object.
     *
     * @return the inner object.
     */
    ExportJobsResultInner innerModel();
}