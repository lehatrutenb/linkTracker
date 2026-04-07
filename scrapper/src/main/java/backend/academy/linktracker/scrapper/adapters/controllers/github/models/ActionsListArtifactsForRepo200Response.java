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
 * ActionsListArtifactsForRepo200Response
 */
@JsonTypeName("actions_list_artifacts_for_repo_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListArtifactsForRepo200Response {

    private Long totalCount;

    @Valid
    private List<@Valid Artifact> artifacts = new ArrayList<>();

    public ActionsListArtifactsForRepo200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListArtifactsForRepo200Response(Long totalCount, List<@Valid Artifact> artifacts) {
        this.totalCount = totalCount;
        this.artifacts = artifacts;
    }

    public ActionsListArtifactsForRepo200Response totalCount(Long totalCount) {
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

    public ActionsListArtifactsForRepo200Response artifacts(List<@Valid Artifact> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public ActionsListArtifactsForRepo200Response addArtifactsItem(Artifact artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    /**
     * Get artifacts
     * @return artifacts
     */
    @NotNull
    @Valid
    @Schema(name = "artifacts", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("artifacts")
    public List<@Valid Artifact> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<@Valid Artifact> artifacts) {
        this.artifacts = artifacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListArtifactsForRepo200Response actionsListArtifactsForRepo200Response =
                (ActionsListArtifactsForRepo200Response) o;
        return Objects.equals(this.totalCount, actionsListArtifactsForRepo200Response.totalCount)
                && Objects.equals(this.artifacts, actionsListArtifactsForRepo200Response.artifacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, artifacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListArtifactsForRepo200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
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
