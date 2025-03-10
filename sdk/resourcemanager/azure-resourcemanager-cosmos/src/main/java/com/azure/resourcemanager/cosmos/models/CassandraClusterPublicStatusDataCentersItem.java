// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CassandraClusterPublicStatusDataCentersItem model. */
@Fluent
public final class CassandraClusterPublicStatusDataCentersItem {
    /*
     * The name of this Datacenter.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A list of all seed nodes in the cluster, managed and unmanaged.
     */
    @JsonProperty(value = "seedNodes")
    private List<String> seedNodes;

    /*
     * The nodes property.
     */
    @JsonProperty(value = "nodes")
    private List<ComponentsM9L909SchemasCassandraclusterpublicstatusPropertiesDatacentersItemsPropertiesNodesItems>
        nodes;

    /**
     * Get the name property: The name of this Datacenter.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of this Datacenter.
     *
     * @param name the name value to set.
     * @return the CassandraClusterPublicStatusDataCentersItem object itself.
     */
    public CassandraClusterPublicStatusDataCentersItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the seedNodes property: A list of all seed nodes in the cluster, managed and unmanaged.
     *
     * @return the seedNodes value.
     */
    public List<String> seedNodes() {
        return this.seedNodes;
    }

    /**
     * Set the seedNodes property: A list of all seed nodes in the cluster, managed and unmanaged.
     *
     * @param seedNodes the seedNodes value to set.
     * @return the CassandraClusterPublicStatusDataCentersItem object itself.
     */
    public CassandraClusterPublicStatusDataCentersItem withSeedNodes(List<String> seedNodes) {
        this.seedNodes = seedNodes;
        return this;
    }

    /**
     * Get the nodes property: The nodes property.
     *
     * @return the nodes value.
     */
    public List<ComponentsM9L909SchemasCassandraclusterpublicstatusPropertiesDatacentersItemsPropertiesNodesItems>
        nodes() {
        return this.nodes;
    }

    /**
     * Set the nodes property: The nodes property.
     *
     * @param nodes the nodes value to set.
     * @return the CassandraClusterPublicStatusDataCentersItem object itself.
     */
    public CassandraClusterPublicStatusDataCentersItem withNodes(
        List<ComponentsM9L909SchemasCassandraclusterpublicstatusPropertiesDatacentersItemsPropertiesNodesItems> nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodes() != null) {
            nodes().forEach(e -> e.validate());
        }
    }
}
