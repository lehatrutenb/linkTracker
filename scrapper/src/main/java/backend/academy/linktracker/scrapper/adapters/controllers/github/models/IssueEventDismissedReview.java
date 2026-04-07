package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * IssueEventDismissedReview
 */
@JsonTypeName("issue-event-dismissed-review")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueEventDismissedReview {

    private String state;

    private Long reviewId;

    private JsonNullable<String> dismissalMessage = JsonNullable.<String>undefined();

    private JsonNullable<String> dismissalCommitId = JsonNullable.<String>undefined();

    public IssueEventDismissedReview() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssueEventDismissedReview(String state, Long reviewId, String dismissalMessage) {
        this.state = state;
        this.reviewId = reviewId;
        this.dismissalMessage = JsonNullable.of(dismissalMessage);
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

    public IssueEventDismissedReview dismissalCommitId(String dismissalCommitId) {
        this.dismissalCommitId = JsonNullable.of(dismissalCommitId);
        return this;
    }

    /**
     * Get dismissalCommitId
     * @return dismissalCommitId
     */
    @Schema(name = "dismissal_commit_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissal_commit_id")
    public JsonNullable<String> getDismissalCommitId() {
        return dismissalCommitId;
    }

    public void setDismissalCommitId(JsonNullable<String> dismissalCommitId) {
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
                && equalsNullable(this.dismissalCommitId, issueEventDismissedReview.dismissalCommitId);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, reviewId, dismissalMessage, hashCodeNullable(dismissalCommitId));
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
