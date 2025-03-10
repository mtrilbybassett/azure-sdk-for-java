// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The error object. */
@Fluent
public final class PersonalizerError {
    /*
     * Error Codes returned by Personalizer
     */
    @JsonProperty(value = "code", required = true)
    private PersonalizerErrorCode code;

    /*
     * A message explaining the error reported by the service.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Error source element.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * An array of details about specific errors that led to this reported
     * error.
     */
    @JsonProperty(value = "details")
    private List<PersonalizerError> details;

    /*
     * An object containing more specific information than the parent object
     * about the error.
     */
    @JsonProperty(value = "innerError")
    private InternalError innerError;

    /**
     * Get the code property: Error Codes returned by Personalizer.
     *
     * @return the code value.
     */
    public PersonalizerErrorCode getCode() {
        return this.code;
    }

    /**
     * Set the code property: Error Codes returned by Personalizer.
     *
     * @param code the code value to set.
     * @return the PersonalizerError object itself.
     */
    public PersonalizerError setCode(PersonalizerErrorCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: A message explaining the error reported by the service.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: A message explaining the error reported by the service.
     *
     * @param message the message value to set.
     * @return the PersonalizerError object itself.
     */
    public PersonalizerError setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the target property: Error source element.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Error source element.
     *
     * @param target the target value to set.
     * @return the PersonalizerError object itself.
     */
    public PersonalizerError setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the details property: An array of details about specific errors that led to this reported error.
     *
     * @return the details value.
     */
    public List<PersonalizerError> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: An array of details about specific errors that led to this reported error.
     *
     * @param details the details value to set.
     * @return the PersonalizerError object itself.
     */
    public PersonalizerError setDetails(List<PersonalizerError> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the innerError property: An object containing more specific information than the parent object about the
     * error.
     *
     * @return the innerError value.
     */
    public InternalError getInnerError() {
        return this.innerError;
    }

    /**
     * Set the innerError property: An object containing more specific information than the parent object about the
     * error.
     *
     * @param innerError the innerError value to set.
     * @return the PersonalizerError object itself.
     */
    public PersonalizerError setInnerError(InternalError innerError) {
        this.innerError = innerError;
        return this;
    }
}
