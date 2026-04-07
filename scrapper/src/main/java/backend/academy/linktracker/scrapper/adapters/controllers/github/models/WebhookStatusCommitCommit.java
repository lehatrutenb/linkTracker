package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;

/**
 * WebhookStatusCommitCommit
 */
@JsonTypeName("webhook_status_commit_commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookStatusCommitCommit {

    private WebhookStatusCommitCommitAuthor author;

    private Long commentCount;

    private WebhookStatusCommitCommitAuthor committer;

    private String message;

    private ShortBranchCommit tree;

    private URI url;

    private WebhookStatusCommitCommitVerification verification;

    public WebhookStatusCommitCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookStatusCommitCommit(
            WebhookStatusCommitCommitAuthor author,
            Long commentCount,
            WebhookStatusCommitCommitAuthor committer,
            String message,
            ShortBranchCommit tree,
            URI url,
            WebhookStatusCommitCommitVerification verification) {
        this.author = author;
        this.commentCount = commentCount;
        this.committer = committer;
        this.message = message;
        this.tree = tree;
        this.url = url;
        this.verification = verification;
    }

    public WebhookStatusCommitCommit author(WebhookStatusCommitCommitAuthor author) {
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
    public WebhookStatusCommitCommitAuthor getAuthor() {
        return author;
    }

    public void setAuthor(WebhookStatusCommitCommitAuthor author) {
        this.author = author;
    }

    public WebhookStatusCommitCommit commentCount(Long commentCount) {
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

    public WebhookStatusCommitCommit committer(WebhookStatusCommitCommitAuthor committer) {
        this.committer = committer;
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
    public WebhookStatusCommitCommitAuthor getCommitter() {
        return committer;
    }

    public void setCommitter(WebhookStatusCommitCommitAuthor committer) {
        this.committer = committer;
    }

    public WebhookStatusCommitCommit message(String message) {
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

    public WebhookStatusCommitCommit tree(ShortBranchCommit tree) {
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

    public WebhookStatusCommitCommit url(URI url) {
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

    public WebhookStatusCommitCommit verification(WebhookStatusCommitCommitVerification verification) {
        this.verification = verification;
        return this;
    }

    /**
     * Get verification
     * @return verification
     */
    @NotNull
    @Valid
    @Schema(name = "verification", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("verification")
    public WebhookStatusCommitCommitVerification getVerification() {
        return verification;
    }

    public void setVerification(WebhookStatusCommitCommitVerification verification) {
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
        WebhookStatusCommitCommit webhookStatusCommitCommit = (WebhookStatusCommitCommit) o;
        return Objects.equals(this.author, webhookStatusCommitCommit.author)
                && Objects.equals(this.commentCount, webhookStatusCommitCommit.commentCount)
                && Objects.equals(this.committer, webhookStatusCommitCommit.committer)
                && Objects.equals(this.message, webhookStatusCommitCommit.message)
                && Objects.equals(this.tree, webhookStatusCommitCommit.tree)
                && Objects.equals(this.url, webhookStatusCommitCommit.url)
                && Objects.equals(this.verification, webhookStatusCommitCommit.verification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, commentCount, committer, message, tree, url, verification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookStatusCommitCommit {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
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
