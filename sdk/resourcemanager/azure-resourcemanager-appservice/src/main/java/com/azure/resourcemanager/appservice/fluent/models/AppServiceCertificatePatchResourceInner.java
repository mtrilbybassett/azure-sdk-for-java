// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.KeyVaultSecretStatus;
import com.azure.resourcemanager.appservice.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Key Vault container ARM resource for a certificate that is purchased through Azure. */
@Fluent
public final class AppServiceCertificatePatchResourceInner extends ProxyOnlyResource {
    /*
     * Core resource properties
     */
    @JsonProperty(value = "properties")
    private AppServiceCertificateInner innerProperties;

    /**
     * Get the innerProperties property: Core resource properties.
     *
     * @return the innerProperties value.
     */
    private AppServiceCertificateInner innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AppServiceCertificatePatchResourceInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Get the keyVaultId property: Key Vault resource Id.
     *
     * @return the keyVaultId value.
     */
    public String keyVaultId() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultId();
    }

    /**
     * Set the keyVaultId property: Key Vault resource Id.
     *
     * @param keyVaultId the keyVaultId value to set.
     * @return the AppServiceCertificatePatchResourceInner object itself.
     */
    public AppServiceCertificatePatchResourceInner withKeyVaultId(String keyVaultId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceCertificateInner();
        }
        this.innerProperties().withKeyVaultId(keyVaultId);
        return this;
    }

    /**
     * Get the keyVaultSecretName property: Key Vault secret name.
     *
     * @return the keyVaultSecretName value.
     */
    public String keyVaultSecretName() {
        return this.innerProperties() == null ? null : this.innerProperties().keyVaultSecretName();
    }

    /**
     * Set the keyVaultSecretName property: Key Vault secret name.
     *
     * @param keyVaultSecretName the keyVaultSecretName value to set.
     * @return the AppServiceCertificatePatchResourceInner object itself.
     */
    public AppServiceCertificatePatchResourceInner withKeyVaultSecretName(String keyVaultSecretName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AppServiceCertificateInner();
        }
        this.innerProperties().withKeyVaultSecretName(keyVaultSecretName);
        return this;
    }

    /**
     * Get the provisioningState property: Status of the Key Vault secret.
     *
     * @return the provisioningState value.
     */
    public KeyVaultSecretStatus provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
