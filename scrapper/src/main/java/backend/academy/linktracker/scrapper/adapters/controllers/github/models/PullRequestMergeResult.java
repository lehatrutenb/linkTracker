package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Pull Request Merge Result
 */
@Schema(name = "pull-request-merge-result", description = "Pull Request Merge Result")
@JsonTypeName("pull-request-merge-result")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestMergeResult {

    private String sha;

    private Boolean merged;

    private String message;

    public PullRequestMergeResult() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestMergeResult(String sha, Boolean merged, String message) {
        this.sha = sha;
        this.merged = merged;
        this.message = message;
    }

    public PullRequestMergeResult sha(String sha) {
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

    public PullRequestMergeResult merged(Boolean merged) {
        this.merged = merged;
        return this;
    }

    /**
     * Get merged
     * @return merged
     */
    @NotNull
    @Schema(name = "merged", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("merged")
    public Boolean getMerged() {
        return merged;
    }

    public void setMerged(Boolean merged) {
        this.merged = merged;
    }

    public PullRequestMergeResult message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @NotNull
    @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestMergeResult pullRequestMergeResult = (PullRequestMergeResult) o;
        return Objects.equals(this.sha, pullRequestMergeResult.sha)
                && Objects.equals(this.merged, pullRequestMergeResult.merged)
                && Objects.equals(this.message, pullRequestMergeResult.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha, merged, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestMergeResult {\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    merged: ").append(toIndentedString(merged)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
