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
 * WebhookDeploymentReviewRejected
 */
@JsonTypeName("webhook-deployment-review-rejected")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentReviewRejected {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REJECTED("rejected");

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

    private Optional<WebhooksApprover> approver = Optional.empty();

    private Optional<String> comment = Optional.empty();

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    @Valid
    private List<@Valid WebhooksReviewersInner> reviewers = new ArrayList<>();

    private SimpleUser sender;

    private String since;

    private Optional<WebhooksWorkflowJobRun> workflowJobRun = Optional.empty();

    @Valid
    private List<@Valid WebhookDeploymentReviewRejectedWorkflowJobRunsInner> workflowJobRuns = new ArrayList<>();

    private JsonNullable<DeploymentWorkflowRun2> workflowRun = JsonNullable.<DeploymentWorkflowRun2>undefined();

    public WebhookDeploymentReviewRejected() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDeploymentReviewRejected(
            ActionEnum action,
            OrganizationSimpleWebhooks organization,
            RepositoryWebhooks repository,
            SimpleUser sender,
            String since,
            DeploymentWorkflowRun2 workflowRun) {
        this.action = action;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
        this.since = since;
        this.workflowRun = JsonNullable.of(workflowRun);
    }

    public WebhookDeploymentReviewRejected action(ActionEnum action) {
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

    public WebhookDeploymentReviewRejected approver(WebhooksApprover approver) {
        this.approver = Optional.ofNullable(approver);
        return this;
    }

    /**
     * Get approver
     * @return approver
     */
    @Valid
    @Schema(name = "approver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("approver")
    public Optional<WebhooksApprover> getApprover() {
        return approver;
    }

    public void setApprover(Optional<WebhooksApprover> approver) {
        this.approver = approver;
    }

    public WebhookDeploymentReviewRejected comment(String comment) {
        this.comment = Optional.ofNullable(comment);
        return this;
    }

    /**
     * Get comment
     * @return comment
     */
    @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comment")
    public Optional<String> getComment() {
        return comment;
    }

    public void setComment(Optional<String> comment) {
        this.comment = comment;
    }

    public WebhookDeploymentReviewRejected enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookDeploymentReviewRejected installation(SimpleInstallation installation) {
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

    public WebhookDeploymentReviewRejected organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookDeploymentReviewRejected repository(RepositoryWebhooks repository) {
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

    public WebhookDeploymentReviewRejected reviewers(List<@Valid WebhooksReviewersInner> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public WebhookDeploymentReviewRejected addReviewersItem(WebhooksReviewersInner reviewersItem) {
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
    @Valid
    @Schema(name = "reviewers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reviewers")
    public List<@Valid WebhooksReviewersInner> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<@Valid WebhooksReviewersInner> reviewers) {
        this.reviewers = reviewers;
    }

    public WebhookDeploymentReviewRejected sender(SimpleUser sender) {
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

    public WebhookDeploymentReviewRejected since(String since) {
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

    public WebhookDeploymentReviewRejected workflowJobRun(WebhooksWorkflowJobRun workflowJobRun) {
        this.workflowJobRun = Optional.ofNullable(workflowJobRun);
        return this;
    }

    /**
     * Get workflowJobRun
     * @return workflowJobRun
     */
    @Valid
    @Schema(name = "workflow_job_run", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflow_job_run")
    public Optional<WebhooksWorkflowJobRun> getWorkflowJobRun() {
        return workflowJobRun;
    }

    public void setWorkflowJobRun(Optional<WebhooksWorkflowJobRun> workflowJobRun) {
        this.workflowJobRun = workflowJobRun;
    }

    public WebhookDeploymentReviewRejected workflowJobRuns(
            List<@Valid WebhookDeploymentReviewRejectedWorkflowJobRunsInner> workflowJobRuns) {
        this.workflowJobRuns = workflowJobRuns;
        return this;
    }

    public WebhookDeploymentReviewRejected addWorkflowJobRunsItem(
            WebhookDeploymentReviewRejectedWorkflowJobRunsInner workflowJobRunsItem) {
        if (this.workflowJobRuns == null) {
            this.workflowJobRuns = new ArrayList<>();
        }
        this.workflowJobRuns.add(workflowJobRunsItem);
        return this;
    }

    /**
     * Get workflowJobRuns
     * @return workflowJobRuns
     */
    @Valid
    @Schema(name = "workflow_job_runs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflow_job_runs")
    public List<@Valid WebhookDeploymentReviewRejectedWorkflowJobRunsInner> getWorkflowJobRuns() {
        return workflowJobRuns;
    }

    public void setWorkflowJobRuns(List<@Valid WebhookDeploymentReviewRejectedWorkflowJobRunsInner> workflowJobRuns) {
        this.workflowJobRuns = workflowJobRuns;
    }

    public WebhookDeploymentReviewRejected workflowRun(DeploymentWorkflowRun2 workflowRun) {
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
    public JsonNullable<DeploymentWorkflowRun2> getWorkflowRun() {
        return workflowRun;
    }

    public void setWorkflowRun(JsonNullable<DeploymentWorkflowRun2> workflowRun) {
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
        WebhookDeploymentReviewRejected webhookDeploymentReviewRejected = (WebhookDeploymentReviewRejected) o;
        return Objects.equals(this.action, webhookDeploymentReviewRejected.action)
                && Objects.equals(this.approver, webhookDeploymentReviewRejected.approver)
                && Objects.equals(this.comment, webhookDeploymentReviewRejected.comment)
                && Objects.equals(this.enterprise, webhookDeploymentReviewRejected.enterprise)
                && Objects.equals(this.installation, webhookDeploymentReviewRejected.installation)
                && Objects.equals(this.organization, webhookDeploymentReviewRejected.organization)
                && Objects.equals(this.repository, webhookDeploymentReviewRejected.repository)
                && Objects.equals(this.reviewers, webhookDeploymentReviewRejected.reviewers)
                && Objects.equals(this.sender, webhookDeploymentReviewRejected.sender)
                && Objects.equals(this.since, webhookDeploymentReviewRejected.since)
                && Objects.equals(this.workflowJobRun, webhookDeploymentReviewRejected.workflowJobRun)
                && Objects.equals(this.workflowJobRuns, webhookDeploymentReviewRejected.workflowJobRuns)
                && Objects.equals(this.workflowRun, webhookDeploymentReviewRejected.workflowRun);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                approver,
                comment,
                enterprise,
                installation,
                organization,
                repository,
                reviewers,
                sender,
                since,
                workflowJobRun,
                workflowJobRuns,
                workflowRun);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDeploymentReviewRejected {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    approver: ").append(toIndentedString(approver)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    since: ").append(toIndentedString(since)).append("\n");
        sb.append("    workflowJobRun: ")
                .append(toIndentedString(workflowJobRun))
                .append("\n");
        sb.append("    workflowJobRuns: ")
                .append(toIndentedString(workflowJobRuns))
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
