// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VpnNatRuleMapping;
import com.azure.resourcemanager.network.models.VpnNatRuleMode;
import com.azure.resourcemanager.network.models.VpnNatRuleType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** VpnGatewayNatRule Resource. */
@Fluent
public final class VpnGatewayNatRuleInner extends SubResource {
    /*
     * Properties of the VpnGateway NAT rule.
     */
    @JsonProperty(value = "properties")
    private VpnGatewayNatRuleProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the VpnGateway NAT rule.
     *
     * @return the innerProperties value.
     */
    private VpnGatewayNatRuleProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the VpnGatewayNatRuleInner object itself.
     */
    public VpnGatewayNatRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public VpnGatewayNatRuleInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the NAT Rule resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the type property: The type of NAT rule for VPN NAT.
     *
     * @return the type value.
     */
    public VpnNatRuleType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: The type of NAT rule for VPN NAT.
     *
     * @param type the type value to set.
     * @return the VpnGatewayNatRuleInner object itself.
     */
    public VpnGatewayNatRuleInner withTypePropertiesType(VpnNatRuleType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayNatRuleProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the mode property: The Source NAT direction of a VPN NAT.
     *
     * @return the mode value.
     */
    public VpnNatRuleMode mode() {
        return this.innerProperties() == null ? null : this.innerProperties().mode();
    }

    /**
     * Set the mode property: The Source NAT direction of a VPN NAT.
     *
     * @param mode the mode value to set.
     * @return the VpnGatewayNatRuleInner object itself.
     */
    public VpnGatewayNatRuleInner withMode(VpnNatRuleMode mode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayNatRuleProperties();
        }
        this.innerProperties().withMode(mode);
        return this;
    }

    /**
     * Get the internalMappings property: The private IP address internal mapping for NAT.
     *
     * @return the internalMappings value.
     */
    public List<VpnNatRuleMapping> internalMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().internalMappings();
    }

    /**
     * Set the internalMappings property: The private IP address internal mapping for NAT.
     *
     * @param internalMappings the internalMappings value to set.
     * @return the VpnGatewayNatRuleInner object itself.
     */
    public VpnGatewayNatRuleInner withInternalMappings(List<VpnNatRuleMapping> internalMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayNatRuleProperties();
        }
        this.innerProperties().withInternalMappings(internalMappings);
        return this;
    }

    /**
     * Get the externalMappings property: The private IP address external mapping for NAT.
     *
     * @return the externalMappings value.
     */
    public List<VpnNatRuleMapping> externalMappings() {
        return this.innerProperties() == null ? null : this.innerProperties().externalMappings();
    }

    /**
     * Set the externalMappings property: The private IP address external mapping for NAT.
     *
     * @param externalMappings the externalMappings value to set.
     * @return the VpnGatewayNatRuleInner object itself.
     */
    public VpnGatewayNatRuleInner withExternalMappings(List<VpnNatRuleMapping> externalMappings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayNatRuleProperties();
        }
        this.innerProperties().withExternalMappings(externalMappings);
        return this;
    }

    /**
     * Get the ipConfigurationId property: The IP Configuration ID this NAT rule applies to.
     *
     * @return the ipConfigurationId value.
     */
    public String ipConfigurationId() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurationId();
    }

    /**
     * Set the ipConfigurationId property: The IP Configuration ID this NAT rule applies to.
     *
     * @param ipConfigurationId the ipConfigurationId value to set.
     * @return the VpnGatewayNatRuleInner object itself.
     */
    public VpnGatewayNatRuleInner withIpConfigurationId(String ipConfigurationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayNatRuleProperties();
        }
        this.innerProperties().withIpConfigurationId(ipConfigurationId);
        return this;
    }

    /**
     * Get the egressVpnSiteLinkConnections property: List of egress VpnSiteLinkConnections.
     *
     * @return the egressVpnSiteLinkConnections value.
     */
    public List<SubResource> egressVpnSiteLinkConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().egressVpnSiteLinkConnections();
    }

    /**
     * Get the ingressVpnSiteLinkConnections property: List of ingress VpnSiteLinkConnections.
     *
     * @return the ingressVpnSiteLinkConnections value.
     */
    public List<SubResource> ingressVpnSiteLinkConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().ingressVpnSiteLinkConnections();
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
