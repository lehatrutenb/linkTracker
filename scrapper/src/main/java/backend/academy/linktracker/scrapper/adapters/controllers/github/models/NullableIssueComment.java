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
 * Comments provide a way for people to collaborate on an issue.
 */
@Schema(name = "nullable-issue-comment", description = "Comments provide a way for people to collaborate on an issue.")
@JsonTypeName("nullable-issue-comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableIssueComment {

    private Long id;

    private String nodeId;

    private URI url;

    private String body;

    private String bodyText;

    private String bodyHtml;

    private URI htmlUrl;

    private NullableSimpleUser user = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI issueUrl;

    private AuthorAssociation authorAssociation;

    private NullableIntegration performedViaGithubApp = null;

    private ReactionRollup reactions;

    private NullablePinnedIssueComment pin = null;

    public NullableIssueComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableIssueComment(
            Long id,
            String nodeId,
            URI url,
            URI htmlUrl,
            NullableSimpleUser user,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            URI issueUrl) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.user = user;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.issueUrl = issueUrl;
    }

    public NullableIssueComment id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the issue comment
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the issue comment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NullableIssueComment nodeId(String nodeId) {
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

    public NullableIssueComment url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the issue comment
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repositories/42/issues/comments/1",
            description = "URL for the issue comment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public NullableIssueComment body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Contents of the issue comment
     * @return body
     */
    @Schema(
            name = "body",
            example = "What version of Safari were you using when you observed this bug?",
            description = "Contents of the issue comment",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public NullableIssueComment bodyText(String bodyText) {
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

    public NullableIssueComment bodyHtml(String bodyHtml) {
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

    public NullableIssueComment htmlUrl(URI htmlUrl) {
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

    public NullableIssueComment user(NullableSimpleUser user) {
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
    public NullableSimpleUser getUser() {
        return user;
    }

    public void setUser(NullableSimpleUser user) {
        this.user = user;
    }

    public NullableIssueComment createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2011-04-14T16:00:49Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public NullableIssueComment updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2011-04-14T16:00:49Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public NullableIssueComment issueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
        return this;
    }

    /**
     * Get issueUrl
     * @return issueUrl
     */
    @NotNull
    @Valid
    @Schema(name = "issue_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_url")
    public URI getIssueUrl() {
        return issueUrl;
    }

    public void setIssueUrl(URI issueUrl) {
        this.issueUrl = issueUrl;
    }

    public NullableIssueComment authorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    /**
     * Get authorAssociation
     * @return authorAssociation
     */
    @Valid
    @Schema(name = "author_association", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("author_association")
    public AuthorAssociation getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(AuthorAssociation authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public NullableIssueComment performedViaGithubApp(NullableIntegration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @Valid
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("performed_via_github_app")
    public NullableIntegration getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(NullableIntegration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public NullableIssueComment reactions(ReactionRollup reactions) {
        this.reactions = reactions;
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reactions")
    public ReactionRollup getReactions() {
        return reactions;
    }

    public void setReactions(ReactionRollup reactions) {
        this.reactions = reactions;
    }

    public NullableIssueComment pin(NullablePinnedIssueComment pin) {
        this.pin = pin;
        return this;
    }

    /**
     * Get pin
     * @return pin
     */
    @Valid
    @Schema(name = "pin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pin")
    public NullablePinnedIssueComment getPin() {
        return pin;
    }

    public void setPin(NullablePinnedIssueComment pin) {
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableIssueComment nullableIssueComment = (NullableIssueComment) o;
        return Objects.equals(this.id, nullableIssueComment.id)
                && Objects.equals(this.nodeId, nullableIssueComment.nodeId)
                && Objects.equals(this.url, nullableIssueComment.url)
                && Objects.equals(this.body, nullableIssueComment.body)
                && Objects.equals(this.bodyText, nullableIssueComment.bodyText)
                && Objects.equals(this.bodyHtml, nullableIssueComment.bodyHtml)
                && Objects.equals(this.htmlUrl, nullableIssueComment.htmlUrl)
                && Objects.equals(this.user, nullableIssueComment.user)
                && Objects.equals(this.createdAt, nullableIssueComment.createdAt)
                && Objects.equals(this.updatedAt, nullableIssueComment.updatedAt)
                && Objects.equals(this.issueUrl, nullableIssueComment.issueUrl)
                && Objects.equals(this.authorAssociation, nullableIssueComment.authorAssociation)
                && Objects.equals(this.performedViaGithubApp, nullableIssueComment.performedViaGithubApp)
                && Objects.equals(this.reactions, nullableIssueComment.reactions)
                && Objects.equals(this.pin, nullableIssueComment.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                url,
                body,
                bodyText,
                bodyHtml,
                htmlUrl,
                user,
                createdAt,
                updatedAt,
                issueUrl,
                authorAssociation,
                performedViaGithubApp,
                reactions,
                pin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableIssueComment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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
