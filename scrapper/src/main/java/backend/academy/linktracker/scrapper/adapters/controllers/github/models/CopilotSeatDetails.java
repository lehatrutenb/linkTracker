package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Information about a Copilot Business seat assignment for a user, team, or organization.
 */
@Schema(
        name = "copilot-seat-details",
        description = "Information about a Copilot Business seat assignment for a user, team, or organization.")
@JsonTypeName("copilot-seat-details")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotSeatDetails {

    private NullableSimpleUser assignee = null;

    private NullableOrganizationSimple organization = null;

    private CopilotSeatDetailsAssigningTeam assigningTeam = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate pendingCancellationDate = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastActivityAt = null;

    private String lastActivityEditor = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastAuthenticatedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @Deprecated
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    /**
     * The Copilot plan of the organization, or the parent enterprise, when applicable.
     */
    public enum PlanTypeEnum {
        BUSINESS("business"),

        ENTERPRISE("enterprise"),

        UNKNOWN("unknown");

        private final String value;

        PlanTypeEnum(String value) {
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
        public static PlanTypeEnum fromValue(String value) {
            for (PlanTypeEnum b : PlanTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PlanTypeEnum planType;

    public CopilotSeatDetails() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotSeatDetails(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CopilotSeatDetails assignee(NullableSimpleUser assignee) {
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
    public NullableSimpleUser getAssignee() {
        return assignee;
    }

    public void setAssignee(NullableSimpleUser assignee) {
        this.assignee = assignee;
    }

    public CopilotSeatDetails organization(NullableOrganizationSimple organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public NullableOrganizationSimple getOrganization() {
        return organization;
    }

    public void setOrganization(NullableOrganizationSimple organization) {
        this.organization = organization;
    }

    public CopilotSeatDetails assigningTeam(CopilotSeatDetailsAssigningTeam assigningTeam) {
        this.assigningTeam = assigningTeam;
        return this;
    }

    /**
     * Get assigningTeam
     * @return assigningTeam
     */
    @Valid
    @Schema(name = "assigning_team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assigning_team")
    public CopilotSeatDetailsAssigningTeam getAssigningTeam() {
        return assigningTeam;
    }

    public void setAssigningTeam(CopilotSeatDetailsAssigningTeam assigningTeam) {
        this.assigningTeam = assigningTeam;
    }

    public CopilotSeatDetails pendingCancellationDate(LocalDate pendingCancellationDate) {
        this.pendingCancellationDate = pendingCancellationDate;
        return this;
    }

    /**
     * The pending cancellation date for the seat, in `YYYY-MM-DD` format. This will be null unless the assignee's Copilot access has been canceled during the current billing cycle. If the seat has been cancelled, this corresponds to the start of the organization's next billing cycle.
     * @return pendingCancellationDate
     */
    @Valid
    @Schema(
            name = "pending_cancellation_date",
            description =
                    "The pending cancellation date for the seat, in `YYYY-MM-DD` format. This will be null unless the assignee's Copilot access has been canceled during the current billing cycle. If the seat has been cancelled, this corresponds to the start of the organization's next billing cycle.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pending_cancellation_date")
    public LocalDate getPendingCancellationDate() {
        return pendingCancellationDate;
    }

    public void setPendingCancellationDate(LocalDate pendingCancellationDate) {
        this.pendingCancellationDate = pendingCancellationDate;
    }

    public CopilotSeatDetails lastActivityAt(OffsetDateTime lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
        return this;
    }

    /**
     * Timestamp of user's last GitHub Copilot activity, in ISO 8601 format.
     * @return lastActivityAt
     */
    @Valid
    @Schema(
            name = "last_activity_at",
            description = "Timestamp of user's last GitHub Copilot activity, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_activity_at")
    public OffsetDateTime getLastActivityAt() {
        return lastActivityAt;
    }

    public void setLastActivityAt(OffsetDateTime lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    public CopilotSeatDetails lastActivityEditor(String lastActivityEditor) {
        this.lastActivityEditor = lastActivityEditor;
        return this;
    }

    /**
     * Last editor that was used by the user for a GitHub Copilot completion.
     * @return lastActivityEditor
     */
    @Schema(
            name = "last_activity_editor",
            description = "Last editor that was used by the user for a GitHub Copilot completion.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_activity_editor")
    public String getLastActivityEditor() {
        return lastActivityEditor;
    }

    public void setLastActivityEditor(String lastActivityEditor) {
        this.lastActivityEditor = lastActivityEditor;
    }

    public CopilotSeatDetails lastAuthenticatedAt(OffsetDateTime lastAuthenticatedAt) {
        this.lastAuthenticatedAt = lastAuthenticatedAt;
        return this;
    }

    /**
     * Timestamp of the last time the user authenticated with GitHub Copilot, in ISO 8601 format.
     * @return lastAuthenticatedAt
     */
    @Valid
    @Schema(
            name = "last_authenticated_at",
            description = "Timestamp of the last time the user authenticated with GitHub Copilot, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_authenticated_at")
    public OffsetDateTime getLastAuthenticatedAt() {
        return lastAuthenticatedAt;
    }

    public void setLastAuthenticatedAt(OffsetDateTime lastAuthenticatedAt) {
        this.lastAuthenticatedAt = lastAuthenticatedAt;
    }

    public CopilotSeatDetails createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Timestamp of when the assignee was last granted access to GitHub Copilot, in ISO 8601 format.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            description =
                    "Timestamp of when the assignee was last granted access to GitHub Copilot, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CopilotSeatDetails updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **Closing down notice:** This field is no longer relevant and is closing down. Use the `created_at` field to determine when the assignee was last granted access to GitHub Copilot. Timestamp of when the assignee's GitHub Copilot access was last updated, in ISO 8601 format.
     * @return updatedAt
     * @deprecated
     */
    @Valid
    @Schema(
            name = "updated_at",
            description =
                    "**Closing down notice:** This field is no longer relevant and is closing down. Use the `created_at` field to determine when the assignee was last granted access to GitHub Copilot. Timestamp of when the assignee's GitHub Copilot access was last updated, in ISO 8601 format.",
            deprecated = true,
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    @Deprecated
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CopilotSeatDetails planType(PlanTypeEnum planType) {
        this.planType = planType;
        return this;
    }

    /**
     * The Copilot plan of the organization, or the parent enterprise, when applicable.
     * @return planType
     */
    @Schema(
            name = "plan_type",
            description = "The Copilot plan of the organization, or the parent enterprise, when applicable.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("plan_type")
    public PlanTypeEnum getPlanType() {
        return planType;
    }

    public void setPlanType(PlanTypeEnum planType) {
        this.planType = planType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotSeatDetails copilotSeatDetails = (CopilotSeatDetails) o;
        return Objects.equals(this.assignee, copilotSeatDetails.assignee)
                && Objects.equals(this.organization, copilotSeatDetails.organization)
                && Objects.equals(this.assigningTeam, copilotSeatDetails.assigningTeam)
                && Objects.equals(this.pendingCancellationDate, copilotSeatDetails.pendingCancellationDate)
                && Objects.equals(this.lastActivityAt, copilotSeatDetails.lastActivityAt)
                && Objects.equals(this.lastActivityEditor, copilotSeatDetails.lastActivityEditor)
                && Objects.equals(this.lastAuthenticatedAt, copilotSeatDetails.lastAuthenticatedAt)
                && Objects.equals(this.createdAt, copilotSeatDetails.createdAt)
                && Objects.equals(this.updatedAt, copilotSeatDetails.updatedAt)
                && Objects.equals(this.planType, copilotSeatDetails.planType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                assignee,
                organization,
                assigningTeam,
                pendingCancellationDate,
                lastActivityAt,
                lastActivityEditor,
                lastAuthenticatedAt,
                createdAt,
                updatedAt,
                planType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotSeatDetails {\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    assigningTeam: ").append(toIndentedString(assigningTeam)).append("\n");
        sb.append("    pendingCancellationDate: ")
                .append(toIndentedString(pendingCancellationDate))
                .append("\n");
        sb.append("    lastActivityAt: ")
                .append(toIndentedString(lastActivityAt))
                .append("\n");
        sb.append("    lastActivityEditor: ")
                .append(toIndentedString(lastActivityEditor))
                .append("\n");
        sb.append("    lastAuthenticatedAt: ")
                .append(toIndentedString(lastAuthenticatedAt))
                .append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
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
