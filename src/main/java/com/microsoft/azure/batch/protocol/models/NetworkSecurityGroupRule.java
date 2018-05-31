/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A network security group rule to apply to an inbound endpoint.
 */
public class NetworkSecurityGroupRule {
    /**
     * The priority for this rule.
     * Priorities within a pool must be unique and are evaluated in order of
     * priority. The lower the number the higher the priority. For example,
     * rules could be specified with order numbers of 150, 250, and 350. The
     * rule with the order number of 150 takes precedence over the rule that
     * has an order of 250. Allowed priorities are 150 to 3500. If any reserved
     * or duplicate values are provided the request fails with HTTP status code
     * 400.
     */
    @JsonProperty(value = "priority", required = true)
    private int priority;

    /**
     * The action that should be taken for a specified IP address, subnet range
     * or tag.
     * Possible values include: 'allow', 'deny'.
     */
    @JsonProperty(value = "access", required = true)
    private NetworkSecurityGroupRuleAccess access;

    /**
     * The source address prefix or tag to match for the rule.
     * Valid values are a single IP address (i.e. 10.10.10.10), IP subnet (i.e.
     * 192.168.1.0/24), default tag, or * (for all addresses).  If any other
     * values are provided the request fails with HTTP status code 400.
     */
    @JsonProperty(value = "sourceAddressPrefix", required = true)
    private String sourceAddressPrefix;

    /**
     * Get the priority value.
     *
     * @return the priority value
     */
    public int priority() {
        return this.priority;
    }

    /**
     * Set the priority value.
     *
     * @param priority the priority value to set
     * @return the NetworkSecurityGroupRule object itself.
     */
    public NetworkSecurityGroupRule withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the access value.
     *
     * @return the access value
     */
    public NetworkSecurityGroupRuleAccess access() {
        return this.access;
    }

    /**
     * Set the access value.
     *
     * @param access the access value to set
     * @return the NetworkSecurityGroupRule object itself.
     */
    public NetworkSecurityGroupRule withAccess(NetworkSecurityGroupRuleAccess access) {
        this.access = access;
        return this;
    }

    /**
     * Get the sourceAddressPrefix value.
     *
     * @return the sourceAddressPrefix value
     */
    public String sourceAddressPrefix() {
        return this.sourceAddressPrefix;
    }

    /**
     * Set the sourceAddressPrefix value.
     *
     * @param sourceAddressPrefix the sourceAddressPrefix value to set
     * @return the NetworkSecurityGroupRule object itself.
     */
    public NetworkSecurityGroupRule withSourceAddressPrefix(String sourceAddressPrefix) {
        this.sourceAddressPrefix = sourceAddressPrefix;
        return this;
    }

}