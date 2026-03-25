package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Authentication token for a GitHub App installed on a user or org.
 */
@Schema(name = "installation-token", description = "Authentication token for a GitHub App installed on a user or org.")
@JsonTypeName("installation-token")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class InstallationToken {

    private String token;

    private String expiresAt;

    private AppPermissions permissions;

    /**
     * Gets or Sets repositorySelection
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

    private RepositorySelectionEnum repositorySelection;

    @Valid
    private List<@Valid Repository> repositories = new ArrayList<>();

    private String singleFile;

    private Boolean hasMultipleSingleFiles;

    @Valid
    private List<String> singleFilePaths = new ArrayList<>();

    public InstallationToken() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public InstallationToken(String token, String expiresAt) {
        this.token = token;
        this.expiresAt = expiresAt;
    }

    public InstallationToken token(String token) {
        this.token = token;
        return this;
    }

    /**
     * Get token
     * @return token
     */
    @NotNull
    @Schema(name = "token", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public InstallationToken expiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     * Get expiresAt
     * @return expiresAt
     */
    @NotNull
    @Schema(name = "expires_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("expires_at")
    public String getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(String expiresAt) {
        this.expiresAt = expiresAt;
    }

    public InstallationToken permissions(AppPermissions permissions) {
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

    public InstallationToken repositorySelection(RepositorySelectionEnum repositorySelection) {
        this.repositorySelection = repositorySelection;
        return this;
    }

    /**
     * Get repositorySelection
     * @return repositorySelection
     */
    @Schema(name = "repository_selection", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_selection")
    public RepositorySelectionEnum getRepositorySelection() {
        return repositorySelection;
    }

    public void setRepositorySelection(RepositorySelectionEnum repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    public InstallationToken repositories(List<@Valid Repository> repositories) {
        this.repositories = repositories;
        return this;
    }

    public InstallationToken addRepositoriesItem(Repository repositoriesItem) {
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

    public InstallationToken singleFile(String singleFile) {
        this.singleFile = singleFile;
        return this;
    }

    /**
     * Get singleFile
     * @return singleFile
     */
    @Schema(name = "single_file", example = "README.md", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("single_file")
    public String getSingleFile() {
        return singleFile;
    }

    public void setSingleFile(String singleFile) {
        this.singleFile = singleFile;
    }

    public InstallationToken hasMultipleSingleFiles(Boolean hasMultipleSingleFiles) {
        this.hasMultipleSingleFiles = hasMultipleSingleFiles;
        return this;
    }

    /**
     * Get hasMultipleSingleFiles
     * @return hasMultipleSingleFiles
     */
    @Schema(name = "has_multiple_single_files", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_multiple_single_files")
    public Boolean getHasMultipleSingleFiles() {
        return hasMultipleSingleFiles;
    }

    public void setHasMultipleSingleFiles(Boolean hasMultipleSingleFiles) {
        this.hasMultipleSingleFiles = hasMultipleSingleFiles;
    }

    public InstallationToken singleFilePaths(List<String> singleFilePaths) {
        this.singleFilePaths = singleFilePaths;
        return this;
    }

    public InstallationToken addSingleFilePathsItem(String singleFilePathsItem) {
        if (this.singleFilePaths == null) {
            this.singleFilePaths = new ArrayList<>();
        }
        this.singleFilePaths.add(singleFilePathsItem);
        return this;
    }

    /**
     * Get singleFilePaths
     * @return singleFilePaths
     */
    @Schema(
            name = "single_file_paths",
            example = "[\"config.yml\",\".github/issue_TEMPLATE.md\"]",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("single_file_paths")
    public List<String> getSingleFilePaths() {
        return singleFilePaths;
    }

    public void setSingleFilePaths(List<String> singleFilePaths) {
        this.singleFilePaths = singleFilePaths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstallationToken installationToken = (InstallationToken) o;
        return Objects.equals(this.token, installationToken.token)
                && Objects.equals(this.expiresAt, installationToken.expiresAt)
                && Objects.equals(this.permissions, installationToken.permissions)
                && Objects.equals(this.repositorySelection, installationToken.repositorySelection)
                && Objects.equals(this.repositories, installationToken.repositories)
                && Objects.equals(this.singleFile, installationToken.singleFile)
                && Objects.equals(this.hasMultipleSingleFiles, installationToken.hasMultipleSingleFiles)
                && Objects.equals(this.singleFilePaths, installationToken.singleFilePaths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                token,
                expiresAt,
                permissions,
                repositorySelection,
                repositories,
                singleFile,
                hasMultipleSingleFiles,
                singleFilePaths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstallationToken {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    repositorySelection: ")
                .append(toIndentedString(repositorySelection))
                .append("\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    singleFile: ").append(toIndentedString(singleFile)).append("\n");
        sb.append("    hasMultipleSingleFiles: ")
                .append(toIndentedString(hasMultipleSingleFiles))
                .append("\n");
        sb.append("    singleFilePaths: ")
                .append(toIndentedString(singleFilePaths))
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
