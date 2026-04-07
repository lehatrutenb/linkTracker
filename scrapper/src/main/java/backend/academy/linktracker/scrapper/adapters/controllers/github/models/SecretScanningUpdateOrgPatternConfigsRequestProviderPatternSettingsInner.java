package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner
 */
@JsonTypeName("secret_scanning_update_org_pattern_configs_request_provider_pattern_settings_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner {

    private Optional<String> tokenType = Optional.empty();

    /**
     * Push protection setting to set for the pattern.
     */
    public enum PushProtectionSettingEnum {
        NOT_SET("not-set"),

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

    private Optional<PushProtectionSettingEnum> pushProtectionSetting = Optional.empty();

    public SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner tokenType(String tokenType) {
        this.tokenType = Optional.ofNullable(tokenType);
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
    public Optional<String> getTokenType() {
        return tokenType;
    }

    public void setTokenType(Optional<String> tokenType) {
        this.tokenType = tokenType;
    }

    public SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner pushProtectionSetting(
            PushProtectionSettingEnum pushProtectionSetting) {
        this.pushProtectionSetting = Optional.ofNullable(pushProtectionSetting);
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
    public Optional<PushProtectionSettingEnum> getPushProtectionSetting() {
        return pushProtectionSetting;
    }

    public void setPushProtectionSetting(Optional<PushProtectionSettingEnum> pushProtectionSetting) {
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
        SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner
                secretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner =
                        (SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner) o;
        return Objects.equals(
                        this.tokenType,
                        secretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner.tokenType)
                && Objects.equals(
                        this.pushProtectionSetting,
                        secretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner.pushProtectionSetting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenType, pushProtectionSetting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningUpdateOrgPatternConfigsRequestProviderPatternSettingsInner {\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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
