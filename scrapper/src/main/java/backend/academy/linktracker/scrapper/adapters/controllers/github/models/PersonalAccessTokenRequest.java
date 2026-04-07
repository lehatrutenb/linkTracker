package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Details of a Personal Access Token Request.
 */
@Schema(name = "personal-access-token-request", description = "Details of a Personal Access Token Request.")
@JsonTypeName("personal-access-token-request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PersonalAccessTokenRequest {

    private Long id;

    private SimpleUser owner;

    private PersonalAccessTokenRequestPermissionsAdded permissionsAdded;

    private PersonalAccessTokenRequestPermissionsUpgraded permissionsUpgraded;

    private PersonalAccessTokenRequestPermissionsResult permissionsResult;

    /**
     * Type of repository selection requested.
     */
    public enum RepositorySelectionEnum {
        NONE("none"),

        ALL("all"),

        SUBSET("subset");

        private final String value;

        RepositorySelectionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RepositorySelectionEnum fromValue(String value) {
            for (RepositorySelectionEnum b : RepositorySelectionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RepositorySelectionEnum repositorySelection;

    private JsonNullable<Long> repositoryCount = JsonNullable.<Long>undefined();

    @Valid
    private JsonNullable<List<@Valid WebhooksRepositoriesInner>> repositories =
            JsonNullable.<List<@Valid WebhooksRepositoriesInner>>undefined();

    private String createdAt;

    private Long tokenId;

    private String tokenName;

    private Boolean tokenExpired;

    private JsonNullable<String> tokenExpiresAt = JsonNullable.<String>undefined();

    private JsonNullable<String> tokenLastUsedAt = JsonNullable.<String>undefined();

    public PersonalAccessTokenRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PersonalAccessTokenRequest(
            Long id,
            SimpleUser owner,
            PersonalAccessTokenRequestPermissionsAdded permissionsAdded,
            PersonalAccessTokenRequestPermissionsUpgraded permissionsUpgraded,
            PersonalAccessTokenRequestPermissionsResult permissionsResult,
            RepositorySelectionEnum repositorySelection,
            Long repositoryCount,
            List<@Valid WebhooksRepositoriesInner> repositories,
            String createdAt,
            Long tokenId,
            String tokenName,
            Boolean tokenExpired,
            String tokenExpiresAt,
            String tokenLastUsedAt) {
        this.id = id;
        this.owner = owner;
        this.permissionsAdded = permissionsAdded;
        this.permissionsUpgraded = permissionsUpgraded;
        this.permissionsResult = permissionsResult;
        this.repositorySelection = repositorySelection;
        this.repositoryCount = JsonNullable.of(repositoryCount);
        this.repositories = JsonNullable.of(repositories);
        this.createdAt = createdAt;
        this.tokenId = tokenId;
        this.tokenName = tokenName;
        this.tokenExpired = tokenExpired;
        this.tokenExpiresAt = JsonNullable.of(tokenExpiresAt);
        this.tokenLastUsedAt = JsonNullable.of(tokenLastUsedAt);
    }

    public PersonalAccessTokenRequest id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the request for access via fine-grained personal access token. Used as the `pat_request_id` parameter in the list and review API calls.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description =
                    "Unique identifier of the request for access via fine-grained personal access token. Used as the `pat_request_id` parameter in the list and review API calls.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PersonalAccessTokenRequest owner(SimpleUser owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @NotNull
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner")
    public SimpleUser getOwner() {
        return owner;
    }

    public void setOwner(SimpleUser owner) {
        this.owner = owner;
    }

    public PersonalAccessTokenRequest permissionsAdded(PersonalAccessTokenRequestPermissionsAdded permissionsAdded) {
        this.permissionsAdded = permissionsAdded;
        return this;
    }

    /**
     * Get permissionsAdded
     * @return permissionsAdded
     */
    @NotNull
    @Valid
    @Schema(name = "permissions_added", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permissions_added")
    public PersonalAccessTokenRequestPermissionsAdded getPermissionsAdded() {
        return permissionsAdded;
    }

    public void setPermissionsAdded(PersonalAccessTokenRequestPermissionsAdded permissionsAdded) {
        this.permissionsAdded = permissionsAdded;
    }

    public PersonalAccessTokenRequest permissionsUpgraded(
            PersonalAccessTokenRequestPermissionsUpgraded permissionsUpgraded) {
        this.permissionsUpgraded = permissionsUpgraded;
        return this;
    }

    /**
     * Get permissionsUpgraded
     * @return permissionsUpgraded
     */
    @NotNull
    @Valid
    @Schema(name = "permissions_upgraded", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permissions_upgraded")
    public PersonalAccessTokenRequestPermissionsUpgraded getPermissionsUpgraded() {
        return permissionsUpgraded;
    }

    public void setPermissionsUpgraded(PersonalAccessTokenRequestPermissionsUpgraded permissionsUpgraded) {
        this.permissionsUpgraded = permissionsUpgraded;
    }

    public PersonalAccessTokenRequest permissionsResult(PersonalAccessTokenRequestPermissionsResult permissionsResult) {
        this.permissionsResult = permissionsResult;
        return this;
    }

    /**
     * Get permissionsResult
     * @return permissionsResult
     */
    @NotNull
    @Valid
    @Schema(name = "permissions_result", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permissions_result")
    public PersonalAccessTokenRequestPermissionsResult getPermissionsResult() {
        return permissionsResult;
    }

    public void setPermissionsResult(PersonalAccessTokenRequestPermissionsResult permissionsResult) {
        this.permissionsResult = permissionsResult;
    }

    public PersonalAccessTokenRequest repositorySelection(RepositorySelectionEnum repositorySelection) {
        this.repositorySelection = repositorySelection;
        return this;
    }

    /**
     * Type of repository selection requested.
     * @return repositorySelection
     */
    @NotNull
    @Schema(
            name = "repository_selection",
            description = "Type of repository selection requested.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_selection")
    public RepositorySelectionEnum getRepositorySelection() {
        return repositorySelection;
    }

    public void setRepositorySelection(RepositorySelectionEnum repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    public PersonalAccessTokenRequest repositoryCount(Long repositoryCount) {
        this.repositoryCount = JsonNullable.of(repositoryCount);
        return this;
    }

    /**
     * The number of repositories the token is requesting access to. This field is only populated when `repository_selection` is `subset`.
     * @return repositoryCount
     */
    @NotNull
    @Schema(
            name = "repository_count",
            description =
                    "The number of repositories the token is requesting access to. This field is only populated when `repository_selection` is `subset`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_count")
    public JsonNullable<Long> getRepositoryCount() {
        return repositoryCount;
    }

    public void setRepositoryCount(JsonNullable<Long> repositoryCount) {
        this.repositoryCount = repositoryCount;
    }

    public PersonalAccessTokenRequest repositories(List<@Valid WebhooksRepositoriesInner> repositories) {
        this.repositories = JsonNullable.of(repositories);
        return this;
    }

    public PersonalAccessTokenRequest addRepositoriesItem(WebhooksRepositoriesInner repositoriesItem) {
        if (this.repositories == null || !this.repositories.isPresent()) {
            this.repositories = JsonNullable.of(new ArrayList<>());
        }
        this.repositories.get().add(repositoriesItem);
        return this;
    }

    /**
     * An array of repository objects the token is requesting access to. This field is only populated when `repository_selection` is `subset`.
     * @return repositories
     */
    @NotNull
    @Valid
    @Schema(
            name = "repositories",
            description =
                    "An array of repository objects the token is requesting access to. This field is only populated when `repository_selection` is `subset`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories")
    public JsonNullable<List<@Valid WebhooksRepositoriesInner>> getRepositories() {
        return repositories;
    }

    public void setRepositories(JsonNullable<List<@Valid WebhooksRepositoriesInner>> repositories) {
        this.repositories = repositories;
    }

    public PersonalAccessTokenRequest createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Date and time when the request for access was created.
     * @return createdAt
     */
    @NotNull
    @Schema(
            name = "created_at",
            description = "Date and time when the request for access was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public PersonalAccessTokenRequest tokenId(Long tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    /**
     * Unique identifier of the user's token. This field can also be found in audit log events and the organization's settings for their PAT grants.
     * @return tokenId
     */
    @NotNull
    @Schema(
            name = "token_id",
            description =
                    "Unique identifier of the user's token. This field can also be found in audit log events and the organization's settings for their PAT grants.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("token_id")
    public Long getTokenId() {
        return tokenId;
    }

    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    public PersonalAccessTokenRequest tokenName(String tokenName) {
        this.tokenName = tokenName;
        return this;
    }

    /**
     * The name given to the user's token. This field can also be found in an organization's settings page for Active Tokens.
     * @return tokenName
     */
    @NotNull
    @Schema(
            name = "token_name",
            description =
                    "The name given to the user's token. This field can also be found in an organization's settings page for Active Tokens.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("token_name")
    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public PersonalAccessTokenRequest tokenExpired(Boolean tokenExpired) {
        this.tokenExpired = tokenExpired;
        return this;
    }

    /**
     * Whether the associated fine-grained personal access token has expired.
     * @return tokenExpired
     */
    @NotNull
    @Schema(
            name = "token_expired",
            description = "Whether the associated fine-grained personal access token has expired.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("token_expired")
    public Boolean getTokenExpired() {
        return tokenExpired;
    }

    public void setTokenExpired(Boolean tokenExpired) {
        this.tokenExpired = tokenExpired;
    }

    public PersonalAccessTokenRequest tokenExpiresAt(String tokenExpiresAt) {
        this.tokenExpiresAt = JsonNullable.of(tokenExpiresAt);
        return this;
    }

    /**
     * Date and time when the associated fine-grained personal access token expires.
     * @return tokenExpiresAt
     */
    @NotNull
    @Schema(
            name = "token_expires_at",
            description = "Date and time when the associated fine-grained personal access token expires.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("token_expires_at")
    public JsonNullable<String> getTokenExpiresAt() {
        return tokenExpiresAt;
    }

    public void setTokenExpiresAt(JsonNullable<String> tokenExpiresAt) {
        this.tokenExpiresAt = tokenExpiresAt;
    }

    public PersonalAccessTokenRequest tokenLastUsedAt(String tokenLastUsedAt) {
        this.tokenLastUsedAt = JsonNullable.of(tokenLastUsedAt);
        return this;
    }

    /**
     * Date and time when the associated fine-grained personal access token was last used for authentication.
     * @return tokenLastUsedAt
     */
    @NotNull
    @Schema(
            name = "token_last_used_at",
            description =
                    "Date and time when the associated fine-grained personal access token was last used for authentication.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("token_last_used_at")
    public JsonNullable<String> getTokenLastUsedAt() {
        return tokenLastUsedAt;
    }

    public void setTokenLastUsedAt(JsonNullable<String> tokenLastUsedAt) {
        this.tokenLastUsedAt = tokenLastUsedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersonalAccessTokenRequest personalAccessTokenRequest = (PersonalAccessTokenRequest) o;
        return Objects.equals(this.id, personalAccessTokenRequest.id)
                && Objects.equals(this.owner, personalAccessTokenRequest.owner)
                && Objects.equals(this.permissionsAdded, personalAccessTokenRequest.permissionsAdded)
                && Objects.equals(this.permissionsUpgraded, personalAccessTokenRequest.permissionsUpgraded)
                && Objects.equals(this.permissionsResult, personalAccessTokenRequest.permissionsResult)
                && Objects.equals(this.repositorySelection, personalAccessTokenRequest.repositorySelection)
                && Objects.equals(this.repositoryCount, personalAccessTokenRequest.repositoryCount)
                && Objects.equals(this.repositories, personalAccessTokenRequest.repositories)
                && Objects.equals(this.createdAt, personalAccessTokenRequest.createdAt)
                && Objects.equals(this.tokenId, personalAccessTokenRequest.tokenId)
                && Objects.equals(this.tokenName, personalAccessTokenRequest.tokenName)
                && Objects.equals(this.tokenExpired, personalAccessTokenRequest.tokenExpired)
                && Objects.equals(this.tokenExpiresAt, personalAccessTokenRequest.tokenExpiresAt)
                && Objects.equals(this.tokenLastUsedAt, personalAccessTokenRequest.tokenLastUsedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                owner,
                permissionsAdded,
                permissionsUpgraded,
                permissionsResult,
                repositorySelection,
                repositoryCount,
                repositories,
                createdAt,
                tokenId,
                tokenName,
                tokenExpired,
                tokenExpiresAt,
                tokenLastUsedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersonalAccessTokenRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    permissionsAdded: ")
                .append(toIndentedString(permissionsAdded))
                .append("\n");
        sb.append("    permissionsUpgraded: ")
                .append(toIndentedString(permissionsUpgraded))
                .append("\n");
        sb.append("    permissionsResult: ")
                .append(toIndentedString(permissionsResult))
                .append("\n");
        sb.append("    repositorySelection: ")
                .append(toIndentedString(repositorySelection))
                .append("\n");
        sb.append("    repositoryCount: ")
                .append(toIndentedString(repositoryCount))
                .append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
        sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
        sb.append("    tokenExpired: ").append(toIndentedString(tokenExpired)).append("\n");
        sb.append("    tokenExpiresAt: ")
                .append(toIndentedString(tokenExpiresAt))
                .append("\n");
        sb.append("    tokenLastUsedAt: ")
                .append(toIndentedString(tokenLastUsedAt))
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
