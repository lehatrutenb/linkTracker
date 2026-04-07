package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The [commit comment](${externalDocsUpapp/api/description/components/schemas/webhooks/issue-comment-created.yamlrl}/rest/commits/comments#get-a-commit-comment) resource.
 */
@Schema(
        name = "webhook_commit_comment_created_comment",
        description =
                "The [commit comment](${externalDocsUpapp/api/description/components/schemas/webhooks/issue-comment-created.yamlrl}/rest/commits/comments#get-a-commit-comment) resource.")
@JsonTypeName("webhook_commit_comment_created_comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCommitCommentCreatedComment {

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

    private String commitId;

    private String createdAt;

    private URI htmlUrl;

    private Long id;

    private JsonNullable<Long> line = JsonNullable.<Long>undefined();

    private String nodeId;

    private JsonNullable<String> path = JsonNullable.<String>undefined();

    private JsonNullable<Long> position = JsonNullable.<Long>undefined();

    private Optional<Reactions> reactions = Optional.empty();

    private String updatedAt;

    private URI url;

    private JsonNullable<User1> user = JsonNullable.<User1>undefined();

    public WebhookCommitCommentCreatedComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCommitCommentCreatedComment(
            AuthorAssociationEnum authorAssociation,
            String body,
            String commitId,
            String createdAt,
            URI htmlUrl,
            Long id,
            Long line,
            String nodeId,
            String path,
            Long position,
            String updatedAt,
            URI url,
            User1 user) {
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.commitId = commitId;
        this.createdAt = createdAt;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.line = JsonNullable.of(line);
        this.nodeId = nodeId;
        this.path = JsonNullable.of(path);
        this.position = JsonNullable.of(position);
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = JsonNullable.of(user);
    }

    public WebhookCommitCommentCreatedComment authorAssociation(AuthorAssociationEnum authorAssociation) {
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

    public WebhookCommitCommentCreatedComment body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The text of the comment.
     * @return body
     */
    @NotNull
    @Schema(name = "body", description = "The text of the comment.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public WebhookCommitCommentCreatedComment commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * The SHA of the commit to which the comment applies.
     * @return commitId
     */
    @NotNull
    @Schema(
            name = "commit_id",
            description = "The SHA of the commit to which the comment applies.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public WebhookCommitCommentCreatedComment createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookCommitCommentCreatedComment htmlUrl(URI htmlUrl) {
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

    public WebhookCommitCommentCreatedComment id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the commit comment.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The ID of the commit comment.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookCommitCommentCreatedComment line(Long line) {
        this.line = JsonNullable.of(line);
        return this;
    }

    /**
     * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
     * @return line
     */
    @NotNull
    @Schema(
            name = "line",
            description =
                    "The line of the blob to which the comment applies. The last line of the range for a multi-line comment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("line")
    public JsonNullable<Long> getLine() {
        return line;
    }

    public void setLine(JsonNullable<Long> line) {
        this.line = line;
    }

    public WebhookCommitCommentCreatedComment nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node ID of the commit comment.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            description = "The node ID of the commit comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public WebhookCommitCommentCreatedComment path(String path) {
        this.path = JsonNullable.of(path);
        return this;
    }

    /**
     * The relative path of the file to which the comment applies.
     * @return path
     */
    @NotNull
    @Schema(
            name = "path",
            description = "The relative path of the file to which the comment applies.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public JsonNullable<String> getPath() {
        return path;
    }

    public void setPath(JsonNullable<String> path) {
        this.path = path;
    }

    public WebhookCommitCommentCreatedComment position(Long position) {
        this.position = JsonNullable.of(position);
        return this;
    }

    /**
     * The line index in the diff to which the comment applies.
     * @return position
     */
    @NotNull
    @Schema(
            name = "position",
            description = "The line index in the diff to which the comment applies.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("position")
    public JsonNullable<Long> getPosition() {
        return position;
    }

    public void setPosition(JsonNullable<Long> position) {
        this.position = position;
    }

    public WebhookCommitCommentCreatedComment reactions(Reactions reactions) {
        this.reactions = Optional.ofNullable(reactions);
        return this;
    }

    /**
     * Get reactions
     * @return reactions
     */
    @Valid
    @Schema(name = "reactions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reactions")
    public Optional<Reactions> getReactions() {
        return reactions;
    }

    public void setReactions(Optional<Reactions> reactions) {
        this.reactions = reactions;
    }

    public WebhookCommitCommentCreatedComment updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhookCommitCommentCreatedComment url(URI url) {
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

    public WebhookCommitCommentCreatedComment user(User1 user) {
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
    public JsonNullable<User1> getUser() {
        return user;
    }

    public void setUser(JsonNullable<User1> user) {
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
        WebhookCommitCommentCreatedComment webhookCommitCommentCreatedComment = (WebhookCommitCommentCreatedComment) o;
        return Objects.equals(this.authorAssociation, webhookCommitCommentCreatedComment.authorAssociation)
                && Objects.equals(this.body, webhookCommitCommentCreatedComment.body)
                && Objects.equals(this.commitId, webhookCommitCommentCreatedComment.commitId)
                && Objects.equals(this.createdAt, webhookCommitCommentCreatedComment.createdAt)
                && Objects.equals(this.htmlUrl, webhookCommitCommentCreatedComment.htmlUrl)
                && Objects.equals(this.id, webhookCommitCommentCreatedComment.id)
                && Objects.equals(this.line, webhookCommitCommentCreatedComment.line)
                && Objects.equals(this.nodeId, webhookCommitCommentCreatedComment.nodeId)
                && Objects.equals(this.path, webhookCommitCommentCreatedComment.path)
                && Objects.equals(this.position, webhookCommitCommentCreatedComment.position)
                && Objects.equals(this.reactions, webhookCommitCommentCreatedComment.reactions)
                && Objects.equals(this.updatedAt, webhookCommitCommentCreatedComment.updatedAt)
                && Objects.equals(this.url, webhookCommitCommentCreatedComment.url)
                && Objects.equals(this.user, webhookCommitCommentCreatedComment.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                authorAssociation,
                body,
                commitId,
                createdAt,
                htmlUrl,
                id,
                line,
                nodeId,
                path,
                position,
                reactions,
                updatedAt,
                url,
                user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCommitCommentCreatedComment {\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
