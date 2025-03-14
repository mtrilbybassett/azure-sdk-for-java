// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.privatedns.models.ProvisioningState;
import com.azure.resourcemanager.privatedns.models.VirtualNetworkLinkState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Describes a link to virtual network for a Private DNS zone. */
@Fluent
public final class VirtualNetworkLinkInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualNetworkLinkInner.class);

    /*
     * The ETag of the virtual network link.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * Properties of the virtual network link to the Private DNS zone.
     */
    @JsonProperty(value = "properties")
    private VirtualNetworkLinkProperties innerProperties;

    /**
     * Get the etag property: The ETag of the virtual network link.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag of the virtual network link.
     *
     * @param etag the etag value to set.
     * @return the VirtualNetworkLinkInner object itself.
     */
    public VirtualNetworkLinkInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the virtual network link to the Private DNS zone.
     *
     * @return the innerProperties value.
     */
    private VirtualNetworkLinkProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkLinkInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkLinkInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualNetwork property: The reference of the virtual network.
     *
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetwork();
    }

    /**
     * Set the virtualNetwork property: The reference of the virtual network.
     *
     * @param virtualNetwork the virtualNetwork value to set.
     * @return the VirtualNetworkLinkInner object itself.
     */
    public VirtualNetworkLinkInner withVirtualNetwork(SubResource virtualNetwork) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkLinkProperties();
        }
        this.innerProperties().withVirtualNetwork(virtualNetwork);
        return this;
    }

    /**
     * Get the registrationEnabled property: Is auto-registration of virtual machine records in the virtual network in
     * the Private DNS zone enabled?.
     *
     * @return the registrationEnabled value.
     */
    public Boolean registrationEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().registrationEnabled();
    }

    /**
     * Set the registrationEnabled property: Is auto-registration of virtual machine records in the virtual network in
     * the Private DNS zone enabled?.
     *
     * @param registrationEnabled the registrationEnabled value to set.
     * @return the VirtualNetworkLinkInner object itself.
     */
    public VirtualNetworkLinkInner withRegistrationEnabled(Boolean registrationEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkLinkProperties();
        }
        this.innerProperties().withRegistrationEnabled(registrationEnabled);
        return this;
    }

    /**
     * Get the virtualNetworkLinkState property: The status of the virtual network link to the Private DNS zone.
     * Possible values are 'InProgress' and 'Done'. This is a read-only property and any attempt to set this value will
     * be ignored.
     *
     * @return the virtualNetworkLinkState value.
     */
    public VirtualNetworkLinkState virtualNetworkLinkState() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkLinkState();
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource. This is a read-only property and any
     * attempt to set this value will be ignored.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
