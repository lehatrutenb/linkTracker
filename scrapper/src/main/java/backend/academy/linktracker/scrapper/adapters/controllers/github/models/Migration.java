package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A migration.
 */
@Schema(name = "migration", description = "A migration.")
@JsonTypeName("migration")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Migration {

    private Long id;

    private NullableSimpleUser owner = null;

    private String guid;

    private String state;

    private Boolean lockRepositories;

    private Boolean excludeMetadata;

    private Boolean excludeGitData;

    private Boolean excludeAttachments;

    private Boolean excludeReleases;

    private Boolean excludeOwnerProjects;

    private Boolean orgMetadataOnly;

    @Valid
    private List<@Valid SimpleRepository> repositories = new ArrayList<>();

    private URI url;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private String nodeId;

    private URI archiveUrl;

    @Valid
    private List<String> exclude = new ArrayList<>();

    public Migration() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Migration(
            Long id,
            NullableSimpleUser owner,
            String guid,
            String state,
            Boolean lockRepositories,
            Boolean excludeMetadata,
            Boolean excludeGitData,
            Boolean excludeAttachments,
            Boolean excludeReleases,
            Boolean excludeOwnerProjects,
            Boolean orgMetadataOnly,
            List<@Valid SimpleRepository> repositories,
            URI url,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String nodeId) {
        this.id = id;
        this.owner = owner;
        this.guid = guid;
        this.state = state;
        this.lockRepositories = lockRepositories;
        this.excludeMetadata = excludeMetadata;
        this.excludeGitData = excludeGitData;
        this.excludeAttachments = excludeAttachments;
        this.excludeReleases = excludeReleases;
        this.excludeOwnerProjects = excludeOwnerProjects;
        this.orgMetadataOnly = orgMetadataOnly;
        this.repositories = repositories;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.nodeId = nodeId;
    }

    public Migration id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "79", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Migration owner(NullableSimpleUser owner) {
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
    public NullableSimpleUser getOwner() {
        return owner;
    }

    public void setOwner(NullableSimpleUser owner) {
        this.owner = owner;
    }

    public Migration guid(String guid) {
        this.guid = guid;
        return this;
    }

    /**
     * Get guid
     * @return guid
     */
    @NotNull
    @Schema(
            name = "guid",
            example = "0b989ba4-242f-11e5-81e1-c7b6966d2516",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("guid")
    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Migration state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", example = "pending", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Migration lockRepositories(Boolean lockRepositories) {
        this.lockRepositories = lockRepositories;
        return this;
    }

    /**
     * Get lockRepositories
     * @return lockRepositories
     */
    @NotNull
    @Schema(name = "lock_repositories", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("lock_repositories")
    public Boolean getLockRepositories() {
        return lockRepositories;
    }

    public void setLockRepositories(Boolean lockRepositories) {
        this.lockRepositories = lockRepositories;
    }

    public Migration excludeMetadata(Boolean excludeMetadata) {
        this.excludeMetadata = excludeMetadata;
        return this;
    }

    /**
     * Get excludeMetadata
     * @return excludeMetadata
     */
    @NotNull
    @Schema(name = "exclude_metadata", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("exclude_metadata")
    public Boolean getExcludeMetadata() {
        return excludeMetadata;
    }

    public void setExcludeMetadata(Boolean excludeMetadata) {
        this.excludeMetadata = excludeMetadata;
    }

    public Migration excludeGitData(Boolean excludeGitData) {
        this.excludeGitData = excludeGitData;
        return this;
    }

    /**
     * Get excludeGitData
     * @return excludeGitData
     */
    @NotNull
    @Schema(name = "exclude_git_data", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("exclude_git_data")
    public Boolean getExcludeGitData() {
        return excludeGitData;
    }

    public void setExcludeGitData(Boolean excludeGitData) {
        this.excludeGitData = excludeGitData;
    }

    public Migration excludeAttachments(Boolean excludeAttachments) {
        this.excludeAttachments = excludeAttachments;
        return this;
    }

    /**
     * Get excludeAttachments
     * @return excludeAttachments
     */
    @NotNull
    @Schema(name = "exclude_attachments", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("exclude_attachments")
    public Boolean getExcludeAttachments() {
        return excludeAttachments;
    }

    public void setExcludeAttachments(Boolean excludeAttachments) {
        this.excludeAttachments = excludeAttachments;
    }

    public Migration excludeReleases(Boolean excludeReleases) {
        this.excludeReleases = excludeReleases;
        return this;
    }

    /**
     * Get excludeReleases
     * @return excludeReleases
     */
    @NotNull
    @Schema(name = "exclude_releases", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("exclude_releases")
    public Boolean getExcludeReleases() {
        return excludeReleases;
    }

    public void setExcludeReleases(Boolean excludeReleases) {
        this.excludeReleases = excludeReleases;
    }

    public Migration excludeOwnerProjects(Boolean excludeOwnerProjects) {
        this.excludeOwnerProjects = excludeOwnerProjects;
        return this;
    }

    /**
     * Get excludeOwnerProjects
     * @return excludeOwnerProjects
     */
    @NotNull
    @Schema(name = "exclude_owner_projects", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("exclude_owner_projects")
    public Boolean getExcludeOwnerProjects() {
        return excludeOwnerProjects;
    }

    public void setExcludeOwnerProjects(Boolean excludeOwnerProjects) {
        this.excludeOwnerProjects = excludeOwnerProjects;
    }

    public Migration orgMetadataOnly(Boolean orgMetadataOnly) {
        this.orgMetadataOnly = orgMetadataOnly;
        return this;
    }

    /**
     * Get orgMetadataOnly
     * @return orgMetadataOnly
     */
    @NotNull
    @Schema(name = "org_metadata_only", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("org_metadata_only")
    public Boolean getOrgMetadataOnly() {
        return orgMetadataOnly;
    }

    public void setOrgMetadataOnly(Boolean orgMetadataOnly) {
        this.orgMetadataOnly = orgMetadataOnly;
    }

    public Migration repositories(List<@Valid SimpleRepository> repositories) {
        this.repositories = repositories;
        return this;
    }

    public Migration addRepositoriesItem(SimpleRepository repositoriesItem) {
        if (this.repositories == null) {
            this.repositories = new ArrayList<>();
        }
        this.repositories.add(repositoriesItem);
        return this;
    }

    /**
     * The repositories included in the migration. Only returned for export migrations.
     * @return repositories
     */
    @NotNull
    @Valid
    @Schema(
            name = "repositories",
            description = "The repositories included in the migration. Only returned for export migrations.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories")
    public List<@Valid SimpleRepository> getRepositories() {
        return repositories;
    }

    public void setRepositories(List<@Valid SimpleRepository> repositories) {
        this.repositories = repositories;
    }

    public Migration url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/orgs/octo-org/migrations/79",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public Migration createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2015-07-06T15:33:38-07:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Migration updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2015-07-06T15:33:38-07:00", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Migration nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Migration archiveUrl(URI archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    /**
     * Get archiveUrl
     * @return archiveUrl
     */
    @Valid
    @Schema(name = "archive_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archive_url")
    public URI getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(URI archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public Migration exclude(List<String> exclude) {
        this.exclude = exclude;
        return this;
    }

    public Migration addExcludeItem(String excludeItem) {
        if (this.exclude == null) {
            this.exclude = new ArrayList<>();
        }
        this.exclude.add(excludeItem);
        return this;
    }

    /**
     * Exclude related items from being returned in the response in order to improve performance of the request. The array can include any of: `\"repositories\"`.
     * @return exclude
     */
    @Schema(
            name = "exclude",
            description =
                    "Exclude related items from being returned in the response in order to improve performance of the request. The array can include any of: `\"repositories\"`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("exclude")
    public List<String> getExclude() {
        return exclude;
    }

    public void setExclude(List<String> exclude) {
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
        Migration migration = (Migration) o;
        return Objects.equals(this.id, migration.id)
                && Objects.equals(this.owner, migration.owner)
                && Objects.equals(this.guid, migration.guid)
                && Objects.equals(this.state, migration.state)
                && Objects.equals(this.lockRepositories, migration.lockRepositories)
                && Objects.equals(this.excludeMetadata, migration.excludeMetadata)
                && Objects.equals(this.excludeGitData, migration.excludeGitData)
                && Objects.equals(this.excludeAttachments, migration.excludeAttachments)
                && Objects.equals(this.excludeReleases, migration.excludeReleases)
                && Objects.equals(this.excludeOwnerProjects, migration.excludeOwnerProjects)
                && Objects.equals(this.orgMetadataOnly, migration.orgMetadataOnly)
                && Objects.equals(this.repositories, migration.repositories)
                && Objects.equals(this.url, migration.url)
                && Objects.equals(this.createdAt, migration.createdAt)
                && Objects.equals(this.updatedAt, migration.updatedAt)
                && Objects.equals(this.nodeId, migration.nodeId)
                && Objects.equals(this.archiveUrl, migration.archiveUrl)
                && Objects.equals(this.exclude, migration.exclude);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                owner,
                guid,
                state,
                lockRepositories,
                excludeMetadata,
                excludeGitData,
                excludeAttachments,
                excludeReleases,
                excludeOwnerProjects,
                orgMetadataOnly,
                repositories,
                url,
                createdAt,
                updatedAt,
                nodeId,
                archiveUrl,
                exclude);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Migration {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
        sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    archiveUrl: ").append(toIndentedString(archiveUrl)).append("\n");
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
