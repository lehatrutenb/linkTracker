package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ReposCreateDeploymentRequest
 */
@JsonTypeName("repos_create_deployment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateDeploymentRequest {

    private String ref;

    private Optional<String> task = Optional.of("deploy");

    private Optional<Boolean> autoMerge = Optional.of(true);

    @Valid
    private List<String> requiredContexts = new ArrayList<>();

    private Optional<ReposCreateDeploymentRequestPayload> payload = Optional.empty();

    private Optional<String> environment = Optional.of("production");

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private Optional<Boolean> transientEnvironment = Optional.of(false);

    private Optional<Boolean> productionEnvironment = Optional.empty();

    public ReposCreateDeploymentRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateDeploymentRequest(String ref) {
        this.ref = ref;
    }

    public ReposCreateDeploymentRequest ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * The ref to deploy. This can be a branch, tag, or SHA.
     * @return ref
     */
    @NotNull
    @Schema(
            name = "ref",
            description = "The ref to deploy. This can be a branch, tag, or SHA.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public ReposCreateDeploymentRequest task(String task) {
        this.task = Optional.ofNullable(task);
        return this;
    }

    /**
     * Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).
     * @return task
     */
    @Schema(
            name = "task",
            description = "Specifies a task to execute (e.g., `deploy` or `deploy:migrations`).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("task")
    public Optional<String> getTask() {
        return task;
    }

    public void setTask(Optional<String> task) {
        this.task = task;
    }

    public ReposCreateDeploymentRequest autoMerge(Boolean autoMerge) {
        this.autoMerge = Optional.ofNullable(autoMerge);
        return this;
    }

    /**
     * Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.
     * @return autoMerge
     */
    @Schema(
            name = "auto_merge",
            description =
                    "Attempts to automatically merge the default branch into the requested ref, if it's behind the default branch.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("auto_merge")
    public Optional<Boolean> getAutoMerge() {
        return autoMerge;
    }

    public void setAutoMerge(Optional<Boolean> autoMerge) {
        this.autoMerge = autoMerge;
    }

    public ReposCreateDeploymentRequest requiredContexts(List<String> requiredContexts) {
        this.requiredContexts = requiredContexts;
        return this;
    }

    public ReposCreateDeploymentRequest addRequiredContextsItem(String requiredContextsItem) {
        if (this.requiredContexts == null) {
            this.requiredContexts = new ArrayList<>();
        }
        this.requiredContexts.add(requiredContextsItem);
        return this;
    }

    /**
     * The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts.
     * @return requiredContexts
     */
    @Schema(
            name = "required_contexts",
            description =
                    "The [status](https://docs.github.com/rest/commits/statuses) contexts to verify against commit status checks. If you omit this parameter, GitHub verifies all unique contexts before creating a deployment. To bypass checking entirely, pass an empty array. Defaults to all unique contexts.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required_contexts")
    public List<String> getRequiredContexts() {
        return requiredContexts;
    }

    public void setRequiredContexts(List<String> requiredContexts) {
        this.requiredContexts = requiredContexts;
    }

    public ReposCreateDeploymentRequest payload(ReposCreateDeploymentRequestPayload payload) {
        this.payload = Optional.ofNullable(payload);
        return this;
    }

    /**
     * Get payload
     * @return payload
     */
    @Valid
    @Schema(name = "payload", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("payload")
    public Optional<ReposCreateDeploymentRequestPayload> getPayload() {
        return payload;
    }

    public void setPayload(Optional<ReposCreateDeploymentRequestPayload> payload) {
        this.payload = payload;
    }

    public ReposCreateDeploymentRequest environment(String environment) {
        this.environment = Optional.ofNullable(environment);
        return this;
    }

    /**
     * Name for the target deployment environment (e.g., `production`, `staging`, `qa`).
     * @return environment
     */
    @Schema(
            name = "environment",
            description = "Name for the target deployment environment (e.g., `production`, `staging`, `qa`).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment")
    public Optional<String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(Optional<String> environment) {
        this.environment = environment;
    }

    public ReposCreateDeploymentRequest description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Short description of the deployment.
     * @return description
     */
    @Schema(
            name = "description",
            description = "Short description of the deployment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public ReposCreateDeploymentRequest transientEnvironment(Boolean transientEnvironment) {
        this.transientEnvironment = Optional.ofNullable(transientEnvironment);
        return this;
    }

    /**
     * Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`
     * @return transientEnvironment
     */
    @Schema(
            name = "transient_environment",
            description =
                    "Specifies if the given environment is specific to the deployment and will no longer exist at some point in the future. Default: `false`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("transient_environment")
    public Optional<Boolean> getTransientEnvironment() {
        return transientEnvironment;
    }

    public void setTransientEnvironment(Optional<Boolean> transientEnvironment) {
        this.transientEnvironment = transientEnvironment;
    }

    public ReposCreateDeploymentRequest productionEnvironment(Boolean productionEnvironment) {
        this.productionEnvironment = Optional.ofNullable(productionEnvironment);
        return this;
    }

    /**
     * Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise.
     * @return productionEnvironment
     */
    @Schema(
            name = "production_environment",
            description =
                    "Specifies if the given environment is one that end-users directly interact with. Default: `true` when `environment` is `production` and `false` otherwise.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("production_environment")
    public Optional<Boolean> getProductionEnvironment() {
        return productionEnvironment;
    }

    public void setProductionEnvironment(Optional<Boolean> productionEnvironment) {
        this.productionEnvironment = productionEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateDeploymentRequest reposCreateDeploymentRequest = (ReposCreateDeploymentRequest) o;
        return Objects.equals(this.ref, reposCreateDeploymentRequest.ref)
                && Objects.equals(this.task, reposCreateDeploymentRequest.task)
                && Objects.equals(this.autoMerge, reposCreateDeploymentRequest.autoMerge)
                && Objects.equals(this.requiredContexts, reposCreateDeploymentRequest.requiredContexts)
                && Objects.equals(this.payload, reposCreateDeploymentRequest.payload)
                && Objects.equals(this.environment, reposCreateDeploymentRequest.environment)
                && equalsNullable(this.description, reposCreateDeploymentRequest.description)
                && Objects.equals(this.transientEnvironment, reposCreateDeploymentRequest.transientEnvironment)
                && Objects.equals(this.productionEnvironment, reposCreateDeploymentRequest.productionEnvironment);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ref,
                task,
                autoMerge,
                requiredContexts,
                payload,
                environment,
                hashCodeNullable(description),
                transientEnvironment,
                productionEnvironment);
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
        sb.append("class ReposCreateDeploymentRequest {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    autoMerge: ").append(toIndentedString(autoMerge)).append("\n");
        sb.append("    requiredContexts: ")
                .append(toIndentedString(requiredContexts))
                .append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    transientEnvironment: ")
                .append(toIndentedString(transientEnvironment))
                .append("\n");
        sb.append("    productionEnvironment: ")
                .append(toIndentedString(productionEnvironment))
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
