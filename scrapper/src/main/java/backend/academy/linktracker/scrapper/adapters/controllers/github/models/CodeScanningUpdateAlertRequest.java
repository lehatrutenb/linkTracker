package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CodeScanningUpdateAlertRequest
 */
@JsonTypeName("code_scanning_update_alert_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningUpdateAlertRequest {

    private Optional<CodeScanningAlertSetState> state = Optional.empty();

    private JsonNullable<CodeScanningAlertDismissedReason> dismissedReason =
            JsonNullable.<CodeScanningAlertDismissedReason>undefined();

    private JsonNullable<@Size(max = 280) String> dismissedComment = JsonNullable.<String>undefined();

    private Optional<Boolean> createRequest = Optional.empty();

    @Valid
    private List<String> assignees = new ArrayList<>();

    public CodeScanningUpdateAlertRequest state(CodeScanningAlertSetState state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @Valid
    @Schema(name = "state", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<CodeScanningAlertSetState> getState() {
        return state;
    }

    public void setState(Optional<CodeScanningAlertSetState> state) {
        this.state = state;
    }

    public CodeScanningUpdateAlertRequest dismissedReason(CodeScanningAlertDismissedReason dismissedReason) {
        this.dismissedReason = JsonNullable.of(dismissedReason);
        return this;
    }

    /**
     * Get dismissedReason
     * @return dismissedReason
     */
    @Valid
    @Schema(name = "dismissed_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_reason")
    public JsonNullable<CodeScanningAlertDismissedReason> getDismissedReason() {
        return dismissedReason;
    }

    public void setDismissedReason(JsonNullable<CodeScanningAlertDismissedReason> dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    public CodeScanningUpdateAlertRequest dismissedComment(String dismissedComment) {
        this.dismissedComment = JsonNullable.of(dismissedComment);
        return this;
    }

    /**
     * The dismissal comment associated with the dismissal of the alert.
     * @return dismissedComment
     */
    @Schema(
            name = "dismissed_comment",
            description = "The dismissal comment associated with the dismissal of the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_comment")
    public JsonNullable<@Size(max = 280) String> getDismissedComment() {
        return dismissedComment;
    }

    public void setDismissedComment(JsonNullable<String> dismissedComment) {
        this.dismissedComment = dismissedComment;
    }

    public CodeScanningUpdateAlertRequest createRequest(Boolean createRequest) {
        this.createRequest = Optional.ofNullable(createRequest);
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
    public Optional<Boolean> getCreateRequest() {
        return createRequest;
    }

    public void setCreateRequest(Optional<Boolean> createRequest) {
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
                && equalsNullable(this.dismissedReason, codeScanningUpdateAlertRequest.dismissedReason)
                && equalsNullable(this.dismissedComment, codeScanningUpdateAlertRequest.dismissedComment)
                && Objects.equals(this.createRequest, codeScanningUpdateAlertRequest.createRequest)
                && Objects.equals(this.assignees, codeScanningUpdateAlertRequest.assignees);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                state, hashCodeNullable(dismissedReason), hashCodeNullable(dismissedComment), createRequest, assignees);
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
