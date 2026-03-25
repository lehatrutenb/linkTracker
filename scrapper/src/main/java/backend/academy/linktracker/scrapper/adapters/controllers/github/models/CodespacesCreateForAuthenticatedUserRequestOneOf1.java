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
import java.util.Objects;

/**
 * CodespacesCreateForAuthenticatedUserRequestOneOf1
 */
@JsonTypeName("codespaces_create_for_authenticated_user_request_oneOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesCreateForAuthenticatedUserRequestOneOf1 implements CodespacesCreateForAuthenticatedUserRequest {

    private CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest pullRequest;

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

    private String machine;

    private String devcontainerPath;

    private String workingDirectory;

    private Long idleTimeoutMinutes;

    public CodespacesCreateForAuthenticatedUserRequestOneOf1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesCreateForAuthenticatedUserRequestOneOf1(
            CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf1 pullRequest(
            CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest pullRequest) {
        this.pullRequest = pullRequest;
        return this;
    }

    /**
     * Get pullRequest
     * @return pullRequest
     */
    @NotNull
    @Valid
    @Schema(name = "pull_request", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request")
    public CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest getPullRequest() {
        return pullRequest;
    }

    public void setPullRequest(CodespacesCreateForAuthenticatedUserRequestOneOf1PullRequest pullRequest) {
        this.pullRequest = pullRequest;
    }

    public CodespacesCreateForAuthenticatedUserRequestOneOf1 location(String location) {
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

    public CodespacesCreateForAuthenticatedUserRequestOneOf1 geo(GeoEnum geo) {
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

    public CodespacesCreateForAuthenticatedUserRequestOneOf1 machine(String machine) {
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

    public CodespacesCreateForAuthenticatedUserRequestOneOf1 devcontainerPath(String devcontainerPath) {
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

    public CodespacesCreateForAuthenticatedUserRequestOneOf1 workingDirectory(String workingDirectory) {
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

    public CodespacesCreateForAuthenticatedUserRequestOneOf1 idleTimeoutMinutes(Long idleTimeoutMinutes) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesCreateForAuthenticatedUserRequestOneOf1 codespacesCreateForAuthenticatedUserRequestOneOf1 =
                (CodespacesCreateForAuthenticatedUserRequestOneOf1) o;
        return Objects.equals(this.pullRequest, codespacesCreateForAuthenticatedUserRequestOneOf1.pullRequest)
                && Objects.equals(this.location, codespacesCreateForAuthenticatedUserRequestOneOf1.location)
                && Objects.equals(this.geo, codespacesCreateForAuthenticatedUserRequestOneOf1.geo)
                && Objects.equals(this.machine, codespacesCreateForAuthenticatedUserRequestOneOf1.machine)
                && Objects.equals(
                        this.devcontainerPath, codespacesCreateForAuthenticatedUserRequestOneOf1.devcontainerPath)
                && Objects.equals(
                        this.workingDirectory, codespacesCreateForAuthenticatedUserRequestOneOf1.workingDirectory)
                && Objects.equals(
                        this.idleTimeoutMinutes, codespacesCreateForAuthenticatedUserRequestOneOf1.idleTimeoutMinutes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pullRequest, location, geo, machine, devcontainerPath, workingDirectory, idleTimeoutMinutes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesCreateForAuthenticatedUserRequestOneOf1 {\n");
        sb.append("    pullRequest: ").append(toIndentedString(pullRequest)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    geo: ").append(toIndentedString(geo)).append("\n");
        sb.append("    machine: ").append(toIndentedString(machine)).append("\n");
        sb.append("    devcontainerPath: ")
                .append(toIndentedString(devcontainerPath))
                .append("\n");
        sb.append("    workingDirectory: ")
                .append(toIndentedString(workingDirectory))
                .append("\n");
        sb.append("    idleTimeoutMinutes: ")
                .append(toIndentedString(idleTimeoutMinutes))
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
