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
 * ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances
 */
@JsonTypeName("protected_branch_required_pull_request_reviews_bypass_pull_request_allowances")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances {

    @Valid
    private List<@Valid SimpleUser> users = new ArrayList<>();

    @Valid
    private List<@Valid Team> teams = new ArrayList<>();

    @Valid
    private List<@Valid Integration> apps = new ArrayList<>();

    public ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances(
            List<@Valid SimpleUser> users, List<@Valid Team> teams) {
        this.users = users;
        this.teams = teams;
    }

    public ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances users(List<@Valid SimpleUser> users) {
        this.users = users;
        return this;
    }

    public ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances addUsersItem(SimpleUser usersItem) {
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

    public ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances teams(List<@Valid Team> teams) {
        this.teams = teams;
        return this;
    }

    public ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances addTeamsItem(Team teamsItem) {
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

    public ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances apps(List<@Valid Integration> apps) {
        this.apps = apps;
        return this;
    }

    public ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances addAppsItem(Integration appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    /**
     * Get apps
     * @return apps
     */
    @Valid
    @Schema(name = "apps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances
                protectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances =
                        (ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances) o;
        return Objects.equals(this.users, protectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances.users)
                && Objects.equals(
                        this.teams, protectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances.teams)
                && Objects.equals(this.apps, protectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, teams, apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchRequiredPullRequestReviewsBypassPullRequestAllowances {\n");
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
