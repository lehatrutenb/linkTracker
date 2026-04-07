package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The [deployment status](https://docs.github.com/rest/deployments/statuses#list-deployment-statuses).
 */
@Schema(
        name = "webhook_deployment_status_created_deployment_status",
        description =
                "The [deployment status](https://docs.github.com/rest/deployments/statuses#list-deployment-statuses).")
@JsonTypeName("webhook_deployment_status_created_deployment_status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentStatusCreatedDeploymentStatus {

    private String createdAt;

    private JsonNullable<User> creator = JsonNullable.<User>undefined();

    private URI deploymentUrl;

    private String description;

    private String environment;

    private Optional<URI> environmentUrl = Optional.empty();

    private Long id;

    private Optional<URI> logUrl = Optional.empty();

    private String nodeId;

    private JsonNullable<App7> performedViaGithubApp = JsonNullable.<App7>undefined();

    private URI repositoryUrl;

    private String state;

    private String targetUrl;

    private String updatedAt;

    private URI url;

    public WebhookDeploymentStatusCreatedDeploymentStatus() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookDeploymentStatusCreatedDeploymentStatus(
            String createdAt,
            User creator,
            URI deploymentUrl,
            String description,
            String environment,
            Long id,
            String nodeId,
            URI repositoryUrl,
            String state,
            String targetUrl,
            String updatedAt,
            URI url) {
        this.createdAt = createdAt;
        this.creator = JsonNullable.of(creator);
        this.deploymentUrl = deploymentUrl;
        this.description = description;
        this.environment = environment;
        this.id = id;
        this.nodeId = nodeId;
        this.repositoryUrl = repositoryUrl;
        this.state = state;
        this.targetUrl = targetUrl;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public WebhookDeploymentStatusCreatedDeploymentStatus createdAt(String createdAt) {
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

    public WebhookDeploymentStatusCreatedDeploymentStatus creator(User creator) {
        this.creator = JsonNullable.of(creator);
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
    public JsonNullable<User> getCreator() {
        return creator;
    }

    public void setCreator(JsonNullable<User> creator) {
        this.creator = creator;
    }

    public WebhookDeploymentStatusCreatedDeploymentStatus deploymentUrl(URI deploymentUrl) {
        this.deploymentUrl = deploymentUrl;
        return this;
    }

    /**
     * Get deploymentUrl
     * @return deploymentUrl
     */
    @NotNull
    @Valid
    @Schema(name = "deployment_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployment_url")
    public URI getDeploymentUrl() {
        return deploymentUrl;
    }

    public void setDeploymentUrl(URI deploymentUrl) {
        this.deploymentUrl = deploymentUrl;
    }

    public WebhookDeploymentStatusCreatedDeploymentStatus description(String description) {
        this.description = description;
        return this;
    }

    /**
     * The optional human-readable description added to the status.
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            description = "The optional human-readable description added to the status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhookDeploymentStatusCreatedDeploymentStatus environment(String environment) {
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

    public WebhookDeploymentStatusCreatedDeploymentStatus environmentUrl(URI environmentUrl) {
        this.environmentUrl = Optional.ofNullable(environmentUrl);
        return this;
    }

    /**
     * Get environmentUrl
     * @return environmentUrl
     */
    @Valid
    @Schema(name = "environment_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment_url")
    public Optional<URI> getEnvironmentUrl() {
        return environmentUrl;
    }

    public void setEnvironmentUrl(Optional<URI> environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    public WebhookDeploymentStatusCreatedDeploymentStatus id(Long id) {
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

    public WebhookDeploymentStatusCreatedDeploymentStatus logUrl(URI logUrl) {
        this.logUrl = Optional.ofNullable(logUrl);
        return this;
    }

    /**
     * Get logUrl
     * @return logUrl
     */
    @Valid
    @Schema(name = "log_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("log_url")
    public Optional<URI> getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(Optional<URI> logUrl) {
        this.logUrl = logUrl;
    }

    public WebhookDeploymentStatusCreatedDeploymentStatus nodeId(String nodeId) {
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

    public WebhookDeploymentStatusCreatedDeploymentStatus performedViaGithubApp(App7 performedViaGithubApp) {
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
    public JsonNullable<App7> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<App7> performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public WebhookDeploymentStatusCreatedDeploymentStatus repositoryUrl(URI repositoryUrl) {
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

    public WebhookDeploymentStatusCreatedDeploymentStatus state(String state) {
        this.state = state;
        return this;
    }

    /**
     * The new state. Can be `pending`, `success`, `failure`, or `error`.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description = "The new state. Can be `pending`, `success`, `failure`, or `error`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public WebhookDeploymentStatusCreatedDeploymentStatus targetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * The optional link added to the status.
     * @return targetUrl
     */
    @NotNull
    @Schema(
            name = "target_url",
            description = "The optional link added to the status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_url")
    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public WebhookDeploymentStatusCreatedDeploymentStatus updatedAt(String updatedAt) {
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

    public WebhookDeploymentStatusCreatedDeploymentStatus url(URI url) {
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
        WebhookDeploymentStatusCreatedDeploymentStatus webhookDeploymentStatusCreatedDeploymentStatus =
                (WebhookDeploymentStatusCreatedDeploymentStatus) o;
        return Objects.equals(this.createdAt, webhookDeploymentStatusCreatedDeploymentStatus.createdAt)
                && Objects.equals(this.creator, webhookDeploymentStatusCreatedDeploymentStatus.creator)
                && Objects.equals(this.deploymentUrl, webhookDeploymentStatusCreatedDeploymentStatus.deploymentUrl)
                && Objects.equals(this.description, webhookDeploymentStatusCreatedDeploymentStatus.description)
                && Objects.equals(this.environment, webhookDeploymentStatusCreatedDeploymentStatus.environment)
                && Objects.equals(this.environmentUrl, webhookDeploymentStatusCreatedDeploymentStatus.environmentUrl)
                && Objects.equals(this.id, webhookDeploymentStatusCreatedDeploymentStatus.id)
                && Objects.equals(this.logUrl, webhookDeploymentStatusCreatedDeploymentStatus.logUrl)
                && Objects.equals(this.nodeId, webhookDeploymentStatusCreatedDeploymentStatus.nodeId)
                && equalsNullable(
                        this.performedViaGithubApp,
                        webhookDeploymentStatusCreatedDeploymentStatus.performedViaGithubApp)
                && Objects.equals(this.repositoryUrl, webhookDeploymentStatusCreatedDeploymentStatus.repositoryUrl)
                && Objects.equals(this.state, webhookDeploymentStatusCreatedDeploymentStatus.state)
                && Objects.equals(this.targetUrl, webhookDeploymentStatusCreatedDeploymentStatus.targetUrl)
                && Objects.equals(this.updatedAt, webhookDeploymentStatusCreatedDeploymentStatus.updatedAt)
                && Objects.equals(this.url, webhookDeploymentStatusCreatedDeploymentStatus.url);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                createdAt,
                creator,
                deploymentUrl,
                description,
                environment,
                environmentUrl,
                id,
                logUrl,
                nodeId,
                hashCodeNullable(performedViaGithubApp),
                repositoryUrl,
                state,
                targetUrl,
                updatedAt,
                url);
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
        sb.append("class WebhookDeploymentStatusCreatedDeploymentStatus {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    deploymentUrl: ").append(toIndentedString(deploymentUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    environmentUrl: ")
                .append(toIndentedString(environmentUrl))
                .append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
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
