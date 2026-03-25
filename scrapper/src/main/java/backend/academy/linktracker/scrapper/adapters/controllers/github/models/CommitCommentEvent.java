package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CommitCommentEvent
 */
@JsonTypeName("commit-comment-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CommitCommentEvent implements EventPayload {

    private String action;

    private CommitCommentEventComment comment;

    public CommitCommentEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CommitCommentEvent(String action, CommitCommentEventComment comment) {
        this.action = action;
        this.comment = comment;
    }

    public CommitCommentEvent action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @NotNull
    @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CommitCommentEvent comment(CommitCommentEventComment comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     * @return comment
     */
    @NotNull
    @Valid
    @Schema(name = "comment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comment")
    public CommitCommentEventComment getComment() {
        return comment;
    }

    public void setComment(CommitCommentEventComment comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitCommentEvent commitCommentEvent = (CommitCommentEvent) o;
        return Objects.equals(this.action, commitCommentEvent.action)
                && Objects.equals(this.comment, commitCommentEvent.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitCommentEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
