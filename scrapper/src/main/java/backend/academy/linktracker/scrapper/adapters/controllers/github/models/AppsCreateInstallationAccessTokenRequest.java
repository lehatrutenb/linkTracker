package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * AppsCreateInstallationAccessTokenRequest
 */
@JsonTypeName("apps_create_installation_access_token_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AppsCreateInstallationAccessTokenRequest {

    @Valid
    private List<String> repositories = new ArrayList<>();

    @Valid
    private List<Long> repositoryIds = new ArrayList<>();

    private Optional<AppPermissions> permissions = Optional.empty();

    public AppsCreateInstallationAccessTokenRequest repositories(List<String> repositories) {
        this.repositories = repositories;
        return this;
    }

    public AppsCreateInstallationAccessTokenRequest addRepositoriesItem(String repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * List of repository names that the token should have access to
     * @return repositories
     */
    @Schema(
            name = "repositories",
            description = "List of repository names that the token should have access to",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositories")
    public List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }

    public AppsCreateInstallationAccessTokenRequest repositoryIds(List<Long> repositoryIds) {
        this.repositoryIds = repositoryIds;
        return this;
    }

    public AppsCreateInstallationAccessTokenRequest addRepositoryIdsItem(Long repositoryIdsItem) {
        if (this.repositoryIds == null) {
            this.repositoryIds = new ArrayList<>();
        }
        this.repositoryIds.add(repositoryIdsItem);
        return this;
    }

    /**
     * List of repository IDs that the token should have access to
     * @return repositoryIds
     */
    @Schema(
            name = "repository_ids",
            example = "[1]",
            description = "List of repository IDs that the token should have access to",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_ids")
    public List<Long> getRepositoryIds() {
        return repositoryIds;
    }

    public void setRepositoryIds(List<Long> repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    public AppsCreateInstallationAccessTokenRequest permissions(AppPermissions permissions) {
        this.permissions = Optional.ofNullable(permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public Optional<AppPermissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Optional<AppPermissions> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppsCreateInstallationAccessTokenRequest appsCreateInstallationAccessTokenRequest =
                (AppsCreateInstallationAccessTokenRequest) o;
        return Objects.equals(this.repositories, appsCreateInstallationAccessTokenRequest.repositories)
                && Objects.equals(this.repositoryIds, appsCreateInstallationAccessTokenRequest.repositoryIds)
                && Objects.equals(this.permissions, appsCreateInstallationAccessTokenRequest.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositories, repositoryIds, permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppsCreateInstallationAccessTokenRequest {\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    repositoryIds: ").append(toIndentedString(repositoryIds)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
