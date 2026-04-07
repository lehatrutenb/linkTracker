package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * PullRequestReviewCommentEvent
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewCommentEvent implements EventPayload {

    private String action;

    private PullRequestMinimal pullRequest;

    private PullRequestReviewCommentEventComment comment;

    public PullRequestReviewCommentEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReviewCommentEvent(
            String action, PullRequestMinimal pullRequest, PullRequestReviewCommentEventComment comment) {
        this.action = action;
        this.pullRequest = pullRequest;
        this.comment = comment;
    }

    public PullRequestReviewCommentEvent action(String action) {
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

    public PullRequestReviewCommentEvent pullRequest(PullRequestMinimal pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    @NotNull
    @Valid
    @Schema(name = "pull_request", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request")
    public PullRequestMinimal getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequestMinimal pullRequest) {
        this.pullRequest = pullRequest;
    }

    public PullRequestReviewCommentEvent comment(PullRequestReviewCommentEventComment comment) {
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
    public PullRequestReviewCommentEventComment getComment() {
        return comment;
    }

    public void setComment(PullRequestReviewCommentEventComment comment) {
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
        PullRequestReviewCommentEvent pullRequestReviewCommentEvent = (PullRequestReviewCommentEvent) o;
        return Objects.equals(this.action, pullRequestReviewCommentEvent.action)
                && Objects.equals(this.pullRequest, pullRequestReviewCommentEvent.pullRequest)
                && Objects.equals(this.comment, pullRequestReviewCommentEvent.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, pullRequest, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReviewCommentEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
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
