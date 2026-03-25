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
 * Branch Restriction Policy
 */
@Schema(name = "branch-restriction-policy", description = "Branch Restriction Policy")
@JsonTypeName("branch-restriction-policy")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchRestrictionPolicy {

    private URI url;

    private URI usersUrl;

    private URI teamsUrl;

    private URI appsUrl;

    @Valid
    private List<@Valid BranchRestrictionPolicyUsersInner> users = new ArrayList<>();

    @Valid
    private List<@Valid Team> teams = new ArrayList<>();

    @Valid
    private List<@Valid BranchRestrictionPolicyAppsInner> apps = new ArrayList<>();

    public BranchRestrictionPolicy() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BranchRestrictionPolicy(
            URI url,
            URI usersUrl,
            URI teamsUrl,
            URI appsUrl,
            List<@Valid BranchRestrictionPolicyUsersInner> users,
            List<@Valid Team> teams,
            List<@Valid BranchRestrictionPolicyAppsInner> apps) {
        this.url = url;
        this.usersUrl = usersUrl;
        this.teamsUrl = teamsUrl;
        this.appsUrl = appsUrl;
        this.users = users;
        this.teams = teams;
        this.apps = apps;
    }

    public BranchRestrictionPolicy url(URI url) {
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

    public BranchRestrictionPolicy usersUrl(URI usersUrl) {
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

    public BranchRestrictionPolicy teamsUrl(URI teamsUrl) {
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

    public BranchRestrictionPolicy appsUrl(URI appsUrl) {
        this.appsUrl = appsUrl;
        return this;
    }

    /**
     * Get appsUrl
     * @return appsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "apps_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("apps_url")
    public URI getAppsUrl() {
        return appsUrl;
    }

    public void setAppsUrl(URI appsUrl) {
        this.appsUrl = appsUrl;
    }

    public BranchRestrictionPolicy users(List<@Valid BranchRestrictionPolicyUsersInner> users) {
        this.users = users;
        return this;
    }

    public BranchRestrictionPolicy addUsersItem(BranchRestrictionPolicyUsersInner usersItem) {
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
    public List<@Valid BranchRestrictionPolicyUsersInner> getUsers() {
        return users;
    }

    public void setUsers(List<@Valid BranchRestrictionPolicyUsersInner> users) {
        this.users = users;
    }

    public BranchRestrictionPolicy teams(List<@Valid Team> teams) {
        this.teams = teams;
        return this;
    }

    public BranchRestrictionPolicy addTeamsItem(Team teamsItem) {
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

    public BranchRestrictionPolicy apps(List<@Valid BranchRestrictionPolicyAppsInner> apps) {
        this.apps = apps;
        return this;
    }

    public BranchRestrictionPolicy addAppsItem(BranchRestrictionPolicyAppsInner appsItem) {
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
    @NotNull
    @Valid
    @Schema(name = "apps", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("apps")
    public List<@Valid BranchRestrictionPolicyAppsInner> getApps() {
        return apps;
    }

    public void setApps(List<@Valid BranchRestrictionPolicyAppsInner> apps) {
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
        BranchRestrictionPolicy branchRestrictionPolicy = (BranchRestrictionPolicy) o;
        return Objects.equals(this.url, branchRestrictionPolicy.url)
                && Objects.equals(this.usersUrl, branchRestrictionPolicy.usersUrl)
                && Objects.equals(this.teamsUrl, branchRestrictionPolicy.teamsUrl)
                && Objects.equals(this.appsUrl, branchRestrictionPolicy.appsUrl)
                && Objects.equals(this.users, branchRestrictionPolicy.users)
                && Objects.equals(this.teams, branchRestrictionPolicy.teams)
                && Objects.equals(this.apps, branchRestrictionPolicy.apps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, usersUrl, teamsUrl, appsUrl, users, teams, apps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchRestrictionPolicy {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    usersUrl: ").append(toIndentedString(usersUrl)).append("\n");
        sb.append("    teamsUrl: ").append(toIndentedString(teamsUrl)).append("\n");
        sb.append("    appsUrl: ").append(toIndentedString(appsUrl)).append("\n");
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
