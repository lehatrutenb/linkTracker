package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A request for a specific ref(branch,sha,tag) to be deployed
 */
@Schema(name = "nullable-deployment", description = "A request for a specific ref(branch,sha,tag) to be deployed")
@JsonTypeName("nullable-deployment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableDeployment {

    private URI url;

    private Long id;

    private String nodeId;

    private String sha;

    private String ref;

    private String task;

    private DeploymentPayload payload;

    private String originalEnvironment;

    private String environment;

    private String description = null;

    private NullableSimpleUser creator = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI statusesUrl;

    private URI repositoryUrl;

    private Boolean transientEnvironment;

    private Boolean productionEnvironment;

    private NullableIntegration performedViaGithubApp = null;

    public NullableDeployment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableDeployment(
            URI url,
            Long id,
            String nodeId,
            String sha,
            String ref,
            String task,
            DeploymentPayload payload,
            String environment,
            String description,
            NullableSimpleUser creator,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            URI statusesUrl,
            URI repositoryUrl) {
        this.url = url;
        this.id = id;
        this.nodeId = nodeId;
        this.sha = sha;
        this.ref = ref;
        this.task = task;
        this.payload = payload;
        this.environment = environment;
        this.description = description;
        this.creator = creator;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.statusesUrl = statusesUrl;
        this.repositoryUrl = repositoryUrl;
    }

    public NullableDeployment url(URI url) {
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

    public NullableDeployment id(Long id) {
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

    public NullableDeployment nodeId(String nodeId) {
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

    public NullableDeployment sha(String sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Schema(
            name = "sha",
            example = "a84d88e7554fc1fa21bcbc4efae3c782a70d2b9d",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public String getSha() {
        return sha;
    }

    public void setSha(String sha) {
        this.sha = sha;
    }

    public NullableDeployment ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The ref to deploy. This can be a branch, tag, or sha.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            example = "topic-branch",
            description = "The ref to deploy. This can be a branch, tag, or sha.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public NullableDeployment task(String task) {
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

    public NullableDeployment payload(DeploymentPayload payload) {
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

    public NullableDeployment originalEnvironment(String originalEnvironment) {
        this.originalEnvironment = originalEnvironment;
        return this;
    }

    /**
     * Get originalEnvironment
     * @return originalEnvironment
     */
    @Schema(name = "original_environment", example = "staging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("original_environment")
    public String getOriginalEnvironment() {
        return originalEnvironment;
    }

    public void setOriginalEnvironment(String originalEnvironment) {
        this.originalEnvironment = originalEnvironment;
    }

    public NullableDeployment environment(String environment) {
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

    public NullableDeployment description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", example = "Deploy request from hubot", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NullableDeployment creator(NullableSimpleUser creator) {
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
    public NullableSimpleUser getCreator() {
        return creator;
    }

    public void setCreator(NullableSimpleUser creator) {
        this.creator = creator;
    }

    public NullableDeployment createdAt(OffsetDateTime createdAt) {
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

    public NullableDeployment updatedAt(OffsetDateTime updatedAt) {
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

    public NullableDeployment statusesUrl(URI statusesUrl) {
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

    public NullableDeployment repositoryUrl(URI repositoryUrl) {
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

    public NullableDeployment transientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
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
    public Boolean getTransientEnvironment() {
        return transientEnvironment;
    }

    public void setTransientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
    }

    public NullableDeployment productionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
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
    public Boolean getProductionEnvironment() {
        return productionEnvironment;
    }

    public void setProductionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
    }

    public NullableDeployment performedViaGithubApp(NullableIntegration performedViaGithubApp) {
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
    public NullableIntegration getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(NullableIntegration performedViaGithubApp) {
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
        NullableDeployment nullableDeployment = (NullableDeployment) o;
        return Objects.equals(this.url, nullableDeployment.url)
                && Objects.equals(this.id, nullableDeployment.id)
                && Objects.equals(this.nodeId, nullableDeployment.nodeId)
                && Objects.equals(this.sha, nullableDeployment.sha)
                && Objects.equals(this.ref, nullableDeployment.ref)
                && Objects.equals(this.task, nullableDeployment.task)
                && Objects.equals(this.payload, nullableDeployment.payload)
                && Objects.equals(this.originalEnvironment, nullableDeployment.originalEnvironment)
                && Objects.equals(this.environment, nullableDeployment.environment)
                && Objects.equals(this.description, nullableDeployment.description)
                && Objects.equals(this.creator, nullableDeployment.creator)
                && Objects.equals(this.createdAt, nullableDeployment.createdAt)
                && Objects.equals(this.updatedAt, nullableDeployment.updatedAt)
                && Objects.equals(this.statusesUrl, nullableDeployment.statusesUrl)
                && Objects.equals(this.repositoryUrl, nullableDeployment.repositoryUrl)
                && Objects.equals(this.transientEnvironment, nullableDeployment.transientEnvironment)
                && Objects.equals(this.productionEnvironment, nullableDeployment.productionEnvironment)
                && Objects.equals(this.performedViaGithubApp, nullableDeployment.performedViaGithubApp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url,
                id,
                nodeId,
                sha,
                ref,
                task,
                payload,
                originalEnvironment,
                environment,
                description,
                creator,
                createdAt,
                updatedAt,
                statusesUrl,
                repositoryUrl,
                transientEnvironment,
                productionEnvironment,
                performedViaGithubApp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableDeployment {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    originalEnvironment: ")
                .append(toIndentedString(originalEnvironment))
                .append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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
