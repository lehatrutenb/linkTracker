package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CodeSecurityCreateConfigurationForEnterpriseRequest
 */
@JsonTypeName("code_security_create_configuration_for_enterprise_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityCreateConfigurationForEnterpriseRequest {

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

    private AdvancedSecurityEnum advancedSecurity = AdvancedSecurityEnum.DISABLED;

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

    private CodeSecurityEnum codeSecurity;

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

    private DependencyGraphEnum dependencyGraph = DependencyGraphEnum.ENABLED;

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

    private DependencyGraphAutosubmitActionEnum dependencyGraphAutosubmitAction =
            DependencyGraphAutosubmitActionEnum.DISABLED;

    private CodeSecurityCreateConfigurationForEnterpriseRequestDependencyGraphAutosubmitActionOptions
            dependencyGraphAutosubmitActionOptions;

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

    private DependabotAlertsEnum dependabotAlerts = DependabotAlertsEnum.DISABLED;

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

    private DependabotSecurityUpdatesEnum dependabotSecurityUpdates = DependabotSecurityUpdatesEnum.DISABLED;

    private CodeScanningOptions codeScanningOptions = null;

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

    private CodeScanningDefaultSetupEnum codeScanningDefaultSetup = CodeScanningDefaultSetupEnum.DISABLED;

    private CodeScanningDefaultSetupOptions codeScanningDefaultSetupOptions = null;

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

    private CodeScanningDelegatedAlertDismissalEnum codeScanningDelegatedAlertDismissal =
            CodeScanningDelegatedAlertDismissalEnum.DISABLED;

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

    private SecretProtectionEnum secretProtection;

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

    private SecretScanningEnum secretScanning = SecretScanningEnum.DISABLED;

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

    private SecretScanningPushProtectionEnum secretScanningPushProtection = SecretScanningPushProtectionEnum.DISABLED;

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

    private SecretScanningValidityChecksEnum secretScanningValidityChecks = SecretScanningValidityChecksEnum.DISABLED;

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

    private SecretScanningNonProviderPatternsEnum secretScanningNonProviderPatterns =
            SecretScanningNonProviderPatternsEnum.DISABLED;

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

    private SecretScanningGenericSecretsEnum secretScanningGenericSecrets = SecretScanningGenericSecretsEnum.DISABLED;

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

    private SecretScanningDelegatedAlertDismissalEnum secretScanningDelegatedAlertDismissal =
            SecretScanningDelegatedAlertDismissalEnum.DISABLED;

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

    private SecretScanningExtendedMetadataEnum secretScanningExtendedMetadata =
            SecretScanningExtendedMetadataEnum.DISABLED;

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

    private PrivateVulnerabilityReportingEnum privateVulnerabilityReporting =
            PrivateVulnerabilityReportingEnum.DISABLED;

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

    private EnforcementEnum enforcement = EnforcementEnum.ENFORCED;

    public CodeSecurityCreateConfigurationForEnterpriseRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeSecurityCreateConfigurationForEnterpriseRequest(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the code security configuration. Must be unique within the enterprise.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description = "The name of the code security configuration. Must be unique within the enterprise.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest description(String description) {
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

    public CodeSecurityCreateConfigurationForEnterpriseRequest advancedSecurity(AdvancedSecurityEnum advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
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
    public AdvancedSecurityEnum getAdvancedSecurity() {
        return advancedSecurity;
    }

    public void setAdvancedSecurity(AdvancedSecurityEnum advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest codeSecurity(CodeSecurityEnum codeSecurity) {
        this.codeSecurity = codeSecurity;
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
    public CodeSecurityEnum getCodeSecurity() {
        return codeSecurity;
    }

    public void setCodeSecurity(CodeSecurityEnum codeSecurity) {
        this.codeSecurity = codeSecurity;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest dependencyGraph(DependencyGraphEnum dependencyGraph) {
        this.dependencyGraph = dependencyGraph;
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
    public DependencyGraphEnum getDependencyGraph() {
        return dependencyGraph;
    }

    public void setDependencyGraph(DependencyGraphEnum dependencyGraph) {
        this.dependencyGraph = dependencyGraph;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest dependencyGraphAutosubmitAction(
            DependencyGraphAutosubmitActionEnum dependencyGraphAutosubmitAction) {
        this.dependencyGraphAutosubmitAction = dependencyGraphAutosubmitAction;
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
    public DependencyGraphAutosubmitActionEnum getDependencyGraphAutosubmitAction() {
        return dependencyGraphAutosubmitAction;
    }

    public void setDependencyGraphAutosubmitAction(
            DependencyGraphAutosubmitActionEnum dependencyGraphAutosubmitAction) {
        this.dependencyGraphAutosubmitAction = dependencyGraphAutosubmitAction;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest dependencyGraphAutosubmitActionOptions(
            CodeSecurityCreateConfigurationForEnterpriseRequestDependencyGraphAutosubmitActionOptions
                    dependencyGraphAutosubmitActionOptions) {
        this.dependencyGraphAutosubmitActionOptions = dependencyGraphAutosubmitActionOptions;
        return this;
    }

    /**
     * Get dependencyGraphAutosubmitActionOptions
     * @return dependencyGraphAutosubmitActionOptions
     */
    @Valid
    @Schema(name = "dependency_graph_autosubmit_action_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependency_graph_autosubmit_action_options")
    public CodeSecurityCreateConfigurationForEnterpriseRequestDependencyGraphAutosubmitActionOptions
            getDependencyGraphAutosubmitActionOptions() {
        return dependencyGraphAutosubmitActionOptions;
    }

    public void setDependencyGraphAutosubmitActionOptions(
            CodeSecurityCreateConfigurationForEnterpriseRequestDependencyGraphAutosubmitActionOptions
                    dependencyGraphAutosubmitActionOptions) {
        this.dependencyGraphAutosubmitActionOptions = dependencyGraphAutosubmitActionOptions;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest dependabotAlerts(DependabotAlertsEnum dependabotAlerts) {
        this.dependabotAlerts = dependabotAlerts;
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
    public DependabotAlertsEnum getDependabotAlerts() {
        return dependabotAlerts;
    }

    public void setDependabotAlerts(DependabotAlertsEnum dependabotAlerts) {
        this.dependabotAlerts = dependabotAlerts;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest dependabotSecurityUpdates(
            DependabotSecurityUpdatesEnum dependabotSecurityUpdates) {
        this.dependabotSecurityUpdates = dependabotSecurityUpdates;
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
    public DependabotSecurityUpdatesEnum getDependabotSecurityUpdates() {
        return dependabotSecurityUpdates;
    }

    public void setDependabotSecurityUpdates(DependabotSecurityUpdatesEnum dependabotSecurityUpdates) {
        this.dependabotSecurityUpdates = dependabotSecurityUpdates;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest codeScanningOptions(
            CodeScanningOptions codeScanningOptions) {
        this.codeScanningOptions = codeScanningOptions;
        return this;
    }

    /**
     * Get codeScanningOptions
     * @return codeScanningOptions
     */
    @Valid
    @Schema(name = "code_scanning_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_scanning_options")
    public CodeScanningOptions getCodeScanningOptions() {
        return codeScanningOptions;
    }

    public void setCodeScanningOptions(CodeScanningOptions codeScanningOptions) {
        this.codeScanningOptions = codeScanningOptions;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest codeScanningDefaultSetup(
            CodeScanningDefaultSetupEnum codeScanningDefaultSetup) {
        this.codeScanningDefaultSetup = codeScanningDefaultSetup;
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
    public CodeScanningDefaultSetupEnum getCodeScanningDefaultSetup() {
        return codeScanningDefaultSetup;
    }

    public void setCodeScanningDefaultSetup(CodeScanningDefaultSetupEnum codeScanningDefaultSetup) {
        this.codeScanningDefaultSetup = codeScanningDefaultSetup;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest codeScanningDefaultSetupOptions(
            CodeScanningDefaultSetupOptions codeScanningDefaultSetupOptions) {
        this.codeScanningDefaultSetupOptions = codeScanningDefaultSetupOptions;
        return this;
    }

    /**
     * Get codeScanningDefaultSetupOptions
     * @return codeScanningDefaultSetupOptions
     */
    @Valid
    @Schema(name = "code_scanning_default_setup_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("code_scanning_default_setup_options")
    public CodeScanningDefaultSetupOptions getCodeScanningDefaultSetupOptions() {
        return codeScanningDefaultSetupOptions;
    }

    public void setCodeScanningDefaultSetupOptions(CodeScanningDefaultSetupOptions codeScanningDefaultSetupOptions) {
        this.codeScanningDefaultSetupOptions = codeScanningDefaultSetupOptions;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest codeScanningDelegatedAlertDismissal(
            CodeScanningDelegatedAlertDismissalEnum codeScanningDelegatedAlertDismissal) {
        this.codeScanningDelegatedAlertDismissal = codeScanningDelegatedAlertDismissal;
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
    public CodeScanningDelegatedAlertDismissalEnum getCodeScanningDelegatedAlertDismissal() {
        return codeScanningDelegatedAlertDismissal;
    }

    public void setCodeScanningDelegatedAlertDismissal(
            CodeScanningDelegatedAlertDismissalEnum codeScanningDelegatedAlertDismissal) {
        this.codeScanningDelegatedAlertDismissal = codeScanningDelegatedAlertDismissal;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest secretProtection(SecretProtectionEnum secretProtection) {
        this.secretProtection = secretProtection;
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
    public SecretProtectionEnum getSecretProtection() {
        return secretProtection;
    }

    public void setSecretProtection(SecretProtectionEnum secretProtection) {
        this.secretProtection = secretProtection;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest secretScanning(SecretScanningEnum secretScanning) {
        this.secretScanning = secretScanning;
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
    public SecretScanningEnum getSecretScanning() {
        return secretScanning;
    }

    public void setSecretScanning(SecretScanningEnum secretScanning) {
        this.secretScanning = secretScanning;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest secretScanningPushProtection(
            SecretScanningPushProtectionEnum secretScanningPushProtection) {
        this.secretScanningPushProtection = secretScanningPushProtection;
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
    public SecretScanningPushProtectionEnum getSecretScanningPushProtection() {
        return secretScanningPushProtection;
    }

    public void setSecretScanningPushProtection(SecretScanningPushProtectionEnum secretScanningPushProtection) {
        this.secretScanningPushProtection = secretScanningPushProtection;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest secretScanningValidityChecks(
            SecretScanningValidityChecksEnum secretScanningValidityChecks) {
        this.secretScanningValidityChecks = secretScanningValidityChecks;
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
    public SecretScanningValidityChecksEnum getSecretScanningValidityChecks() {
        return secretScanningValidityChecks;
    }

    public void setSecretScanningValidityChecks(SecretScanningValidityChecksEnum secretScanningValidityChecks) {
        this.secretScanningValidityChecks = secretScanningValidityChecks;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest secretScanningNonProviderPatterns(
            SecretScanningNonProviderPatternsEnum secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
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
    public SecretScanningNonProviderPatternsEnum getSecretScanningNonProviderPatterns() {
        return secretScanningNonProviderPatterns;
    }

    public void setSecretScanningNonProviderPatterns(
            SecretScanningNonProviderPatternsEnum secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest secretScanningGenericSecrets(
            SecretScanningGenericSecretsEnum secretScanningGenericSecrets) {
        this.secretScanningGenericSecrets = secretScanningGenericSecrets;
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
    public SecretScanningGenericSecretsEnum getSecretScanningGenericSecrets() {
        return secretScanningGenericSecrets;
    }

    public void setSecretScanningGenericSecrets(SecretScanningGenericSecretsEnum secretScanningGenericSecrets) {
        this.secretScanningGenericSecrets = secretScanningGenericSecrets;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest secretScanningDelegatedAlertDismissal(
            SecretScanningDelegatedAlertDismissalEnum secretScanningDelegatedAlertDismissal) {
        this.secretScanningDelegatedAlertDismissal = secretScanningDelegatedAlertDismissal;
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
    public SecretScanningDelegatedAlertDismissalEnum getSecretScanningDelegatedAlertDismissal() {
        return secretScanningDelegatedAlertDismissal;
    }

    public void setSecretScanningDelegatedAlertDismissal(
            SecretScanningDelegatedAlertDismissalEnum secretScanningDelegatedAlertDismissal) {
        this.secretScanningDelegatedAlertDismissal = secretScanningDelegatedAlertDismissal;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest secretScanningExtendedMetadata(
            SecretScanningExtendedMetadataEnum secretScanningExtendedMetadata) {
        this.secretScanningExtendedMetadata = secretScanningExtendedMetadata;
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
    public SecretScanningExtendedMetadataEnum getSecretScanningExtendedMetadata() {
        return secretScanningExtendedMetadata;
    }

    public void setSecretScanningExtendedMetadata(SecretScanningExtendedMetadataEnum secretScanningExtendedMetadata) {
        this.secretScanningExtendedMetadata = secretScanningExtendedMetadata;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest privateVulnerabilityReporting(
            PrivateVulnerabilityReportingEnum privateVulnerabilityReporting) {
        this.privateVulnerabilityReporting = privateVulnerabilityReporting;
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
    public PrivateVulnerabilityReportingEnum getPrivateVulnerabilityReporting() {
        return privateVulnerabilityReporting;
    }

    public void setPrivateVulnerabilityReporting(PrivateVulnerabilityReportingEnum privateVulnerabilityReporting) {
        this.privateVulnerabilityReporting = privateVulnerabilityReporting;
    }

    public CodeSecurityCreateConfigurationForEnterpriseRequest enforcement(EnforcementEnum enforcement) {
        this.enforcement = enforcement;
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
    public EnforcementEnum getEnforcement() {
        return enforcement;
    }

    public void setEnforcement(EnforcementEnum enforcement) {
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
        CodeSecurityCreateConfigurationForEnterpriseRequest codeSecurityCreateConfigurationForEnterpriseRequest =
                (CodeSecurityCreateConfigurationForEnterpriseRequest) o;
        return Objects.equals(this.name, codeSecurityCreateConfigurationForEnterpriseRequest.name)
                && Objects.equals(this.description, codeSecurityCreateConfigurationForEnterpriseRequest.description)
                && Objects.equals(
                        this.advancedSecurity, codeSecurityCreateConfigurationForEnterpriseRequest.advancedSecurity)
                && Objects.equals(this.codeSecurity, codeSecurityCreateConfigurationForEnterpriseRequest.codeSecurity)
                && Objects.equals(
                        this.dependencyGraph, codeSecurityCreateConfigurationForEnterpriseRequest.dependencyGraph)
                && Objects.equals(
                        this.dependencyGraphAutosubmitAction,
                        codeSecurityCreateConfigurationForEnterpriseRequest.dependencyGraphAutosubmitAction)
                && Objects.equals(
                        this.dependencyGraphAutosubmitActionOptions,
                        codeSecurityCreateConfigurationForEnterpriseRequest.dependencyGraphAutosubmitActionOptions)
                && Objects.equals(
                        this.dependabotAlerts, codeSecurityCreateConfigurationForEnterpriseRequest.dependabotAlerts)
                && Objects.equals(
                        this.dependabotSecurityUpdates,
                        codeSecurityCreateConfigurationForEnterpriseRequest.dependabotSecurityUpdates)
                && Objects.equals(
                        this.codeScanningOptions,
                        codeSecurityCreateConfigurationForEnterpriseRequest.codeScanningOptions)
                && Objects.equals(
                        this.codeScanningDefaultSetup,
                        codeSecurityCreateConfigurationForEnterpriseRequest.codeScanningDefaultSetup)
                && Objects.equals(
                        this.codeScanningDefaultSetupOptions,
                        codeSecurityCreateConfigurationForEnterpriseRequest.codeScanningDefaultSetupOptions)
                && Objects.equals(
                        this.codeScanningDelegatedAlertDismissal,
                        codeSecurityCreateConfigurationForEnterpriseRequest.codeScanningDelegatedAlertDismissal)
                && Objects.equals(
                        this.secretProtection, codeSecurityCreateConfigurationForEnterpriseRequest.secretProtection)
                && Objects.equals(
                        this.secretScanning, codeSecurityCreateConfigurationForEnterpriseRequest.secretScanning)
                && Objects.equals(
                        this.secretScanningPushProtection,
                        codeSecurityCreateConfigurationForEnterpriseRequest.secretScanningPushProtection)
                && Objects.equals(
                        this.secretScanningValidityChecks,
                        codeSecurityCreateConfigurationForEnterpriseRequest.secretScanningValidityChecks)
                && Objects.equals(
                        this.secretScanningNonProviderPatterns,
                        codeSecurityCreateConfigurationForEnterpriseRequest.secretScanningNonProviderPatterns)
                && Objects.equals(
                        this.secretScanningGenericSecrets,
                        codeSecurityCreateConfigurationForEnterpriseRequest.secretScanningGenericSecrets)
                && Objects.equals(
                        this.secretScanningDelegatedAlertDismissal,
                        codeSecurityCreateConfigurationForEnterpriseRequest.secretScanningDelegatedAlertDismissal)
                && Objects.equals(
                        this.secretScanningExtendedMetadata,
                        codeSecurityCreateConfigurationForEnterpriseRequest.secretScanningExtendedMetadata)
                && Objects.equals(
                        this.privateVulnerabilityReporting,
                        codeSecurityCreateConfigurationForEnterpriseRequest.privateVulnerabilityReporting)
                && Objects.equals(this.enforcement, codeSecurityCreateConfigurationForEnterpriseRequest.enforcement);
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
                codeScanningOptions,
                codeScanningDefaultSetup,
                codeScanningDefaultSetupOptions,
                codeScanningDelegatedAlertDismissal,
                secretProtection,
                secretScanning,
                secretScanningPushProtection,
                secretScanningValidityChecks,
                secretScanningNonProviderPatterns,
                secretScanningGenericSecrets,
                secretScanningDelegatedAlertDismissal,
                secretScanningExtendedMetadata,
                privateVulnerabilityReporting,
                enforcement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityCreateConfigurationForEnterpriseRequest {\n");
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
