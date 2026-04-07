package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A tool that must provide code scanning results for this rule to pass.
 */
@Schema(
        name = "repository-rule-params-code-scanning-tool",
        description = "A tool that must provide code scanning results for this rule to pass.")
@JsonTypeName("repository-rule-params-code-scanning-tool")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleParamsCodeScanningTool {

    /**
     * The severity level at which code scanning results that raise alerts block a reference update. For more information on alert severity levels, see \"[About code scanning alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels).\"
     */
    public enum AlertsThresholdEnum {
        NONE("none"),

        ERRORS("errors"),

        ERRORS_AND_WARNINGS("errors_and_warnings"),

        ALL("all");

        private final String value;

        AlertsThresholdEnum(String value) {
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
        public static AlertsThresholdEnum fromValue(String value) {
            for (AlertsThresholdEnum b : AlertsThresholdEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private AlertsThresholdEnum alertsThreshold;

    /**
     * The severity level at which code scanning results that raise security alerts block a reference update. For more information on security severity levels, see \"[About code scanning alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels).\"
     */
    public enum SecurityAlertsThresholdEnum {
        NONE("none"),

        CRITICAL("critical"),

        HIGH_OR_HIGHER("high_or_higher"),

        MEDIUM_OR_HIGHER("medium_or_higher"),

        ALL("all");

        private final String value;

        SecurityAlertsThresholdEnum(String value) {
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
        public static SecurityAlertsThresholdEnum fromValue(String value) {
            for (SecurityAlertsThresholdEnum b : SecurityAlertsThresholdEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SecurityAlertsThresholdEnum securityAlertsThreshold;

    private String tool;

    public RepositoryRuleParamsCodeScanningTool() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleParamsCodeScanningTool(
            AlertsThresholdEnum alertsThreshold, SecurityAlertsThresholdEnum securityAlertsThreshold, String tool) {
        this.alertsThreshold = alertsThreshold;
        this.securityAlertsThreshold = securityAlertsThreshold;
        this.tool = tool;
    }

    public RepositoryRuleParamsCodeScanningTool alertsThreshold(AlertsThresholdEnum alertsThreshold) {
        this.alertsThreshold = alertsThreshold;
        return this;
    }

    /**
     * The severity level at which code scanning results that raise alerts block a reference update. For more information on alert severity levels, see \"[About code scanning alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels).\"
     * @return alertsThreshold
     */
    @NotNull
    @Schema(
            name = "alerts_threshold",
            description =
                    "The severity level at which code scanning results that raise alerts block a reference update. For more information on alert severity levels, see \"[About code scanning alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels).\"",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("alerts_threshold")
    public AlertsThresholdEnum getAlertsThreshold() {
        return alertsThreshold;
    }

    public void setAlertsThreshold(AlertsThresholdEnum alertsThreshold) {
        this.alertsThreshold = alertsThreshold;
    }

    public RepositoryRuleParamsCodeScanningTool securityAlertsThreshold(
            SecurityAlertsThresholdEnum securityAlertsThreshold) {
        this.securityAlertsThreshold = securityAlertsThreshold;
        return this;
    }

    /**
     * The severity level at which code scanning results that raise security alerts block a reference update. For more information on security severity levels, see \"[About code scanning alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels).\"
     * @return securityAlertsThreshold
     */
    @NotNull
    @Schema(
            name = "security_alerts_threshold",
            description =
                    "The severity level at which code scanning results that raise security alerts block a reference update. For more information on security severity levels, see \"[About code scanning alerts](https://docs.github.com/code-security/code-scanning/managing-code-scanning-alerts/about-code-scanning-alerts#about-alert-severity-and-security-severity-levels).\"",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("security_alerts_threshold")
    public SecurityAlertsThresholdEnum getSecurityAlertsThreshold() {
        return securityAlertsThreshold;
    }

    public void setSecurityAlertsThreshold(SecurityAlertsThresholdEnum securityAlertsThreshold) {
        this.securityAlertsThreshold = securityAlertsThreshold;
    }

    public RepositoryRuleParamsCodeScanningTool tool(String tool) {
        this.tool = tool;
        return this;
    }

    /**
     * The name of a code scanning tool
     * @return tool
     */
    @NotNull
    @Schema(
            name = "tool",
            description = "The name of a code scanning tool",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tool")
    public String getTool() {
        return tool;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleParamsCodeScanningTool repositoryRuleParamsCodeScanningTool =
                (RepositoryRuleParamsCodeScanningTool) o;
        return Objects.equals(this.alertsThreshold, repositoryRuleParamsCodeScanningTool.alertsThreshold)
                && Objects.equals(
                        this.securityAlertsThreshold, repositoryRuleParamsCodeScanningTool.securityAlertsThreshold)
                && Objects.equals(this.tool, repositoryRuleParamsCodeScanningTool.tool);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertsThreshold, securityAlertsThreshold, tool);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleParamsCodeScanningTool {\n");
        sb.append("    alertsThreshold: ")
                .append(toIndentedString(alertsThreshold))
                .append("\n");
        sb.append("    securityAlertsThreshold: ")
                .append(toIndentedString(securityAlertsThreshold))
                .append("\n");
        sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
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
