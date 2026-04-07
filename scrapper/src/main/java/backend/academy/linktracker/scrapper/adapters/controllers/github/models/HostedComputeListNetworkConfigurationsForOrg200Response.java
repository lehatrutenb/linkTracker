package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * HostedComputeListNetworkConfigurationsForOrg200Response
 */
@JsonTypeName("hosted_compute_list_network_configurations_for_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class HostedComputeListNetworkConfigurationsForOrg200Response {

    private Long totalCount;

    @Valid
    private List<@Valid NetworkConfiguration> networkConfigurations = new ArrayList<>();

    public HostedComputeListNetworkConfigurationsForOrg200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public HostedComputeListNetworkConfigurationsForOrg200Response(
            Long totalCount, List<@Valid NetworkConfiguration> networkConfigurations) {
        this.totalCount = totalCount;
        this.networkConfigurations = networkConfigurations;
    }

    public HostedComputeListNetworkConfigurationsForOrg200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public HostedComputeListNetworkConfigurationsForOrg200Response networkConfigurations(
            List<@Valid NetworkConfiguration> networkConfigurations) {
        this.networkConfigurations = networkConfigurations;
        return this;
    }

    public HostedComputeListNetworkConfigurationsForOrg200Response addNetworkConfigurationsItem(
            NetworkConfiguration networkConfigurationsItem) {
        if (this.networkConfigurations == null) {
            this.networkConfigurations = new ArrayList<>();
        }
        this.networkConfigurations.add(networkConfigurationsItem);
        return this;
    }

    /**
     * Get networkConfigurations
     * @return networkConfigurations
     */
    @NotNull
    @Valid
    @Schema(name = "network_configurations", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("network_configurations")
    public List<@Valid NetworkConfiguration> getNetworkConfigurations() {
        return networkConfigurations;
    }

    public void setNetworkConfigurations(List<@Valid NetworkConfiguration> networkConfigurations) {
        this.networkConfigurations = networkConfigurations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HostedComputeListNetworkConfigurationsForOrg200Response
                hostedComputeListNetworkConfigurationsForOrg200Response =
                        (HostedComputeListNetworkConfigurationsForOrg200Response) o;
        return Objects.equals(this.totalCount, hostedComputeListNetworkConfigurationsForOrg200Response.totalCount)
                && Objects.equals(
                        this.networkConfigurations,
                        hostedComputeListNetworkConfigurationsForOrg200Response.networkConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, networkConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostedComputeListNetworkConfigurationsForOrg200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    networkConfigurations: ")
                .append(toIndentedString(networkConfigurations))
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
