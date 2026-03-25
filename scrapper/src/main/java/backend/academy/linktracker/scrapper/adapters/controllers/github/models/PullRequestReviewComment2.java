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
 * The [comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request) itself.
 */
@Schema(
        name = "Pull_Request_Review_Comment_2",
        description =
                "The [comment](https://docs.github.com/rest/pulls/comments#get-a-review-comment-for-a-pull-request) itself.")
@JsonTypeName("Pull_Request_Review_Comment_2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewComment2 {

    private WebhooksReviewCommentLinks links;

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

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private String diffHunk;

    private URI htmlUrl;

    private Long id;

    private Long inReplyToId;

    private Long line = null;

    private String nodeId;

    private String originalCommitId;

    private Long originalLine;

    private Long originalPosition;

    private Long originalStartLine = null;

    private String path;

    private Long position = null;

    private Long pullRequestReviewId = null;

    private URI pullRequestUrl;

    private Reactions reactions;

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

    private SideEnum side;

    private Long startLine = null;

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

    private StartSideEnum startSide = null;

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

    private SubjectTypeEnum subjectType;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private User1 user = null;

    public PullRequestReviewComment2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReviewComment2(
            WebhooksReviewCommentLinks links,
            AuthorAssociationEnum authorAssociation,
            String body,
            String commitId,
            OffsetDateTime createdAt,
            String diffHunk,
            URI htmlUrl,
            Long id,
            Long line,
            String nodeId,
            String originalCommitId,
            Long originalLine,
            Long originalPosition,
            Long originalStartLine,
            String path,
            Long position,
            Long pullRequestReviewId,
            URI pullRequestUrl,
            Reactions reactions,
            SideEnum side,
            Long startLine,
            StartSideEnum startSide,
            OffsetDateTime updatedAt,
            URI url,
            User1 user) {
        this.links = links;
        this.authorAssociation = authorAssociation;
        this.body = body;
        this.commitId = commitId;
        this.createdAt = createdAt;
        this.diffHunk = diffHunk;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.line = line;
        this.nodeId = nodeId;
        this.originalCommitId = originalCommitId;
        this.originalLine = originalLine;
        this.originalPosition = originalPosition;
        this.originalStartLine = originalStartLine;
        this.path = path;
        this.position = position;
        this.pullRequestReviewId = pullRequestReviewId;
        this.pullRequestUrl = pullRequestUrl;
        this.reactions = reactions;
        this.side = side;
        this.startLine = startLine;
        this.startSide = startSide;
        this.updatedAt = updatedAt;
        this.url = url;
        this.user = user;
    }

    public PullRequestReviewComment2 links(WebhooksReviewCommentLinks links) {
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
    public WebhooksReviewCommentLinks getLinks() {
        return links;
    }

    public void setLinks(WebhooksReviewCommentLinks links) {
        this.links = links;
    }

    public PullRequestReviewComment2 authorAssociation(AuthorAssociationEnum authorAssociation) {
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

    public PullRequestReviewComment2 body(String body) {
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

    public PullRequestReviewComment2 commitId(String commitId) {
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

    public PullRequestReviewComment2 createdAt(OffsetDateTime createdAt) {
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

    public PullRequestReviewComment2 diffHunk(String diffHunk) {
        this.diffHunk = diffHunk;
        return this;
    }

    /**
     * The diff of the line that the comment refers to.
     * @return diffHunk
     */
    @NotNull
    @Schema(
            name = "diff_hunk",
            description = "The diff of the line that the comment refers to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("diff_hunk")
    public String getDiffHunk() {
        return diffHunk;
    }

    public void setDiffHunk(String diffHunk) {
        this.diffHunk = diffHunk;
    }

    public PullRequestReviewComment2 htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * HTML URL for the pull request review comment.
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            description = "HTML URL for the pull request review comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public PullRequestReviewComment2 id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the pull request review comment.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The ID of the pull request review comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PullRequestReviewComment2 inReplyToId(Long inReplyToId) {
        this.inReplyToId = inReplyToId;
        return this;
    }

    /**
     * The comment ID to reply to.
     * @return inReplyToId
     */
    @Schema(
            name = "in_reply_to_id",
            description = "The comment ID to reply to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("in_reply_to_id")
    public Long getInReplyToId() {
        return inReplyToId;
    }

    public void setInReplyToId(Long inReplyToId) {
        this.inReplyToId = inReplyToId;
    }

    public PullRequestReviewComment2 line(Long line) {
        this.line = line;
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
    public Long getLine() {
        return line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public PullRequestReviewComment2 nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * The node ID of the pull request review comment.
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            description = "The node ID of the pull request review comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public PullRequestReviewComment2 originalCommitId(String originalCommitId) {
        this.originalCommitId = originalCommitId;
        return this;
    }

    /**
     * The SHA of the original commit to which the comment applies.
     * @return originalCommitId
     */
    @NotNull
    @Schema(
            name = "original_commit_id",
            description = "The SHA of the original commit to which the comment applies.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("original_commit_id")
    public String getOriginalCommitId() {
        return originalCommitId;
    }

    public void setOriginalCommitId(String originalCommitId) {
        this.originalCommitId = originalCommitId;
    }

    public PullRequestReviewComment2 originalLine(Long originalLine) {
        this.originalLine = originalLine;
        return this;
    }

    /**
     * The line of the blob to which the comment applies. The last line of the range for a multi-line comment
     * @return originalLine
     */
    @NotNull
    @Schema(
            name = "original_line",
            description =
                    "The line of the blob to which the comment applies. The last line of the range for a multi-line comment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("original_line")
    public Long getOriginalLine() {
        return originalLine;
    }

    public void setOriginalLine(Long originalLine) {
        this.originalLine = originalLine;
    }

    public PullRequestReviewComment2 originalPosition(Long originalPosition) {
        this.originalPosition = originalPosition;
        return this;
    }

    /**
     * The index of the original line in the diff to which the comment applies.
     * @return originalPosition
     */
    @NotNull
    @Schema(
            name = "original_position",
            description = "The index of the original line in the diff to which the comment applies.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("original_position")
    public Long getOriginalPosition() {
        return originalPosition;
    }

    public void setOriginalPosition(Long originalPosition) {
        this.originalPosition = originalPosition;
    }

    public PullRequestReviewComment2 originalStartLine(Long originalStartLine) {
        this.originalStartLine = originalStartLine;
        return this;
    }

    /**
     * The first line of the range for a multi-line comment.
     * @return originalStartLine
     */
    @NotNull
    @Schema(
            name = "original_start_line",
            description = "The first line of the range for a multi-line comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("original_start_line")
    public Long getOriginalStartLine() {
        return originalStartLine;
    }

    public void setOriginalStartLine(Long originalStartLine) {
        this.originalStartLine = originalStartLine;
    }

    public PullRequestReviewComment2 path(String path) {
        this.path = path;
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
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PullRequestReviewComment2 position(Long position) {
        this.position = position;
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
    public Long getPosition() {
        return position;
    }

    public void setPosition(Long position) {
        this.position = position;
    }

    public PullRequestReviewComment2 pullRequestReviewId(Long pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
        return this;
    }

    /**
     * The ID of the pull request review to which the comment belongs.
     * @return pullRequestReviewId
     */
    @NotNull
    @Schema(
            name = "pull_request_review_id",
            description = "The ID of the pull request review to which the comment belongs.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_review_id")
    public Long getPullRequestReviewId() {
        return pullRequestReviewId;
    }

    public void setPullRequestReviewId(Long pullRequestReviewId) {
        this.pullRequestReviewId = pullRequestReviewId;
    }

    public PullRequestReviewComment2 pullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
        return this;
    }

    /**
     * URL for the pull request that the review comment belongs to.
     * @return pullRequestUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "pull_request_url",
            description = "URL for the pull request that the review comment belongs to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_url")
    public URI getPullRequestUrl() {
        return pullRequestUrl;
    }

    public void setPullRequestUrl(URI pullRequestUrl) {
        this.pullRequestUrl = pullRequestUrl;
    }

    public PullRequestReviewComment2 reactions(Reactions reactions) {
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

    public PullRequestReviewComment2 side(SideEnum side) {
        this.side = side;
        return this;
    }

    /**
     * The side of the first line of the range for a multi-line comment.
     * @return side
     */
    @NotNull
    @Schema(
            name = "side",
            description = "The side of the first line of the range for a multi-line comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("side")
    public SideEnum getSide() {
        return side;
    }

    public void setSide(SideEnum side) {
        this.side = side;
    }

    public PullRequestReviewComment2 startLine(Long startLine) {
        this.startLine = startLine;
        return this;
    }

    /**
     * The first line of the range for a multi-line comment.
     * @return startLine
     */
    @NotNull
    @Schema(
            name = "start_line",
            description = "The first line of the range for a multi-line comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_line")
    public Long getStartLine() {
        return startLine;
    }

    public void setStartLine(Long startLine) {
        this.startLine = startLine;
    }

    public PullRequestReviewComment2 startSide(StartSideEnum startSide) {
        this.startSide = startSide;
        return this;
    }

    /**
     * The side of the first line of the range for a multi-line comment.
     * @return startSide
     */
    @NotNull
    @Schema(
            name = "start_side",
            description = "The side of the first line of the range for a multi-line comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_side")
    public StartSideEnum getStartSide() {
        return startSide;
    }

    public void setStartSide(StartSideEnum startSide) {
        this.startSide = startSide;
    }

    public PullRequestReviewComment2 subjectType(SubjectTypeEnum subjectType) {
        this.subjectType = subjectType;
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
    public SubjectTypeEnum getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(SubjectTypeEnum subjectType) {
        this.subjectType = subjectType;
    }

    public PullRequestReviewComment2 updatedAt(OffsetDateTime updatedAt) {
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

    public PullRequestReviewComment2 url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the pull request review comment
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            description = "URL for the pull request review comment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public PullRequestReviewComment2 user(User1 user) {
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
        PullRequestReviewComment2 pullRequestReviewComment2 = (PullRequestReviewComment2) o;
        return Objects.equals(this.links, pullRequestReviewComment2.links)
                && Objects.equals(this.authorAssociation, pullRequestReviewComment2.authorAssociation)
                && Objects.equals(this.body, pullRequestReviewComment2.body)
                && Objects.equals(this.commitId, pullRequestReviewComment2.commitId)
                && Objects.equals(this.createdAt, pullRequestReviewComment2.createdAt)
                && Objects.equals(this.diffHunk, pullRequestReviewComment2.diffHunk)
                && Objects.equals(this.htmlUrl, pullRequestReviewComment2.htmlUrl)
                && Objects.equals(this.id, pullRequestReviewComment2.id)
                && Objects.equals(this.inReplyToId, pullRequestReviewComment2.inReplyToId)
                && Objects.equals(this.line, pullRequestReviewComment2.line)
                && Objects.equals(this.nodeId, pullRequestReviewComment2.nodeId)
                && Objects.equals(this.originalCommitId, pullRequestReviewComment2.originalCommitId)
                && Objects.equals(this.originalLine, pullRequestReviewComment2.originalLine)
                && Objects.equals(this.originalPosition, pullRequestReviewComment2.originalPosition)
                && Objects.equals(this.originalStartLine, pullRequestReviewComment2.originalStartLine)
                && Objects.equals(this.path, pullRequestReviewComment2.path)
                && Objects.equals(this.position, pullRequestReviewComment2.position)
                && Objects.equals(this.pullRequestReviewId, pullRequestReviewComment2.pullRequestReviewId)
                && Objects.equals(this.pullRequestUrl, pullRequestReviewComment2.pullRequestUrl)
                && Objects.equals(this.reactions, pullRequestReviewComment2.reactions)
                && Objects.equals(this.side, pullRequestReviewComment2.side)
                && Objects.equals(this.startLine, pullRequestReviewComment2.startLine)
                && Objects.equals(this.startSide, pullRequestReviewComment2.startSide)
                && Objects.equals(this.subjectType, pullRequestReviewComment2.subjectType)
                && Objects.equals(this.updatedAt, pullRequestReviewComment2.updatedAt)
                && Objects.equals(this.url, pullRequestReviewComment2.url)
                && Objects.equals(this.user, pullRequestReviewComment2.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                links,
                authorAssociation,
                body,
                commitId,
                createdAt,
                diffHunk,
                htmlUrl,
                id,
                inReplyToId,
                line,
                nodeId,
                originalCommitId,
                originalLine,
                originalPosition,
                originalStartLine,
                path,
                position,
                pullRequestReviewId,
                pullRequestUrl,
                reactions,
                side,
                startLine,
                startSide,
                subjectType,
                updatedAt,
                url,
                user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReviewComment2 {\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    authorAssociation: ")
                .append(toIndentedString(authorAssociation))
                .append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    diffHunk: ").append(toIndentedString(diffHunk)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    inReplyToId: ").append(toIndentedString(inReplyToId)).append("\n");
        sb.append("    line: ").append(toIndentedString(line)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    originalCommitId: ")
                .append(toIndentedString(originalCommitId))
                .append("\n");
        sb.append("    originalLine: ").append(toIndentedString(originalLine)).append("\n");
        sb.append("    originalPosition: ")
                .append(toIndentedString(originalPosition))
                .append("\n");
        sb.append("    originalStartLine: ")
                .append(toIndentedString(originalStartLine))
                .append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    pullRequestReviewId: ")
                .append(toIndentedString(pullRequestReviewId))
                .append("\n");
        sb.append("    pullRequestUrl: ")
                .append(toIndentedString(pullRequestUrl))
                .append("\n");
        sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
        sb.append("    side: ").append(toIndentedString(side)).append("\n");
        sb.append("    startLine: ").append(toIndentedString(startLine)).append("\n");
        sb.append("    startSide: ").append(toIndentedString(startSide)).append("\n");
        sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
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
