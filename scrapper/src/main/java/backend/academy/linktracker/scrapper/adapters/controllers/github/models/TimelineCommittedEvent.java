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
 * Timeline Committed Event
 */
@Schema(name = "timeline-committed-event", description = "Timeline Committed Event")
@JsonTypeName("timeline-committed-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TimelineCommittedEvent {

    private String event;

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

    public TimelineCommittedEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TimelineCommittedEvent(
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

    public TimelineCommittedEvent event(String event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public TimelineCommittedEvent sha(String sha) {
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

    public TimelineCommittedEvent nodeId(String nodeId) {
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

    public TimelineCommittedEvent url(URI url) {
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

    public TimelineCommittedEvent author(GitCommitAuthor author) {
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

    public TimelineCommittedEvent committer(GitCommitAuthor committer) {
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

    public TimelineCommittedEvent message(String message) {
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

    public TimelineCommittedEvent tree(GitCommitTree tree) {
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

    public TimelineCommittedEvent parents(List<@Valid GitCommitParentsInner> parents) {
        this.parents = parents;
        return this;
    }

    public TimelineCommittedEvent addParentsItem(GitCommitParentsInner parentsItem) {
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

    public TimelineCommittedEvent verification(GitCommitVerification verification) {
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

    public TimelineCommittedEvent htmlUrl(URI htmlUrl) {
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
        TimelineCommittedEvent timelineCommittedEvent = (TimelineCommittedEvent) o;
        return Objects.equals(this.event, timelineCommittedEvent.event)
                && Objects.equals(this.sha, timelineCommittedEvent.sha)
                && Objects.equals(this.nodeId, timelineCommittedEvent.nodeId)
                && Objects.equals(this.url, timelineCommittedEvent.url)
                && Objects.equals(this.author, timelineCommittedEvent.author)
                && Objects.equals(this.committer, timelineCommittedEvent.committer)
                && Objects.equals(this.message, timelineCommittedEvent.message)
                && Objects.equals(this.tree, timelineCommittedEvent.tree)
                && Objects.equals(this.parents, timelineCommittedEvent.parents)
                && Objects.equals(this.verification, timelineCommittedEvent.verification)
                && Objects.equals(this.htmlUrl, timelineCommittedEvent.htmlUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, sha, nodeId, url, author, committer, message, tree, parents, verification, htmlUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimelineCommittedEvent {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
