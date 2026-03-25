package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * A hosted compute network settings resource.
 */
@Schema(name = "network-settings", description = "A hosted compute network settings resource.")
@JsonTypeName("network-settings")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NetworkSettings {

    private String id;

    private String networkConfigurationId;

    private String name;

    private String subnetId;

    private String region;

    public NetworkSettings() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NetworkSettings(String id, String name, String subnetId, String region) {
        this.id = id;
        this.name = name;
        this.subnetId = subnetId;
        this.region = region;
    }

    public NetworkSettings id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the network settings resource.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "220F78DACB92BBFBC5E6F22DE1CCF52309D",
            description = "The unique identifier of the network settings resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NetworkSettings networkConfigurationId(String networkConfigurationId) {
        this.networkConfigurationId = networkConfigurationId;
        return this;
    }

    /**
     * The identifier of the network configuration that is using this settings resource.
     * @return networkConfigurationId
     */
    @Schema(
            name = "network_configuration_id",
            example = "934E208B3EE0BD60CF5F752C426BFB53562",
            description = "The identifier of the network configuration that is using this settings resource.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("network_configuration_id")
    public String getNetworkConfigurationId() {
        return networkConfigurationId;
    }

    public void setNetworkConfigurationId(String networkConfigurationId) {
        this.networkConfigurationId = networkConfigurationId;
    }

    public NetworkSettings name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the network settings resource.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "my-network-settings",
            description = "The name of the network settings resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetworkSettings subnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * The subnet this network settings resource is configured for.
     * @return subnetId
     */
    @NotNull
    @Schema(
            name = "subnet_id",
            example =
                    "/subscriptions/14839728-3ad9-43ab-bd2b-fa6ad0f75e2a/resourceGroups/my-rg/providers/Microsoft.Network/virtualNetworks/my-vnet/subnets/my-subnet",
            description = "The subnet this network settings resource is configured for.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subnet_id")
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public NetworkSettings region(String region) {
        this.region = region;
        return this;
    }

    /**
     * The location of the subnet this network settings resource is configured for.
     * @return region
     */
    @NotNull
    @Schema(
            name = "region",
            example = "eastus",
            description = "The location of the subnet this network settings resource is configured for.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetworkSettings networkSettings = (NetworkSettings) o;
        return Objects.equals(this.id, networkSettings.id)
                && Objects.equals(this.networkConfigurationId, networkSettings.networkConfigurationId)
                && Objects.equals(this.name, networkSettings.name)
                && Objects.equals(this.subnetId, networkSettings.subnetId)
                && Objects.equals(this.region, networkSettings.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, networkConfigurationId, name, subnetId, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkSettings {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    networkConfigurationId: ")
                .append(toIndentedString(networkConfigurationId))
                .append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
