package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CodespacesCreateWithPrForAuthenticatedUserRequest
 */
@JsonTypeName("codespaces_create_with_pr_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesCreateWithPrForAuthenticatedUserRequest {

    private String location;

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

    private GeoEnum geo;

    private String clientIp;

    private String machine;

    private String devcontainerPath;

    private Boolean multiRepoPermissionsOptOut;

    private String workingDirectory;

    private Long idleTimeoutMinutes;

    private String displayName;

    private Long retentionPeriodMinutes;

    public CodespacesCreateWithPrForAuthenticatedUserRequest location(String location) {
        this.location = location;
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
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CodespacesCreateWithPrForAuthenticatedUserRequest geo(GeoEnum geo) {
        this.geo = geo;
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
    public GeoEnum getGeo() {
        return geo;
    }

    public void setGeo(GeoEnum geo) {
        this.geo = geo;
    }

    public CodespacesCreateWithPrForAuthenticatedUserRequest clientIp(String clientIp) {
        this.clientIp = clientIp;
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
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public CodespacesCreateWithPrForAuthenticatedUserRequest machine(String machine) {
        this.machine = machine;
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
    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public CodespacesCreateWithPrForAuthenticatedUserRequest devcontainerPath(String devcontainerPath) {
        this.devcontainerPath = devcontainerPath;
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
    public String getDevcontainerPath() {
        return devcontainerPath;
    }

    public void setDevcontainerPath(String devcontainerPath) {
        this.devcontainerPath = devcontainerPath;
    }

    public CodespacesCreateWithPrForAuthenticatedUserRequest multiRepoPermissionsOptOut(
            Boolean multiRepoPermissionsOptOut) {
        this.multiRepoPermissionsOptOut = multiRepoPermissionsOptOut;
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
    public Boolean getMultiRepoPermissionsOptOut() {
        return multiRepoPermissionsOptOut;
    }

    public void setMultiRepoPermissionsOptOut(Boolean multiRepoPermissionsOptOut) {
        this.multiRepoPermissionsOptOut = multiRepoPermissionsOptOut;
    }

    public CodespacesCreateWithPrForAuthenticatedUserRequest workingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
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
    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public void setWorkingDirectory(String workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public CodespacesCreateWithPrForAuthenticatedUserRequest idleTimeoutMinutes(Long idleTimeoutMinutes) {
        this.idleTimeoutMinutes = idleTimeoutMinutes;
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
    public Long getIdleTimeoutMinutes() {
        return idleTimeoutMinutes;
    }

    public void setIdleTimeoutMinutes(Long idleTimeoutMinutes) {
        this.idleTimeoutMinutes = idleTimeoutMinutes;
    }

    public CodespacesCreateWithPrForAuthenticatedUserRequest displayName(String displayName) {
        this.displayName = displayName;
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
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public CodespacesCreateWithPrForAuthenticatedUserRequest retentionPeriodMinutes(Long retentionPeriodMinutes) {
        this.retentionPeriodMinutes = retentionPeriodMinutes;
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
    public Long getRetentionPeriodMinutes() {
        return retentionPeriodMinutes;
    }

    public void setRetentionPeriodMinutes(Long retentionPeriodMinutes) {
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
        CodespacesCreateWithPrForAuthenticatedUserRequest codespacesCreateWithPrForAuthenticatedUserRequest =
                (CodespacesCreateWithPrForAuthenticatedUserRequest) o;
        return Objects.equals(this.location, codespacesCreateWithPrForAuthenticatedUserRequest.location)
                && Objects.equals(this.geo, codespacesCreateWithPrForAuthenticatedUserRequest.geo)
                && Objects.equals(this.clientIp, codespacesCreateWithPrForAuthenticatedUserRequest.clientIp)
                && Objects.equals(this.machine, codespacesCreateWithPrForAuthenticatedUserRequest.machine)
                && Objects.equals(
                        this.devcontainerPath, codespacesCreateWithPrForAuthenticatedUserRequest.devcontainerPath)
                && Objects.equals(
                        this.multiRepoPermissionsOptOut,
                        codespacesCreateWithPrForAuthenticatedUserRequest.multiRepoPermissionsOptOut)
                && Objects.equals(
                        this.workingDirectory, codespacesCreateWithPrForAuthenticatedUserRequest.workingDirectory)
                && Objects.equals(
                        this.idleTimeoutMinutes, codespacesCreateWithPrForAuthenticatedUserRequest.idleTimeoutMinutes)
                && Objects.equals(this.displayName, codespacesCreateWithPrForAuthenticatedUserRequest.displayName)
                && Objects.equals(
                        this.retentionPeriodMinutes,
                        codespacesCreateWithPrForAuthenticatedUserRequest.retentionPeriodMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
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
        sb.append("class CodespacesCreateWithPrForAuthenticatedUserRequest {\n");
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
