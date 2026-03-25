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
 * WebhookWorkflowRunRequested
 */
@JsonTypeName("webhook-workflow-run-requested")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookWorkflowRunRequested {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REQUESTED("requested");

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

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    private WebhooksWorkflow workflow = null;

    private WorkflowRun2 workflowRun;

    public WebhookWorkflowRunRequested() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookWorkflowRunRequested(
            ActionEnum action,
            RepositoryWebhooks repository,
            SimpleUser sender,
            WebhooksWorkflow workflow,
            WorkflowRun2 workflowRun) {
        this.action = action;
        this.repository = repository;
        this.sender = sender;
        this.workflow = workflow;
        this.workflowRun = workflowRun;
    }

    public WebhookWorkflowRunRequested action(ActionEnum action) {
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

    public WebhookWorkflowRunRequested enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookWorkflowRunRequested installation(SimpleInstallation installation) {
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

    public WebhookWorkflowRunRequested organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookWorkflowRunRequested repository(RepositoryWebhooks repository) {
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

    public WebhookWorkflowRunRequested sender(SimpleUser sender) {
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

    public WebhookWorkflowRunRequested workflow(WebhooksWorkflow workflow) {
        this.workflow = workflow;
        return this;
    }

    /**
     * Get workflow
     * @return workflow
     */
    @NotNull
    @Valid
    @Schema(name = "workflow", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow")
    public WebhooksWorkflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(WebhooksWorkflow workflow) {
        this.workflow = workflow;
    }

    public WebhookWorkflowRunRequested workflowRun(WorkflowRun2 workflowRun) {
        this.workflowRun = workflowRun;
        return this;
    }

    /**
     * Get workflowRun
     * @return workflowRun
     */
    @NotNull
    @Valid
    @Schema(name = "workflow_run", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow_run")
    public WorkflowRun2 getWorkflowRun() {
        return workflowRun;
    }

    public void setWorkflowRun(WorkflowRun2 workflowRun) {
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
        WebhookWorkflowRunRequested webhookWorkflowRunRequested = (WebhookWorkflowRunRequested) o;
        return Objects.equals(this.action, webhookWorkflowRunRequested.action)
                && Objects.equals(this.enterprise, webhookWorkflowRunRequested.enterprise)
                && Objects.equals(this.installation, webhookWorkflowRunRequested.installation)
                && Objects.equals(this.organization, webhookWorkflowRunRequested.organization)
                && Objects.equals(this.repository, webhookWorkflowRunRequested.repository)
                && Objects.equals(this.sender, webhookWorkflowRunRequested.sender)
                && Objects.equals(this.workflow, webhookWorkflowRunRequested.workflow)
                && Objects.equals(this.workflowRun, webhookWorkflowRunRequested.workflowRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enterprise, installation, organization, repository, sender, workflow, workflowRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookWorkflowRunRequested {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
