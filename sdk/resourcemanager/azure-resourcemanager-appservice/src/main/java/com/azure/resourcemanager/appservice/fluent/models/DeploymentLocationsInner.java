// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.appservice.models.HostingEnvironmentDeploymentInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of available locations (regions or App Service Environments) for deployment of App Service resources. */
@Fluent
public final class DeploymentLocationsInner {
    /*
     * Available regions.
     */
    @JsonProperty(value = "locations")
    private List<GeoRegionInner> locations;

    /*
     * Available App Service Environments with full descriptions of the
     * environments.
     */
    @JsonProperty(value = "hostingEnvironments")
    private List<AppServiceEnvironment> hostingEnvironments;

    /*
     * Available App Service Environments with basic information.
     */
    @JsonProperty(value = "hostingEnvironmentDeploymentInfos")
    private List<HostingEnvironmentDeploymentInfo> hostingEnvironmentDeploymentInfos;

    /**
     * Get the locations property: Available regions.
     *
     * @return the locations value.
     */
    public List<GeoRegionInner> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: Available regions.
     *
     * @param locations the locations value to set.
     * @return the DeploymentLocationsInner object itself.
     */
    public DeploymentLocationsInner withLocations(List<GeoRegionInner> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the hostingEnvironments property: Available App Service Environments with full descriptions of the
     * environments.
     *
     * @return the hostingEnvironments value.
     */
    public List<AppServiceEnvironment> hostingEnvironments() {
        return this.hostingEnvironments;
    }

    /**
     * Set the hostingEnvironments property: Available App Service Environments with full descriptions of the
     * environments.
     *
     * @param hostingEnvironments the hostingEnvironments value to set.
     * @return the DeploymentLocationsInner object itself.
     */
    public DeploymentLocationsInner withHostingEnvironments(List<AppServiceEnvironment> hostingEnvironments) {
        this.hostingEnvironments = hostingEnvironments;
        return this;
    }

    /**
     * Get the hostingEnvironmentDeploymentInfos property: Available App Service Environments with basic information.
     *
     * @return the hostingEnvironmentDeploymentInfos value.
     */
    public List<HostingEnvironmentDeploymentInfo> hostingEnvironmentDeploymentInfos() {
        return this.hostingEnvironmentDeploymentInfos;
    }

    /**
     * Set the hostingEnvironmentDeploymentInfos property: Available App Service Environments with basic information.
     *
     * @param hostingEnvironmentDeploymentInfos the hostingEnvironmentDeploymentInfos value to set.
     * @return the DeploymentLocationsInner object itself.
     */
    public DeploymentLocationsInner withHostingEnvironmentDeploymentInfos(
        List<HostingEnvironmentDeploymentInfo> hostingEnvironmentDeploymentInfos) {
        this.hostingEnvironmentDeploymentInfos = hostingEnvironmentDeploymentInfos;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
        if (hostingEnvironments() != null) {
            hostingEnvironments().forEach(e -> e.validate());
        }
        if (hostingEnvironmentDeploymentInfos() != null) {
            hostingEnvironmentDeploymentInfos().forEach(e -> e.validate());
        }
    }
}
