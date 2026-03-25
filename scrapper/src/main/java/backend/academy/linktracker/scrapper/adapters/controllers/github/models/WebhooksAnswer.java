package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhooksAnswer
 */
@JsonTypeName("webhooks_answer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksAnswer {

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

    private Long childCommentCount;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Long discussionId;

    private String htmlUrl;

    private Long id;

    private String nodeId;

    private Object parentId = null;

    private Reactions reactions;

    private String repositoryUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private User1 user = null;

    public WebhooksAnswer() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksAnswer(
            AuthorAssociationEnum authorAssociation,
            String body,
            Long childCommentCount,
            OffsetDateTime createdAt,
            Long discussionId,
            String htmlUrl,
            Long id,
            String nodeId,
            Object parentId,
            String repositoryUrl,
            OffsetDateTime updatedAt,
            User1 user) {
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.childCommentCount = childCommentCount;
        this.createdAt = createdAt;
        this.discussionId = discussionId;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.parentId = parentId;
        this.repositoryUrl = repositoryUrl;
        this.updatedAt = updatedAt;
        this.user = user;
    }

    public WebhooksAnswer authorAssociation(AuthorAssociationEnum authorAssociation) {
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

    public WebhooksAnswer body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Schema(name = "body", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public WebhooksAnswer childCommentCount(Long childCommentCount) {
        this.childCommentCount = childCommentCount;
        return this;
    }

    /**
     * Get childCommentCount
     * @return childCommentCount
     */
    @NotNull
    @Schema(name = "child_comment_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("child_comment_count")
    public Long getChildCommentCount() {
        return childCommentCount;
    }

    public void setChildCommentCount(Long childCommentCount) {
        this.childCommentCount = childCommentCount;
    }

    public WebhooksAnswer createdAt(OffsetDateTime createdAt) {
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

    public WebhooksAnswer discussionId(Long discussionId) {
        this.discussionId = discussionId;
        return this;
    }

    /**
     * Get discussionId
     * @return discussionId
     */
    @NotNull
    @Schema(name = "discussion_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("discussion_id")
    public Long getDiscussionId() {
        return discussionId;
    }

    public void setDiscussionId(Long discussionId) {
        this.discussionId = discussionId;
    }

    public WebhooksAnswer htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhooksAnswer id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksAnswer nodeId(String nodeId) {
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

    public WebhooksAnswer parentId(Object parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Get parentId
     * @return parentId
     */
    @NotNull
    @Schema(name = "parent_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("parent_id")
    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public WebhooksAnswer reactions(Reactions reactions) {
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
    public Reactions getReactions() {
        return reactions;
    }

    public void setReactions(Reactions reactions) {
        this.reactions = reactions;
    }

    public WebhooksAnswer repositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @NotNull
    @Schema(name = "repository_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public WebhooksAnswer updatedAt(OffsetDateTime updatedAt) {
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

    public WebhooksAnswer user(User1 user) {
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
        WebhooksAnswer webhooksAnswer = (WebhooksAnswer) o;
        return Objects.equals(this.authorAssociation, webhooksAnswer.authorAssociation)
                && Objects.equals(this.body, webhooksAnswer.body)
                && Objects.equals(this.childCommentCount, webhooksAnswer.childCommentCount)
                && Objects.equals(this.createdAt, webhooksAnswer.createdAt)
                && Objects.equals(this.discussionId, webhooksAnswer.discussionId)
                && Objects.equals(this.htmlUrl, webhooksAnswer.htmlUrl)
                && Objects.equals(this.id, webhooksAnswer.id)
                && Objects.equals(this.nodeId, webhooksAnswer.nodeId)
                && Objects.equals(this.parentId, webhooksAnswer.parentId)
                && Objects.equals(this.reactions, webhooksAnswer.reactions)
                && Objects.equals(this.repositoryUrl, webhooksAnswer.repositoryUrl)
                && Objects.equals(this.updatedAt, webhooksAnswer.updatedAt)
                && Objects.equals(this.user, webhooksAnswer.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                authorAssociation,
                body,
                childCommentCount,
                createdAt,
                discussionId,
                htmlUrl,
                id,
                nodeId,
                parentId,
                reactions,
                repositoryUrl,
                updatedAt,
                user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksAnswer {\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    childCommentCount: ")
                .append(toIndentedString(childCommentCount))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    discussionId: ").append(toIndentedString(discussionId)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
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
