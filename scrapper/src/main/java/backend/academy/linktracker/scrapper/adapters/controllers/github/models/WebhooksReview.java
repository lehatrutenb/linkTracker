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
 * The review that was affected.
 */
@Schema(name = "webhooks_review", description = "The review that was affected.")
@JsonTypeName("webhooks_review")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksReview {

    private WebhooksReviewLinks links;

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

    private String body = null;

    private String commitId;

    private URI htmlUrl;

    private Long id;

    private String nodeId;

    private URI pullRequestUrl;

    private String state;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime submittedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    private User1 user = null;

    public WebhooksReview() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksReview(
            WebhooksReviewLinks links,
            AuthorAssociationEnum authorAssociation,
            String body,
            String commitId,
            URI htmlUrl,
            Long id,
            String nodeId,
            URI pullRequestUrl,
            String state,
            OffsetDateTime submittedAt,
            User1 user) {
        this.links = links;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.commitId = commitId;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.pullRequestUrl = pullRequestUrl;
        this.state = state;
        this.submittedAt = submittedAt;
        this.user = user;
    }

    public WebhooksReview links(WebhooksReviewLinks links) {
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
    public WebhooksReviewLinks getLinks() {
        return links;
    }

    public void setLinks(WebhooksReviewLinks links) {
        this.links = links;
    }

    public WebhooksReview authorAssociation(AuthorAssociationEnum authorAssociation) {
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

    public WebhooksReview body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The text of the review.
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "The text of the review.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public WebhooksReview commitId(String commitId) {
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
            description = "A commit SHA for the review.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public WebhooksReview htmlUrl(URI htmlUrl) {
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

    public WebhooksReview id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the review
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "Unique identifier of the review", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksReview nodeId(String nodeId) {
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

    public WebhooksReview pullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
        return this;
    }

    /**
     * Get pullRequestUrl
     * @return pullRequestUrl
     */
    @NotNull
    @Valid
    @Schema(name = "pull_request_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_url")
    public URI getPullRequestUrl() {
        return pullRequestUrl;
    }

    public void setPullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    public WebhooksReview state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public WebhooksReview submittedAt(OffsetDateTime submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }

    /**
     * Get submittedAt
     * @return submittedAt
     */
    @NotNull
    @Valid
    @Schema(name = "submitted_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("submitted_at")
    public OffsetDateTime getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(OffsetDateTime submittedAt) {
        this.submittedAt = submittedAt;
    }

    public WebhooksReview updatedAt(OffsetDateTime updatedAt) {
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

    public WebhooksReview user(User1 user) {
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
    public User1 getUser() {
        return user;
    }

    public void setUser(User1 user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksReview webhooksReview = (WebhooksReview) o;
        return Objects.equals(this.links, webhooksReview.links)
                && Objects.equals(this.authorAssociation, webhooksReview.authorAssociation)
                && Objects.equals(this.body, webhooksReview.body)
                && Objects.equals(this.commitId, webhooksReview.commitId)
                && Objects.equals(this.htmlUrl, webhooksReview.htmlUrl)
                && Objects.equals(this.id, webhooksReview.id)
                && Objects.equals(this.nodeId, webhooksReview.nodeId)
                && Objects.equals(this.pullRequestUrl, webhooksReview.pullRequestUrl)
                && Objects.equals(this.state, webhooksReview.state)
                && Objects.equals(this.submittedAt, webhooksReview.submittedAt)
                && Objects.equals(this.updatedAt, webhooksReview.updatedAt)
                && Objects.equals(this.user, webhooksReview.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                links,
                authorAssociation,
                body,
                commitId,
                htmlUrl,
                id,
                nodeId,
                pullRequestUrl,
                state,
                submittedAt,
                updatedAt,
                user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksReview {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    pullRequestUrl: ")
                .append(toIndentedString(pullRequestUrl))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
