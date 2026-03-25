package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * OrgsCreateArtifactDeploymentRecord200Response
 */
@JsonTypeName("orgs_create_artifact_deployment_record_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsCreateArtifactDeploymentRecord200Response {

    private Long totalCount;

    @Valid
    private List<@Valid ArtifactDeploymentRecord> deploymentRecords = new ArrayList<>();

    public OrgsCreateArtifactDeploymentRecord200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * The number of deployment records created
     * @return totalCount
     */
    @Schema(
            name = "total_count",
            description = "The number of deployment records created",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public OrgsCreateArtifactDeploymentRecord200Response deploymentRecords(
            List<@Valid ArtifactDeploymentRecord> deploymentRecords) {
        this.deploymentRecords = deploymentRecords;
        return this;
    }

    public OrgsCreateArtifactDeploymentRecord200Response addDeploymentRecordsItem(
            ArtifactDeploymentRecord deploymentRecordsItem) {
        if (this.deploymentRecords == null) {
            this.deploymentRecords = new ArrayList<>();
        }
        this.deploymentRecords.add(deploymentRecordsItem);
        return this;
    }

    /**
     * Get deploymentRecords
     * @return deploymentRecords
     */
    @Valid
    @Schema(name = "deployment_records", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment_records")
    public List<@Valid ArtifactDeploymentRecord> getDeploymentRecords() {
        return deploymentRecords;
    }

    public void setDeploymentRecords(List<@Valid ArtifactDeploymentRecord> deploymentRecords) {
        this.deploymentRecords = deploymentRecords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsCreateArtifactDeploymentRecord200Response orgsCreateArtifactDeploymentRecord200Response =
                (OrgsCreateArtifactDeploymentRecord200Response) o;
        return Objects.equals(this.totalCount, orgsCreateArtifactDeploymentRecord200Response.totalCount)
                && Objects.equals(
                        this.deploymentRecords, orgsCreateArtifactDeploymentRecord200Response.deploymentRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, deploymentRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsCreateArtifactDeploymentRecord200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    deploymentRecords: ")
                .append(toIndentedString(deploymentRecords))
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
