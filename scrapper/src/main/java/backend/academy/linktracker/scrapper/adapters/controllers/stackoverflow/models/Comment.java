package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
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
        date = "2026-03-24T12:15:15.683209678Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Comment {

    private Long commentId;

    private Long postId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime creationDate;

    private String body;

    private ShallowUser owner;

    private ShallowUser replyToUser;

    private Boolean edited;

    private Long score;

    public Comment commentId(Long commentId) {
        this.commentId = commentId;
        return this;
    }

    /**
     * Get commentId
     * @return commentId
     */
    @Schema(name = "comment_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comment_id")
    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Comment postId(Long postId) {
        this.postId = postId;
        return this;
    }

    /**
     * The ID of the post (question or answer) this comment belongs to.
     * @return postId
     */
    @Schema(
            name = "post_id",
            description = "The ID of the post (question or answer) this comment belongs to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("post_id")
    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public Comment creationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * Get creationDate
     * @return creationDate
     */
    @Valid
    @Schema(name = "creation_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("creation_date")
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public Comment body(String body) {
        this.body = body;
        return this;
    }

    /**
     * Get body
     * @return body
     */
    @Schema(name = "body", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Comment owner(ShallowUser owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owner")
    public ShallowUser getOwner() {
        return owner;
    }

    public void setOwner(ShallowUser owner) {
        this.owner = owner;
    }

    public Comment replyToUser(ShallowUser replyToUser) {
        this.replyToUser = replyToUser;
        return this;
    }

    /**
     * Get replyToUser
     * @return replyToUser
     */
    @Valid
    @Schema(name = "reply_to_user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reply_to_user")
    public ShallowUser getReplyToUser() {
        return replyToUser;
    }

    public void setReplyToUser(ShallowUser replyToUser) {
        this.replyToUser = replyToUser;
    }

    public Comment edited(Boolean edited) {
        this.edited = edited;
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
    public Boolean getEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public Comment score(Long score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     */
    @Schema(name = "score", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("score")
    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
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
        return Objects.equals(this.commentId, comment.commentId)
                && Objects.equals(this.postId, comment.postId)
                && Objects.equals(this.creationDate, comment.creationDate)
                && Objects.equals(this.body, comment.body)
                && Objects.equals(this.owner, comment.owner)
                && Objects.equals(this.replyToUser, comment.replyToUser)
                && Objects.equals(this.edited, comment.edited)
                && Objects.equals(this.score, comment.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commentId, postId, creationDate, body, owner, replyToUser, edited, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Comment {\n");
        sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
        sb.append("    postId: ").append(toIndentedString(postId)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    replyToUser: ").append(toIndentedString(replyToUser)).append("\n");
        sb.append("    edited: ").append(toIndentedString(edited)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
