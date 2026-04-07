package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
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
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotSeatDetails {

    private JsonNullable<NullableSimpleUser> assignee = JsonNullable.<NullableSimpleUser>undefined();

    private JsonNullable<NullableOrganizationSimple> organization =
            JsonNullable.<NullableOrganizationSimple>undefined();

    private JsonNullable<CopilotSeatDetailsAssigningTeam> assigningTeam =
            JsonNullable.<CopilotSeatDetailsAssigningTeam>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private JsonNullable<LocalDate> pendingCancellationDate = JsonNullable.<LocalDate>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> lastActivityAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<String> lastActivityEditor = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> lastAuthenticatedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @Deprecated
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> updatedAt = Optional.empty();

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

    private Optional<PlanTypeEnum> planType = Optional.empty();

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
        this.assignee = JsonNullable.of(assignee);
        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    @Valid
    @Schema(name = "assignee", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignee")
    public JsonNullable<NullableSimpleUser> getAssignee() {
        return assignee;
    }

    public void setAssignee(JsonNullable<NullableSimpleUser> assignee) {
        this.assignee = assignee;
    }

    public CopilotSeatDetails organization(NullableOrganizationSimple organization) {
        this.organization = JsonNullable.of(organization);
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public JsonNullable<NullableOrganizationSimple> getOrganization() {
        return organization;
    }

    public void setOrganization(JsonNullable<NullableOrganizationSimple> organization) {
        this.organization = organization;
    }

    public CopilotSeatDetails assigningTeam(CopilotSeatDetailsAssigningTeam assigningTeam) {
        this.assigningTeam = JsonNullable.of(assigningTeam);
        return this;
    }

    /**
     * Get assigningTeam
     * @return assigningTeam
     */
    @Valid
    @Schema(name = "assigning_team", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assigning_team")
    public JsonNullable<CopilotSeatDetailsAssigningTeam> getAssigningTeam() {
        return assigningTeam;
    }

    public void setAssigningTeam(JsonNullable<CopilotSeatDetailsAssigningTeam> assigningTeam) {
        this.assigningTeam = assigningTeam;
    }

    public CopilotSeatDetails pendingCancellationDate(LocalDate pendingCancellationDate) {
        this.pendingCancellationDate = JsonNullable.of(pendingCancellationDate);
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
    public JsonNullable<LocalDate> getPendingCancellationDate() {
        return pendingCancellationDate;
    }

    public void setPendingCancellationDate(JsonNullable<LocalDate> pendingCancellationDate) {
        this.pendingCancellationDate = pendingCancellationDate;
    }

    public CopilotSeatDetails lastActivityAt(OffsetDateTime lastActivityAt) {
        this.lastActivityAt = JsonNullable.of(lastActivityAt);
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
    public JsonNullable<OffsetDateTime> getLastActivityAt() {
        return lastActivityAt;
    }

    public void setLastActivityAt(JsonNullable<OffsetDateTime> lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    public CopilotSeatDetails lastActivityEditor(String lastActivityEditor) {
        this.lastActivityEditor = JsonNullable.of(lastActivityEditor);
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
    public JsonNullable<String> getLastActivityEditor() {
        return lastActivityEditor;
    }

    public void setLastActivityEditor(JsonNullable<String> lastActivityEditor) {
        this.lastActivityEditor = lastActivityEditor;
    }

    public CopilotSeatDetails lastAuthenticatedAt(OffsetDateTime lastAuthenticatedAt) {
        this.lastAuthenticatedAt = JsonNullable.of(lastAuthenticatedAt);
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
    public JsonNullable<OffsetDateTime> getLastAuthenticatedAt() {
        return lastAuthenticatedAt;
    }

    public void setLastAuthenticatedAt(JsonNullable<OffsetDateTime> lastAuthenticatedAt) {
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
        this.updatedAt = Optional.ofNullable(updatedAt);
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
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    /**
     * @deprecated
     */
    @Deprecated
    public void setUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CopilotSeatDetails planType(PlanTypeEnum planType) {
        this.planType = Optional.ofNullable(planType);
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
    public Optional<PlanTypeEnum> getPlanType() {
        return planType;
    }

    public void setPlanType(Optional<PlanTypeEnum> planType) {
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
        return equalsNullable(this.assignee, copilotSeatDetails.assignee)
                && equalsNullable(this.organization, copilotSeatDetails.organization)
                && equalsNullable(this.assigningTeam, copilotSeatDetails.assigningTeam)
                && equalsNullable(this.pendingCancellationDate, copilotSeatDetails.pendingCancellationDate)
                && equalsNullable(this.lastActivityAt, copilotSeatDetails.lastActivityAt)
                && equalsNullable(this.lastActivityEditor, copilotSeatDetails.lastActivityEditor)
                && equalsNullable(this.lastAuthenticatedAt, copilotSeatDetails.lastAuthenticatedAt)
                && Objects.equals(this.createdAt, copilotSeatDetails.createdAt)
                && Objects.equals(this.updatedAt, copilotSeatDetails.updatedAt)
                && Objects.equals(this.planType, copilotSeatDetails.planType);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(assignee),
                hashCodeNullable(organization),
                hashCodeNullable(assigningTeam),
                hashCodeNullable(pendingCancellationDate),
                hashCodeNullable(lastActivityAt),
                hashCodeNullable(lastActivityEditor),
                hashCodeNullable(lastAuthenticatedAt),
                createdAt,
                updatedAt,
                planType);
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
