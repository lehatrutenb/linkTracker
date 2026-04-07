package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgsSetClusterDeploymentRecordsRequest
 */
@JsonTypeName("orgs_set_cluster_deployment_records_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsSetClusterDeploymentRecordsRequest {

    private String logicalEnvironment;

    private Optional<@Size(max = 128) String> physicalEnvironment = Optional.empty();

    @Valid
    private List<@Valid OrgsSetClusterDeploymentRecordsRequestDeploymentsInner> deployments = new ArrayList<>();

    public OrgsSetClusterDeploymentRecordsRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsSetClusterDeploymentRecordsRequest(
            String logicalEnvironment,
            List<@Valid OrgsSetClusterDeploymentRecordsRequestDeploymentsInner> deployments) {
        this.logicalEnvironment = logicalEnvironment;
        this.deployments = deployments;
    }

    public OrgsSetClusterDeploymentRecordsRequest logicalEnvironment(String logicalEnvironment) {
        this.logicalEnvironment = logicalEnvironment;
        return this;
    }

    /**
     * The stage of the deployment.
     * @return logicalEnvironment
     */
    @NotNull
    @Size(min = 1, max = 128)
    @Schema(
            name = "logical_environment",
            description = "The stage of the deployment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("logical_environment")
    public String getLogicalEnvironment() {
        return logicalEnvironment;
    }

    public void setLogicalEnvironment(String logicalEnvironment) {
        this.logicalEnvironment = logicalEnvironment;
    }

    public OrgsSetClusterDeploymentRecordsRequest physicalEnvironment(String physicalEnvironment) {
        this.physicalEnvironment = Optional.ofNullable(physicalEnvironment);
        return this;
    }

    /**
     * The physical region of the deployment.
     * @return physicalEnvironment
     */
    @Schema(
            name = "physical_environment",
            description = "The physical region of the deployment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("physical_environment")
    public Optional<@Size(max = 128) String> getPhysicalEnvironment() {
        return physicalEnvironment;
    }

    public void setPhysicalEnvironment(Optional<String> physicalEnvironment) {
        this.physicalEnvironment = physicalEnvironment;
    }

    public OrgsSetClusterDeploymentRecordsRequest deployments(
            List<@Valid OrgsSetClusterDeploymentRecordsRequestDeploymentsInner> deployments) {
        this.deployments = deployments;
        return this;
    }

    public OrgsSetClusterDeploymentRecordsRequest addDeploymentsItem(
            OrgsSetClusterDeploymentRecordsRequestDeploymentsInner deploymentsItem) {
        if (this.deployments == null) {
            this.deployments = new ArrayList<>();
        }
        this.deployments.add(deploymentsItem);
        return this;
    }

    /**
     * The list of deployments to record.
     * @return deployments
     */
    @NotNull
    @Valid
    @Size(max = 1000)
    @Schema(
            name = "deployments",
            description = "The list of deployments to record.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployments")
    public List<@Valid OrgsSetClusterDeploymentRecordsRequestDeploymentsInner> getDeployments() {
        return deployments;
    }

    public void setDeployments(List<@Valid OrgsSetClusterDeploymentRecordsRequestDeploymentsInner> deployments) {
        this.deployments = deployments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsSetClusterDeploymentRecordsRequest orgsSetClusterDeploymentRecordsRequest =
                (OrgsSetClusterDeploymentRecordsRequest) o;
        return Objects.equals(this.logicalEnvironment, orgsSetClusterDeploymentRecordsRequest.logicalEnvironment)
                && Objects.equals(this.physicalEnvironment, orgsSetClusterDeploymentRecordsRequest.physicalEnvironment)
                && Objects.equals(this.deployments, orgsSetClusterDeploymentRecordsRequest.deployments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalEnvironment, physicalEnvironment, deployments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsSetClusterDeploymentRecordsRequest {\n");
        sb.append("    logicalEnvironment: ")
                .append(toIndentedString(logicalEnvironment))
                .append("\n");
        sb.append("    physicalEnvironment: ")
                .append(toIndentedString(physicalEnvironment))
                .append("\n");
        sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
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
