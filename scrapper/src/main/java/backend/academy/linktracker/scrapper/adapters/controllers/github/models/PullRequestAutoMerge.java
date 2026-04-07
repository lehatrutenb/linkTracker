package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The status of auto merging a pull request.
 */
@Schema(name = "PullRequestAutoMerge", description = "The status of auto merging a pull request.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestAutoMerge {

    private JsonNullable<String> commitMessage = JsonNullable.<String>undefined();

    private JsonNullable<String> commitTitle = JsonNullable.<String>undefined();

    private JsonNullable<User> enabledBy = JsonNullable.<User>undefined();

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

    public PullRequestAutoMerge() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestAutoMerge(String commitMessage, String commitTitle, User enabledBy, MergeMethodEnum mergeMethod) {
        this.commitMessage = JsonNullable.of(commitMessage);
        this.commitTitle = JsonNullable.of(commitTitle);
        this.enabledBy = JsonNullable.of(enabledBy);
        this.mergeMethod = mergeMethod;
    }

    public PullRequestAutoMerge commitMessage(String commitMessage) {
        this.commitMessage = JsonNullable.of(commitMessage);
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
    public JsonNullable<String> getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(JsonNullable<String> commitMessage) {
        this.commitMessage = commitMessage;
    }

    public PullRequestAutoMerge commitTitle(String commitTitle) {
        this.commitTitle = JsonNullable.of(commitTitle);
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
    public JsonNullable<String> getCommitTitle() {
        return commitTitle;
    }

    public void setCommitTitle(JsonNullable<String> commitTitle) {
        this.commitTitle = commitTitle;
    }

    public PullRequestAutoMerge enabledBy(User enabledBy) {
        this.enabledBy = JsonNullable.of(enabledBy);
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
    public JsonNullable<User> getEnabledBy() {
        return enabledBy;
    }

    public void setEnabledBy(JsonNullable<User> enabledBy) {
        this.enabledBy = enabledBy;
    }

    public PullRequestAutoMerge mergeMethod(MergeMethodEnum mergeMethod) {
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
        PullRequestAutoMerge pullRequestAutoMerge = (PullRequestAutoMerge) o;
        return Objects.equals(this.commitMessage, pullRequestAutoMerge.commitMessage)
                && Objects.equals(this.commitTitle, pullRequestAutoMerge.commitTitle)
                && Objects.equals(this.enabledBy, pullRequestAutoMerge.enabledBy)
                && Objects.equals(this.mergeMethod, pullRequestAutoMerge.mergeMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitMessage, commitTitle, enabledBy, mergeMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestAutoMerge {\n");
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
