package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A hosted compute network configuration.
 */
@Schema(name = "network-configuration", description = "A hosted compute network configuration.")
@JsonTypeName("network-configuration")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NetworkConfiguration {

    private String id;

    private String name;

    /**
     * The hosted compute service the network configuration supports.
     */
    public enum ComputeServiceEnum {
        NONE("none"),

        ACTIONS("actions"),

        CODESPACES("codespaces");

        private final String value;

        ComputeServiceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ComputeServiceEnum fromValue(String value) {
            for (ComputeServiceEnum b : ComputeServiceEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ComputeServiceEnum computeService;

    @Valid
    private List<String> networkSettingsIds = new ArrayList<>();

    @Valid
    private List<String> failoverNetworkSettingsIds = new ArrayList<>();

    private Boolean failoverNetworkEnabled;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdOn = null;

    public NetworkConfiguration() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NetworkConfiguration(String id, String name, OffsetDateTime createdOn) {
        this.id = id;
        this.name = name;
        this.createdOn = createdOn;
    }

    public NetworkConfiguration id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the network configuration.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "123ABC456DEF789",
            description = "The unique identifier of the network configuration.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NetworkConfiguration name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the network configuration.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "my-network-configuration",
            description = "The name of the network configuration.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetworkConfiguration computeService(ComputeServiceEnum computeService) {
        this.computeService = computeService;
        return this;
    }

    /**
     * The hosted compute service the network configuration supports.
     * @return computeService
     */
    @Schema(
            name = "compute_service",
            description = "The hosted compute service the network configuration supports.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("compute_service")
    public ComputeServiceEnum getComputeService() {
        return computeService;
    }

    public void setComputeService(ComputeServiceEnum computeService) {
        this.computeService = computeService;
    }

    public NetworkConfiguration networkSettingsIds(List<String> networkSettingsIds) {
        this.networkSettingsIds = networkSettingsIds;
        return this;
    }

    public NetworkConfiguration addNetworkSettingsIdsItem(String networkSettingsIdsItem) {
        if (this.networkSettingsIds == null) {
            this.networkSettingsIds = new ArrayList<>();
        }
        this.networkSettingsIds.add(networkSettingsIdsItem);
        return this;
    }

    /**
     * The unique identifier of each network settings in the configuration.
     * @return networkSettingsIds
     */
    @Schema(
            name = "network_settings_ids",
            example = "123ABC456DEF789",
            description = "The unique identifier of each network settings in the configuration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("network_settings_ids")
    public List<String> getNetworkSettingsIds() {
        return networkSettingsIds;
    }

    public void setNetworkSettingsIds(List<String> networkSettingsIds) {
        this.networkSettingsIds = networkSettingsIds;
    }

    public NetworkConfiguration failoverNetworkSettingsIds(List<String> failoverNetworkSettingsIds) {
        this.failoverNetworkSettingsIds = failoverNetworkSettingsIds;
        return this;
    }

    public NetworkConfiguration addFailoverNetworkSettingsIdsItem(String failoverNetworkSettingsIdsItem) {
        if (this.failoverNetworkSettingsIds == null) {
            this.failoverNetworkSettingsIds = new ArrayList<>();
        }
        this.failoverNetworkSettingsIds.add(failoverNetworkSettingsIdsItem);
        return this;
    }

    /**
     * The unique identifier of each failover network settings in the configuration.
     * @return failoverNetworkSettingsIds
     */
    @Schema(
            name = "failover_network_settings_ids",
            example = "123ABC456DEF789",
            description = "The unique identifier of each failover network settings in the configuration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("failover_network_settings_ids")
    public List<String> getFailoverNetworkSettingsIds() {
        return failoverNetworkSettingsIds;
    }

    public void setFailoverNetworkSettingsIds(List<String> failoverNetworkSettingsIds) {
        this.failoverNetworkSettingsIds = failoverNetworkSettingsIds;
    }

    public NetworkConfiguration failoverNetworkEnabled(Boolean failoverNetworkEnabled) {
        this.failoverNetworkEnabled = failoverNetworkEnabled;
        return this;
    }

    /**
     * Indicates whether the failover network resource is enabled.
     * @return failoverNetworkEnabled
     */
    @Schema(
            name = "failover_network_enabled",
            example = "true",
            description = "Indicates whether the failover network resource is enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("failover_network_enabled")
    public Boolean getFailoverNetworkEnabled() {
        return failoverNetworkEnabled;
    }

    public void setFailoverNetworkEnabled(Boolean failoverNetworkEnabled) {
        this.failoverNetworkEnabled = failoverNetworkEnabled;
    }

    public NetworkConfiguration createdOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    /**
     * The time at which the network configuration was created, in ISO 8601 format.
     * @return createdOn
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_on",
            example = "2024-04-26T11:31:07Z",
            description = "The time at which the network configuration was created, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_on")
    public OffsetDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(OffsetDateTime createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NetworkConfiguration networkConfiguration = (NetworkConfiguration) o;
        return Objects.equals(this.id, networkConfiguration.id)
                && Objects.equals(this.name, networkConfiguration.name)
                && Objects.equals(this.computeService, networkConfiguration.computeService)
                && Objects.equals(this.networkSettingsIds, networkConfiguration.networkSettingsIds)
                && Objects.equals(this.failoverNetworkSettingsIds, networkConfiguration.failoverNetworkSettingsIds)
                && Objects.equals(this.failoverNetworkEnabled, networkConfiguration.failoverNetworkEnabled)
                && Objects.equals(this.createdOn, networkConfiguration.createdOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                computeService,
                networkSettingsIds,
                failoverNetworkSettingsIds,
                failoverNetworkEnabled,
                createdOn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkConfiguration {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    computeService: ")
                .append(toIndentedString(computeService))
                .append("\n");
        sb.append("    networkSettingsIds: ")
                .append(toIndentedString(networkSettingsIds))
                .append("\n");
        sb.append("    failoverNetworkSettingsIds: ")
                .append(toIndentedString(failoverNetworkSettingsIds))
                .append("\n");
        sb.append("    failoverNetworkEnabled: ")
                .append(toIndentedString(failoverNetworkEnabled))
                .append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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
