package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PullRequestEvent
 */
@JsonTypeName("pull-request-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestEvent implements EventPayload {

    private String action;

    private Long number;

    private PullRequestMinimal pullRequest;

    private SimpleUser assignee;

    @Valid
    private List<@Valid SimpleUser> assignees = new ArrayList<>();

    private Label label;

    @Valid
    private List<@Valid Label> labels = new ArrayList<>();

    public PullRequestEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestEvent(String action, Long number, PullRequestMinimal pullRequest) {
        this.action = action;
        this.number = number;
        this.pullRequest = pullRequest;
    }

    public PullRequestEvent action(String action) {
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

    public PullRequestEvent number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public PullRequestEvent pullRequest(PullRequestMinimal pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    @NotNull
    @Valid
    @Schema(name = "pull_request", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request")
    public PullRequestMinimal getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(PullRequestMinimal pullRequest) {
        this.pullRequest = pullRequest;
    }

    public PullRequestEvent assignee(SimpleUser assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    @Valid
    @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignee")
    public SimpleUser getAssignee() {
        return assignee;
    }

    public void setAssignee(SimpleUser assignee) {
        this.assignee = assignee;
    }

    public PullRequestEvent assignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
        return this;
    }

    public PullRequestEvent addAssigneesItem(SimpleUser assigneesItem) {
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
    public List<@Valid SimpleUser> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
    }

    public PullRequestEvent label(Label label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @Valid
    @Schema(name = "label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("label")
    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public PullRequestEvent labels(List<@Valid Label> labels) {
        this.labels = labels;
        return this;
    }

    public PullRequestEvent addLabelsItem(Label labelsItem) {
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
        PullRequestEvent pullRequestEvent = (PullRequestEvent) o;
        return Objects.equals(this.action, pullRequestEvent.action)
                && Objects.equals(this.number, pullRequestEvent.number)
                && Objects.equals(this.pullRequest, pullRequestEvent.pullRequest)
                && Objects.equals(this.assignee, pullRequestEvent.assignee)
                && Objects.equals(this.assignees, pullRequestEvent.assignees)
                && Objects.equals(this.label, pullRequestEvent.label)
                && Objects.equals(this.labels, pullRequestEvent.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, number, pullRequest, assignee, assignees, label, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
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
