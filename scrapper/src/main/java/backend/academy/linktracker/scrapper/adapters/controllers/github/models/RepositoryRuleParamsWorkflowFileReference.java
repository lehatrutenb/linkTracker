package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * A workflow that must run for this rule to pass
 */
@Schema(
        name = "repository-rule-params-workflow-file-reference",
        description = "A workflow that must run for this rule to pass")
@JsonTypeName("repository-rule-params-workflow-file-reference")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleParamsWorkflowFileReference {

    private String path;

    private String ref;

    private Long repositoryId;

    private String sha;

    public RepositoryRuleParamsWorkflowFileReference() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleParamsWorkflowFileReference(String path, Long repositoryId) {
        this.path = path;
        this.repositoryId = repositoryId;
    }

    public RepositoryRuleParamsWorkflowFileReference path(String path) {
        this.path = path;
        return this;
    }

    /**
     * The path to the workflow file
     * @return path
     */
    @NotNull
    @Schema(name = "path", description = "The path to the workflow file", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RepositoryRuleParamsWorkflowFileReference ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The ref (branch or tag) of the workflow file to use
     * @return ref
     */
    @Schema(
            name = "ref",
            description = "The ref (branch or tag) of the workflow file to use",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public RepositoryRuleParamsWorkflowFileReference repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * The ID of the repository where the workflow is defined
     * @return repositoryId
     */
    @NotNull
    @Schema(
            name = "repository_id",
            description = "The ID of the repository where the workflow is defined",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RepositoryRuleParamsWorkflowFileReference sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * The commit SHA of the workflow file to use
     * @return sha
     */
    @Schema(
            name = "sha",
            description = "The commit SHA of the workflow file to use",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleParamsWorkflowFileReference repositoryRuleParamsWorkflowFileReference =
                (RepositoryRuleParamsWorkflowFileReference) o;
        return Objects.equals(this.path, repositoryRuleParamsWorkflowFileReference.path)
                && Objects.equals(this.ref, repositoryRuleParamsWorkflowFileReference.ref)
                && Objects.equals(this.repositoryId, repositoryRuleParamsWorkflowFileReference.repositoryId)
                && Objects.equals(this.sha, repositoryRuleParamsWorkflowFileReference.sha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, ref, repositoryId, sha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleParamsWorkflowFileReference {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
