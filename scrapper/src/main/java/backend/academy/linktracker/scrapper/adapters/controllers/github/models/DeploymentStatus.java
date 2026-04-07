package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The status of a deployment.
 */
@Schema(name = "deployment-status", description = "The status of a deployment.")
@JsonTypeName("deployment-status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentStatus {

    private URI url;

    private Long id;

    private String nodeId;

    /**
     * The state of the status.
     */
    public enum StateEnum {
        ERROR("error"),

        FAILURE("failure"),

        INACTIVE("inactive"),

        PENDING("pending"),

        SUCCESS("success"),

        QUEUED("queued"),

        IN_PROGRESS("in_progress");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    private JsonNullable<NullableSimpleUser> creator = JsonNullable.<NullableSimpleUser>undefined();

    private String description = "";

    private Optional<String> environment = Optional.of("");

    private URI targetUrl = URI.create("");

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI deploymentUrl;

    private URI repositoryUrl;

    private Optional<URI> environmentUrl = Optional.of(URI.create(""));

    private Optional<URI> logUrl = Optional.of(URI.create(""));

    private JsonNullable<NullableIntegration> performedViaGithubApp = JsonNullable.<NullableIntegration>undefined();

    public DeploymentStatus() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeploymentStatus(
            URI url,
            Long id,
            String nodeId,
            StateEnum state,
            NullableSimpleUser creator,
            String description,
            URI targetUrl,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            URI deploymentUrl,
            URI repositoryUrl) {
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.state = state;
        this.creator = JsonNullable.of(creator);
        this.description = description;
        this.targetUrl = targetUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deploymentUrl = deploymentUrl;
        this.repositoryUrl = repositoryUrl;
    }

    public DeploymentStatus url(URI url) {
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
            example = "https://api.github.com/repos/octocat/example/deployments/42/statuses/1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public DeploymentStatus id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DeploymentStatus nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDE2OkRlcGxveW1lbnRTdGF0dXMx", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public DeploymentStatus state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the status.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            example = "success",
            description = "The state of the status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public DeploymentStatus creator(NullableSimpleUser creator) {
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
    public JsonNullable<NullableSimpleUser> getCreator() {
        return creator;
    }

    public void setCreator(JsonNullable<NullableSimpleUser> creator) {
        this.creator = creator;
    }

    public DeploymentStatus description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short description of the status.
     * @return description
     */
    @NotNull
    @Size(max = 140)
    @Schema(
            name = "description",
            example = "Deployment finished successfully.",
            description = "A short description of the status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DeploymentStatus environment(String environment) {
        this.environment = Optional.ofNullable(environment);
        return this;
    }

    /**
     * The environment of the deployment that the status is for.
     * @return environment
     */
    @Schema(
            name = "environment",
            example = "production",
            description = "The environment of the deployment that the status is for.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment")
    public Optional<String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(Optional<String> environment) {
        this.environment = environment;
    }

    public DeploymentStatus targetUrl(URI targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * Closing down notice: the URL to associate with this status.
     * @return targetUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "target_url",
            example = "https://example.com/deployment/42/output",
            description = "Closing down notice: the URL to associate with this status.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_url")
    public URI getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(URI targetUrl) {
        this.targetUrl = targetUrl;
    }

    public DeploymentStatus createdAt(OffsetDateTime createdAt) {
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

    public DeploymentStatus updatedAt(OffsetDateTime updatedAt) {
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

    public DeploymentStatus deploymentUrl(URI deploymentUrl) {
        this.deploymentUrl = deploymentUrl;
        return this;
    }

    /**
     * Get deploymentUrl
     * @return deploymentUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "deployment_url",
            example = "https://api.github.com/repos/octocat/example/deployments/42",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("deployment_url")
    public URI getDeploymentUrl() {
        return deploymentUrl;
    }

    public void setDeploymentUrl(URI deploymentUrl) {
        this.deploymentUrl = deploymentUrl;
    }

    public DeploymentStatus repositoryUrl(URI repositoryUrl) {
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

    public DeploymentStatus environmentUrl(URI environmentUrl) {
        this.environmentUrl = Optional.ofNullable(environmentUrl);
        return this;
    }

    /**
     * The URL for accessing your environment.
     * @return environmentUrl
     */
    @Valid
    @Schema(
            name = "environment_url",
            example = "https://staging.example.com/",
            description = "The URL for accessing your environment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment_url")
    public Optional<URI> getEnvironmentUrl() {
        return environmentUrl;
    }

    public void setEnvironmentUrl(Optional<URI> environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    public DeploymentStatus logUrl(URI logUrl) {
        this.logUrl = Optional.ofNullable(logUrl);
        return this;
    }

    /**
     * The URL to associate with this status.
     * @return logUrl
     */
    @Valid
    @Schema(
            name = "log_url",
            example = "https://example.com/deployment/42/output",
            description = "The URL to associate with this status.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("log_url")
    public Optional<URI> getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(Optional<URI> logUrl) {
        this.logUrl = logUrl;
    }

    public DeploymentStatus performedViaGithubApp(NullableIntegration performedViaGithubApp) {
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
        DeploymentStatus deploymentStatus = (DeploymentStatus) o;
        return Objects.equals(this.url, deploymentStatus.url)
                && Objects.equals(this.id, deploymentStatus.id)
                && Objects.equals(this.nodeId, deploymentStatus.nodeId)
                && Objects.equals(this.state, deploymentStatus.state)
                && Objects.equals(this.creator, deploymentStatus.creator)
                && Objects.equals(this.description, deploymentStatus.description)
                && Objects.equals(this.environment, deploymentStatus.environment)
                && Objects.equals(this.targetUrl, deploymentStatus.targetUrl)
                && Objects.equals(this.createdAt, deploymentStatus.createdAt)
                && Objects.equals(this.updatedAt, deploymentStatus.updatedAt)
                && Objects.equals(this.deploymentUrl, deploymentStatus.deploymentUrl)
                && Objects.equals(this.repositoryUrl, deploymentStatus.repositoryUrl)
                && Objects.equals(this.environmentUrl, deploymentStatus.environmentUrl)
                && Objects.equals(this.logUrl, deploymentStatus.logUrl)
                && equalsNullable(this.performedViaGithubApp, deploymentStatus.performedViaGithubApp);
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
                state,
                creator,
                description,
                environment,
                targetUrl,
                createdAt,
                updatedAt,
                deploymentUrl,
                repositoryUrl,
                environmentUrl,
                logUrl,
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
        sb.append("class DeploymentStatus {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    deploymentUrl: ").append(toIndentedString(deploymentUrl)).append("\n");
        sb.append("    repositoryUrl: ").append(toIndentedString(repositoryUrl)).append("\n");
        sb.append("    environmentUrl: ")
                .append(toIndentedString(environmentUrl))
                .append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
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
