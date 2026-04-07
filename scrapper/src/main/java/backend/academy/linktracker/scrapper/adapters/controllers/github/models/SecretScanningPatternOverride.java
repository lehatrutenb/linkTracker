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
 * SecretScanningPatternOverride
 */
@JsonTypeName("secret-scanning-pattern-override")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningPatternOverride {

    private Optional<String> tokenType = Optional.empty();

    private JsonNullable<String> customPatternVersion = JsonNullable.<String>undefined();

    private Optional<String> slug = Optional.empty();

    private Optional<String> displayName = Optional.empty();

    private Optional<Long> alertTotal = Optional.empty();

    private Optional<Long> alertTotalPercentage = Optional.empty();

    private Optional<Long> falsePositives = Optional.empty();

    private Optional<Long> falsePositiveRate = Optional.empty();

    private Optional<Long> bypassRate = Optional.empty();

    /**
     * The default push protection setting for this pattern.
     */
    public enum DefaultSettingEnum {
        DISABLED("disabled"),

        ENABLED("enabled");

        private final String value;

        DefaultSettingEnum(String value) {
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
        public static DefaultSettingEnum fromValue(String value) {
            for (DefaultSettingEnum b : DefaultSettingEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DefaultSettingEnum> defaultSetting = Optional.empty();

    /**
     * The push protection setting for this pattern set at the enterprise level. Only present for partner patterns when the organization has a parent enterprise.
     */
    public enum EnterpriseSettingEnum {
        NOT_SET("not-set"),

        DISABLED("disabled"),

        ENABLED("enabled");

        private final String value;

        EnterpriseSettingEnum(String value) {
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
        public static EnterpriseSettingEnum fromValue(String value) {
            for (EnterpriseSettingEnum b : EnterpriseSettingEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private JsonNullable<EnterpriseSettingEnum> enterpriseSetting = JsonNullable.<EnterpriseSettingEnum>undefined();

    /**
     * The current push protection setting for this pattern. If this is `not-set`, then it inherits either the enterprise setting if it exists or the default setting.
     */
    public enum SettingEnum {
        NOT_SET("not-set"),

        DISABLED("disabled"),

        ENABLED("enabled");

        private final String value;

        SettingEnum(String value) {
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
        public static SettingEnum fromValue(String value) {
            for (SettingEnum b : SettingEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SettingEnum> setting = Optional.empty();

    public SecretScanningPatternOverride tokenType(String tokenType) {
        this.tokenType = Optional.ofNullable(tokenType);
        return this;
    }

    /**
     * The ID of the pattern.
     * @return tokenType
     */
    @Schema(
            name = "token_type",
            description = "The ID of the pattern.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("token_type")
    public Optional<String> getTokenType() {
        return tokenType;
    }

    public void setTokenType(Optional<String> tokenType) {
        this.tokenType = tokenType;
    }

    public SecretScanningPatternOverride customPatternVersion(String customPatternVersion) {
        this.customPatternVersion = JsonNullable.of(customPatternVersion);
        return this;
    }

    /**
     * The version of this pattern if it's a custom pattern.
     * @return customPatternVersion
     */
    @Schema(
            name = "custom_pattern_version",
            description = "The version of this pattern if it's a custom pattern.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("custom_pattern_version")
    public JsonNullable<String> getCustomPatternVersion() {
        return customPatternVersion;
    }

    public void setCustomPatternVersion(JsonNullable<String> customPatternVersion) {
        this.customPatternVersion = customPatternVersion;
    }

    public SecretScanningPatternOverride slug(String slug) {
        this.slug = Optional.ofNullable(slug);
        return this;
    }

    /**
     * The slug of the pattern.
     * @return slug
     */
    @Schema(name = "slug", description = "The slug of the pattern.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public Optional<String> getSlug() {
        return slug;
    }

    public void setSlug(Optional<String> slug) {
        this.slug = slug;
    }

    public SecretScanningPatternOverride displayName(String displayName) {
        this.displayName = Optional.ofNullable(displayName);
        return this;
    }

    /**
     * The user-friendly name for the pattern.
     * @return displayName
     */
    @Schema(
            name = "display_name",
            description = "The user-friendly name for the pattern.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("display_name")
    public Optional<String> getDisplayName() {
        return displayName;
    }

    public void setDisplayName(Optional<String> displayName) {
        this.displayName = displayName;
    }

    public SecretScanningPatternOverride alertTotal(Long alertTotal) {
        this.alertTotal = Optional.ofNullable(alertTotal);
        return this;
    }

    /**
     * The total number of alerts generated by this pattern.
     * @return alertTotal
     */
    @Schema(
            name = "alert_total",
            description = "The total number of alerts generated by this pattern.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("alert_total")
    public Optional<Long> getAlertTotal() {
        return alertTotal;
    }

    public void setAlertTotal(Optional<Long> alertTotal) {
        this.alertTotal = alertTotal;
    }

    public SecretScanningPatternOverride alertTotalPercentage(Long alertTotalPercentage) {
        this.alertTotalPercentage = Optional.ofNullable(alertTotalPercentage);
        return this;
    }

    /**
     * The percentage of all alerts that this pattern represents, rounded to the nearest integer.
     * @return alertTotalPercentage
     */
    @Schema(
            name = "alert_total_percentage",
            description = "The percentage of all alerts that this pattern represents, rounded to the nearest integer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("alert_total_percentage")
    public Optional<Long> getAlertTotalPercentage() {
        return alertTotalPercentage;
    }

    public void setAlertTotalPercentage(Optional<Long> alertTotalPercentage) {
        this.alertTotalPercentage = alertTotalPercentage;
    }

    public SecretScanningPatternOverride falsePositives(Long falsePositives) {
        this.falsePositives = Optional.ofNullable(falsePositives);
        return this;
    }

    /**
     * The number of false positive alerts generated by this pattern.
     * @return falsePositives
     */
    @Schema(
            name = "false_positives",
            description = "The number of false positive alerts generated by this pattern.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("false_positives")
    public Optional<Long> getFalsePositives() {
        return falsePositives;
    }

    public void setFalsePositives(Optional<Long> falsePositives) {
        this.falsePositives = falsePositives;
    }

    public SecretScanningPatternOverride falsePositiveRate(Long falsePositiveRate) {
        this.falsePositiveRate = Optional.ofNullable(falsePositiveRate);
        return this;
    }

    /**
     * The percentage of alerts from this pattern that are false positives, rounded to the nearest integer.
     * @return falsePositiveRate
     */
    @Schema(
            name = "false_positive_rate",
            description =
                    "The percentage of alerts from this pattern that are false positives, rounded to the nearest integer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("false_positive_rate")
    public Optional<Long> getFalsePositiveRate() {
        return falsePositiveRate;
    }

    public void setFalsePositiveRate(Optional<Long> falsePositiveRate) {
        this.falsePositiveRate = falsePositiveRate;
    }

    public SecretScanningPatternOverride bypassRate(Long bypassRate) {
        this.bypassRate = Optional.ofNullable(bypassRate);
        return this;
    }

    /**
     * The percentage of blocks for this pattern that were bypassed, rounded to the nearest integer.
     * @return bypassRate
     */
    @Schema(
            name = "bypass_rate",
            description =
                    "The percentage of blocks for this pattern that were bypassed, rounded to the nearest integer.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bypass_rate")
    public Optional<Long> getBypassRate() {
        return bypassRate;
    }

    public void setBypassRate(Optional<Long> bypassRate) {
        this.bypassRate = bypassRate;
    }

    public SecretScanningPatternOverride defaultSetting(DefaultSettingEnum defaultSetting) {
        this.defaultSetting = Optional.ofNullable(defaultSetting);
        return this;
    }

    /**
     * The default push protection setting for this pattern.
     * @return defaultSetting
     */
    @Schema(
            name = "default_setting",
            description = "The default push protection setting for this pattern.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default_setting")
    public Optional<DefaultSettingEnum> getDefaultSetting() {
        return defaultSetting;
    }

    public void setDefaultSetting(Optional<DefaultSettingEnum> defaultSetting) {
        this.defaultSetting = defaultSetting;
    }

    public SecretScanningPatternOverride enterpriseSetting(EnterpriseSettingEnum enterpriseSetting) {
        this.enterpriseSetting = JsonNullable.of(enterpriseSetting);
        return this;
    }

    /**
     * The push protection setting for this pattern set at the enterprise level. Only present for partner patterns when the organization has a parent enterprise.
     * @return enterpriseSetting
     */
    @Schema(
            name = "enterprise_setting",
            description =
                    "The push protection setting for this pattern set at the enterprise level. Only present for partner patterns when the organization has a parent enterprise.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise_setting")
    public JsonNullable<EnterpriseSettingEnum> getEnterpriseSetting() {
        return enterpriseSetting;
    }

    public void setEnterpriseSetting(JsonNullable<EnterpriseSettingEnum> enterpriseSetting) {
        this.enterpriseSetting = enterpriseSetting;
    }

    public SecretScanningPatternOverride setting(SettingEnum setting) {
        this.setting = Optional.ofNullable(setting);
        return this;
    }

    /**
     * The current push protection setting for this pattern. If this is `not-set`, then it inherits either the enterprise setting if it exists or the default setting.
     * @return setting
     */
    @Schema(
            name = "setting",
            description =
                    "The current push protection setting for this pattern. If this is `not-set`, then it inherits either the enterprise setting if it exists or the default setting.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("setting")
    public Optional<SettingEnum> getSetting() {
        return setting;
    }

    public void setSetting(Optional<SettingEnum> setting) {
        this.setting = setting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningPatternOverride secretScanningPatternOverride = (SecretScanningPatternOverride) o;
        return Objects.equals(this.tokenType, secretScanningPatternOverride.tokenType)
                && equalsNullable(this.customPatternVersion, secretScanningPatternOverride.customPatternVersion)
                && Objects.equals(this.slug, secretScanningPatternOverride.slug)
                && Objects.equals(this.displayName, secretScanningPatternOverride.displayName)
                && Objects.equals(this.alertTotal, secretScanningPatternOverride.alertTotal)
                && Objects.equals(this.alertTotalPercentage, secretScanningPatternOverride.alertTotalPercentage)
                && Objects.equals(this.falsePositives, secretScanningPatternOverride.falsePositives)
                && Objects.equals(this.falsePositiveRate, secretScanningPatternOverride.falsePositiveRate)
                && Objects.equals(this.bypassRate, secretScanningPatternOverride.bypassRate)
                && Objects.equals(this.defaultSetting, secretScanningPatternOverride.defaultSetting)
                && equalsNullable(this.enterpriseSetting, secretScanningPatternOverride.enterpriseSetting)
                && Objects.equals(this.setting, secretScanningPatternOverride.setting);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                tokenType,
                hashCodeNullable(customPatternVersion),
                slug,
                displayName,
                alertTotal,
                alertTotalPercentage,
                falsePositives,
                falsePositiveRate,
                bypassRate,
                defaultSetting,
                hashCodeNullable(enterpriseSetting),
                setting);
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
        sb.append("class SecretScanningPatternOverride {\n");
        sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
        sb.append("    customPatternVersion: ")
                .append(toIndentedString(customPatternVersion))
                .append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    alertTotal: ").append(toIndentedString(alertTotal)).append("\n");
        sb.append("    alertTotalPercentage: ")
                .append(toIndentedString(alertTotalPercentage))
                .append("\n");
        sb.append("    falsePositives: ")
                .append(toIndentedString(falsePositives))
                .append("\n");
        sb.append("    falsePositiveRate: ")
                .append(toIndentedString(falsePositiveRate))
                .append("\n");
        sb.append("    bypassRate: ").append(toIndentedString(bypassRate)).append("\n");
        sb.append("    defaultSetting: ")
                .append(toIndentedString(defaultSetting))
                .append("\n");
        sb.append("    enterpriseSetting: ")
                .append(toIndentedString(enterpriseSetting))
                .append("\n");
        sb.append("    setting: ").append(toIndentedString(setting)).append("\n");
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
