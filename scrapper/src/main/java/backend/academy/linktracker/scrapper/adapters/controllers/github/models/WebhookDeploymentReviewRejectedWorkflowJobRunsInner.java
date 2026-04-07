package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookDeploymentReviewRejectedWorkflowJobRunsInner
 */
@JsonTypeName("webhook_deployment_review_rejected_workflow_job_runs_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentReviewRejectedWorkflowJobRunsInner {

    private JsonNullable<String> conclusion = JsonNullable.<String>undefined();

    private Optional<String> createdAt = Optional.empty();

    private Optional<String> environment = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private Optional<String> status = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner conclusion(String conclusion) {
        this.conclusion = JsonNullable.of(conclusion);
        return this;
    }

    /**
     * Get conclusion
     * @return conclusion
     */
    @Schema(name = "conclusion", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("conclusion")
    public JsonNullable<String> getConclusion() {
        return conclusion;
    }

    public void setConclusion(JsonNullable<String> conclusion) {
        this.conclusion = conclusion;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner createdAt(String createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner environment(String environment) {
        this.environment = Optional.ofNullable(environment);
        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    @Schema(name = "environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment")
    public Optional<String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(Optional<String> environment) {
        this.environment = environment;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner status(String status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<String> getStatus() {
        return status;
    }

    public void setStatus(Optional<String> status) {
        this.status = status;
    }

    public WebhookDeploymentReviewRejectedWorkflowJobRunsInner updatedAt(String updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<String> updatedAt) {
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
        return equalsNullable(this.conclusion, webhookDeploymentReviewRejectedWorkflowJobRunsInner.conclusion)
                && Objects.equals(this.createdAt, webhookDeploymentReviewRejectedWorkflowJobRunsInner.createdAt)
                && Objects.equals(this.environment, webhookDeploymentReviewRejectedWorkflowJobRunsInner.environment)
                && Objects.equals(this.htmlUrl, webhookDeploymentReviewRejectedWorkflowJobRunsInner.htmlUrl)
                && Objects.equals(this.id, webhookDeploymentReviewRejectedWorkflowJobRunsInner.id)
                && equalsNullable(this.name, webhookDeploymentReviewRejectedWorkflowJobRunsInner.name)
                && Objects.equals(this.status, webhookDeploymentReviewRejectedWorkflowJobRunsInner.status)
                && Objects.equals(this.updatedAt, webhookDeploymentReviewRejectedWorkflowJobRunsInner.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(conclusion),
                createdAt,
                environment,
                htmlUrl,
                id,
                hashCodeNullable(name),
                status,
                updatedAt);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
