package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Allow specific users, teams, or apps to bypass pull request requirements.
 */
@Schema(
        name = "protected_branch_pull_request_review_bypass_pull_request_allowances",
        description = "Allow specific users, teams, or apps to bypass pull request requirements.")
@JsonTypeName("protected_branch_pull_request_review_bypass_pull_request_allowances")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranchPullRequestReviewBypassPullRequestAllowances {

    @Valid
    private List<@Valid SimpleUser> users = new ArrayList<>();

    @Valid
    private List<@Valid Team> teams = new ArrayList<>();

    @Valid
    private List<@Valid Integration> apps = new ArrayList<>();

    public ProtectedBranchPullRequestReviewBypassPullRequestAllowances users(List<@Valid SimpleUser> users) {
        this.users = users;
        return this;
    }

    public ProtectedBranchPullRequestReviewBypassPullRequestAllowances addUsersItem(SimpleUser usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * The list of users allowed to bypass pull request requirements.
     * @return users
     */
    @Valid
    @Schema(
            name = "users",
            description = "The list of users allowed to bypass pull request requirements.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("users")
    public List<@Valid SimpleUser> getUsers() {
        return users;
    }

    public void setUsers(List<@Valid SimpleUser> users) {
        this.users = users;
    }

    public ProtectedBranchPullRequestReviewBypassPullRequestAllowances teams(List<@Valid Team> teams) {
        this.teams = teams;
        return this;
    }

    public ProtectedBranchPullRequestReviewBypassPullRequestAllowances addTeamsItem(Team teamsItem) {
        if (this.teams == null) {
            this.teams = new ArrayList<>();
        }
        this.teams.add(teamsItem);
        return this;
    }

    /**
     * The list of teams allowed to bypass pull request requirements.
     * @return teams
     */
    @Valid
    @Schema(
            name = "teams",
            description = "The list of teams allowed to bypass pull request requirements.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("teams")
    public List<@Valid Team> getTeams() {
        return teams;
    }

    public void setTeams(List<@Valid Team> teams) {
        this.teams = teams;
    }

    public ProtectedBranchPullRequestReviewBypassPullRequestAllowances apps(List<@Valid Integration> apps) {
        this.apps = apps;
        return this;
    }

    public ProtectedBranchPullRequestReviewBypassPullRequestAllowances addAppsItem(Integration appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    /**
     * The list of apps allowed to bypass pull request requirements.
     * @return apps
     */
    @Valid
    @Schema(
            name = "apps",
            description = "The list of apps allowed to bypass pull request requirements.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("apps")
    public List<@Valid Integration> getApps() {
        return apps;
    }

    public void setApps(List<@Valid Integration> apps) {
        this.apps = apps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectedBranchPullRequestReviewBypassPullRequestAllowances
                protectedBranchPullRequestReviewBypassPullRequestAllowances =
                        (ProtectedBranchPullRequestReviewBypassPullRequestAllowances) o;
        return Objects.equals(this.users, protectedBranchPullRequestReviewBypassPullRequestAllowances.users)
                && Objects.equals(this.teams, protectedBranchPullRequestReviewBypassPullRequestAllowances.teams)
                && Objects.equals(this.apps, protectedBranchPullRequestReviewBypassPullRequestAllowances.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, teams, apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchPullRequestReviewBypassPullRequestAllowances {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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
