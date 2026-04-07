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
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Legacy Review Comment
 */
@Schema(name = "review-comment", description = "Legacy Review Comment")
@JsonTypeName("review-comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReviewComment {

    private URI url;

    private JsonNullable<Long> pullRequestReviewId = JsonNullable.<Long>undefined();

    private Long id;

    private String nodeId;

    private String diffHunk;

    private String path;

    private JsonNullable<Long> position = JsonNullable.<Long>undefined();

    private Long originalPosition;

    private String commitId;

    private String originalCommitId;

    private Optional<Long> inReplyToId = Optional.empty();

    private JsonNullable<NullableSimpleUser> user = JsonNullable.<NullableSimpleUser>undefined();

    private String body;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI htmlUrl;

    private URI pullRequestUrl;

    private AuthorAssociation authorAssociation;

    private ReviewCommentLinks links;

    private Optional<String> bodyText = Optional.empty();

    private Optional<String> bodyHtml = Optional.empty();

    private Optional<ReactionRollup> reactions = Optional.empty();

    /**
     * The side of the first line of the range for a multi-line comment.
     */
    public enum SideEnum {
        LEFT("LEFT"),

        RIGHT("RIGHT");

        private final String value;

        SideEnum(String value) {
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
        public static SideEnum fromValue(String value) {
            for (SideEnum b : SideEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SideEnum> side = Optional.of(SideEnum.RIGHT);

    /**
     * The side of the first line of the range for a multi-line comment.
     */
    public enum StartSideEnum {
        LEFT("LEFT"),

        RIGHT("RIGHT");

        private final String value;

        StartSideEnum(String value) {
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
        public static StartSideEnum fromValue(String value) {
            for (StartSideEnum b : StartSideEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private JsonNullable<StartSideEnum> startSide = JsonNullable.<StartSideEnum>undefined();

    private Optional<Long> line = Optional.empty();

    private Optional<Long> originalLine = Optional.empty();

    private JsonNullable<Long> startLine = JsonNullable.<Long>undefined();

    private JsonNullable<Long> originalStartLine = JsonNullable.<Long>undefined();

    /**
     * The level at which the comment is targeted, can be a diff line or a file.
     */
    public enum SubjectTypeEnum {
        LINE("line"),

        FILE("file");

        private final String value;

        SubjectTypeEnum(String value) {
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
        public static SubjectTypeEnum fromValue(String value) {
            for (SubjectTypeEnum b : SubjectTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SubjectTypeEnum> subjectType = Optional.empty();

    public ReviewComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReviewComment(
            URI url,
            Long pullRequestReviewId,
            Long id,
            String nodeId,
            String diffHunk,
            String path,
            Long position,
            Long originalPosition,
            String commitId,
            String originalCommitId,
            NullableSimpleUser user,
            String body,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            URI htmlUrl,
            URI pullRequestUrl,
            AuthorAssociation authorAssociation,
            ReviewCommentLinks links) {
        this.url = url;
        this.pullRequestReviewId = JsonNullable.of(pullRequestReviewId);
        this.id = id;
        this.nodeId = nodeId;
        this.diffHunk = diffHunk;
        this.path = path;
        this.position = JsonNullable.of(position);
        this.originalPosition = originalPosition;
        this.commitId = commitId;
        this.originalCommitId = originalCommitId;
        this.user = JsonNullable.of(user);
        this.body = body;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.htmlUrl = htmlUrl;
        this.pullRequestUrl = pullRequestUrl;
        this.authorAssociation = authorAssociation;
        this.links = links;
    }

    public ReviewComment url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/comments/1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public ReviewComment pullRequestReviewId(Long pullRequestReviewId) {
        this.pullRequestReviewId = JsonNullable.of(pullRequestReviewId);
        return this;
    }

    /**
     * Get pullRequestReviewId
     * @return pullRequestReviewId
     */
    @NotNull
    @Schema(name = "pull_request_review_id", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_review_id")
    public JsonNullable<Long> getPullRequestReviewId() {
        return pullRequestReviewId;
    }

    public void setPullRequestReviewId(JsonNullable<Long> pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public ReviewComment id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "10", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ReviewComment nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            example = "MDI0OlB1bGxSZXF1ZXN0UmV2aWV3Q29tbWVudDEw",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ReviewComment diffHunk(String diffHunk) {
        this.diffHunk = diffHunk;
        return this;
    }

    /**
     * Get diffHunk
     * @return diffHunk
     */
    @NotNull
    @Schema(
            name = "diff_hunk",
            example = "@@ -16,33 +16,40 @@ public class Connection : IConnection...",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("diff_hunk")
    public String getDiffHunk() {
        return diffHunk;
    }

    public void setDiffHunk(String diffHunk) {
        this.diffHunk = diffHunk;
    }

    public ReviewComment path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", example = "file1.txt", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ReviewComment position(Long position) {
        this.position = JsonNullable.of(position);
        return this;
    }

    /**
     * Get position
     * @return position
     */
    @NotNull
    @Schema(name = "position", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("position")
    public JsonNullable<Long> getPosition() {
        return position;
    }

    public void setPosition(JsonNullable<Long> position) {
        this.position = position;
    }

    public ReviewComment originalPosition(Long originalPosition) {
        this.originalPosition = originalPosition;
        return this;
    }

    /**
     * Get originalPosition
     * @return originalPosition
     */
    @NotNull
    @Schema(name = "original_position", example = "4", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("original_position")
    public Long getOriginalPosition() {
        return originalPosition;
    }

    public void setOriginalPosition(Long originalPosition) {
        this.originalPosition = originalPosition;
    }

    public ReviewComment commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Get commitId
     * @return commitId
     */
    @NotNull
    @Schema(
            name = "commit_id",
            example = "6dcb09b5b57875f334f61aebed695e2e4193db5e",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public ReviewComment originalCommitId(String originalCommitId) {
        this.originalCommitId = originalCommitId;
        return this;
    }

    /**
     * Get originalCommitId
     * @return originalCommitId
     */
    @NotNull
    @Schema(
            name = "original_commit_id",
            example = "9c48853fa3dc5c1c3d6f1f1cd1f2743e72652840",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("original_commit_id")
    public String getOriginalCommitId() {
        return originalCommitId;
    }

    public void setOriginalCommitId(String originalCommitId) {
        this.originalCommitId = originalCommitId;
    }

    public ReviewComment inReplyToId(Long inReplyToId) {
        this.inReplyToId = Optional.ofNullable(inReplyToId);
        return this;
    }

    /**
     * Get inReplyToId
     * @return inReplyToId
     */
    @Schema(name = "in_reply_to_id", example = "8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("in_reply_to_id")
    public Optional<Long> getInReplyToId() {
        return inReplyToId;
    }

    public void setInReplyToId(Optional<Long> inReplyToId) {
        this.inReplyToId = inReplyToId;
    }

    public ReviewComment user(NullableSimpleUser user) {
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

    public ReviewComment body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @NotNull
    @Schema(name = "body", example = "Great stuff", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public ReviewComment createdAt(OffsetDateTime createdAt) {
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

    public ReviewComment updatedAt(OffsetDateTime updatedAt) {
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

    public ReviewComment htmlUrl(URI htmlUrl) {
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
            example = "https://github.com/octocat/Hello-World/pull/1#discussion-diff-1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public ReviewComment pullRequestUrl(URI pullRequestUrl) {
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
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_url")
    public URI getPullRequestUrl() {
        return pullRequestUrl;
    }

    public void setPullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    public ReviewComment authorAssociation(AuthorAssociation authorAssociation) {
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

    public ReviewComment links(ReviewCommentLinks links) {
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
    public ReviewCommentLinks getLinks() {
        return links;
    }

    public void setLinks(ReviewCommentLinks links) {
        this.links = links;
    }

    public ReviewComment bodyText(String bodyText) {
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

    public ReviewComment bodyHtml(String bodyHtml) {
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

    public ReviewComment reactions(ReactionRollup reactions) {
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

    public ReviewComment side(SideEnum side) {
        this.side = Optional.ofNullable(side);
        return this;
    }

    /**
     * The side of the first line of the range for a multi-line comment.
     * @return side
     */
    @Schema(
            name = "side",
            description = "The side of the first line of the range for a multi-line comment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("side")
    public Optional<SideEnum> getSide() {
        return side;
    }

    public void setSide(Optional<SideEnum> side) {
        this.side = side;
    }

    public ReviewComment startSide(StartSideEnum startSide) {
        this.startSide = JsonNullable.of(startSide);
        return this;
    }

    /**
     * The side of the first line of the range for a multi-line comment.
     * @return startSide
     */
    @Schema(
            name = "start_side",
            description = "The side of the first line of the range for a multi-line comment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_side")
    public JsonNullable<StartSideEnum> getStartSide() {
        return startSide;
    }

    public void setStartSide(JsonNullable<StartSideEnum> startSide) {
        this.startSide = startSide;
    }

    public ReviewComment line(Long line) {
        this.line = Optional.ofNullable(line);
        return this;
    }

    /**
     * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
     * @return line
     */
    @Schema(
            name = "line",
            example = "2",
            description =
                    "The line of the blob to which the comment applies. The last line of the range for a multi-line comment",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("line")
    public Optional<Long> getLine() {
        return line;
    }

    public void setLine(Optional<Long> line) {
        this.line = line;
    }

    public ReviewComment originalLine(Long originalLine) {
        this.originalLine = Optional.ofNullable(originalLine);
        return this;
    }

    /**
     * The original line of the blob to which the comment applies. The last line of the range for a multi-line comment
     * @return originalLine
     */
    @Schema(
            name = "original_line",
            example = "2",
            description =
                    "The original line of the blob to which the comment applies. The last line of the range for a multi-line comment",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("original_line")
    public Optional<Long> getOriginalLine() {
        return originalLine;
    }

    public void setOriginalLine(Optional<Long> originalLine) {
        this.originalLine = originalLine;
    }

    public ReviewComment startLine(Long startLine) {
        this.startLine = JsonNullable.of(startLine);
        return this;
    }

    /**
     * The first line of the range for a multi-line comment.
     * @return startLine
     */
    @Schema(
            name = "start_line",
            example = "2",
            description = "The first line of the range for a multi-line comment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("start_line")
    public JsonNullable<Long> getStartLine() {
        return startLine;
    }

    public void setStartLine(JsonNullable<Long> startLine) {
        this.startLine = startLine;
    }

    public ReviewComment originalStartLine(Long originalStartLine) {
        this.originalStartLine = JsonNullable.of(originalStartLine);
        return this;
    }

    /**
     * The original first line of the range for a multi-line comment.
     * @return originalStartLine
     */
    @Schema(
            name = "original_start_line",
            example = "2",
            description = "The original first line of the range for a multi-line comment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("original_start_line")
    public JsonNullable<Long> getOriginalStartLine() {
        return originalStartLine;
    }

    public void setOriginalStartLine(JsonNullable<Long> originalStartLine) {
        this.originalStartLine = originalStartLine;
    }

    public ReviewComment subjectType(SubjectTypeEnum subjectType) {
        this.subjectType = Optional.ofNullable(subjectType);
        return this;
    }

    /**
     * The level at which the comment is targeted, can be a diff line or a file.
     * @return subjectType
     */
    @Schema(
            name = "subject_type",
            description = "The level at which the comment is targeted, can be a diff line or a file.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subject_type")
    public Optional<SubjectTypeEnum> getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(Optional<SubjectTypeEnum> subjectType) {
        this.subjectType = subjectType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReviewComment reviewComment = (ReviewComment) o;
        return Objects.equals(this.url, reviewComment.url)
                && Objects.equals(this.pullRequestReviewId, reviewComment.pullRequestReviewId)
                && Objects.equals(this.id, reviewComment.id)
                && Objects.equals(this.nodeId, reviewComment.nodeId)
                && Objects.equals(this.diffHunk, reviewComment.diffHunk)
                && Objects.equals(this.path, reviewComment.path)
                && Objects.equals(this.position, reviewComment.position)
                && Objects.equals(this.originalPosition, reviewComment.originalPosition)
                && Objects.equals(this.commitId, reviewComment.commitId)
                && Objects.equals(this.originalCommitId, reviewComment.originalCommitId)
                && Objects.equals(this.inReplyToId, reviewComment.inReplyToId)
                && Objects.equals(this.user, reviewComment.user)
                && Objects.equals(this.body, reviewComment.body)
                && Objects.equals(this.createdAt, reviewComment.createdAt)
                && Objects.equals(this.updatedAt, reviewComment.updatedAt)
                && Objects.equals(this.htmlUrl, reviewComment.htmlUrl)
                && Objects.equals(this.pullRequestUrl, reviewComment.pullRequestUrl)
                && Objects.equals(this.authorAssociation, reviewComment.authorAssociation)
                && Objects.equals(this.links, reviewComment.links)
                && Objects.equals(this.bodyText, reviewComment.bodyText)
                && Objects.equals(this.bodyHtml, reviewComment.bodyHtml)
                && Objects.equals(this.reactions, reviewComment.reactions)
                && Objects.equals(this.side, reviewComment.side)
                && equalsNullable(this.startSide, reviewComment.startSide)
                && Objects.equals(this.line, reviewComment.line)
                && Objects.equals(this.originalLine, reviewComment.originalLine)
                && equalsNullable(this.startLine, reviewComment.startLine)
                && equalsNullable(this.originalStartLine, reviewComment.originalStartLine)
                && Objects.equals(this.subjectType, reviewComment.subjectType);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                pullRequestReviewId,
                id,
                nodeId,
                diffHunk,
                path,
                position,
                originalPosition,
                commitId,
                originalCommitId,
                inReplyToId,
                user,
                body,
                createdAt,
                updatedAt,
                htmlUrl,
                pullRequestUrl,
                authorAssociation,
                links,
                bodyText,
                bodyHtml,
                reactions,
                side,
                hashCodeNullable(startSide),
                line,
                originalLine,
                hashCodeNullable(startLine),
                hashCodeNullable(originalStartLine),
                subjectType);
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
        sb.append("class ReviewComment {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    pullRequestReviewId: ")
                .append(toIndentedString(pullRequestReviewId))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    diffHunk: ").append(toIndentedString(diffHunk)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    originalPosition: ")
                .append(toIndentedString(originalPosition))
                .append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    originalCommitId: ")
                .append(toIndentedString(originalCommitId))
                .append("\n");
        sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    pullRequestUrl: ")
                .append(toIndentedString(pullRequestUrl))
                .append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    bodyText: ").append(toIndentedString(bodyText)).append("\n");
        sb.append("    bodyHtml: ").append(toIndentedString(bodyHtml)).append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    startSide: ").append(toIndentedString(startSide)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    originalLine: ").append(toIndentedString(originalLine)).append("\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    originalStartLine: ")
                .append(toIndentedString(originalStartLine))
                .append("\n");
        sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
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
