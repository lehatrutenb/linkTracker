package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * PullRequestReviewEventReview
 */
@JsonTypeName("pull_request_review_event_review")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewEventReview {

    private Long id;

    private String nodeId;

    private NullableSimpleUser user = null;

    private String body;

    private String commitId;

    private String submittedAt = null;

    private String state;

    private URI htmlUrl;

    private URI pullRequestUrl;

    private TimelineReviewedEventLinks links;

    private String updatedAt;

    public PullRequestReviewEventReview id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PullRequestReviewEventReview nodeId(String nodeId) {
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

    public PullRequestReviewEventReview user(NullableSimpleUser user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user")
    public NullableSimpleUser getUser() {
        return user;
    }

    public void setUser(NullableSimpleUser user) {
        this.user = user;
    }

    public PullRequestReviewEventReview body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PullRequestReviewEventReview commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Get commitId
     * @return commitId
     */
    @Schema(name = "commit_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public PullRequestReviewEventReview submittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }

    /**
     * Get submittedAt
     * @return submittedAt
     */
    @Schema(name = "submitted_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("submitted_at")
    public String getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
    }

    public PullRequestReviewEventReview state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public PullRequestReviewEventReview htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public PullRequestReviewEventReview pullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
        return this;
    }

    /**
     * Get pullRequestUrl
     * @return pullRequestUrl
     */
    @Valid
    @Schema(name = "pull_request_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request_url")
    public URI getPullRequestUrl() {
        return pullRequestUrl;
    }

    public void setPullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    public PullRequestReviewEventReview links(TimelineReviewedEventLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("_links")
    public TimelineReviewedEventLinks getLinks() {
        return links;
    }

    public void setLinks(TimelineReviewedEventLinks links) {
        this.links = links;
    }

    public PullRequestReviewEventReview updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestReviewEventReview pullRequestReviewEventReview = (PullRequestReviewEventReview) o;
        return Objects.equals(this.id, pullRequestReviewEventReview.id)
                && Objects.equals(this.nodeId, pullRequestReviewEventReview.nodeId)
                && Objects.equals(this.user, pullRequestReviewEventReview.user)
                && Objects.equals(this.body, pullRequestReviewEventReview.body)
                && Objects.equals(this.commitId, pullRequestReviewEventReview.commitId)
                && Objects.equals(this.submittedAt, pullRequestReviewEventReview.submittedAt)
                && Objects.equals(this.state, pullRequestReviewEventReview.state)
                && Objects.equals(this.htmlUrl, pullRequestReviewEventReview.htmlUrl)
                && Objects.equals(this.pullRequestUrl, pullRequestReviewEventReview.pullRequestUrl)
                && Objects.equals(this.links, pullRequestReviewEventReview.links)
                && Objects.equals(this.updatedAt, pullRequestReviewEventReview.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, nodeId, user, body, commitId, submittedAt, state, htmlUrl, pullRequestUrl, links, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReviewEventReview {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    pullRequestUrl: ")
                .append(toIndentedString(pullRequestUrl))
                .append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
