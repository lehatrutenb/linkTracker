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
 * Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty &#x60;dismissal_restrictions&#x60; object to disable. User and team &#x60;dismissal_restrictions&#x60; are only available for organization-owned repositories. Omit this parameter for personal repositories.
 */
@Schema(
        name = "repos_update_branch_protection_request_required_pull_request_reviews_dismissal_restrictions",
        description =
                "Specify which users, teams, and apps can dismiss pull request reviews. Pass an empty `dismissal_restrictions` object to disable. User and team `dismissal_restrictions` are only available for organization-owned repositories. Omit this parameter for personal repositories.")
@JsonTypeName("repos_update_branch_protection_request_required_pull_request_reviews_dismissal_restrictions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions {

    @Valid
    private List<String> users = new ArrayList<>();

    @Valid
    private List<String> teams = new ArrayList<>();

    @Valid
    private List<String> apps = new ArrayList<>();

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions users(List<String> users) {
        this.users = users;
        return this;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions addUsersItem(
            String usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * The list of user `login`s with dismissal access
     * @return users
     */
    @Schema(
            name = "users",
            description = "The list of user `login`s with dismissal access",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("users")
    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions teams(List<String> teams) {
        this.teams = teams;
        return this;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions addTeamsItem(
            String teamsItem) {
        if (this.teams == null) {
            this.teams = new ArrayList<>();
        }
        this.teams.add(teamsItem);
        return this;
    }

    /**
     * The list of team `slug`s with dismissal access
     * @return teams
     */
    @Schema(
            name = "teams",
            description = "The list of team `slug`s with dismissal access",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("teams")
    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions apps(List<String> apps) {
        this.apps = apps;
        return this;
    }

    public ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions addAppsItem(
            String appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    /**
     * The list of app `slug`s with dismissal access
     * @return apps
     */
    @Schema(
            name = "apps",
            description = "The list of app `slug`s with dismissal access",
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
        ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions
                reposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions =
                        (ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions) o;
        return Objects.equals(
                        this.users,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions.users)
                && Objects.equals(
                        this.teams,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions.teams)
                && Objects.equals(
                        this.apps,
                        reposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, teams, apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateBranchProtectionRequestRequiredPullRequestReviewsDismissalRestrictions {\n");
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
