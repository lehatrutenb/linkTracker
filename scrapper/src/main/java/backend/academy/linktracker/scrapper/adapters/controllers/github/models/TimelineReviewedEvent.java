package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Timeline Reviewed Event
 */
@Schema(name = "timeline-reviewed-event", description = "Timeline Reviewed Event")
@JsonTypeName("timeline-reviewed-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TimelineReviewedEvent {

    private String event;

    private Long id;

    private String nodeId;

    private SimpleUser user;

    private String body = null;

    private String state;

    private URI htmlUrl;

    private URI pullRequestUrl;

    private TimelineReviewedEventLinks links;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime submittedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    private String commitId;

    private String bodyHtml;

    private String bodyText;

    private AuthorAssociation authorAssociation;

    public TimelineReviewedEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TimelineReviewedEvent(
            String event,
            Long id,
            String nodeId,
            SimpleUser user,
            String body,
            String state,
            URI htmlUrl,
            URI pullRequestUrl,
            TimelineReviewedEventLinks links,
            String commitId,
            AuthorAssociation authorAssociation) {
        this.event = event;
        this.id = id;
        this.nodeId = nodeId;
        this.user = user;
        this.body = body;
        this.state = state;
        this.htmlUrl = htmlUrl;
        this.pullRequestUrl = pullRequestUrl;
        this.links = links;
        this.commitId = commitId;
        this.authorAssociation = authorAssociation;
    }

    public TimelineReviewedEvent event(String event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @NotNull
    @Schema(name = "event", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public TimelineReviewedEvent id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the review
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the review",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TimelineReviewedEvent nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDE3OlB1bGxSZXF1ZXN0UmV2aWV3ODA=", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TimelineReviewedEvent user(SimpleUser user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public SimpleUser getUser() {
        return user;
    }

    public void setUser(SimpleUser user) {
        this.user = user;
    }

    public TimelineReviewedEvent body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The text of the review.
     * @return body
     */
    @NotNull
    @Schema(
            name = "body",
            example = "This looks great.",
            description = "The text of the review.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public TimelineReviewedEvent state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", example = "CHANGES_REQUESTED", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TimelineReviewedEvent htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/octocat/Hello-World/pull/12#pullrequestreview-80",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public TimelineReviewedEvent pullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
        return this;
    }

    /**
     * Get pullRequestUrl
     * @return pullRequestUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "pull_request_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/12",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_url")
    public URI getPullRequestUrl() {
        return pullRequestUrl;
    }

    public void setPullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    public TimelineReviewedEvent links(TimelineReviewedEventLinks links) {
        this.links = links;
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @NotNull
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("_links")
    public TimelineReviewedEventLinks getLinks() {
        return links;
    }

    public void setLinks(TimelineReviewedEventLinks links) {
        this.links = links;
    }

    public TimelineReviewedEvent submittedAt(OffsetDateTime submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }

    /**
     * Get submittedAt
     * @return submittedAt
     */
    @Valid
    @Schema(name = "submitted_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("submitted_at")
    public OffsetDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(OffsetDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public TimelineReviewedEvent updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public TimelineReviewedEvent commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * A commit SHA for the review.
     * @return commitId
     */
    @NotNull
    @Schema(
            name = "commit_id",
            example = "54bb654c9e6025347f57900a4a5c2313a96b8035",
            description = "A commit SHA for the review.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public TimelineReviewedEvent bodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
        return this;
    }

    /**
     * Get bodyHtml
     * @return bodyHtml
     */
    @Schema(name = "body_html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_html")
    public String getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public TimelineReviewedEvent bodyText(String bodyText) {
        this.bodyText = bodyText;
        return this;
    }

    /**
     * Get bodyText
     * @return bodyText
     */
    @Schema(name = "body_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_text")
    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText;
    }

    public TimelineReviewedEvent authorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    /**
     * Get authorAssociation
     * @return authorAssociation
     */
    @NotNull
    @Valid
    @Schema(name = "author_association", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author_association")
    public AuthorAssociation getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimelineReviewedEvent timelineReviewedEvent = (TimelineReviewedEvent) o;
        return Objects.equals(this.event, timelineReviewedEvent.event)
                && Objects.equals(this.id, timelineReviewedEvent.id)
                && Objects.equals(this.nodeId, timelineReviewedEvent.nodeId)
                && Objects.equals(this.user, timelineReviewedEvent.user)
                && Objects.equals(this.body, timelineReviewedEvent.body)
                && Objects.equals(this.state, timelineReviewedEvent.state)
                && Objects.equals(this.htmlUrl, timelineReviewedEvent.htmlUrl)
                && Objects.equals(this.pullRequestUrl, timelineReviewedEvent.pullRequestUrl)
                && Objects.equals(this.links, timelineReviewedEvent.links)
                && Objects.equals(this.submittedAt, timelineReviewedEvent.submittedAt)
                && Objects.equals(this.updatedAt, timelineReviewedEvent.updatedAt)
                && Objects.equals(this.commitId, timelineReviewedEvent.commitId)
                && Objects.equals(this.bodyHtml, timelineReviewedEvent.bodyHtml)
                && Objects.equals(this.bodyText, timelineReviewedEvent.bodyText)
                && Objects.equals(this.authorAssociation, timelineReviewedEvent.authorAssociation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                event,
                id,
                nodeId,
                user,
                body,
                state,
                htmlUrl,
                pullRequestUrl,
                links,
                submittedAt,
                updatedAt,
                commitId,
                bodyHtml,
                bodyText,
                authorAssociation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimelineReviewedEvent {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    pullRequestUrl: ")
                .append(toIndentedString(pullRequestUrl))
                .append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
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
