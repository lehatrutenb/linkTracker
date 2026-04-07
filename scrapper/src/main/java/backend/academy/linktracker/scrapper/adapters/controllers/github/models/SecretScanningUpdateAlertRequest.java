package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SecretScanningUpdateAlertRequest
 */
@JsonTypeName("secret_scanning_update_alert_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningUpdateAlertRequest {

    private Optional<SecretScanningAlertState> state = Optional.empty();

    private JsonNullable<SecretScanningAlertResolution> resolution =
            JsonNullable.<SecretScanningAlertResolution>undefined();

    private JsonNullable<String> resolutionComment = JsonNullable.<String>undefined();

    private JsonNullable<String> assignee = JsonNullable.<String>undefined();

    public SecretScanningUpdateAlertRequest state(SecretScanningAlertState state) {
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
    public Optional<SecretScanningAlertState> getState() {
        return state;
    }

    public void setState(Optional<SecretScanningAlertState> state) {
        this.state = state;
    }

    public SecretScanningUpdateAlertRequest resolution(SecretScanningAlertResolution resolution) {
        this.resolution = JsonNullable.of(resolution);
        return this;
    }

    /**
     * Get resolution
     * @return resolution
     */
    @Valid
    @Schema(name = "resolution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("resolution")
    public JsonNullable<SecretScanningAlertResolution> getResolution() {
        return resolution;
    }

    public void setResolution(JsonNullable<SecretScanningAlertResolution> resolution) {
        this.resolution = resolution;
    }

    public SecretScanningUpdateAlertRequest resolutionComment(String resolutionComment) {
        this.resolutionComment = JsonNullable.of(resolutionComment);
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
    public JsonNullable<String> getResolutionComment() {
        return resolutionComment;
    }

    public void setResolutionComment(JsonNullable<String> resolutionComment) {
        this.resolutionComment = resolutionComment;
    }

    public SecretScanningUpdateAlertRequest assignee(String assignee) {
        this.assignee = JsonNullable.of(assignee);
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
    public JsonNullable<String> getAssignee() {
        return assignee;
    }

    public void setAssignee(JsonNullable<String> assignee) {
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
                && equalsNullable(this.resolution, secretScanningUpdateAlertRequest.resolution)
                && equalsNullable(this.resolutionComment, secretScanningUpdateAlertRequest.resolutionComment)
                && equalsNullable(this.assignee, secretScanningUpdateAlertRequest.assignee);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                state, hashCodeNullable(resolution), hashCodeNullable(resolutionComment), hashCodeNullable(assignee));
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
