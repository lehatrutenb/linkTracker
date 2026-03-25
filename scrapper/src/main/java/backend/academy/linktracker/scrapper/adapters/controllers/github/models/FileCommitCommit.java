package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * FileCommitCommit
 */
@JsonTypeName("file_commit_commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommitCommit {

    private String sha;

    private String nodeId;

    private String url;

    private String htmlUrl;

    private FileCommitCommitAuthor author;

    private FileCommitCommitAuthor committer;

    private String message;

    private FileCommitCommitTree tree;

    @Valid
    private List<@Valid FileCommitCommitParentsInner> parents = new ArrayList<>();

    private FileCommitCommitVerification verification;

    public FileCommitCommit sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public FileCommitCommit nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public FileCommitCommit url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public FileCommitCommit htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public FileCommitCommit author(FileCommitCommitAuthor author) {
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
    public FileCommitCommitAuthor getAuthor() {
        return author;
    }

    public void setAuthor(FileCommitCommitAuthor author) {
        this.author = author;
    }

    public FileCommitCommit committer(FileCommitCommitAuthor committer) {
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
    public FileCommitCommitAuthor getCommitter() {
        return committer;
    }

    public void setCommitter(FileCommitCommitAuthor committer) {
        this.committer = committer;
    }

    public FileCommitCommit message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public FileCommitCommit tree(FileCommitCommitTree tree) {
        this.tree = tree;
        return this;
    }

    /**
     * Get tree
     * @return tree
     */
    @Valid
    @Schema(name = "tree", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("tree")
    public FileCommitCommitTree getTree() {
        return tree;
    }

    public void setTree(FileCommitCommitTree tree) {
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
        this.verification = verification;
        return this;
    }

    /**
     * Get verification
     * @return verification
     */
    @Valid
    @Schema(name = "verification", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("verification")
    public FileCommitCommitVerification getVerification() {
        return verification;
    }

    public void setVerification(FileCommitCommitVerification verification) {
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
