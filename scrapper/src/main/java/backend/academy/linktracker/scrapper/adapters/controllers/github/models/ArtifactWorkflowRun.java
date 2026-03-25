package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ArtifactWorkflowRun
 */
@JsonTypeName("artifact_workflow_run")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ArtifactWorkflowRun {

    private Long id;

    private Long repositoryId;

    private Long headRepositoryId;

    private String headBranch;

    private String headSha;

    public ArtifactWorkflowRun id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArtifactWorkflowRun repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Get repositoryId
     * @return repositoryId
     */
    @Schema(name = "repository_id", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public ArtifactWorkflowRun headRepositoryId(Long headRepositoryId) {
        this.headRepositoryId = headRepositoryId;
        return this;
    }

    /**
     * Get headRepositoryId
     * @return headRepositoryId
     */
    @Schema(name = "head_repository_id", example = "42", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_repository_id")
    public Long getHeadRepositoryId() {
        return headRepositoryId;
    }

    public void setHeadRepositoryId(Long headRepositoryId) {
        this.headRepositoryId = headRepositoryId;
    }

    public ArtifactWorkflowRun headBranch(String headBranch) {
        this.headBranch = headBranch;
        return this;
    }

    /**
     * Get headBranch
     * @return headBranch
     */
    @Schema(name = "head_branch", example = "main", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_branch")
    public String getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
    }

    public ArtifactWorkflowRun headSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * Get headSha
     * @return headSha
     */
    @Schema(
            name = "head_sha",
            example = "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ArtifactWorkflowRun artifactWorkflowRun = (ArtifactWorkflowRun) o;
        return Objects.equals(this.id, artifactWorkflowRun.id)
                && Objects.equals(this.repositoryId, artifactWorkflowRun.repositoryId)
                && Objects.equals(this.headRepositoryId, artifactWorkflowRun.headRepositoryId)
                && Objects.equals(this.headBranch, artifactWorkflowRun.headBranch)
                && Objects.equals(this.headSha, artifactWorkflowRun.headSha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, repositoryId, headRepositoryId, headBranch, headSha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactWorkflowRun {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    headRepositoryId: ")
                .append(toIndentedString(headRepositoryId))
                .append("\n");
        sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
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
