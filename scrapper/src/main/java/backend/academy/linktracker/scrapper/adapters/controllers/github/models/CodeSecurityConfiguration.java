package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A code security configuration
 */
@Schema(name = "code-security-configuration", description = "A code security configuration")
@JsonTypeName("code-security-configuration")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeSecurityConfiguration {

    private Long id;

    private String name;

    /**
     * The type of the code security configuration.
     */
    public enum TargetTypeEnum {
        GLOBAL("global"),

        ORGANIZATION("organization"),

        ENTERPRISE("enterprise");

        private final String value;

        TargetTypeEnum(String value) {
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
        public static TargetTypeEnum fromValue(String value) {
            for (TargetTypeEnum b : TargetTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TargetTypeEnum targetType;

    private String description;

    /**
     * The enablement status of GitHub Advanced Security
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

    private AdvancedSecurityEnum advancedSecurity;

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

    private DependencyGraphEnum dependencyGraph;

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

    private DependencyGraphAutosubmitActionEnum dependencyGraphAutosubmitAction;

    private CodeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions
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

    private DependabotAlertsEnum dependabotAlerts;

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

    private DependabotSecurityUpdatesEnum dependabotSecurityUpdates;

    /**
     * The enablement status of Dependabot delegated alert dismissal
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
            return null;
        }
    }

    private DependabotDelegatedAlertDismissalEnum dependabotDelegatedAlertDismissal = null;

    private CodeSecurityConfigurationCodeScanningOptions codeScanningOptions = null;

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

    private CodeScanningDefaultSetupEnum codeScanningDefaultSetup;

    private CodeSecurityConfigurationCodeScanningDefaultSetupOptions codeScanningDefaultSetupOptions = null;

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

    private CodeScanningDelegatedAlertDismissalEnum codeScanningDelegatedAlertDismissal;

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

    private SecretScanningEnum secretScanning;

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

    private SecretScanningPushProtectionEnum secretScanningPushProtection;

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

    private SecretScanningDelegatedBypassEnum secretScanningDelegatedBypass;

    private CodeSecurityConfigurationSecretScanningDelegatedBypassOptions secretScanningDelegatedBypassOptions;

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

    private SecretScanningValidityChecksEnum secretScanningValidityChecks;

    /**
     * The enablement status of secret scanning non-provider patterns
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

    private SecretScanningNonProviderPatternsEnum secretScanningNonProviderPatterns;

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

    private SecretScanningGenericSecretsEnum secretScanningGenericSecrets;

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

    private SecretScanningDelegatedAlertDismissalEnum secretScanningDelegatedAlertDismissal;

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

    private SecretScanningExtendedMetadataEnum secretScanningExtendedMetadata;

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

    private PrivateVulnerabilityReportingEnum privateVulnerabilityReporting;

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

    private EnforcementEnum enforcement;

    private URI url;

    private URI htmlUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public CodeSecurityConfiguration id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the code security configuration
     * @return id
     */
    @Schema(
            name = "id",
            description = "The ID of the code security configuration",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CodeSecurityConfiguration name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the code security configuration. Must be unique within the organization.
     * @return name
     */
    @Schema(
            name = "name",
            description = "The name of the code security configuration. Must be unique within the organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CodeSecurityConfiguration targetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * The type of the code security configuration.
     * @return targetType
     */
    @Schema(
            name = "target_type",
            description = "The type of the code security configuration.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_type")
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    public CodeSecurityConfiguration description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A description of the code security configuration
     * @return description
     */
    @Schema(
            name = "description",
            description = "A description of the code security configuration",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CodeSecurityConfiguration advancedSecurity(AdvancedSecurityEnum advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
        return this;
    }

    /**
     * The enablement status of GitHub Advanced Security
     * @return advancedSecurity
     */
    @Schema(
            name = "advanced_security",
            description = "The enablement status of GitHub Advanced Security",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("advanced_security")
    public AdvancedSecurityEnum getAdvancedSecurity() {
        return advancedSecurity;
    }

    public void setAdvancedSecurity(AdvancedSecurityEnum advancedSecurity) {
        this.advancedSecurity = advancedSecurity;
    }

    public CodeSecurityConfiguration dependencyGraph(DependencyGraphEnum dependencyGraph) {
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

    public CodeSecurityConfiguration dependencyGraphAutosubmitAction(
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

    public CodeSecurityConfiguration dependencyGraphAutosubmitActionOptions(
            CodeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions
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
    public CodeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions
            getDependencyGraphAutosubmitActionOptions() {
        return dependencyGraphAutosubmitActionOptions;
    }

    public void setDependencyGraphAutosubmitActionOptions(
            CodeSecurityUpdateEnterpriseConfigurationRequestDependencyGraphAutosubmitActionOptions
                    dependencyGraphAutosubmitActionOptions) {
        this.dependencyGraphAutosubmitActionOptions = dependencyGraphAutosubmitActionOptions;
    }

    public CodeSecurityConfiguration dependabotAlerts(DependabotAlertsEnum dependabotAlerts) {
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

    public CodeSecurityConfiguration dependabotSecurityUpdates(
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

    public CodeSecurityConfiguration dependabotDelegatedAlertDismissal(
            DependabotDelegatedAlertDismissalEnum dependabotDelegatedAlertDismissal) {
        this.dependabotDelegatedAlertDismissal = dependabotDelegatedAlertDismissal;
        return this;
    }

    /**
     * The enablement status of Dependabot delegated alert dismissal
     * @return dependabotDelegatedAlertDismissal
     */
    @Schema(
            name = "dependabot_delegated_alert_dismissal",
            description = "The enablement status of Dependabot delegated alert dismissal",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dependabot_delegated_alert_dismissal")
    public DependabotDelegatedAlertDismissalEnum getDependabotDelegatedAlertDismissal() {
        return dependabotDelegatedAlertDismissal;
    }

    public void setDependabotDelegatedAlertDismissal(
            DependabotDelegatedAlertDismissalEnum dependabotDelegatedAlertDismissal) {
        this.dependabotDelegatedAlertDismissal = dependabotDelegatedAlertDismissal;
    }

    public CodeSecurityConfiguration codeScanningOptions(
            CodeSecurityConfigurationCodeScanningOptions codeScanningOptions) {
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
    public CodeSecurityConfigurationCodeScanningOptions getCodeScanningOptions() {
        return codeScanningOptions;
    }

    public void setCodeScanningOptions(CodeSecurityConfigurationCodeScanningOptions codeScanningOptions) {
        this.codeScanningOptions = codeScanningOptions;
    }

    public CodeSecurityConfiguration codeScanningDefaultSetup(CodeScanningDefaultSetupEnum codeScanningDefaultSetup) {
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

    public CodeSecurityConfiguration codeScanningDefaultSetupOptions(
            CodeSecurityConfigurationCodeScanningDefaultSetupOptions codeScanningDefaultSetupOptions) {
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
    public CodeSecurityConfigurationCodeScanningDefaultSetupOptions getCodeScanningDefaultSetupOptions() {
        return codeScanningDefaultSetupOptions;
    }

    public void setCodeScanningDefaultSetupOptions(
            CodeSecurityConfigurationCodeScanningDefaultSetupOptions codeScanningDefaultSetupOptions) {
        this.codeScanningDefaultSetupOptions = codeScanningDefaultSetupOptions;
    }

    public CodeSecurityConfiguration codeScanningDelegatedAlertDismissal(
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

    public CodeSecurityConfiguration secretScanning(SecretScanningEnum secretScanning) {
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

    public CodeSecurityConfiguration secretScanningPushProtection(
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

    public CodeSecurityConfiguration secretScanningDelegatedBypass(
            SecretScanningDelegatedBypassEnum secretScanningDelegatedBypass) {
        this.secretScanningDelegatedBypass = secretScanningDelegatedBypass;
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
    public SecretScanningDelegatedBypassEnum getSecretScanningDelegatedBypass() {
        return secretScanningDelegatedBypass;
    }

    public void setSecretScanningDelegatedBypass(SecretScanningDelegatedBypassEnum secretScanningDelegatedBypass) {
        this.secretScanningDelegatedBypass = secretScanningDelegatedBypass;
    }

    public CodeSecurityConfiguration secretScanningDelegatedBypassOptions(
            CodeSecurityConfigurationSecretScanningDelegatedBypassOptions secretScanningDelegatedBypassOptions) {
        this.secretScanningDelegatedBypassOptions = secretScanningDelegatedBypassOptions;
        return this;
    }

    /**
     * Get secretScanningDelegatedBypassOptions
     * @return secretScanningDelegatedBypassOptions
     */
    @Valid
    @Schema(name = "secret_scanning_delegated_bypass_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_delegated_bypass_options")
    public CodeSecurityConfigurationSecretScanningDelegatedBypassOptions getSecretScanningDelegatedBypassOptions() {
        return secretScanningDelegatedBypassOptions;
    }

    public void setSecretScanningDelegatedBypassOptions(
            CodeSecurityConfigurationSecretScanningDelegatedBypassOptions secretScanningDelegatedBypassOptions) {
        this.secretScanningDelegatedBypassOptions = secretScanningDelegatedBypassOptions;
    }

    public CodeSecurityConfiguration secretScanningValidityChecks(
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

    public CodeSecurityConfiguration secretScanningNonProviderPatterns(
            SecretScanningNonProviderPatternsEnum secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
        return this;
    }

    /**
     * The enablement status of secret scanning non-provider patterns
     * @return secretScanningNonProviderPatterns
     */
    @Schema(
            name = "secret_scanning_non_provider_patterns",
            description = "The enablement status of secret scanning non-provider patterns",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_non_provider_patterns")
    public SecretScanningNonProviderPatternsEnum getSecretScanningNonProviderPatterns() {
        return secretScanningNonProviderPatterns;
    }

    public void setSecretScanningNonProviderPatterns(
            SecretScanningNonProviderPatternsEnum secretScanningNonProviderPatterns) {
        this.secretScanningNonProviderPatterns = secretScanningNonProviderPatterns;
    }

    public CodeSecurityConfiguration secretScanningGenericSecrets(
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

    public CodeSecurityConfiguration secretScanningDelegatedAlertDismissal(
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

    public CodeSecurityConfiguration secretScanningExtendedMetadata(
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

    public CodeSecurityConfiguration privateVulnerabilityReporting(
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

    public CodeSecurityConfiguration enforcement(EnforcementEnum enforcement) {
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

    public CodeSecurityConfiguration url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The URL of the configuration
     * @return url
     */
    @Valid
    @Schema(name = "url", description = "The URL of the configuration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public CodeSecurityConfiguration htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * The URL of the configuration
     * @return htmlUrl
     */
    @Valid
    @Schema(
            name = "html_url",
            description = "The URL of the configuration",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public CodeSecurityConfiguration createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CodeSecurityConfiguration updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CodeSecurityConfiguration codeSecurityConfiguration = (CodeSecurityConfiguration) o;
        return Objects.equals(this.id, codeSecurityConfiguration.id)
                && Objects.equals(this.name, codeSecurityConfiguration.name)
                && Objects.equals(this.targetType, codeSecurityConfiguration.targetType)
                && Objects.equals(this.description, codeSecurityConfiguration.description)
                && Objects.equals(this.advancedSecurity, codeSecurityConfiguration.advancedSecurity)
                && Objects.equals(this.dependencyGraph, codeSecurityConfiguration.dependencyGraph)
                && Objects.equals(
                        this.dependencyGraphAutosubmitAction, codeSecurityConfiguration.dependencyGraphAutosubmitAction)
                && Objects.equals(
                        this.dependencyGraphAutosubmitActionOptions,
                        codeSecurityConfiguration.dependencyGraphAutosubmitActionOptions)
                && Objects.equals(this.dependabotAlerts, codeSecurityConfiguration.dependabotAlerts)
                && Objects.equals(this.dependabotSecurityUpdates, codeSecurityConfiguration.dependabotSecurityUpdates)
                && Objects.equals(
                        this.dependabotDelegatedAlertDismissal,
                        codeSecurityConfiguration.dependabotDelegatedAlertDismissal)
                && Objects.equals(this.codeScanningOptions, codeSecurityConfiguration.codeScanningOptions)
                && Objects.equals(this.codeScanningDefaultSetup, codeSecurityConfiguration.codeScanningDefaultSetup)
                && Objects.equals(
                        this.codeScanningDefaultSetupOptions, codeSecurityConfiguration.codeScanningDefaultSetupOptions)
                && Objects.equals(
                        this.codeScanningDelegatedAlertDismissal,
                        codeSecurityConfiguration.codeScanningDelegatedAlertDismissal)
                && Objects.equals(this.secretScanning, codeSecurityConfiguration.secretScanning)
                && Objects.equals(
                        this.secretScanningPushProtection, codeSecurityConfiguration.secretScanningPushProtection)
                && Objects.equals(
                        this.secretScanningDelegatedBypass, codeSecurityConfiguration.secretScanningDelegatedBypass)
                && Objects.equals(
                        this.secretScanningDelegatedBypassOptions,
                        codeSecurityConfiguration.secretScanningDelegatedBypassOptions)
                && Objects.equals(
                        this.secretScanningValidityChecks, codeSecurityConfiguration.secretScanningValidityChecks)
                && Objects.equals(
                        this.secretScanningNonProviderPatterns,
                        codeSecurityConfiguration.secretScanningNonProviderPatterns)
                && Objects.equals(
                        this.secretScanningGenericSecrets, codeSecurityConfiguration.secretScanningGenericSecrets)
                && Objects.equals(
                        this.secretScanningDelegatedAlertDismissal,
                        codeSecurityConfiguration.secretScanningDelegatedAlertDismissal)
                && Objects.equals(
                        this.secretScanningExtendedMetadata, codeSecurityConfiguration.secretScanningExtendedMetadata)
                && Objects.equals(
                        this.privateVulnerabilityReporting, codeSecurityConfiguration.privateVulnerabilityReporting)
                && Objects.equals(this.enforcement, codeSecurityConfiguration.enforcement)
                && Objects.equals(this.url, codeSecurityConfiguration.url)
                && Objects.equals(this.htmlUrl, codeSecurityConfiguration.htmlUrl)
                && Objects.equals(this.createdAt, codeSecurityConfiguration.createdAt)
                && Objects.equals(this.updatedAt, codeSecurityConfiguration.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                targetType,
                description,
                advancedSecurity,
                dependencyGraph,
                dependencyGraphAutosubmitAction,
                dependencyGraphAutosubmitActionOptions,
                dependabotAlerts,
                dependabotSecurityUpdates,
                dependabotDelegatedAlertDismissal,
                codeScanningOptions,
                codeScanningDefaultSetup,
                codeScanningDefaultSetupOptions,
                codeScanningDelegatedAlertDismissal,
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
                enforcement,
                url,
                htmlUrl,
                createdAt,
                updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeSecurityConfiguration {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    advancedSecurity: ")
                .append(toIndentedString(advancedSecurity))
                .append("\n");
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
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
