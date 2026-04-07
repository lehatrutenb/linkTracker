package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Authentication Token
 */
@Schema(name = "authentication-token", description = "Authentication Token")
@JsonTypeName("authentication-token")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class AuthenticationToken {

    private String token;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime expiresAt;

    private Optional<Object> permissions = Optional.empty();

    @Valid
    private List<@Valid Repository> repositories = new ArrayList<>();

    private JsonNullable<String> singleFile = JsonNullable.<String>undefined();

    /**
     * Describe whether all repositories have been selected or there's a selection involved
     */
    public enum RepositorySelectionEnum {
        ALL("all"),

        SELECTED("selected");

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

    private Optional<RepositorySelectionEnum> repositorySelection = Optional.empty();

    public AuthenticationToken() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public AuthenticationToken(String token, OffsetDateTime expiresAt) {
        this.token = token;
        this.expiresAt = expiresAt;
    }

    public AuthenticationToken token(String token) {
        this.token = token;
        return this;
    }

    /**
     * The token used for authentication
     * @return token
     */
    @NotNull
    @Schema(
            name = "token",
            example = "v1.1f699f1069f60xxx",
            description = "The token used for authentication",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthenticationToken expiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * The time this token expires
     * @return expiresAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "expires_at",
            example = "2016-07-11T22:14:10Z",
            description = "The time this token expires",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("expires_at")
    public OffsetDateTime getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public AuthenticationToken permissions(Object permissions) {
        this.permissions = Optional.ofNullable(permissions);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Schema(
            name = "permissions",
            example = "{\"issues\":\"read\",\"deployments\":\"write\"}",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public Optional<Object> getPermissions() {
        return permissions;
    }

    public void setPermissions(Optional<Object> permissions) {
        this.permissions = permissions;
    }

    public AuthenticationToken repositories(List<@Valid Repository> repositories) {
        this.repositories = repositories;
        return this;
    }

    public AuthenticationToken addRepositoriesItem(Repository repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * The repositories this token has access to
     * @return repositories
     */
    @Valid
    @Schema(
            name = "repositories",
            description = "The repositories this token has access to",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositories")
    public List<@Valid Repository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<@Valid Repository> repositories) {
        this.repositories = repositories;
    }

    public AuthenticationToken singleFile(String singleFile) {
        this.singleFile = JsonNullable.of(singleFile);
        return this;
    }

    /**
     * Get singleFile
     * @return singleFile
     */
    @Schema(name = "single_file", example = "config.yaml", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("single_file")
    public JsonNullable<String> getSingleFile() {
        return singleFile;
    }

    public void setSingleFile(JsonNullable<String> singleFile) {
        this.singleFile = singleFile;
    }

    public AuthenticationToken repositorySelection(RepositorySelectionEnum repositorySelection) {
        this.repositorySelection = Optional.ofNullable(repositorySelection);
        return this;
    }

    /**
     * Describe whether all repositories have been selected or there's a selection involved
     * @return repositorySelection
     */
    @Schema(
            name = "repository_selection",
            description = "Describe whether all repositories have been selected or there's a selection involved",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_selection")
    public Optional<RepositorySelectionEnum> getRepositorySelection() {
        return repositorySelection;
    }

    public void setRepositorySelection(Optional<RepositorySelectionEnum> repositorySelection) {
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
        AuthenticationToken authenticationToken = (AuthenticationToken) o;
        return Objects.equals(this.token, authenticationToken.token)
                && Objects.equals(this.expiresAt, authenticationToken.expiresAt)
                && Objects.equals(this.permissions, authenticationToken.permissions)
                && Objects.equals(this.repositories, authenticationToken.repositories)
                && equalsNullable(this.singleFile, authenticationToken.singleFile)
                && Objects.equals(this.repositorySelection, authenticationToken.repositorySelection);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                token, expiresAt, permissions, repositories, hashCodeNullable(singleFile), repositorySelection);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthenticationToken {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    singleFile: ").append(toIndentedString(singleFile)).append("\n");
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
