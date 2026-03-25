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
 * ActionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response
 */
@JsonTypeName("actions_list_selected_repositories_self_hosted_runners_organization_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response {

    private Long totalCount;

    @Valid
    private List<@Valid Repository> repositories = new ArrayList<>();

    public ActionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ActionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response repositories(
            List<@Valid Repository> repositories) {
        this.repositories = repositories;
        return this;
    }

    public ActionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response addRepositoriesItem(
            Repository repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * Get repositories
     * @return repositories
     */
    @Valid
    @Schema(name = "repositories", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositories")
    public List<@Valid Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<@Valid Repository> repositories) {
        this.repositories = repositories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response
                actionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response =
                        (ActionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response) o;
        return Objects.equals(
                        this.totalCount,
                        actionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response.totalCount)
                && Objects.equals(
                        this.repositories,
                        actionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response.repositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, repositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListSelectedRepositoriesSelfHostedRunnersOrganization200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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
