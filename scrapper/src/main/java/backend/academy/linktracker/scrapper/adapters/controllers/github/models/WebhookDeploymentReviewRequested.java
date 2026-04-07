package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookDeploymentReviewRequested
 */
@JsonTypeName("webhook-deployment-review-requested")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentReviewRequested {

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

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private String environment;

    private Optional<SimpleInstallation> installation = Optional.empty();

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private JsonNullable<WebhooksUser> requestor = JsonNullable.<WebhooksUser>undefined();

    @Valid
    private List<@Valid WebhookDeploymentReviewRequestedReviewersInner> reviewers = new ArrayList<>();

    private SimpleUser sender;

    private String since;

    private WebhookDeploymentReviewRequestedWorkflowJobRun workflowJobRun;

    private JsonNullable<DeploymentWorkflowRun3> workflowRun = JsonNullable.<DeploymentWorkflowRun3>undefined();

    public WebhookDeploymentReviewRequested() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDeploymentReviewRequested(
            ActionEnum action,
            String environment,
            OrganizationSimpleWebhooks organization,
            RepositoryWebhooks repository,
            WebhooksUser requestor,
            List<@Valid WebhookDeploymentReviewRequestedReviewersInner> reviewers,
            SimpleUser sender,
            String since,
            WebhookDeploymentReviewRequestedWorkflowJobRun workflowJobRun,
            DeploymentWorkflowRun3 workflowRun) {
        this.action = action;
        this.environment = environment;
        this.organization = organization;
        this.repository = repository;
        this.requestor = JsonNullable.of(requestor);
        this.reviewers = reviewers;
        this.sender = sender;
        this.since = since;
        this.workflowJobRun = workflowJobRun;
        this.workflowRun = JsonNullable.of(workflowRun);
    }

    public WebhookDeploymentReviewRequested action(ActionEnum action) {
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

    public WebhookDeploymentReviewRequested enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookDeploymentReviewRequested environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    @NotNull
    @Schema(name = "environment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public WebhookDeploymentReviewRequested installation(SimpleInstallation installation) {
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

    public WebhookDeploymentReviewRequested organization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @NotNull
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization")
    public OrganizationSimpleWebhooks getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
    }

    public WebhookDeploymentReviewRequested repository(RepositoryWebhooks repository) {
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

    public WebhookDeploymentReviewRequested requestor(WebhooksUser requestor) {
        this.requestor = JsonNullable.of(requestor);
        return this;
    }

    /**
     * Get requestor
     * @return requestor
     */
    @NotNull
    @Valid
    @Schema(name = "requestor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("requestor")
    public JsonNullable<WebhooksUser> getRequestor() {
        return requestor;
    }

    public void setRequestor(JsonNullable<WebhooksUser> requestor) {
        this.requestor = requestor;
    }

    public WebhookDeploymentReviewRequested reviewers(
            List<@Valid WebhookDeploymentReviewRequestedReviewersInner> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public WebhookDeploymentReviewRequested addReviewersItem(
            WebhookDeploymentReviewRequestedReviewersInner reviewersItem) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        this.reviewers.add(reviewersItem);
        return this;
    }

    /**
     * Get reviewers
     * @return reviewers
     */
    @NotNull
    @Valid
    @Schema(name = "reviewers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reviewers")
    public List<@Valid WebhookDeploymentReviewRequestedReviewersInner> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<@Valid WebhookDeploymentReviewRequestedReviewersInner> reviewers) {
        this.reviewers = reviewers;
    }

    public WebhookDeploymentReviewRequested sender(SimpleUser sender) {
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

    public WebhookDeploymentReviewRequested since(String since) {
        this.since = since;
        return this;
    }

    /**
     * Get since
     * @return since
     */
    @NotNull
    @Schema(name = "since", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("since")
    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public WebhookDeploymentReviewRequested workflowJobRun(
            WebhookDeploymentReviewRequestedWorkflowJobRun workflowJobRun) {
        this.workflowJobRun = workflowJobRun;
        return this;
    }

    /**
     * Get workflowJobRun
     * @return workflowJobRun
     */
    @NotNull
    @Valid
    @Schema(name = "workflow_job_run", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow_job_run")
    public WebhookDeploymentReviewRequestedWorkflowJobRun getWorkflowJobRun() {
        return workflowJobRun;
    }

    public void setWorkflowJobRun(WebhookDeploymentReviewRequestedWorkflowJobRun workflowJobRun) {
        this.workflowJobRun = workflowJobRun;
    }

    public WebhookDeploymentReviewRequested workflowRun(DeploymentWorkflowRun3 workflowRun) {
        this.workflowRun = JsonNullable.of(workflowRun);
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
    public JsonNullable<DeploymentWorkflowRun3> getWorkflowRun() {
        return workflowRun;
    }

    public void setWorkflowRun(JsonNullable<DeploymentWorkflowRun3> workflowRun) {
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
        WebhookDeploymentReviewRequested webhookDeploymentReviewRequested = (WebhookDeploymentReviewRequested) o;
        return Objects.equals(this.action, webhookDeploymentReviewRequested.action)
                && Objects.equals(this.enterprise, webhookDeploymentReviewRequested.enterprise)
                && Objects.equals(this.environment, webhookDeploymentReviewRequested.environment)
                && Objects.equals(this.installation, webhookDeploymentReviewRequested.installation)
                && Objects.equals(this.organization, webhookDeploymentReviewRequested.organization)
                && Objects.equals(this.repository, webhookDeploymentReviewRequested.repository)
                && Objects.equals(this.requestor, webhookDeploymentReviewRequested.requestor)
                && Objects.equals(this.reviewers, webhookDeploymentReviewRequested.reviewers)
                && Objects.equals(this.sender, webhookDeploymentReviewRequested.sender)
                && Objects.equals(this.since, webhookDeploymentReviewRequested.since)
                && Objects.equals(this.workflowJobRun, webhookDeploymentReviewRequested.workflowJobRun)
                && Objects.equals(this.workflowRun, webhookDeploymentReviewRequested.workflowRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                enterprise,
                environment,
                installation,
                organization,
                repository,
                requestor,
                reviewers,
                sender,
                since,
                workflowJobRun,
                workflowRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDeploymentReviewRequested {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    requestor: ").append(toIndentedString(requestor)).append("\n");
        sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    since: ").append(toIndentedString(since)).append("\n");
        sb.append("    workflowJobRun: ")
                .append(toIndentedString(workflowJobRun))
                .append("\n");
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
