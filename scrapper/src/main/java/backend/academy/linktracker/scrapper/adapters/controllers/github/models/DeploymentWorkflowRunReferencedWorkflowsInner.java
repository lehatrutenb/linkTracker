package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * DeploymentWorkflowRunReferencedWorkflowsInner
 */
@JsonTypeName("Deployment_Workflow_Run_referenced_workflows_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentWorkflowRunReferencedWorkflowsInner {

    private String path;

    private Optional<String> ref = Optional.empty();

    private String sha;

    public DeploymentWorkflowRunReferencedWorkflowsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeploymentWorkflowRunReferencedWorkflowsInner(String path, String sha) {
        this.path = path;
        this.sha = sha;
    }

    public DeploymentWorkflowRunReferencedWorkflowsInner path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DeploymentWorkflowRunReferencedWorkflowsInner ref(String ref) {
        this.ref = Optional.ofNullable(ref);
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @Schema(name = "ref", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref")
    public Optional<String> getRef() {
        return ref;
    }

    public void setRef(Optional<String> ref) {
        this.ref = ref;
    }

    public DeploymentWorkflowRunReferencedWorkflowsInner sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.REQUIRED)
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
        DeploymentWorkflowRunReferencedWorkflowsInner deploymentWorkflowRunReferencedWorkflowsInner =
                (DeploymentWorkflowRunReferencedWorkflowsInner) o;
        return Objects.equals(this.path, deploymentWorkflowRunReferencedWorkflowsInner.path)
                && Objects.equals(this.ref, deploymentWorkflowRunReferencedWorkflowsInner.ref)
                && Objects.equals(this.sha, deploymentWorkflowRunReferencedWorkflowsInner.sha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, ref, sha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentWorkflowRunReferencedWorkflowsInner {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
