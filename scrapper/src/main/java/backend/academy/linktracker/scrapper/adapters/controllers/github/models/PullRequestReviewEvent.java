package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * PullRequestReviewEvent
 */
@JsonTypeName("pull-request-review-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewEvent implements EventPayload {

    private String action;

    private PullRequestReviewEventReview review;

    private PullRequestMinimal pullRequest;

    public PullRequestReviewEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReviewEvent(String action, PullRequestReviewEventReview review, PullRequestMinimal pullRequest) {
        this.action = action;
        this.review = review;
        this.pullRequest = pullRequest;
    }

    public PullRequestReviewEvent action(String action) {
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

    public PullRequestReviewEvent review(PullRequestReviewEventReview review) {
        this.review = review;
        return this;
    }

    /**
     * Get review
     * @return review
     */
    @NotNull
    @Valid
    @Schema(name = "review", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review")
    public PullRequestReviewEventReview getReview() {
        return review;
    }

    public void setReview(PullRequestReviewEventReview review) {
        this.review = review;
    }

    public PullRequestReviewEvent pullRequest(PullRequestMinimal pullRequest) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestReviewEvent pullRequestReviewEvent = (PullRequestReviewEvent) o;
        return Objects.equals(this.action, pullRequestReviewEvent.action)
                && Objects.equals(this.review, pullRequestReviewEvent.review)
                && Objects.equals(this.pullRequest, pullRequestReviewEvent.pullRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, review, pullRequest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReviewEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    review: ").append(toIndentedString(review)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
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
