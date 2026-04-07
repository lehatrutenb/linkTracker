package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ReviewDismissedIssueEventDismissedReview
 */
@JsonTypeName("review_dismissed_issue_event_dismissed_review")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReviewDismissedIssueEventDismissedReview {

    private String state;

    private Long reviewId;

    private JsonNullable<String> dismissalMessage = JsonNullable.<String>undefined();

    private Optional<String> dismissalCommitId = Optional.empty();

    public ReviewDismissedIssueEventDismissedReview() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReviewDismissedIssueEventDismissedReview(String state, Long reviewId, String dismissalMessage) {
        this.state = state;
        this.reviewId = reviewId;
        this.dismissalMessage = JsonNullable.of(dismissalMessage);
    }

    public ReviewDismissedIssueEventDismissedReview state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ReviewDismissedIssueEventDismissedReview reviewId(Long reviewId) {
        this.reviewId = reviewId;
        return this;
    }

    /**
     * Get reviewId
     * @return reviewId
     */
    @NotNull
    @Schema(name = "review_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("review_id")
    public Long getReviewId() {
        return reviewId;
    }

    public void setReviewId(Long reviewId) {
        this.reviewId = reviewId;
    }

    public ReviewDismissedIssueEventDismissedReview dismissalMessage(String dismissalMessage) {
        this.dismissalMessage = JsonNullable.of(dismissalMessage);
        return this;
    }

    /**
     * Get dismissalMessage
     * @return dismissalMessage
     */
    @NotNull
    @Schema(name = "dismissal_message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissal_message")
    public JsonNullable<String> getDismissalMessage() {
        return dismissalMessage;
    }

    public void setDismissalMessage(JsonNullable<String> dismissalMessage) {
        this.dismissalMessage = dismissalMessage;
    }

    public ReviewDismissedIssueEventDismissedReview dismissalCommitId(String dismissalCommitId) {
        this.dismissalCommitId = Optional.ofNullable(dismissalCommitId);
        return this;
    }

    /**
     * Get dismissalCommitId
     * @return dismissalCommitId
     */
    @Schema(name = "dismissal_commit_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissal_commit_id")
    public Optional<String> getDismissalCommitId() {
        return dismissalCommitId;
    }

    public void setDismissalCommitId(Optional<String> dismissalCommitId) {
        this.dismissalCommitId = dismissalCommitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReviewDismissedIssueEventDismissedReview reviewDismissedIssueEventDismissedReview =
                (ReviewDismissedIssueEventDismissedReview) o;
        return Objects.equals(this.state, reviewDismissedIssueEventDismissedReview.state)
                && Objects.equals(this.reviewId, reviewDismissedIssueEventDismissedReview.reviewId)
                && Objects.equals(this.dismissalMessage, reviewDismissedIssueEventDismissedReview.dismissalMessage)
                && Objects.equals(this.dismissalCommitId, reviewDismissedIssueEventDismissedReview.dismissalCommitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, reviewId, dismissalMessage, dismissalCommitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewDismissedIssueEventDismissedReview {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    reviewId: ").append(toIndentedString(reviewId)).append("\n");
        sb.append("    dismissalMessage: ")
                .append(toIndentedString(dismissalMessage))
                .append("\n");
        sb.append("    dismissalCommitId: ")
                .append(toIndentedString(dismissalCommitId))
                .append("\n");
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
