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
 * ActionsListSelectedReposForOrgSecret200Response
 */
@JsonTypeName("actions_list_selected_repos_for_org_secret_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListSelectedReposForOrgSecret200Response {

    private Long totalCount;

    @Valid
    private List<@Valid MinimalRepository> repositories = new ArrayList<>();

    public ActionsListSelectedReposForOrgSecret200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListSelectedReposForOrgSecret200Response(
            Long totalCount, List<@Valid MinimalRepository> repositories) {
        this.totalCount = totalCount;
        this.repositories = repositories;
    }

    public ActionsListSelectedReposForOrgSecret200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ActionsListSelectedReposForOrgSecret200Response repositories(List<@Valid MinimalRepository> repositories) {
        this.repositories = repositories;
        return this;
    }

    public ActionsListSelectedReposForOrgSecret200Response addRepositoriesItem(MinimalRepository repositoriesItem) {
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
    @NotNull
    @Valid
    @Schema(name = "repositories", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories")
    public List<@Valid MinimalRepository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<@Valid MinimalRepository> repositories) {
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
        ActionsListSelectedReposForOrgSecret200Response actionsListSelectedReposForOrgSecret200Response =
                (ActionsListSelectedReposForOrgSecret200Response) o;
        return Objects.equals(this.totalCount, actionsListSelectedReposForOrgSecret200Response.totalCount)
                && Objects.equals(this.repositories, actionsListSelectedReposForOrgSecret200Response.repositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, repositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListSelectedReposForOrgSecret200Response {\n");
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
