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
 * MigrationsStartForOrgRequest
 */
@JsonTypeName("migrations_start_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MigrationsStartForOrgRequest {

    @Valid
    private List<String> repositories = new ArrayList<>();

    private Boolean lockRepositories = false;

    private Boolean excludeMetadata = false;

    private Boolean excludeGitData = false;

    private Boolean excludeAttachments = false;

    private Boolean excludeReleases = false;

    private Boolean excludeOwnerProjects = false;

    private Boolean orgMetadataOnly = false;

    /**
     * Gets or Sets exclude
     */
    public enum ExcludeEnum {
        REPOSITORIES("repositories");

        private final String value;

        ExcludeEnum(String value) {
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
        public static ExcludeEnum fromValue(String value) {
            for (ExcludeEnum b : ExcludeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    @Valid
    private List<ExcludeEnum> exclude = new ArrayList<>();

    public MigrationsStartForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MigrationsStartForOrgRequest(List<String> repositories) {
        this.repositories = repositories;
    }

    public MigrationsStartForOrgRequest repositories(List<String> repositories) {
        this.repositories = repositories;
        return this;
    }

    public MigrationsStartForOrgRequest addRepositoriesItem(String repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * A list of arrays indicating which repositories should be migrated.
     * @return repositories
     */
    @NotNull
    @Schema(
            name = "repositories",
            description = "A list of arrays indicating which repositories should be migrated.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories")
    public List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }

    public MigrationsStartForOrgRequest lockRepositories(Boolean lockRepositories) {
        this.lockRepositories = lockRepositories;
        return this;
    }

    /**
     * Indicates whether repositories should be locked (to prevent manipulation) while migrating data.
     * @return lockRepositories
     */
    @Schema(
            name = "lock_repositories",
            example = "true",
            description =
                    "Indicates whether repositories should be locked (to prevent manipulation) while migrating data.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_repositories")
    public Boolean getLockRepositories() {
        return lockRepositories;
    }

    public void setLockRepositories(Boolean lockRepositories) {
        this.lockRepositories = lockRepositories;
    }

    public MigrationsStartForOrgRequest excludeMetadata(Boolean excludeMetadata) {
        this.excludeMetadata = excludeMetadata;
        return this;
    }

    /**
     * Indicates whether metadata should be excluded and only git source should be included for the migration.
     * @return excludeMetadata
     */
    @Schema(
            name = "exclude_metadata",
            description =
                    "Indicates whether metadata should be excluded and only git source should be included for the migration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_metadata")
    public Boolean getExcludeMetadata() {
        return excludeMetadata;
    }

    public void setExcludeMetadata(Boolean excludeMetadata) {
        this.excludeMetadata = excludeMetadata;
    }

    public MigrationsStartForOrgRequest excludeGitData(Boolean excludeGitData) {
        this.excludeGitData = excludeGitData;
        return this;
    }

    /**
     * Indicates whether the repository git data should be excluded from the migration.
     * @return excludeGitData
     */
    @Schema(
            name = "exclude_git_data",
            description = "Indicates whether the repository git data should be excluded from the migration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_git_data")
    public Boolean getExcludeGitData() {
        return excludeGitData;
    }

    public void setExcludeGitData(Boolean excludeGitData) {
        this.excludeGitData = excludeGitData;
    }

    public MigrationsStartForOrgRequest excludeAttachments(Boolean excludeAttachments) {
        this.excludeAttachments = excludeAttachments;
        return this;
    }

    /**
     * Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).
     * @return excludeAttachments
     */
    @Schema(
            name = "exclude_attachments",
            example = "true",
            description =
                    "Indicates whether attachments should be excluded from the migration (to reduce migration archive file size).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_attachments")
    public Boolean getExcludeAttachments() {
        return excludeAttachments;
    }

    public void setExcludeAttachments(Boolean excludeAttachments) {
        this.excludeAttachments = excludeAttachments;
    }

    public MigrationsStartForOrgRequest excludeReleases(Boolean excludeReleases) {
        this.excludeReleases = excludeReleases;
        return this;
    }

    /**
     * Indicates whether releases should be excluded from the migration (to reduce migration archive file size).
     * @return excludeReleases
     */
    @Schema(
            name = "exclude_releases",
            example = "true",
            description =
                    "Indicates whether releases should be excluded from the migration (to reduce migration archive file size).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_releases")
    public Boolean getExcludeReleases() {
        return excludeReleases;
    }

    public void setExcludeReleases(Boolean excludeReleases) {
        this.excludeReleases = excludeReleases;
    }

    public MigrationsStartForOrgRequest excludeOwnerProjects(Boolean excludeOwnerProjects) {
        this.excludeOwnerProjects = excludeOwnerProjects;
        return this;
    }

    /**
     * Indicates whether projects owned by the organization or users should be excluded. from the migration.
     * @return excludeOwnerProjects
     */
    @Schema(
            name = "exclude_owner_projects",
            example = "true",
            description =
                    "Indicates whether projects owned by the organization or users should be excluded. from the migration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_owner_projects")
    public Boolean getExcludeOwnerProjects() {
        return excludeOwnerProjects;
    }

    public void setExcludeOwnerProjects(Boolean excludeOwnerProjects) {
        this.excludeOwnerProjects = excludeOwnerProjects;
    }

    public MigrationsStartForOrgRequest orgMetadataOnly(Boolean orgMetadataOnly) {
        this.orgMetadataOnly = orgMetadataOnly;
        return this;
    }

    /**
     * Indicates whether this should only include organization metadata (repositories array should be empty and will ignore other flags).
     * @return orgMetadataOnly
     */
    @Schema(
            name = "org_metadata_only",
            example = "true",
            description =
                    "Indicates whether this should only include organization metadata (repositories array should be empty and will ignore other flags).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("org_metadata_only")
    public Boolean getOrgMetadataOnly() {
        return orgMetadataOnly;
    }

    public void setOrgMetadataOnly(Boolean orgMetadataOnly) {
        this.orgMetadataOnly = orgMetadataOnly;
    }

    public MigrationsStartForOrgRequest exclude(List<ExcludeEnum> exclude) {
        this.exclude = exclude;
        return this;
    }

    public MigrationsStartForOrgRequest addExcludeItem(ExcludeEnum excludeItem) {
        if (this.exclude == null) {
            this.exclude = new ArrayList<>();
        }
        this.exclude.add(excludeItem);
        return this;
    }

    /**
     * Exclude related items from being returned in the response in order to improve performance of the request.
     * @return exclude
     */
    @Schema(
            name = "exclude",
            description =
                    "Exclude related items from being returned in the response in order to improve performance of the request.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude")
    public List<ExcludeEnum> getExclude() {
        return exclude;
    }

    public void setExclude(List<ExcludeEnum> exclude) {
        this.exclude = exclude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationsStartForOrgRequest migrationsStartForOrgRequest = (MigrationsStartForOrgRequest) o;
        return Objects.equals(this.repositories, migrationsStartForOrgRequest.repositories)
                && Objects.equals(this.lockRepositories, migrationsStartForOrgRequest.lockRepositories)
                && Objects.equals(this.excludeMetadata, migrationsStartForOrgRequest.excludeMetadata)
                && Objects.equals(this.excludeGitData, migrationsStartForOrgRequest.excludeGitData)
                && Objects.equals(this.excludeAttachments, migrationsStartForOrgRequest.excludeAttachments)
                && Objects.equals(this.excludeReleases, migrationsStartForOrgRequest.excludeReleases)
                && Objects.equals(this.excludeOwnerProjects, migrationsStartForOrgRequest.excludeOwnerProjects)
                && Objects.equals(this.orgMetadataOnly, migrationsStartForOrgRequest.orgMetadataOnly)
                && Objects.equals(this.exclude, migrationsStartForOrgRequest.exclude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                repositories,
                lockRepositories,
                excludeMetadata,
                excludeGitData,
                excludeAttachments,
                excludeReleases,
                excludeOwnerProjects,
                orgMetadataOnly,
                exclude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationsStartForOrgRequest {\n");
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    lockRepositories: ")
                .append(toIndentedString(lockRepositories))
                .append("\n");
        sb.append("    excludeMetadata: ")
                .append(toIndentedString(excludeMetadata))
                .append("\n");
        sb.append("    excludeGitData: ")
                .append(toIndentedString(excludeGitData))
                .append("\n");
        sb.append("    excludeAttachments: ")
                .append(toIndentedString(excludeAttachments))
                .append("\n");
        sb.append("    excludeReleases: ")
                .append(toIndentedString(excludeReleases))
                .append("\n");
        sb.append("    excludeOwnerProjects: ")
                .append(toIndentedString(excludeOwnerProjects))
                .append("\n");
        sb.append("    orgMetadataOnly: ")
                .append(toIndentedString(orgMetadataOnly))
                .append("\n");
        sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
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
