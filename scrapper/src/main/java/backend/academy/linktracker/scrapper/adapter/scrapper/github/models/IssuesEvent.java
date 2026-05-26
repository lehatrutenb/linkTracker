package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * IssuesEvent
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesEvent implements EventPayload {

    private String action;

    private Issue issue;

    private Optional<SimpleUser1> assignee = Optional.empty();

    @Valid
    private List<@Valid SimpleUser1> assignees = new ArrayList<>();

    private Optional<Label> label = Optional.empty();

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    public IssuesEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesEvent(String action, Issue issue) {
        this.action = action;
        this.issue = issue;
    }

    public IssuesEvent action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @NotNull
    @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public IssuesEvent issue(Issue issue) {
        this.issue = issue;
        return this;
    }

    /**
     * Get issue
     * @return issue
     */
    @NotNull
    @Valid
    @Schema(name = "issue", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue")
    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public IssuesEvent assignee(SimpleUser1 assignee) {
        this.assignee = Optional.ofNullable(assignee);
        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    @Valid
    @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignee")
    public Optional<SimpleUser1> getAssignee() {
        return assignee;
    }

    public void setAssignee(Optional<SimpleUser1> assignee) {
        this.assignee = assignee;
    }

    public IssuesEvent assignees(List<@Valid SimpleUser1> assignees) {
        this.assignees = assignees;
        return this;
    }

    public IssuesEvent addAssigneesItem(SimpleUser1 assigneesItem) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        this.assignees.add(assigneesItem);
        return this;
    }

    /**
     * Get assignees
     * @return assignees
     */
    @Valid
    @Schema(name = "assignees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees")
    public List<@Valid SimpleUser1> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<@Valid SimpleUser1> assignees) {
        this.assignees = assignees;
    }

    public IssuesEvent label(Label label) {
        this.label = Optional.ofNullable(label);
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @Valid
    @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("label")
    public Optional<Label> getLabel() {
        return label;
    }

    public void setLabel(Optional<Label> label) {
        this.label = label;
    }

    public IssuesEvent labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public IssuesEvent addLabelsItem(Label labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    @Valid
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public List<@Valid Label> getLabels() {
        return labels;
    }

    public void setLabels(List<@Valid Label> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssuesEvent issuesEvent = (IssuesEvent) o;
        return Objects.equals(this.action, issuesEvent.action)
                && Objects.equals(this.issue, issuesEvent.issue)
                && Objects.equals(this.assignee, issuesEvent.assignee)
                && Objects.equals(this.assignees, issuesEvent.assignees)
                && Objects.equals(this.label, issuesEvent.label)
                && Objects.equals(this.labels, issuesEvent.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, issue, assignee, assignees, label, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssuesEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
