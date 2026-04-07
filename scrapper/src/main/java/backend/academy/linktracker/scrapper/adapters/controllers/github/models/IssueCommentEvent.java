package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * IssueCommentEvent
 */
@JsonTypeName("issue-comment-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueCommentEvent implements EventPayload {

    private String action;

    private Issue issue;

    private IssueComment comment;

    public IssueCommentEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueCommentEvent(String action, Issue issue, IssueComment comment) {
        this.action = action;
        this.issue = issue;
        this.comment = comment;
    }

    public IssueCommentEvent action(String action) {
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

    public IssueCommentEvent issue(Issue issue) {
        this.issue = issue;
        return this;
    }

    /**
     * Get issue
     * @return issue
     */
    @NotNull
    @Valid
    @Schema(name = "issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue")
    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public IssueCommentEvent comment(IssueComment comment) {
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
    public IssueComment getComment() {
        return comment;
    }

    public void setComment(IssueComment comment) {
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
        IssueCommentEvent issueCommentEvent = (IssueCommentEvent) o;
        return Objects.equals(this.action, issueCommentEvent.action)
                && Objects.equals(this.issue, issueCommentEvent.issue)
                && Objects.equals(this.comment, issueCommentEvent.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, issue, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueCommentEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
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
