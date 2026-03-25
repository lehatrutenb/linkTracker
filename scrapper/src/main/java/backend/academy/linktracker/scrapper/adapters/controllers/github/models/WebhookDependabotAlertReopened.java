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
 * WebhookDependabotAlertReopened
 */
@JsonTypeName("webhook-dependabot-alert-reopened")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDependabotAlertReopened {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REOPENED("reopened");

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

    private DependabotAlert alert;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private EnterpriseWebhooks enterprise;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookDependabotAlertReopened() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDependabotAlertReopened(
            ActionEnum action, DependabotAlert alert, RepositoryWebhooks repository, SimpleUser sender) {
        this.action = action;
        this.alert = alert;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookDependabotAlertReopened action(ActionEnum action) {
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

    public WebhookDependabotAlertReopened alert(DependabotAlert alert) {
        this.alert = alert;
        return this;
    }

    /**
     * Get alert
     * @return alert
     */
    @NotNull
    @Valid
    @Schema(name = "alert", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("alert")
    public DependabotAlert getAlert() {
        return alert;
    }

    public void setAlert(DependabotAlert alert) {
        this.alert = alert;
    }

    public WebhookDependabotAlertReopened installation(SimpleInstallation installation) {
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

    public WebhookDependabotAlertReopened organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookDependabotAlertReopened enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookDependabotAlertReopened repository(RepositoryWebhooks repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookDependabotAlertReopened sender(SimpleUser sender) {
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
        WebhookDependabotAlertReopened webhookDependabotAlertReopened = (WebhookDependabotAlertReopened) o;
        return Objects.equals(this.action, webhookDependabotAlertReopened.action)
                && Objects.equals(this.alert, webhookDependabotAlertReopened.alert)
                && Objects.equals(this.installation, webhookDependabotAlertReopened.installation)
                && Objects.equals(this.organization, webhookDependabotAlertReopened.organization)
                && Objects.equals(this.enterprise, webhookDependabotAlertReopened.enterprise)
                && Objects.equals(this.repository, webhookDependabotAlertReopened.repository)
                && Objects.equals(this.sender, webhookDependabotAlertReopened.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, alert, installation, organization, enterprise, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDependabotAlertReopened {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
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
