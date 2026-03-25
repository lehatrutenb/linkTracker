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
 * SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner
 */
@JsonTypeName("secret_scanning_update_org_pattern_configs_request_custom_pattern_settings_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner {

    private String tokenType;

    private String customPatternVersion = null;

    /**
     * Push protection setting to set for the pattern.
     */
    public enum PushProtectionSettingEnum {
        DISABLED("disabled"),

        ENABLED("enabled");

        private final String value;

        PushProtectionSettingEnum(String value) {
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
        public static PushProtectionSettingEnum fromValue(String value) {
            for (PushProtectionSettingEnum b : PushProtectionSettingEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PushProtectionSettingEnum pushProtectionSetting;

    public SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner tokenType(String tokenType) {
        this.tokenType = tokenType;
        return this;
    }

    /**
     * The ID of the pattern to configure.
     * @return tokenType
     */
    @Schema(
            name = "token_type",
            description = "The ID of the pattern to configure.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("token_type")
    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner customPatternVersion(
            String customPatternVersion) {
        this.customPatternVersion = customPatternVersion;
        return this;
    }

    /**
     * The version of the entity. This is used to confirm you're updating the current version of the entity and mitigate unintentionally overriding someone else's update.
     * @return customPatternVersion
     */
    @Schema(
            name = "custom_pattern_version",
            description =
                    "The version of the entity. This is used to confirm you're updating the current version of the entity and mitigate unintentionally overriding someone else's update.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_pattern_version")
    public String getCustomPatternVersion() {
        return customPatternVersion;
    }

    public void setCustomPatternVersion(String customPatternVersion) {
        this.customPatternVersion = customPatternVersion;
    }

    public SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner pushProtectionSetting(
            PushProtectionSettingEnum pushProtectionSetting) {
        this.pushProtectionSetting = pushProtectionSetting;
        return this;
    }

    /**
     * Push protection setting to set for the pattern.
     * @return pushProtectionSetting
     */
    @Schema(
            name = "push_protection_setting",
            description = "Push protection setting to set for the pattern.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("push_protection_setting")
    public PushProtectionSettingEnum getPushProtectionSetting() {
        return pushProtectionSetting;
    }

    public void setPushProtectionSetting(PushProtectionSettingEnum pushProtectionSetting) {
        this.pushProtectionSetting = pushProtectionSetting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner
                secretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner =
                        (SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner) o;
        return Objects.equals(
                        this.tokenType,
                        secretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner.tokenType)
                && Objects.equals(
                        this.customPatternVersion,
                        secretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner.customPatternVersion)
                && Objects.equals(
                        this.pushProtectionSetting,
                        secretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner.pushProtectionSetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenType, customPatternVersion, pushProtectionSetting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner {\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    customPatternVersion: ")
                .append(toIndentedString(customPatternVersion))
                .append("\n");
        sb.append("    pushProtectionSetting: ")
                .append(toIndentedString(pushProtectionSetting))
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
