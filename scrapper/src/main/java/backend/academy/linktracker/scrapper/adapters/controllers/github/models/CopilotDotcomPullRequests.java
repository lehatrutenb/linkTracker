package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Usage metrics for Copilot for pull requests.
 */
@Schema(name = "copilot-dotcom-pull-requests", description = "Usage metrics for Copilot for pull requests.")
@JsonTypeName("copilot-dotcom-pull-requests")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotDotcomPullRequests {

    private Long totalEngagedUsers;

    @Valid
    private List<@Valid CopilotDotcomPullRequestsRepositoriesInner> repositories = new ArrayList<>();

    public CopilotDotcomPullRequests totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
        return this;
    }

    /**
     * The number of users who used Copilot for Pull Requests on github.com to generate a pull request summary at least once.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description =
                    "The number of users who used Copilot for Pull Requests on github.com to generate a pull request summary at least once.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Long getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotDotcomPullRequests repositories(
            List<@Valid CopilotDotcomPullRequestsRepositoriesInner> repositories) {
        this.repositories = repositories;
        return this;
    }

    public CopilotDotcomPullRequests addRepositoriesItem(CopilotDotcomPullRequestsRepositoriesInner repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * Repositories in which users used Copilot for Pull Requests to generate pull request summaries
     * @return repositories
     */
    @Valid
    @Schema(
            name = "repositories",
            description =
                    "Repositories in which users used Copilot for Pull Requests to generate pull request summaries",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositories")
    public List<@Valid CopilotDotcomPullRequestsRepositoriesInner> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<@Valid CopilotDotcomPullRequestsRepositoriesInner> repositories) {
        this.repositories = repositories;
    }
    /**
     * A container for additional, undeclared properties.
     * This is a holder for any undeclared properties as specified with
     * the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * If the property does not already exist, create it otherwise replace it.
     */
    @JsonAnySetter
    public CopilotDotcomPullRequests putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
     * Return the additional (undeclared) property.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotDotcomPullRequests copilotDotcomPullRequests = (CopilotDotcomPullRequests) o;
        return Objects.equals(this.totalEngagedUsers, copilotDotcomPullRequests.totalEngagedUsers)
                && Objects.equals(this.repositories, copilotDotcomPullRequests.repositories)
                && Objects.equals(this.additionalProperties, copilotDotcomPullRequests.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalEngagedUsers, repositories, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotDotcomPullRequests {\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
                .append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");

        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
                .append("\n");
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
