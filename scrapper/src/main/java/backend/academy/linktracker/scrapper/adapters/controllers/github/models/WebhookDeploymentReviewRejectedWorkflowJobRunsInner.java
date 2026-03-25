package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookDeploymentReviewRejectedWorkflowJobRunsInner
 */
@JsonTypeName("webhook_deployment_review_rejected_workflow_job_runs_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentReviewRejectedWorkflowJobRunsInner {

    private String conclusion = null;

    private String createdAt;

    private String environment;

    private String htmlUrl;

    private Long id;

    private String name = null;

    private String status;

    private String updatedAt;

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner conclusion(String conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    /**
     * Get conclusion
     * @return conclusion
     */
    @Schema(name = "conclusion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("conclusion")
    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    @Schema(name = "environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookDeploymentReviewRejectedWorkflowJobRunsInner webhookDeploymentReviewRejectedWorkflowJobRunsInner =
                (WebhookDeploymentReviewRejectedWorkflowJobRunsInner) o;
        return Objects.equals(this.conclusion, webhookDeploymentReviewRejectedWorkflowJobRunsInner.conclusion)
                && Objects.equals(this.createdAt, webhookDeploymentReviewRejectedWorkflowJobRunsInner.createdAt)
                && Objects.equals(this.environment, webhookDeploymentReviewRejectedWorkflowJobRunsInner.environment)
                && Objects.equals(this.htmlUrl, webhookDeploymentReviewRejectedWorkflowJobRunsInner.htmlUrl)
                && Objects.equals(this.id, webhookDeploymentReviewRejectedWorkflowJobRunsInner.id)
                && Objects.equals(this.name, webhookDeploymentReviewRejectedWorkflowJobRunsInner.name)
                && Objects.equals(this.status, webhookDeploymentReviewRejectedWorkflowJobRunsInner.status)
                && Objects.equals(this.updatedAt, webhookDeploymentReviewRejectedWorkflowJobRunsInner.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conclusion, createdAt, environment, htmlUrl, id, name, status, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDeploymentReviewRejectedWorkflowJobRunsInner {\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
