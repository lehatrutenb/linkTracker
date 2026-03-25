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
 * Allow specific users, teams, or apps to bypass pull request requirements.
 */
@Schema(
        name = "repos_update_branch_protection_request_required_pull_request_reviews_bypass_pull_request_allowances",
        description = "Allow specific users, teams, or apps to bypass pull request requirements.")
@JsonTypeName("repos_update_branch_protection_request_required_pull_request_reviews_bypass_pull_request_allowances")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances {

    @Valid
    private List<String> users = new ArrayList<>();

    @Valid
    private List<String> teams = new ArrayList<>();

    @Valid
    private List<String> apps = new ArrayList<>();

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances users(
            List<String> users) {
        this.users = users;
        return this;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances addUsersItem(
            String usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * The list of user `login`s allowed to bypass pull request requirements.
     * @return users
     */
    @Schema(
            name = "users",
            description = "The list of user `login`s allowed to bypass pull request requirements.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("users")
    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances teams(
            List<String> teams) {
        this.teams = teams;
        return this;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances addTeamsItem(
            String teamsItem) {
        if (this.teams == null) {
            this.teams = new ArrayList<>();
        }
        this.teams.add(teamsItem);
        return this;
    }

    /**
     * The list of team `slug`s allowed to bypass pull request requirements.
     * @return teams
     */
    @Schema(
            name = "teams",
            description = "The list of team `slug`s allowed to bypass pull request requirements.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("teams")
    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances apps(
            List<String> apps) {
        this.apps = apps;
        return this;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances addAppsItem(
            String appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    /**
     * The list of app `slug`s allowed to bypass pull request requirements.
     * @return apps
     */
    @Schema(
            name = "apps",
            description = "The list of app `slug`s allowed to bypass pull request requirements.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("apps")
    public List<String> getApps() {
        return apps;
    }

    public void setApps(List<String> apps) {
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
        ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances
                reposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances =
                        (ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances) o;
        return Objects.equals(
                        this.users,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.users)
                && Objects.equals(
                        this.teams,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.teams)
                && Objects.equals(
                        this.apps,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, teams, apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsBypassPullRequestAllowances {\n");
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
