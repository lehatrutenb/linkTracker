package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposMergeRequest
 */
@JsonTypeName("repos_merge_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposMergeRequest {

    private String base;

    private String head;

    private String commitMessage;

    public ReposMergeRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposMergeRequest(String base, String head) {
        this.base = base;
        this.head = head;
    }

    public ReposMergeRequest base(String base) {
        this.base = base;
        return this;
    }

    /**
     * The name of the base branch that the head will be merged into.
     * @return base
     */
    @NotNull
    @Schema(
            name = "base",
            description = "The name of the base branch that the head will be merged into.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public ReposMergeRequest head(String head) {
        this.head = head;
        return this;
    }

    /**
     * The head to merge. This can be a branch name or a commit SHA1.
     * @return head
     */
    @NotNull
    @Schema(
            name = "head",
            description = "The head to merge. This can be a branch name or a commit SHA1.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head")
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public ReposMergeRequest commitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
        return this;
    }

    /**
     * Commit message to use for the merge commit. If omitted, a default message will be used.
     * @return commitMessage
     */
    @Schema(
            name = "commit_message",
            description = "Commit message to use for the merge commit. If omitted, a default message will be used.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_message")
    public String getCommitMessage() {
        return commitMessage;
    }

    public void setCommitMessage(String commitMessage) {
        this.commitMessage = commitMessage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposMergeRequest reposMergeRequest = (ReposMergeRequest) o;
        return Objects.equals(this.base, reposMergeRequest.base)
                && Objects.equals(this.head, reposMergeRequest.head)
                && Objects.equals(this.commitMessage, reposMergeRequest.commitMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, head, commitMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposMergeRequest {\n");
        sb.append("    base: ").append(toIndentedString(base)).append("\n");
        sb.append("    head: ").append(toIndentedString(head)).append("\n");
        sb.append("    commitMessage: ").append(toIndentedString(commitMessage)).append("\n");
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
