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
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * PullRequestReviewCommentEventComment
 */
@JsonTypeName("PullRequestReviewCommentEvent_comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewCommentEventComment {

    private Long id;

    private String nodeId;

    private URI url;

    private JsonNullable<Long> pullRequestReviewId = JsonNullable.<Long>undefined();

    private String diffHunk;

    private String path;

    private JsonNullable<Long> position = JsonNullable.<Long>undefined();

    private Long originalPosition;

    private JsonNullable<String> subjectType = JsonNullable.<String>undefined();

    private String commitId;

    private User2 user;

    private String body;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI htmlUrl;

    private URI pullRequestUrl;

    private PullRequestReviewCommentEventCommentLinks links;

    private String originalCommitId;

    private Reactions1 reactions;

    private Optional<Long> inReplyToId = Optional.empty();

    public PullRequestReviewCommentEventComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReviewCommentEventComment(
            Long id,
            String nodeId,
            URI url,
            Long pullRequestReviewId,
            String diffHunk,
            String path,
            Long position,
            Long originalPosition,
            String commitId,
            User2 user,
            String body,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            URI htmlUrl,
            URI pullRequestUrl,
            PullRequestReviewCommentEventCommentLinks links,
            String originalCommitId,
            Reactions1 reactions) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.pullRequestReviewId = JsonNullable.of(pullRequestReviewId);
        this.diffHunk = diffHunk;
        this.path = path;
        this.position = JsonNullable.of(position);
        this.originalPosition = originalPosition;
        this.commitId = commitId;
        this.user = user;
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.htmlUrl = htmlUrl;
        this.pullRequestUrl = pullRequestUrl;
        this.links = links;
        this.originalCommitId = originalCommitId;
        this.reactions = reactions;
    }

    public PullRequestReviewCommentEventComment id(Long id) {
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

    public PullRequestReviewCommentEventComment nodeId(String nodeId) {
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

    public PullRequestReviewCommentEventComment url(URI url) {
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

    public PullRequestReviewCommentEventComment pullRequestReviewId(Long pullRequestReviewId) {
        this.pullRequestReviewId = JsonNullable.of(pullRequestReviewId);
        return this;
    }

    /**
     * Get pullRequestReviewId
     * @return pullRequestReviewId
     */
    @NotNull
    @Schema(name = "pull_request_review_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_review_id")
    public JsonNullable<Long> getPullRequestReviewId() {
        return pullRequestReviewId;
    }

    public void setPullRequestReviewId(JsonNullable<Long> pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public PullRequestReviewCommentEventComment diffHunk(String diffHunk) {
        this.diffHunk = diffHunk;
        return this;
    }

    /**
     * Get diffHunk
     * @return diffHunk
     */
    @NotNull
    @Schema(name = "diff_hunk", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("diff_hunk")
    public String getDiffHunk() {
        return diffHunk;
    }

    public void setDiffHunk(String diffHunk) {
        this.diffHunk = diffHunk;
    }

    public PullRequestReviewCommentEventComment path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PullRequestReviewCommentEventComment position(Long position) {
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

    public PullRequestReviewCommentEventComment originalPosition(Long originalPosition) {
        this.originalPosition = originalPosition;
        return this;
    }

    /**
     * Get originalPosition
     * @return originalPosition
     */
    @NotNull
    @Schema(name = "original_position", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("original_position")
    public Long getOriginalPosition() {
        return originalPosition;
    }

    public void setOriginalPosition(Long originalPosition) {
        this.originalPosition = originalPosition;
    }

    public PullRequestReviewCommentEventComment subjectType(String subjectType) {
        this.subjectType = JsonNullable.of(subjectType);
        return this;
    }

    /**
     * Get subjectType
     * @return subjectType
     */
    @Schema(name = "subject_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subject_type")
    public JsonNullable<String> getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(JsonNullable<String> subjectType) {
        this.subjectType = subjectType;
    }

    public PullRequestReviewCommentEventComment commitId(String commitId) {
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

    public PullRequestReviewCommentEventComment user(User2 user) {
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
    public User2 getUser() {
        return user;
    }

    public void setUser(User2 user) {
        this.user = user;
    }

    public PullRequestReviewCommentEventComment body(String body) {
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

    public PullRequestReviewCommentEventComment createdAt(OffsetDateTime createdAt) {
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

    public PullRequestReviewCommentEventComment updatedAt(OffsetDateTime updatedAt) {
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

    public PullRequestReviewCommentEventComment htmlUrl(URI htmlUrl) {
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

    public PullRequestReviewCommentEventComment pullRequestUrl(URI pullRequestUrl) {
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

    public PullRequestReviewCommentEventComment links(PullRequestReviewCommentEventCommentLinks links) {
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
    public PullRequestReviewCommentEventCommentLinks getLinks() {
        return links;
    }

    public void setLinks(PullRequestReviewCommentEventCommentLinks links) {
        this.links = links;
    }

    public PullRequestReviewCommentEventComment originalCommitId(String originalCommitId) {
        this.originalCommitId = originalCommitId;
        return this;
    }

    /**
     * Get originalCommitId
     * @return originalCommitId
     */
    @NotNull
    @Schema(name = "original_commit_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("original_commit_id")
    public String getOriginalCommitId() {
        return originalCommitId;
    }

    public void setOriginalCommitId(String originalCommitId) {
        this.originalCommitId = originalCommitId;
    }

    public PullRequestReviewCommentEventComment reactions(Reactions1 reactions) {
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
    public Reactions1 getReactions() {
        return reactions;
    }

    public void setReactions(Reactions1 reactions) {
        this.reactions = reactions;
    }

    public PullRequestReviewCommentEventComment inReplyToId(Long inReplyToId) {
        this.inReplyToId = Optional.ofNullable(inReplyToId);
        return this;
    }

    /**
     * Get inReplyToId
     * @return inReplyToId
     */
    @Schema(name = "in_reply_to_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("in_reply_to_id")
    public Optional<Long> getInReplyToId() {
        return inReplyToId;
    }

    public void setInReplyToId(Optional<Long> inReplyToId) {
        this.inReplyToId = inReplyToId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestReviewCommentEventComment pullRequestReviewCommentEventComment =
                (PullRequestReviewCommentEventComment) o;
        return Objects.equals(this.id, pullRequestReviewCommentEventComment.id)
                && Objects.equals(this.nodeId, pullRequestReviewCommentEventComment.nodeId)
                && Objects.equals(this.url, pullRequestReviewCommentEventComment.url)
                && Objects.equals(this.pullRequestReviewId, pullRequestReviewCommentEventComment.pullRequestReviewId)
                && Objects.equals(this.diffHunk, pullRequestReviewCommentEventComment.diffHunk)
                && Objects.equals(this.path, pullRequestReviewCommentEventComment.path)
                && Objects.equals(this.position, pullRequestReviewCommentEventComment.position)
                && Objects.equals(this.originalPosition, pullRequestReviewCommentEventComment.originalPosition)
                && equalsNullable(this.subjectType, pullRequestReviewCommentEventComment.subjectType)
                && Objects.equals(this.commitId, pullRequestReviewCommentEventComment.commitId)
                && Objects.equals(this.user, pullRequestReviewCommentEventComment.user)
                && Objects.equals(this.body, pullRequestReviewCommentEventComment.body)
                && Objects.equals(this.createdAt, pullRequestReviewCommentEventComment.createdAt)
                && Objects.equals(this.updatedAt, pullRequestReviewCommentEventComment.updatedAt)
                && Objects.equals(this.htmlUrl, pullRequestReviewCommentEventComment.htmlUrl)
                && Objects.equals(this.pullRequestUrl, pullRequestReviewCommentEventComment.pullRequestUrl)
                && Objects.equals(this.links, pullRequestReviewCommentEventComment.links)
                && Objects.equals(this.originalCommitId, pullRequestReviewCommentEventComment.originalCommitId)
                && Objects.equals(this.reactions, pullRequestReviewCommentEventComment.reactions)
                && Objects.equals(this.inReplyToId, pullRequestReviewCommentEventComment.inReplyToId);
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
                url,
                pullRequestReviewId,
                diffHunk,
                path,
                position,
                originalPosition,
                hashCodeNullable(subjectType),
                commitId,
                user,
                body,
                createdAt,
                updatedAt,
                htmlUrl,
                pullRequestUrl,
                links,
                originalCommitId,
                reactions,
                inReplyToId);
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
        sb.append("class PullRequestReviewCommentEventComment {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    pullRequestReviewId: ")
                .append(toIndentedString(pullRequestReviewId))
                .append("\n");
        sb.append("    diffHunk: ").append(toIndentedString(diffHunk)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    originalPosition: ")
                .append(toIndentedString(originalPosition))
                .append("\n");
        sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    pullRequestUrl: ")
                .append(toIndentedString(pullRequestUrl))
                .append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    originalCommitId: ")
                .append(toIndentedString(originalCommitId))
                .append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
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
