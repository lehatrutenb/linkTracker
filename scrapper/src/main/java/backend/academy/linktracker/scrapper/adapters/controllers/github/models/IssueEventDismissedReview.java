package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * IssueEventDismissedReview
 */
@JsonTypeName("issue-event-dismissed-review")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueEventDismissedReview {

    private String state;

    private Long reviewId;

    private String dismissalMessage = null;

    private String dismissalCommitId = null;

    public IssueEventDismissedReview() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueEventDismissedReview(String state, Long reviewId, String dismissalMessage) {
        this.state = state;
        this.reviewId = reviewId;
        this.dismissalMessage = dismissalMessage;
    }

    public IssueEventDismissedReview state(String state) {
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

    public IssueEventDismissedReview reviewId(Long reviewId) {
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

    public IssueEventDismissedReview dismissalMessage(String dismissalMessage) {
        this.dismissalMessage = dismissalMessage;
        return this;
    }

    /**
     * Get dismissalMessage
     * @return dismissalMessage
     */
    @NotNull
    @Schema(name = "dismissal_message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissal_message")
    public String getDismissalMessage() {
        return dismissalMessage;
    }

    public void setDismissalMessage(String dismissalMessage) {
        this.dismissalMessage = dismissalMessage;
    }

    public IssueEventDismissedReview dismissalCommitId(String dismissalCommitId) {
        this.dismissalCommitId = dismissalCommitId;
        return this;
    }

    /**
     * Get dismissalCommitId
     * @return dismissalCommitId
     */
    @Schema(name = "dismissal_commit_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissal_commit_id")
    public String getDismissalCommitId() {
        return dismissalCommitId;
    }

    public void setDismissalCommitId(String dismissalCommitId) {
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
        IssueEventDismissedReview issueEventDismissedReview = (IssueEventDismissedReview) o;
        return Objects.equals(this.state, issueEventDismissedReview.state)
                && Objects.equals(this.reviewId, issueEventDismissedReview.reviewId)
                && Objects.equals(this.dismissalMessage, issueEventDismissedReview.dismissalMessage)
                && Objects.equals(this.dismissalCommitId, issueEventDismissedReview.dismissalCommitId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, reviewId, dismissalMessage, dismissalCommitId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueEventDismissedReview {\n");
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
