package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * IssuesCreateRequest
 */
@JsonTypeName("issues_create_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssuesCreateRequest {

    private IssuesCreateRequestTitle title;

    private Optional<String> body = Optional.empty();

    private JsonNullable<IssuesCreateRequestMilestone> milestone =
            JsonNullable.<IssuesCreateRequestMilestone>undefined();

    @Valid
    private List<IssuesCreateRequestLabelsInner> labels = new ArrayList<>();

    @Valid
    private List<String> assignees = new ArrayList<>();

    private JsonNullable<String> type = JsonNullable.<String>undefined();

    public IssuesCreateRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IssuesCreateRequest(IssuesCreateRequestTitle title) {
        this.title = title;
    }

    public IssuesCreateRequest title(IssuesCreateRequestTitle title) {
        this.title = title;
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @NotNull
    @Valid
    @Schema(name = "title", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("title")
    public IssuesCreateRequestTitle getTitle() {
        return title;
    }

    public void setTitle(IssuesCreateRequestTitle title) {
        this.title = title;
    }

    public IssuesCreateRequest body(String body) {
        this.body = Optional.ofNullable(body);
        return this;
    }

    /**
     * The contents of the issue.
     * @return body
     */
    @Schema(name = "body", description = "The contents of the issue.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("body")
    public Optional<String> getBody() {
        return body;
    }

    public void setBody(Optional<String> body) {
        this.body = body;
    }

    public IssuesCreateRequest milestone(IssuesCreateRequestMilestone milestone) {
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
    public JsonNullable<IssuesCreateRequestMilestone> getMilestone() {
        return milestone;
    }

    public void setMilestone(JsonNullable<IssuesCreateRequestMilestone> milestone) {
        this.milestone = milestone;
    }

    public IssuesCreateRequest labels(List<IssuesCreateRequestLabelsInner> labels) {
        this.labels = labels;
        return this;
    }

    public IssuesCreateRequest addLabelsItem(IssuesCreateRequestLabelsInner labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Labels to associate with this issue. _NOTE: Only users with push access can set labels for new issues. Labels are silently dropped otherwise._
     * @return labels
     */
    @Valid
    @Schema(
            name = "labels",
            description =
                    "Labels to associate with this issue. _NOTE: Only users with push access can set labels for new issues. Labels are silently dropped otherwise._",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("labels")
    public List<IssuesCreateRequestLabelsInner> getLabels() {
        return labels;
    }

    public void setLabels(List<IssuesCreateRequestLabelsInner> labels) {
        this.labels = labels;
    }

    public IssuesCreateRequest assignees(List<String> assignees) {
        this.assignees = assignees;
        return this;
    }

    public IssuesCreateRequest addAssigneesItem(String assigneesItem) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        this.assignees.add(assigneesItem);
        return this;
    }

    /**
     * Logins for Users to assign to this issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._
     * @return assignees
     */
    @Schema(
            name = "assignees",
            description =
                    "Logins for Users to assign to this issue. _NOTE: Only users with push access can set assignees for new issues. Assignees are silently dropped otherwise._",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees")
    public List<String> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<String> assignees) {
        this.assignees = assignees;
    }

    public IssuesCreateRequest type(String type) {
        this.type = JsonNullable.of(type);
        return this;
    }

    /**
     * The name of the issue type to associate with this issue. _NOTE: Only users with push access can set the type for new issues. The type is silently dropped otherwise._
     * @return type
     */
    @Schema(
            name = "type",
            example = "Epic",
            description =
                    "The name of the issue type to associate with this issue. _NOTE: Only users with push access can set the type for new issues. The type is silently dropped otherwise._",
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
        IssuesCreateRequest issuesCreateRequest = (IssuesCreateRequest) o;
        return Objects.equals(this.title, issuesCreateRequest.title)
                && Objects.equals(this.body, issuesCreateRequest.body)
                && equalsNullable(this.milestone, issuesCreateRequest.milestone)
                && Objects.equals(this.labels, issuesCreateRequest.labels)
                && Objects.equals(this.assignees, issuesCreateRequest.assignees)
                && equalsNullable(this.type, issuesCreateRequest.type);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, body, hashCodeNullable(milestone), labels, assignees, hashCodeNullable(type));
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
        sb.append("class IssuesCreateRequest {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("    milestone: ").append(toIndentedString(milestone)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
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
