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
 * A codespace.
 */
@Schema(name = "codespace", description = "A codespace.")
@JsonTypeName("codespace")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Codespace {

    private Long id;

    private String name;

    private JsonNullable<String> displayName = JsonNullable.<String>undefined();

    private JsonNullable<String> environmentId = JsonNullable.<String>undefined();

    private SimpleUser owner;

    private SimpleUser billableOwner;

    private MinimalRepository repository;

    private JsonNullable<NullableCodespaceMachine> machine = JsonNullable.<NullableCodespaceMachine>undefined();

    private JsonNullable<String> devcontainerPath = JsonNullable.<String>undefined();

    private JsonNullable<Boolean> prebuild = JsonNullable.<Boolean>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastUsedAt;

    /**
     * State of this codespace.
     */
    public enum StateEnum {
        UNKNOWN("Unknown"),

        CREATED("Created"),

        QUEUED("Queued"),

        PROVISIONING("Provisioning"),

        AVAILABLE("Available"),

        AWAITING("Awaiting"),

        UNAVAILABLE("Unavailable"),

        DELETED("Deleted"),

        MOVED("Moved"),

        SHUTDOWN("Shutdown"),

        ARCHIVED("Archived"),

        STARTING("Starting"),

        SHUTTING_DOWN("ShuttingDown"),

        FAILED("Failed"),

        EXPORTING("Exporting"),

        UPDATING("Updating"),

        REBUILDING("Rebuilding");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    private URI url;

    private CodespaceGitStatus gitStatus;

    /**
     * The initally assigned location of a new codespace.
     */
    public enum LocationEnum {
        EAST_US("EastUs"),

        SOUTH_EAST_ASIA("SouthEastAsia"),

        WEST_EUROPE("WestEurope"),

        WEST_US2("WestUs2");

        private final String value;

        LocationEnum(String value) {
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
        public static LocationEnum fromValue(String value) {
            for (LocationEnum b : LocationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private LocationEnum location;

    private JsonNullable<Long> idleTimeoutMinutes = JsonNullable.<Long>undefined();

    private URI webUrl;

    private URI machinesUrl;

    private URI startUrl;

    private URI stopUrl;

    private JsonNullable<URI> publishUrl = JsonNullable.<URI>undefined();

    private JsonNullable<URI> pullsUrl = JsonNullable.<URI>undefined();

    @Valid
    private List<String> recentFolders = new ArrayList<>();

    private Optional<CodespaceRuntimeConstraints> runtimeConstraints = Optional.empty();

    private JsonNullable<Boolean> pendingOperation = JsonNullable.<Boolean>undefined();

    private JsonNullable<String> pendingOperationDisabledReason = JsonNullable.<String>undefined();

    private JsonNullable<String> idleTimeoutNotice = JsonNullable.<String>undefined();

    private JsonNullable<Long> retentionPeriodMinutes = JsonNullable.<Long>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> retentionExpiresAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<String> lastKnownStopNotice = JsonNullable.<String>undefined();

    public Codespace() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Codespace(
            Long id,
            String name,
            String environmentId,
            SimpleUser owner,
            SimpleUser billableOwner,
            MinimalRepository repository,
            NullableCodespaceMachine machine,
            Boolean prebuild,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime lastUsedAt,
            StateEnum state,
            URI url,
            CodespaceGitStatus gitStatus,
            LocationEnum location,
            Long idleTimeoutMinutes,
            URI webUrl,
            URI machinesUrl,
            URI startUrl,
            URI stopUrl,
            URI pullsUrl,
            List<String> recentFolders) {
        this.id = id;
        this.name = name;
        this.environmentId = JsonNullable.of(environmentId);
        this.owner = owner;
        this.billableOwner = billableOwner;
        this.repository = repository;
        this.machine = JsonNullable.of(machine);
        this.prebuild = JsonNullable.of(prebuild);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.lastUsedAt = lastUsedAt;
        this.state = state;
        this.url = url;
        this.gitStatus = gitStatus;
        this.location = location;
        this.idleTimeoutMinutes = JsonNullable.of(idleTimeoutMinutes);
        this.webUrl = webUrl;
        this.machinesUrl = machinesUrl;
        this.startUrl = startUrl;
        this.stopUrl = stopUrl;
        this.pullsUrl = JsonNullable.of(pullsUrl);
        this.recentFolders = recentFolders;
    }

    public Codespace id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Codespace name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Automatically generated name of this codespace.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "monalisa-octocat-hello-world-g4wpq6h95q",
            description = "Automatically generated name of this codespace.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Codespace displayName(String displayName) {
        this.displayName = JsonNullable.of(displayName);
        return this;
    }

    /**
     * Display name for this codespace.
     * @return displayName
     */
    @Schema(
            name = "display_name",
            example = "bookish space pancake",
            description = "Display name for this codespace.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("display_name")
    public JsonNullable<String> getDisplayName() {
        return displayName;
    }

    public void setDisplayName(JsonNullable<String> displayName) {
        this.displayName = displayName;
    }

    public Codespace environmentId(String environmentId) {
        this.environmentId = JsonNullable.of(environmentId);
        return this;
    }

    /**
     * UUID identifying this codespace's environment.
     * @return environmentId
     */
    @NotNull
    @Schema(
            name = "environment_id",
            example = "26a7c758-7299-4a73-b978-5a92a7ae98a0",
            description = "UUID identifying this codespace's environment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environment_id")
    public JsonNullable<String> getEnvironmentId() {
        return environmentId;
    }

    public void setEnvironmentId(JsonNullable<String> environmentId) {
        this.environmentId = environmentId;
    }

    public Codespace owner(SimpleUser owner) {
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

    public Codespace billableOwner(SimpleUser billableOwner) {
        this.billableOwner = billableOwner;
        return this;
    }

    /**
     * Get billableOwner
     * @return billableOwner
     */
    @NotNull
    @Valid
    @Schema(name = "billable_owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("billable_owner")
    public SimpleUser getBillableOwner() {
        return billableOwner;
    }

    public void setBillableOwner(SimpleUser billableOwner) {
        this.billableOwner = billableOwner;
    }

    public Codespace repository(MinimalRepository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public MinimalRepository getRepository() {
        return repository;
    }

    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    public Codespace machine(NullableCodespaceMachine machine) {
        this.machine = JsonNullable.of(machine);
        return this;
    }

    /**
     * Get machine
     * @return machine
     */
    @NotNull
    @Valid
    @Schema(name = "machine", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("machine")
    public JsonNullable<NullableCodespaceMachine> getMachine() {
        return machine;
    }

    public void setMachine(JsonNullable<NullableCodespaceMachine> machine) {
        this.machine = machine;
    }

    public Codespace devcontainerPath(String devcontainerPath) {
        this.devcontainerPath = JsonNullable.of(devcontainerPath);
        return this;
    }

    /**
     * Path to devcontainer.json from repo root used to create Codespace.
     * @return devcontainerPath
     */
    @Schema(
            name = "devcontainer_path",
            example = ".devcontainer/example/devcontainer.json",
            description = "Path to devcontainer.json from repo root used to create Codespace.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("devcontainer_path")
    public JsonNullable<String> getDevcontainerPath() {
        return devcontainerPath;
    }

    public void setDevcontainerPath(JsonNullable<String> devcontainerPath) {
        this.devcontainerPath = devcontainerPath;
    }

    public Codespace prebuild(Boolean prebuild) {
        this.prebuild = JsonNullable.of(prebuild);
        return this;
    }

    /**
     * Whether the codespace was created from a prebuild.
     * @return prebuild
     */
    @NotNull
    @Schema(
            name = "prebuild",
            example = "false",
            description = "Whether the codespace was created from a prebuild.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("prebuild")
    public JsonNullable<Boolean> getPrebuild() {
        return prebuild;
    }

    public void setPrebuild(JsonNullable<Boolean> prebuild) {
        this.prebuild = prebuild;
    }

    public Codespace createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Codespace updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2011-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Codespace lastUsedAt(OffsetDateTime lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
        return this;
    }

    /**
     * Last known time this codespace was started.
     * @return lastUsedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "last_used_at",
            example = "2011-01-26T19:01:12Z",
            description = "Last known time this codespace was started.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("last_used_at")
    public OffsetDateTime getLastUsedAt() {
        return lastUsedAt;
    }

    public void setLastUsedAt(OffsetDateTime lastUsedAt) {
        this.lastUsedAt = lastUsedAt;
    }

    public Codespace state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * State of this codespace.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            example = "Available",
            description = "State of this codespace.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public Codespace url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * API URL for this codespace.
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", description = "API URL for this codespace.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public Codespace gitStatus(CodespaceGitStatus gitStatus) {
        this.gitStatus = gitStatus;
        return this;
    }

    /**
     * Get gitStatus
     * @return gitStatus
     */
    @NotNull
    @Valid
    @Schema(name = "git_status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("git_status")
    public CodespaceGitStatus getGitStatus() {
        return gitStatus;
    }

    public void setGitStatus(CodespaceGitStatus gitStatus) {
        this.gitStatus = gitStatus;
    }

    public Codespace location(LocationEnum location) {
        this.location = location;
        return this;
    }

    /**
     * The initally assigned location of a new codespace.
     * @return location
     */
    @NotNull
    @Schema(
            name = "location",
            example = "WestUs2",
            description = "The initally assigned location of a new codespace.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("location")
    public LocationEnum getLocation() {
        return location;
    }

    public void setLocation(LocationEnum location) {
        this.location = location;
    }

    public Codespace idleTimeoutMinutes(Long idleTimeoutMinutes) {
        this.idleTimeoutMinutes = JsonNullable.of(idleTimeoutMinutes);
        return this;
    }

    /**
     * The number of minutes of inactivity after which this codespace will be automatically stopped.
     * @return idleTimeoutMinutes
     */
    @NotNull
    @Schema(
            name = "idle_timeout_minutes",
            example = "60",
            description =
                    "The number of minutes of inactivity after which this codespace will be automatically stopped.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("idle_timeout_minutes")
    public JsonNullable<Long> getIdleTimeoutMinutes() {
        return idleTimeoutMinutes;
    }

    public void setIdleTimeoutMinutes(JsonNullable<Long> idleTimeoutMinutes) {
        this.idleTimeoutMinutes = idleTimeoutMinutes;
    }

    public Codespace webUrl(URI webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * URL to access this codespace on the web.
     * @return webUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "web_url",
            description = "URL to access this codespace on the web.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("web_url")
    public URI getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(URI webUrl) {
        this.webUrl = webUrl;
    }

    public Codespace machinesUrl(URI machinesUrl) {
        this.machinesUrl = machinesUrl;
        return this;
    }

    /**
     * API URL to access available alternate machine types for this codespace.
     * @return machinesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "machines_url",
            description = "API URL to access available alternate machine types for this codespace.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("machines_url")
    public URI getMachinesUrl() {
        return machinesUrl;
    }

    public void setMachinesUrl(URI machinesUrl) {
        this.machinesUrl = machinesUrl;
    }

    public Codespace startUrl(URI startUrl) {
        this.startUrl = startUrl;
        return this;
    }

    /**
     * API URL to start this codespace.
     * @return startUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "start_url",
            description = "API URL to start this codespace.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("start_url")
    public URI getStartUrl() {
        return startUrl;
    }

    public void setStartUrl(URI startUrl) {
        this.startUrl = startUrl;
    }

    public Codespace stopUrl(URI stopUrl) {
        this.stopUrl = stopUrl;
        return this;
    }

    /**
     * API URL to stop this codespace.
     * @return stopUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "stop_url",
            description = "API URL to stop this codespace.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("stop_url")
    public URI getStopUrl() {
        return stopUrl;
    }

    public void setStopUrl(URI stopUrl) {
        this.stopUrl = stopUrl;
    }

    public Codespace publishUrl(URI publishUrl) {
        this.publishUrl = JsonNullable.of(publishUrl);
        return this;
    }

    /**
     * API URL to publish this codespace to a new repository.
     * @return publishUrl
     */
    @Valid
    @Schema(
            name = "publish_url",
            description = "API URL to publish this codespace to a new repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("publish_url")
    public JsonNullable<URI> getPublishUrl() {
        return publishUrl;
    }

    public void setPublishUrl(JsonNullable<URI> publishUrl) {
        this.publishUrl = publishUrl;
    }

    public Codespace pullsUrl(URI pullsUrl) {
        this.pullsUrl = JsonNullable.of(pullsUrl);
        return this;
    }

    /**
     * API URL for the Pull Request associated with this codespace, if any.
     * @return pullsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "pulls_url",
            description = "API URL for the Pull Request associated with this codespace, if any.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pulls_url")
    public JsonNullable<URI> getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(JsonNullable<URI> pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public Codespace recentFolders(List<String> recentFolders) {
        this.recentFolders = recentFolders;
        return this;
    }

    public Codespace addRecentFoldersItem(String recentFoldersItem) {
        if (this.recentFolders == null) {
            this.recentFolders = new ArrayList<>();
        }
        this.recentFolders.add(recentFoldersItem);
        return this;
    }

    /**
     * Get recentFolders
     * @return recentFolders
     */
    @NotNull
    @Schema(name = "recent_folders", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("recent_folders")
    public List<String> getRecentFolders() {
        return recentFolders;
    }

    public void setRecentFolders(List<String> recentFolders) {
        this.recentFolders = recentFolders;
    }

    public Codespace runtimeConstraints(CodespaceRuntimeConstraints runtimeConstraints) {
        this.runtimeConstraints = Optional.ofNullable(runtimeConstraints);
        return this;
    }

    /**
     * Get runtimeConstraints
     * @return runtimeConstraints
     */
    @Valid
    @Schema(name = "runtime_constraints", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runtime_constraints")
    public Optional<CodespaceRuntimeConstraints> getRuntimeConstraints() {
        return runtimeConstraints;
    }

    public void setRuntimeConstraints(Optional<CodespaceRuntimeConstraints> runtimeConstraints) {
        this.runtimeConstraints = runtimeConstraints;
    }

    public Codespace pendingOperation(Boolean pendingOperation) {
        this.pendingOperation = JsonNullable.of(pendingOperation);
        return this;
    }

    /**
     * Whether or not a codespace has a pending async operation. This would mean that the codespace is temporarily unavailable. The only thing that you can do with a codespace in this state is delete it.
     * @return pendingOperation
     */
    @Schema(
            name = "pending_operation",
            description =
                    "Whether or not a codespace has a pending async operation. This would mean that the codespace is temporarily unavailable. The only thing that you can do with a codespace in this state is delete it.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pending_operation")
    public JsonNullable<Boolean> getPendingOperation() {
        return pendingOperation;
    }

    public void setPendingOperation(JsonNullable<Boolean> pendingOperation) {
        this.pendingOperation = pendingOperation;
    }

    public Codespace pendingOperationDisabledReason(String pendingOperationDisabledReason) {
        this.pendingOperationDisabledReason = JsonNullable.of(pendingOperationDisabledReason);
        return this;
    }

    /**
     * Text to show user when codespace is disabled by a pending operation
     * @return pendingOperationDisabledReason
     */
    @Schema(
            name = "pending_operation_disabled_reason",
            description = "Text to show user when codespace is disabled by a pending operation",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pending_operation_disabled_reason")
    public JsonNullable<String> getPendingOperationDisabledReason() {
        return pendingOperationDisabledReason;
    }

    public void setPendingOperationDisabledReason(JsonNullable<String> pendingOperationDisabledReason) {
        this.pendingOperationDisabledReason = pendingOperationDisabledReason;
    }

    public Codespace idleTimeoutNotice(String idleTimeoutNotice) {
        this.idleTimeoutNotice = JsonNullable.of(idleTimeoutNotice);
        return this;
    }

    /**
     * Text to show user when codespace idle timeout minutes has been overriden by an organization policy
     * @return idleTimeoutNotice
     */
    @Schema(
            name = "idle_timeout_notice",
            description =
                    "Text to show user when codespace idle timeout minutes has been overriden by an organization policy",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("idle_timeout_notice")
    public JsonNullable<String> getIdleTimeoutNotice() {
        return idleTimeoutNotice;
    }

    public void setIdleTimeoutNotice(JsonNullable<String> idleTimeoutNotice) {
        this.idleTimeoutNotice = idleTimeoutNotice;
    }

    public Codespace retentionPeriodMinutes(Long retentionPeriodMinutes) {
        this.retentionPeriodMinutes = JsonNullable.of(retentionPeriodMinutes);
        return this;
    }

    /**
     * Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days).
     * @return retentionPeriodMinutes
     */
    @Schema(
            name = "retention_period_minutes",
            example = "60",
            description =
                    "Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("retention_period_minutes")
    public JsonNullable<Long> getRetentionPeriodMinutes() {
        return retentionPeriodMinutes;
    }

    public void setRetentionPeriodMinutes(JsonNullable<Long> retentionPeriodMinutes) {
        this.retentionPeriodMinutes = retentionPeriodMinutes;
    }

    public Codespace retentionExpiresAt(OffsetDateTime retentionExpiresAt) {
        this.retentionExpiresAt = JsonNullable.of(retentionExpiresAt);
        return this;
    }

    /**
     * When a codespace will be auto-deleted based on the \"retention_period_minutes\" and \"last_used_at\"
     * @return retentionExpiresAt
     */
    @Valid
    @Schema(
            name = "retention_expires_at",
            example = "2011-01-26T20:01:12Z",
            description =
                    "When a codespace will be auto-deleted based on the \"retention_period_minutes\" and \"last_used_at\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("retention_expires_at")
    public JsonNullable<OffsetDateTime> getRetentionExpiresAt() {
        return retentionExpiresAt;
    }

    public void setRetentionExpiresAt(JsonNullable<OffsetDateTime> retentionExpiresAt) {
        this.retentionExpiresAt = retentionExpiresAt;
    }

    public Codespace lastKnownStopNotice(String lastKnownStopNotice) {
        this.lastKnownStopNotice = JsonNullable.of(lastKnownStopNotice);
        return this;
    }

    /**
     * The text to display to a user when a codespace has been stopped for a potentially actionable reason.
     * @return lastKnownStopNotice
     */
    @Schema(
            name = "last_known_stop_notice",
            example = "you've used 100% of your spending limit for Codespaces",
            description =
                    "The text to display to a user when a codespace has been stopped for a potentially actionable reason.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_known_stop_notice")
    public JsonNullable<String> getLastKnownStopNotice() {
        return lastKnownStopNotice;
    }

    public void setLastKnownStopNotice(JsonNullable<String> lastKnownStopNotice) {
        this.lastKnownStopNotice = lastKnownStopNotice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Codespace codespace = (Codespace) o;
        return Objects.equals(this.id, codespace.id)
                && Objects.equals(this.name, codespace.name)
                && equalsNullable(this.displayName, codespace.displayName)
                && Objects.equals(this.environmentId, codespace.environmentId)
                && Objects.equals(this.owner, codespace.owner)
                && Objects.equals(this.billableOwner, codespace.billableOwner)
                && Objects.equals(this.repository, codespace.repository)
                && Objects.equals(this.machine, codespace.machine)
                && equalsNullable(this.devcontainerPath, codespace.devcontainerPath)
                && Objects.equals(this.prebuild, codespace.prebuild)
                && Objects.equals(this.createdAt, codespace.createdAt)
                && Objects.equals(this.updatedAt, codespace.updatedAt)
                && Objects.equals(this.lastUsedAt, codespace.lastUsedAt)
                && Objects.equals(this.state, codespace.state)
                && Objects.equals(this.url, codespace.url)
                && Objects.equals(this.gitStatus, codespace.gitStatus)
                && Objects.equals(this.location, codespace.location)
                && Objects.equals(this.idleTimeoutMinutes, codespace.idleTimeoutMinutes)
                && Objects.equals(this.webUrl, codespace.webUrl)
                && Objects.equals(this.machinesUrl, codespace.machinesUrl)
                && Objects.equals(this.startUrl, codespace.startUrl)
                && Objects.equals(this.stopUrl, codespace.stopUrl)
                && equalsNullable(this.publishUrl, codespace.publishUrl)
                && Objects.equals(this.pullsUrl, codespace.pullsUrl)
                && Objects.equals(this.recentFolders, codespace.recentFolders)
                && Objects.equals(this.runtimeConstraints, codespace.runtimeConstraints)
                && equalsNullable(this.pendingOperation, codespace.pendingOperation)
                && equalsNullable(this.pendingOperationDisabledReason, codespace.pendingOperationDisabledReason)
                && equalsNullable(this.idleTimeoutNotice, codespace.idleTimeoutNotice)
                && equalsNullable(this.retentionPeriodMinutes, codespace.retentionPeriodMinutes)
                && equalsNullable(this.retentionExpiresAt, codespace.retentionExpiresAt)
                && equalsNullable(this.lastKnownStopNotice, codespace.lastKnownStopNotice);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                hashCodeNullable(displayName),
                environmentId,
                owner,
                billableOwner,
                repository,
                machine,
                hashCodeNullable(devcontainerPath),
                prebuild,
                createdAt,
                updatedAt,
                lastUsedAt,
                state,
                url,
                gitStatus,
                location,
                idleTimeoutMinutes,
                webUrl,
                machinesUrl,
                startUrl,
                stopUrl,
                hashCodeNullable(publishUrl),
                pullsUrl,
                recentFolders,
                runtimeConstraints,
                hashCodeNullable(pendingOperation),
                hashCodeNullable(pendingOperationDisabledReason),
                hashCodeNullable(idleTimeoutNotice),
                hashCodeNullable(retentionPeriodMinutes),
                hashCodeNullable(retentionExpiresAt),
                hashCodeNullable(lastKnownStopNotice));
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
        sb.append("class Codespace {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    environmentId: ").append(toIndentedString(environmentId)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    billableOwner: ").append(toIndentedString(billableOwner)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
        sb.append("    devcontainerPath: ")
                .append(toIndentedString(devcontainerPath))
                .append("\n");
        sb.append("    prebuild: ").append(toIndentedString(prebuild)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    gitStatus: ").append(toIndentedString(gitStatus)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    idleTimeoutMinutes: ")
                .append(toIndentedString(idleTimeoutMinutes))
                .append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    machinesUrl: ").append(toIndentedString(machinesUrl)).append("\n");
        sb.append("    startUrl: ").append(toIndentedString(startUrl)).append("\n");
        sb.append("    stopUrl: ").append(toIndentedString(stopUrl)).append("\n");
        sb.append("    publishUrl: ").append(toIndentedString(publishUrl)).append("\n");
        sb.append("    pullsUrl: ").append(toIndentedString(pullsUrl)).append("\n");
        sb.append("    recentFolders: ").append(toIndentedString(recentFolders)).append("\n");
        sb.append("    runtimeConstraints: ")
                .append(toIndentedString(runtimeConstraints))
                .append("\n");
        sb.append("    pendingOperation: ")
                .append(toIndentedString(pendingOperation))
                .append("\n");
        sb.append("    pendingOperationDisabledReason: ")
                .append(toIndentedString(pendingOperationDisabledReason))
                .append("\n");
        sb.append("    idleTimeoutNotice: ")
                .append(toIndentedString(idleTimeoutNotice))
                .append("\n");
        sb.append("    retentionPeriodMinutes: ")
                .append(toIndentedString(retentionPeriodMinutes))
                .append("\n");
        sb.append("    retentionExpiresAt: ")
                .append(toIndentedString(retentionExpiresAt))
                .append("\n");
        sb.append("    lastKnownStopNotice: ")
                .append(toIndentedString(lastKnownStopNotice))
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
