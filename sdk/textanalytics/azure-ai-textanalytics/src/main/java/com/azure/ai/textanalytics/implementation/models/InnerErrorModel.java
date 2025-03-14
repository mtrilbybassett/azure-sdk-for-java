// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * An object containing more specific information about the error. As per Microsoft One API guidelines -
 * https://github.com/Microsoft/api-guidelines/blob/vNext/Guidelines.md#7102-error-condition-responses.
 */
@Fluent
public final class InnerErrorModel {
    /*
     * One of a server-defined set of error codes.
     */
    @JsonProperty(value = "code", required = true)
    private InnerErrorCode code;

    /*
     * Error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /*
     * Error details.
     */
    @JsonProperty(value = "details")
    private Map<String, String> details;

    /*
     * Error target.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * An object containing more specific information than the current object
     * about the error.
     */
    @JsonProperty(value = "innererror")
    private InnerErrorModel innererror;

    /**
     * Get the code property: One of a server-defined set of error codes.
     *
     * @return the code value.
     */
    public InnerErrorCode getCode() {
        return this.code;
    }

    /**
     * Set the code property: One of a server-defined set of error codes.
     *
     * @param code the code value to set.
     * @return the InnerErrorModel object itself.
     */
    public InnerErrorModel setCode(InnerErrorCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get the message property: Error message.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Error message.
     *
     * @param message the message value to set.
     * @return the InnerErrorModel object itself.
     */
    public InnerErrorModel setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the details property: Error details.
     *
     * @return the details value.
     */
    public Map<String, String> getDetails() {
        return this.details;
    }

    /**
     * Set the details property: Error details.
     *
     * @param details the details value to set.
     * @return the InnerErrorModel object itself.
     */
    public InnerErrorModel setDetails(Map<String, String> details) {
        this.details = details;
        return this;
    }

    /**
     * Get the target property: Error target.
     *
     * @return the target value.
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * Set the target property: Error target.
     *
     * @param target the target value to set.
     * @return the InnerErrorModel object itself.
     */
    public InnerErrorModel setTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the innererror property: An object containing more specific information than the current object about the
     * error.
     *
     * @return the innererror value.
     */
    public InnerErrorModel getInnererror() {
        return this.innererror;
    }

    /**
     * Set the innererror property: An object containing more specific information than the current object about the
     * error.
     *
     * @param innererror the innererror value to set.
     * @return the InnerErrorModel object itself.
     */
    public InnerErrorModel setInnererror(InnerErrorModel innererror) {
        this.innererror = innererror;
        return this;
    }
}
