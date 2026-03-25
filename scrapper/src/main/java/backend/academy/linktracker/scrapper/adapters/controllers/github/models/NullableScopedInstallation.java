package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * NullableScopedInstallation
 */
@JsonTypeName("nullable-scoped-installation")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableScopedInstallation {

    private AppPermissions permissions;

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

    private RepositorySelectionEnum repositorySelection;

    private String singleFileName = null;

    private Boolean hasMultipleSingleFiles;

    @Valid
    private List<String> singleFilePaths = new ArrayList<>();

    private URI repositoriesUrl;

    private SimpleUser account;

    public NullableScopedInstallation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableScopedInstallation(
            AppPermissions permissions,
            RepositorySelectionEnum repositorySelection,
            String singleFileName,
            URI repositoriesUrl,
            SimpleUser account) {
        this.permissions = permissions;
        this.repositorySelection = repositorySelection;
        this.singleFileName = singleFileName;
        this.repositoriesUrl = repositoriesUrl;
        this.account = account;
    }

    public NullableScopedInstallation permissions(AppPermissions permissions) {
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
    public AppPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(AppPermissions permissions) {
        this.permissions = permissions;
    }

    public NullableScopedInstallation repositorySelection(RepositorySelectionEnum repositorySelection) {
        this.repositorySelection = repositorySelection;
        return this;
    }

    /**
     * Describe whether all repositories have been selected or there's a selection involved
     * @return repositorySelection
     */
    @NotNull
    @Schema(
            name = "repository_selection",
            description = "Describe whether all repositories have been selected or there's a selection involved",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_selection")
    public RepositorySelectionEnum getRepositorySelection() {
        return repositorySelection;
    }

    public void setRepositorySelection(RepositorySelectionEnum repositorySelection) {
        this.repositorySelection = repositorySelection;
    }

    public NullableScopedInstallation singleFileName(String singleFileName) {
        this.singleFileName = singleFileName;
        return this;
    }

    /**
     * Get singleFileName
     * @return singleFileName
     */
    @NotNull
    @Schema(name = "single_file_name", example = "config.yaml", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("single_file_name")
    public String getSingleFileName() {
        return singleFileName;
    }

    public void setSingleFileName(String singleFileName) {
        this.singleFileName = singleFileName;
    }

    public NullableScopedInstallation hasMultipleSingleFiles(Boolean hasMultipleSingleFiles) {
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

    public NullableScopedInstallation singleFilePaths(List<String> singleFilePaths) {
        this.singleFilePaths = singleFilePaths;
        return this;
    }

    public NullableScopedInstallation addSingleFilePathsItem(String singleFilePathsItem) {
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

    public NullableScopedInstallation repositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
        return this;
    }

    /**
     * Get repositoriesUrl
     * @return repositoriesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "repositories_url",
            example = "https://api.github.com/users/octocat/repos",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public NullableScopedInstallation account(SimpleUser account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     * @return account
     */
    @NotNull
    @Valid
    @Schema(name = "account", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("account")
    public SimpleUser getAccount() {
        return account;
    }

    public void setAccount(SimpleUser account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NullableScopedInstallation nullableScopedInstallation = (NullableScopedInstallation) o;
        return Objects.equals(this.permissions, nullableScopedInstallation.permissions)
                && Objects.equals(this.repositorySelection, nullableScopedInstallation.repositorySelection)
                && Objects.equals(this.singleFileName, nullableScopedInstallation.singleFileName)
                && Objects.equals(this.hasMultipleSingleFiles, nullableScopedInstallation.hasMultipleSingleFiles)
                && Objects.equals(this.singleFilePaths, nullableScopedInstallation.singleFilePaths)
                && Objects.equals(this.repositoriesUrl, nullableScopedInstallation.repositoriesUrl)
                && Objects.equals(this.account, nullableScopedInstallation.account);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                permissions,
                repositorySelection,
                singleFileName,
                hasMultipleSingleFiles,
                singleFilePaths,
                repositoriesUrl,
                account);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableScopedInstallation {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    repositorySelection: ")
                .append(toIndentedString(repositorySelection))
                .append("\n");
        sb.append("    singleFileName: ")
                .append(toIndentedString(singleFileName))
                .append("\n");
        sb.append("    hasMultipleSingleFiles: ")
                .append(toIndentedString(hasMultipleSingleFiles))
                .append("\n");
        sb.append("    singleFilePaths: ")
                .append(toIndentedString(singleFilePaths))
                .append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
