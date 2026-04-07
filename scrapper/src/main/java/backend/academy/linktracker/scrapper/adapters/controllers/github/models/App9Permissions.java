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
 * The set of permissions for the GitHub app
 */
@Schema(name = "App_9_permissions", description = "The set of permissions for the GitHub app")
@JsonTypeName("App_9_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class App9Permissions {

    /**
     * Gets or Sets actions
     */
    public enum ActionsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        ActionsEnum(String value) {
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
        public static ActionsEnum fromValue(String value) {
            for (ActionsEnum b : ActionsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<ActionsEnum> actions = Optional.empty();

    /**
     * Gets or Sets administration
     */
    public enum AdministrationEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        AdministrationEnum(String value) {
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
        public static AdministrationEnum fromValue(String value) {
            for (AdministrationEnum b : AdministrationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<AdministrationEnum> administration = Optional.empty();

    /**
     * Gets or Sets checks
     */
    public enum ChecksEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        ChecksEnum(String value) {
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
        public static ChecksEnum fromValue(String value) {
            for (ChecksEnum b : ChecksEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<ChecksEnum> checks = Optional.empty();

    /**
     * Gets or Sets contentReferences
     */
    public enum ContentReferencesEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        ContentReferencesEnum(String value) {
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
        public static ContentReferencesEnum fromValue(String value) {
            for (ContentReferencesEnum b : ContentReferencesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<ContentReferencesEnum> contentReferences = Optional.empty();

    /**
     * Gets or Sets contents
     */
    public enum ContentsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        ContentsEnum(String value) {
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
        public static ContentsEnum fromValue(String value) {
            for (ContentsEnum b : ContentsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<ContentsEnum> contents = Optional.empty();

    /**
     * Gets or Sets deployments
     */
    public enum DeploymentsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        DeploymentsEnum(String value) {
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
        public static DeploymentsEnum fromValue(String value) {
            for (DeploymentsEnum b : DeploymentsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DeploymentsEnum> deployments = Optional.empty();

    /**
     * Gets or Sets discussions
     */
    public enum DiscussionsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        DiscussionsEnum(String value) {
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
        public static DiscussionsEnum fromValue(String value) {
            for (DiscussionsEnum b : DiscussionsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<DiscussionsEnum> discussions = Optional.empty();

    /**
     * Gets or Sets emails
     */
    public enum EmailsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        EmailsEnum(String value) {
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
        public static EmailsEnum fromValue(String value) {
            for (EmailsEnum b : EmailsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<EmailsEnum> emails = Optional.empty();

    /**
     * Gets or Sets environments
     */
    public enum EnvironmentsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        EnvironmentsEnum(String value) {
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
        public static EnvironmentsEnum fromValue(String value) {
            for (EnvironmentsEnum b : EnvironmentsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<EnvironmentsEnum> environments = Optional.empty();

    /**
     * Gets or Sets issues
     */
    public enum IssuesEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        IssuesEnum(String value) {
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
        public static IssuesEnum fromValue(String value) {
            for (IssuesEnum b : IssuesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<IssuesEnum> issues = Optional.empty();

    /**
     * Gets or Sets keys
     */
    public enum KeysEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        KeysEnum(String value) {
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
        public static KeysEnum fromValue(String value) {
            for (KeysEnum b : KeysEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<KeysEnum> keys = Optional.empty();

    /**
     * Gets or Sets members
     */
    public enum MembersEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        MembersEnum(String value) {
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
        public static MembersEnum fromValue(String value) {
            for (MembersEnum b : MembersEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<MembersEnum> members = Optional.empty();

    /**
     * Gets or Sets metadata
     */
    public enum MetadataEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        MetadataEnum(String value) {
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
        public static MetadataEnum fromValue(String value) {
            for (MetadataEnum b : MetadataEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<MetadataEnum> metadata = Optional.empty();

    /**
     * Gets or Sets organizationAdministration
     */
    public enum OrganizationAdministrationEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        OrganizationAdministrationEnum(String value) {
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
        public static OrganizationAdministrationEnum fromValue(String value) {
            for (OrganizationAdministrationEnum b : OrganizationAdministrationEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<OrganizationAdministrationEnum> organizationAdministration = Optional.empty();

    /**
     * Gets or Sets organizationHooks
     */
    public enum OrganizationHooksEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        OrganizationHooksEnum(String value) {
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
        public static OrganizationHooksEnum fromValue(String value) {
            for (OrganizationHooksEnum b : OrganizationHooksEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<OrganizationHooksEnum> organizationHooks = Optional.empty();

    /**
     * Gets or Sets organizationPackages
     */
    public enum OrganizationPackagesEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        OrganizationPackagesEnum(String value) {
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
        public static OrganizationPackagesEnum fromValue(String value) {
            for (OrganizationPackagesEnum b : OrganizationPackagesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<OrganizationPackagesEnum> organizationPackages = Optional.empty();

    /**
     * Gets or Sets organizationPlan
     */
    public enum OrganizationPlanEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        OrganizationPlanEnum(String value) {
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
        public static OrganizationPlanEnum fromValue(String value) {
            for (OrganizationPlanEnum b : OrganizationPlanEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<OrganizationPlanEnum> organizationPlan = Optional.empty();

    /**
     * Gets or Sets organizationProjects
     */
    public enum OrganizationProjectsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        OrganizationProjectsEnum(String value) {
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
        public static OrganizationProjectsEnum fromValue(String value) {
            for (OrganizationProjectsEnum b : OrganizationProjectsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<OrganizationProjectsEnum> organizationProjects = Optional.empty();

    /**
     * Gets or Sets organizationSecrets
     */
    public enum OrganizationSecretsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        OrganizationSecretsEnum(String value) {
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
        public static OrganizationSecretsEnum fromValue(String value) {
            for (OrganizationSecretsEnum b : OrganizationSecretsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<OrganizationSecretsEnum> organizationSecrets = Optional.empty();

    /**
     * Gets or Sets organizationSelfHostedRunners
     */
    public enum OrganizationSelfHostedRunnersEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        OrganizationSelfHostedRunnersEnum(String value) {
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
        public static OrganizationSelfHostedRunnersEnum fromValue(String value) {
            for (OrganizationSelfHostedRunnersEnum b : OrganizationSelfHostedRunnersEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<OrganizationSelfHostedRunnersEnum> organizationSelfHostedRunners = Optional.empty();

    /**
     * Gets or Sets organizationUserBlocking
     */
    public enum OrganizationUserBlockingEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        OrganizationUserBlockingEnum(String value) {
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
        public static OrganizationUserBlockingEnum fromValue(String value) {
            for (OrganizationUserBlockingEnum b : OrganizationUserBlockingEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<OrganizationUserBlockingEnum> organizationUserBlocking = Optional.empty();

    /**
     * Gets or Sets packages
     */
    public enum PackagesEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        PackagesEnum(String value) {
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
        public static PackagesEnum fromValue(String value) {
            for (PackagesEnum b : PackagesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<PackagesEnum> packages = Optional.empty();

    /**
     * Gets or Sets pages
     */
    public enum PagesEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        PagesEnum(String value) {
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
        public static PagesEnum fromValue(String value) {
            for (PagesEnum b : PagesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<PagesEnum> pages = Optional.empty();

    /**
     * Gets or Sets pullRequests
     */
    public enum PullRequestsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        PullRequestsEnum(String value) {
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
        public static PullRequestsEnum fromValue(String value) {
            for (PullRequestsEnum b : PullRequestsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<PullRequestsEnum> pullRequests = Optional.empty();

    /**
     * Gets or Sets repositoryHooks
     */
    public enum RepositoryHooksEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        RepositoryHooksEnum(String value) {
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
        public static RepositoryHooksEnum fromValue(String value) {
            for (RepositoryHooksEnum b : RepositoryHooksEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<RepositoryHooksEnum> repositoryHooks = Optional.empty();

    /**
     * Gets or Sets repositoryProjects
     */
    public enum RepositoryProjectsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        RepositoryProjectsEnum(String value) {
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
        public static RepositoryProjectsEnum fromValue(String value) {
            for (RepositoryProjectsEnum b : RepositoryProjectsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<RepositoryProjectsEnum> repositoryProjects = Optional.empty();

    /**
     * Gets or Sets secretScanningAlerts
     */
    public enum SecretScanningAlertsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        SecretScanningAlertsEnum(String value) {
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
        public static SecretScanningAlertsEnum fromValue(String value) {
            for (SecretScanningAlertsEnum b : SecretScanningAlertsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretScanningAlertsEnum> secretScanningAlerts = Optional.empty();

    /**
     * Gets or Sets secrets
     */
    public enum SecretsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        SecretsEnum(String value) {
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
        public static SecretsEnum fromValue(String value) {
            for (SecretsEnum b : SecretsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecretsEnum> secrets = Optional.empty();

    /**
     * Gets or Sets securityEvents
     */
    public enum SecurityEventsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        SecurityEventsEnum(String value) {
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
        public static SecurityEventsEnum fromValue(String value) {
            for (SecurityEventsEnum b : SecurityEventsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecurityEventsEnum> securityEvents = Optional.empty();

    /**
     * Gets or Sets securityScanningAlert
     */
    public enum SecurityScanningAlertEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        SecurityScanningAlertEnum(String value) {
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
        public static SecurityScanningAlertEnum fromValue(String value) {
            for (SecurityScanningAlertEnum b : SecurityScanningAlertEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SecurityScanningAlertEnum> securityScanningAlert = Optional.empty();

    /**
     * Gets or Sets singleFile
     */
    public enum SingleFileEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        SingleFileEnum(String value) {
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
        public static SingleFileEnum fromValue(String value) {
            for (SingleFileEnum b : SingleFileEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SingleFileEnum> singleFile = Optional.empty();

    /**
     * Gets or Sets statuses
     */
    public enum StatusesEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        StatusesEnum(String value) {
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
        public static StatusesEnum fromValue(String value) {
            for (StatusesEnum b : StatusesEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<StatusesEnum> statuses = Optional.empty();

    /**
     * Gets or Sets teamDiscussions
     */
    public enum TeamDiscussionsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        TeamDiscussionsEnum(String value) {
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
        public static TeamDiscussionsEnum fromValue(String value) {
            for (TeamDiscussionsEnum b : TeamDiscussionsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<TeamDiscussionsEnum> teamDiscussions = Optional.empty();

    /**
     * Gets or Sets vulnerabilityAlerts
     */
    public enum VulnerabilityAlertsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        VulnerabilityAlertsEnum(String value) {
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
        public static VulnerabilityAlertsEnum fromValue(String value) {
            for (VulnerabilityAlertsEnum b : VulnerabilityAlertsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<VulnerabilityAlertsEnum> vulnerabilityAlerts = Optional.empty();

    /**
     * Gets or Sets workflows
     */
    public enum WorkflowsEnum {
        READ("read"),

        WRITE("write");

        private final String value;

        WorkflowsEnum(String value) {
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
        public static WorkflowsEnum fromValue(String value) {
            for (WorkflowsEnum b : WorkflowsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<WorkflowsEnum> workflows = Optional.empty();

    public App9Permissions actions(ActionsEnum actions) {
        this.actions = Optional.ofNullable(actions);
        return this;
    }

    /**
     * Get actions
     * @return actions
     */
    @Schema(name = "actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions")
    public Optional<ActionsEnum> getActions() {
        return actions;
    }

    public void setActions(Optional<ActionsEnum> actions) {
        this.actions = actions;
    }

    public App9Permissions administration(AdministrationEnum administration) {
        this.administration = Optional.ofNullable(administration);
        return this;
    }

    /**
     * Get administration
     * @return administration
     */
    @Schema(name = "administration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("administration")
    public Optional<AdministrationEnum> getAdministration() {
        return administration;
    }

    public void setAdministration(Optional<AdministrationEnum> administration) {
        this.administration = administration;
    }

    public App9Permissions checks(ChecksEnum checks) {
        this.checks = Optional.ofNullable(checks);
        return this;
    }

    /**
     * Get checks
     * @return checks
     */
    @Schema(name = "checks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("checks")
    public Optional<ChecksEnum> getChecks() {
        return checks;
    }

    public void setChecks(Optional<ChecksEnum> checks) {
        this.checks = checks;
    }

    public App9Permissions contentReferences(ContentReferencesEnum contentReferences) {
        this.contentReferences = Optional.ofNullable(contentReferences);
        return this;
    }

    /**
     * Get contentReferences
     * @return contentReferences
     */
    @Schema(name = "content_references", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_references")
    public Optional<ContentReferencesEnum> getContentReferences() {
        return contentReferences;
    }

    public void setContentReferences(Optional<ContentReferencesEnum> contentReferences) {
        this.contentReferences = contentReferences;
    }

    public App9Permissions contents(ContentsEnum contents) {
        this.contents = Optional.ofNullable(contents);
        return this;
    }

    /**
     * Get contents
     * @return contents
     */
    @Schema(name = "contents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contents")
    public Optional<ContentsEnum> getContents() {
        return contents;
    }

    public void setContents(Optional<ContentsEnum> contents) {
        this.contents = contents;
    }

    public App9Permissions deployments(DeploymentsEnum deployments) {
        this.deployments = Optional.ofNullable(deployments);
        return this;
    }

    /**
     * Get deployments
     * @return deployments
     */
    @Schema(name = "deployments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployments")
    public Optional<DeploymentsEnum> getDeployments() {
        return deployments;
    }

    public void setDeployments(Optional<DeploymentsEnum> deployments) {
        this.deployments = deployments;
    }

    public App9Permissions discussions(DiscussionsEnum discussions) {
        this.discussions = Optional.ofNullable(discussions);
        return this;
    }

    /**
     * Get discussions
     * @return discussions
     */
    @Schema(name = "discussions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("discussions")
    public Optional<DiscussionsEnum> getDiscussions() {
        return discussions;
    }

    public void setDiscussions(Optional<DiscussionsEnum> discussions) {
        this.discussions = discussions;
    }

    public App9Permissions emails(EmailsEnum emails) {
        this.emails = Optional.ofNullable(emails);
        return this;
    }

    /**
     * Get emails
     * @return emails
     */
    @Schema(name = "emails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("emails")
    public Optional<EmailsEnum> getEmails() {
        return emails;
    }

    public void setEmails(Optional<EmailsEnum> emails) {
        this.emails = emails;
    }

    public App9Permissions environments(EnvironmentsEnum environments) {
        this.environments = Optional.ofNullable(environments);
        return this;
    }

    /**
     * Get environments
     * @return environments
     */
    @Schema(name = "environments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environments")
    public Optional<EnvironmentsEnum> getEnvironments() {
        return environments;
    }

    public void setEnvironments(Optional<EnvironmentsEnum> environments) {
        this.environments = environments;
    }

    public App9Permissions issues(IssuesEnum issues) {
        this.issues = Optional.ofNullable(issues);
        return this;
    }

    /**
     * Get issues
     * @return issues
     */
    @Schema(name = "issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues")
    public Optional<IssuesEnum> getIssues() {
        return issues;
    }

    public void setIssues(Optional<IssuesEnum> issues) {
        this.issues = issues;
    }

    public App9Permissions keys(KeysEnum keys) {
        this.keys = Optional.ofNullable(keys);
        return this;
    }

    /**
     * Get keys
     * @return keys
     */
    @Schema(name = "keys", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("keys")
    public Optional<KeysEnum> getKeys() {
        return keys;
    }

    public void setKeys(Optional<KeysEnum> keys) {
        this.keys = keys;
    }

    public App9Permissions members(MembersEnum members) {
        this.members = Optional.ofNullable(members);
        return this;
    }

    /**
     * Get members
     * @return members
     */
    @Schema(name = "members", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members")
    public Optional<MembersEnum> getMembers() {
        return members;
    }

    public void setMembers(Optional<MembersEnum> members) {
        this.members = members;
    }

    public App9Permissions metadata(MetadataEnum metadata) {
        this.metadata = Optional.ofNullable(metadata);
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public Optional<MetadataEnum> getMetadata() {
        return metadata;
    }

    public void setMetadata(Optional<MetadataEnum> metadata) {
        this.metadata = metadata;
    }

    public App9Permissions organizationAdministration(OrganizationAdministrationEnum organizationAdministration) {
        this.organizationAdministration = Optional.ofNullable(organizationAdministration);
        return this;
    }

    /**
     * Get organizationAdministration
     * @return organizationAdministration
     */
    @Schema(name = "organization_administration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_administration")
    public Optional<OrganizationAdministrationEnum> getOrganizationAdministration() {
        return organizationAdministration;
    }

    public void setOrganizationAdministration(Optional<OrganizationAdministrationEnum> organizationAdministration) {
        this.organizationAdministration = organizationAdministration;
    }

    public App9Permissions organizationHooks(OrganizationHooksEnum organizationHooks) {
        this.organizationHooks = Optional.ofNullable(organizationHooks);
        return this;
    }

    /**
     * Get organizationHooks
     * @return organizationHooks
     */
    @Schema(name = "organization_hooks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_hooks")
    public Optional<OrganizationHooksEnum> getOrganizationHooks() {
        return organizationHooks;
    }

    public void setOrganizationHooks(Optional<OrganizationHooksEnum> organizationHooks) {
        this.organizationHooks = organizationHooks;
    }

    public App9Permissions organizationPackages(OrganizationPackagesEnum organizationPackages) {
        this.organizationPackages = Optional.ofNullable(organizationPackages);
        return this;
    }

    /**
     * Get organizationPackages
     * @return organizationPackages
     */
    @Schema(name = "organization_packages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_packages")
    public Optional<OrganizationPackagesEnum> getOrganizationPackages() {
        return organizationPackages;
    }

    public void setOrganizationPackages(Optional<OrganizationPackagesEnum> organizationPackages) {
        this.organizationPackages = organizationPackages;
    }

    public App9Permissions organizationPlan(OrganizationPlanEnum organizationPlan) {
        this.organizationPlan = Optional.ofNullable(organizationPlan);
        return this;
    }

    /**
     * Get organizationPlan
     * @return organizationPlan
     */
    @Schema(name = "organization_plan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_plan")
    public Optional<OrganizationPlanEnum> getOrganizationPlan() {
        return organizationPlan;
    }

    public void setOrganizationPlan(Optional<OrganizationPlanEnum> organizationPlan) {
        this.organizationPlan = organizationPlan;
    }

    public App9Permissions organizationProjects(OrganizationProjectsEnum organizationProjects) {
        this.organizationProjects = Optional.ofNullable(organizationProjects);
        return this;
    }

    /**
     * Get organizationProjects
     * @return organizationProjects
     */
    @Schema(name = "organization_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_projects")
    public Optional<OrganizationProjectsEnum> getOrganizationProjects() {
        return organizationProjects;
    }

    public void setOrganizationProjects(Optional<OrganizationProjectsEnum> organizationProjects) {
        this.organizationProjects = organizationProjects;
    }

    public App9Permissions organizationSecrets(OrganizationSecretsEnum organizationSecrets) {
        this.organizationSecrets = Optional.ofNullable(organizationSecrets);
        return this;
    }

    /**
     * Get organizationSecrets
     * @return organizationSecrets
     */
    @Schema(name = "organization_secrets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_secrets")
    public Optional<OrganizationSecretsEnum> getOrganizationSecrets() {
        return organizationSecrets;
    }

    public void setOrganizationSecrets(Optional<OrganizationSecretsEnum> organizationSecrets) {
        this.organizationSecrets = organizationSecrets;
    }

    public App9Permissions organizationSelfHostedRunners(
            OrganizationSelfHostedRunnersEnum organizationSelfHostedRunners) {
        this.organizationSelfHostedRunners = Optional.ofNullable(organizationSelfHostedRunners);
        return this;
    }

    /**
     * Get organizationSelfHostedRunners
     * @return organizationSelfHostedRunners
     */
    @Schema(name = "organization_self_hosted_runners", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_self_hosted_runners")
    public Optional<OrganizationSelfHostedRunnersEnum> getOrganizationSelfHostedRunners() {
        return organizationSelfHostedRunners;
    }

    public void setOrganizationSelfHostedRunners(
            Optional<OrganizationSelfHostedRunnersEnum> organizationSelfHostedRunners) {
        this.organizationSelfHostedRunners = organizationSelfHostedRunners;
    }

    public App9Permissions organizationUserBlocking(OrganizationUserBlockingEnum organizationUserBlocking) {
        this.organizationUserBlocking = Optional.ofNullable(organizationUserBlocking);
        return this;
    }

    /**
     * Get organizationUserBlocking
     * @return organizationUserBlocking
     */
    @Schema(name = "organization_user_blocking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_user_blocking")
    public Optional<OrganizationUserBlockingEnum> getOrganizationUserBlocking() {
        return organizationUserBlocking;
    }

    public void setOrganizationUserBlocking(Optional<OrganizationUserBlockingEnum> organizationUserBlocking) {
        this.organizationUserBlocking = organizationUserBlocking;
    }

    public App9Permissions packages(PackagesEnum packages) {
        this.packages = Optional.ofNullable(packages);
        return this;
    }

    /**
     * Get packages
     * @return packages
     */
    @Schema(name = "packages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("packages")
    public Optional<PackagesEnum> getPackages() {
        return packages;
    }

    public void setPackages(Optional<PackagesEnum> packages) {
        this.packages = packages;
    }

    public App9Permissions pages(PagesEnum pages) {
        this.pages = Optional.ofNullable(pages);
        return this;
    }

    /**
     * Get pages
     * @return pages
     */
    @Schema(name = "pages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pages")
    public Optional<PagesEnum> getPages() {
        return pages;
    }

    public void setPages(Optional<PagesEnum> pages) {
        this.pages = pages;
    }

    public App9Permissions pullRequests(PullRequestsEnum pullRequests) {
        this.pullRequests = Optional.ofNullable(pullRequests);
        return this;
    }

    /**
     * Get pullRequests
     * @return pullRequests
     */
    @Schema(name = "pull_requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_requests")
    public Optional<PullRequestsEnum> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(Optional<PullRequestsEnum> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public App9Permissions repositoryHooks(RepositoryHooksEnum repositoryHooks) {
        this.repositoryHooks = Optional.ofNullable(repositoryHooks);
        return this;
    }

    /**
     * Get repositoryHooks
     * @return repositoryHooks
     */
    @Schema(name = "repository_hooks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_hooks")
    public Optional<RepositoryHooksEnum> getRepositoryHooks() {
        return repositoryHooks;
    }

    public void setRepositoryHooks(Optional<RepositoryHooksEnum> repositoryHooks) {
        this.repositoryHooks = repositoryHooks;
    }

    public App9Permissions repositoryProjects(RepositoryProjectsEnum repositoryProjects) {
        this.repositoryProjects = Optional.ofNullable(repositoryProjects);
        return this;
    }

    /**
     * Get repositoryProjects
     * @return repositoryProjects
     */
    @Schema(name = "repository_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_projects")
    public Optional<RepositoryProjectsEnum> getRepositoryProjects() {
        return repositoryProjects;
    }

    public void setRepositoryProjects(Optional<RepositoryProjectsEnum> repositoryProjects) {
        this.repositoryProjects = repositoryProjects;
    }

    public App9Permissions secretScanningAlerts(SecretScanningAlertsEnum secretScanningAlerts) {
        this.secretScanningAlerts = Optional.ofNullable(secretScanningAlerts);
        return this;
    }

    /**
     * Get secretScanningAlerts
     * @return secretScanningAlerts
     */
    @Schema(name = "secret_scanning_alerts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_alerts")
    public Optional<SecretScanningAlertsEnum> getSecretScanningAlerts() {
        return secretScanningAlerts;
    }

    public void setSecretScanningAlerts(Optional<SecretScanningAlertsEnum> secretScanningAlerts) {
        this.secretScanningAlerts = secretScanningAlerts;
    }

    public App9Permissions secrets(SecretsEnum secrets) {
        this.secrets = Optional.ofNullable(secrets);
        return this;
    }

    /**
     * Get secrets
     * @return secrets
     */
    @Schema(name = "secrets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secrets")
    public Optional<SecretsEnum> getSecrets() {
        return secrets;
    }

    public void setSecrets(Optional<SecretsEnum> secrets) {
        this.secrets = secrets;
    }

    public App9Permissions securityEvents(SecurityEventsEnum securityEvents) {
        this.securityEvents = Optional.ofNullable(securityEvents);
        return this;
    }

    /**
     * Get securityEvents
     * @return securityEvents
     */
    @Schema(name = "security_events", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_events")
    public Optional<SecurityEventsEnum> getSecurityEvents() {
        return securityEvents;
    }

    public void setSecurityEvents(Optional<SecurityEventsEnum> securityEvents) {
        this.securityEvents = securityEvents;
    }

    public App9Permissions securityScanningAlert(SecurityScanningAlertEnum securityScanningAlert) {
        this.securityScanningAlert = Optional.ofNullable(securityScanningAlert);
        return this;
    }

    /**
     * Get securityScanningAlert
     * @return securityScanningAlert
     */
    @Schema(name = "security_scanning_alert", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_scanning_alert")
    public Optional<SecurityScanningAlertEnum> getSecurityScanningAlert() {
        return securityScanningAlert;
    }

    public void setSecurityScanningAlert(Optional<SecurityScanningAlertEnum> securityScanningAlert) {
        this.securityScanningAlert = securityScanningAlert;
    }

    public App9Permissions singleFile(SingleFileEnum singleFile) {
        this.singleFile = Optional.ofNullable(singleFile);
        return this;
    }

    /**
     * Get singleFile
     * @return singleFile
     */
    @Schema(name = "single_file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("single_file")
    public Optional<SingleFileEnum> getSingleFile() {
        return singleFile;
    }

    public void setSingleFile(Optional<SingleFileEnum> singleFile) {
        this.singleFile = singleFile;
    }

    public App9Permissions statuses(StatusesEnum statuses) {
        this.statuses = Optional.ofNullable(statuses);
        return this;
    }

    /**
     * Get statuses
     * @return statuses
     */
    @Schema(name = "statuses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("statuses")
    public Optional<StatusesEnum> getStatuses() {
        return statuses;
    }

    public void setStatuses(Optional<StatusesEnum> statuses) {
        this.statuses = statuses;
    }

    public App9Permissions teamDiscussions(TeamDiscussionsEnum teamDiscussions) {
        this.teamDiscussions = Optional.ofNullable(teamDiscussions);
        return this;
    }

    /**
     * Get teamDiscussions
     * @return teamDiscussions
     */
    @Schema(name = "team_discussions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("team_discussions")
    public Optional<TeamDiscussionsEnum> getTeamDiscussions() {
        return teamDiscussions;
    }

    public void setTeamDiscussions(Optional<TeamDiscussionsEnum> teamDiscussions) {
        this.teamDiscussions = teamDiscussions;
    }

    public App9Permissions vulnerabilityAlerts(VulnerabilityAlertsEnum vulnerabilityAlerts) {
        this.vulnerabilityAlerts = Optional.ofNullable(vulnerabilityAlerts);
        return this;
    }

    /**
     * Get vulnerabilityAlerts
     * @return vulnerabilityAlerts
     */
    @Schema(name = "vulnerability_alerts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vulnerability_alerts")
    public Optional<VulnerabilityAlertsEnum> getVulnerabilityAlerts() {
        return vulnerabilityAlerts;
    }

    public void setVulnerabilityAlerts(Optional<VulnerabilityAlertsEnum> vulnerabilityAlerts) {
        this.vulnerabilityAlerts = vulnerabilityAlerts;
    }

    public App9Permissions workflows(WorkflowsEnum workflows) {
        this.workflows = Optional.ofNullable(workflows);
        return this;
    }

    /**
     * Get workflows
     * @return workflows
     */
    @Schema(name = "workflows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflows")
    public Optional<WorkflowsEnum> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(Optional<WorkflowsEnum> workflows) {
        this.workflows = workflows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        App9Permissions app9Permissions = (App9Permissions) o;
        return Objects.equals(this.actions, app9Permissions.actions)
                && Objects.equals(this.administration, app9Permissions.administration)
                && Objects.equals(this.checks, app9Permissions.checks)
                && Objects.equals(this.contentReferences, app9Permissions.contentReferences)
                && Objects.equals(this.contents, app9Permissions.contents)
                && Objects.equals(this.deployments, app9Permissions.deployments)
                && Objects.equals(this.discussions, app9Permissions.discussions)
                && Objects.equals(this.emails, app9Permissions.emails)
                && Objects.equals(this.environments, app9Permissions.environments)
                && Objects.equals(this.issues, app9Permissions.issues)
                && Objects.equals(this.keys, app9Permissions.keys)
                && Objects.equals(this.members, app9Permissions.members)
                && Objects.equals(this.metadata, app9Permissions.metadata)
                && Objects.equals(this.organizationAdministration, app9Permissions.organizationAdministration)
                && Objects.equals(this.organizationHooks, app9Permissions.organizationHooks)
                && Objects.equals(this.organizationPackages, app9Permissions.organizationPackages)
                && Objects.equals(this.organizationPlan, app9Permissions.organizationPlan)
                && Objects.equals(this.organizationProjects, app9Permissions.organizationProjects)
                && Objects.equals(this.organizationSecrets, app9Permissions.organizationSecrets)
                && Objects.equals(this.organizationSelfHostedRunners, app9Permissions.organizationSelfHostedRunners)
                && Objects.equals(this.organizationUserBlocking, app9Permissions.organizationUserBlocking)
                && Objects.equals(this.packages, app9Permissions.packages)
                && Objects.equals(this.pages, app9Permissions.pages)
                && Objects.equals(this.pullRequests, app9Permissions.pullRequests)
                && Objects.equals(this.repositoryHooks, app9Permissions.repositoryHooks)
                && Objects.equals(this.repositoryProjects, app9Permissions.repositoryProjects)
                && Objects.equals(this.secretScanningAlerts, app9Permissions.secretScanningAlerts)
                && Objects.equals(this.secrets, app9Permissions.secrets)
                && Objects.equals(this.securityEvents, app9Permissions.securityEvents)
                && Objects.equals(this.securityScanningAlert, app9Permissions.securityScanningAlert)
                && Objects.equals(this.singleFile, app9Permissions.singleFile)
                && Objects.equals(this.statuses, app9Permissions.statuses)
                && Objects.equals(this.teamDiscussions, app9Permissions.teamDiscussions)
                && Objects.equals(this.vulnerabilityAlerts, app9Permissions.vulnerabilityAlerts)
                && Objects.equals(this.workflows, app9Permissions.workflows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                actions,
                administration,
                checks,
                contentReferences,
                contents,
                deployments,
                discussions,
                emails,
                environments,
                issues,
                keys,
                members,
                metadata,
                organizationAdministration,
                organizationHooks,
                organizationPackages,
                organizationPlan,
                organizationProjects,
                organizationSecrets,
                organizationSelfHostedRunners,
                organizationUserBlocking,
                packages,
                pages,
                pullRequests,
                repositoryHooks,
                repositoryProjects,
                secretScanningAlerts,
                secrets,
                securityEvents,
                securityScanningAlert,
                singleFile,
                statuses,
                teamDiscussions,
                vulnerabilityAlerts,
                workflows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class App9Permissions {\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    administration: ")
                .append(toIndentedString(administration))
                .append("\n");
        sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
        sb.append("    contentReferences: ")
                .append(toIndentedString(contentReferences))
                .append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    deployments: ").append(toIndentedString(deployments)).append("\n");
        sb.append("    discussions: ").append(toIndentedString(discussions)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
        sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
        sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    organizationAdministration: ")
                .append(toIndentedString(organizationAdministration))
                .append("\n");
        sb.append("    organizationHooks: ")
                .append(toIndentedString(organizationHooks))
                .append("\n");
        sb.append("    organizationPackages: ")
                .append(toIndentedString(organizationPackages))
                .append("\n");
        sb.append("    organizationPlan: ")
                .append(toIndentedString(organizationPlan))
                .append("\n");
        sb.append("    organizationProjects: ")
                .append(toIndentedString(organizationProjects))
                .append("\n");
        sb.append("    organizationSecrets: ")
                .append(toIndentedString(organizationSecrets))
                .append("\n");
        sb.append("    organizationSelfHostedRunners: ")
                .append(toIndentedString(organizationSelfHostedRunners))
                .append("\n");
        sb.append("    organizationUserBlocking: ")
                .append(toIndentedString(organizationUserBlocking))
                .append("\n");
        sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
        sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
        sb.append("    repositoryHooks: ")
                .append(toIndentedString(repositoryHooks))
                .append("\n");
        sb.append("    repositoryProjects: ")
                .append(toIndentedString(repositoryProjects))
                .append("\n");
        sb.append("    secretScanningAlerts: ")
                .append(toIndentedString(secretScanningAlerts))
                .append("\n");
        sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
        sb.append("    securityEvents: ")
                .append(toIndentedString(securityEvents))
                .append("\n");
        sb.append("    securityScanningAlert: ")
                .append(toIndentedString(securityScanningAlert))
                .append("\n");
        sb.append("    singleFile: ").append(toIndentedString(singleFile)).append("\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
        sb.append("    teamDiscussions: ")
                .append(toIndentedString(teamDiscussions))
                .append("\n");
        sb.append("    vulnerabilityAlerts: ")
                .append(toIndentedString(vulnerabilityAlerts))
                .append("\n");
        sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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
