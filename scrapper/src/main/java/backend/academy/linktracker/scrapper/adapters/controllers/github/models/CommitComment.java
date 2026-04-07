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
 * Commit Comment
 */
@Schema(name = "commit-comment", description = "Commit Comment")
@JsonTypeName("commit-comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommitComment {

    private URI htmlUrl;

    private URI url;

    private Long id;

    private String nodeId;

    private String body;

    private JsonNullable<String> path = JsonNullable.<String>undefined();

    private JsonNullable<Long> position = JsonNullable.<Long>undefined();

    private JsonNullable<Long> line = JsonNullable.<Long>undefined();

    private String commitId;

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private AuthorAssociation authorAssociation;

    private Optional<ReactionRollup> reactions = Optional.empty();

    public CommitComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CommitComment(
            URI htmlUrl,
            URI url,
            Long id,
            String nodeId,
            String body,
            String path,
            Long position,
            Long line,
            String commitId,
            NullableSimpleUser user,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            AuthorAssociation authorAssociation) {
        this.htmlUrl = htmlUrl;
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.body = body;
        this.path = JsonNullable.of(path);
        this.position = JsonNullable.of(position);
        this.line = JsonNullable.of(line);
        this.commitId = commitId;
        this.user = JsonNullable.of(user);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.authorAssociation = authorAssociation;
    }

    public CommitComment htmlUrl(URI htmlUrl) {
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

    public CommitComment url(URI url) {
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

    public CommitComment id(Long id) {
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

    public CommitComment nodeId(String nodeId) {
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

    public CommitComment body(String body) {
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

    public CommitComment path(String path) {
        this.path = JsonNullable.of(path);
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public JsonNullable<String> getPath() {
        return path;
    }

    public void setPath(JsonNullable<String> path) {
        this.path = path;
    }

    public CommitComment position(Long position) {
        this.position = JsonNullable.of(position);
        return this;
    }

    /**
     * Get position
     * @return position
     */
    @NotNull
    @Schema(name = "position", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("position")
    public JsonNullable<Long> getPosition() {
        return position;
    }

    public void setPosition(JsonNullable<Long> position) {
        this.position = position;
    }

    public CommitComment line(Long line) {
        this.line = JsonNullable.of(line);
        return this;
    }

    /**
     * Get line
     * @return line
     */
    @NotNull
    @Schema(name = "line", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("line")
    public JsonNullable<Long> getLine() {
        return line;
    }

    public void setLine(JsonNullable<Long> line) {
        this.line = line;
    }

    public CommitComment commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Get commitId
     * @return commitId
     */
    @NotNull
    @Schema(name = "commit_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public CommitComment user(NullableSimpleUser user) {
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

    public CommitComment createdAt(OffsetDateTime createdAt) {
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

    public CommitComment updatedAt(OffsetDateTime updatedAt) {
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

    public CommitComment authorAssociation(AuthorAssociation authorAssociation) {
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

    public CommitComment reactions(ReactionRollup reactions) {
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
    public Optional<ReactionRollup> getReactions() {
        return reactions;
    }

    public void setReactions(Optional<ReactionRollup> reactions) {
        this.reactions = reactions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitComment commitComment = (CommitComment) o;
        return Objects.equals(this.htmlUrl, commitComment.htmlUrl)
                && Objects.equals(this.url, commitComment.url)
                && Objects.equals(this.id, commitComment.id)
                && Objects.equals(this.nodeId, commitComment.nodeId)
                && Objects.equals(this.body, commitComment.body)
                && Objects.equals(this.path, commitComment.path)
                && Objects.equals(this.position, commitComment.position)
                && Objects.equals(this.line, commitComment.line)
                && Objects.equals(this.commitId, commitComment.commitId)
                && Objects.equals(this.user, commitComment.user)
                && Objects.equals(this.createdAt, commitComment.createdAt)
                && Objects.equals(this.updatedAt, commitComment.updatedAt)
                && Objects.equals(this.authorAssociation, commitComment.authorAssociation)
                && Objects.equals(this.reactions, commitComment.reactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                htmlUrl,
                url,
                id,
                nodeId,
                body,
                path,
                position,
                line,
                commitId,
                user,
                createdAt,
                updatedAt,
                authorAssociation,
                reactions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitComment {\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
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
