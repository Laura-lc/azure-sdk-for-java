/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of an add vCenter request.
 */
public class AddVCenterRequestProperties {
    /**
     * The friendly name of the vCenter.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /**
     * The IP address of the vCenter to be discovered.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /**
     * The process server Id from where the discovery is orchestrated.
     */
    @JsonProperty(value = "processServerId")
    private String processServerId;

    /**
     * The port number for discovery.
     */
    @JsonProperty(value = "port")
    private String port;

    /**
     * The account Id which has privileges to discover the vCenter.
     */
    @JsonProperty(value = "runAsAccountId")
    private String runAsAccountId;

    /**
     * Get the friendly name of the vCenter.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendly name of the vCenter.
     *
     * @param friendlyName the friendlyName value to set
     * @return the AddVCenterRequestProperties object itself.
     */
    public AddVCenterRequestProperties withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the IP address of the vCenter to be discovered.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the IP address of the vCenter to be discovered.
     *
     * @param ipAddress the ipAddress value to set
     * @return the AddVCenterRequestProperties object itself.
     */
    public AddVCenterRequestProperties withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the process server Id from where the discovery is orchestrated.
     *
     * @return the processServerId value
     */
    public String processServerId() {
        return this.processServerId;
    }

    /**
     * Set the process server Id from where the discovery is orchestrated.
     *
     * @param processServerId the processServerId value to set
     * @return the AddVCenterRequestProperties object itself.
     */
    public AddVCenterRequestProperties withProcessServerId(String processServerId) {
        this.processServerId = processServerId;
        return this;
    }

    /**
     * Get the port number for discovery.
     *
     * @return the port value
     */
    public String port() {
        return this.port;
    }

    /**
     * Set the port number for discovery.
     *
     * @param port the port value to set
     * @return the AddVCenterRequestProperties object itself.
     */
    public AddVCenterRequestProperties withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * Get the account Id which has privileges to discover the vCenter.
     *
     * @return the runAsAccountId value
     */
    public String runAsAccountId() {
        return this.runAsAccountId;
    }

    /**
     * Set the account Id which has privileges to discover the vCenter.
     *
     * @param runAsAccountId the runAsAccountId value to set
     * @return the AddVCenterRequestProperties object itself.
     */
    public AddVCenterRequestProperties withRunAsAccountId(String runAsAccountId) {
        this.runAsAccountId = runAsAccountId;
        return this;
    }

}
