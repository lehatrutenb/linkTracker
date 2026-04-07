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
 * PullsDismissReviewRequest
 */
@JsonTypeName("pulls_dismiss_review_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullsDismissReviewRequest {

    private String message;

    /**
     * Gets or Sets event
     */
    public enum EventEnum {
        DISMISS("DISMISS");

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

    private Optional<EventEnum> event = Optional.empty();

    public PullsDismissReviewRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullsDismissReviewRequest(String message) {
        this.message = message;
    }

    public PullsDismissReviewRequest message(String message) {
        this.message = message;
        return this;
    }

    /**
     * The message for the pull request review dismissal
     * @return message
     */
    @NotNull
    @Schema(
            name = "message",
            description = "The message for the pull request review dismissal",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public PullsDismissReviewRequest event(EventEnum event) {
        this.event = Optional.ofNullable(event);
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @Schema(name = "event", example = "\"DISMISS\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("event")
    public Optional<EventEnum> getEvent() {
        return event;
    }

    public void setEvent(Optional<EventEnum> event) {
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
        PullsDismissReviewRequest pullsDismissReviewRequest = (PullsDismissReviewRequest) o;
        return Objects.equals(this.message, pullsDismissReviewRequest.message)
                && Objects.equals(this.event, pullsDismissReviewRequest.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, event);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullsDismissReviewRequest {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
