package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * CodespacesCreateForAuthenticatedUserRequestOneOf
 */
@JsonTypeName("codespaces_create_for_authenticated_user_request_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesCreateForAuthenticatedUserRequestOneOf implements CodespacesCreateForAuthenticatedUserRequest {

    private Long repositoryId;

    private Optional<String> ref = Optional.empty();

    private Optional<String> location = Optional.empty();

    /**
     * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces `location`, which is closing down.
     */
    public enum GeoEnum {
        EUROPE_WEST("EuropeWest"),

        SOUTHEAST_ASIA("SoutheastAsia"),

        US_EAST("UsEast"),

        US_WEST("UsWest");

        private final String value;

        GeoEnum(String value) {
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
        public static GeoEnum fromValue(String value) {
            for (GeoEnum b : GeoEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<GeoEnum> geo = Optional.empty();

    private Optional<String> clientIp = Optional.empty();

    private Optional<String> machine = Optional.empty();

    private Optional<String> devcontainerPath = Optional.empty();

    private Optional<Boolean> multiRepoPermissionsOptOut = Optional.empty();

    private Optional<String> workingDirectory = Optional.empty();

    private Optional<Long> idleTimeoutMinutes = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    private Optional<Long> retentionPeriodMinutes = Optional.empty();

    public CodespacesCreateForAuthenticatedUserRequestOneOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesCreateForAuthenticatedUserRequestOneOf(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Repository id for this codespace
     * @return repositoryId
     */
    @NotNull
    @Schema(
            name = "repository_id",
            description = "Repository id for this codespace",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf ref(String ref) {
        this.ref = Optional.ofNullable(ref);
        return this;
    }

    /**
     * Git ref (typically a branch name) for this codespace
     * @return ref
     */
    @Schema(
            name = "ref",
            description = "Git ref (typically a branch name) for this codespace",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref")
    public Optional<String> getRef() {
        return ref;
    }

    public void setRef(Optional<String> ref) {
        this.ref = ref;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf location(String location) {
        this.location = Optional.ofNullable(location);
        return this;
    }

    /**
     * The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided.
     * @return location
     */
    @Schema(
            name = "location",
            description =
                    "The requested location for a new codespace. Best efforts are made to respect this upon creation. Assigned by IP if not provided.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("location")
    public Optional<String> getLocation() {
        return location;
    }

    public void setLocation(Optional<String> location) {
        this.location = location;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf geo(GeoEnum geo) {
        this.geo = Optional.ofNullable(geo);
        return this;
    }

    /**
     * The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces `location`, which is closing down.
     * @return geo
     */
    @Schema(
            name = "geo",
            description =
                    "The geographic area for this codespace. If not specified, the value is assigned by IP. This property replaces `location`, which is closing down.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("geo")
    public Optional<GeoEnum> getGeo() {
        return geo;
    }

    public void setGeo(Optional<GeoEnum> geo) {
        this.geo = geo;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf clientIp(String clientIp) {
        this.clientIp = Optional.ofNullable(clientIp);
        return this;
    }

    /**
     * IP for location auto-detection when proxying a request
     * @return clientIp
     */
    @Schema(
            name = "client_ip",
            description = "IP for location auto-detection when proxying a request",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("client_ip")
    public Optional<String> getClientIp() {
        return clientIp;
    }

    public void setClientIp(Optional<String> clientIp) {
        this.clientIp = clientIp;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf machine(String machine) {
        this.machine = Optional.ofNullable(machine);
        return this;
    }

    /**
     * Machine type to use for this codespace
     * @return machine
     */
    @Schema(
            name = "machine",
            description = "Machine type to use for this codespace",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("machine")
    public Optional<String> getMachine() {
        return machine;
    }

    public void setMachine(Optional<String> machine) {
        this.machine = machine;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf devcontainerPath(String devcontainerPath) {
        this.devcontainerPath = Optional.ofNullable(devcontainerPath);
        return this;
    }

    /**
     * Path to devcontainer.json config to use for this codespace
     * @return devcontainerPath
     */
    @Schema(
            name = "devcontainer_path",
            description = "Path to devcontainer.json config to use for this codespace",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("devcontainer_path")
    public Optional<String> getDevcontainerPath() {
        return devcontainerPath;
    }

    public void setDevcontainerPath(Optional<String> devcontainerPath) {
        this.devcontainerPath = devcontainerPath;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf multiRepoPermissionsOptOut(
            Boolean multiRepoPermissionsOptOut) {
        this.multiRepoPermissionsOptOut = Optional.ofNullable(multiRepoPermissionsOptOut);
        return this;
    }

    /**
     * Whether to authorize requested permissions from devcontainer.json
     * @return multiRepoPermissionsOptOut
     */
    @Schema(
            name = "multi_repo_permissions_opt_out",
            description = "Whether to authorize requested permissions from devcontainer.json",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("multi_repo_permissions_opt_out")
    public Optional<Boolean> getMultiRepoPermissionsOptOut() {
        return multiRepoPermissionsOptOut;
    }

    public void setMultiRepoPermissionsOptOut(Optional<Boolean> multiRepoPermissionsOptOut) {
        this.multiRepoPermissionsOptOut = multiRepoPermissionsOptOut;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf workingDirectory(String workingDirectory) {
        this.workingDirectory = Optional.ofNullable(workingDirectory);
        return this;
    }

    /**
     * Working directory for this codespace
     * @return workingDirectory
     */
    @Schema(
            name = "working_directory",
            description = "Working directory for this codespace",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("working_directory")
    public Optional<String> getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(Optional<String> workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf idleTimeoutMinutes(Long idleTimeoutMinutes) {
        this.idleTimeoutMinutes = Optional.ofNullable(idleTimeoutMinutes);
        return this;
    }

    /**
     * Time in minutes before codespace stops from inactivity
     * @return idleTimeoutMinutes
     */
    @Schema(
            name = "idle_timeout_minutes",
            description = "Time in minutes before codespace stops from inactivity",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("idle_timeout_minutes")
    public Optional<Long> getIdleTimeoutMinutes() {
        return idleTimeoutMinutes;
    }

    public void setIdleTimeoutMinutes(Optional<Long> idleTimeoutMinutes) {
        this.idleTimeoutMinutes = idleTimeoutMinutes;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf displayName(String displayName) {
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    /**
     * Display name for this codespace
     * @return displayName
     */
    @Schema(
            name = "display_name",
            description = "Display name for this codespace",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("display_name")
    public Optional<String> getDisplayName() {
        return displayName;
    }

    public void setDisplayName(Optional<String> displayName) {
        this.displayName = displayName;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf retentionPeriodMinutes(Long retentionPeriodMinutes) {
        this.retentionPeriodMinutes = Optional.ofNullable(retentionPeriodMinutes);
        return this;
    }

    /**
     * Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days).
     * @return retentionPeriodMinutes
     */
    @Schema(
            name = "retention_period_minutes",
            description =
                    "Duration in minutes after codespace has gone idle in which it will be deleted. Must be integer minutes between 0 and 43200 (30 days).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("retention_period_minutes")
    public Optional<Long> getRetentionPeriodMinutes() {
        return retentionPeriodMinutes;
    }

    public void setRetentionPeriodMinutes(Optional<Long> retentionPeriodMinutes) {
        this.retentionPeriodMinutes = retentionPeriodMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesCreateForAuthenticatedUserRequestOneOf codespacesCreateForAuthenticatedUserRequestOneOf =
                (CodespacesCreateForAuthenticatedUserRequestOneOf) o;
        return Objects.equals(this.repositoryId, codespacesCreateForAuthenticatedUserRequestOneOf.repositoryId)
                && Objects.equals(this.ref, codespacesCreateForAuthenticatedUserRequestOneOf.ref)
                && Objects.equals(this.location, codespacesCreateForAuthenticatedUserRequestOneOf.location)
                && Objects.equals(this.geo, codespacesCreateForAuthenticatedUserRequestOneOf.geo)
                && Objects.equals(this.clientIp, codespacesCreateForAuthenticatedUserRequestOneOf.clientIp)
                && Objects.equals(this.machine, codespacesCreateForAuthenticatedUserRequestOneOf.machine)
                && Objects.equals(
                        this.devcontainerPath, codespacesCreateForAuthenticatedUserRequestOneOf.devcontainerPath)
                && Objects.equals(
                        this.multiRepoPermissionsOptOut,
                        codespacesCreateForAuthenticatedUserRequestOneOf.multiRepoPermissionsOptOut)
                && Objects.equals(
                        this.workingDirectory, codespacesCreateForAuthenticatedUserRequestOneOf.workingDirectory)
                && Objects.equals(
                        this.idleTimeoutMinutes, codespacesCreateForAuthenticatedUserRequestOneOf.idleTimeoutMinutes)
                && Objects.equals(this.displayName, codespacesCreateForAuthenticatedUserRequestOneOf.displayName)
                && Objects.equals(
                        this.retentionPeriodMinutes,
                        codespacesCreateForAuthenticatedUserRequestOneOf.retentionPeriodMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                repositoryId,
                ref,
                location,
                geo,
                clientIp,
                machine,
                devcontainerPath,
                multiRepoPermissionsOptOut,
                workingDirectory,
                idleTimeoutMinutes,
                displayName,
                retentionPeriodMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesCreateForAuthenticatedUserRequestOneOf {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
        sb.append("    devcontainerPath: ")
                .append(toIndentedString(devcontainerPath))
                .append("\n");
        sb.append("    multiRepoPermissionsOptOut: ")
                .append(toIndentedString(multiRepoPermissionsOptOut))
                .append("\n");
        sb.append("    workingDirectory: ")
                .append(toIndentedString(workingDirectory))
                .append("\n");
        sb.append("    idleTimeoutMinutes: ")
                .append(toIndentedString(idleTimeoutMinutes))
                .append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    retentionPeriodMinutes: ")
                .append(toIndentedString(retentionPeriodMinutes))
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
