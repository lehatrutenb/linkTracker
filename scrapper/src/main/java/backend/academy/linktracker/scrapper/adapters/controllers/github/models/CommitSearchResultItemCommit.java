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
 * CommitSearchResultItemCommit
 */
@JsonTypeName("commit_search_result_item_commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommitSearchResultItemCommit {

    private CommitSearchResultItemCommitAuthor author;

    private JsonNullable<NullableGitUser> committer = JsonNullable.<NullableGitUser>undefined();

    private Long commentCount;

    private String message;

    private ShortBranchCommit tree;

    private URI url;

    private Optional<Verification> verification = Optional.empty();

    public CommitSearchResultItemCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CommitSearchResultItemCommit(
            CommitSearchResultItemCommitAuthor author,
            NullableGitUser committer,
            Long commentCount,
            String message,
            ShortBranchCommit tree,
            URI url) {
        this.author = author;
        this.committer = JsonNullable.of(committer);
        this.commentCount = commentCount;
        this.message = message;
        this.tree = tree;
        this.url = url;
    }

    public CommitSearchResultItemCommit author(CommitSearchResultItemCommitAuthor author) {
        this.author = author;
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
    public CommitSearchResultItemCommitAuthor getAuthor() {
        return author;
    }

    public void setAuthor(CommitSearchResultItemCommitAuthor author) {
        this.author = author;
    }

    public CommitSearchResultItemCommit committer(NullableGitUser committer) {
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

    public CommitSearchResultItemCommit commentCount(Long commentCount) {
        this.commentCount = commentCount;
        return this;
    }

    /**
     * Get commentCount
     * @return commentCount
     */
    @NotNull
    @Schema(name = "comment_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comment_count")
    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public CommitSearchResultItemCommit message(String message) {
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

    public CommitSearchResultItemCommit tree(ShortBranchCommit tree) {
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
    public ShortBranchCommit getTree() {
        return tree;
    }

    public void setTree(ShortBranchCommit tree) {
        this.tree = tree;
    }

    public CommitSearchResultItemCommit url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public CommitSearchResultItemCommit verification(Verification verification) {
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
        CommitSearchResultItemCommit commitSearchResultItemCommit = (CommitSearchResultItemCommit) o;
        return Objects.equals(this.author, commitSearchResultItemCommit.author)
                && Objects.equals(this.committer, commitSearchResultItemCommit.committer)
                && Objects.equals(this.commentCount, commitSearchResultItemCommit.commentCount)
                && Objects.equals(this.message, commitSearchResultItemCommit.message)
                && Objects.equals(this.tree, commitSearchResultItemCommit.tree)
                && Objects.equals(this.url, commitSearchResultItemCommit.url)
                && Objects.equals(this.verification, commitSearchResultItemCommit.verification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, committer, commentCount, message, tree, url, verification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitSearchResultItemCommit {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
