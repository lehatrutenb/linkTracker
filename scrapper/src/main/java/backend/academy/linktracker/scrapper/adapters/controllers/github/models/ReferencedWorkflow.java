package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * A workflow referenced/reused by the initial caller workflow
 */
@Schema(name = "referenced-workflow", description = "A workflow referenced/reused by the initial caller workflow")
@JsonTypeName("referenced-workflow")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReferencedWorkflow {

    private String path;

    private String sha;

    private String ref;

    public ReferencedWorkflow() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReferencedWorkflow(String path, String sha) {
        this.path = path;
        this.sha = sha;
    }

    public ReferencedWorkflow path(String path) {
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

    public ReferencedWorkflow sha(String sha) {
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

    public ReferencedWorkflow ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @Schema(name = "ref", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReferencedWorkflow referencedWorkflow = (ReferencedWorkflow) o;
        return Objects.equals(this.path, referencedWorkflow.path)
                && Objects.equals(this.sha, referencedWorkflow.sha)
                && Objects.equals(this.ref, referencedWorkflow.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, sha, ref);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReferencedWorkflow {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
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
