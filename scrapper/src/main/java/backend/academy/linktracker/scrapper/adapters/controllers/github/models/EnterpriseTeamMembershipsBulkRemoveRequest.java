package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EnterpriseTeamMembershipsBulkRemoveRequest
 */
@JsonTypeName("enterprise_team_memberships_bulk_remove_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnterpriseTeamMembershipsBulkRemoveRequest {

    @Valid
    private List<String> usernames = new ArrayList<>();

    public EnterpriseTeamMembershipsBulkRemoveRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnterpriseTeamMembershipsBulkRemoveRequest(List<String> usernames) {
        this.usernames = usernames;
    }

    public EnterpriseTeamMembershipsBulkRemoveRequest usernames(List<String> usernames) {
        this.usernames = usernames;
        return this;
    }

    public EnterpriseTeamMembershipsBulkRemoveRequest addUsernamesItem(String usernamesItem) {
        if (this.usernames == null) {
            this.usernames = new ArrayList<>();
        }
        this.usernames.add(usernamesItem);
        return this;
    }

    /**
     * The GitHub user handles to be removed from the team.
     * @return usernames
     */
    @NotNull
    @Schema(
            name = "usernames",
            description = "The GitHub user handles to be removed from the team.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("usernames")
    public List<String> getUsernames() {
        return usernames;
    }

    public void setUsernames(List<String> usernames) {
        this.usernames = usernames;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnterpriseTeamMembershipsBulkRemoveRequest enterpriseTeamMembershipsBulkRemoveRequest =
                (EnterpriseTeamMembershipsBulkRemoveRequest) o;
        return Objects.equals(this.usernames, enterpriseTeamMembershipsBulkRemoveRequest.usernames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usernames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseTeamMembershipsBulkRemoveRequest {\n");
        sb.append("    usernames: ").append(toIndentedString(usernames)).append("\n");
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
