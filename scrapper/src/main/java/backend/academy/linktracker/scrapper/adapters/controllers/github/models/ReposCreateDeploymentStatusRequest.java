package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ReposCreateDeploymentStatusRequest
 */
@JsonTypeName("repos_create_deployment_status_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateDeploymentStatusRequest {

    /**
     * The state of the status. When you set a transient deployment to `inactive`, the deployment will be shown as `destroyed` in GitHub.
     */
    public enum StateEnum {
        ERROR("error"),

        FAILURE("failure"),

        INACTIVE("inactive"),

        IN_PROGRESS("in_progress"),

        QUEUED("queued"),

        PENDING("pending"),

        SUCCESS("success");

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

    private Optional<String> targetUrl = Optional.of("");

    private Optional<String> logUrl = Optional.of("");

    private Optional<String> description = Optional.of("");

    private Optional<String> environment = Optional.empty();

    private Optional<String> environmentUrl = Optional.of("");

    private Optional<Boolean> autoInactive = Optional.empty();

    public ReposCreateDeploymentStatusRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateDeploymentStatusRequest(StateEnum state) {
        this.state = state;
    }

    public ReposCreateDeploymentStatusRequest state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the status. When you set a transient deployment to `inactive`, the deployment will be shown as `destroyed` in GitHub.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description =
                    "The state of the status. When you set a transient deployment to `inactive`, the deployment will be shown as `destroyed` in GitHub.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ReposCreateDeploymentStatusRequest targetUrl(String targetUrl) {
        this.targetUrl = Optional.ofNullable(targetUrl);
        return this;
    }

    /**
     * The target URL to associate with this status. This URL should contain output to keep the user updated while the task is running or serve as historical information for what happened in the deployment.  > [!NOTE] > It's recommended to use the `log_url` parameter, which replaces `target_url`.
     * @return targetUrl
     */
    @Schema(
            name = "target_url",
            description =
                    "The target URL to associate with this status. This URL should contain output to keep the user updated while the task is running or serve as historical information for what happened in the deployment.  > [!NOTE] > It's recommended to use the `log_url` parameter, which replaces `target_url`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target_url")
    public Optional<String> getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(Optional<String> targetUrl) {
        this.targetUrl = targetUrl;
    }

    public ReposCreateDeploymentStatusRequest logUrl(String logUrl) {
        this.logUrl = Optional.ofNullable(logUrl);
        return this;
    }

    /**
     * The full URL of the deployment's output. This parameter replaces `target_url`. We will continue to accept `target_url` to support legacy uses, but we recommend replacing `target_url` with `log_url`. Setting `log_url` will automatically set `target_url` to the same value. Default: `\"\"`
     * @return logUrl
     */
    @Schema(
            name = "log_url",
            description =
                    "The full URL of the deployment's output. This parameter replaces `target_url`. We will continue to accept `target_url` to support legacy uses, but we recommend replacing `target_url` with `log_url`. Setting `log_url` will automatically set `target_url` to the same value. Default: `\"\"`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("log_url")
    public Optional<String> getLogUrl() {
        return logUrl;
    }

    public void setLogUrl(Optional<String> logUrl) {
        this.logUrl = logUrl;
    }

    public ReposCreateDeploymentStatusRequest description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * A short description of the status. The maximum description length is 140 characters.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description of the status. The maximum description length is 140 characters.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public ReposCreateDeploymentStatusRequest environment(String environment) {
        this.environment = Optional.ofNullable(environment);
        return this;
    }

    /**
     * Name for the target deployment environment, which can be changed when setting a deploy status. For example, `production`, `staging`, or `qa`. If not defined, the environment of the previous status on the deployment will be used, if it exists. Otherwise, the environment of the deployment will be used.
     * @return environment
     */
    @Schema(
            name = "environment",
            description =
                    "Name for the target deployment environment, which can be changed when setting a deploy status. For example, `production`, `staging`, or `qa`. If not defined, the environment of the previous status on the deployment will be used, if it exists. Otherwise, the environment of the deployment will be used.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment")
    public Optional<String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(Optional<String> environment) {
        this.environment = environment;
    }

    public ReposCreateDeploymentStatusRequest environmentUrl(String environmentUrl) {
        this.environmentUrl = Optional.ofNullable(environmentUrl);
        return this;
    }

    /**
     * Sets the URL for accessing your environment. Default: `\"\"`
     * @return environmentUrl
     */
    @Schema(
            name = "environment_url",
            description = "Sets the URL for accessing your environment. Default: `\"\"`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment_url")
    public Optional<String> getEnvironmentUrl() {
        return environmentUrl;
    }

    public void setEnvironmentUrl(Optional<String> environmentUrl) {
        this.environmentUrl = environmentUrl;
    }

    public ReposCreateDeploymentStatusRequest autoInactive(Boolean autoInactive) {
        this.autoInactive = Optional.ofNullable(autoInactive);
        return this;
    }

    /**
     * Adds a new `inactive` status to all prior non-transient, non-production environment deployments with the same repository and `environment` name as the created status's deployment. An `inactive` status is only added to deployments that had a `success` state. Default: `true`
     * @return autoInactive
     */
    @Schema(
            name = "auto_inactive",
            description =
                    "Adds a new `inactive` status to all prior non-transient, non-production environment deployments with the same repository and `environment` name as the created status's deployment. An `inactive` status is only added to deployments that had a `success` state. Default: `true`",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("auto_inactive")
    public Optional<Boolean> getAutoInactive() {
        return autoInactive;
    }

    public void setAutoInactive(Optional<Boolean> autoInactive) {
        this.autoInactive = autoInactive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateDeploymentStatusRequest reposCreateDeploymentStatusRequest = (ReposCreateDeploymentStatusRequest) o;
        return Objects.equals(this.state, reposCreateDeploymentStatusRequest.state)
                && Objects.equals(this.targetUrl, reposCreateDeploymentStatusRequest.targetUrl)
                && Objects.equals(this.logUrl, reposCreateDeploymentStatusRequest.logUrl)
                && Objects.equals(this.description, reposCreateDeploymentStatusRequest.description)
                && Objects.equals(this.environment, reposCreateDeploymentStatusRequest.environment)
                && Objects.equals(this.environmentUrl, reposCreateDeploymentStatusRequest.environmentUrl)
                && Objects.equals(this.autoInactive, reposCreateDeploymentStatusRequest.autoInactive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, targetUrl, logUrl, description, environment, environmentUrl, autoInactive);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateDeploymentStatusRequest {\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
        sb.append("    logUrl: ").append(toIndentedString(logUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    environmentUrl: ")
                .append(toIndentedString(environmentUrl))
                .append("\n");
        sb.append("    autoInactive: ").append(toIndentedString(autoInactive)).append("\n");
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
