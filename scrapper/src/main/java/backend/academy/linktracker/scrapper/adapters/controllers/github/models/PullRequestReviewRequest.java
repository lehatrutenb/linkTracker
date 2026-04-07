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
 * Pull Request Review Request
 */
@Schema(name = "pull-request-review-request", description = "Pull Request Review Request")
@JsonTypeName("pull-request-review-request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestReviewRequest {

    @Valid
    private List<@Valid SimpleUser> users = new ArrayList<>();

    @Valid
    private List<@Valid Team> teams = new ArrayList<>();

    public PullRequestReviewRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestReviewRequest(List<@Valid SimpleUser> users, List<@Valid Team> teams) {
        this.users = users;
        this.teams = teams;
    }

    public PullRequestReviewRequest users(List<@Valid SimpleUser> users) {
        this.users = users;
        return this;
    }

    public PullRequestReviewRequest addUsersItem(SimpleUser usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * Get users
     * @return users
     */
    @NotNull
    @Valid
    @Schema(name = "users", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("users")
    public List<@Valid SimpleUser> getUsers() {
        return users;
    }

    public void setUsers(List<@Valid SimpleUser> users) {
        this.users = users;
    }

    public PullRequestReviewRequest teams(List<@Valid Team> teams) {
        this.teams = teams;
        return this;
    }

    public PullRequestReviewRequest addTeamsItem(Team teamsItem) {
        if (this.teams == null) {
            this.teams = new ArrayList<>();
        }
        this.teams.add(teamsItem);
        return this;
    }

    /**
     * Get teams
     * @return teams
     */
    @NotNull
    @Valid
    @Schema(name = "teams", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("teams")
    public List<@Valid Team> getTeams() {
        return teams;
    }

    public void setTeams(List<@Valid Team> teams) {
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
        PullRequestReviewRequest pullRequestReviewRequest = (PullRequestReviewRequest) o;
        return Objects.equals(this.users, pullRequestReviewRequest.users)
                && Objects.equals(this.teams, pullRequestReviewRequest.teams);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, teams);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestReviewRequest {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
