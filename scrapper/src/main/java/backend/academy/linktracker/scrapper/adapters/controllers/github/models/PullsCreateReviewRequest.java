package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PullsCreateReviewRequest
 */
@JsonTypeName("pulls_create_review_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsCreateReviewRequest {

    private String commitId;

    private String body;

    /**
     * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request) when you are ready.
     */
    public enum EventEnum {
        APPROVE("APPROVE"),

        REQUEST_CHANGES("REQUEST_CHANGES"),

        COMMENT("COMMENT");

        private final String value;

        EventEnum(String value) {
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
        public static EventEnum fromValue(String value) {
            for (EventEnum b : EventEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private EventEnum event;

    @Valid
    private List<@Valid PullsCreateReviewRequestCommentsInner> comments = new ArrayList<>();

    public PullsCreateReviewRequest commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value.
     * @return commitId
     */
    @Schema(
            name = "commit_id",
            description =
                    "The SHA of the commit that needs a review. Not using the latest commit SHA may render your review comment outdated if a subsequent commit modifies the line you specify as the `position`. Defaults to the most recent commit in the pull request when you do not specify a value.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public PullsCreateReviewRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * **Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review.
     * @return body
     */
    @Schema(
            name = "body",
            description =
                    "**Required** when using `REQUEST_CHANGES` or `COMMENT` for the `event` parameter. The body text of the pull request review.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public PullsCreateReviewRequest event(EventEnum event) {
        this.event = event;
        return this;
    }

    /**
     * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request) when you are ready.
     * @return event
     */
    @Schema(
            name = "event",
            description =
                    "The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. By leaving this blank, you set the review action state to `PENDING`, which means you will need to [submit the pull request review](https://docs.github.com/rest/pulls/reviews#submit-a-review-for-a-pull-request) when you are ready.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("event")
    public EventEnum getEvent() {
        return event;
    }

    public void setEvent(EventEnum event) {
        this.event = event;
    }

    public PullsCreateReviewRequest comments(List<@Valid PullsCreateReviewRequestCommentsInner> comments) {
        this.comments = comments;
        return this;
    }

    public PullsCreateReviewRequest addCommentsItem(PullsCreateReviewRequestCommentsInner commentsItem) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        this.comments.add(commentsItem);
        return this;
    }

    /**
     * Use the following table to specify the location, destination, and contents of the draft review comment.
     * @return comments
     */
    @Valid
    @Schema(
            name = "comments",
            description =
                    "Use the following table to specify the location, destination, and contents of the draft review comment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments")
    public List<@Valid PullsCreateReviewRequestCommentsInner> getComments() {
        return comments;
    }

    public void setComments(List<@Valid PullsCreateReviewRequestCommentsInner> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsCreateReviewRequest pullsCreateReviewRequest = (PullsCreateReviewRequest) o;
        return Objects.equals(this.commitId, pullsCreateReviewRequest.commitId)
                && Objects.equals(this.body, pullsCreateReviewRequest.body)
                && Objects.equals(this.event, pullsCreateReviewRequest.event)
                && Objects.equals(this.comments, pullsCreateReviewRequest.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commitId, body, event, comments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsCreateReviewRequest {\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
