package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookStatusCommit
 */
@JsonTypeName("webhook_status_commit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookStatusCommit {

    private User8 author = null;

    private URI commentsUrl;

    private WebhookStatusCommitCommit commit;

    private User8 committer = null;

    private URI htmlUrl;

    private String nodeId;

    @Valid
    private List<@Valid WebhookStatusCommitParentsInner> parents = new ArrayList<>();

    private String sha;

    private URI url;

    public WebhookStatusCommit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookStatusCommit(
            User8 author,
            URI commentsUrl,
            WebhookStatusCommitCommit commit,
            User8 committer,
            URI htmlUrl,
            String nodeId,
            List<@Valid WebhookStatusCommitParentsInner> parents,
            String sha,
            URI url) {
        this.author = author;
        this.commentsUrl = commentsUrl;
        this.commit = commit;
        this.committer = committer;
        this.htmlUrl = htmlUrl;
        this.nodeId = nodeId;
        this.parents = parents;
        this.sha = sha;
        this.url = url;
    }

    public WebhookStatusCommit author(User8 author) {
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
    public User8 getAuthor() {
        return author;
    }

    public void setAuthor(User8 author) {
        this.author = author;
    }

    public WebhookStatusCommit commentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    /**
     * Get commentsUrl
     * @return commentsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "comments_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments_url")
    public URI getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(URI commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public WebhookStatusCommit commit(WebhookStatusCommitCommit commit) {
        this.commit = commit;
        return this;
    }

    /**
     * Get commit
     * @return commit
     */
    @NotNull
    @Valid
    @Schema(name = "commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit")
    public WebhookStatusCommitCommit getCommit() {
        return commit;
    }

    public void setCommit(WebhookStatusCommitCommit commit) {
        this.commit = commit;
    }

    public WebhookStatusCommit committer(User8 committer) {
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
    public User8 getCommitter() {
        return committer;
    }

    public void setCommitter(User8 committer) {
        this.committer = committer;
    }

    public WebhookStatusCommit htmlUrl(URI htmlUrl) {
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

    public WebhookStatusCommit nodeId(String nodeId) {
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

    public WebhookStatusCommit parents(List<@Valid WebhookStatusCommitParentsInner> parents) {
        this.parents = parents;
        return this;
    }

    public WebhookStatusCommit addParentsItem(WebhookStatusCommitParentsInner parentsItem) {
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
    public List<@Valid WebhookStatusCommitParentsInner> getParents() {
        return parents;
    }

    public void setParents(List<@Valid WebhookStatusCommitParentsInner> parents) {
        this.parents = parents;
    }

    public WebhookStatusCommit sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public WebhookStatusCommit url(URI url) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookStatusCommit webhookStatusCommit = (WebhookStatusCommit) o;
        return Objects.equals(this.author, webhookStatusCommit.author)
                && Objects.equals(this.commentsUrl, webhookStatusCommit.commentsUrl)
                && Objects.equals(this.commit, webhookStatusCommit.commit)
                && Objects.equals(this.committer, webhookStatusCommit.committer)
                && Objects.equals(this.htmlUrl, webhookStatusCommit.htmlUrl)
                && Objects.equals(this.nodeId, webhookStatusCommit.nodeId)
                && Objects.equals(this.parents, webhookStatusCommit.parents)
                && Objects.equals(this.sha, webhookStatusCommit.sha)
                && Objects.equals(this.url, webhookStatusCommit.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, commentsUrl, commit, committer, htmlUrl, nodeId, parents, sha, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookStatusCommit {\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    commentsUrl: ").append(toIndentedString(commentsUrl)).append("\n");
        sb.append("    commit: ").append(toIndentedString(commit)).append("\n");
        sb.append("    committer: ").append(toIndentedString(committer)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
