package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * SecretScanningUpdateAlertRequest
 */
@JsonTypeName("secret_scanning_update_alert_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningUpdateAlertRequest {

    private SecretScanningAlertState state;

    private SecretScanningAlertResolution resolution = null;

    private String resolutionComment = null;

    private String assignee = null;

    public SecretScanningUpdateAlertRequest state(SecretScanningAlertState state) {
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
    public SecretScanningAlertState getState() {
        return state;
    }

    public void setState(SecretScanningAlertState state) {
        this.state = state;
    }

    public SecretScanningUpdateAlertRequest resolution(SecretScanningAlertResolution resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * Get resolution
     * @return resolution
     */
    @Valid
    @Schema(name = "resolution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolution")
    public SecretScanningAlertResolution getResolution() {
        return resolution;
    }

    public void setResolution(SecretScanningAlertResolution resolution) {
        this.resolution = resolution;
    }

    public SecretScanningUpdateAlertRequest resolutionComment(String resolutionComment) {
        this.resolutionComment = resolutionComment;
        return this;
    }

    /**
     * An optional comment when closing or reopening an alert. Cannot be updated or deleted.
     * @return resolutionComment
     */
    @Schema(
            name = "resolution_comment",
            description = "An optional comment when closing or reopening an alert. Cannot be updated or deleted.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolution_comment")
    public String getResolutionComment() {
        return resolutionComment;
    }

    public void setResolutionComment(String resolutionComment) {
        this.resolutionComment = resolutionComment;
    }

    public SecretScanningUpdateAlertRequest assignee(String assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * The username of the user to assign to the alert. Set to `null` to unassign the alert.
     * @return assignee
     */
    @Schema(
            name = "assignee",
            description = "The username of the user to assign to the alert. Set to `null` to unassign the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignee")
    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningUpdateAlertRequest secretScanningUpdateAlertRequest = (SecretScanningUpdateAlertRequest) o;
        return Objects.equals(this.state, secretScanningUpdateAlertRequest.state)
                && Objects.equals(this.resolution, secretScanningUpdateAlertRequest.resolution)
                && Objects.equals(this.resolutionComment, secretScanningUpdateAlertRequest.resolutionComment)
                && Objects.equals(this.assignee, secretScanningUpdateAlertRequest.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, resolution, resolutionComment, assignee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningUpdateAlertRequest {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    resolutionComment: ")
                .append(toIndentedString(resolutionComment))
                .append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
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
