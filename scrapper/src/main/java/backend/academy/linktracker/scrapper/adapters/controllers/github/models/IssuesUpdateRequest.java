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
 * IssuesUpdateRequest
 */
@JsonTypeName("issues_update_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesUpdateRequest {

    private IssuesUpdateRequestTitle title = null;

    private String body = null;

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

    private StateEnum state;

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

    private StateReasonEnum stateReason = null;

    private IssuesUpdateRequestMilestone milestone = null;

    @Valid
    private List<IssuesCreateRequestLabelsInner> labels = new ArrayList<>();

    @Valid
    private List<String> assignees = new ArrayList<>();

    @Valid
    private List<@Valid IssuesUpdateRequestIssueFieldValuesInner> issueFieldValues = new ArrayList<>();

    private String type = null;

    public IssuesUpdateRequest title(IssuesUpdateRequestTitle title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Valid
    @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public IssuesUpdateRequestTitle getTitle() {
        return title;
    }

    public void setTitle(IssuesUpdateRequestTitle title) {
        this.title = title;
    }

    public IssuesUpdateRequest body(String body) {
        this.body = body;
        return this;
    }

    /**
     * The contents of the issue.
     * @return body
     */
    @Schema(name = "body", description = "The contents of the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public IssuesUpdateRequest state(StateEnum state) {
        this.state = state;
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
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public IssuesUpdateRequest stateReason(StateReasonEnum stateReason) {
        this.stateReason = stateReason;
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
    public StateReasonEnum getStateReason() {
        return stateReason;
    }

    public void setStateReason(StateReasonEnum stateReason) {
        this.stateReason = stateReason;
    }

    public IssuesUpdateRequest milestone(IssuesUpdateRequestMilestone milestone) {
        this.milestone = milestone;
        return this;
    }

    /**
     * Get milestone
     * @return milestone
     */
    @Valid
    @Schema(name = "milestone", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("milestone")
    public IssuesUpdateRequestMilestone getMilestone() {
        return milestone;
    }

    public void setMilestone(IssuesUpdateRequestMilestone milestone) {
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
        this.type = type;
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
    public String getType() {
        return type;
    }

    public void setType(String type) {
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
        return Objects.equals(this.title, issuesUpdateRequest.title)
                && Objects.equals(this.body, issuesUpdateRequest.body)
                && Objects.equals(this.state, issuesUpdateRequest.state)
                && Objects.equals(this.stateReason, issuesUpdateRequest.stateReason)
                && Objects.equals(this.milestone, issuesUpdateRequest.milestone)
                && Objects.equals(this.labels, issuesUpdateRequest.labels)
                && Objects.equals(this.assignees, issuesUpdateRequest.assignees)
                && Objects.equals(this.issueFieldValues, issuesUpdateRequest.issueFieldValues)
                && Objects.equals(this.type, issuesUpdateRequest.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, body, state, stateReason, milestone, labels, assignees, issueFieldValues, type);
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
