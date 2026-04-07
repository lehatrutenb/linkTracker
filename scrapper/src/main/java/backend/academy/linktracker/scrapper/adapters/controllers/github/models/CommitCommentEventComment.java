package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * CommitCommentEventComment
 */
@JsonTypeName("commit_comment_event_comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommitCommentEventComment {

    private Optional<URI> htmlUrl = Optional.empty();

    private Optional<URI> url = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> body = Optional.empty();

    private JsonNullable<String> path = JsonNullable.<String>undefined();

    private JsonNullable<Long> position = JsonNullable.<Long>undefined();

    private JsonNullable<Long> line = JsonNullable.<Long>undefined();

    private Optional<String> commitId = Optional.empty();

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> createdAt = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> updatedAt = Optional.empty();

    private Optional<ReactionRollup> reactions = Optional.empty();

    public CommitCommentEventComment htmlUrl(URI htmlUrl) {
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

    public CommitCommentEventComment url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    public CommitCommentEventComment id(Long id) {
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

    public CommitCommentEventComment nodeId(String nodeId) {
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

    public CommitCommentEventComment body(String body) {
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

    public CommitCommentEventComment path(String path) {
        this.path = JsonNullable.of(path);
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @Schema(name = "path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("path")
    public JsonNullable<String> getPath() {
        return path;
    }

    public void setPath(JsonNullable<String> path) {
        this.path = path;
    }

    public CommitCommentEventComment position(Long position) {
        this.position = JsonNullable.of(position);
        return this;
    }

    /**
     * Get position
     * @return position
     */
    @Schema(name = "position", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("position")
    public JsonNullable<Long> getPosition() {
        return position;
    }

    public void setPosition(JsonNullable<Long> position) {
        this.position = position;
    }

    public CommitCommentEventComment line(Long line) {
        this.line = JsonNullable.of(line);
        return this;
    }

    /**
     * Get line
     * @return line
     */
    @Schema(name = "line", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("line")
    public JsonNullable<Long> getLine() {
        return line;
    }

    public void setLine(JsonNullable<Long> line) {
        this.line = line;
    }

    public CommitCommentEventComment commitId(String commitId) {
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

    public CommitCommentEventComment user(NullableSimpleUser user) {
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

    public CommitCommentEventComment createdAt(OffsetDateTime createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public CommitCommentEventComment updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CommitCommentEventComment reactions(ReactionRollup reactions) {
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
        CommitCommentEventComment commitCommentEventComment = (CommitCommentEventComment) o;
        return Objects.equals(this.htmlUrl, commitCommentEventComment.htmlUrl)
                && Objects.equals(this.url, commitCommentEventComment.url)
                && Objects.equals(this.id, commitCommentEventComment.id)
                && Objects.equals(this.nodeId, commitCommentEventComment.nodeId)
                && Objects.equals(this.body, commitCommentEventComment.body)
                && equalsNullable(this.path, commitCommentEventComment.path)
                && equalsNullable(this.position, commitCommentEventComment.position)
                && equalsNullable(this.line, commitCommentEventComment.line)
                && Objects.equals(this.commitId, commitCommentEventComment.commitId)
                && equalsNullable(this.user, commitCommentEventComment.user)
                && Objects.equals(this.createdAt, commitCommentEventComment.createdAt)
                && Objects.equals(this.updatedAt, commitCommentEventComment.updatedAt)
                && Objects.equals(this.reactions, commitCommentEventComment.reactions);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                htmlUrl,
                url,
                id,
                nodeId,
                body,
                hashCodeNullable(path),
                hashCodeNullable(position),
                hashCodeNullable(line),
                commitId,
                hashCodeNullable(user),
                createdAt,
                updatedAt,
                reactions);
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
        sb.append("class CommitCommentEventComment {\n");
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
