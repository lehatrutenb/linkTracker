package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * IssuesCreateMilestoneRequest
 */
@JsonTypeName("issues_create_milestone_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesCreateMilestoneRequest {

    private String title;

    /**
     * The state of the milestone. Either `open` or `closed`.
     */
    public enum StateEnum {
        OPEN("open"),

        CLOSED("closed");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<StateEnum> state = Optional.of(StateEnum.OPEN);

    private Optional<String> description = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> dueOn = Optional.empty();

    public IssuesCreateMilestoneRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesCreateMilestoneRequest(String title) {
        this.title = title;
    }

    public IssuesCreateMilestoneRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
     * The title of the milestone.
     * @return title
     */
    @NotNull
    @Schema(name = "title", description = "The title of the milestone.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IssuesCreateMilestoneRequest state(StateEnum state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * The state of the milestone. Either `open` or `closed`.
     * @return state
     */
    @Schema(
            name = "state",
            description = "The state of the milestone. Either `open` or `closed`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<StateEnum> getState() {
        return state;
    }

    public void setState(Optional<StateEnum> state) {
        this.state = state;
    }

    public IssuesCreateMilestoneRequest description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * A description of the milestone.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A description of the milestone.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public IssuesCreateMilestoneRequest dueOn(OffsetDateTime dueOn) {
        this.dueOn = Optional.ofNullable(dueOn);
        return this;
    }

    /**
     * The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return dueOn
     */
    @Valid
    @Schema(
            name = "due_on",
            description =
                    "The milestone due date. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("due_on")
    public Optional<OffsetDateTime> getDueOn() {
        return dueOn;
    }

    public void setDueOn(Optional<OffsetDateTime> dueOn) {
        this.dueOn = dueOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesCreateMilestoneRequest issuesCreateMilestoneRequest = (IssuesCreateMilestoneRequest) o;
        return Objects.equals(this.title, issuesCreateMilestoneRequest.title)
                && Objects.equals(this.state, issuesCreateMilestoneRequest.state)
                && Objects.equals(this.description, issuesCreateMilestoneRequest.description)
                && Objects.equals(this.dueOn, issuesCreateMilestoneRequest.dueOn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, state, description, dueOn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesCreateMilestoneRequest {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
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
