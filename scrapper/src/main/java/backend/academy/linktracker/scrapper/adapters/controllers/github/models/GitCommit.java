package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Low-level Git commit operations within a repository
 */
@Schema(name = "git-commit", description = "Low-level Git commit operations within a repository")
@JsonTypeName("git-commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCommit {

    private String sha;

    private String nodeId;

    private URI url;

    private GitCommitAuthor author;

    private GitCommitAuthor committer;

    private String message;

    private GitCommitTree tree;

    @Valid
    private List<@Valid GitCommitParentsInner> parents = new ArrayList<>();

    private GitCommitVerification verification;

    private URI htmlUrl;

    public GitCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitCommit(
            String sha,
            String nodeId,
            URI url,
            GitCommitAuthor author,
            GitCommitAuthor committer,
            String message,
            GitCommitTree tree,
            List<@Valid GitCommitParentsInner> parents,
            GitCommitVerification verification,
            URI htmlUrl) {
        this.sha = sha;
        this.nodeId = nodeId;
        this.url = url;
        this.author = author;
        this.committer = committer;
        this.message = message;
        this.tree = tree;
        this.parents = parents;
        this.verification = verification;
        this.htmlUrl = htmlUrl;
    }

    public GitCommit sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * SHA for the commit
     * @return sha
     */
    @NotNull
    @Schema(
            name = "sha",
            example = "7638417db6d59f3c431d3e1f261cc637155684cd",
            description = "SHA for the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public GitCommit nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public GitCommit url(URI url) {
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

    public GitCommit author(GitCommitAuthor author) {
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
    public GitCommitAuthor getAuthor() {
        return author;
    }

    public void setAuthor(GitCommitAuthor author) {
        this.author = author;
    }

    public GitCommit committer(GitCommitAuthor committer) {
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
    public GitCommitAuthor getCommitter() {
        return committer;
    }

    public void setCommitter(GitCommitAuthor committer) {
        this.committer = committer;
    }

    public GitCommit message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Message describing the purpose of the commit
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            example = "Fix #42",
            description = "Message describing the purpose of the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public GitCommit tree(GitCommitTree tree) {
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
    public GitCommitTree getTree() {
        return tree;
    }

    public void setTree(GitCommitTree tree) {
        this.tree = tree;
    }

    public GitCommit parents(List<@Valid GitCommitParentsInner> parents) {
        this.parents = parents;
        return this;
    }

    public GitCommit addParentsItem(GitCommitParentsInner parentsItem) {
        if (this.parents == null) {
            this.parents = new ArrayList<>();
        }
        this.parents.add(parentsItem);
        return this;
    }

    /**
     * Get parents
     * @return parents
     */
    @NotNull
    @Valid
    @Schema(name = "parents", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("parents")
    public List<@Valid GitCommitParentsInner> getParents() {
        return parents;
    }

    public void setParents(List<@Valid GitCommitParentsInner> parents) {
        this.parents = parents;
    }

    public GitCommit verification(GitCommitVerification verification) {
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
    public GitCommitVerification getVerification() {
        return verification;
    }

    public void setVerification(GitCommitVerification verification) {
        this.verification = verification;
    }

    public GitCommit htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitCommit gitCommit = (GitCommit) o;
        return Objects.equals(this.sha, gitCommit.sha)
                && Objects.equals(this.nodeId, gitCommit.nodeId)
                && Objects.equals(this.url, gitCommit.url)
                && Objects.equals(this.author, gitCommit.author)
                && Objects.equals(this.committer, gitCommit.committer)
                && Objects.equals(this.message, gitCommit.message)
                && Objects.equals(this.tree, gitCommit.tree)
                && Objects.equals(this.parents, gitCommit.parents)
                && Objects.equals(this.verification, gitCommit.verification)
                && Objects.equals(this.htmlUrl, gitCommit.htmlUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha, nodeId, url, author, committer, message, tree, parents, verification, htmlUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCommit {\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
        sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
        sb.append("    verification: ").append(toIndentedString(verification)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
