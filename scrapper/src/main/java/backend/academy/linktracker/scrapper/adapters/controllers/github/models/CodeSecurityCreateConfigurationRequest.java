package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CodeSecurityCreateConfigurationRequest
 */
@JsonTypeName("code_security_create_configuration_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityCreateConfigurationRequest {

    private String name;

    private String description;

    /**
     * The enablement status of GitHub Advanced Security features. `enabled` will enable both Code Security and Secret Protection features.  > [!WARNING] > `code_security` and `secret_protection` are deprecated values for this field. Prefer the individual `code_security` and `secret_protection` fields to set the status of these features.
     */
    public enum AdvancedSecurityEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        CODE_SECURITY("code_security"),

        SECRET_PROTECTION("secret_protection");

        private final String value;

        AdvancedSecurityEnum(String value) {
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
        public static AdvancedSecurityEnum fromValue(String value) {
            for (AdvancedSecurityEnum b : AdvancedSecurityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<AdvancedSecurityEnum> advancedSecurity = Optional.of(AdvancedSecurityEnum.DISABLED);

    /**
     * The enablement status of GitHub Code Security features.
     */
    public enum CodeSecurityEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        CodeSecurityEnum(String value) {
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
        public static CodeSecurityEnum fromValue(String value) {
            for (CodeSecurityEnum b : CodeSecurityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<CodeSecurityEnum> codeSecurity = Optional.empty();

    /**
     * The enablement status of Dependency Graph
     */
    public enum DependencyGraphEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        DependencyGraphEnum(String value) {
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
        public static DependencyGraphEnum fromValue(String value) {
            for (DependencyGraphEnum b : DependencyGraphEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DependencyGraphEnum> dependencyGraph = Optional.of(DependencyGraphEnum.ENABLED);

    /**
     * The enablement status of Automatic dependency submission
     */
    public enum DependencyGraphAutosubmitActionEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        DependencyGraphAutosubmitActionEnum(String value) {
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
        public static DependencyGraphAutosubmitActionEnum fromValue(String value) {
            for (DependencyGraphAutosubmitActionEnum b : DependencyGraphAutosubmitActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DependencyGraphAutosubmitActionEnum> dependencyGraphAutosubmitAction =
            Optional.of(DependencyGraphAutosubmitActionEnum.DISABLED);

    private Optional<CodeSecurityCreateConfigurationForEnterpriseRequestDependencyGraphAutosubmitActionOptions>
            dependencyGraphAutosubmitActionOptions = Optional.empty();

    /**
     * The enablement status of Dependabot alerts
     */
    public enum DependabotAlertsEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        DependabotAlertsEnum(String value) {
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
        public static DependabotAlertsEnum fromValue(String value) {
            for (DependabotAlertsEnum b : DependabotAlertsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DependabotAlertsEnum> dependabotAlerts = Optional.of(DependabotAlertsEnum.DISABLED);

    /**
     * The enablement status of Dependabot security updates
     */
    public enum DependabotSecurityUpdatesEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        DependabotSecurityUpdatesEnum(String value) {
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
        public static DependabotSecurityUpdatesEnum fromValue(String value) {
            for (DependabotSecurityUpdatesEnum b : DependabotSecurityUpdatesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DependabotSecurityUpdatesEnum> dependabotSecurityUpdates =
            Optional.of(DependabotSecurityUpdatesEnum.DISABLED);

    /**
     * The enablement status of Dependabot delegated alert dismissal. Requires Dependabot alerts to be enabled.
     */
    public enum DependabotDelegatedAlertDismissalEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        DependabotDelegatedAlertDismissalEnum(String value) {
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
        public static DependabotDelegatedAlertDismissalEnum fromValue(String value) {
            for (DependabotDelegatedAlertDismissalEnum b : DependabotDelegatedAlertDismissalEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DependabotDelegatedAlertDismissalEnum> dependabotDelegatedAlertDismissal =
            Optional.of(DependabotDelegatedAlertDismissalEnum.DISABLED);

    private JsonNullable<CodeScanningOptions> codeScanningOptions = JsonNullable.<CodeScanningOptions>undefined();

    /**
     * The enablement status of code scanning default setup
     */
    public enum CodeScanningDefaultSetupEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        CodeScanningDefaultSetupEnum(String value) {
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
        public static CodeScanningDefaultSetupEnum fromValue(String value) {
            for (CodeScanningDefaultSetupEnum b : CodeScanningDefaultSetupEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<CodeScanningDefaultSetupEnum> codeScanningDefaultSetup =
            Optional.of(CodeScanningDefaultSetupEnum.DISABLED);

    private JsonNullable<CodeScanningDefaultSetupOptions> codeScanningDefaultSetupOptions =
            JsonNullable.<CodeScanningDefaultSetupOptions>undefined();

    /**
     * The enablement status of code scanning delegated alert dismissal
     */
    public enum CodeScanningDelegatedAlertDismissalEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        CodeScanningDelegatedAlertDismissalEnum(String value) {
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
        public static CodeScanningDelegatedAlertDismissalEnum fromValue(String value) {
            for (CodeScanningDelegatedAlertDismissalEnum b : CodeScanningDelegatedAlertDismissalEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<CodeScanningDelegatedAlertDismissalEnum> codeScanningDelegatedAlertDismissal =
            Optional.of(CodeScanningDelegatedAlertDismissalEnum.NOT_SET);

    /**
     * The enablement status of GitHub Secret Protection features.
     */
    public enum SecretProtectionEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        SecretProtectionEnum(String value) {
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
        public static SecretProtectionEnum fromValue(String value) {
            for (SecretProtectionEnum b : SecretProtectionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretProtectionEnum> secretProtection = Optional.empty();

    /**
     * The enablement status of secret scanning
     */
    public enum SecretScanningEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        SecretScanningEnum(String value) {
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
        public static SecretScanningEnum fromValue(String value) {
            for (SecretScanningEnum b : SecretScanningEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretScanningEnum> secretScanning = Optional.of(SecretScanningEnum.DISABLED);

    /**
     * The enablement status of secret scanning push protection
     */
    public enum SecretScanningPushProtectionEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        SecretScanningPushProtectionEnum(String value) {
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
        public static SecretScanningPushProtectionEnum fromValue(String value) {
            for (SecretScanningPushProtectionEnum b : SecretScanningPushProtectionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretScanningPushProtectionEnum> secretScanningPushProtection =
            Optional.of(SecretScanningPushProtectionEnum.DISABLED);

    /**
     * The enablement status of secret scanning delegated bypass
     */
    public enum SecretScanningDelegatedBypassEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        SecretScanningDelegatedBypassEnum(String value) {
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
        public static SecretScanningDelegatedBypassEnum fromValue(String value) {
            for (SecretScanningDelegatedBypassEnum b : SecretScanningDelegatedBypassEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretScanningDelegatedBypassEnum> secretScanningDelegatedBypass =
            Optional.of(SecretScanningDelegatedBypassEnum.DISABLED);

    private Optional<CodeSecurityCreateConfigurationRequestSecretScanningDelegatedBypassOptions>
            secretScanningDelegatedBypassOptions = Optional.empty();

    /**
     * The enablement status of secret scanning validity checks
     */
    public enum SecretScanningValidityChecksEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        SecretScanningValidityChecksEnum(String value) {
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
        public static SecretScanningValidityChecksEnum fromValue(String value) {
            for (SecretScanningValidityChecksEnum b : SecretScanningValidityChecksEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretScanningValidityChecksEnum> secretScanningValidityChecks =
            Optional.of(SecretScanningValidityChecksEnum.DISABLED);

    /**
     * The enablement status of secret scanning non provider patterns
     */
    public enum SecretScanningNonProviderPatternsEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        SecretScanningNonProviderPatternsEnum(String value) {
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
        public static SecretScanningNonProviderPatternsEnum fromValue(String value) {
            for (SecretScanningNonProviderPatternsEnum b : SecretScanningNonProviderPatternsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretScanningNonProviderPatternsEnum> secretScanningNonProviderPatterns =
            Optional.of(SecretScanningNonProviderPatternsEnum.DISABLED);

    /**
     * The enablement status of Copilot secret scanning
     */
    public enum SecretScanningGenericSecretsEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        SecretScanningGenericSecretsEnum(String value) {
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
        public static SecretScanningGenericSecretsEnum fromValue(String value) {
            for (SecretScanningGenericSecretsEnum b : SecretScanningGenericSecretsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretScanningGenericSecretsEnum> secretScanningGenericSecrets =
            Optional.of(SecretScanningGenericSecretsEnum.DISABLED);

    /**
     * The enablement status of secret scanning delegated alert dismissal
     */
    public enum SecretScanningDelegatedAlertDismissalEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        SecretScanningDelegatedAlertDismissalEnum(String value) {
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
        public static SecretScanningDelegatedAlertDismissalEnum fromValue(String value) {
            for (SecretScanningDelegatedAlertDismissalEnum b : SecretScanningDelegatedAlertDismissalEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretScanningDelegatedAlertDismissalEnum> secretScanningDelegatedAlertDismissal =
            Optional.empty();

    /**
     * The enablement status of secret scanning extended metadata
     */
    public enum SecretScanningExtendedMetadataEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        SecretScanningExtendedMetadataEnum(String value) {
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
        public static SecretScanningExtendedMetadataEnum fromValue(String value) {
            for (SecretScanningExtendedMetadataEnum b : SecretScanningExtendedMetadataEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretScanningExtendedMetadataEnum> secretScanningExtendedMetadata = Optional.empty();

    /**
     * The enablement status of private vulnerability reporting
     */
    public enum PrivateVulnerabilityReportingEnum {
        ENABLED("enabled"),

        DISABLED("disabled"),

        NOT_SET("not_set");

        private final String value;

        PrivateVulnerabilityReportingEnum(String value) {
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
        public static PrivateVulnerabilityReportingEnum fromValue(String value) {
            for (PrivateVulnerabilityReportingEnum b : PrivateVulnerabilityReportingEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<PrivateVulnerabilityReportingEnum> privateVulnerabilityReporting =
            Optional.of(PrivateVulnerabilityReportingEnum.DISABLED);

    /**
     * The enforcement status for a security configuration
     */
    public enum EnforcementEnum {
        ENFORCED("enforced"),

        UNENFORCED("unenforced");

        private final String value;

        EnforcementEnum(String value) {
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
        public static EnforcementEnum fromValue(String value) {
            for (EnforcementEnum b : EnforcementEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<EnforcementEnum> enforcement = Optional.of(EnforcementEnum.ENFORCED);

    public CodeSecurityCreateConfigurationRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeSecurityCreateConfigurationRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CodeSecurityCreateConfigurationRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the code security configuration. Must be unique within the organization.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description = "The name of the code security configuration. Must be unique within the organization.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodeSecurityCreateConfigurationRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description of the code security configuration
     * @return description
     */
    @NotNull
    @Size(max = 255)
    @Schema(
            name = "description",
            description = "A description of the code security configuration",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CodeSecurityCreateConfigurationRequest advancedSecurity(AdvancedSecurityEnum advancedSecurity) {
        this.advancedSecurity = Optional.ofNullable(advancedSecurity);
        return this;
    }

    /**
     * The enablement status of GitHub Advanced Security features. `enabled` will enable both Code Security and Secret Protection features.  > [!WARNING] > `code_security` and `secret_protection` are deprecated values for this field. Prefer the individual `code_security` and `secret_protection` fields to set the status of these features.
     * @return advancedSecurity
     */
    @Schema(
            name = "advanced_security",
            description =
                    "The enablement status of GitHub Advanced Security features. `enabled` will enable both Code Security and Secret Protection features.  > [!WARNING] > `code_security` and `secret_protection` are deprecated values for this field. Prefer the individual `code_security` and `secret_protection` fields to set the status of these features. ",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("advanced_security")
    public Optional<AdvancedSecurityEnum> getAdvancedSecurity() {
        return advancedSecurity;
    }

    public void setAdvancedSecurity(Optional<AdvancedSecurityEnum> advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
    }

    public CodeSecurityCreateConfigurationRequest codeSecurity(CodeSecurityEnum codeSecurity) {
        this.codeSecurity = Optional.ofNullable(codeSecurity);
        return this;
    }

    /**
     * The enablement status of GitHub Code Security features.
     * @return codeSecurity
     */
    @Schema(
            name = "code_security",
            description = "The enablement status of GitHub Code Security features.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_security")
    public Optional<CodeSecurityEnum> getCodeSecurity() {
        return codeSecurity;
    }

    public void setCodeSecurity(Optional<CodeSecurityEnum> codeSecurity) {
        this.codeSecurity = codeSecurity;
    }

    public CodeSecurityCreateConfigurationRequest dependencyGraph(DependencyGraphEnum dependencyGraph) {
        this.dependencyGraph = Optional.ofNullable(dependencyGraph);
        return this;
    }

    /**
     * The enablement status of Dependency Graph
     * @return dependencyGraph
     */
    @Schema(
            name = "dependency_graph",
            description = "The enablement status of Dependency Graph",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependency_graph")
    public Optional<DependencyGraphEnum> getDependencyGraph() {
        return dependencyGraph;
    }

    public void setDependencyGraph(Optional<DependencyGraphEnum> dependencyGraph) {
        this.dependencyGraph = dependencyGraph;
    }

    public CodeSecurityCreateConfigurationRequest dependencyGraphAutosubmitAction(
            DependencyGraphAutosubmitActionEnum dependencyGraphAutosubmitAction) {
        this.dependencyGraphAutosubmitAction = Optional.ofNullable(dependencyGraphAutosubmitAction);
        return this;
    }

    /**
     * The enablement status of Automatic dependency submission
     * @return dependencyGraphAutosubmitAction
     */
    @Schema(
            name = "dependency_graph_autosubmit_action",
            description = "The enablement status of Automatic dependency submission",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependency_graph_autosubmit_action")
    public Optional<DependencyGraphAutosubmitActionEnum> getDependencyGraphAutosubmitAction() {
        return dependencyGraphAutosubmitAction;
    }

    public void setDependencyGraphAutosubmitAction(
            Optional<DependencyGraphAutosubmitActionEnum> dependencyGraphAutosubmitAction) {
        this.dependencyGraphAutosubmitAction = dependencyGraphAutosubmitAction;
    }

    public CodeSecurityCreateConfigurationRequest dependencyGraphAutosubmitActionOptions(
            CodeSecurityCreateConfigurationForEnterpriseRequestDependencyGraphAutosubmitActionOptions
                    dependencyGraphAutosubmitActionOptions) {
        this.dependencyGraphAutosubmitActionOptions = Optional.ofNullable(dependencyGraphAutosubmitActionOptions);
        return this;
    }

    /**
     * Get dependencyGraphAutosubmitActionOptions
     * @return dependencyGraphAutosubmitActionOptions
     */
    @Valid
    @Schema(name = "dependency_graph_autosubmit_action_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependency_graph_autosubmit_action_options")
    public Optional<CodeSecurityCreateConfigurationForEnterpriseRequestDependencyGraphAutosubmitActionOptions>
            getDependencyGraphAutosubmitActionOptions() {
        return dependencyGraphAutosubmitActionOptions;
    }

    public void setDependencyGraphAutosubmitActionOptions(
            Optional<CodeSecurityCreateConfigurationForEnterpriseRequestDependencyGraphAutosubmitActionOptions>
                    dependencyGraphAutosubmitActionOptions) {
        this.dependencyGraphAutosubmitActionOptions = dependencyGraphAutosubmitActionOptions;
    }

    public CodeSecurityCreateConfigurationRequest dependabotAlerts(DependabotAlertsEnum dependabotAlerts) {
        this.dependabotAlerts = Optional.ofNullable(dependabotAlerts);
        return this;
    }

    /**
     * The enablement status of Dependabot alerts
     * @return dependabotAlerts
     */
    @Schema(
            name = "dependabot_alerts",
            description = "The enablement status of Dependabot alerts",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot_alerts")
    public Optional<DependabotAlertsEnum> getDependabotAlerts() {
        return dependabotAlerts;
    }

    public void setDependabotAlerts(Optional<DependabotAlertsEnum> dependabotAlerts) {
        this.dependabotAlerts = dependabotAlerts;
    }

    public CodeSecurityCreateConfigurationRequest dependabotSecurityUpdates(
            DependabotSecurityUpdatesEnum dependabotSecurityUpdates) {
        this.dependabotSecurityUpdates = Optional.ofNullable(dependabotSecurityUpdates);
        return this;
    }

    /**
     * The enablement status of Dependabot security updates
     * @return dependabotSecurityUpdates
     */
    @Schema(
            name = "dependabot_security_updates",
            description = "The enablement status of Dependabot security updates",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot_security_updates")
    public Optional<DependabotSecurityUpdatesEnum> getDependabotSecurityUpdates() {
        return dependabotSecurityUpdates;
    }

    public void setDependabotSecurityUpdates(Optional<DependabotSecurityUpdatesEnum> dependabotSecurityUpdates) {
        this.dependabotSecurityUpdates = dependabotSecurityUpdates;
    }

    public CodeSecurityCreateConfigurationRequest dependabotDelegatedAlertDismissal(
            DependabotDelegatedAlertDismissalEnum dependabotDelegatedAlertDismissal) {
        this.dependabotDelegatedAlertDismissal = Optional.ofNullable(dependabotDelegatedAlertDismissal);
        return this;
    }

    /**
     * The enablement status of Dependabot delegated alert dismissal. Requires Dependabot alerts to be enabled.
     * @return dependabotDelegatedAlertDismissal
     */
    @Schema(
            name = "dependabot_delegated_alert_dismissal",
            description =
                    "The enablement status of Dependabot delegated alert dismissal. Requires Dependabot alerts to be enabled.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot_delegated_alert_dismissal")
    public Optional<DependabotDelegatedAlertDismissalEnum> getDependabotDelegatedAlertDismissal() {
        return dependabotDelegatedAlertDismissal;
    }

    public void setDependabotDelegatedAlertDismissal(
            Optional<DependabotDelegatedAlertDismissalEnum> dependabotDelegatedAlertDismissal) {
        this.dependabotDelegatedAlertDismissal = dependabotDelegatedAlertDismissal;
    }

    public CodeSecurityCreateConfigurationRequest codeScanningOptions(CodeScanningOptions codeScanningOptions) {
        this.codeScanningOptions = JsonNullable.of(codeScanningOptions);
        return this;
    }

    /**
     * Get codeScanningOptions
     * @return codeScanningOptions
     */
    @Valid
    @Schema(name = "code_scanning_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_scanning_options")
    public JsonNullable<CodeScanningOptions> getCodeScanningOptions() {
        return codeScanningOptions;
    }

    public void setCodeScanningOptions(JsonNullable<CodeScanningOptions> codeScanningOptions) {
        this.codeScanningOptions = codeScanningOptions;
    }

    public CodeSecurityCreateConfigurationRequest codeScanningDefaultSetup(
            CodeScanningDefaultSetupEnum codeScanningDefaultSetup) {
        this.codeScanningDefaultSetup = Optional.ofNullable(codeScanningDefaultSetup);
        return this;
    }

    /**
     * The enablement status of code scanning default setup
     * @return codeScanningDefaultSetup
     */
    @Schema(
            name = "code_scanning_default_setup",
            description = "The enablement status of code scanning default setup",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_scanning_default_setup")
    public Optional<CodeScanningDefaultSetupEnum> getCodeScanningDefaultSetup() {
        return codeScanningDefaultSetup;
    }

    public void setCodeScanningDefaultSetup(Optional<CodeScanningDefaultSetupEnum> codeScanningDefaultSetup) {
        this.codeScanningDefaultSetup = codeScanningDefaultSetup;
    }

    public CodeSecurityCreateConfigurationRequest codeScanningDefaultSetupOptions(
            CodeScanningDefaultSetupOptions codeScanningDefaultSetupOptions) {
        this.codeScanningDefaultSetupOptions = JsonNullable.of(codeScanningDefaultSetupOptions);
        return this;
    }

    /**
     * Get codeScanningDefaultSetupOptions
     * @return codeScanningDefaultSetupOptions
     */
    @Valid
    @Schema(name = "code_scanning_default_setup_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_scanning_default_setup_options")
    public JsonNullable<CodeScanningDefaultSetupOptions> getCodeScanningDefaultSetupOptions() {
        return codeScanningDefaultSetupOptions;
    }

    public void setCodeScanningDefaultSetupOptions(
            JsonNullable<CodeScanningDefaultSetupOptions> codeScanningDefaultSetupOptions) {
        this.codeScanningDefaultSetupOptions = codeScanningDefaultSetupOptions;
    }

    public CodeSecurityCreateConfigurationRequest codeScanningDelegatedAlertDismissal(
            CodeScanningDelegatedAlertDismissalEnum codeScanningDelegatedAlertDismissal) {
        this.codeScanningDelegatedAlertDismissal = Optional.ofNullable(codeScanningDelegatedAlertDismissal);
        return this;
    }

    /**
     * The enablement status of code scanning delegated alert dismissal
     * @return codeScanningDelegatedAlertDismissal
     */
    @Schema(
            name = "code_scanning_delegated_alert_dismissal",
            description = "The enablement status of code scanning delegated alert dismissal",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_scanning_delegated_alert_dismissal")
    public Optional<CodeScanningDelegatedAlertDismissalEnum> getCodeScanningDelegatedAlertDismissal() {
        return codeScanningDelegatedAlertDismissal;
    }

    public void setCodeScanningDelegatedAlertDismissal(
            Optional<CodeScanningDelegatedAlertDismissalEnum> codeScanningDelegatedAlertDismissal) {
        this.codeScanningDelegatedAlertDismissal = codeScanningDelegatedAlertDismissal;
    }

    public CodeSecurityCreateConfigurationRequest secretProtection(SecretProtectionEnum secretProtection) {
        this.secretProtection = Optional.ofNullable(secretProtection);
        return this;
    }

    /**
     * The enablement status of GitHub Secret Protection features.
     * @return secretProtection
     */
    @Schema(
            name = "secret_protection",
            description = "The enablement status of GitHub Secret Protection features.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_protection")
    public Optional<SecretProtectionEnum> getSecretProtection() {
        return secretProtection;
    }

    public void setSecretProtection(Optional<SecretProtectionEnum> secretProtection) {
        this.secretProtection = secretProtection;
    }

    public CodeSecurityCreateConfigurationRequest secretScanning(SecretScanningEnum secretScanning) {
        this.secretScanning = Optional.ofNullable(secretScanning);
        return this;
    }

    /**
     * The enablement status of secret scanning
     * @return secretScanning
     */
    @Schema(
            name = "secret_scanning",
            description = "The enablement status of secret scanning",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning")
    public Optional<SecretScanningEnum> getSecretScanning() {
        return secretScanning;
    }

    public void setSecretScanning(Optional<SecretScanningEnum> secretScanning) {
        this.secretScanning = secretScanning;
    }

    public CodeSecurityCreateConfigurationRequest secretScanningPushProtection(
            SecretScanningPushProtectionEnum secretScanningPushProtection) {
        this.secretScanningPushProtection = Optional.ofNullable(secretScanningPushProtection);
        return this;
    }

    /**
     * The enablement status of secret scanning push protection
     * @return secretScanningPushProtection
     */
    @Schema(
            name = "secret_scanning_push_protection",
            description = "The enablement status of secret scanning push protection",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_push_protection")
    public Optional<SecretScanningPushProtectionEnum> getSecretScanningPushProtection() {
        return secretScanningPushProtection;
    }

    public void setSecretScanningPushProtection(
            Optional<SecretScanningPushProtectionEnum> secretScanningPushProtection) {
        this.secretScanningPushProtection = secretScanningPushProtection;
    }

    public CodeSecurityCreateConfigurationRequest secretScanningDelegatedBypass(
            SecretScanningDelegatedBypassEnum secretScanningDelegatedBypass) {
        this.secretScanningDelegatedBypass = Optional.ofNullable(secretScanningDelegatedBypass);
        return this;
    }

    /**
     * The enablement status of secret scanning delegated bypass
     * @return secretScanningDelegatedBypass
     */
    @Schema(
            name = "secret_scanning_delegated_bypass",
            description = "The enablement status of secret scanning delegated bypass",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_bypass")
    public Optional<SecretScanningDelegatedBypassEnum> getSecretScanningDelegatedBypass() {
        return secretScanningDelegatedBypass;
    }

    public void setSecretScanningDelegatedBypass(
            Optional<SecretScanningDelegatedBypassEnum> secretScanningDelegatedBypass) {
        this.secretScanningDelegatedBypass = secretScanningDelegatedBypass;
    }

    public CodeSecurityCreateConfigurationRequest secretScanningDelegatedBypassOptions(
            CodeSecurityCreateConfigurationRequestSecretScanningDelegatedBypassOptions
                    secretScanningDelegatedBypassOptions) {
        this.secretScanningDelegatedBypassOptions = Optional.ofNullable(secretScanningDelegatedBypassOptions);
        return this;
    }

    /**
     * Get secretScanningDelegatedBypassOptions
     * @return secretScanningDelegatedBypassOptions
     */
    @Valid
    @Schema(name = "secret_scanning_delegated_bypass_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_bypass_options")
    public Optional<CodeSecurityCreateConfigurationRequestSecretScanningDelegatedBypassOptions>
            getSecretScanningDelegatedBypassOptions() {
        return secretScanningDelegatedBypassOptions;
    }

    public void setSecretScanningDelegatedBypassOptions(
            Optional<CodeSecurityCreateConfigurationRequestSecretScanningDelegatedBypassOptions>
                    secretScanningDelegatedBypassOptions) {
        this.secretScanningDelegatedBypassOptions = secretScanningDelegatedBypassOptions;
    }

    public CodeSecurityCreateConfigurationRequest secretScanningValidityChecks(
            SecretScanningValidityChecksEnum secretScanningValidityChecks) {
        this.secretScanningValidityChecks = Optional.ofNullable(secretScanningValidityChecks);
        return this;
    }

    /**
     * The enablement status of secret scanning validity checks
     * @return secretScanningValidityChecks
     */
    @Schema(
            name = "secret_scanning_validity_checks",
            description = "The enablement status of secret scanning validity checks",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_validity_checks")
    public Optional<SecretScanningValidityChecksEnum> getSecretScanningValidityChecks() {
        return secretScanningValidityChecks;
    }

    public void setSecretScanningValidityChecks(
            Optional<SecretScanningValidityChecksEnum> secretScanningValidityChecks) {
        this.secretScanningValidityChecks = secretScanningValidityChecks;
    }

    public CodeSecurityCreateConfigurationRequest secretScanningNonProviderPatterns(
            SecretScanningNonProviderPatternsEnum secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = Optional.ofNullable(secretScanningNonProviderPatterns);
        return this;
    }

    /**
     * The enablement status of secret scanning non provider patterns
     * @return secretScanningNonProviderPatterns
     */
    @Schema(
            name = "secret_scanning_non_provider_patterns",
            description = "The enablement status of secret scanning non provider patterns",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_non_provider_patterns")
    public Optional<SecretScanningNonProviderPatternsEnum> getSecretScanningNonProviderPatterns() {
        return secretScanningNonProviderPatterns;
    }

    public void setSecretScanningNonProviderPatterns(
            Optional<SecretScanningNonProviderPatternsEnum> secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
    }

    public CodeSecurityCreateConfigurationRequest secretScanningGenericSecrets(
            SecretScanningGenericSecretsEnum secretScanningGenericSecrets) {
        this.secretScanningGenericSecrets = Optional.ofNullable(secretScanningGenericSecrets);
        return this;
    }

    /**
     * The enablement status of Copilot secret scanning
     * @return secretScanningGenericSecrets
     */
    @Schema(
            name = "secret_scanning_generic_secrets",
            description = "The enablement status of Copilot secret scanning",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_generic_secrets")
    public Optional<SecretScanningGenericSecretsEnum> getSecretScanningGenericSecrets() {
        return secretScanningGenericSecrets;
    }

    public void setSecretScanningGenericSecrets(
            Optional<SecretScanningGenericSecretsEnum> secretScanningGenericSecrets) {
        this.secretScanningGenericSecrets = secretScanningGenericSecrets;
    }

    public CodeSecurityCreateConfigurationRequest secretScanningDelegatedAlertDismissal(
            SecretScanningDelegatedAlertDismissalEnum secretScanningDelegatedAlertDismissal) {
        this.secretScanningDelegatedAlertDismissal = Optional.ofNullable(secretScanningDelegatedAlertDismissal);
        return this;
    }

    /**
     * The enablement status of secret scanning delegated alert dismissal
     * @return secretScanningDelegatedAlertDismissal
     */
    @Schema(
            name = "secret_scanning_delegated_alert_dismissal",
            description = "The enablement status of secret scanning delegated alert dismissal",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_alert_dismissal")
    public Optional<SecretScanningDelegatedAlertDismissalEnum> getSecretScanningDelegatedAlertDismissal() {
        return secretScanningDelegatedAlertDismissal;
    }

    public void setSecretScanningDelegatedAlertDismissal(
            Optional<SecretScanningDelegatedAlertDismissalEnum> secretScanningDelegatedAlertDismissal) {
        this.secretScanningDelegatedAlertDismissal = secretScanningDelegatedAlertDismissal;
    }

    public CodeSecurityCreateConfigurationRequest secretScanningExtendedMetadata(
            SecretScanningExtendedMetadataEnum secretScanningExtendedMetadata) {
        this.secretScanningExtendedMetadata = Optional.ofNullable(secretScanningExtendedMetadata);
        return this;
    }

    /**
     * The enablement status of secret scanning extended metadata
     * @return secretScanningExtendedMetadata
     */
    @Schema(
            name = "secret_scanning_extended_metadata",
            description = "The enablement status of secret scanning extended metadata",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_extended_metadata")
    public Optional<SecretScanningExtendedMetadataEnum> getSecretScanningExtendedMetadata() {
        return secretScanningExtendedMetadata;
    }

    public void setSecretScanningExtendedMetadata(
            Optional<SecretScanningExtendedMetadataEnum> secretScanningExtendedMetadata) {
        this.secretScanningExtendedMetadata = secretScanningExtendedMetadata;
    }

    public CodeSecurityCreateConfigurationRequest privateVulnerabilityReporting(
            PrivateVulnerabilityReportingEnum privateVulnerabilityReporting) {
        this.privateVulnerabilityReporting = Optional.ofNullable(privateVulnerabilityReporting);
        return this;
    }

    /**
     * The enablement status of private vulnerability reporting
     * @return privateVulnerabilityReporting
     */
    @Schema(
            name = "private_vulnerability_reporting",
            description = "The enablement status of private vulnerability reporting",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private_vulnerability_reporting")
    public Optional<PrivateVulnerabilityReportingEnum> getPrivateVulnerabilityReporting() {
        return privateVulnerabilityReporting;
    }

    public void setPrivateVulnerabilityReporting(
            Optional<PrivateVulnerabilityReportingEnum> privateVulnerabilityReporting) {
        this.privateVulnerabilityReporting = privateVulnerabilityReporting;
    }

    public CodeSecurityCreateConfigurationRequest enforcement(EnforcementEnum enforcement) {
        this.enforcement = Optional.ofNullable(enforcement);
        return this;
    }

    /**
     * The enforcement status for a security configuration
     * @return enforcement
     */
    @Schema(
            name = "enforcement",
            description = "The enforcement status for a security configuration",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforcement")
    public Optional<EnforcementEnum> getEnforcement() {
        return enforcement;
    }

    public void setEnforcement(Optional<EnforcementEnum> enforcement) {
        this.enforcement = enforcement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityCreateConfigurationRequest codeSecurityCreateConfigurationRequest =
                (CodeSecurityCreateConfigurationRequest) o;
        return Objects.equals(this.name, codeSecurityCreateConfigurationRequest.name)
                && Objects.equals(this.description, codeSecurityCreateConfigurationRequest.description)
                && Objects.equals(this.advancedSecurity, codeSecurityCreateConfigurationRequest.advancedSecurity)
                && Objects.equals(this.codeSecurity, codeSecurityCreateConfigurationRequest.codeSecurity)
                && Objects.equals(this.dependencyGraph, codeSecurityCreateConfigurationRequest.dependencyGraph)
                && Objects.equals(
                        this.dependencyGraphAutosubmitAction,
                        codeSecurityCreateConfigurationRequest.dependencyGraphAutosubmitAction)
                && Objects.equals(
                        this.dependencyGraphAutosubmitActionOptions,
                        codeSecurityCreateConfigurationRequest.dependencyGraphAutosubmitActionOptions)
                && Objects.equals(this.dependabotAlerts, codeSecurityCreateConfigurationRequest.dependabotAlerts)
                && Objects.equals(
                        this.dependabotSecurityUpdates,
                        codeSecurityCreateConfigurationRequest.dependabotSecurityUpdates)
                && Objects.equals(
                        this.dependabotDelegatedAlertDismissal,
                        codeSecurityCreateConfigurationRequest.dependabotDelegatedAlertDismissal)
                && equalsNullable(this.codeScanningOptions, codeSecurityCreateConfigurationRequest.codeScanningOptions)
                && Objects.equals(
                        this.codeScanningDefaultSetup, codeSecurityCreateConfigurationRequest.codeScanningDefaultSetup)
                && equalsNullable(
                        this.codeScanningDefaultSetupOptions,
                        codeSecurityCreateConfigurationRequest.codeScanningDefaultSetupOptions)
                && Objects.equals(
                        this.codeScanningDelegatedAlertDismissal,
                        codeSecurityCreateConfigurationRequest.codeScanningDelegatedAlertDismissal)
                && Objects.equals(this.secretProtection, codeSecurityCreateConfigurationRequest.secretProtection)
                && Objects.equals(this.secretScanning, codeSecurityCreateConfigurationRequest.secretScanning)
                && Objects.equals(
                        this.secretScanningPushProtection,
                        codeSecurityCreateConfigurationRequest.secretScanningPushProtection)
                && Objects.equals(
                        this.secretScanningDelegatedBypass,
                        codeSecurityCreateConfigurationRequest.secretScanningDelegatedBypass)
                && Objects.equals(
                        this.secretScanningDelegatedBypassOptions,
                        codeSecurityCreateConfigurationRequest.secretScanningDelegatedBypassOptions)
                && Objects.equals(
                        this.secretScanningValidityChecks,
                        codeSecurityCreateConfigurationRequest.secretScanningValidityChecks)
                && Objects.equals(
                        this.secretScanningNonProviderPatterns,
                        codeSecurityCreateConfigurationRequest.secretScanningNonProviderPatterns)
                && Objects.equals(
                        this.secretScanningGenericSecrets,
                        codeSecurityCreateConfigurationRequest.secretScanningGenericSecrets)
                && Objects.equals(
                        this.secretScanningDelegatedAlertDismissal,
                        codeSecurityCreateConfigurationRequest.secretScanningDelegatedAlertDismissal)
                && Objects.equals(
                        this.secretScanningExtendedMetadata,
                        codeSecurityCreateConfigurationRequest.secretScanningExtendedMetadata)
                && Objects.equals(
                        this.privateVulnerabilityReporting,
                        codeSecurityCreateConfigurationRequest.privateVulnerabilityReporting)
                && Objects.equals(this.enforcement, codeSecurityCreateConfigurationRequest.enforcement);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                description,
                advancedSecurity,
                codeSecurity,
                dependencyGraph,
                dependencyGraphAutosubmitAction,
                dependencyGraphAutosubmitActionOptions,
                dependabotAlerts,
                dependabotSecurityUpdates,
                dependabotDelegatedAlertDismissal,
                hashCodeNullable(codeScanningOptions),
                codeScanningDefaultSetup,
                hashCodeNullable(codeScanningDefaultSetupOptions),
                codeScanningDelegatedAlertDismissal,
                secretProtection,
                secretScanning,
                secretScanningPushProtection,
                secretScanningDelegatedBypass,
                secretScanningDelegatedBypassOptions,
                secretScanningValidityChecks,
                secretScanningNonProviderPatterns,
                secretScanningGenericSecrets,
                secretScanningDelegatedAlertDismissal,
                secretScanningExtendedMetadata,
                privateVulnerabilityReporting,
                enforcement);
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
        sb.append("class CodeSecurityCreateConfigurationRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    advancedSecurity: ")
                .append(toIndentedString(advancedSecurity))
                .append("\n");
        sb.append("    codeSecurity: ").append(toIndentedString(codeSecurity)).append("\n");
        sb.append("    dependencyGraph: ")
                .append(toIndentedString(dependencyGraph))
                .append("\n");
        sb.append("    dependencyGraphAutosubmitAction: ")
                .append(toIndentedString(dependencyGraphAutosubmitAction))
                .append("\n");
        sb.append("    dependencyGraphAutosubmitActionOptions: ")
                .append(toIndentedString(dependencyGraphAutosubmitActionOptions))
                .append("\n");
        sb.append("    dependabotAlerts: ")
                .append(toIndentedString(dependabotAlerts))
                .append("\n");
        sb.append("    dependabotSecurityUpdates: ")
                .append(toIndentedString(dependabotSecurityUpdates))
                .append("\n");
        sb.append("    dependabotDelegatedAlertDismissal: ")
                .append(toIndentedString(dependabotDelegatedAlertDismissal))
                .append("\n");
        sb.append("    codeScanningOptions: ")
                .append(toIndentedString(codeScanningOptions))
                .append("\n");
        sb.append("    codeScanningDefaultSetup: ")
                .append(toIndentedString(codeScanningDefaultSetup))
                .append("\n");
        sb.append("    codeScanningDefaultSetupOptions: ")
                .append(toIndentedString(codeScanningDefaultSetupOptions))
                .append("\n");
        sb.append("    codeScanningDelegatedAlertDismissal: ")
                .append(toIndentedString(codeScanningDelegatedAlertDismissal))
                .append("\n");
        sb.append("    secretProtection: ")
                .append(toIndentedString(secretProtection))
                .append("\n");
        sb.append("    secretScanning: ")
                .append(toIndentedString(secretScanning))
                .append("\n");
        sb.append("    secretScanningPushProtection: ")
                .append(toIndentedString(secretScanningPushProtection))
                .append("\n");
        sb.append("    secretScanningDelegatedBypass: ")
                .append(toIndentedString(secretScanningDelegatedBypass))
                .append("\n");
        sb.append("    secretScanningDelegatedBypassOptions: ")
                .append(toIndentedString(secretScanningDelegatedBypassOptions))
                .append("\n");
        sb.append("    secretScanningValidityChecks: ")
                .append(toIndentedString(secretScanningValidityChecks))
                .append("\n");
        sb.append("    secretScanningNonProviderPatterns: ")
                .append(toIndentedString(secretScanningNonProviderPatterns))
                .append("\n");
        sb.append("    secretScanningGenericSecrets: ")
                .append(toIndentedString(secretScanningGenericSecrets))
                .append("\n");
        sb.append("    secretScanningDelegatedAlertDismissal: ")
                .append(toIndentedString(secretScanningDelegatedAlertDismissal))
                .append("\n");
        sb.append("    secretScanningExtendedMetadata: ")
                .append(toIndentedString(secretScanningExtendedMetadata))
                .append("\n");
        sb.append("    privateVulnerabilityReporting: ")
                .append(toIndentedString(privateVulnerabilityReporting))
                .append("\n");
        sb.append("    enforcement: ").append(toIndentedString(enforcement)).append("\n");
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
