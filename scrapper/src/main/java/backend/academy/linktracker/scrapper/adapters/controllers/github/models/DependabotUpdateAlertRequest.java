package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * DependabotUpdateAlertRequest
 */
@JsonTypeName("dependabot_update_alert_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotUpdateAlertRequest {

    /**
     * The state of the Dependabot alert. A `dismissed_reason` must be provided when setting the state to `dismissed`.
     */
    public enum StateEnum {
        DISMISSED("dismissed"),

        OPEN("open");

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

    private Optional<StateEnum> state = Optional.empty();

    /**
     * **Required when `state` is `dismissed`.** A reason for dismissing the alert.
     */
    public enum DismissedReasonEnum {
        FIX_STARTED("fix_started"),

        INACCURATE("inaccurate"),

        NO_BANDWIDTH("no_bandwidth"),

        NOT_USED("not_used"),

        TOLERABLE_RISK("tolerable_risk");

        private final String value;

        DismissedReasonEnum(String value) {
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
        public static DismissedReasonEnum fromValue(String value) {
            for (DismissedReasonEnum b : DismissedReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DismissedReasonEnum> dismissedReason = Optional.empty();

    private Optional<@Size(max = 280) String> dismissedComment = Optional.empty();

    @Valid
    private List<String> assignees = new ArrayList<>();

    public DependabotUpdateAlertRequest state(StateEnum state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * The state of the Dependabot alert. A `dismissed_reason` must be provided when setting the state to `dismissed`.
     * @return state
     */
    @Schema(
            name = "state",
            description =
                    "The state of the Dependabot alert. A `dismissed_reason` must be provided when setting the state to `dismissed`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<StateEnum> getState() {
        return state;
    }

    public void setState(Optional<StateEnum> state) {
        this.state = state;
    }

    public DependabotUpdateAlertRequest dismissedReason(DismissedReasonEnum dismissedReason) {
        this.dismissedReason = Optional.ofNullable(dismissedReason);
        return this;
    }

    /**
     * **Required when `state` is `dismissed`.** A reason for dismissing the alert.
     * @return dismissedReason
     */
    @Schema(
            name = "dismissed_reason",
            description = "**Required when `state` is `dismissed`.** A reason for dismissing the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_reason")
    public Optional<DismissedReasonEnum> getDismissedReason() {
        return dismissedReason;
    }

    public void setDismissedReason(Optional<DismissedReasonEnum> dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    public DependabotUpdateAlertRequest dismissedComment(String dismissedComment) {
        this.dismissedComment = Optional.ofNullable(dismissedComment);
        return this;
    }

    /**
     * An optional comment associated with dismissing the alert.
     * @return dismissedComment
     */
    @Schema(
            name = "dismissed_comment",
            description = "An optional comment associated with dismissing the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_comment")
    public Optional<@Size(max = 280) String> getDismissedComment() {
        return dismissedComment;
    }

    public void setDismissedComment(Optional<String> dismissedComment) {
        this.dismissedComment = dismissedComment;
    }

    public DependabotUpdateAlertRequest assignees(List<String> assignees) {
        this.assignees = assignees;
        return this;
    }

    public DependabotUpdateAlertRequest addAssigneesItem(String assigneesItem) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        this.assignees.add(assigneesItem);
        return this;
    }

    /**
     * Usernames to assign to this Dependabot Alert. Pass one or more user logins to _replace_ the set of assignees on this alert. Send an empty array (`[]`) to clear all assignees from the alert.
     * @return assignees
     */
    @Schema(
            name = "assignees",
            description =
                    "Usernames to assign to this Dependabot Alert. Pass one or more user logins to _replace_ the set of assignees on this alert. Send an empty array (`[]`) to clear all assignees from the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees")
    public List<String> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<String> assignees) {
        this.assignees = assignees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotUpdateAlertRequest dependabotUpdateAlertRequest = (DependabotUpdateAlertRequest) o;
        return Objects.equals(this.state, dependabotUpdateAlertRequest.state)
                && Objects.equals(this.dismissedReason, dependabotUpdateAlertRequest.dismissedReason)
                && Objects.equals(this.dismissedComment, dependabotUpdateAlertRequest.dismissedComment)
                && Objects.equals(this.assignees, dependabotUpdateAlertRequest.assignees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, dismissedReason, dismissedComment, assignees);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotUpdateAlertRequest {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    dismissedReason: ")
                .append(toIndentedString(dismissedReason))
                .append("\n");
        sb.append("    dismissedComment: ")
                .append(toIndentedString(dismissedComment))
                .append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
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
