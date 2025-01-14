// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Specification of which command to run where. */
@Fluent
public final class CommandPostBody {
    /*
     * The command which should be run
     */
    @JsonProperty(value = "command", required = true)
    private String command;

    /*
     * The arguments for the command to be run
     */
    @JsonProperty(value = "arguments")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> arguments;

    /*
     * IP address of the cassandra host to run the command on
     */
    @JsonProperty(value = "host", required = true)
    private String host;

    /*
     * If true, stops cassandra before executing the command and then start it
     * again
     */
    @JsonProperty(value = "cassandra-stop-start")
    private Boolean cassandraStopStart;

    /*
     * If true, allows the command to *write* to the cassandra directory,
     * otherwise read-only.
     */
    @JsonProperty(value = "readwrite")
    private Boolean readwrite;

    /**
     * Get the command property: The command which should be run.
     *
     * @return the command value.
     */
    public String command() {
        return this.command;
    }

    /**
     * Set the command property: The command which should be run.
     *
     * @param command the command value to set.
     * @return the CommandPostBody object itself.
     */
    public CommandPostBody withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * Get the arguments property: The arguments for the command to be run.
     *
     * @return the arguments value.
     */
    public Map<String, String> arguments() {
        return this.arguments;
    }

    /**
     * Set the arguments property: The arguments for the command to be run.
     *
     * @param arguments the arguments value to set.
     * @return the CommandPostBody object itself.
     */
    public CommandPostBody withArguments(Map<String, String> arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * Get the host property: IP address of the cassandra host to run the command on.
     *
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host property: IP address of the cassandra host to run the command on.
     *
     * @param host the host value to set.
     * @return the CommandPostBody object itself.
     */
    public CommandPostBody withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the cassandraStopStart property: If true, stops cassandra before executing the command and then start it
     * again.
     *
     * @return the cassandraStopStart value.
     */
    public Boolean cassandraStopStart() {
        return this.cassandraStopStart;
    }

    /**
     * Set the cassandraStopStart property: If true, stops cassandra before executing the command and then start it
     * again.
     *
     * @param cassandraStopStart the cassandraStopStart value to set.
     * @return the CommandPostBody object itself.
     */
    public CommandPostBody withCassandraStopStart(Boolean cassandraStopStart) {
        this.cassandraStopStart = cassandraStopStart;
        return this;
    }

    /**
     * Get the readwrite property: If true, allows the command to *write* to the cassandra directory, otherwise
     * read-only.
     *
     * @return the readwrite value.
     */
    public Boolean readwrite() {
        return this.readwrite;
    }

    /**
     * Set the readwrite property: If true, allows the command to *write* to the cassandra directory, otherwise
     * read-only.
     *
     * @param readwrite the readwrite value to set.
     * @return the CommandPostBody object itself.
     */
    public CommandPostBody withReadwrite(Boolean readwrite) {
        this.readwrite = readwrite;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (command() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property command in model CommandPostBody"));
        }
        if (host() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property host in model CommandPostBody"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CommandPostBody.class);
}
