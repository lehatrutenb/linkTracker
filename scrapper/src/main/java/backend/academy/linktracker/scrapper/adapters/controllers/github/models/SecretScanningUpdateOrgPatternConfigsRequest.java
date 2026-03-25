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
 * SecretScanningUpdateOrgPatternConfigsRequest
 */
@JsonTypeName("secret_scanning_update_org_pattern_configs_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningUpdateOrgPatternConfigsRequest {

    private String patternConfigVersion = null;

    @Valid
    private List<@Valid SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner>
            providerPatternSettings = new ArrayList<>();

    @Valid
    private List<@Valid SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner> customPatternSettings =
            new ArrayList<>();

    public SecretScanningUpdateOrgPatternConfigsRequest patternConfigVersion(String patternConfigVersion) {
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

    public SecretScanningUpdateOrgPatternConfigsRequest providerPatternSettings(
            List<@Valid SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner>
                    providerPatternSettings) {
        this.providerPatternSettings = providerPatternSettings;
        return this;
    }

    public SecretScanningUpdateOrgPatternConfigsRequest addProviderPatternSettingsItem(
            SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner providerPatternSettingsItem) {
        if (this.providerPatternSettings == null) {
            this.providerPatternSettings = new ArrayList<>();
        }
        this.providerPatternSettings.add(providerPatternSettingsItem);
        return this;
    }

    /**
     * Pattern settings for provider patterns.
     * @return providerPatternSettings
     */
    @Valid
    @Schema(
            name = "provider_pattern_settings",
            description = "Pattern settings for provider patterns.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("provider_pattern_settings")
    public List<@Valid SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner>
            getProviderPatternSettings() {
        return providerPatternSettings;
    }

    public void setProviderPatternSettings(
            List<@Valid SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner>
                    providerPatternSettings) {
        this.providerPatternSettings = providerPatternSettings;
    }

    public SecretScanningUpdateOrgPatternConfigsRequest customPatternSettings(
            List<@Valid SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner> customPatternSettings) {
        this.customPatternSettings = customPatternSettings;
        return this;
    }

    public SecretScanningUpdateOrgPatternConfigsRequest addCustomPatternSettingsItem(
            SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner customPatternSettingsItem) {
        if (this.customPatternSettings == null) {
            this.customPatternSettings = new ArrayList<>();
        }
        this.customPatternSettings.add(customPatternSettingsItem);
        return this;
    }

    /**
     * Pattern settings for custom patterns.
     * @return customPatternSettings
     */
    @Valid
    @Schema(
            name = "custom_pattern_settings",
            description = "Pattern settings for custom patterns.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_pattern_settings")
    public List<@Valid SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner>
            getCustomPatternSettings() {
        return customPatternSettings;
    }

    public void setCustomPatternSettings(
            List<@Valid SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner> customPatternSettings) {
        this.customPatternSettings = customPatternSettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningUpdateOrgPatternConfigsRequest secretScanningUpdateOrgPatternConfigsRequest =
                (SecretScanningUpdateOrgPatternConfigsRequest) o;
        return Objects.equals(
                        this.patternConfigVersion, secretScanningUpdateOrgPatternConfigsRequest.patternConfigVersion)
                && Objects.equals(
                        this.providerPatternSettings,
                        secretScanningUpdateOrgPatternConfigsRequest.providerPatternSettings)
                && Objects.equals(
                        this.customPatternSettings, secretScanningUpdateOrgPatternConfigsRequest.customPatternSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patternConfigVersion, providerPatternSettings, customPatternSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningUpdateOrgPatternConfigsRequest {\n");
        sb.append("    patternConfigVersion: ")
                .append(toIndentedString(patternConfigVersion))
                .append("\n");
        sb.append("    providerPatternSettings: ")
                .append(toIndentedString(providerPatternSettings))
                .append("\n");
        sb.append("    customPatternSettings: ")
                .append(toIndentedString(customPatternSettings))
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
