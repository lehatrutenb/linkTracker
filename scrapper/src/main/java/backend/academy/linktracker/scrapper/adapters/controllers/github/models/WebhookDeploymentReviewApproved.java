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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookDeploymentReviewApproved
 */
@JsonTypeName("webhook-deployment-review-approved")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentReviewApproved {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        APPROVED("approved");

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

    private WebhooksApprover approver;

    private String comment;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    @Valid
    private List<@Valid WebhooksReviewersInner> reviewers = new ArrayList<>();

    private SimpleUser sender;

    private String since;

    private WebhooksWorkflowJobRun workflowJobRun;

    @Valid
    private List<@Valid WebhookDeploymentReviewApprovedWorkflowJobRunsInner> workflowJobRuns = new ArrayList<>();

    private DeploymentWorkflowRun1 workflowRun = null;

    public WebhookDeploymentReviewApproved() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDeploymentReviewApproved(
            ActionEnum action,
            OrganizationSimpleWebhooks organization,
            RepositoryWebhooks repository,
            SimpleUser sender,
            String since,
            DeploymentWorkflowRun1 workflowRun) {
        this.action = action;
        this.organization = organization;
        this.repository = repository;
        this.sender = sender;
        this.since = since;
        this.workflowRun = workflowRun;
    }

    public WebhookDeploymentReviewApproved action(ActionEnum action) {
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

    public WebhookDeploymentReviewApproved approver(WebhooksApprover approver) {
        this.approver = approver;
        return this;
    }

    /**
     * Get approver
     * @return approver
     */
    @Valid
    @Schema(name = "approver", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("approver")
    public WebhooksApprover getApprover() {
        return approver;
    }

    public void setApprover(WebhooksApprover approver) {
        this.approver = approver;
    }

    public WebhookDeploymentReviewApproved comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     * @return comment
     */
    @Schema(name = "comment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public WebhookDeploymentReviewApproved enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookDeploymentReviewApproved installation(SimpleInstallation installation) {
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

    public WebhookDeploymentReviewApproved organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookDeploymentReviewApproved repository(RepositoryWebhooks repository) {
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

    public WebhookDeploymentReviewApproved reviewers(List<@Valid WebhooksReviewersInner> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public WebhookDeploymentReviewApproved addReviewersItem(WebhooksReviewersInner reviewersItem) {
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

    public WebhookDeploymentReviewApproved sender(SimpleUser sender) {
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

    public WebhookDeploymentReviewApproved since(String since) {
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

    public WebhookDeploymentReviewApproved workflowJobRun(WebhooksWorkflowJobRun workflowJobRun) {
        this.workflowJobRun = workflowJobRun;
        return this;
    }

    /**
     * Get workflowJobRun
     * @return workflowJobRun
     */
    @Valid
    @Schema(name = "workflow_job_run", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflow_job_run")
    public WebhooksWorkflowJobRun getWorkflowJobRun() {
        return workflowJobRun;
    }

    public void setWorkflowJobRun(WebhooksWorkflowJobRun workflowJobRun) {
        this.workflowJobRun = workflowJobRun;
    }

    public WebhookDeploymentReviewApproved workflowJobRuns(
            List<@Valid WebhookDeploymentReviewApprovedWorkflowJobRunsInner> workflowJobRuns) {
        this.workflowJobRuns = workflowJobRuns;
        return this;
    }

    public WebhookDeploymentReviewApproved addWorkflowJobRunsItem(
            WebhookDeploymentReviewApprovedWorkflowJobRunsInner workflowJobRunsItem) {
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
    public List<@Valid WebhookDeploymentReviewApprovedWorkflowJobRunsInner> getWorkflowJobRuns() {
        return workflowJobRuns;
    }

    public void setWorkflowJobRuns(List<@Valid WebhookDeploymentReviewApprovedWorkflowJobRunsInner> workflowJobRuns) {
        this.workflowJobRuns = workflowJobRuns;
    }

    public WebhookDeploymentReviewApproved workflowRun(DeploymentWorkflowRun1 workflowRun) {
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
    public DeploymentWorkflowRun1 getWorkflowRun() {
        return workflowRun;
    }

    public void setWorkflowRun(DeploymentWorkflowRun1 workflowRun) {
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
        WebhookDeploymentReviewApproved webhookDeploymentReviewApproved = (WebhookDeploymentReviewApproved) o;
        return Objects.equals(this.action, webhookDeploymentReviewApproved.action)
                && Objects.equals(this.approver, webhookDeploymentReviewApproved.approver)
                && Objects.equals(this.comment, webhookDeploymentReviewApproved.comment)
                && Objects.equals(this.enterprise, webhookDeploymentReviewApproved.enterprise)
                && Objects.equals(this.installation, webhookDeploymentReviewApproved.installation)
                && Objects.equals(this.organization, webhookDeploymentReviewApproved.organization)
                && Objects.equals(this.repository, webhookDeploymentReviewApproved.repository)
                && Objects.equals(this.reviewers, webhookDeploymentReviewApproved.reviewers)
                && Objects.equals(this.sender, webhookDeploymentReviewApproved.sender)
                && Objects.equals(this.since, webhookDeploymentReviewApproved.since)
                && Objects.equals(this.workflowJobRun, webhookDeploymentReviewApproved.workflowJobRun)
                && Objects.equals(this.workflowJobRuns, webhookDeploymentReviewApproved.workflowJobRuns)
                && Objects.equals(this.workflowRun, webhookDeploymentReviewApproved.workflowRun);
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
        sb.append("class WebhookDeploymentReviewApproved {\n");
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
