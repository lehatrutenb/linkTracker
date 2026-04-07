package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Pull Request Reviews are reviews on pull requests.
 */
@Schema(name = "pull-request-review", description = "Pull Request Reviews are reviews on pull requests.")
@JsonTypeName("pull-request-review")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReview {

    private Long id;

    private String nodeId;

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    private String body;

    private String state;

    private URI htmlUrl;

    private URI pullRequestUrl;

    private TimelineReviewedEventLinks links;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> submittedAt = Optional.empty();

    private JsonNullable<String> commitId = JsonNullable.<String>undefined();

    private Optional<String> bodyHtml = Optional.empty();

    private Optional<String> bodyText = Optional.empty();

    private AuthorAssociation authorAssociation;

    public PullRequestReview() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReview(
            Long id,
            String nodeId,
            NullableSimpleUser user,
            String body,
            String state,
            URI htmlUrl,
            URI pullRequestUrl,
            TimelineReviewedEventLinks links,
            String commitId,
            AuthorAssociation authorAssociation) {
        this.id = id;
        this.nodeId = nodeId;
        this.user = JsonNullable.of(user);
        this.body = body;
        this.state = state;
        this.htmlUrl = htmlUrl;
        this.pullRequestUrl = pullRequestUrl;
        this.links = links;
        this.commitId = JsonNullable.of(commitId);
        this.authorAssociation = authorAssociation;
    }

    public PullRequestReview id(Long id) {
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

    public PullRequestReview nodeId(String nodeId) {
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

    public PullRequestReview user(NullableSimpleUser user) {
        this.user = JsonNullable.of(user);
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
    public JsonNullable<NullableSimpleUser> getUser() {
        return user;
    }

    public void setUser(JsonNullable<NullableSimpleUser> user) {
        this.user = user;
    }

    public PullRequestReview body(String body) {
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

    public PullRequestReview state(String state) {
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

    public PullRequestReview htmlUrl(URI htmlUrl) {
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

    public PullRequestReview pullRequestUrl(URI pullRequestUrl) {
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

    public PullRequestReview links(TimelineReviewedEventLinks links) {
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

    public PullRequestReview submittedAt(OffsetDateTime submittedAt) {
        this.submittedAt = Optional.ofNullable(submittedAt);
        return this;
    }

    /**
     * Get submittedAt
     * @return submittedAt
     */
    @Valid
    @Schema(name = "submitted_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("submitted_at")
    public Optional<OffsetDateTime> getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(Optional<OffsetDateTime> submittedAt) {
        this.submittedAt = submittedAt;
    }

    public PullRequestReview commitId(String commitId) {
        this.commitId = JsonNullable.of(commitId);
        return this;
    }

    /**
     * A commit SHA for the review. If the commit object was garbage collected or forcibly deleted, then it no longer exists in Git and this value will be `null`.
     * @return commitId
     */
    @NotNull
    @Schema(
            name = "commit_id",
            example = "54bb654c9e6025347f57900a4a5c2313a96b8035",
            description =
                    "A commit SHA for the review. If the commit object was garbage collected or forcibly deleted, then it no longer exists in Git and this value will be `null`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public JsonNullable<String> getCommitId() {
        return commitId;
    }

    public void setCommitId(JsonNullable<String> commitId) {
        this.commitId = commitId;
    }

    public PullRequestReview bodyHtml(String bodyHtml) {
        this.bodyHtml = Optional.ofNullable(bodyHtml);
        return this;
    }

    /**
     * Get bodyHtml
     * @return bodyHtml
     */
    @Schema(name = "body_html", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_html")
    public Optional<String> getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(Optional<String> bodyHtml) {
        this.bodyHtml = bodyHtml;
    }

    public PullRequestReview bodyText(String bodyText) {
        this.bodyText = Optional.ofNullable(bodyText);
        return this;
    }

    /**
     * Get bodyText
     * @return bodyText
     */
    @Schema(name = "body_text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_text")
    public Optional<String> getBodyText() {
        return bodyText;
    }

    public void setBodyText(Optional<String> bodyText) {
        this.bodyText = bodyText;
    }

    public PullRequestReview authorAssociation(AuthorAssociation authorAssociation) {
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
        PullRequestReview pullRequestReview = (PullRequestReview) o;
        return Objects.equals(this.id, pullRequestReview.id)
                && Objects.equals(this.nodeId, pullRequestReview.nodeId)
                && Objects.equals(this.user, pullRequestReview.user)
                && Objects.equals(this.body, pullRequestReview.body)
                && Objects.equals(this.state, pullRequestReview.state)
                && Objects.equals(this.htmlUrl, pullRequestReview.htmlUrl)
                && Objects.equals(this.pullRequestUrl, pullRequestReview.pullRequestUrl)
                && Objects.equals(this.links, pullRequestReview.links)
                && Objects.equals(this.submittedAt, pullRequestReview.submittedAt)
                && Objects.equals(this.commitId, pullRequestReview.commitId)
                && Objects.equals(this.bodyHtml, pullRequestReview.bodyHtml)
                && Objects.equals(this.bodyText, pullRequestReview.bodyText)
                && Objects.equals(this.authorAssociation, pullRequestReview.authorAssociation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                user,
                body,
                state,
                htmlUrl,
                pullRequestUrl,
                links,
                submittedAt,
                commitId,
                bodyHtml,
                bodyText,
                authorAssociation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReview {\n");
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
