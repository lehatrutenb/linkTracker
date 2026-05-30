package backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
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
 * Represents a Comment.
 */
@Schema(name = "Comment", description = "Represents a Comment.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-05-10T11:19:30.340677774Z[Etc/UTC]",
        comments = "Generator version: 7.23.0-SNAPSHOT")
public class Comment {

    private Optional<String> body = Optional.empty();

    private Optional<String> bodyMarkdown = Optional.empty();

    private Optional<Boolean> canFlag = Optional.empty();

    private Long commentId;

    private Optional<String> contentLicense = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime creationDate;

    private Optional<Boolean> edited = Optional.empty();

    private URI link;

    private Optional<ShallowUser> owner = Optional.empty();

    private Long postId;

    /**
     * The type of post this comment is on.
     */
    public enum PostTypeEnum {
        QUESTION("question"),

        ANSWER("answer");

        private final String value;

        PostTypeEnum(String value) {
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
        public static PostTypeEnum fromValue(String value) {
            for (PostTypeEnum b : PostTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<PostTypeEnum> postType = Optional.empty();

    private Optional<ShallowUser> replyToUser = Optional.empty();

    private Optional<Long> score = Optional.empty();

    private Optional<Boolean> upvoted = Optional.empty();

    public Comment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Comment(Long commentId, OffsetDateTime creationDate, URI link, Long postId) {
        this.commentId = commentId;
        this.creationDate = creationDate;
        this.link = link;
        this.postId = postId;
    }

    public Comment body(String body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * The main body of the comment in HTML format.
     * @return body
     */
    @Schema(
            name = "body",
            description = "The main body of the comment in HTML format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(Optional<String> body) {
        this.body = body;
    }

    public Comment bodyMarkdown(String bodyMarkdown) {
        this.bodyMarkdown = Optional.ofNullable(bodyMarkdown);
        return this;
    }

    /**
     * The main body of the comment in Markdown format.
     * @return bodyMarkdown
     */
    @Schema(
            name = "body_markdown",
            description = "The main body of the comment in Markdown format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body_markdown")
    public Optional<String> getBodyMarkdown() {
        return bodyMarkdown;
    }

    @JsonProperty("body_markdown")
    public void setBodyMarkdown(Optional<String> bodyMarkdown) {
        this.bodyMarkdown = bodyMarkdown;
    }

    public Comment canFlag(Boolean canFlag) {
        this.canFlag = Optional.ofNullable(canFlag);
        return this;
    }

    /**
     * True if the authenticated user can flag this comment.
     * @return canFlag
     */
    @Schema(
            name = "can_flag",
            description = "True if the authenticated user can flag this comment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("can_flag")
    public Optional<Boolean> getCanFlag() {
        return canFlag;
    }

    @JsonProperty("can_flag")
    public void setCanFlag(Optional<Boolean> canFlag) {
        this.canFlag = canFlag;
    }

    public Comment commentId(Long commentId) {
        this.commentId = commentId;
        return this;
    }

    /**
     * The unique identifier for this comment.
     * @return commentId
     */
    @NotNull
    @Schema(
            name = "comment_id",
            description = "The unique identifier for this comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comment_id")
    public Long getCommentId() {
        return commentId;
    }

    @JsonProperty("comment_id")
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Comment contentLicense(String contentLicense) {
        this.contentLicense = Optional.ofNullable(contentLicense);
        return this;
    }

    /**
     * The content license for this comment.
     * @return contentLicense
     */
    @Schema(
            name = "content_license",
            example = "CC BY-SA 4.0",
            description = "The content license for this comment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_license")
    public Optional<String> getContentLicense() {
        return contentLicense;
    }

    @JsonProperty("content_license")
    public void setContentLicense(Optional<String> contentLicense) {
        this.contentLicense = contentLicense;
    }

    public Comment creationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * The date when this comment was created.
     * @return creationDate
     */
    @NotNull
    @Valid
    @Schema(
            name = "creation_date",
            description = "The date when this comment was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creation_date")
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creation_date")
    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Comment edited(Boolean edited) {
        this.edited = Optional.ofNullable(edited);
        return this;
    }

    /**
     * True if this comment has been edited.
     * @return edited
     */
    @Schema(
            name = "edited",
            description = "True if this comment has been edited.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("edited")
    public Optional<Boolean> getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(Optional<Boolean> edited) {
        this.edited = edited;
    }

    public Comment link(URI link) {
        this.link = link;
        return this;
    }

    /**
     * The permanent URL to this comment.
     * @return link
     */
    @NotNull
    @Valid
    @Schema(
            name = "link",
            description = "The permanent URL to this comment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("link")
    public URI getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(URI link) {
        this.link = link;
    }

    public Comment owner(ShallowUser owner) {
        this.owner = Optional.ofNullable(owner);
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public Optional<ShallowUser> getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Optional<ShallowUser> owner) {
        this.owner = owner;
    }

    public Comment postId(Long postId) {
        this.postId = postId;
        return this;
    }

    /**
     * The ID of the post (question or answer) this comment belongs to.
     * @return postId
     */
    @NotNull
    @Schema(
            name = "post_id",
            description = "The ID of the post (question or answer) this comment belongs to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("post_id")
    public Long getPostId() {
        return postId;
    }

    @JsonProperty("post_id")
    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Comment postType(PostTypeEnum postType) {
        this.postType = Optional.ofNullable(postType);
        return this;
    }

    /**
     * The type of post this comment is on.
     * @return postType
     */
    @Schema(
            name = "post_type",
            description = "The type of post this comment is on.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("post_type")
    public Optional<PostTypeEnum> getPostType() {
        return postType;
    }

    @JsonProperty("post_type")
    public void setPostType(Optional<PostTypeEnum> postType) {
        this.postType = postType;
    }

    public Comment replyToUser(ShallowUser replyToUser) {
        this.replyToUser = Optional.ofNullable(replyToUser);
        return this;
    }

    /**
     * Get replyToUser
     * @return replyToUser
     */
    @Valid
    @Schema(name = "reply_to_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reply_to_user")
    public Optional<ShallowUser> getReplyToUser() {
        return replyToUser;
    }

    @JsonProperty("reply_to_user")
    public void setReplyToUser(Optional<ShallowUser> replyToUser) {
        this.replyToUser = replyToUser;
    }

    public Comment score(Long score) {
        this.score = Optional.ofNullable(score);
        return this;
    }

    /**
     * The current score of this comment.
     * @return score
     */
    @Schema(
            name = "score",
            description = "The current score of this comment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("score")
    public Optional<Long> getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Optional<Long> score) {
        this.score = score;
    }

    public Comment upvoted(Boolean upvoted) {
        this.upvoted = Optional.ofNullable(upvoted);
        return this;
    }

    /**
     * True if the authenticated user has upvoted this comment. Requires private_info scope.
     * @return upvoted
     */
    @Schema(
            name = "upvoted",
            description = "True if the authenticated user has upvoted this comment. Requires private_info scope.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("upvoted")
    public Optional<Boolean> getUpvoted() {
        return upvoted;
    }

    @JsonProperty("upvoted")
    public void setUpvoted(Optional<Boolean> upvoted) {
        this.upvoted = upvoted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Comment comment = (Comment) o;
        return Objects.equals(this.body, comment.body)
                && Objects.equals(this.bodyMarkdown, comment.bodyMarkdown)
                && Objects.equals(this.canFlag, comment.canFlag)
                && Objects.equals(this.commentId, comment.commentId)
                && Objects.equals(this.contentLicense, comment.contentLicense)
                && Objects.equals(this.creationDate, comment.creationDate)
                && Objects.equals(this.edited, comment.edited)
                && Objects.equals(this.link, comment.link)
                && Objects.equals(this.owner, comment.owner)
                && Objects.equals(this.postId, comment.postId)
                && Objects.equals(this.postType, comment.postType)
                && Objects.equals(this.replyToUser, comment.replyToUser)
                && Objects.equals(this.score, comment.score)
                && Objects.equals(this.upvoted, comment.upvoted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                body,
                bodyMarkdown,
                canFlag,
                commentId,
                contentLicense,
                creationDate,
                edited,
                link,
                owner,
                postId,
                postType,
                replyToUser,
                score,
                upvoted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Comment {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    bodyMarkdown: ").append(toIndentedString(bodyMarkdown)).append("\n");
        sb.append("    canFlag: ").append(toIndentedString(canFlag)).append("\n");
        sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
        sb.append("    contentLicense: ")
                .append(toIndentedString(contentLicense))
                .append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
        sb.append("    postType: ").append(toIndentedString(postType)).append("\n");
        sb.append("    replyToUser: ").append(toIndentedString(replyToUser)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    upvoted: ").append(toIndentedString(upvoted)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}
