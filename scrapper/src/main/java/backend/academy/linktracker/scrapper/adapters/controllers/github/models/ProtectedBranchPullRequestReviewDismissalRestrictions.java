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
 * ProtectedBranchPullRequestReviewDismissalRestrictions
 */
@JsonTypeName("protected_branch_pull_request_review_dismissal_restrictions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranchPullRequestReviewDismissalRestrictions {

    @Valid
    private List<@Valid SimpleUser> users = new ArrayList<>();

    @Valid
    private List<@Valid Team> teams = new ArrayList<>();

    @Valid
    private List<@Valid Integration> apps = new ArrayList<>();

    private String url;

    private String usersUrl;

    private String teamsUrl;

    public ProtectedBranchPullRequestReviewDismissalRestrictions users(List<@Valid SimpleUser> users) {
        this.users = users;
        return this;
    }

    public ProtectedBranchPullRequestReviewDismissalRestrictions addUsersItem(SimpleUser usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * The list of users with review dismissal access.
     * @return users
     */
    @Valid
    @Schema(
            name = "users",
            description = "The list of users with review dismissal access.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("users")
    public List<@Valid SimpleUser> getUsers() {
        return users;
    }

    public void setUsers(List<@Valid SimpleUser> users) {
        this.users = users;
    }

    public ProtectedBranchPullRequestReviewDismissalRestrictions teams(List<@Valid Team> teams) {
        this.teams = teams;
        return this;
    }

    public ProtectedBranchPullRequestReviewDismissalRestrictions addTeamsItem(Team teamsItem) {
        if (this.teams == null) {
            this.teams = new ArrayList<>();
        }
        this.teams.add(teamsItem);
        return this;
    }

    /**
     * The list of teams with review dismissal access.
     * @return teams
     */
    @Valid
    @Schema(
            name = "teams",
            description = "The list of teams with review dismissal access.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("teams")
    public List<@Valid Team> getTeams() {
        return teams;
    }

    public void setTeams(List<@Valid Team> teams) {
        this.teams = teams;
    }

    public ProtectedBranchPullRequestReviewDismissalRestrictions apps(List<@Valid Integration> apps) {
        this.apps = apps;
        return this;
    }

    public ProtectedBranchPullRequestReviewDismissalRestrictions addAppsItem(Integration appsItem) {
        if (this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    /**
     * The list of apps with review dismissal access.
     * @return apps
     */
    @Valid
    @Schema(
            name = "apps",
            description = "The list of apps with review dismissal access.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("apps")
    public List<@Valid Integration> getApps() {
        return apps;
    }

    public void setApps(List<@Valid Integration> apps) {
        this.apps = apps;
    }

    public ProtectedBranchPullRequestReviewDismissalRestrictions url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(
            name = "url",
            example =
                    "\"https://api.github.com/repos/the-org/an-org-repo/branches/master/protection/dismissal_restrictions\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ProtectedBranchPullRequestReviewDismissalRestrictions usersUrl(String usersUrl) {
        this.usersUrl = usersUrl;
        return this;
    }

    /**
     * Get usersUrl
     * @return usersUrl
     */
    @Schema(
            name = "users_url",
            example =
                    "\"https://api.github.com/repos/the-org/an-org-repo/branches/master/protection/dismissal_restrictions/users\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("users_url")
    public String getUsersUrl() {
        return usersUrl;
    }

    public void setUsersUrl(String usersUrl) {
        this.usersUrl = usersUrl;
    }

    public ProtectedBranchPullRequestReviewDismissalRestrictions teamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    /**
     * Get teamsUrl
     * @return teamsUrl
     */
    @Schema(
            name = "teams_url",
            example =
                    "\"https://api.github.com/repos/the-org/an-org-repo/branches/master/protection/dismissal_restrictions/teams\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("teams_url")
    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectedBranchPullRequestReviewDismissalRestrictions protectedBranchPullRequestReviewDismissalRestrictions =
                (ProtectedBranchPullRequestReviewDismissalRestrictions) o;
        return Objects.equals(this.users, protectedBranchPullRequestReviewDismissalRestrictions.users)
                && Objects.equals(this.teams, protectedBranchPullRequestReviewDismissalRestrictions.teams)
                && Objects.equals(this.apps, protectedBranchPullRequestReviewDismissalRestrictions.apps)
                && Objects.equals(this.url, protectedBranchPullRequestReviewDismissalRestrictions.url)
                && Objects.equals(this.usersUrl, protectedBranchPullRequestReviewDismissalRestrictions.usersUrl)
                && Objects.equals(this.teamsUrl, protectedBranchPullRequestReviewDismissalRestrictions.teamsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, teams, apps, url, usersUrl, teamsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchPullRequestReviewDismissalRestrictions {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    usersUrl: ").append(toIndentedString(usersUrl)).append("\n");
        sb.append("    teamsUrl: ").append(toIndentedString(teamsUrl)).append("\n");
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
