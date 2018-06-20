/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The workflow parameters.
 */
public class WorkflowParameter {
    /**
     * The type. Possible values include: 'NotSpecified', 'String',
     * 'SecureString', 'Int', 'Float', 'Bool', 'Array', 'Object',
     * 'SecureObject'.
     */
    @JsonProperty(value = "type")
    private ParameterType type;

    /**
     * The value.
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * The metadata.
     */
    @JsonProperty(value = "metadata")
    private Object metadata;

    /**
     * The description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the type. Possible values include: 'NotSpecified', 'String', 'SecureString', 'Int', 'Float', 'Bool', 'Array', 'Object', 'SecureObject'.
     *
     * @return the type value
     */
    public ParameterType type() {
        return this.type;
    }

    /**
     * Set the type. Possible values include: 'NotSpecified', 'String', 'SecureString', 'Int', 'Float', 'Bool', 'Array', 'Object', 'SecureObject'.
     *
     * @param type the type value to set
     * @return the WorkflowParameter object itself.
     */
    public WorkflowParameter withType(ParameterType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value.
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set the value.
     *
     * @param value the value value to set
     * @return the WorkflowParameter object itself.
     */
    public WorkflowParameter withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get the metadata.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata.
     *
     * @param metadata the metadata value to set
     * @return the WorkflowParameter object itself.
     */
    public WorkflowParameter withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description.
     *
     * @param description the description value to set
     * @return the WorkflowParameter object itself.
     */
    public WorkflowParameter withDescription(String description) {
        this.description = description;
        return this;
    }

}
