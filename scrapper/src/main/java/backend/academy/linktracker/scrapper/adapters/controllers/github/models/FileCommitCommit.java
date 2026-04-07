package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * FileCommitCommit
 */
@JsonTypeName("file_commit_commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommitCommit {

    private Optional<String> sha = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<FileCommitCommitAuthor> author = Optional.empty();

    private Optional<FileCommitCommitAuthor> committer = Optional.empty();

    private Optional<String> message = Optional.empty();

    private Optional<FileCommitCommitTree> tree = Optional.empty();

    @Valid
    private List<@Valid FileCommitCommitParentsInner> parents = new ArrayList<>();

    private Optional<FileCommitCommitVerification> verification = Optional.empty();

    public FileCommitCommit sha(String sha) {
        this.sha = Optional.ofNullable(sha);
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public Optional<String> getSha() {
        return sha;
    }

    public void setSha(Optional<String> sha) {
        this.sha = sha;
    }

    public FileCommitCommit nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public FileCommitCommit url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public FileCommitCommit htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public FileCommitCommit author(FileCommitCommitAuthor author) {
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
    public Optional<FileCommitCommitAuthor> getAuthor() {
        return author;
    }

    public void setAuthor(Optional<FileCommitCommitAuthor> author) {
        this.author = author;
    }

    public FileCommitCommit committer(FileCommitCommitAuthor committer) {
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
    public Optional<FileCommitCommitAuthor> getCommitter() {
        return committer;
    }

    public void setCommitter(Optional<FileCommitCommitAuthor> committer) {
        this.committer = committer;
    }

    public FileCommitCommit message(String message) {
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    public void setMessage(Optional<String> message) {
        this.message = message;
    }

    public FileCommitCommit tree(FileCommitCommitTree tree) {
        this.tree = Optional.ofNullable(tree);
        return this;
    }

    /**
     * Get tree
     * @return tree
     */
    @Valid
    @Schema(name = "tree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tree")
    public Optional<FileCommitCommitTree> getTree() {
        return tree;
    }

    public void setTree(Optional<FileCommitCommitTree> tree) {
        this.tree = tree;
    }

    public FileCommitCommit parents(List<@Valid FileCommitCommitParentsInner> parents) {
        this.parents = parents;
        return this;
    }

    public FileCommitCommit addParentsItem(FileCommitCommitParentsInner parentsItem) {
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
    @Valid
    @Schema(name = "parents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("parents")
    public List<@Valid FileCommitCommitParentsInner> getParents() {
        return parents;
    }

    public void setParents(List<@Valid FileCommitCommitParentsInner> parents) {
        this.parents = parents;
    }

    public FileCommitCommit verification(FileCommitCommitVerification verification) {
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
    public Optional<FileCommitCommitVerification> getVerification() {
        return verification;
    }

    public void setVerification(Optional<FileCommitCommitVerification> verification) {
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
        FileCommitCommit fileCommitCommit = (FileCommitCommit) o;
        return Objects.equals(this.sha, fileCommitCommit.sha)
                && Objects.equals(this.nodeId, fileCommitCommit.nodeId)
                && Objects.equals(this.url, fileCommitCommit.url)
                && Objects.equals(this.htmlUrl, fileCommitCommit.htmlUrl)
                && Objects.equals(this.author, fileCommitCommit.author)
                && Objects.equals(this.committer, fileCommitCommit.committer)
                && Objects.equals(this.message, fileCommitCommit.message)
                && Objects.equals(this.tree, fileCommitCommit.tree)
                && Objects.equals(this.parents, fileCommitCommit.parents)
                && Objects.equals(this.verification, fileCommitCommit.verification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sha, nodeId, url, htmlUrl, author, committer, message, tree, parents, verification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileCommitCommit {\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    tree: ").append(toIndentedString(tree)).append("\n");
        sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
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
