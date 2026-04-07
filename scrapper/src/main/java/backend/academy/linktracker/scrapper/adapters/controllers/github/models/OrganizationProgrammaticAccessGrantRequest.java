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
 * Minimal representation of an organization programmatic access grant request for enumerations
 */
@Schema(
        name = "organization-programmatic-access-grant-request",
        description = "Minimal representation of an organization programmatic access grant request for enumerations")
@JsonTypeName("organization-programmatic-access-grant-request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationProgrammaticAccessGrantRequest {

    private Long id;

    private JsonNullable<String> reason = JsonNullable.<String>undefined();

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

    private String createdAt;

    private Long tokenId;

    private String tokenName;

    private Boolean tokenExpired;

    private JsonNullable<String> tokenExpiresAt = JsonNullable.<String>undefined();

    private JsonNullable<String> tokenLastUsedAt = JsonNullable.<String>undefined();

    public OrganizationProgrammaticAccessGrantRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationProgrammaticAccessGrantRequest(
            Long id,
            String reason,
            SimpleUser owner,
            RepositorySelectionEnum repositorySelection,
            String repositoriesUrl,
            OrganizationProgrammaticAccessGrantRequestPermissions permissions,
            String createdAt,
            Long tokenId,
            String tokenName,
            Boolean tokenExpired,
            String tokenExpiresAt,
            String tokenLastUsedAt) {
        this.id = id;
        this.reason = JsonNullable.of(reason);
        this.owner = owner;
        this.repositorySelection = repositorySelection;
        this.repositoriesUrl = repositoriesUrl;
        this.permissions = permissions;
        this.createdAt = createdAt;
        this.tokenId = tokenId;
        this.tokenName = tokenName;
        this.tokenExpired = tokenExpired;
        this.tokenExpiresAt = JsonNullable.of(tokenExpiresAt);
        this.tokenLastUsedAt = JsonNullable.of(tokenLastUsedAt);
    }

    public OrganizationProgrammaticAccessGrantRequest id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the request for access via fine-grained personal access token. The `pat_request_id` used to review PAT requests.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description =
                    "Unique identifier of the request for access via fine-grained personal access token. The `pat_request_id` used to review PAT requests.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrganizationProgrammaticAccessGrantRequest reason(String reason) {
        this.reason = JsonNullable.of(reason);
        return this;
    }

    /**
     * Reason for requesting access.
     * @return reason
     */
    @NotNull
    @Schema(name = "reason", description = "Reason for requesting access.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reason")
    public JsonNullable<String> getReason() {
        return reason;
    }

    public void setReason(JsonNullable<String> reason) {
        this.reason = reason;
    }

    public OrganizationProgrammaticAccessGrantRequest owner(SimpleUser owner) {
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

    public OrganizationProgrammaticAccessGrantRequest repositorySelection(RepositorySelectionEnum repositorySelection) {
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

    public OrganizationProgrammaticAccessGrantRequest repositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
        return this;
    }

    /**
     * URL to the list of repositories requested to be accessed via fine-grained personal access token. Should only be followed when `repository_selection` is `subset`.
     * @return repositoriesUrl
     */
    @NotNull
    @Schema(
            name = "repositories_url",
            description =
                    "URL to the list of repositories requested to be accessed via fine-grained personal access token. Should only be followed when `repository_selection` is `subset`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_url")
    public String getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(String repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public OrganizationProgrammaticAccessGrantRequest permissions(
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

    public OrganizationProgrammaticAccessGrantRequest createdAt(String createdAt) {
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

    public OrganizationProgrammaticAccessGrantRequest tokenId(Long tokenId) {
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

    public OrganizationProgrammaticAccessGrantRequest tokenName(String tokenName) {
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

    public OrganizationProgrammaticAccessGrantRequest tokenExpired(Boolean tokenExpired) {
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

    public OrganizationProgrammaticAccessGrantRequest tokenExpiresAt(String tokenExpiresAt) {
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

    public OrganizationProgrammaticAccessGrantRequest tokenLastUsedAt(String tokenLastUsedAt) {
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
        OrganizationProgrammaticAccessGrantRequest organizationProgrammaticAccessGrantRequest =
                (OrganizationProgrammaticAccessGrantRequest) o;
        return Objects.equals(this.id, organizationProgrammaticAccessGrantRequest.id)
                && Objects.equals(this.reason, organizationProgrammaticAccessGrantRequest.reason)
                && Objects.equals(this.owner, organizationProgrammaticAccessGrantRequest.owner)
                && Objects.equals(
                        this.repositorySelection, organizationProgrammaticAccessGrantRequest.repositorySelection)
                && Objects.equals(this.repositoriesUrl, organizationProgrammaticAccessGrantRequest.repositoriesUrl)
                && Objects.equals(this.permissions, organizationProgrammaticAccessGrantRequest.permissions)
                && Objects.equals(this.createdAt, organizationProgrammaticAccessGrantRequest.createdAt)
                && Objects.equals(this.tokenId, organizationProgrammaticAccessGrantRequest.tokenId)
                && Objects.equals(this.tokenName, organizationProgrammaticAccessGrantRequest.tokenName)
                && Objects.equals(this.tokenExpired, organizationProgrammaticAccessGrantRequest.tokenExpired)
                && Objects.equals(this.tokenExpiresAt, organizationProgrammaticAccessGrantRequest.tokenExpiresAt)
                && Objects.equals(this.tokenLastUsedAt, organizationProgrammaticAccessGrantRequest.tokenLastUsedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                reason,
                owner,
                repositorySelection,
                repositoriesUrl,
                permissions,
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
        sb.append("class OrganizationProgrammaticAccessGrantRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    repositorySelection: ")
                .append(toIndentedString(repositorySelection))
                .append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
