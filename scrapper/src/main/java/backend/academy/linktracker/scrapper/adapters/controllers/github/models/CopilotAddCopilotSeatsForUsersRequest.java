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
 * CopilotAddCopilotSeatsForUsersRequest
 */
@JsonTypeName("copilot_add_copilot_seats_for_users_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotAddCopilotSeatsForUsersRequest {

    @Valid
    private List<String> selectedUsernames = new ArrayList<>();

    public CopilotAddCopilotSeatsForUsersRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotAddCopilotSeatsForUsersRequest(List<String> selectedUsernames) {
        this.selectedUsernames = selectedUsernames;
    }

    public CopilotAddCopilotSeatsForUsersRequest selectedUsernames(List<String> selectedUsernames) {
        this.selectedUsernames = selectedUsernames;
        return this;
    }

    public CopilotAddCopilotSeatsForUsersRequest addSelectedUsernamesItem(String selectedUsernamesItem) {
        if (this.selectedUsernames == null) {
            this.selectedUsernames = new ArrayList<>();
        }
        this.selectedUsernames.add(selectedUsernamesItem);
        return this;
    }

    /**
     * The usernames of the organization members to be granted access to GitHub Copilot.
     * @return selectedUsernames
     */
    @NotNull
    @Size(min = 1)
    @Schema(
            name = "selected_usernames",
            description = "The usernames of the organization members to be granted access to GitHub Copilot.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("selected_usernames")
    public List<String> getSelectedUsernames() {
        return selectedUsernames;
    }

    public void setSelectedUsernames(List<String> selectedUsernames) {
        this.selectedUsernames = selectedUsernames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotAddCopilotSeatsForUsersRequest copilotAddCopilotSeatsForUsersRequest =
                (CopilotAddCopilotSeatsForUsersRequest) o;
        return Objects.equals(this.selectedUsernames, copilotAddCopilotSeatsForUsersRequest.selectedUsernames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(selectedUsernames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotAddCopilotSeatsForUsersRequest {\n");
        sb.append("    selectedUsernames: ")
                .append(toIndentedString(selectedUsernames))
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
