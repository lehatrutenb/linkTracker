package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner
 */
@JsonTypeName("secret_scanning_update_org_pattern_configs_request_custom_pattern_settings_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner {

    private Optional<String> tokenType = Optional.empty();

    private JsonNullable<String> customPatternVersion = JsonNullable.<String>undefined();

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

    private Optional<PushProtectionSettingEnum> pushProtectionSetting = Optional.empty();

    public SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner tokenType(String tokenType) {
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

    public SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner customPatternVersion(
            String customPatternVersion) {
        this.customPatternVersion = JsonNullable.of(customPatternVersion);
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
    public JsonNullable<String> getCustomPatternVersion() {
        return customPatternVersion;
    }

    public void setCustomPatternVersion(JsonNullable<String> customPatternVersion) {
        this.customPatternVersion = customPatternVersion;
    }

    public SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner pushProtectionSetting(
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
        SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner
                secretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner =
                        (SecretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner) o;
        return Objects.equals(
                        this.tokenType,
                        secretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner.tokenType)
                && equalsNullable(
                        this.customPatternVersion,
                        secretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner.customPatternVersion)
                && Objects.equals(
                        this.pushProtectionSetting,
                        secretScanningUpdateOrgPatternConfigsRequestCustomPatternSettingsInner.pushProtectionSetting);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(tokenType, hashCodeNullable(customPatternVersion), pushProtectionSetting);
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
