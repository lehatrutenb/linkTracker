package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions
 */
@JsonTypeName("protected_branch_required_pull_request_reviews_dismissal_restrictions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions {

    private URI url;

    private URI usersUrl;

    private URI teamsUrl;

    @Valid
    private List<@Valid SimpleUser> users = new ArrayList<>();

    @Valid
    private List<@Valid Team> teams = new ArrayList<>();

    @Valid
    private List<@Valid Integration> apps = new ArrayList<>();

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions(
            URI url, URI usersUrl, URI teamsUrl, List<@Valid SimpleUser> users, List<@Valid Team> teams) {
        this.url = url;
        this.usersUrl = usersUrl;
        this.teamsUrl = teamsUrl;
        this.users = users;
        this.teams = teams;
    }

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions usersUrl(URI usersUrl) {
        this.usersUrl = usersUrl;
        return this;
    }

    /**
     * Get usersUrl
     * @return usersUrl
     */
    @NotNull
    @Valid
    @Schema(name = "users_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("users_url")
    public URI getUsersUrl() {
        return usersUrl;
    }

    public void setUsersUrl(URI usersUrl) {
        this.usersUrl = usersUrl;
    }

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions teamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    /**
     * Get teamsUrl
     * @return teamsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "teams_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("teams_url")
    public URI getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(URI teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions users(List<@Valid SimpleUser> users) {
        this.users = users;
        return this;
    }

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions addUsersItem(SimpleUser usersItem) {
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

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions teams(List<@Valid Team> teams) {
        this.teams = teams;
        return this;
    }

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions addTeamsItem(Team teamsItem) {
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

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions apps(List<@Valid Integration> apps) {
        this.apps = apps;
        return this;
    }

    public ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions addAppsItem(Integration appsItem) {
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
        ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions
                protectedBranchRequiredPullRequestReviewsDismissalRestrictions =
                        (ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions) o;
        return Objects.equals(this.url, protectedBranchRequiredPullRequestReviewsDismissalRestrictions.url)
                && Objects.equals(
                        this.usersUrl, protectedBranchRequiredPullRequestReviewsDismissalRestrictions.usersUrl)
                && Objects.equals(
                        this.teamsUrl, protectedBranchRequiredPullRequestReviewsDismissalRestrictions.teamsUrl)
                && Objects.equals(this.users, protectedBranchRequiredPullRequestReviewsDismissalRestrictions.users)
                && Objects.equals(this.teams, protectedBranchRequiredPullRequestReviewsDismissalRestrictions.teams)
                && Objects.equals(this.apps, protectedBranchRequiredPullRequestReviewsDismissalRestrictions.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, usersUrl, teamsUrl, users, teams, apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedBranchRequiredPullRequestReviewsDismissalRestrictions {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    usersUrl: ").append(toIndentedString(usersUrl)).append("\n");
        sb.append("    teamsUrl: ").append(toIndentedString(teamsUrl)).append("\n");
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
