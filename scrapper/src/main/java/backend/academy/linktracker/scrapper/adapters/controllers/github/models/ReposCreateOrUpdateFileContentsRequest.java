package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposCreateOrUpdateFileContentsRequest
 */
@JsonTypeName("repos_create_or_update_file_contents_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateOrUpdateFileContentsRequest {

    private String message;

    private String content;

    private String sha;

    private String branch;

    private ReposCreateOrUpdateFileContentsRequestCommitter committer;

    private ReposCreateOrUpdateFileContentsRequestAuthor author;

    public ReposCreateOrUpdateFileContentsRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateOrUpdateFileContentsRequest(String message, String content) {
        this.message = message;
        this.content = content;
    }

    public ReposCreateOrUpdateFileContentsRequest message(String message) {
        this.message = message;
        return this;
    }

    /**
     * The commit message.
     * @return message
     */
    @NotNull
    @Schema(name = "message", description = "The commit message.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ReposCreateOrUpdateFileContentsRequest content(String content) {
        this.content = content;
        return this;
    }

    /**
     * The new file content, using Base64 encoding.
     * @return content
     */
    @NotNull
    @Schema(
            name = "content",
            description = "The new file content, using Base64 encoding.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ReposCreateOrUpdateFileContentsRequest sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * **Required if you are updating a file**. The blob SHA of the file being replaced.
     * @return sha
     */
    @Schema(
            name = "sha",
            description = "**Required if you are updating a file**. The blob SHA of the file being replaced.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public ReposCreateOrUpdateFileContentsRequest branch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * The branch name. Default: the repository’s default branch.
     * @return branch
     */
    @Schema(
            name = "branch",
            description = "The branch name. Default: the repository’s default branch.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("branch")
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public ReposCreateOrUpdateFileContentsRequest committer(ReposCreateOrUpdateFileContentsRequestCommitter committer) {
        this.committer = committer;
        return this;
    }

    /**
     * Get committer
     * @return committer
     */
    @Valid
    @Schema(name = "committer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("committer")
    public ReposCreateOrUpdateFileContentsRequestCommitter getCommitter() {
        return committer;
    }

    public void setCommitter(ReposCreateOrUpdateFileContentsRequestCommitter committer) {
        this.committer = committer;
    }

    public ReposCreateOrUpdateFileContentsRequest author(ReposCreateOrUpdateFileContentsRequestAuthor author) {
        this.author = author;
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author")
    public ReposCreateOrUpdateFileContentsRequestAuthor getAuthor() {
        return author;
    }

    public void setAuthor(ReposCreateOrUpdateFileContentsRequestAuthor author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateOrUpdateFileContentsRequest reposCreateOrUpdateFileContentsRequest =
                (ReposCreateOrUpdateFileContentsRequest) o;
        return Objects.equals(this.message, reposCreateOrUpdateFileContentsRequest.message)
                && Objects.equals(this.content, reposCreateOrUpdateFileContentsRequest.content)
                && Objects.equals(this.sha, reposCreateOrUpdateFileContentsRequest.sha)
                && Objects.equals(this.branch, reposCreateOrUpdateFileContentsRequest.branch)
                && Objects.equals(this.committer, reposCreateOrUpdateFileContentsRequest.committer)
                && Objects.equals(this.author, reposCreateOrUpdateFileContentsRequest.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, content, sha, branch, committer, author);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateOrUpdateFileContentsRequest {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
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
