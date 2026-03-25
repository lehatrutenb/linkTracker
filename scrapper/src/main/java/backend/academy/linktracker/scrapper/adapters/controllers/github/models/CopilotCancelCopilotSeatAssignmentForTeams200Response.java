package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The total number of seats set to \&quot;pending cancellation\&quot; for members of the specified team(s).
 */
@Schema(
        name = "copilot_cancel_copilot_seat_assignment_for_teams_200_response",
        description = "The total number of seats set to \"pending cancellation\" for members of the specified team(s).")
@JsonTypeName("copilot_cancel_copilot_seat_assignment_for_teams_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotCancelCopilotSeatAssignmentForTeams200Response {

    private Long seatsCancelled;

    public CopilotCancelCopilotSeatAssignmentForTeams200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotCancelCopilotSeatAssignmentForTeams200Response(Long seatsCancelled) {
        this.seatsCancelled = seatsCancelled;
    }

    public CopilotCancelCopilotSeatAssignmentForTeams200Response seatsCancelled(Long seatsCancelled) {
        this.seatsCancelled = seatsCancelled;
        return this;
    }

    /**
     * Get seatsCancelled
     * @return seatsCancelled
     */
    @NotNull
    @Schema(name = "seats_cancelled", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("seats_cancelled")
    public Long getSeatsCancelled() {
        return seatsCancelled;
    }

    public void setSeatsCancelled(Long seatsCancelled) {
        this.seatsCancelled = seatsCancelled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotCancelCopilotSeatAssignmentForTeams200Response copilotCancelCopilotSeatAssignmentForTeams200Response =
                (CopilotCancelCopilotSeatAssignmentForTeams200Response) o;
        return Objects.equals(
                this.seatsCancelled, copilotCancelCopilotSeatAssignmentForTeams200Response.seatsCancelled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatsCancelled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotCancelCopilotSeatAssignmentForTeams200Response {\n");
        sb.append("    seatsCancelled: ")
                .append(toIndentedString(seatsCancelled))
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
