package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The status of auto merging a pull request.
 */
@Schema(name = "PullRequestAutoMerge_1", description = "The status of auto merging a pull request.")
@JsonTypeName("PullRequestAutoMerge_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestAutoMerge1 {

    private String commitMessage = null;

    private String commitTitle;

    private User enabledBy = null;

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

    public PullRequestAutoMerge1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestAutoMerge1(
            String commitMessage, String commitTitle, User enabledBy, MergeMethodEnum mergeMethod) {
        this.commitMessage = commitMessage;
        this.commitTitle = commitTitle;
        this.enabledBy = enabledBy;
        this.mergeMethod = mergeMethod;
    }

    public PullRequestAutoMerge1 commitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * Commit message for the merge commit.
     * @return commitMessage
     */
    @NotNull
    @Schema(
            name = "commit_message",
            description = "Commit message for the merge commit.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_message")
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    public PullRequestAutoMerge1 commitTitle(String commitTitle) {
        this.commitTitle = commitTitle;
        return this;
    }

    /**
     * Title for the merge commit message.
     * @return commitTitle
     */
    @NotNull
    @Schema(
            name = "commit_title",
            description = "Title for the merge commit message.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_title")
    public String getCommitTitle() {
        return commitTitle;
    }

    public void setCommitTitle(String commitTitle) {
        this.commitTitle = commitTitle;
    }

    public PullRequestAutoMerge1 enabledBy(User enabledBy) {
        this.enabledBy = enabledBy;
        return this;
    }

    /**
     * Get enabledBy
     * @return enabledBy
     */
    @NotNull
    @Valid
    @Schema(name = "enabled_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enabled_by")
    public User getEnabledBy() {
        return enabledBy;
    }

    public void setEnabledBy(User enabledBy) {
        this.enabledBy = enabledBy;
    }

    public PullRequestAutoMerge1 mergeMethod(MergeMethodEnum mergeMethod) {
        this.mergeMethod = mergeMethod;
        return this;
    }

    /**
     * The merge method to use.
     * @return mergeMethod
     */
    @NotNull
    @Schema(
            name = "merge_method",
            description = "The merge method to use.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        PullRequestAutoMerge1 pullRequestAutoMerge1 = (PullRequestAutoMerge1) o;
        return Objects.equals(this.commitMessage, pullRequestAutoMerge1.commitMessage)
                && Objects.equals(this.commitTitle, pullRequestAutoMerge1.commitTitle)
                && Objects.equals(this.enabledBy, pullRequestAutoMerge1.enabledBy)
                && Objects.equals(this.mergeMethod, pullRequestAutoMerge1.mergeMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitMessage, commitTitle, enabledBy, mergeMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestAutoMerge1 {\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
        sb.append("    commitTitle: ").append(toIndentedString(commitTitle)).append("\n");
        sb.append("    enabledBy: ").append(toIndentedString(enabledBy)).append("\n");
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
