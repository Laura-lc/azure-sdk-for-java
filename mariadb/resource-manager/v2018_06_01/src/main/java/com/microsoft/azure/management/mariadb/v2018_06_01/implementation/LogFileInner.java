/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Represents a log file.
 */
@JsonFlatten
public class LogFileInner extends ProxyResource {
    /**
     * Size of the log file.
     */
    @JsonProperty(value = "properties.sizeInKB")
    private Long sizeInKB;

    /**
     * Creation timestamp of the log file.
     */
    @JsonProperty(value = "properties.createdTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createdTime;

    /**
     * Last modified timestamp of the log file.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastModifiedTime;

    /**
     * Type of the log file.
     */
    @JsonProperty(value = "properties.type")
    private String logFileType;

    /**
     * The url to download the log file from.
     */
    @JsonProperty(value = "properties.url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /**
     * Get size of the log file.
     *
     * @return the sizeInKB value
     */
    public Long sizeInKB() {
        return this.sizeInKB;
    }

    /**
     * Set size of the log file.
     *
     * @param sizeInKB the sizeInKB value to set
     * @return the LogFileInner object itself.
     */
    public LogFileInner withSizeInKB(Long sizeInKB) {
        this.sizeInKB = sizeInKB;
        return this;
    }

    /**
     * Get creation timestamp of the log file.
     *
     * @return the createdTime value
     */
    public DateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get last modified timestamp of the log file.
     *
     * @return the lastModifiedTime value
     */
    public DateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get type of the log file.
     *
     * @return the logFileType value
     */
    public String logFileType() {
        return this.logFileType;
    }

    /**
     * Set type of the log file.
     *
     * @param logFileType the logFileType value to set
     * @return the LogFileInner object itself.
     */
    public LogFileInner withLogFileType(String logFileType) {
        this.logFileType = logFileType;
        return this;
    }

    /**
     * Get the url to download the log file from.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

}