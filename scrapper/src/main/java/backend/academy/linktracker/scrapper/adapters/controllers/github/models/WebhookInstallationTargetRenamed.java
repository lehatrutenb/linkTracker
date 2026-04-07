package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookInstallationTargetRenamed
 */
@JsonTypeName("webhook-installation-target-renamed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookInstallationTargetRenamed {

    private WebhookInstallationTargetRenamedAccount account;

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        RENAMED("renamed");

        private final String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ActionEnum action;

    private WebhookInstallationTargetRenamedChanges changes;

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private SimpleInstallation installation;

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    private Optional<SimpleUser> sender = Optional.empty();

    private String targetType;

    public WebhookInstallationTargetRenamed() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookInstallationTargetRenamed(
            WebhookInstallationTargetRenamedAccount account,
            ActionEnum action,
            WebhookInstallationTargetRenamedChanges changes,
            SimpleInstallation installation,
            String targetType) {
        this.account = account;
        this.action = action;
        this.changes = changes;
        this.installation = installation;
        this.targetType = targetType;
    }

    public WebhookInstallationTargetRenamed account(WebhookInstallationTargetRenamedAccount account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     * @return account
     */
    @NotNull
    @Valid
    @Schema(name = "account", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("account")
    public WebhookInstallationTargetRenamedAccount getAccount() {
        return account;
    }

    public void setAccount(WebhookInstallationTargetRenamedAccount account) {
        this.account = account;
    }

    public WebhookInstallationTargetRenamed action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @NotNull
    @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public WebhookInstallationTargetRenamed changes(WebhookInstallationTargetRenamedChanges changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Get changes
     * @return changes
     */
    @NotNull
    @Valid
    @Schema(name = "changes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("changes")
    public WebhookInstallationTargetRenamedChanges getChanges() {
        return changes;
    }

    public void setChanges(WebhookInstallationTargetRenamedChanges changes) {
        this.changes = changes;
    }

    public WebhookInstallationTargetRenamed enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = Optional.ofNullable(enterprise);
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public Optional<EnterpriseWebhooks> getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Optional<EnterpriseWebhooks> enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookInstallationTargetRenamed installation(SimpleInstallation installation) {
        this.installation = installation;
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @NotNull
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("installation")
    public SimpleInstallation getInstallation() {
        return installation;
    }

    public void setInstallation(SimpleInstallation installation) {
        this.installation = installation;
    }

    public WebhookInstallationTargetRenamed organization(OrganizationSimpleWebhooks organization) {
        this.organization = Optional.ofNullable(organization);
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public Optional<OrganizationSimpleWebhooks> getOrganization() {
        return organization;
    }

    public void setOrganization(Optional<OrganizationSimpleWebhooks> organization) {
        this.organization = organization;
    }

    public WebhookInstallationTargetRenamed repository(RepositoryWebhooks repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<RepositoryWebhooks> getRepository() {
        return repository;
    }

    public void setRepository(Optional<RepositoryWebhooks> repository) {
        this.repository = repository;
    }

    public WebhookInstallationTargetRenamed sender(SimpleUser sender) {
        this.sender = Optional.ofNullable(sender);
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sender")
    public Optional<SimpleUser> getSender() {
        return sender;
    }

    public void setSender(Optional<SimpleUser> sender) {
        this.sender = sender;
    }

    public WebhookInstallationTargetRenamed targetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * Get targetType
     * @return targetType
     */
    @NotNull
    @Schema(name = "target_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_type")
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookInstallationTargetRenamed webhookInstallationTargetRenamed = (WebhookInstallationTargetRenamed) o;
        return Objects.equals(this.account, webhookInstallationTargetRenamed.account)
                && Objects.equals(this.action, webhookInstallationTargetRenamed.action)
                && Objects.equals(this.changes, webhookInstallationTargetRenamed.changes)
                && Objects.equals(this.enterprise, webhookInstallationTargetRenamed.enterprise)
                && Objects.equals(this.installation, webhookInstallationTargetRenamed.installation)
                && Objects.equals(this.organization, webhookInstallationTargetRenamed.organization)
                && Objects.equals(this.repository, webhookInstallationTargetRenamed.repository)
                && Objects.equals(this.sender, webhookInstallationTargetRenamed.sender)
                && Objects.equals(this.targetType, webhookInstallationTargetRenamed.targetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                account, action, changes, enterprise, installation, organization, repository, sender, targetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookInstallationTargetRenamed {\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
