// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.GatewayCustomBgpIpAddressIpConfiguration;
import com.azure.resourcemanager.network.models.IpsecPolicy;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.TrafficSelectorPolicy;
import com.azure.resourcemanager.network.models.TunnelConnectionHealth;
import com.azure.resourcemanager.network.models.VirtualNetworkConnectionGatewayReference;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionMode;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionStatus;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** A common class for general resource information. */
@Fluent
public final class VirtualNetworkGatewayConnectionListEntityInner extends Resource {
    /*
     * Properties of the virtual network gateway connection.
     */
    @JsonProperty(value = "properties", required = true)
    private VirtualNetworkGatewayConnectionListEntityPropertiesFormat innerProperties =
        new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the virtual network gateway connection.
     *
     * @return the innerProperties value.
     */
    private VirtualNetworkGatewayConnectionListEntityPropertiesFormat innerProperties() {
        return this.innerProperties;
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
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkGatewayConnectionListEntityInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public VirtualNetworkGatewayConnectionListEntityInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the authorizationKey property: The authorizationKey.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationKey();
    }

    /**
     * Set the authorizationKey property: The authorizationKey.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withAuthorizationKey(String authorizationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withAuthorizationKey(authorizationKey);
        return this;
    }

    /**
     * Get the virtualNetworkGateway1 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway1 value.
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway1() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkGateway1();
    }

    /**
     * Set the virtualNetworkGateway1 property: The reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway1 the virtualNetworkGateway1 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withVirtualNetworkGateway1(
        VirtualNetworkConnectionGatewayReference virtualNetworkGateway1) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withVirtualNetworkGateway1(virtualNetworkGateway1);
        return this;
    }

    /**
     * Get the virtualNetworkGateway2 property: The reference to virtual network gateway resource.
     *
     * @return the virtualNetworkGateway2 value.
     */
    public VirtualNetworkConnectionGatewayReference virtualNetworkGateway2() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkGateway2();
    }

    /**
     * Set the virtualNetworkGateway2 property: The reference to virtual network gateway resource.
     *
     * @param virtualNetworkGateway2 the virtualNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withVirtualNetworkGateway2(
        VirtualNetworkConnectionGatewayReference virtualNetworkGateway2) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withVirtualNetworkGateway2(virtualNetworkGateway2);
        return this;
    }

    /**
     * Get the localNetworkGateway2 property: The reference to local network gateway resource.
     *
     * @return the localNetworkGateway2 value.
     */
    public VirtualNetworkConnectionGatewayReference localNetworkGateway2() {
        return this.innerProperties() == null ? null : this.innerProperties().localNetworkGateway2();
    }

    /**
     * Set the localNetworkGateway2 property: The reference to local network gateway resource.
     *
     * @param localNetworkGateway2 the localNetworkGateway2 value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withLocalNetworkGateway2(
        VirtualNetworkConnectionGatewayReference localNetworkGateway2) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withLocalNetworkGateway2(localNetworkGateway2);
        return this;
    }

    /**
     * Get the connectionType property: Gateway connection type.
     *
     * @return the connectionType value.
     */
    public VirtualNetworkGatewayConnectionType connectionType() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionType();
    }

    /**
     * Set the connectionType property: Gateway connection type.
     *
     * @param connectionType the connectionType value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withConnectionType(
        VirtualNetworkGatewayConnectionType connectionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withConnectionType(connectionType);
        return this;
    }

    /**
     * Get the connectionProtocol property: Connection protocol used for this connection.
     *
     * @return the connectionProtocol value.
     */
    public VirtualNetworkGatewayConnectionProtocol connectionProtocol() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionProtocol();
    }

    /**
     * Set the connectionProtocol property: Connection protocol used for this connection.
     *
     * @param connectionProtocol the connectionProtocol value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withConnectionProtocol(
        VirtualNetworkGatewayConnectionProtocol connectionProtocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withConnectionProtocol(connectionProtocol);
        return this;
    }

    /**
     * Get the routingWeight property: The routing weight.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.innerProperties() == null ? null : this.innerProperties().routingWeight();
    }

    /**
     * Set the routingWeight property: The routing weight.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withRoutingWeight(Integer routingWeight) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withRoutingWeight(routingWeight);
        return this;
    }

    /**
     * Get the connectionMode property: The connection mode for this connection.
     *
     * @return the connectionMode value.
     */
    public VirtualNetworkGatewayConnectionMode connectionMode() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionMode();
    }

    /**
     * Set the connectionMode property: The connection mode for this connection.
     *
     * @param connectionMode the connectionMode value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withConnectionMode(
        VirtualNetworkGatewayConnectionMode connectionMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withConnectionMode(connectionMode);
        return this;
    }

    /**
     * Get the sharedKey property: The IPSec shared key.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedKey();
    }

    /**
     * Set the sharedKey property: The IPSec shared key.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withSharedKey(String sharedKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withSharedKey(sharedKey);
        return this;
    }

    /**
     * Get the connectionStatus property: Virtual Network Gateway connection status.
     *
     * @return the connectionStatus value.
     */
    public VirtualNetworkGatewayConnectionStatus connectionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionStatus();
    }

    /**
     * Get the tunnelConnectionStatus property: Collection of all tunnels' connection health status.
     *
     * @return the tunnelConnectionStatus value.
     */
    public List<TunnelConnectionHealth> tunnelConnectionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().tunnelConnectionStatus();
    }

    /**
     * Get the egressBytesTransferred property: The egress bytes transferred in this connection.
     *
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().egressBytesTransferred();
    }

    /**
     * Get the ingressBytesTransferred property: The ingress bytes transferred in this connection.
     *
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().ingressBytesTransferred();
    }

    /**
     * Get the peer property: The reference to peerings resource.
     *
     * @return the peer value.
     */
    public SubResource peer() {
        return this.innerProperties() == null ? null : this.innerProperties().peer();
    }

    /**
     * Set the peer property: The reference to peerings resource.
     *
     * @param peer the peer value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withPeer(SubResource peer) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withPeer(peer);
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     *
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.innerProperties() == null ? null : this.innerProperties().enableBgp();
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     *
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withEnableBgp(Boolean enableBgp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withEnableBgp(enableBgp);
        return this;
    }

    /**
     * Get the gatewayCustomBgpIpAddresses property: GatewayCustomBgpIpAddresses to be used for virtual network gateway
     * Connection.
     *
     * @return the gatewayCustomBgpIpAddresses value.
     */
    public List<GatewayCustomBgpIpAddressIpConfiguration> gatewayCustomBgpIpAddresses() {
        return this.innerProperties() == null ? null : this.innerProperties().gatewayCustomBgpIpAddresses();
    }

    /**
     * Set the gatewayCustomBgpIpAddresses property: GatewayCustomBgpIpAddresses to be used for virtual network gateway
     * Connection.
     *
     * @param gatewayCustomBgpIpAddresses the gatewayCustomBgpIpAddresses value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withGatewayCustomBgpIpAddresses(
        List<GatewayCustomBgpIpAddressIpConfiguration> gatewayCustomBgpIpAddresses) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withGatewayCustomBgpIpAddresses(gatewayCustomBgpIpAddresses);
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @return the usePolicyBasedTrafficSelectors value.
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.innerProperties() == null ? null : this.innerProperties().usePolicyBasedTrafficSelectors();
    }

    /**
     * Set the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     *
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withUsePolicyBasedTrafficSelectors(
        Boolean usePolicyBasedTrafficSelectors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withUsePolicyBasedTrafficSelectors(usePolicyBasedTrafficSelectors);
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().ipsecPolicies();
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     *
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withIpsecPolicies(ipsecPolicies);
        return this;
    }

    /**
     * Get the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @return the trafficSelectorPolicies value.
     */
    public List<TrafficSelectorPolicy> trafficSelectorPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().trafficSelectorPolicies();
    }

    /**
     * Set the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     *
     * @param trafficSelectorPolicies the trafficSelectorPolicies value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withTrafficSelectorPolicies(
        List<TrafficSelectorPolicy> trafficSelectorPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withTrafficSelectorPolicies(trafficSelectorPolicies);
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network gateway connection resource.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().resourceGuid();
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway for data forwarding.
     *
     * @return the expressRouteGatewayBypass value.
     */
    public Boolean expressRouteGatewayBypass() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteGatewayBypass();
    }

    /**
     * Set the expressRouteGatewayBypass property: Bypass ExpressRoute Gateway for data forwarding.
     *
     * @param expressRouteGatewayBypass the expressRouteGatewayBypass value to set.
     * @return the VirtualNetworkGatewayConnectionListEntityInner object itself.
     */
    public VirtualNetworkGatewayConnectionListEntityInner withExpressRouteGatewayBypass(
        Boolean expressRouteGatewayBypass) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualNetworkGatewayConnectionListEntityPropertiesFormat();
        }
        this.innerProperties().withExpressRouteGatewayBypass(expressRouteGatewayBypass);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model"
                            + " VirtualNetworkGatewayConnectionListEntityInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkGatewayConnectionListEntityInner.class);
}
