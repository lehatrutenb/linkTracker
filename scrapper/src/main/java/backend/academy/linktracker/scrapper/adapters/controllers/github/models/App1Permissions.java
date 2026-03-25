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
 * The set of permissions for the GitHub app
 */
@Schema(name = "App_1_permissions", description = "The set of permissions for the GitHub app")
@JsonTypeName("App_1_permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class App1Permissions {

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

    private ActionsEnum actions;

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

    private AdministrationEnum administration;

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

    private ChecksEnum checks;

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

    private ContentReferencesEnum contentReferences;

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

    private ContentsEnum contents;

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

    private DeploymentsEnum deployments;

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

    private DiscussionsEnum discussions;

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

    private EmailsEnum emails;

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

    private EnvironmentsEnum environments;

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

    private IssuesEnum issues;

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

    private KeysEnum keys;

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

    private MembersEnum members;

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

    private MetadataEnum metadata;

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

    private OrganizationAdministrationEnum organizationAdministration;

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

    private OrganizationHooksEnum organizationHooks;

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

    private OrganizationPackagesEnum organizationPackages;

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

    private OrganizationPlanEnum organizationPlan;

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

    private OrganizationProjectsEnum organizationProjects;

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

    private OrganizationSecretsEnum organizationSecrets;

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

    private OrganizationSelfHostedRunnersEnum organizationSelfHostedRunners;

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

    private OrganizationUserBlockingEnum organizationUserBlocking;

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

    private PackagesEnum packages;

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

    private PagesEnum pages;

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

    private PullRequestsEnum pullRequests;

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

    private RepositoryHooksEnum repositoryHooks;

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

    private RepositoryProjectsEnum repositoryProjects;

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

    private SecretScanningAlertsEnum secretScanningAlerts;

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

    private SecretsEnum secrets;

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

    private SecurityEventsEnum securityEvents;

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

    private SecurityScanningAlertEnum securityScanningAlert;

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

    private SingleFileEnum singleFile;

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

    private StatusesEnum statuses;

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

    private VulnerabilityAlertsEnum vulnerabilityAlerts;

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

    private WorkflowsEnum workflows;

    public App1Permissions actions(ActionsEnum actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get actions
     * @return actions
     */
    @Schema(name = "actions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions")
    public ActionsEnum getActions() {
        return actions;
    }

    public void setActions(ActionsEnum actions) {
        this.actions = actions;
    }

    public App1Permissions administration(AdministrationEnum administration) {
        this.administration = administration;
        return this;
    }

    /**
     * Get administration
     * @return administration
     */
    @Schema(name = "administration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("administration")
    public AdministrationEnum getAdministration() {
        return administration;
    }

    public void setAdministration(AdministrationEnum administration) {
        this.administration = administration;
    }

    public App1Permissions checks(ChecksEnum checks) {
        this.checks = checks;
        return this;
    }

    /**
     * Get checks
     * @return checks
     */
    @Schema(name = "checks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("checks")
    public ChecksEnum getChecks() {
        return checks;
    }

    public void setChecks(ChecksEnum checks) {
        this.checks = checks;
    }

    public App1Permissions contentReferences(ContentReferencesEnum contentReferences) {
        this.contentReferences = contentReferences;
        return this;
    }

    /**
     * Get contentReferences
     * @return contentReferences
     */
    @Schema(name = "content_references", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_references")
    public ContentReferencesEnum getContentReferences() {
        return contentReferences;
    }

    public void setContentReferences(ContentReferencesEnum contentReferences) {
        this.contentReferences = contentReferences;
    }

    public App1Permissions contents(ContentsEnum contents) {
        this.contents = contents;
        return this;
    }

    /**
     * Get contents
     * @return contents
     */
    @Schema(name = "contents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("contents")
    public ContentsEnum getContents() {
        return contents;
    }

    public void setContents(ContentsEnum contents) {
        this.contents = contents;
    }

    public App1Permissions deployments(DeploymentsEnum deployments) {
        this.deployments = deployments;
        return this;
    }

    /**
     * Get deployments
     * @return deployments
     */
    @Schema(name = "deployments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployments")
    public DeploymentsEnum getDeployments() {
        return deployments;
    }

    public void setDeployments(DeploymentsEnum deployments) {
        this.deployments = deployments;
    }

    public App1Permissions discussions(DiscussionsEnum discussions) {
        this.discussions = discussions;
        return this;
    }

    /**
     * Get discussions
     * @return discussions
     */
    @Schema(name = "discussions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("discussions")
    public DiscussionsEnum getDiscussions() {
        return discussions;
    }

    public void setDiscussions(DiscussionsEnum discussions) {
        this.discussions = discussions;
    }

    public App1Permissions emails(EmailsEnum emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Get emails
     * @return emails
     */
    @Schema(name = "emails", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("emails")
    public EmailsEnum getEmails() {
        return emails;
    }

    public void setEmails(EmailsEnum emails) {
        this.emails = emails;
    }

    public App1Permissions environments(EnvironmentsEnum environments) {
        this.environments = environments;
        return this;
    }

    /**
     * Get environments
     * @return environments
     */
    @Schema(name = "environments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environments")
    public EnvironmentsEnum getEnvironments() {
        return environments;
    }

    public void setEnvironments(EnvironmentsEnum environments) {
        this.environments = environments;
    }

    public App1Permissions issues(IssuesEnum issues) {
        this.issues = issues;
        return this;
    }

    /**
     * Get issues
     * @return issues
     */
    @Schema(name = "issues", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues")
    public IssuesEnum getIssues() {
        return issues;
    }

    public void setIssues(IssuesEnum issues) {
        this.issues = issues;
    }

    public App1Permissions keys(KeysEnum keys) {
        this.keys = keys;
        return this;
    }

    /**
     * Get keys
     * @return keys
     */
    @Schema(name = "keys", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("keys")
    public KeysEnum getKeys() {
        return keys;
    }

    public void setKeys(KeysEnum keys) {
        this.keys = keys;
    }

    public App1Permissions members(MembersEnum members) {
        this.members = members;
        return this;
    }

    /**
     * Get members
     * @return members
     */
    @Schema(name = "members", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members")
    public MembersEnum getMembers() {
        return members;
    }

    public void setMembers(MembersEnum members) {
        this.members = members;
    }

    public App1Permissions metadata(MetadataEnum metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    @Schema(name = "metadata", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("metadata")
    public MetadataEnum getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataEnum metadata) {
        this.metadata = metadata;
    }

    public App1Permissions organizationAdministration(OrganizationAdministrationEnum organizationAdministration) {
        this.organizationAdministration = organizationAdministration;
        return this;
    }

    /**
     * Get organizationAdministration
     * @return organizationAdministration
     */
    @Schema(name = "organization_administration", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_administration")
    public OrganizationAdministrationEnum getOrganizationAdministration() {
        return organizationAdministration;
    }

    public void setOrganizationAdministration(OrganizationAdministrationEnum organizationAdministration) {
        this.organizationAdministration = organizationAdministration;
    }

    public App1Permissions organizationHooks(OrganizationHooksEnum organizationHooks) {
        this.organizationHooks = organizationHooks;
        return this;
    }

    /**
     * Get organizationHooks
     * @return organizationHooks
     */
    @Schema(name = "organization_hooks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_hooks")
    public OrganizationHooksEnum getOrganizationHooks() {
        return organizationHooks;
    }

    public void setOrganizationHooks(OrganizationHooksEnum organizationHooks) {
        this.organizationHooks = organizationHooks;
    }

    public App1Permissions organizationPackages(OrganizationPackagesEnum organizationPackages) {
        this.organizationPackages = organizationPackages;
        return this;
    }

    /**
     * Get organizationPackages
     * @return organizationPackages
     */
    @Schema(name = "organization_packages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_packages")
    public OrganizationPackagesEnum getOrganizationPackages() {
        return organizationPackages;
    }

    public void setOrganizationPackages(OrganizationPackagesEnum organizationPackages) {
        this.organizationPackages = organizationPackages;
    }

    public App1Permissions organizationPlan(OrganizationPlanEnum organizationPlan) {
        this.organizationPlan = organizationPlan;
        return this;
    }

    /**
     * Get organizationPlan
     * @return organizationPlan
     */
    @Schema(name = "organization_plan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_plan")
    public OrganizationPlanEnum getOrganizationPlan() {
        return organizationPlan;
    }

    public void setOrganizationPlan(OrganizationPlanEnum organizationPlan) {
        this.organizationPlan = organizationPlan;
    }

    public App1Permissions organizationProjects(OrganizationProjectsEnum organizationProjects) {
        this.organizationProjects = organizationProjects;
        return this;
    }

    /**
     * Get organizationProjects
     * @return organizationProjects
     */
    @Schema(name = "organization_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_projects")
    public OrganizationProjectsEnum getOrganizationProjects() {
        return organizationProjects;
    }

    public void setOrganizationProjects(OrganizationProjectsEnum organizationProjects) {
        this.organizationProjects = organizationProjects;
    }

    public App1Permissions organizationSecrets(OrganizationSecretsEnum organizationSecrets) {
        this.organizationSecrets = organizationSecrets;
        return this;
    }

    /**
     * Get organizationSecrets
     * @return organizationSecrets
     */
    @Schema(name = "organization_secrets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_secrets")
    public OrganizationSecretsEnum getOrganizationSecrets() {
        return organizationSecrets;
    }

    public void setOrganizationSecrets(OrganizationSecretsEnum organizationSecrets) {
        this.organizationSecrets = organizationSecrets;
    }

    public App1Permissions organizationSelfHostedRunners(
            OrganizationSelfHostedRunnersEnum organizationSelfHostedRunners) {
        this.organizationSelfHostedRunners = organizationSelfHostedRunners;
        return this;
    }

    /**
     * Get organizationSelfHostedRunners
     * @return organizationSelfHostedRunners
     */
    @Schema(name = "organization_self_hosted_runners", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_self_hosted_runners")
    public OrganizationSelfHostedRunnersEnum getOrganizationSelfHostedRunners() {
        return organizationSelfHostedRunners;
    }

    public void setOrganizationSelfHostedRunners(OrganizationSelfHostedRunnersEnum organizationSelfHostedRunners) {
        this.organizationSelfHostedRunners = organizationSelfHostedRunners;
    }

    public App1Permissions organizationUserBlocking(OrganizationUserBlockingEnum organizationUserBlocking) {
        this.organizationUserBlocking = organizationUserBlocking;
        return this;
    }

    /**
     * Get organizationUserBlocking
     * @return organizationUserBlocking
     */
    @Schema(name = "organization_user_blocking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_user_blocking")
    public OrganizationUserBlockingEnum getOrganizationUserBlocking() {
        return organizationUserBlocking;
    }

    public void setOrganizationUserBlocking(OrganizationUserBlockingEnum organizationUserBlocking) {
        this.organizationUserBlocking = organizationUserBlocking;
    }

    public App1Permissions packages(PackagesEnum packages) {
        this.packages = packages;
        return this;
    }

    /**
     * Get packages
     * @return packages
     */
    @Schema(name = "packages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("packages")
    public PackagesEnum getPackages() {
        return packages;
    }

    public void setPackages(PackagesEnum packages) {
        this.packages = packages;
    }

    public App1Permissions pages(PagesEnum pages) {
        this.pages = pages;
        return this;
    }

    /**
     * Get pages
     * @return pages
     */
    @Schema(name = "pages", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pages")
    public PagesEnum getPages() {
        return pages;
    }

    public void setPages(PagesEnum pages) {
        this.pages = pages;
    }

    public App1Permissions pullRequests(PullRequestsEnum pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    /**
     * Get pullRequests
     * @return pullRequests
     */
    @Schema(name = "pull_requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_requests")
    public PullRequestsEnum getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(PullRequestsEnum pullRequests) {
        this.pullRequests = pullRequests;
    }

    public App1Permissions repositoryHooks(RepositoryHooksEnum repositoryHooks) {
        this.repositoryHooks = repositoryHooks;
        return this;
    }

    /**
     * Get repositoryHooks
     * @return repositoryHooks
     */
    @Schema(name = "repository_hooks", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_hooks")
    public RepositoryHooksEnum getRepositoryHooks() {
        return repositoryHooks;
    }

    public void setRepositoryHooks(RepositoryHooksEnum repositoryHooks) {
        this.repositoryHooks = repositoryHooks;
    }

    public App1Permissions repositoryProjects(RepositoryProjectsEnum repositoryProjects) {
        this.repositoryProjects = repositoryProjects;
        return this;
    }

    /**
     * Get repositoryProjects
     * @return repositoryProjects
     */
    @Schema(name = "repository_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_projects")
    public RepositoryProjectsEnum getRepositoryProjects() {
        return repositoryProjects;
    }

    public void setRepositoryProjects(RepositoryProjectsEnum repositoryProjects) {
        this.repositoryProjects = repositoryProjects;
    }

    public App1Permissions secretScanningAlerts(SecretScanningAlertsEnum secretScanningAlerts) {
        this.secretScanningAlerts = secretScanningAlerts;
        return this;
    }

    /**
     * Get secretScanningAlerts
     * @return secretScanningAlerts
     */
    @Schema(name = "secret_scanning_alerts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secret_scanning_alerts")
    public SecretScanningAlertsEnum getSecretScanningAlerts() {
        return secretScanningAlerts;
    }

    public void setSecretScanningAlerts(SecretScanningAlertsEnum secretScanningAlerts) {
        this.secretScanningAlerts = secretScanningAlerts;
    }

    public App1Permissions secrets(SecretsEnum secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get secrets
     * @return secrets
     */
    @Schema(name = "secrets", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("secrets")
    public SecretsEnum getSecrets() {
        return secrets;
    }

    public void setSecrets(SecretsEnum secrets) {
        this.secrets = secrets;
    }

    public App1Permissions securityEvents(SecurityEventsEnum securityEvents) {
        this.securityEvents = securityEvents;
        return this;
    }

    /**
     * Get securityEvents
     * @return securityEvents
     */
    @Schema(name = "security_events", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_events")
    public SecurityEventsEnum getSecurityEvents() {
        return securityEvents;
    }

    public void setSecurityEvents(SecurityEventsEnum securityEvents) {
        this.securityEvents = securityEvents;
    }

    public App1Permissions securityScanningAlert(SecurityScanningAlertEnum securityScanningAlert) {
        this.securityScanningAlert = securityScanningAlert;
        return this;
    }

    /**
     * Get securityScanningAlert
     * @return securityScanningAlert
     */
    @Schema(name = "security_scanning_alert", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("security_scanning_alert")
    public SecurityScanningAlertEnum getSecurityScanningAlert() {
        return securityScanningAlert;
    }

    public void setSecurityScanningAlert(SecurityScanningAlertEnum securityScanningAlert) {
        this.securityScanningAlert = securityScanningAlert;
    }

    public App1Permissions singleFile(SingleFileEnum singleFile) {
        this.singleFile = singleFile;
        return this;
    }

    /**
     * Get singleFile
     * @return singleFile
     */
    @Schema(name = "single_file", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("single_file")
    public SingleFileEnum getSingleFile() {
        return singleFile;
    }

    public void setSingleFile(SingleFileEnum singleFile) {
        this.singleFile = singleFile;
    }

    public App1Permissions statuses(StatusesEnum statuses) {
        this.statuses = statuses;
        return this;
    }

    /**
     * Get statuses
     * @return statuses
     */
    @Schema(name = "statuses", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("statuses")
    public StatusesEnum getStatuses() {
        return statuses;
    }

    public void setStatuses(StatusesEnum statuses) {
        this.statuses = statuses;
    }

    public App1Permissions vulnerabilityAlerts(VulnerabilityAlertsEnum vulnerabilityAlerts) {
        this.vulnerabilityAlerts = vulnerabilityAlerts;
        return this;
    }

    /**
     * Get vulnerabilityAlerts
     * @return vulnerabilityAlerts
     */
    @Schema(name = "vulnerability_alerts", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vulnerability_alerts")
    public VulnerabilityAlertsEnum getVulnerabilityAlerts() {
        return vulnerabilityAlerts;
    }

    public void setVulnerabilityAlerts(VulnerabilityAlertsEnum vulnerabilityAlerts) {
        this.vulnerabilityAlerts = vulnerabilityAlerts;
    }

    public App1Permissions workflows(WorkflowsEnum workflows) {
        this.workflows = workflows;
        return this;
    }

    /**
     * Get workflows
     * @return workflows
     */
    @Schema(name = "workflows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflows")
    public WorkflowsEnum getWorkflows() {
        return workflows;
    }

    public void setWorkflows(WorkflowsEnum workflows) {
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
        App1Permissions app1Permissions = (App1Permissions) o;
        return Objects.equals(this.actions, app1Permissions.actions)
                && Objects.equals(this.administration, app1Permissions.administration)
                && Objects.equals(this.checks, app1Permissions.checks)
                && Objects.equals(this.contentReferences, app1Permissions.contentReferences)
                && Objects.equals(this.contents, app1Permissions.contents)
                && Objects.equals(this.deployments, app1Permissions.deployments)
                && Objects.equals(this.discussions, app1Permissions.discussions)
                && Objects.equals(this.emails, app1Permissions.emails)
                && Objects.equals(this.environments, app1Permissions.environments)
                && Objects.equals(this.issues, app1Permissions.issues)
                && Objects.equals(this.keys, app1Permissions.keys)
                && Objects.equals(this.members, app1Permissions.members)
                && Objects.equals(this.metadata, app1Permissions.metadata)
                && Objects.equals(this.organizationAdministration, app1Permissions.organizationAdministration)
                && Objects.equals(this.organizationHooks, app1Permissions.organizationHooks)
                && Objects.equals(this.organizationPackages, app1Permissions.organizationPackages)
                && Objects.equals(this.organizationPlan, app1Permissions.organizationPlan)
                && Objects.equals(this.organizationProjects, app1Permissions.organizationProjects)
                && Objects.equals(this.organizationSecrets, app1Permissions.organizationSecrets)
                && Objects.equals(this.organizationSelfHostedRunners, app1Permissions.organizationSelfHostedRunners)
                && Objects.equals(this.organizationUserBlocking, app1Permissions.organizationUserBlocking)
                && Objects.equals(this.packages, app1Permissions.packages)
                && Objects.equals(this.pages, app1Permissions.pages)
                && Objects.equals(this.pullRequests, app1Permissions.pullRequests)
                && Objects.equals(this.repositoryHooks, app1Permissions.repositoryHooks)
                && Objects.equals(this.repositoryProjects, app1Permissions.repositoryProjects)
                && Objects.equals(this.secretScanningAlerts, app1Permissions.secretScanningAlerts)
                && Objects.equals(this.secrets, app1Permissions.secrets)
                && Objects.equals(this.securityEvents, app1Permissions.securityEvents)
                && Objects.equals(this.securityScanningAlert, app1Permissions.securityScanningAlert)
                && Objects.equals(this.singleFile, app1Permissions.singleFile)
                && Objects.equals(this.statuses, app1Permissions.statuses)
                && Objects.equals(this.vulnerabilityAlerts, app1Permissions.vulnerabilityAlerts)
                && Objects.equals(this.workflows, app1Permissions.workflows);
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
                vulnerabilityAlerts,
                workflows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class App1Permissions {\n");
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
