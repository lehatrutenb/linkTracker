package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.net.URI;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookDeploymentProtectionRuleRequested
 */
@JsonTypeName("webhook-deployment-protection-rule-requested")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookDeploymentProtectionRuleRequested {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REQUESTED("requested");

        private final String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<ActionEnum> action = Optional.empty();

    private Optional<String> environment = Optional.empty();

    private Optional<String> event = Optional.empty();

    private Optional<String> sha = Optional.empty();

    private Optional<String> ref = Optional.empty();

    private Optional<URI> deploymentCallbackUrl = Optional.empty();

    private JsonNullable<NullableDeployment> deployment = JsonNullable.<NullableDeployment>undefined();

    @Valid
    private List<@Valid PullRequest> pullRequests = new ArrayList<>();

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<SimpleUser> sender = Optional.empty();

    public WebhookDeploymentProtectionRuleRequested action(ActionEnum action) {
        this.action = Optional.ofNullable(action);
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @Schema(name = "action", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("action")
    public Optional<ActionEnum> getAction() {
        return action;
    }

    public void setAction(Optional<ActionEnum> action) {
        this.action = action;
    }

    public WebhookDeploymentProtectionRuleRequested environment(String environment) {
        this.environment = Optional.ofNullable(environment);
        return this;
    }

    /**
     * The name of the environment that has the deployment protection rule.
     * @return environment
     */
    @Schema(
            name = "environment",
            description = "The name of the environment that has the deployment protection rule.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("environment")
    public Optional<String> getEnvironment() {
        return environment;
    }

    public void setEnvironment(Optional<String> environment) {
        this.environment = environment;
    }

    public WebhookDeploymentProtectionRuleRequested event(String event) {
        this.event = Optional.ofNullable(event);
        return this;
    }

    /**
     * The event that triggered the deployment protection rule.
     * @return event
     */
    @Schema(
            name = "event",
            description = "The event that triggered the deployment protection rule.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("event")
    public Optional<String> getEvent() {
        return event;
    }

    public void setEvent(Optional<String> event) {
        this.event = event;
    }

    public WebhookDeploymentProtectionRuleRequested sha(String sha) {
        this.sha = Optional.ofNullable(sha);
        return this;
    }

    /**
     * The commit SHA that triggered the workflow. Always populated from the check suite, regardless of whether a deployment is created.
     * @return sha
     */
    @Schema(
            name = "sha",
            description =
                    "The commit SHA that triggered the workflow. Always populated from the check suite, regardless of whether a deployment is created.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sha")
    public Optional<String> getSha() {
        return sha;
    }

    public void setSha(Optional<String> sha) {
        this.sha = sha;
    }

    public WebhookDeploymentProtectionRuleRequested ref(String ref) {
        this.ref = Optional.ofNullable(ref);
        return this;
    }

    /**
     * The ref (branch or tag) that triggered the workflow. Always populated from the check suite, regardless of whether a deployment is created.
     * @return ref
     */
    @Schema(
            name = "ref",
            description =
                    "The ref (branch or tag) that triggered the workflow. Always populated from the check suite, regardless of whether a deployment is created.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref")
    public Optional<String> getRef() {
        return ref;
    }

    public void setRef(Optional<String> ref) {
        this.ref = ref;
    }

    public WebhookDeploymentProtectionRuleRequested deploymentCallbackUrl(URI deploymentCallbackUrl) {
        this.deploymentCallbackUrl = Optional.ofNullable(deploymentCallbackUrl);
        return this;
    }

    /**
     * The URL to review the deployment protection rule.
     * @return deploymentCallbackUrl
     */
    @Valid
    @Schema(
            name = "deployment_callback_url",
            description = "The URL to review the deployment protection rule.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment_callback_url")
    public Optional<URI> getDeploymentCallbackUrl() {
        return deploymentCallbackUrl;
    }

    public void setDeploymentCallbackUrl(Optional<URI> deploymentCallbackUrl) {
        this.deploymentCallbackUrl = deploymentCallbackUrl;
    }

    public WebhookDeploymentProtectionRuleRequested deployment(NullableDeployment deployment) {
        this.deployment = JsonNullable.of(deployment);
        return this;
    }

    /**
     * Get deployment
     * @return deployment
     */
    @Valid
    @Schema(name = "deployment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment")
    public JsonNullable<NullableDeployment> getDeployment() {
        return deployment;
    }

    public void setDeployment(JsonNullable<NullableDeployment> deployment) {
        this.deployment = deployment;
    }

    public WebhookDeploymentProtectionRuleRequested pullRequests(List<@Valid PullRequest> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public WebhookDeploymentProtectionRuleRequested addPullRequestsItem(PullRequest pullRequestsItem) {
        if (this.pullRequests == null) {
            this.pullRequests = new ArrayList<>();
        }
        this.pullRequests.add(pullRequestsItem);
        return this;
    }

    /**
     * Get pullRequests
     * @return pullRequests
     */
    @Valid
    @Schema(name = "pull_requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_requests")
    public List<@Valid PullRequest> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<@Valid PullRequest> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public WebhookDeploymentProtectionRuleRequested repository(RepositoryWebhooks repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<RepositoryWebhooks> getRepository() {
        return repository;
    }

    public void setRepository(Optional<RepositoryWebhooks> repository) {
        this.repository = repository;
    }

    public WebhookDeploymentProtectionRuleRequested organization(OrganizationSimpleWebhooks organization) {
        this.organization = Optional.ofNullable(organization);
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public Optional<OrganizationSimpleWebhooks> getOrganization() {
        return organization;
    }

    public void setOrganization(Optional<OrganizationSimpleWebhooks> organization) {
        this.organization = organization;
    }

    public WebhookDeploymentProtectionRuleRequested installation(SimpleInstallation installation) {
        this.installation = Optional.ofNullable(installation);
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public Optional<SimpleInstallation> getInstallation() {
        return installation;
    }

    public void setInstallation(Optional<SimpleInstallation> installation) {
        this.installation = installation;
    }

    public WebhookDeploymentProtectionRuleRequested sender(SimpleUser sender) {
        this.sender = Optional.ofNullable(sender);
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sender")
    public Optional<SimpleUser> getSender() {
        return sender;
    }

    public void setSender(Optional<SimpleUser> sender) {
        this.sender = sender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookDeploymentProtectionRuleRequested webhookDeploymentProtectionRuleRequested =
                (WebhookDeploymentProtectionRuleRequested) o;
        return Objects.equals(this.action, webhookDeploymentProtectionRuleRequested.action)
                && Objects.equals(this.environment, webhookDeploymentProtectionRuleRequested.environment)
                && Objects.equals(this.event, webhookDeploymentProtectionRuleRequested.event)
                && Objects.equals(this.sha, webhookDeploymentProtectionRuleRequested.sha)
                && Objects.equals(this.ref, webhookDeploymentProtectionRuleRequested.ref)
                && Objects.equals(
                        this.deploymentCallbackUrl, webhookDeploymentProtectionRuleRequested.deploymentCallbackUrl)
                && equalsNullable(this.deployment, webhookDeploymentProtectionRuleRequested.deployment)
                && Objects.equals(this.pullRequests, webhookDeploymentProtectionRuleRequested.pullRequests)
                && Objects.equals(this.repository, webhookDeploymentProtectionRuleRequested.repository)
                && Objects.equals(this.organization, webhookDeploymentProtectionRuleRequested.organization)
                && Objects.equals(this.installation, webhookDeploymentProtectionRuleRequested.installation)
                && Objects.equals(this.sender, webhookDeploymentProtectionRuleRequested.sender);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                environment,
                event,
                sha,
                ref,
                deploymentCallbackUrl,
                hashCodeNullable(deployment),
                pullRequests,
                repository,
                organization,
                installation,
                sender);
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
        sb.append("class WebhookDeploymentProtectionRuleRequested {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    deploymentCallbackUrl: ")
                .append(toIndentedString(deploymentCallbackUrl))
                .append("\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
        sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
