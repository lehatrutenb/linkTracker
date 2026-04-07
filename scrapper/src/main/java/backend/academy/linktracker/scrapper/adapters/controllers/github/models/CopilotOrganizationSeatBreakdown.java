package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * The breakdown of Copilot Business seats for the organization.
 */
@Schema(
        name = "copilot-organization-seat-breakdown",
        description = "The breakdown of Copilot Business seats for the organization.")
@JsonTypeName("copilot-organization-seat-breakdown")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotOrganizationSeatBreakdown {

    private Optional<Long> total = Optional.empty();

    private Optional<Long> addedThisCycle = Optional.empty();

    private Optional<Long> pendingCancellation = Optional.empty();

    private Optional<Long> pendingInvitation = Optional.empty();

    private Optional<Long> activeThisCycle = Optional.empty();

    private Optional<Long> inactiveThisCycle = Optional.empty();

    public CopilotOrganizationSeatBreakdown total(Long total) {
        this.total = Optional.ofNullable(total);
        return this;
    }

    /**
     * The total number of seats being billed for the organization as of the current billing cycle.
     * @return total
     */
    @Schema(
            name = "total",
            description =
                    "The total number of seats being billed for the organization as of the current billing cycle.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total")
    public Optional<Long> getTotal() {
        return total;
    }

    public void setTotal(Optional<Long> total) {
        this.total = total;
    }

    public CopilotOrganizationSeatBreakdown addedThisCycle(Long addedThisCycle) {
        this.addedThisCycle = Optional.ofNullable(addedThisCycle);
        return this;
    }

    /**
     * Seats added during the current billing cycle.
     * @return addedThisCycle
     */
    @Schema(
            name = "added_this_cycle",
            description = "Seats added during the current billing cycle.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("added_this_cycle")
    public Optional<Long> getAddedThisCycle() {
        return addedThisCycle;
    }

    public void setAddedThisCycle(Optional<Long> addedThisCycle) {
        this.addedThisCycle = addedThisCycle;
    }

    public CopilotOrganizationSeatBreakdown pendingCancellation(Long pendingCancellation) {
        this.pendingCancellation = Optional.ofNullable(pendingCancellation);
        return this;
    }

    /**
     * The number of seats that are pending cancellation at the end of the current billing cycle.
     * @return pendingCancellation
     */
    @Schema(
            name = "pending_cancellation",
            description = "The number of seats that are pending cancellation at the end of the current billing cycle.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pending_cancellation")
    public Optional<Long> getPendingCancellation() {
        return pendingCancellation;
    }

    public void setPendingCancellation(Optional<Long> pendingCancellation) {
        this.pendingCancellation = pendingCancellation;
    }

    public CopilotOrganizationSeatBreakdown pendingInvitation(Long pendingInvitation) {
        this.pendingInvitation = Optional.ofNullable(pendingInvitation);
        return this;
    }

    /**
     * The number of users who have been invited to receive a Copilot seat through this organization.
     * @return pendingInvitation
     */
    @Schema(
            name = "pending_invitation",
            description =
                    "The number of users who have been invited to receive a Copilot seat through this organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pending_invitation")
    public Optional<Long> getPendingInvitation() {
        return pendingInvitation;
    }

    public void setPendingInvitation(Optional<Long> pendingInvitation) {
        this.pendingInvitation = pendingInvitation;
    }

    public CopilotOrganizationSeatBreakdown activeThisCycle(Long activeThisCycle) {
        this.activeThisCycle = Optional.ofNullable(activeThisCycle);
        return this;
    }

    /**
     * The number of seats that have used Copilot during the current billing cycle.
     * @return activeThisCycle
     */
    @Schema(
            name = "active_this_cycle",
            description = "The number of seats that have used Copilot during the current billing cycle.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("active_this_cycle")
    public Optional<Long> getActiveThisCycle() {
        return activeThisCycle;
    }

    public void setActiveThisCycle(Optional<Long> activeThisCycle) {
        this.activeThisCycle = activeThisCycle;
    }

    public CopilotOrganizationSeatBreakdown inactiveThisCycle(Long inactiveThisCycle) {
        this.inactiveThisCycle = Optional.ofNullable(inactiveThisCycle);
        return this;
    }

    /**
     * The number of seats that have not used Copilot during the current billing cycle.
     * @return inactiveThisCycle
     */
    @Schema(
            name = "inactive_this_cycle",
            description = "The number of seats that have not used Copilot during the current billing cycle.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("inactive_this_cycle")
    public Optional<Long> getInactiveThisCycle() {
        return inactiveThisCycle;
    }

    public void setInactiveThisCycle(Optional<Long> inactiveThisCycle) {
        this.inactiveThisCycle = inactiveThisCycle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotOrganizationSeatBreakdown copilotOrganizationSeatBreakdown = (CopilotOrganizationSeatBreakdown) o;
        return Objects.equals(this.total, copilotOrganizationSeatBreakdown.total)
                && Objects.equals(this.addedThisCycle, copilotOrganizationSeatBreakdown.addedThisCycle)
                && Objects.equals(this.pendingCancellation, copilotOrganizationSeatBreakdown.pendingCancellation)
                && Objects.equals(this.pendingInvitation, copilotOrganizationSeatBreakdown.pendingInvitation)
                && Objects.equals(this.activeThisCycle, copilotOrganizationSeatBreakdown.activeThisCycle)
                && Objects.equals(this.inactiveThisCycle, copilotOrganizationSeatBreakdown.inactiveThisCycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                total, addedThisCycle, pendingCancellation, pendingInvitation, activeThisCycle, inactiveThisCycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotOrganizationSeatBreakdown {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    addedThisCycle: ")
                .append(toIndentedString(addedThisCycle))
                .append("\n");
        sb.append("    pendingCancellation: ")
                .append(toIndentedString(pendingCancellation))
                .append("\n");
        sb.append("    pendingInvitation: ")
                .append(toIndentedString(pendingInvitation))
                .append("\n");
        sb.append("    activeThisCycle: ")
                .append(toIndentedString(activeThisCycle))
                .append("\n");
        sb.append("    inactiveThisCycle: ")
                .append(toIndentedString(inactiveThisCycle))
                .append("\n");
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
