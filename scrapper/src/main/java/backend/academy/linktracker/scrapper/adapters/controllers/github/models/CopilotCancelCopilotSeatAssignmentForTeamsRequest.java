package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CopilotCancelCopilotSeatAssignmentForTeamsRequest
 */
@JsonTypeName("copilot_cancel_copilot_seat_assignment_for_teams_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotCancelCopilotSeatAssignmentForTeamsRequest {

    @Valid
    private List<String> selectedTeams = new ArrayList<>();

    public CopilotCancelCopilotSeatAssignmentForTeamsRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotCancelCopilotSeatAssignmentForTeamsRequest(List<String> selectedTeams) {
        this.selectedTeams = selectedTeams;
    }

    public CopilotCancelCopilotSeatAssignmentForTeamsRequest selectedTeams(List<String> selectedTeams) {
        this.selectedTeams = selectedTeams;
        return this;
    }

    public CopilotCancelCopilotSeatAssignmentForTeamsRequest addSelectedTeamsItem(String selectedTeamsItem) {
        if (this.selectedTeams == null) {
            this.selectedTeams = new ArrayList<>();
        }
        this.selectedTeams.add(selectedTeamsItem);
        return this;
    }

    /**
     * The names of teams from which to revoke access to GitHub Copilot.
     * @return selectedTeams
     */
    @NotNull
    @Size(min = 1)
    @Schema(
            name = "selected_teams",
            description = "The names of teams from which to revoke access to GitHub Copilot.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("selected_teams")
    public List<String> getSelectedTeams() {
        return selectedTeams;
    }

    public void setSelectedTeams(List<String> selectedTeams) {
        this.selectedTeams = selectedTeams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotCancelCopilotSeatAssignmentForTeamsRequest copilotCancelCopilotSeatAssignmentForTeamsRequest =
                (CopilotCancelCopilotSeatAssignmentForTeamsRequest) o;
        return Objects.equals(this.selectedTeams, copilotCancelCopilotSeatAssignmentForTeamsRequest.selectedTeams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectedTeams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotCancelCopilotSeatAssignmentForTeamsRequest {\n");
        sb.append("    selectedTeams: ").append(toIndentedString(selectedTeams)).append("\n");
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
