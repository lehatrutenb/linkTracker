package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * GitUpdateRefRequest
 */
@JsonTypeName("git_update_ref_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitUpdateRefRequest {

    private String sha;

    private Optional<Boolean> force = Optional.of(false);

    public GitUpdateRefRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitUpdateRefRequest(String sha) {
        this.sha = sha;
    }

    public GitUpdateRefRequest sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * The SHA1 value to set this reference to
     * @return sha
     */
    @NotNull
    @Schema(
            name = "sha",
            description = "The SHA1 value to set this reference to",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public GitUpdateRefRequest force(Boolean force) {
        this.force = Optional.ofNullable(force);
        return this;
    }

    /**
     * Indicates whether to force the update or to make sure the update is a fast-forward update. Leaving this out or setting it to `false` will make sure you're not overwriting work.
     * @return force
     */
    @Schema(
            name = "force",
            description =
                    "Indicates whether to force the update or to make sure the update is a fast-forward update. Leaving this out or setting it to `false` will make sure you're not overwriting work.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("force")
    public Optional<Boolean> getForce() {
        return force;
    }

    public void setForce(Optional<Boolean> force) {
        this.force = force;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitUpdateRefRequest gitUpdateRefRequest = (GitUpdateRefRequest) o;
        return Objects.equals(this.sha, gitUpdateRefRequest.sha)
                && Objects.equals(this.force, gitUpdateRefRequest.force);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha, force);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitUpdateRefRequest {\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    force: ").append(toIndentedString(force)).append("\n");
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
