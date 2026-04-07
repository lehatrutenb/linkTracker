package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A deployment created as the result of an Actions check run from a workflow that references an environment
 */
@Schema(
        name = "deployment-simple",
        description =
                "A deployment created as the result of an Actions check run from a workflow that references an environment")
@JsonTypeName("deployment-simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentSimple {

    private URI url;

    private Long id;

    private String nodeId;

    private String task;

    private Optional<String> originalEnvironment = Optional.empty();

    private String environment;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI statusesUrl;

    private URI repositoryUrl;

    private Optional<Boolean> transientEnvironment = Optional.empty();

    private Optional<Boolean> productionEnvironment = Optional.empty();

    private JsonNullable<NullableIntegration> performedViaGithubApp = JsonNullable.<NullableIntegration>undefined();

    public DeploymentSimple() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeploymentSimple(
            URI url,
            Long id,
            String nodeId,
            String task,
            String environment,
            String description,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            URI statusesUrl,
            URI repositoryUrl) {
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.task = task;
        this.environment = environment;
        this.description = JsonNullable.of(description);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.statusesUrl = statusesUrl;
        this.repositoryUrl = repositoryUrl;
    }

    public DeploymentSimple url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/octocat/example/deployments/1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public DeploymentSimple id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the deployment
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the deployment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeploymentSimple nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEwOkRlcGxveW1lbnQx", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public DeploymentSimple task(String task) {
        this.task = task;
        return this;
    }

    /**
     * Parameter to specify a task to execute
     * @return task
     */
    @NotNull
    @Schema(
            name = "task",
            example = "deploy",
            description = "Parameter to specify a task to execute",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("task")
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public DeploymentSimple originalEnvironment(String originalEnvironment) {
        this.originalEnvironment = Optional.ofNullable(originalEnvironment);
        return this;
    }

    /**
     * Get originalEnvironment
     * @return originalEnvironment
     */
    @Schema(name = "original_environment", example = "staging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("original_environment")
    public Optional<String> getOriginalEnvironment() {
        return originalEnvironment;
    }

    public void setOriginalEnvironment(Optional<String> originalEnvironment) {
        this.originalEnvironment = originalEnvironment;
    }

    public DeploymentSimple environment(String environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Name for the target deployment environment.
     * @return environment
     */
    @NotNull
    @Schema(
            name = "environment",
            example = "production",
            description = "Name for the target deployment environment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environment")
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public DeploymentSimple description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", example = "Deploy request from hubot", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public DeploymentSimple createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2012-07-20T01:19:13Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DeploymentSimple updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2012-07-20T01:19:13Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DeploymentSimple statusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    /**
     * Get statusesUrl
     * @return statusesUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "statuses_url",
            example = "https://api.github.com/repos/octocat/example/deployments/1/statuses",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("statuses_url")
    public URI getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(URI statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public DeploymentSimple repositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get repositoryUrl
     * @return repositoryUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "repository_url",
            example = "https://api.github.com/repos/octocat/example",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_url")
    public URI getRepositoryUrl() {
        return repositoryUrl;
    }

    public void setRepositoryUrl(URI repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public DeploymentSimple transientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = Optional.ofNullable(transientEnvironment);
        return this;
    }

    /**
     * Specifies if the given environment is will no longer exist at some point in the future. Default: false.
     * @return transientEnvironment
     */
    @Schema(
            name = "transient_environment",
            example = "true",
            description =
                    "Specifies if the given environment is will no longer exist at some point in the future. Default: false.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("transient_environment")
    public Optional<Boolean> getTransientEnvironment() {
        return transientEnvironment;
    }

    public void setTransientEnvironment(Optional<Boolean> transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
    }

    public DeploymentSimple productionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = Optional.ofNullable(productionEnvironment);
        return this;
    }

    /**
     * Specifies if the given environment is one that end-users directly interact with. Default: false.
     * @return productionEnvironment
     */
    @Schema(
            name = "production_environment",
            example = "true",
            description =
                    "Specifies if the given environment is one that end-users directly interact with. Default: false.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("production_environment")
    public Optional<Boolean> getProductionEnvironment() {
        return productionEnvironment;
    }

    public void setProductionEnvironment(Optional<Boolean> productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
    }

    public DeploymentSimple performedViaGithubApp(NullableIntegration performedViaGithubApp) {
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @Valid
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("performed_via_github_app")
    public JsonNullable<NullableIntegration> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<NullableIntegration> performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentSimple deploymentSimple = (DeploymentSimple) o;
        return Objects.equals(this.url, deploymentSimple.url)
                && Objects.equals(this.id, deploymentSimple.id)
                && Objects.equals(this.nodeId, deploymentSimple.nodeId)
                && Objects.equals(this.task, deploymentSimple.task)
                && Objects.equals(this.originalEnvironment, deploymentSimple.originalEnvironment)
                && Objects.equals(this.environment, deploymentSimple.environment)
                && Objects.equals(this.description, deploymentSimple.description)
                && Objects.equals(this.createdAt, deploymentSimple.createdAt)
                && Objects.equals(this.updatedAt, deploymentSimple.updatedAt)
                && Objects.equals(this.statusesUrl, deploymentSimple.statusesUrl)
                && Objects.equals(this.repositoryUrl, deploymentSimple.repositoryUrl)
                && Objects.equals(this.transientEnvironment, deploymentSimple.transientEnvironment)
                && Objects.equals(this.productionEnvironment, deploymentSimple.productionEnvironment)
                && equalsNullable(this.performedViaGithubApp, deploymentSimple.performedViaGithubApp);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                id,
                nodeId,
                task,
                originalEnvironment,
                environment,
                description,
                createdAt,
                updatedAt,
                statusesUrl,
                repositoryUrl,
                transientEnvironment,
                productionEnvironment,
                hashCodeNullable(performedViaGithubApp));
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
        sb.append("class DeploymentSimple {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    originalEnvironment: ")
                .append(toIndentedString(originalEnvironment))
                .append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    statusesUrl: ").append(toIndentedString(statusesUrl)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    transientEnvironment: ")
                .append(toIndentedString(transientEnvironment))
                .append("\n");
        sb.append("    productionEnvironment: ")
                .append(toIndentedString(productionEnvironment))
                .append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
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
