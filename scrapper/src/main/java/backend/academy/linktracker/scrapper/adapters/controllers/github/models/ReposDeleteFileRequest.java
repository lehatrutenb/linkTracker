package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposDeleteFileRequest
 */
@JsonTypeName("repos_delete_file_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposDeleteFileRequest {

    private String message;

    private String sha;

    private Optional<String> branch = Optional.empty();

    private Optional<ReposDeleteFileRequestCommitter> committer = Optional.empty();

    private Optional<ReposDeleteFileRequestAuthor> author = Optional.empty();

    public ReposDeleteFileRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposDeleteFileRequest(String message, String sha) {
        this.message = message;
        this.sha = sha;
    }

    public ReposDeleteFileRequest message(String message) {
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

    public ReposDeleteFileRequest sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * The blob SHA of the file being deleted.
     * @return sha
     */
    @NotNull
    @Schema(
            name = "sha",
            description = "The blob SHA of the file being deleted.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public ReposDeleteFileRequest branch(String branch) {
        this.branch = Optional.ofNullable(branch);
        return this;
    }

    /**
     * The branch name. Default: the repository’s default branch
     * @return branch
     */
    @Schema(
            name = "branch",
            description = "The branch name. Default: the repository’s default branch",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("branch")
    public Optional<String> getBranch() {
        return branch;
    }

    public void setBranch(Optional<String> branch) {
        this.branch = branch;
    }

    public ReposDeleteFileRequest committer(ReposDeleteFileRequestCommitter committer) {
        this.committer = Optional.ofNullable(committer);
        return this;
    }

    /**
     * Get committer
     * @return committer
     */
    @Valid
    @Schema(name = "committer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("committer")
    public Optional<ReposDeleteFileRequestCommitter> getCommitter() {
        return committer;
    }

    public void setCommitter(Optional<ReposDeleteFileRequestCommitter> committer) {
        this.committer = committer;
    }

    public ReposDeleteFileRequest author(ReposDeleteFileRequestAuthor author) {
        this.author = Optional.ofNullable(author);
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author")
    public Optional<ReposDeleteFileRequestAuthor> getAuthor() {
        return author;
    }

    public void setAuthor(Optional<ReposDeleteFileRequestAuthor> author) {
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
        ReposDeleteFileRequest reposDeleteFileRequest = (ReposDeleteFileRequest) o;
        return Objects.equals(this.message, reposDeleteFileRequest.message)
                && Objects.equals(this.sha, reposDeleteFileRequest.sha)
                && Objects.equals(this.branch, reposDeleteFileRequest.branch)
                && Objects.equals(this.committer, reposDeleteFileRequest.committer)
                && Objects.equals(this.author, reposDeleteFileRequest.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, sha, branch, committer, author);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposDeleteFileRequest {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
