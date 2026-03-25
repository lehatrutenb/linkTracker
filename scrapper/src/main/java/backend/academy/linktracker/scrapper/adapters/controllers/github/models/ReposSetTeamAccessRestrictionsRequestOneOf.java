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
 * ReposSetTeamAccessRestrictionsRequestOneOf
 */
@JsonTypeName("repos_set_team_access_restrictions_request_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposSetTeamAccessRestrictionsRequestOneOf implements ReposSetTeamAccessRestrictionsRequest {

    @Valid
    private List<String> teams = new ArrayList<>();

    public ReposSetTeamAccessRestrictionsRequestOneOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposSetTeamAccessRestrictionsRequestOneOf(List<String> teams) {
        this.teams = teams;
    }

    public ReposSetTeamAccessRestrictionsRequestOneOf teams(List<String> teams) {
        this.teams = teams;
        return this;
    }

    public ReposSetTeamAccessRestrictionsRequestOneOf addTeamsItem(String teamsItem) {
        if (this.teams == null) {
            this.teams = new ArrayList<>();
        }
        this.teams.add(teamsItem);
        return this;
    }

    /**
     * The slug values for teams
     * @return teams
     */
    @NotNull
    @Schema(name = "teams", description = "The slug values for teams", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("teams")
    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposSetTeamAccessRestrictionsRequestOneOf reposSetTeamAccessRestrictionsRequestOneOf =
                (ReposSetTeamAccessRestrictionsRequestOneOf) o;
        return Objects.equals(this.teams, reposSetTeamAccessRestrictionsRequestOneOf.teams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposSetTeamAccessRestrictionsRequestOneOf {\n");
        sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
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
