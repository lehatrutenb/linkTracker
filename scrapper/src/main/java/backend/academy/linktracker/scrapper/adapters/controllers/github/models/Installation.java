package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Installation
 */
@Schema(name = "installation", description = "Installation")
@JsonTypeName("installation")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Installation {

    private Long id;

    private JsonNullable<InstallationAccount> account = JsonNullable.<InstallationAccount>undefined();

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

    private URI accessTokensUrl;

    private URI repositoriesUrl;

    private URI htmlUrl;

    private Long appId;

    private Optional<String> clientId = Optional.empty();

    private Long targetId;

    private String targetType;

    private AppPermissions permissions;

    @Valid
    private List<String> events = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private JsonNullable<String> singleFileName = JsonNullable.<String>undefined();

    private Optional<Boolean> hasMultipleSingleFiles = Optional.empty();

    @Valid
    private List<String> singleFilePaths = new ArrayList<>();

    private String appSlug;

    private JsonNullable<NullableSimpleUser> suspendedBy = JsonNullable.<NullableSimpleUser>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> suspendedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<String> contactEmail = JsonNullable.<String>undefined();

    public Installation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Installation(
            Long id,
            InstallationAccount account,
            RepositorySelectionEnum repositorySelection,
            URI accessTokensUrl,
            URI repositoriesUrl,
            URI htmlUrl,
            Long appId,
            Long targetId,
            String targetType,
            AppPermissions permissions,
            List<String> events,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            String singleFileName,
            String appSlug,
            NullableSimpleUser suspendedBy,
            OffsetDateTime suspendedAt) {
        this.id = id;
        this.account = JsonNullable.of(account);
        this.repositorySelection = repositorySelection;
        this.accessTokensUrl = accessTokensUrl;
        this.repositoriesUrl = repositoriesUrl;
        this.htmlUrl = htmlUrl;
        this.appId = appId;
        this.targetId = targetId;
        this.targetType = targetType;
        this.permissions = permissions;
        this.events = events;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.singleFileName = JsonNullable.of(singleFileName);
        this.appSlug = appSlug;
        this.suspendedBy = JsonNullable.of(suspendedBy);
        this.suspendedAt = JsonNullable.of(suspendedAt);
    }

    public Installation id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the installation.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "1",
            description = "The ID of the installation.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Installation account(InstallationAccount account) {
        this.account = JsonNullable.of(account);
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
    public JsonNullable<InstallationAccount> getAccount() {
        return account;
    }

    public void setAccount(JsonNullable<InstallationAccount> account) {
        this.account = account;
    }

    public Installation repositorySelection(RepositorySelectionEnum repositorySelection) {
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

    public Installation accessTokensUrl(URI accessTokensUrl) {
        this.accessTokensUrl = accessTokensUrl;
        return this;
    }

    /**
     * Get accessTokensUrl
     * @return accessTokensUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "access_tokens_url",
            example = "https://api.github.com/app/installations/1/access_tokens",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("access_tokens_url")
    public URI getAccessTokensUrl() {
        return accessTokensUrl;
    }

    public void setAccessTokensUrl(URI accessTokensUrl) {
        this.accessTokensUrl = accessTokensUrl;
    }

    public Installation repositoriesUrl(URI repositoriesUrl) {
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
            example = "https://api.github.com/installation/repositories",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public Installation htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/organizations/github/settings/installations/1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Installation appId(Long appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get appId
     * @return appId
     */
    @NotNull
    @Schema(name = "app_id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("app_id")
    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Installation clientId(String clientId) {
        this.clientId = Optional.ofNullable(clientId);
        return this;
    }

    /**
     * Get clientId
     * @return clientId
     */
    @Schema(name = "client_id", example = "Iv1.ab1112223334445c", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("client_id")
    public Optional<String> getClientId() {
        return clientId;
    }

    public void setClientId(Optional<String> clientId) {
        this.clientId = clientId;
    }

    public Installation targetId(Long targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * The ID of the user or organization this token is being scoped to.
     * @return targetId
     */
    @NotNull
    @Schema(
            name = "target_id",
            description = "The ID of the user or organization this token is being scoped to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_id")
    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public Installation targetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get targetType
     * @return targetType
     */
    @NotNull
    @Schema(name = "target_type", example = "Organization", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_type")
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public Installation permissions(AppPermissions permissions) {
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

    public Installation events(List<String> events) {
        this.events = events;
        return this;
    }

    public Installation addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Get events
     * @return events
     */
    @NotNull
    @Schema(name = "events", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public Installation createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Installation updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Installation singleFileName(String singleFileName) {
        this.singleFileName = JsonNullable.of(singleFileName);
        return this;
    }

    /**
     * Get singleFileName
     * @return singleFileName
     */
    @NotNull
    @Schema(name = "single_file_name", example = "config.yaml", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("single_file_name")
    public JsonNullable<String> getSingleFileName() {
        return singleFileName;
    }

    public void setSingleFileName(JsonNullable<String> singleFileName) {
        this.singleFileName = singleFileName;
    }

    public Installation hasMultipleSingleFiles(Boolean hasMultipleSingleFiles) {
        this.hasMultipleSingleFiles = Optional.ofNullable(hasMultipleSingleFiles);
        return this;
    }

    /**
     * Get hasMultipleSingleFiles
     * @return hasMultipleSingleFiles
     */
    @Schema(name = "has_multiple_single_files", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_multiple_single_files")
    public Optional<Boolean> getHasMultipleSingleFiles() {
        return hasMultipleSingleFiles;
    }

    public void setHasMultipleSingleFiles(Optional<Boolean> hasMultipleSingleFiles) {
        this.hasMultipleSingleFiles = hasMultipleSingleFiles;
    }

    public Installation singleFilePaths(List<String> singleFilePaths) {
        this.singleFilePaths = singleFilePaths;
        return this;
    }

    public Installation addSingleFilePathsItem(String singleFilePathsItem) {
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

    public Installation appSlug(String appSlug) {
        this.appSlug = appSlug;
        return this;
    }

    /**
     * Get appSlug
     * @return appSlug
     */
    @NotNull
    @Schema(name = "app_slug", example = "github-actions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("app_slug")
    public String getAppSlug() {
        return appSlug;
    }

    public void setAppSlug(String appSlug) {
        this.appSlug = appSlug;
    }

    public Installation suspendedBy(NullableSimpleUser suspendedBy) {
        this.suspendedBy = JsonNullable.of(suspendedBy);
        return this;
    }

    /**
     * Get suspendedBy
     * @return suspendedBy
     */
    @NotNull
    @Valid
    @Schema(name = "suspended_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("suspended_by")
    public JsonNullable<NullableSimpleUser> getSuspendedBy() {
        return suspendedBy;
    }

    public void setSuspendedBy(JsonNullable<NullableSimpleUser> suspendedBy) {
        this.suspendedBy = suspendedBy;
    }

    public Installation suspendedAt(OffsetDateTime suspendedAt) {
        this.suspendedAt = JsonNullable.of(suspendedAt);
        return this;
    }

    /**
     * Get suspendedAt
     * @return suspendedAt
     */
    @NotNull
    @Valid
    @Schema(name = "suspended_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("suspended_at")
    public JsonNullable<OffsetDateTime> getSuspendedAt() {
        return suspendedAt;
    }

    public void setSuspendedAt(JsonNullable<OffsetDateTime> suspendedAt) {
        this.suspendedAt = suspendedAt;
    }

    public Installation contactEmail(String contactEmail) {
        this.contactEmail = JsonNullable.of(contactEmail);
        return this;
    }

    /**
     * Get contactEmail
     * @return contactEmail
     */
    @Schema(
            name = "contact_email",
            example = "\"test_13f1e99741e3e004@d7e1eb0bc0a1ba12.com\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contact_email")
    public JsonNullable<String> getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(JsonNullable<String> contactEmail) {
        this.contactEmail = contactEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Installation installation = (Installation) o;
        return Objects.equals(this.id, installation.id)
                && Objects.equals(this.account, installation.account)
                && Objects.equals(this.repositorySelection, installation.repositorySelection)
                && Objects.equals(this.accessTokensUrl, installation.accessTokensUrl)
                && Objects.equals(this.repositoriesUrl, installation.repositoriesUrl)
                && Objects.equals(this.htmlUrl, installation.htmlUrl)
                && Objects.equals(this.appId, installation.appId)
                && Objects.equals(this.clientId, installation.clientId)
                && Objects.equals(this.targetId, installation.targetId)
                && Objects.equals(this.targetType, installation.targetType)
                && Objects.equals(this.permissions, installation.permissions)
                && Objects.equals(this.events, installation.events)
                && Objects.equals(this.createdAt, installation.createdAt)
                && Objects.equals(this.updatedAt, installation.updatedAt)
                && Objects.equals(this.singleFileName, installation.singleFileName)
                && Objects.equals(this.hasMultipleSingleFiles, installation.hasMultipleSingleFiles)
                && Objects.equals(this.singleFilePaths, installation.singleFilePaths)
                && Objects.equals(this.appSlug, installation.appSlug)
                && Objects.equals(this.suspendedBy, installation.suspendedBy)
                && Objects.equals(this.suspendedAt, installation.suspendedAt)
                && equalsNullable(this.contactEmail, installation.contactEmail);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                account,
                repositorySelection,
                accessTokensUrl,
                repositoriesUrl,
                htmlUrl,
                appId,
                clientId,
                targetId,
                targetType,
                permissions,
                events,
                createdAt,
                updatedAt,
                singleFileName,
                hasMultipleSingleFiles,
                singleFilePaths,
                appSlug,
                suspendedBy,
                suspendedAt,
                hashCodeNullable(contactEmail));
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
        sb.append("class Installation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    repositorySelection: ")
                .append(toIndentedString(repositorySelection))
                .append("\n");
        sb.append("    accessTokensUrl: ")
                .append(toIndentedString(accessTokensUrl))
                .append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    singleFileName: ")
                .append(toIndentedString(singleFileName))
                .append("\n");
        sb.append("    hasMultipleSingleFiles: ")
                .append(toIndentedString(hasMultipleSingleFiles))
                .append("\n");
        sb.append("    singleFilePaths: ")
                .append(toIndentedString(singleFilePaths))
                .append("\n");
        sb.append("    appSlug: ").append(toIndentedString(appSlug)).append("\n");
        sb.append("    suspendedBy: ").append(toIndentedString(suspendedBy)).append("\n");
        sb.append("    suspendedAt: ").append(toIndentedString(suspendedAt)).append("\n");
        sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
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
