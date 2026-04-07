package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Minimal representation of an organization programmatic access grant for enumerations
 */
@Schema(
        name = "organization-programmatic-access-grant",
        description = "Minimal representation of an organization programmatic access grant for enumerations")
@JsonTypeName("organization-programmatic-access-grant")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationProgrammaticAccessGrant {

    private Long id;

    private SimpleUser owner;

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

    private String repositoriesUrl;

    private OrganizationProgrammaticAccessGrantRequestPermissions permissions;

    private String accessGrantedAt;

    private Long tokenId;

    private String tokenName;

    private Boolean tokenExpired;

    private JsonNullable<String> tokenExpiresAt = JsonNullable.<String>undefined();

    private JsonNullable<String> tokenLastUsedAt = JsonNullable.<String>undefined();

    public OrganizationProgrammaticAccessGrant() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationProgrammaticAccessGrant(
            Long id,
            SimpleUser owner,
            RepositorySelectionEnum repositorySelection,
            String repositoriesUrl,
            OrganizationProgrammaticAccessGrantRequestPermissions permissions,
            String accessGrantedAt,
            Long tokenId,
            String tokenName,
            Boolean tokenExpired,
            String tokenExpiresAt,
            String tokenLastUsedAt) {
        this.id = id;
        this.owner = owner;
        this.repositorySelection = repositorySelection;
        this.repositoriesUrl = repositoriesUrl;
        this.permissions = permissions;
        this.accessGrantedAt = accessGrantedAt;
        this.tokenId = tokenId;
        this.tokenName = tokenName;
        this.tokenExpired = tokenExpired;
        this.tokenExpiresAt = JsonNullable.of(tokenExpiresAt);
        this.tokenLastUsedAt = JsonNullable.of(tokenLastUsedAt);
    }

    public OrganizationProgrammaticAccessGrant id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the fine-grained personal access token grant. The `pat_id` used to get details about an approved fine-grained personal access token.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description =
                    "Unique identifier of the fine-grained personal access token grant. The `pat_id` used to get details about an approved fine-grained personal access token.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrganizationProgrammaticAccessGrant owner(SimpleUser owner) {
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

    public OrganizationProgrammaticAccessGrant repositorySelection(RepositorySelectionEnum repositorySelection) {
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

    public OrganizationProgrammaticAccessGrant repositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
        return this;
    }

    /**
     * URL to the list of repositories the fine-grained personal access token can access. Only follow when `repository_selection` is `subset`.
     * @return repositoriesUrl
     */
    @NotNull
    @Schema(
            name = "repositories_url",
            description =
                    "URL to the list of repositories the fine-grained personal access token can access. Only follow when `repository_selection` is `subset`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_url")
    public String getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public OrganizationProgrammaticAccessGrant permissions(
            OrganizationProgrammaticAccessGrantRequestPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @NotNull
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permissions")
    public OrganizationProgrammaticAccessGrantRequestPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(OrganizationProgrammaticAccessGrantRequestPermissions permissions) {
        this.permissions = permissions;
    }

    public OrganizationProgrammaticAccessGrant accessGrantedAt(String accessGrantedAt) {
        this.accessGrantedAt = accessGrantedAt;
        return this;
    }

    /**
     * Date and time when the fine-grained personal access token was approved to access the organization.
     * @return accessGrantedAt
     */
    @NotNull
    @Schema(
            name = "access_granted_at",
            description =
                    "Date and time when the fine-grained personal access token was approved to access the organization.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("access_granted_at")
    public String getAccessGrantedAt() {
        return accessGrantedAt;
    }

    public void setAccessGrantedAt(String accessGrantedAt) {
        this.accessGrantedAt = accessGrantedAt;
    }

    public OrganizationProgrammaticAccessGrant tokenId(Long tokenId) {
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

    public OrganizationProgrammaticAccessGrant tokenName(String tokenName) {
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

    public OrganizationProgrammaticAccessGrant tokenExpired(Boolean tokenExpired) {
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

    public OrganizationProgrammaticAccessGrant tokenExpiresAt(String tokenExpiresAt) {
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

    public OrganizationProgrammaticAccessGrant tokenLastUsedAt(String tokenLastUsedAt) {
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
        OrganizationProgrammaticAccessGrant organizationProgrammaticAccessGrant =
                (OrganizationProgrammaticAccessGrant) o;
        return Objects.equals(this.id, organizationProgrammaticAccessGrant.id)
                && Objects.equals(this.owner, organizationProgrammaticAccessGrant.owner)
                && Objects.equals(this.repositorySelection, organizationProgrammaticAccessGrant.repositorySelection)
                && Objects.equals(this.repositoriesUrl, organizationProgrammaticAccessGrant.repositoriesUrl)
                && Objects.equals(this.permissions, organizationProgrammaticAccessGrant.permissions)
                && Objects.equals(this.accessGrantedAt, organizationProgrammaticAccessGrant.accessGrantedAt)
                && Objects.equals(this.tokenId, organizationProgrammaticAccessGrant.tokenId)
                && Objects.equals(this.tokenName, organizationProgrammaticAccessGrant.tokenName)
                && Objects.equals(this.tokenExpired, organizationProgrammaticAccessGrant.tokenExpired)
                && Objects.equals(this.tokenExpiresAt, organizationProgrammaticAccessGrant.tokenExpiresAt)
                && Objects.equals(this.tokenLastUsedAt, organizationProgrammaticAccessGrant.tokenLastUsedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                owner,
                repositorySelection,
                repositoriesUrl,
                permissions,
                accessGrantedAt,
                tokenId,
                tokenName,
                tokenExpired,
                tokenExpiresAt,
                tokenLastUsedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationProgrammaticAccessGrant {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    repositorySelection: ")
                .append(toIndentedString(repositorySelection))
                .append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    accessGrantedAt: ")
                .append(toIndentedString(accessGrantedAt))
                .append("\n");
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
