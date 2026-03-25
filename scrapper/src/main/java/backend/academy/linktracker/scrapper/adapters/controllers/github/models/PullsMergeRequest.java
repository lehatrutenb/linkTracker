package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PullsMergeRequest
 */
@JsonTypeName("pulls_merge_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsMergeRequest {

    private String commitTitle;

    private String commitMessage;

    private String sha;

    /**
     * The merge method to use.
     */
    public enum MergeMethodEnum {
        MERGE("merge"),

        SQUASH("squash"),

        REBASE("rebase");

        private final String value;

        MergeMethodEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MergeMethodEnum fromValue(String value) {
            for (MergeMethodEnum b : MergeMethodEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private MergeMethodEnum mergeMethod;

    public PullsMergeRequest commitTitle(String commitTitle) {
        this.commitTitle = commitTitle;
        return this;
    }

    /**
     * Title for the automatic commit message.
     * @return commitTitle
     */
    @Schema(
            name = "commit_title",
            description = "Title for the automatic commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_title")
    public String getCommitTitle() {
        return commitTitle;
    }

    public void setCommitTitle(String commitTitle) {
        this.commitTitle = commitTitle;
    }

    public PullsMergeRequest commitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * Extra detail to append to automatic commit message.
     * @return commitMessage
     */
    @Schema(
            name = "commit_message",
            description = "Extra detail to append to automatic commit message.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_message")
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public PullsMergeRequest sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * SHA that pull request head must match to allow merge.
     * @return sha
     */
    @Schema(
            name = "sha",
            description = "SHA that pull request head must match to allow merge.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public PullsMergeRequest mergeMethod(MergeMethodEnum mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }

    /**
     * The merge method to use.
     * @return mergeMethod
     */
    @Schema(
            name = "merge_method",
            description = "The merge method to use.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("merge_method")
    public MergeMethodEnum getMergeMethod() {
        return mergeMethod;
    }

    public void setMergeMethod(MergeMethodEnum mergeMethod) {
        this.mergeMethod = mergeMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsMergeRequest pullsMergeRequest = (PullsMergeRequest) o;
        return Objects.equals(this.commitTitle, pullsMergeRequest.commitTitle)
                && Objects.equals(this.commitMessage, pullsMergeRequest.commitMessage)
                && Objects.equals(this.sha, pullsMergeRequest.sha)
                && Objects.equals(this.mergeMethod, pullsMergeRequest.mergeMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitTitle, commitMessage, sha, mergeMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsMergeRequest {\n");
        sb.append("    commitTitle: ").append(toIndentedString(commitTitle)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    mergeMethod: ").append(toIndentedString(mergeMethod)).append("\n");
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
