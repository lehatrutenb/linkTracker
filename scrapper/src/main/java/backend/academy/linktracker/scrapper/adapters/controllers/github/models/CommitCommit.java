package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CommitCommit
 */
@JsonTypeName("commit_commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommitCommit {

    private URI url;

    private JsonNullable<NullableGitUser> author = JsonNullable.<NullableGitUser>undefined();

    private JsonNullable<NullableGitUser> committer = JsonNullable.<NullableGitUser>undefined();

    private String message;

    private Long commentCount;

    private CommitCommitTree tree;

    private Optional<Verification> verification = Optional.empty();

    public CommitCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CommitCommit(
            URI url,
            NullableGitUser author,
            NullableGitUser committer,
            String message,
            Long commentCount,
            CommitCommitTree tree) {
        this.url = url;
        this.author = JsonNullable.of(author);
        this.committer = JsonNullable.of(committer);
        this.message = message;
        this.commentCount = commentCount;
        this.tree = tree;
    }

    public CommitCommit url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example =
                    "https://api.github.com/repos/octocat/Hello-World/commits/6dcb09b5b57875f334f61aebed695e2e4193db5e",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public CommitCommit author(NullableGitUser author) {
        this.author = JsonNullable.of(author);
        return this;
    }

    /**
     * Get author
     * @return author
     */
    @NotNull
    @Valid
    @Schema(name = "author", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author")
    public JsonNullable<NullableGitUser> getAuthor() {
        return author;
    }

    public void setAuthor(JsonNullable<NullableGitUser> author) {
        this.author = author;
    }

    public CommitCommit committer(NullableGitUser committer) {
        this.committer = JsonNullable.of(committer);
        return this;
    }

    /**
     * Get committer
     * @return committer
     */
    @NotNull
    @Valid
    @Schema(name = "committer", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("committer")
    public JsonNullable<NullableGitUser> getCommitter() {
        return committer;
    }

    public void setCommitter(JsonNullable<NullableGitUser> committer) {
        this.committer = committer;
    }

    public CommitCommit message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @NotNull
    @Schema(name = "message", example = "Fix all the bugs", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CommitCommit commentCount(Long commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    /**
     * Get commentCount
     * @return commentCount
     */
    @NotNull
    @Schema(name = "comment_count", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comment_count")
    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public CommitCommit tree(CommitCommitTree tree) {
        this.tree = tree;
        return this;
    }

    /**
     * Get tree
     * @return tree
     */
    @NotNull
    @Valid
    @Schema(name = "tree", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tree")
    public CommitCommitTree getTree() {
        return tree;
    }

    public void setTree(CommitCommitTree tree) {
        this.tree = tree;
    }

    public CommitCommit verification(Verification verification) {
        this.verification = Optional.ofNullable(verification);
        return this;
    }

    /**
     * Get verification
     * @return verification
     */
    @Valid
    @Schema(name = "verification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("verification")
    public Optional<Verification> getVerification() {
        return verification;
    }

    public void setVerification(Optional<Verification> verification) {
        this.verification = verification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitCommit commitCommit = (CommitCommit) o;
        return Objects.equals(this.url, commitCommit.url)
                && Objects.equals(this.author, commitCommit.author)
                && Objects.equals(this.committer, commitCommit.committer)
                && Objects.equals(this.message, commitCommit.message)
                && Objects.equals(this.commentCount, commitCommit.commentCount)
                && Objects.equals(this.tree, commitCommit.tree)
                && Objects.equals(this.verification, commitCommit.verification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, author, committer, message, commentCount, tree, verification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitCommit {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
        sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
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
