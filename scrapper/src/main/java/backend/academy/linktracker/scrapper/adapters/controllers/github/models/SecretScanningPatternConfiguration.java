package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A collection of secret scanning patterns and their settings related to push protection.
 */
@Schema(
        name = "secret-scanning-pattern-configuration",
        description = "A collection of secret scanning patterns and their settings related to push protection.")
@JsonTypeName("secret-scanning-pattern-configuration")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningPatternConfiguration {

    private String patternConfigVersion = null;

    @Valid
    private List<@Valid SecretScanningPatternOverride> providerPatternOverrides = new ArrayList<>();

    @Valid
    private List<@Valid SecretScanningPatternOverride> customPatternOverrides = new ArrayList<>();

    public SecretScanningPatternConfiguration patternConfigVersion(String patternConfigVersion) {
        this.patternConfigVersion = patternConfigVersion;
        return this;
    }

    /**
     * The version of the entity. This is used to confirm you're updating the current version of the entity and mitigate unintentionally overriding someone else's update.
     * @return patternConfigVersion
     */
    @Schema(
            name = "pattern_config_version",
            description =
                    "The version of the entity. This is used to confirm you're updating the current version of the entity and mitigate unintentionally overriding someone else's update.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pattern_config_version")
    public String getPatternConfigVersion() {
        return patternConfigVersion;
    }

    public void setPatternConfigVersion(String patternConfigVersion) {
        this.patternConfigVersion = patternConfigVersion;
    }

    public SecretScanningPatternConfiguration providerPatternOverrides(
            List<@Valid SecretScanningPatternOverride> providerPatternOverrides) {
        this.providerPatternOverrides = providerPatternOverrides;
        return this;
    }

    public SecretScanningPatternConfiguration addProviderPatternOverridesItem(
            SecretScanningPatternOverride providerPatternOverridesItem) {
        if (this.providerPatternOverrides == null) {
            this.providerPatternOverrides = new ArrayList<>();
        }
        this.providerPatternOverrides.add(providerPatternOverridesItem);
        return this;
    }

    /**
     * Overrides for partner patterns.
     * @return providerPatternOverrides
     */
    @Valid
    @Schema(
            name = "provider_pattern_overrides",
            description = "Overrides for partner patterns.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("provider_pattern_overrides")
    public List<@Valid SecretScanningPatternOverride> getProviderPatternOverrides() {
        return providerPatternOverrides;
    }

    public void setProviderPatternOverrides(List<@Valid SecretScanningPatternOverride> providerPatternOverrides) {
        this.providerPatternOverrides = providerPatternOverrides;
    }

    public SecretScanningPatternConfiguration customPatternOverrides(
            List<@Valid SecretScanningPatternOverride> customPatternOverrides) {
        this.customPatternOverrides = customPatternOverrides;
        return this;
    }

    public SecretScanningPatternConfiguration addCustomPatternOverridesItem(
            SecretScanningPatternOverride customPatternOverridesItem) {
        if (this.customPatternOverrides == null) {
            this.customPatternOverrides = new ArrayList<>();
        }
        this.customPatternOverrides.add(customPatternOverridesItem);
        return this;
    }

    /**
     * Overrides for custom patterns defined by the organization.
     * @return customPatternOverrides
     */
    @Valid
    @Schema(
            name = "custom_pattern_overrides",
            description = "Overrides for custom patterns defined by the organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_pattern_overrides")
    public List<@Valid SecretScanningPatternOverride> getCustomPatternOverrides() {
        return customPatternOverrides;
    }

    public void setCustomPatternOverrides(List<@Valid SecretScanningPatternOverride> customPatternOverrides) {
        this.customPatternOverrides = customPatternOverrides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningPatternConfiguration secretScanningPatternConfiguration = (SecretScanningPatternConfiguration) o;
        return Objects.equals(this.patternConfigVersion, secretScanningPatternConfiguration.patternConfigVersion)
                && Objects.equals(
                        this.providerPatternOverrides, secretScanningPatternConfiguration.providerPatternOverrides)
                && Objects.equals(
                        this.customPatternOverrides, secretScanningPatternConfiguration.customPatternOverrides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patternConfigVersion, providerPatternOverrides, customPatternOverrides);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningPatternConfiguration {\n");
        sb.append("    patternConfigVersion: ")
                .append(toIndentedString(patternConfigVersion))
                .append("\n");
        sb.append("    providerPatternOverrides: ")
                .append(toIndentedString(providerPatternOverrides))
                .append("\n");
        sb.append("    customPatternOverrides: ")
                .append(toIndentedString(customPatternOverrides))
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
