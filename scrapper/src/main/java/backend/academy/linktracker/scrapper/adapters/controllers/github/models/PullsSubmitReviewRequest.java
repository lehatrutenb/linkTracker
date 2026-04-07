package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * PullsSubmitReviewRequest
 */
@JsonTypeName("pulls_submit_review_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsSubmitReviewRequest {

    private Optional<String> body = Optional.empty();

    /**
     * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
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

    public PullsSubmitReviewRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullsSubmitReviewRequest(EventEnum event) {
        this.event = event;
    }

    public PullsSubmitReviewRequest body(String body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * The body text of the pull request review
     * @return body
     */
    @Schema(
            name = "body",
            description = "The body text of the pull request review",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    public void setBody(Optional<String> body) {
        this.body = body;
    }

    public PullsSubmitReviewRequest event(EventEnum event) {
        this.event = event;
        return this;
    }

    /**
     * The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.
     * @return event
     */
    @NotNull
    @Schema(
            name = "event",
            description =
                    "The review action you want to perform. The review actions include: `APPROVE`, `REQUEST_CHANGES`, or `COMMENT`. When you leave this blank, the API returns _HTTP 422 (Unrecognizable entity)_ and sets the review action state to `PENDING`, which means you will need to re-submit the pull request review using a review action.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("event")
    public EventEnum getEvent() {
        return event;
    }

    public void setEvent(EventEnum event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullsSubmitReviewRequest pullsSubmitReviewRequest = (PullsSubmitReviewRequest) o;
        return Objects.equals(this.body, pullsSubmitReviewRequest.body)
                && Objects.equals(this.event, pullsSubmitReviewRequest.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(body, event);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsSubmitReviewRequest {\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
