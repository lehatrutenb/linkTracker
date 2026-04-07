package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * GitCreateRefRequest
 */
@JsonTypeName("git_create_ref_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCreateRefRequest {

    private String ref;

    private String sha;

    public GitCreateRefRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitCreateRefRequest(String ref, String sha) {
        this.ref = ref;
        this.sha = sha;
    }

    public GitCreateRefRequest ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The name of the fully qualified reference (ie: `refs/heads/master`). If it doesn't start with 'refs' and have at least two slashes, it will be rejected.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            description =
                    "The name of the fully qualified reference (ie: `refs/heads/master`). If it doesn't start with 'refs' and have at least two slashes, it will be rejected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public GitCreateRefRequest sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * The SHA1 value for this reference.
     * @return sha
     */
    @NotNull
    @Schema(
            name = "sha",
            description = "The SHA1 value for this reference.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        GitCreateRefRequest gitCreateRefRequest = (GitCreateRefRequest) o;
        return Objects.equals(this.ref, gitCreateRefRequest.ref) && Objects.equals(this.sha, gitCreateRefRequest.sha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, sha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCreateRefRequest {\n");
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
