package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * The [comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment) itself.
 */
@Schema(
        name = "webhooks_issue_comment",
        description = "The [comment](https://docs.github.com/rest/issues/comments#get-an-issue-comment) itself.")
@JsonTypeName("webhooks_issue_comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksIssueComment {

    /**
     * How the author is associated with the repository.
     */
    public enum AuthorAssociationEnum {
        COLLABORATOR("COLLABORATOR"),

        CONTRIBUTOR("CONTRIBUTOR"),

        FIRST_TIMER("FIRST_TIMER"),

        FIRST_TIME_CONTRIBUTOR("FIRST_TIME_CONTRIBUTOR"),

        MANNEQUIN("MANNEQUIN"),

        MEMBER("MEMBER"),

        NONE("NONE"),

        OWNER("OWNER");

        private final String value;

        AuthorAssociationEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AuthorAssociationEnum fromValue(String value) {
            for (AuthorAssociationEnum b : AuthorAssociationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private AuthorAssociationEnum authorAssociation;

    private String body;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private URI htmlUrl;

    private Long id;

    private URI issueUrl;

    private String nodeId;

    private Integration performedViaGithubApp = null;

    private Reactions reactions;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private User3 user = null;

    private NullablePinnedIssueComment pin = null;

    public WebhooksIssueComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksIssueComment(
            AuthorAssociationEnum authorAssociation,
            String body,
            OffsetDateTime createdAt,
            URI htmlUrl,
            Long id,
            URI issueUrl,
            String nodeId,
            Integration performedViaGithubApp,
            Reactions reactions,
            OffsetDateTime updatedAt,
            URI url,
            User3 user) {
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.createdAt = createdAt;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.issueUrl = issueUrl;
        this.nodeId = nodeId;
        this.performedViaGithubApp = performedViaGithubApp;
        this.reactions = reactions;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = user;
    }

    public WebhooksIssueComment authorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = authorAssociation;
        return this;
    }

    /**
     * How the author is associated with the repository.
     * @return authorAssociation
     */
    @NotNull
    @Schema(
            name = "author_association",
            description = "How the author is associated with the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author_association")
    public AuthorAssociationEnum getAuthorAssociation() {
        return authorAssociation;
    }

    public void setAuthorAssociation(AuthorAssociationEnum authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    public WebhooksIssueComment body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Contents of the issue comment
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "Contents of the issue comment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public WebhooksIssueComment createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public WebhooksIssueComment htmlUrl(URI htmlUrl) {
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

    public WebhooksIssueComment id(Long id) {
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
            description = "Unique identifier of the issue comment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksIssueComment issueUrl(URI issueUrl) {
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

    public WebhooksIssueComment nodeId(String nodeId) {
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

    public WebhooksIssueComment performedViaGithubApp(Integration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @NotNull
    @Valid
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("performed_via_github_app")
    public Integration getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(Integration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public WebhooksIssueComment reactions(Reactions reactions) {
        this.reactions = reactions;
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @NotNull
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reactions")
    public Reactions getReactions() {
        return reactions;
    }

    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    public WebhooksIssueComment updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhooksIssueComment url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the issue comment
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", description = "URL for the issue comment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public WebhooksIssueComment user(User3 user) {
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
    public User3 getUser() {
        return user;
    }

    public void setUser(User3 user) {
        this.user = user;
    }

    public WebhooksIssueComment pin(NullablePinnedIssueComment pin) {
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
        WebhooksIssueComment webhooksIssueComment = (WebhooksIssueComment) o;
        return Objects.equals(this.authorAssociation, webhooksIssueComment.authorAssociation)
                && Objects.equals(this.body, webhooksIssueComment.body)
                && Objects.equals(this.createdAt, webhooksIssueComment.createdAt)
                && Objects.equals(this.htmlUrl, webhooksIssueComment.htmlUrl)
                && Objects.equals(this.id, webhooksIssueComment.id)
                && Objects.equals(this.issueUrl, webhooksIssueComment.issueUrl)
                && Objects.equals(this.nodeId, webhooksIssueComment.nodeId)
                && Objects.equals(this.performedViaGithubApp, webhooksIssueComment.performedViaGithubApp)
                && Objects.equals(this.reactions, webhooksIssueComment.reactions)
                && Objects.equals(this.updatedAt, webhooksIssueComment.updatedAt)
                && Objects.equals(this.url, webhooksIssueComment.url)
                && Objects.equals(this.user, webhooksIssueComment.user)
                && Objects.equals(this.pin, webhooksIssueComment.pin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                authorAssociation,
                body,
                createdAt,
                htmlUrl,
                id,
                issueUrl,
                nodeId,
                performedViaGithubApp,
                reactions,
                updatedAt,
                url,
                user,
                pin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksIssueComment {\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    issueUrl: ").append(toIndentedString(issueUrl)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
