package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HostedComputeCreateNetworkConfigurationForOrgRequest
 */
@JsonTypeName("hosted_compute_create_network_configuration_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class HostedComputeCreateNetworkConfigurationForOrgRequest {

    private String name;

    /**
     * The hosted compute service to use for the network configuration.
     */
    public enum ComputeServiceEnum {
        NONE("none"),

        ACTIONS("actions");

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

    public HostedComputeCreateNetworkConfigurationForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public HostedComputeCreateNetworkConfigurationForOrgRequest(String name, List<String> networkSettingsIds) {
        this.name = name;
        this.networkSettingsIds = networkSettingsIds;
    }

    public HostedComputeCreateNetworkConfigurationForOrgRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the network configuration. Must be between 1 and 100 characters and may only contain upper and lowercase letters a-z, numbers 0-9, '.', '-', and '_'.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description =
                    "Name of the network configuration. Must be between 1 and 100 characters and may only contain upper and lowercase letters a-z, numbers 0-9, '.', '-', and '_'.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HostedComputeCreateNetworkConfigurationForOrgRequest computeService(ComputeServiceEnum computeService) {
        this.computeService = computeService;
        return this;
    }

    /**
     * The hosted compute service to use for the network configuration.
     * @return computeService
     */
    @Schema(
            name = "compute_service",
            description = "The hosted compute service to use for the network configuration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("compute_service")
    public ComputeServiceEnum getComputeService() {
        return computeService;
    }

    public void setComputeService(ComputeServiceEnum computeService) {
        this.computeService = computeService;
    }

    public HostedComputeCreateNetworkConfigurationForOrgRequest networkSettingsIds(List<String> networkSettingsIds) {
        this.networkSettingsIds = networkSettingsIds;
        return this;
    }

    public HostedComputeCreateNetworkConfigurationForOrgRequest addNetworkSettingsIdsItem(
            String networkSettingsIdsItem) {
        if (this.networkSettingsIds == null) {
            this.networkSettingsIds = new ArrayList<>();
        }
        this.networkSettingsIds.add(networkSettingsIdsItem);
        return this;
    }

    /**
     * A list of identifiers of the network settings resources to use for the network configuration. Exactly one resource identifier must be specified in the list.
     * @return networkSettingsIds
     */
    @NotNull
    @Size(min = 1, max = 1)
    @Schema(
            name = "network_settings_ids",
            description =
                    "A list of identifiers of the network settings resources to use for the network configuration. Exactly one resource identifier must be specified in the list.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("network_settings_ids")
    public List<String> getNetworkSettingsIds() {
        return networkSettingsIds;
    }

    public void setNetworkSettingsIds(List<String> networkSettingsIds) {
        this.networkSettingsIds = networkSettingsIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedComputeCreateNetworkConfigurationForOrgRequest hostedComputeCreateNetworkConfigurationForOrgRequest =
                (HostedComputeCreateNetworkConfigurationForOrgRequest) o;
        return Objects.equals(this.name, hostedComputeCreateNetworkConfigurationForOrgRequest.name)
                && Objects.equals(
                        this.computeService, hostedComputeCreateNetworkConfigurationForOrgRequest.computeService)
                && Objects.equals(
                        this.networkSettingsIds,
                        hostedComputeCreateNetworkConfigurationForOrgRequest.networkSettingsIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, computeService, networkSettingsIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedComputeCreateNetworkConfigurationForOrgRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    computeService: ")
                .append(toIndentedString(computeService))
                .append("\n");
        sb.append("    networkSettingsIds: ")
                .append(toIndentedString(networkSettingsIds))
                .append("\n");
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
