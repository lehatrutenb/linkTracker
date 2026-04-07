package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PullRequestReviewEventReview
 */
@JsonTypeName("pull_request_review_event_review")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewEventReview {

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    private Optional<String> body = Optional.empty();

    private Optional<String> commitId = Optional.empty();

    private JsonNullable<String> submittedAt = JsonNullable.<String>undefined();

    private Optional<String> state = Optional.empty();

    private Optional<URI> htmlUrl = Optional.empty();

    private Optional<URI> pullRequestUrl = Optional.empty();

    private Optional<TimelineReviewedEventLinks> links = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    public PullRequestReviewEventReview id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public PullRequestReviewEventReview nodeId(String nodeId) {
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

    public PullRequestReviewEventReview user(NullableSimpleUser user) {
        this.user = JsonNullable.of(user);
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user")
    public JsonNullable<NullableSimpleUser> getUser() {
        return user;
    }

    public void setUser(JsonNullable<NullableSimpleUser> user) {
        this.user = user;
    }

    public PullRequestReviewEventReview body(String body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    public void setBody(Optional<String> body) {
        this.body = body;
    }

    public PullRequestReviewEventReview commitId(String commitId) {
        this.commitId = Optional.ofNullable(commitId);
        return this;
    }

    /**
     * Get commitId
     * @return commitId
     */
    @Schema(name = "commit_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_id")
    public Optional<String> getCommitId() {
        return commitId;
    }

    public void setCommitId(Optional<String> commitId) {
        this.commitId = commitId;
    }

    public PullRequestReviewEventReview submittedAt(String submittedAt) {
        this.submittedAt = JsonNullable.of(submittedAt);
        return this;
    }

    /**
     * Get submittedAt
     * @return submittedAt
     */
    @Schema(name = "submitted_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("submitted_at")
    public JsonNullable<String> getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(JsonNullable<String> submittedAt) {
        this.submittedAt = submittedAt;
    }

    public PullRequestReviewEventReview state(String state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<String> getState() {
        return state;
    }

    public void setState(Optional<String> state) {
        this.state = state;
    }

    public PullRequestReviewEventReview htmlUrl(URI htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<URI> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public PullRequestReviewEventReview pullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = Optional.ofNullable(pullRequestUrl);
        return this;
    }

    /**
     * Get pullRequestUrl
     * @return pullRequestUrl
     */
    @Valid
    @Schema(name = "pull_request_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_request_url")
    public Optional<URI> getPullRequestUrl() {
        return pullRequestUrl;
    }

    public void setPullRequestUrl(Optional<URI> pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    public PullRequestReviewEventReview links(TimelineReviewedEventLinks links) {
        this.links = Optional.ofNullable(links);
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("_links")
    public Optional<TimelineReviewedEventLinks> getLinks() {
        return links;
    }

    public void setLinks(Optional<TimelineReviewedEventLinks> links) {
        this.links = links;
    }

    public PullRequestReviewEventReview updatedAt(String updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<String> updatedAt) {
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
                && equalsNullable(this.user, pullRequestReviewEventReview.user)
                && Objects.equals(this.body, pullRequestReviewEventReview.body)
                && Objects.equals(this.commitId, pullRequestReviewEventReview.commitId)
                && equalsNullable(this.submittedAt, pullRequestReviewEventReview.submittedAt)
                && Objects.equals(this.state, pullRequestReviewEventReview.state)
                && Objects.equals(this.htmlUrl, pullRequestReviewEventReview.htmlUrl)
                && Objects.equals(this.pullRequestUrl, pullRequestReviewEventReview.pullRequestUrl)
                && Objects.equals(this.links, pullRequestReviewEventReview.links)
                && Objects.equals(this.updatedAt, pullRequestReviewEventReview.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                hashCodeNullable(user),
                body,
                commitId,
                hashCodeNullable(submittedAt),
                state,
                htmlUrl,
                pullRequestUrl,
                links,
                updatedAt);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
