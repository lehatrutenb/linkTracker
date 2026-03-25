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
 * WebhookProjectCardConverted
 */
@JsonTypeName("webhook-project-card-converted")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectCardConverted {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        CONVERTED("converted");

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

    private WebhookProjectCardConvertedChanges changes;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private WebhooksProjectCard projectCard;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookProjectCardConverted() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectCardConverted(
            ActionEnum action,
            WebhookProjectCardConvertedChanges changes,
            WebhooksProjectCard projectCard,
            SimpleUser sender) {
        this.action = action;
        this.changes = changes;
        this.projectCard = projectCard;
        this.sender = sender;
    }

    public WebhookProjectCardConverted action(ActionEnum action) {
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

    public WebhookProjectCardConverted changes(WebhookProjectCardConvertedChanges changes) {
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
    public WebhookProjectCardConvertedChanges getChanges() {
        return changes;
    }

    public void setChanges(WebhookProjectCardConvertedChanges changes) {
        this.changes = changes;
    }

    public WebhookProjectCardConverted enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public EnterpriseWebhooks getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookProjectCardConverted installation(SimpleInstallation installation) {
        this.installation = installation;
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public SimpleInstallation getInstallation() {
        return installation;
    }

    public void setInstallation(SimpleInstallation installation) {
        this.installation = installation;
    }

    public WebhookProjectCardConverted organization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public OrganizationSimpleWebhooks getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
    }

    public WebhookProjectCardConverted projectCard(WebhooksProjectCard projectCard) {
        this.projectCard = projectCard;
        return this;
    }

    /**
     * Get projectCard
     * @return projectCard
     */
    @NotNull
    @Valid
    @Schema(name = "project_card", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("project_card")
    public WebhooksProjectCard getProjectCard() {
        return projectCard;
    }

    public void setProjectCard(WebhooksProjectCard projectCard) {
        this.projectCard = projectCard;
    }

    public WebhookProjectCardConverted repository(RepositoryWebhooks repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookProjectCardConverted sender(SimpleUser sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @NotNull
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sender")
    public SimpleUser getSender() {
        return sender;
    }

    public void setSender(SimpleUser sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectCardConverted webhookProjectCardConverted = (WebhookProjectCardConverted) o;
        return Objects.equals(this.action, webhookProjectCardConverted.action)
                && Objects.equals(this.changes, webhookProjectCardConverted.changes)
                && Objects.equals(this.enterprise, webhookProjectCardConverted.enterprise)
                && Objects.equals(this.installation, webhookProjectCardConverted.installation)
                && Objects.equals(this.organization, webhookProjectCardConverted.organization)
                && Objects.equals(this.projectCard, webhookProjectCardConverted.projectCard)
                && Objects.equals(this.repository, webhookProjectCardConverted.repository)
                && Objects.equals(this.sender, webhookProjectCardConverted.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, changes, enterprise, installation, organization, projectCard, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectCardConverted {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    projectCard: ").append(toIndentedString(projectCard)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
