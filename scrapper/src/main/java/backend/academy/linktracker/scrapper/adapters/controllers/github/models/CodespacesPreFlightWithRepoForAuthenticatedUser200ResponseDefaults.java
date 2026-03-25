package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults
 */
@JsonTypeName("codespaces_pre_flight_with_repo_for_authenticated_user_200_response_defaults")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults {

    private String location;

    private String devcontainerPath = null;

    public CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults(
            String location, String devcontainerPath) {
        this.location = location;
        this.devcontainerPath = devcontainerPath;
    }

    public CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults location(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
     * @return location
     */
    @NotNull
    @Schema(name = "location", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults devcontainerPath(
            String devcontainerPath) {
        this.devcontainerPath = devcontainerPath;
        return this;
    }

    /**
     * Get devcontainerPath
     * @return devcontainerPath
     */
    @NotNull
    @Schema(name = "devcontainer_path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("devcontainer_path")
    public String getDevcontainerPath() {
        return devcontainerPath;
    }

    public void setDevcontainerPath(String devcontainerPath) {
        this.devcontainerPath = devcontainerPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults
                codespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults =
                        (CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults) o;
        return Objects.equals(
                        this.location, codespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults.location)
                && Objects.equals(
                        this.devcontainerPath,
                        codespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults.devcontainerPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, devcontainerPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesPreFlightWithRepoForAuthenticatedUser200ResponseDefaults {\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    devcontainerPath: ")
                .append(toIndentedString(devcontainerPath))
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
