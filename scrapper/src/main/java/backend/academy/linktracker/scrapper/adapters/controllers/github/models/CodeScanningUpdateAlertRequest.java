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
 * CodeScanningUpdateAlertRequest
 */
@JsonTypeName("code_scanning_update_alert_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningUpdateAlertRequest {

    private CodeScanningAlertSetState state;

    private CodeScanningAlertDismissedReason dismissedReason = null;

    private String dismissedComment = null;

    private Boolean createRequest;

    @Valid
    private List<String> assignees = new ArrayList<>();

    public CodeScanningUpdateAlertRequest state(CodeScanningAlertSetState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Valid
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public CodeScanningAlertSetState getState() {
        return state;
    }

    public void setState(CodeScanningAlertSetState state) {
        this.state = state;
    }

    public CodeScanningUpdateAlertRequest dismissedReason(CodeScanningAlertDismissedReason dismissedReason) {
        this.dismissedReason = dismissedReason;
        return this;
    }

    /**
     * Get dismissedReason
     * @return dismissedReason
     */
    @Valid
    @Schema(name = "dismissed_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_reason")
    public CodeScanningAlertDismissedReason getDismissedReason() {
        return dismissedReason;
    }

    public void setDismissedReason(CodeScanningAlertDismissedReason dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    public CodeScanningUpdateAlertRequest dismissedComment(String dismissedComment) {
        this.dismissedComment = dismissedComment;
        return this;
    }

    /**
     * The dismissal comment associated with the dismissal of the alert.
     * @return dismissedComment
     */
    @Size(max = 280)
    @Schema(
            name = "dismissed_comment",
            description = "The dismissal comment associated with the dismissal of the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_comment")
    public String getDismissedComment() {
        return dismissedComment;
    }

    public void setDismissedComment(String dismissedComment) {
        this.dismissedComment = dismissedComment;
    }

    public CodeScanningUpdateAlertRequest createRequest(Boolean createRequest) {
        this.createRequest = createRequest;
        return this;
    }

    /**
     * If `true`, attempt to create an alert dismissal request.
     * @return createRequest
     */
    @Schema(
            name = "create_request",
            description = "If `true`, attempt to create an alert dismissal request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("create_request")
    public Boolean getCreateRequest() {
        return createRequest;
    }

    public void setCreateRequest(Boolean createRequest) {
        this.createRequest = createRequest;
    }

    public CodeScanningUpdateAlertRequest assignees(List<String> assignees) {
        this.assignees = assignees;
        return this;
    }

    public CodeScanningUpdateAlertRequest addAssigneesItem(String assigneesItem) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        this.assignees.add(assigneesItem);
        return this;
    }

    /**
     * The list of users to assign to the code scanning alert. An empty array unassigns all previous assignees from the alert.
     * @return assignees
     */
    @Schema(
            name = "assignees",
            description =
                    "The list of users to assign to the code scanning alert. An empty array unassigns all previous assignees from the alert.",
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
        CodeScanningUpdateAlertRequest codeScanningUpdateAlertRequest = (CodeScanningUpdateAlertRequest) o;
        return Objects.equals(this.state, codeScanningUpdateAlertRequest.state)
                && Objects.equals(this.dismissedReason, codeScanningUpdateAlertRequest.dismissedReason)
                && Objects.equals(this.dismissedComment, codeScanningUpdateAlertRequest.dismissedComment)
                && Objects.equals(this.createRequest, codeScanningUpdateAlertRequest.createRequest)
                && Objects.equals(this.assignees, codeScanningUpdateAlertRequest.assignees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, dismissedReason, dismissedComment, createRequest, assignees);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningUpdateAlertRequest {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    dismissedReason: ")
                .append(toIndentedString(dismissedReason))
                .append("\n");
        sb.append("    dismissedComment: ")
                .append(toIndentedString(dismissedComment))
                .append("\n");
        sb.append("    createRequest: ").append(toIndentedString(createRequest)).append("\n");
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
