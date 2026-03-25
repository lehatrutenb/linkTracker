package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * EnterpriseTeamMembershipsBulkAddRequest
 */
@JsonTypeName("enterprise_team_memberships_bulk_add_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnterpriseTeamMembershipsBulkAddRequest {

    @Valid
    private List<String> usernames = new ArrayList<>();

    public EnterpriseTeamMembershipsBulkAddRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnterpriseTeamMembershipsBulkAddRequest(List<String> usernames) {
        this.usernames = usernames;
    }

    public EnterpriseTeamMembershipsBulkAddRequest usernames(List<String> usernames) {
        this.usernames = usernames;
        return this;
    }

    public EnterpriseTeamMembershipsBulkAddRequest addUsernamesItem(String usernamesItem) {
        if (this.usernames == null) {
            this.usernames = new ArrayList<>();
        }
        this.usernames.add(usernamesItem);
        return this;
    }

    /**
     * The GitHub user handles to add to the team.
     * @return usernames
     */
    @NotNull
    @Schema(
            name = "usernames",
            description = "The GitHub user handles to add to the team.",
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
        EnterpriseTeamMembershipsBulkAddRequest enterpriseTeamMembershipsBulkAddRequest =
                (EnterpriseTeamMembershipsBulkAddRequest) o;
        return Objects.equals(this.usernames, enterpriseTeamMembershipsBulkAddRequest.usernames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usernames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterpriseTeamMembershipsBulkAddRequest {\n");
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
