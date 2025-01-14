// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The endpoint configuration for a pool. */
@Fluent
public final class PoolEndpointConfiguration {
    /*
     * A list of inbound NAT pools that can be used to address specific ports
     * on an individual compute node externally. The maximum number of inbound
     * NAT pools per Batch pool is 5. If the maximum number of inbound NAT
     * pools is exceeded the request fails with HTTP status code 400. This
     * cannot be specified if the IPAddressProvisioningType is
     * NoPublicIPAddresses.
     */
    @JsonProperty(value = "inboundNatPools", required = true)
    private List<InboundNatPool> inboundNatPools;

    /**
     * Get the inboundNatPools property: A list of inbound NAT pools that can be used to address specific ports on an
     * individual compute node externally. The maximum number of inbound NAT pools per Batch pool is 5. If the maximum
     * number of inbound NAT pools is exceeded the request fails with HTTP status code 400. This cannot be specified if
     * the IPAddressProvisioningType is NoPublicIPAddresses.
     *
     * @return the inboundNatPools value.
     */
    public List<InboundNatPool> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * Set the inboundNatPools property: A list of inbound NAT pools that can be used to address specific ports on an
     * individual compute node externally. The maximum number of inbound NAT pools per Batch pool is 5. If the maximum
     * number of inbound NAT pools is exceeded the request fails with HTTP status code 400. This cannot be specified if
     * the IPAddressProvisioningType is NoPublicIPAddresses.
     *
     * @param inboundNatPools the inboundNatPools value to set.
     * @return the PoolEndpointConfiguration object itself.
     */
    public PoolEndpointConfiguration withInboundNatPools(List<InboundNatPool> inboundNatPools) {
        this.inboundNatPools = inboundNatPools;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (inboundNatPools() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property inboundNatPools in model PoolEndpointConfiguration"));
        } else {
            inboundNatPools().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PoolEndpointConfiguration.class);
}
