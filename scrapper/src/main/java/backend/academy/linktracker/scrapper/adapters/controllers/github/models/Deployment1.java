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
 * The [deployment](https://docs.github.com/rest/deployments/deployments#list-deployments).
 */
@Schema(
        name = "Deployment_1",
        description = "The [deployment](https://docs.github.com/rest/deployments/deployments#list-deployments).")
@JsonTypeName("Deployment_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Deployment1 {

    private String createdAt;

    private JsonNullable<User> creator = JsonNullable.<User>undefined();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private String environment;

    private Long id;

    private String nodeId;

    private String originalEnvironment;

    private JsonNullable<Deployment1Payload> payload = JsonNullable.<Deployment1Payload>undefined();

    private JsonNullable<App6> performedViaGithubApp = JsonNullable.<App6>undefined();

    private Optional<Boolean> productionEnvironment = Optional.empty();

    private String ref;

    private URI repositoryUrl;

    private String sha;

    private URI statusesUrl;

    private String task;

    private Optional<Boolean> transientEnvironment = Optional.empty();

    private String updatedAt;

    private URI url;

    public Deployment1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Deployment1(
            String createdAt,
            User creator,
            String description,
            String environment,
            Long id,
            String nodeId,
            String originalEnvironment,
            Deployment1Payload payload,
            String ref,
            URI repositoryUrl,
            String sha,
            URI statusesUrl,
            String task,
            String updatedAt,
            URI url) {
        this.createdAt = createdAt;
        this.creator = JsonNullable.of(creator);
        this.description = JsonNullable.of(description);
        this.environment = environment;
        this.id = id;
        this.nodeId = nodeId;
        this.originalEnvironment = originalEnvironment;
        this.payload = JsonNullable.of(payload);
        this.ref = ref;
        this.repositoryUrl = repositoryUrl;
        this.sha = sha;
        this.statusesUrl = statusesUrl;
        this.task = task;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public Deployment1 createdAt(String createdAt) {
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

    public Deployment1 creator(User creator) {
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

    public Deployment1 description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public Deployment1 environment(String environment) {
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

    public Deployment1 id(Long id) {
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

    public Deployment1 nodeId(String nodeId) {
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

    public Deployment1 originalEnvironment(String originalEnvironment) {
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

    public Deployment1 payload(Deployment1Payload payload) {
        this.payload = JsonNullable.of(payload);
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
    public JsonNullable<Deployment1Payload> getPayload() {
        return payload;
    }

    public void setPayload(JsonNullable<Deployment1Payload> payload) {
        this.payload = payload;
    }

    public Deployment1 performedViaGithubApp(App6 performedViaGithubApp) {
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
    public JsonNullable<App6> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<App6> performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public Deployment1 productionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = Optional.ofNullable(productionEnvironment);
        return this;
    }

    /**
     * Get productionEnvironment
     * @return productionEnvironment
     */
    @Schema(name = "production_environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("production_environment")
    public Optional<Boolean> getProductionEnvironment() {
        return productionEnvironment;
    }

    public void setProductionEnvironment(Optional<Boolean> productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
    }

    public Deployment1 ref(String ref) {
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

    public Deployment1 repositoryUrl(URI repositoryUrl) {
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

    public Deployment1 sha(String sha) {
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

    public Deployment1 statusesUrl(URI statusesUrl) {
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

    public Deployment1 task(String task) {
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

    public Deployment1 transientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = Optional.ofNullable(transientEnvironment);
        return this;
    }

    /**
     * Get transientEnvironment
     * @return transientEnvironment
     */
    @Schema(name = "transient_environment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("transient_environment")
    public Optional<Boolean> getTransientEnvironment() {
        return transientEnvironment;
    }

    public void setTransientEnvironment(Optional<Boolean> transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
    }

    public Deployment1 updatedAt(String updatedAt) {
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

    public Deployment1 url(URI url) {
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
        Deployment1 deployment1 = (Deployment1) o;
        return Objects.equals(this.createdAt, deployment1.createdAt)
                && Objects.equals(this.creator, deployment1.creator)
                && Objects.equals(this.description, deployment1.description)
                && Objects.equals(this.environment, deployment1.environment)
                && Objects.equals(this.id, deployment1.id)
                && Objects.equals(this.nodeId, deployment1.nodeId)
                && Objects.equals(this.originalEnvironment, deployment1.originalEnvironment)
                && Objects.equals(this.payload, deployment1.payload)
                && equalsNullable(this.performedViaGithubApp, deployment1.performedViaGithubApp)
                && Objects.equals(this.productionEnvironment, deployment1.productionEnvironment)
                && Objects.equals(this.ref, deployment1.ref)
                && Objects.equals(this.repositoryUrl, deployment1.repositoryUrl)
                && Objects.equals(this.sha, deployment1.sha)
                && Objects.equals(this.statusesUrl, deployment1.statusesUrl)
                && Objects.equals(this.task, deployment1.task)
                && Objects.equals(this.transientEnvironment, deployment1.transientEnvironment)
                && Objects.equals(this.updatedAt, deployment1.updatedAt)
                && Objects.equals(this.url, deployment1.url);
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
                description,
                environment,
                id,
                nodeId,
                originalEnvironment,
                payload,
                hashCodeNullable(performedViaGithubApp),
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

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Deployment1 {\n");
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
