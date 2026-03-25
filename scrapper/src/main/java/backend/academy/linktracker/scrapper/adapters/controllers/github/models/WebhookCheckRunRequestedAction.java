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
 * WebhookCheckRunRequestedAction
 */
@JsonTypeName("webhook-check-run-requested-action")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCheckRunRequestedAction {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REQUESTED_ACTION("requested_action");

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

    private CheckRunWithSimpleCheckSuite checkRun;

    private SimpleInstallation installation;

    private EnterpriseWebhooks enterprise;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private WebhookCheckRunRequestedActionRequestedAction requestedAction;

    private SimpleUser sender;

    public WebhookCheckRunRequestedAction() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCheckRunRequestedAction(
            ActionEnum action,
            CheckRunWithSimpleCheckSuite checkRun,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.action = action;
        this.checkRun = checkRun;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookCheckRunRequestedAction action(ActionEnum action) {
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

    public WebhookCheckRunRequestedAction checkRun(CheckRunWithSimpleCheckSuite checkRun) {
        this.checkRun = checkRun;
        return this;
    }

    /**
     * Get checkRun
     * @return checkRun
     */
    @NotNull
    @Valid
    @Schema(name = "check_run", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_run")
    public CheckRunWithSimpleCheckSuite getCheckRun() {
        return checkRun;
    }

    public void setCheckRun(CheckRunWithSimpleCheckSuite checkRun) {
        this.checkRun = checkRun;
    }

    public WebhookCheckRunRequestedAction installation(SimpleInstallation installation) {
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

    public WebhookCheckRunRequestedAction enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookCheckRunRequestedAction organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookCheckRunRequestedAction repository(RepositoryWebhooks repository) {
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

    public WebhookCheckRunRequestedAction requestedAction(
            WebhookCheckRunRequestedActionRequestedAction requestedAction) {
        this.requestedAction = requestedAction;
        return this;
    }

    /**
     * Get requestedAction
     * @return requestedAction
     */
    @Valid
    @Schema(name = "requested_action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("requested_action")
    public WebhookCheckRunRequestedActionRequestedAction getRequestedAction() {
        return requestedAction;
    }

    public void setRequestedAction(WebhookCheckRunRequestedActionRequestedAction requestedAction) {
        this.requestedAction = requestedAction;
    }

    public WebhookCheckRunRequestedAction sender(SimpleUser sender) {
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
        WebhookCheckRunRequestedAction webhookCheckRunRequestedAction = (WebhookCheckRunRequestedAction) o;
        return Objects.equals(this.action, webhookCheckRunRequestedAction.action)
                && Objects.equals(this.checkRun, webhookCheckRunRequestedAction.checkRun)
                && Objects.equals(this.installation, webhookCheckRunRequestedAction.installation)
                && Objects.equals(this.enterprise, webhookCheckRunRequestedAction.enterprise)
                && Objects.equals(this.organization, webhookCheckRunRequestedAction.organization)
                && Objects.equals(this.repository, webhookCheckRunRequestedAction.repository)
                && Objects.equals(this.requestedAction, webhookCheckRunRequestedAction.requestedAction)
                && Objects.equals(this.sender, webhookCheckRunRequestedAction.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, checkRun, installation, enterprise, organization, repository, requestedAction, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCheckRunRequestedAction {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    checkRun: ").append(toIndentedString(checkRun)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    requestedAction: ")
                .append(toIndentedString(requestedAction))
                .append("\n");
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
