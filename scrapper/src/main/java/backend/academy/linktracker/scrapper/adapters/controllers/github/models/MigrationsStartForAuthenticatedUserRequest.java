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
import java.util.Optional;

/**
 * MigrationsStartForAuthenticatedUserRequest
 */
@JsonTypeName("migrations_start_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MigrationsStartForAuthenticatedUserRequest {

    private Optional<Boolean> lockRepositories = Optional.empty();

    private Optional<Boolean> excludeMetadata = Optional.empty();

    private Optional<Boolean> excludeGitData = Optional.empty();

    private Optional<Boolean> excludeAttachments = Optional.empty();

    private Optional<Boolean> excludeReleases = Optional.empty();

    private Optional<Boolean> excludeOwnerProjects = Optional.empty();

    private Optional<Boolean> orgMetadataOnly = Optional.of(false);

    /**
     * Allowed values that can be passed to the exclude param.
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

    @Valid
    private List<String> repositories = new ArrayList<>();

    public MigrationsStartForAuthenticatedUserRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MigrationsStartForAuthenticatedUserRequest(List<String> repositories) {
        this.repositories = repositories;
    }

    public MigrationsStartForAuthenticatedUserRequest lockRepositories(Boolean lockRepositories) {
        this.lockRepositories = Optional.ofNullable(lockRepositories);
        return this;
    }

    /**
     * Lock the repositories being migrated at the start of the migration
     * @return lockRepositories
     */
    @Schema(
            name = "lock_repositories",
            example = "true",
            description = "Lock the repositories being migrated at the start of the migration",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("lock_repositories")
    public Optional<Boolean> getLockRepositories() {
        return lockRepositories;
    }

    public void setLockRepositories(Optional<Boolean> lockRepositories) {
        this.lockRepositories = lockRepositories;
    }

    public MigrationsStartForAuthenticatedUserRequest excludeMetadata(Boolean excludeMetadata) {
        this.excludeMetadata = Optional.ofNullable(excludeMetadata);
        return this;
    }

    /**
     * Indicates whether metadata should be excluded and only git source should be included for the migration.
     * @return excludeMetadata
     */
    @Schema(
            name = "exclude_metadata",
            example = "true",
            description =
                    "Indicates whether metadata should be excluded and only git source should be included for the migration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_metadata")
    public Optional<Boolean> getExcludeMetadata() {
        return excludeMetadata;
    }

    public void setExcludeMetadata(Optional<Boolean> excludeMetadata) {
        this.excludeMetadata = excludeMetadata;
    }

    public MigrationsStartForAuthenticatedUserRequest excludeGitData(Boolean excludeGitData) {
        this.excludeGitData = Optional.ofNullable(excludeGitData);
        return this;
    }

    /**
     * Indicates whether the repository git data should be excluded from the migration.
     * @return excludeGitData
     */
    @Schema(
            name = "exclude_git_data",
            example = "true",
            description = "Indicates whether the repository git data should be excluded from the migration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_git_data")
    public Optional<Boolean> getExcludeGitData() {
        return excludeGitData;
    }

    public void setExcludeGitData(Optional<Boolean> excludeGitData) {
        this.excludeGitData = excludeGitData;
    }

    public MigrationsStartForAuthenticatedUserRequest excludeAttachments(Boolean excludeAttachments) {
        this.excludeAttachments = Optional.ofNullable(excludeAttachments);
        return this;
    }

    /**
     * Do not include attachments in the migration
     * @return excludeAttachments
     */
    @Schema(
            name = "exclude_attachments",
            example = "true",
            description = "Do not include attachments in the migration",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_attachments")
    public Optional<Boolean> getExcludeAttachments() {
        return excludeAttachments;
    }

    public void setExcludeAttachments(Optional<Boolean> excludeAttachments) {
        this.excludeAttachments = excludeAttachments;
    }

    public MigrationsStartForAuthenticatedUserRequest excludeReleases(Boolean excludeReleases) {
        this.excludeReleases = Optional.ofNullable(excludeReleases);
        return this;
    }

    /**
     * Do not include releases in the migration
     * @return excludeReleases
     */
    @Schema(
            name = "exclude_releases",
            example = "true",
            description = "Do not include releases in the migration",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_releases")
    public Optional<Boolean> getExcludeReleases() {
        return excludeReleases;
    }

    public void setExcludeReleases(Optional<Boolean> excludeReleases) {
        this.excludeReleases = excludeReleases;
    }

    public MigrationsStartForAuthenticatedUserRequest excludeOwnerProjects(Boolean excludeOwnerProjects) {
        this.excludeOwnerProjects = Optional.ofNullable(excludeOwnerProjects);
        return this;
    }

    /**
     * Indicates whether projects owned by the organization or users should be excluded.
     * @return excludeOwnerProjects
     */
    @Schema(
            name = "exclude_owner_projects",
            example = "true",
            description = "Indicates whether projects owned by the organization or users should be excluded.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude_owner_projects")
    public Optional<Boolean> getExcludeOwnerProjects() {
        return excludeOwnerProjects;
    }

    public void setExcludeOwnerProjects(Optional<Boolean> excludeOwnerProjects) {
        this.excludeOwnerProjects = excludeOwnerProjects;
    }

    public MigrationsStartForAuthenticatedUserRequest orgMetadataOnly(Boolean orgMetadataOnly) {
        this.orgMetadataOnly = Optional.ofNullable(orgMetadataOnly);
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
    public Optional<Boolean> getOrgMetadataOnly() {
        return orgMetadataOnly;
    }

    public void setOrgMetadataOnly(Optional<Boolean> orgMetadataOnly) {
        this.orgMetadataOnly = orgMetadataOnly;
    }

    public MigrationsStartForAuthenticatedUserRequest exclude(List<ExcludeEnum> exclude) {
        this.exclude = exclude;
        return this;
    }

    public MigrationsStartForAuthenticatedUserRequest addExcludeItem(ExcludeEnum excludeItem) {
        if (this.exclude == null) {
            this.exclude = new ArrayList<>();
        }
        this.exclude.add(excludeItem);
        return this;
    }

    /**
     * Exclude attributes from the API response to improve performance
     * @return exclude
     */
    @Schema(
            name = "exclude",
            example = "[\"repositories\"]",
            description = "Exclude attributes from the API response to improve performance",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude")
    public List<ExcludeEnum> getExclude() {
        return exclude;
    }

    public void setExclude(List<ExcludeEnum> exclude) {
        this.exclude = exclude;
    }

    public MigrationsStartForAuthenticatedUserRequest repositories(List<String> repositories) {
        this.repositories = repositories;
        return this;
    }

    public MigrationsStartForAuthenticatedUserRequest addRepositoriesItem(String repositoriesItem) {
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
    @Schema(name = "repositories", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories")
    public List<String> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<String> repositories) {
        this.repositories = repositories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationsStartForAuthenticatedUserRequest migrationsStartForAuthenticatedUserRequest =
                (MigrationsStartForAuthenticatedUserRequest) o;
        return Objects.equals(this.lockRepositories, migrationsStartForAuthenticatedUserRequest.lockRepositories)
                && Objects.equals(this.excludeMetadata, migrationsStartForAuthenticatedUserRequest.excludeMetadata)
                && Objects.equals(this.excludeGitData, migrationsStartForAuthenticatedUserRequest.excludeGitData)
                && Objects.equals(
                        this.excludeAttachments, migrationsStartForAuthenticatedUserRequest.excludeAttachments)
                && Objects.equals(this.excludeReleases, migrationsStartForAuthenticatedUserRequest.excludeReleases)
                && Objects.equals(
                        this.excludeOwnerProjects, migrationsStartForAuthenticatedUserRequest.excludeOwnerProjects)
                && Objects.equals(this.orgMetadataOnly, migrationsStartForAuthenticatedUserRequest.orgMetadataOnly)
                && Objects.equals(this.exclude, migrationsStartForAuthenticatedUserRequest.exclude)
                && Objects.equals(this.repositories, migrationsStartForAuthenticatedUserRequest.repositories);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                lockRepositories,
                excludeMetadata,
                excludeGitData,
                excludeAttachments,
                excludeReleases,
                excludeOwnerProjects,
                orgMetadataOnly,
                exclude,
                repositories);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationsStartForAuthenticatedUserRequest {\n");
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
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
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
