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
import java.util.Optional;

/**
 * AppsListReposAccessibleToInstallation200Response
 */
@JsonTypeName("apps_list_repos_accessible_to_installation_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AppsListReposAccessibleToInstallation200Response {

    private Long totalCount;

    @Valid
    private List<Repository> repositories = new ArrayList<>();

    private Optional<String> repositorySelection = Optional.empty();

    public AppsListReposAccessibleToInstallation200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AppsListReposAccessibleToInstallation200Response(Long totalCount, List<Repository> repositories) {
        this.totalCount = totalCount;
        this.repositories = repositories;
    }

    public AppsListReposAccessibleToInstallation200Response totalCount(Long totalCount) {
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

    public AppsListReposAccessibleToInstallation200Response repositories(List<Repository> repositories) {
        this.repositories = repositories;
        return this;
    }

    public AppsListReposAccessibleToInstallation200Response addRepositoriesItem(Repository repositoriesItem) {
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
    public List<Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<Repository> repositories) {
        this.repositories = repositories;
    }

    public AppsListReposAccessibleToInstallation200Response repositorySelection(String repositorySelection) {
        this.repositorySelection = Optional.ofNullable(repositorySelection);
        return this;
    }

    /**
     * Get repositorySelection
     * @return repositorySelection
     */
    @Schema(name = "repository_selection", example = "selected", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_selection")
    public Optional<String> getRepositorySelection() {
        return repositorySelection;
    }

    public void setRepositorySelection(Optional<String> repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppsListReposAccessibleToInstallation200Response appsListReposAccessibleToInstallation200Response =
                (AppsListReposAccessibleToInstallation200Response) o;
        return Objects.equals(this.totalCount, appsListReposAccessibleToInstallation200Response.totalCount)
                && Objects.equals(this.repositories, appsListReposAccessibleToInstallation200Response.repositories)
                && Objects.equals(
                        this.repositorySelection, appsListReposAccessibleToInstallation200Response.repositorySelection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, repositories, repositorySelection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppsListReposAccessibleToInstallation200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    repositorySelection: ")
                .append(toIndentedString(repositorySelection))
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
