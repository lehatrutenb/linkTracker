package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookDeploymentReviewRequestedWorkflowJobRun
 */
@JsonTypeName("webhook_deployment_review_requested_workflow_job_run")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentReviewRequestedWorkflowJobRun {

    private JsonNullable<Object> conclusion = JsonNullable.<Object>undefined();

    private String createdAt;

    private String environment;

    private String htmlUrl;

    private Long id;

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private String status;

    private String updatedAt;

    public WebhookDeploymentReviewRequestedWorkflowJobRun() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDeploymentReviewRequestedWorkflowJobRun(
            Object conclusion,
            String createdAt,
            String environment,
            String htmlUrl,
            Long id,
            String name,
            String status,
            String updatedAt) {
        this.conclusion = JsonNullable.of(conclusion);
        this.createdAt = createdAt;
        this.environment = environment;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = JsonNullable.of(name);
        this.status = status;
        this.updatedAt = updatedAt;
    }

    public WebhookDeploymentReviewRequestedWorkflowJobRun conclusion(Object conclusion) {
        this.conclusion = JsonNullable.of(conclusion);
        return this;
    }

    /**
     * Get conclusion
     * @return conclusion
     */
    @NotNull
    @Schema(name = "conclusion", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public JsonNullable<Object> getConclusion() {
        return conclusion;
    }

    public void setConclusion(JsonNullable<Object> conclusion) {
        this.conclusion = conclusion;
    }

    public WebhookDeploymentReviewRequestedWorkflowJobRun createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookDeploymentReviewRequestedWorkflowJobRun environment(String environment) {
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

    public WebhookDeploymentReviewRequestedWorkflowJobRun htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookDeploymentReviewRequestedWorkflowJobRun id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookDeploymentReviewRequestedWorkflowJobRun name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public WebhookDeploymentReviewRequestedWorkflowJobRun status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WebhookDeploymentReviewRequestedWorkflowJobRun updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
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
        WebhookDeploymentReviewRequestedWorkflowJobRun webhookDeploymentReviewRequestedWorkflowJobRun =
                (WebhookDeploymentReviewRequestedWorkflowJobRun) o;
        return Objects.equals(this.conclusion, webhookDeploymentReviewRequestedWorkflowJobRun.conclusion)
                && Objects.equals(this.createdAt, webhookDeploymentReviewRequestedWorkflowJobRun.createdAt)
                && Objects.equals(this.environment, webhookDeploymentReviewRequestedWorkflowJobRun.environment)
                && Objects.equals(this.htmlUrl, webhookDeploymentReviewRequestedWorkflowJobRun.htmlUrl)
                && Objects.equals(this.id, webhookDeploymentReviewRequestedWorkflowJobRun.id)
                && Objects.equals(this.name, webhookDeploymentReviewRequestedWorkflowJobRun.name)
                && Objects.equals(this.status, webhookDeploymentReviewRequestedWorkflowJobRun.status)
                && Objects.equals(this.updatedAt, webhookDeploymentReviewRequestedWorkflowJobRun.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conclusion, createdAt, environment, htmlUrl, id, name, status, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookDeploymentReviewRequestedWorkflowJobRun {\n");
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
