package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * The [deployment](https://docs.github.com/rest/deployments/deployments#list-deployments).
 */
@Schema(
        name = "Deployment",
        description = "The [deployment](https://docs.github.com/rest/deployments/deployments#list-deployments).")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Deployment {

    private String createdAt;

    private User creator = null;

    private String description = null;

    private String environment;

    private Long id;

    private String nodeId;

    private String originalEnvironment;

    private DeploymentPayload payload;

    private App5 performedViaGithubApp = null;

    private Boolean productionEnvironment;

    private String ref;

    private URI repositoryUrl;

    private String sha;

    private URI statusesUrl;

    private String task;

    private Boolean transientEnvironment;

    private String updatedAt;

    private URI url;

    public Deployment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Deployment(
            String createdAt,
            User creator,
            String description,
            String environment,
            Long id,
            String nodeId,
            String originalEnvironment,
            DeploymentPayload payload,
            String ref,
            URI repositoryUrl,
            String sha,
            URI statusesUrl,
            String task,
            String updatedAt,
            URI url) {
        this.createdAt = createdAt;
        this.creator = creator;
        this.description = description;
        this.environment = environment;
        this.id = id;
        this.nodeId = nodeId;
        this.originalEnvironment = originalEnvironment;
        this.payload = payload;
        this.ref = ref;
        this.repositoryUrl = repositoryUrl;
        this.sha = sha;
        this.statusesUrl = statusesUrl;
        this.task = task;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public Deployment createdAt(String createdAt) {
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

    public Deployment creator(User creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    @NotNull
    @Valid
    @Schema(name = "creator", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creator")
    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Deployment description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Deployment environment(String environment) {
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

    public Deployment id(Long id) {
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

    public Deployment nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Deployment originalEnvironment(String originalEnvironment) {
        this.originalEnvironment = originalEnvironment;
        return this;
    }

    /**
     * Get originalEnvironment
     * @return originalEnvironment
     */
    @NotNull
    @Schema(name = "original_environment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("original_environment")
    public String getOriginalEnvironment() {
        return originalEnvironment;
    }

    public void setOriginalEnvironment(String originalEnvironment) {
        this.originalEnvironment = originalEnvironment;
    }

    public Deployment payload(DeploymentPayload payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     * @return payload
     */
    @NotNull
    @Valid
    @Schema(name = "payload", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("payload")
    public DeploymentPayload getPayload() {
        return payload;
    }

    public void setPayload(DeploymentPayload payload) {
        this.payload = payload;
    }

    public Deployment performedViaGithubApp(App5 performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @Valid
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("performed_via_github_app")
    public App5 getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(App5 performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public Deployment productionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
        return this;
    }

    /**
     * Get productionEnvironment
     * @return productionEnvironment
     */
    @Schema(name = "production_environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("production_environment")
    public Boolean getProductionEnvironment() {
        return productionEnvironment;
    }

    public void setProductionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
    }

    public Deployment ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @NotNull
    @Schema(name = "ref", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Deployment repositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @NotNull
    @Valid
    @Schema(name = "repository_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_url")
    public URI getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Deployment sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public Deployment statusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @NotNull
    @Valid
    @Schema(name = "statuses_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses_url")
    public URI getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public Deployment task(String task) {
        this.task = task;
        return this;
    }

    /**
     * Get task
     * @return task
     */
    @NotNull
    @Schema(name = "task", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("task")
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Deployment transientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
        return this;
    }

    /**
     * Get transientEnvironment
     * @return transientEnvironment
     */
    @Schema(name = "transient_environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("transient_environment")
    public Boolean getTransientEnvironment() {
        return transientEnvironment;
    }

    public void setTransientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
    }

    public Deployment updatedAt(String updatedAt) {
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

    public Deployment url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Deployment deployment = (Deployment) o;
        return Objects.equals(this.createdAt, deployment.createdAt)
                && Objects.equals(this.creator, deployment.creator)
                && Objects.equals(this.description, deployment.description)
                && Objects.equals(this.environment, deployment.environment)
                && Objects.equals(this.id, deployment.id)
                && Objects.equals(this.nodeId, deployment.nodeId)
                && Objects.equals(this.originalEnvironment, deployment.originalEnvironment)
                && Objects.equals(this.payload, deployment.payload)
                && Objects.equals(this.performedViaGithubApp, deployment.performedViaGithubApp)
                && Objects.equals(this.productionEnvironment, deployment.productionEnvironment)
                && Objects.equals(this.ref, deployment.ref)
                && Objects.equals(this.repositoryUrl, deployment.repositoryUrl)
                && Objects.equals(this.sha, deployment.sha)
                && Objects.equals(this.statusesUrl, deployment.statusesUrl)
                && Objects.equals(this.task, deployment.task)
                && Objects.equals(this.transientEnvironment, deployment.transientEnvironment)
                && Objects.equals(this.updatedAt, deployment.updatedAt)
                && Objects.equals(this.url, deployment.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                createdAt,
                creator,
                description,
                environment,
                id,
                nodeId,
                originalEnvironment,
                payload,
                performedViaGithubApp,
                productionEnvironment,
                ref,
                repositoryUrl,
                sha,
                statusesUrl,
                task,
                transientEnvironment,
                updatedAt,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Deployment {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    originalEnvironment: ")
                .append(toIndentedString(originalEnvironment))
                .append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    productionEnvironment: ")
                .append(toIndentedString(productionEnvironment))
                .append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    transientEnvironment: ")
                .append(toIndentedString(transientEnvironment))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
