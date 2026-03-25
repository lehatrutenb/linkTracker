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
 * WebhookDeploymentStatusCreated
 */
@JsonTypeName("webhook-deployment-status-created")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentStatusCreated {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        CREATED("created");

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

    private WebhookDeploymentStatusCreatedCheckRun checkRun = null;

    private Deployment1 deployment;

    private WebhookDeploymentStatusCreatedDeploymentStatus deploymentStatus;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    private WebhooksWorkflow workflow = null;

    private DeploymentWorkflowRun4 workflowRun = null;

    public WebhookDeploymentStatusCreated() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDeploymentStatusCreated(
            ActionEnum action,
            Deployment1 deployment,
            WebhookDeploymentStatusCreatedDeploymentStatus deploymentStatus,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.action = action;
        this.deployment = deployment;
        this.deploymentStatus = deploymentStatus;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookDeploymentStatusCreated action(ActionEnum action) {
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

    public WebhookDeploymentStatusCreated checkRun(WebhookDeploymentStatusCreatedCheckRun checkRun) {
        this.checkRun = checkRun;
        return this;
    }

    /**
     * Get checkRun
     * @return checkRun
     */
    @Valid
    @Schema(name = "check_run", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("check_run")
    public WebhookDeploymentStatusCreatedCheckRun getCheckRun() {
        return checkRun;
    }

    public void setCheckRun(WebhookDeploymentStatusCreatedCheckRun checkRun) {
        this.checkRun = checkRun;
    }

    public WebhookDeploymentStatusCreated deployment(Deployment1 deployment) {
        this.deployment = deployment;
        return this;
    }

    /**
     * Get deployment
     * @return deployment
     */
    @NotNull
    @Valid
    @Schema(name = "deployment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployment")
    public Deployment1 getDeployment() {
        return deployment;
    }

    public void setDeployment(Deployment1 deployment) {
        this.deployment = deployment;
    }

    public WebhookDeploymentStatusCreated deploymentStatus(
            WebhookDeploymentStatusCreatedDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
        return this;
    }

    /**
     * Get deploymentStatus
     * @return deploymentStatus
     */
    @NotNull
    @Valid
    @Schema(name = "deployment_status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployment_status")
    public WebhookDeploymentStatusCreatedDeploymentStatus getDeploymentStatus() {
        return deploymentStatus;
    }

    public void setDeploymentStatus(WebhookDeploymentStatusCreatedDeploymentStatus deploymentStatus) {
        this.deploymentStatus = deploymentStatus;
    }

    public WebhookDeploymentStatusCreated enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookDeploymentStatusCreated installation(SimpleInstallation installation) {
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

    public WebhookDeploymentStatusCreated organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookDeploymentStatusCreated repository(RepositoryWebhooks repository) {
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

    public WebhookDeploymentStatusCreated sender(SimpleUser sender) {
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

    public WebhookDeploymentStatusCreated workflow(WebhooksWorkflow workflow) {
        this.workflow = workflow;
        return this;
    }

    /**
     * Get workflow
     * @return workflow
     */
    @Valid
    @Schema(name = "workflow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflow")
    public WebhooksWorkflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(WebhooksWorkflow workflow) {
        this.workflow = workflow;
    }

    public WebhookDeploymentStatusCreated workflowRun(DeploymentWorkflowRun4 workflowRun) {
        this.workflowRun = workflowRun;
        return this;
    }

    /**
     * Get workflowRun
     * @return workflowRun
     */
    @Valid
    @Schema(name = "workflow_run", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflow_run")
    public DeploymentWorkflowRun4 getWorkflowRun() {
        return workflowRun;
    }

    public void setWorkflowRun(DeploymentWorkflowRun4 workflowRun) {
        this.workflowRun = workflowRun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookDeploymentStatusCreated webhookDeploymentStatusCreated = (WebhookDeploymentStatusCreated) o;
        return Objects.equals(this.action, webhookDeploymentStatusCreated.action)
                && Objects.equals(this.checkRun, webhookDeploymentStatusCreated.checkRun)
                && Objects.equals(this.deployment, webhookDeploymentStatusCreated.deployment)
                && Objects.equals(this.deploymentStatus, webhookDeploymentStatusCreated.deploymentStatus)
                && Objects.equals(this.enterprise, webhookDeploymentStatusCreated.enterprise)
                && Objects.equals(this.installation, webhookDeploymentStatusCreated.installation)
                && Objects.equals(this.organization, webhookDeploymentStatusCreated.organization)
                && Objects.equals(this.repository, webhookDeploymentStatusCreated.repository)
                && Objects.equals(this.sender, webhookDeploymentStatusCreated.sender)
                && Objects.equals(this.workflow, webhookDeploymentStatusCreated.workflow)
                && Objects.equals(this.workflowRun, webhookDeploymentStatusCreated.workflowRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                checkRun,
                deployment,
                deploymentStatus,
                enterprise,
                installation,
                organization,
                repository,
                sender,
                workflow,
                workflowRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDeploymentStatusCreated {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    checkRun: ").append(toIndentedString(checkRun)).append("\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
        sb.append("    deploymentStatus: ")
                .append(toIndentedString(deploymentStatus))
                .append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    workflow: ").append(toIndentedString(workflow)).append("\n");
        sb.append("    workflowRun: ").append(toIndentedString(workflowRun)).append("\n");
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
