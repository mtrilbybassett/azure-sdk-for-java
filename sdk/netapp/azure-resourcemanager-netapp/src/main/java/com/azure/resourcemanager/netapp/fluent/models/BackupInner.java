// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.netapp.models.BackupType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Backup of a Volume. */
@Fluent
public final class BackupInner extends ProxyResource {
    /*
     * Resource location
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * Backup Properties
     */
    @JsonProperty(value = "properties", required = true)
    private BackupProperties innerProperties = new BackupProperties();

    /**
     * Get the location property: Resource location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource location.
     *
     * @param location the location value to set.
     * @return the BackupInner object itself.
     */
    public BackupInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the innerProperties property: Backup Properties.
     *
     * @return the innerProperties value.
     */
    private BackupProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the backupId property: backupId UUID v4 used to identify the Backup.
     *
     * @return the backupId value.
     */
    public String backupId() {
        return this.innerProperties() == null ? null : this.innerProperties().backupId();
    }

    /**
     * Get the creationDate property: creationDate The creation date of the backup.
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the provisioningState property: Azure lifecycle management.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the size property: Size of backup.
     *
     * @return the size value.
     */
    public Long size() {
        return this.innerProperties() == null ? null : this.innerProperties().size();
    }

    /**
     * Get the label property: Label for backup.
     *
     * @return the label value.
     */
    public String label() {
        return this.innerProperties() == null ? null : this.innerProperties().label();
    }

    /**
     * Set the label property: Label for backup.
     *
     * @param label the label value to set.
     * @return the BackupInner object itself.
     */
    public BackupInner withLabel(String label) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupProperties();
        }
        this.innerProperties().withLabel(label);
        return this;
    }

    /**
     * Get the backupType property: backupType Type of backup Manual or Scheduled.
     *
     * @return the backupType value.
     */
    public BackupType backupType() {
        return this.innerProperties() == null ? null : this.innerProperties().backupType();
    }

    /**
     * Get the failureReason property: Failure reason.
     *
     * @return the failureReason value.
     */
    public String failureReason() {
        return this.innerProperties() == null ? null : this.innerProperties().failureReason();
    }

    /**
     * Get the volumeName property: Volume name.
     *
     * @return the volumeName value.
     */
    public String volumeName() {
        return this.innerProperties() == null ? null : this.innerProperties().volumeName();
    }

    /**
     * Get the useExistingSnapshot property: Manual backup an already existing snapshot. This will always be false for
     * scheduled backups and true/false for manual backups.
     *
     * @return the useExistingSnapshot value.
     */
    public Boolean useExistingSnapshot() {
        return this.innerProperties() == null ? null : this.innerProperties().useExistingSnapshot();
    }

    /**
     * Set the useExistingSnapshot property: Manual backup an already existing snapshot. This will always be false for
     * scheduled backups and true/false for manual backups.
     *
     * @param useExistingSnapshot the useExistingSnapshot value to set.
     * @return the BackupInner object itself.
     */
    public BackupInner withUseExistingSnapshot(Boolean useExistingSnapshot) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BackupProperties();
        }
        this.innerProperties().withUseExistingSnapshot(useExistingSnapshot);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property location in model BackupInner"));
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property innerProperties in model BackupInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BackupInner.class);
}
