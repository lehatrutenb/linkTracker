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
 * AppsScopeTokenRequest
 */
@JsonTypeName("apps_scope_token_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AppsScopeTokenRequest {

    private String accessToken;

    private String target;

    private Long targetId;

    @Valid
    private List<String> repositories = new ArrayList<>();

    @Valid
    private List<Long> repositoryIds = new ArrayList<>();

    private AppPermissions permissions;

    public AppsScopeTokenRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AppsScopeTokenRequest(String accessToken) {
        this.accessToken = accessToken;
    }

    public AppsScopeTokenRequest accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * The access token used to authenticate to the GitHub API.
     * @return accessToken
     */
    @NotNull
    @Schema(
            name = "access_token",
            example = "e72e16c7e42f292c6912e7710c838347ae178b4a",
            description = "The access token used to authenticate to the GitHub API.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("access_token")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public AppsScopeTokenRequest target(String target) {
        this.target = target;
        return this;
    }

    /**
     * The name of the user or organization to scope the user access token to. **Required** unless `target_id` is specified.
     * @return target
     */
    @Schema(
            name = "target",
            example = "octocat",
            description =
                    "The name of the user or organization to scope the user access token to. **Required** unless `target_id` is specified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target")
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public AppsScopeTokenRequest targetId(Long targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * The ID of the user or organization to scope the user access token to. **Required** unless `target` is specified.
     * @return targetId
     */
    @Schema(
            name = "target_id",
            example = "1",
            description =
                    "The ID of the user or organization to scope the user access token to. **Required** unless `target` is specified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_id")
    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public AppsScopeTokenRequest repositories(List<String> repositories) {
        this.repositories = repositories;
        return this;
    }

    public AppsScopeTokenRequest addRepositoriesItem(String repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * The list of repository names to scope the user access token to. `repositories` may not be specified if `repository_ids` is specified.
     * @return repositories
     */
    @Schema(
            name = "repositories",
            description =
                    "The list of repository names to scope the user access token to. `repositories` may not be specified if `repository_ids` is specified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositories")
    public List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }

    public AppsScopeTokenRequest repositoryIds(List<Long> repositoryIds) {
        this.repositoryIds = repositoryIds;
        return this;
    }

    public AppsScopeTokenRequest addRepositoryIdsItem(Long repositoryIdsItem) {
        if (this.repositoryIds == null) {
            this.repositoryIds = new ArrayList<>();
        }
        this.repositoryIds.add(repositoryIdsItem);
        return this;
    }

    /**
     * The list of repository IDs to scope the user access token to. `repository_ids` may not be specified if `repositories` is specified.
     * @return repositoryIds
     */
    @Schema(
            name = "repository_ids",
            example = "[1]",
            description =
                    "The list of repository IDs to scope the user access token to. `repository_ids` may not be specified if `repositories` is specified.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_ids")
    public List<Long> getRepositoryIds() {
        return repositoryIds;
    }

    public void setRepositoryIds(List<Long> repositoryIds) {
        this.repositoryIds = repositoryIds;
    }

    public AppsScopeTokenRequest permissions(AppPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public AppPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(AppPermissions permissions) {
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
        AppsScopeTokenRequest appsScopeTokenRequest = (AppsScopeTokenRequest) o;
        return Objects.equals(this.accessToken, appsScopeTokenRequest.accessToken)
                && Objects.equals(this.target, appsScopeTokenRequest.target)
                && Objects.equals(this.targetId, appsScopeTokenRequest.targetId)
                && Objects.equals(this.repositories, appsScopeTokenRequest.repositories)
                && Objects.equals(this.repositoryIds, appsScopeTokenRequest.repositoryIds)
                && Objects.equals(this.permissions, appsScopeTokenRequest.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessToken, target, targetId, repositories, repositoryIds, permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppsScopeTokenRequest {\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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
