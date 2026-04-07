package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * IssuesUpdateRequest
 */
@JsonTypeName("issues_update_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesUpdateRequest {

    private JsonNullable<IssuesUpdateRequestTitle> title = JsonNullable.<IssuesUpdateRequestTitle>undefined();

    private JsonNullable<String> body = JsonNullable.<String>undefined();

    /**
     * The open or closed state of the issue.
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

    private Optional<StateEnum> state = Optional.empty();

    /**
     * The reason for the state change. Ignored unless `state` is changed.
     */
    public enum StateReasonEnum {
        COMPLETED("completed"),

        NOT_PLANNED("not_planned"),

        DUPLICATE("duplicate"),

        REOPENED("reopened");

        private final String value;

        StateReasonEnum(String value) {
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
        public static StateReasonEnum fromValue(String value) {
            for (StateReasonEnum b : StateReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private JsonNullable<StateReasonEnum> stateReason = JsonNullable.<StateReasonEnum>undefined();

    private JsonNullable<IssuesUpdateRequestMilestone> milestone =
            JsonNullable.<IssuesUpdateRequestMilestone>undefined();

    @Valid
    private List<IssuesCreateRequestLabelsInner> labels = new ArrayList<>();

    @Valid
    private List<String> assignees = new ArrayList<>();

    @Valid
    private List<@Valid IssuesUpdateRequestIssueFieldValuesInner> issueFieldValues = new ArrayList<>();

    private JsonNullable<String> type = JsonNullable.<String>undefined();

    public IssuesUpdateRequest title(IssuesUpdateRequestTitle title) {
        this.title = JsonNullable.of(title);
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Valid
    @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public JsonNullable<IssuesUpdateRequestTitle> getTitle() {
        return title;
    }

    public void setTitle(JsonNullable<IssuesUpdateRequestTitle> title) {
        this.title = title;
    }

    public IssuesUpdateRequest body(String body) {
        this.body = JsonNullable.of(body);
        return this;
    }

    /**
     * The contents of the issue.
     * @return body
     */
    @Schema(name = "body", description = "The contents of the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public JsonNullable<String> getBody() {
        return body;
    }

    public void setBody(JsonNullable<String> body) {
        this.body = body;
    }

    public IssuesUpdateRequest state(StateEnum state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * The open or closed state of the issue.
     * @return state
     */
    @Schema(
            name = "state",
            description = "The open or closed state of the issue.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<StateEnum> getState() {
        return state;
    }

    public void setState(Optional<StateEnum> state) {
        this.state = state;
    }

    public IssuesUpdateRequest stateReason(StateReasonEnum stateReason) {
        this.stateReason = JsonNullable.of(stateReason);
        return this;
    }

    /**
     * The reason for the state change. Ignored unless `state` is changed.
     * @return stateReason
     */
    @Schema(
            name = "state_reason",
            example = "not_planned",
            description = "The reason for the state change. Ignored unless `state` is changed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state_reason")
    public JsonNullable<StateReasonEnum> getStateReason() {
        return stateReason;
    }

    public void setStateReason(JsonNullable<StateReasonEnum> stateReason) {
        this.stateReason = stateReason;
    }

    public IssuesUpdateRequest milestone(IssuesUpdateRequestMilestone milestone) {
        this.milestone = JsonNullable.of(milestone);
        return this;
    }

    /**
     * Get milestone
     * @return milestone
     */
    @Valid
    @Schema(name = "milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("milestone")
    public JsonNullable<IssuesUpdateRequestMilestone> getMilestone() {
        return milestone;
    }

    public void setMilestone(JsonNullable<IssuesUpdateRequestMilestone> milestone) {
        this.milestone = milestone;
    }

    public IssuesUpdateRequest labels(List<IssuesCreateRequestLabelsInner> labels) {
        this.labels = labels;
        return this;
    }

    public IssuesUpdateRequest addLabelsItem(IssuesCreateRequestLabelsInner labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Labels to associate with this issue. Pass one or more labels to _replace_ the set of labels on this issue. Send an empty array (`[]`) to clear all labels from the issue. Only users with push access can set labels for issues. Without push access to the repository, label changes are silently dropped.
     * @return labels
     */
    @Valid
    @Schema(
            name = "labels",
            description =
                    "Labels to associate with this issue. Pass one or more labels to _replace_ the set of labels on this issue. Send an empty array (`[]`) to clear all labels from the issue. Only users with push access can set labels for issues. Without push access to the repository, label changes are silently dropped.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public List<IssuesCreateRequestLabelsInner> getLabels() {
        return labels;
    }

    public void setLabels(List<IssuesCreateRequestLabelsInner> labels) {
        this.labels = labels;
    }

    public IssuesUpdateRequest assignees(List<String> assignees) {
        this.assignees = assignees;
        return this;
    }

    public IssuesUpdateRequest addAssigneesItem(String assigneesItem) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        this.assignees.add(assigneesItem);
        return this;
    }

    /**
     * Usernames to assign to this issue. Pass one or more user logins to _replace_ the set of assignees on this issue. Send an empty array (`[]`) to clear all assignees from the issue. Only users with push access can set assignees for new issues. Without push access to the repository, assignee changes are silently dropped.
     * @return assignees
     */
    @Schema(
            name = "assignees",
            description =
                    "Usernames to assign to this issue. Pass one or more user logins to _replace_ the set of assignees on this issue. Send an empty array (`[]`) to clear all assignees from the issue. Only users with push access can set assignees for new issues. Without push access to the repository, assignee changes are silently dropped.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees")
    public List<String> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<String> assignees) {
        this.assignees = assignees;
    }

    public IssuesUpdateRequest issueFieldValues(
            List<@Valid IssuesUpdateRequestIssueFieldValuesInner> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
        return this;
    }

    public IssuesUpdateRequest addIssueFieldValuesItem(IssuesUpdateRequestIssueFieldValuesInner issueFieldValuesItem) {
        if (this.issueFieldValues == null) {
            this.issueFieldValues = new ArrayList<>();
        }
        this.issueFieldValues.add(issueFieldValuesItem);
        return this;
    }

    /**
     * An array of issue field values to set on this issue. Each field value must include the field ID and the value to set. Only users with push access can set field values for issues
     * @return issueFieldValues
     */
    @Valid
    @Schema(
            name = "issue_field_values",
            description =
                    "An array of issue field values to set on this issue. Each field value must include the field ID and the value to set. Only users with push access can set field values for issues",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issue_field_values")
    public List<@Valid IssuesUpdateRequestIssueFieldValuesInner> getIssueFieldValues() {
        return issueFieldValues;
    }

    public void setIssueFieldValues(List<@Valid IssuesUpdateRequestIssueFieldValuesInner> issueFieldValues) {
        this.issueFieldValues = issueFieldValues;
    }

    public IssuesUpdateRequest type(String type) {
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The name of the issue type to associate with this issue or use `null` to remove the current issue type. Only users with push access can set the type for issues. Without push access to the repository, type changes are silently dropped.
     * @return type
     */
    @Schema(
            name = "type",
            example = "Epic",
            description =
                    "The name of the issue type to associate with this issue or use `null` to remove the current issue type. Only users with push access can set the type for issues. Without push access to the repository, type changes are silently dropped.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public JsonNullable<String> getType() {
        return type;
    }

    public void setType(JsonNullable<String> type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesUpdateRequest issuesUpdateRequest = (IssuesUpdateRequest) o;
        return equalsNullable(this.title, issuesUpdateRequest.title)
                && equalsNullable(this.body, issuesUpdateRequest.body)
                && Objects.equals(this.state, issuesUpdateRequest.state)
                && equalsNullable(this.stateReason, issuesUpdateRequest.stateReason)
                && equalsNullable(this.milestone, issuesUpdateRequest.milestone)
                && Objects.equals(this.labels, issuesUpdateRequest.labels)
                && Objects.equals(this.assignees, issuesUpdateRequest.assignees)
                && Objects.equals(this.issueFieldValues, issuesUpdateRequest.issueFieldValues)
                && equalsNullable(this.type, issuesUpdateRequest.type);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(title),
                hashCodeNullable(body),
                state,
                hashCodeNullable(stateReason),
                hashCodeNullable(milestone),
                labels,
                assignees,
                issueFieldValues,
                hashCodeNullable(type));
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
        sb.append("class IssuesUpdateRequest {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    stateReason: ").append(toIndentedString(stateReason)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    issueFieldValues: ")
                .append(toIndentedString(issueFieldValues))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
