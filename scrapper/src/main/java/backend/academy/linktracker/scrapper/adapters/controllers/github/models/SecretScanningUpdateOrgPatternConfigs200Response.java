package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * SecretScanningUpdateOrgPatternConfigs200Response
 */
@JsonTypeName("secret_scanning_update_org_pattern_configs_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningUpdateOrgPatternConfigs200Response {

    private String patternConfigVersion;

    public SecretScanningUpdateOrgPatternConfigs200Response patternConfigVersion(String patternConfigVersion) {
        this.patternConfigVersion = patternConfigVersion;
        return this;
    }

    /**
     * The updated pattern configuration version.
     * @return patternConfigVersion
     */
    @Schema(
            name = "pattern_config_version",
            description = "The updated pattern configuration version.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pattern_config_version")
    public String getPatternConfigVersion() {
        return patternConfigVersion;
    }

    public void setPatternConfigVersion(String patternConfigVersion) {
        this.patternConfigVersion = patternConfigVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningUpdateOrgPatternConfigs200Response secretScanningUpdateOrgPatternConfigs200Response =
                (SecretScanningUpdateOrgPatternConfigs200Response) o;
        return Objects.equals(
                this.patternConfigVersion, secretScanningUpdateOrgPatternConfigs200Response.patternConfigVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patternConfigVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningUpdateOrgPatternConfigs200Response {\n");
        sb.append("    patternConfigVersion: ")
                .append(toIndentedString(patternConfigVersion))
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
