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
 * WebhookWorkflowJobInProgress
 */
@JsonTypeName("webhook-workflow-job-in-progress")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookWorkflowJobInProgress {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        IN_PROGRESS("in_progress");

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

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    private WebhookWorkflowJobInProgressWorkflowJob workflowJob;

    private Optional<Deployment> deployment = Optional.empty();

    public WebhookWorkflowJobInProgress() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookWorkflowJobInProgress(
            ActionEnum action,
            RepositoryWebhooks repository,
            SimpleUser sender,
            WebhookWorkflowJobInProgressWorkflowJob workflowJob) {
        this.action = action;
        this.repository = repository;
        this.sender = sender;
        this.workflowJob = workflowJob;
    }

    public WebhookWorkflowJobInProgress action(ActionEnum action) {
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

    public WebhookWorkflowJobInProgress enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookWorkflowJobInProgress installation(SimpleInstallation installation) {
        this.installation = Optional.ofNullable(installation);
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public Optional<SimpleInstallation> getInstallation() {
        return installation;
    }

    public void setInstallation(Optional<SimpleInstallation> installation) {
        this.installation = installation;
    }

    public WebhookWorkflowJobInProgress organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookWorkflowJobInProgress repository(RepositoryWebhooks repository) {
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

    public WebhookWorkflowJobInProgress sender(SimpleUser sender) {
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

    public WebhookWorkflowJobInProgress workflowJob(WebhookWorkflowJobInProgressWorkflowJob workflowJob) {
        this.workflowJob = workflowJob;
        return this;
    }

    /**
     * Get workflowJob
     * @return workflowJob
     */
    @NotNull
    @Valid
    @Schema(name = "workflow_job", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow_job")
    public WebhookWorkflowJobInProgressWorkflowJob getWorkflowJob() {
        return workflowJob;
    }

    public void setWorkflowJob(WebhookWorkflowJobInProgressWorkflowJob workflowJob) {
        this.workflowJob = workflowJob;
    }

    public WebhookWorkflowJobInProgress deployment(Deployment deployment) {
        this.deployment = Optional.ofNullable(deployment);
        return this;
    }

    /**
     * Get deployment
     * @return deployment
     */
    @Valid
    @Schema(name = "deployment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment")
    public Optional<Deployment> getDeployment() {
        return deployment;
    }

    public void setDeployment(Optional<Deployment> deployment) {
        this.deployment = deployment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookWorkflowJobInProgress webhookWorkflowJobInProgress = (WebhookWorkflowJobInProgress) o;
        return Objects.equals(this.action, webhookWorkflowJobInProgress.action)
                && Objects.equals(this.enterprise, webhookWorkflowJobInProgress.enterprise)
                && Objects.equals(this.installation, webhookWorkflowJobInProgress.installation)
                && Objects.equals(this.organization, webhookWorkflowJobInProgress.organization)
                && Objects.equals(this.repository, webhookWorkflowJobInProgress.repository)
                && Objects.equals(this.sender, webhookWorkflowJobInProgress.sender)
                && Objects.equals(this.workflowJob, webhookWorkflowJobInProgress.workflowJob)
                && Objects.equals(this.deployment, webhookWorkflowJobInProgress.deployment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, enterprise, installation, organization, repository, sender, workflowJob, deployment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookWorkflowJobInProgress {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    workflowJob: ").append(toIndentedString(workflowJob)).append("\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
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
