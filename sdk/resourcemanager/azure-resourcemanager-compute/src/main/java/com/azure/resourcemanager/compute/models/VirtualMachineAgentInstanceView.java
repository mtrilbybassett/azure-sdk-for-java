// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The instance view of the VM Agent running on the virtual machine. */
@Fluent
public final class VirtualMachineAgentInstanceView {
    /*
     * The VM Agent full version.
     */
    @JsonProperty(value = "vmAgentVersion")
    private String vmAgentVersion;

    /*
     * The virtual machine extension handler instance view.
     */
    @JsonProperty(value = "extensionHandlers")
    private List<VirtualMachineExtensionHandlerInstanceView> extensionHandlers;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get the vmAgentVersion property: The VM Agent full version.
     *
     * @return the vmAgentVersion value.
     */
    public String vmAgentVersion() {
        return this.vmAgentVersion;
    }

    /**
     * Set the vmAgentVersion property: The VM Agent full version.
     *
     * @param vmAgentVersion the vmAgentVersion value to set.
     * @return the VirtualMachineAgentInstanceView object itself.
     */
    public VirtualMachineAgentInstanceView withVmAgentVersion(String vmAgentVersion) {
        this.vmAgentVersion = vmAgentVersion;
        return this;
    }

    /**
     * Get the extensionHandlers property: The virtual machine extension handler instance view.
     *
     * @return the extensionHandlers value.
     */
    public List<VirtualMachineExtensionHandlerInstanceView> extensionHandlers() {
        return this.extensionHandlers;
    }

    /**
     * Set the extensionHandlers property: The virtual machine extension handler instance view.
     *
     * @param extensionHandlers the extensionHandlers value to set.
     * @return the VirtualMachineAgentInstanceView object itself.
     */
    public VirtualMachineAgentInstanceView withExtensionHandlers(
        List<VirtualMachineExtensionHandlerInstanceView> extensionHandlers) {
        this.extensionHandlers = extensionHandlers;
        return this;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses property: The resource status information.
     *
     * @param statuses the statuses value to set.
     * @return the VirtualMachineAgentInstanceView object itself.
     */
    public VirtualMachineAgentInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (extensionHandlers() != null) {
            extensionHandlers().forEach(e -> e.validate());
        }
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
