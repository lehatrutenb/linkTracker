package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookPing
 */
@JsonTypeName("webhook-ping")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPing {

    private Optional<Webhook> hook = Optional.empty();

    private Optional<Long> hookId = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    private Optional<SimpleUser> sender = Optional.empty();

    private Optional<String> zen = Optional.empty();

    public WebhookPing hook(Webhook hook) {
        this.hook = Optional.ofNullable(hook);
        return this;
    }

    /**
     * Get hook
     * @return hook
     */
    @Valid
    @Schema(name = "hook", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hook")
    public Optional<Webhook> getHook() {
        return hook;
    }

    public void setHook(Optional<Webhook> hook) {
        this.hook = hook;
    }

    public WebhookPing hookId(Long hookId) {
        this.hookId = Optional.ofNullable(hookId);
        return this;
    }

    /**
     * The ID of the webhook that triggered the ping.
     * @return hookId
     */
    @Schema(
            name = "hook_id",
            description = "The ID of the webhook that triggered the ping.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hook_id")
    public Optional<Long> getHookId() {
        return hookId;
    }

    public void setHookId(Optional<Long> hookId) {
        this.hookId = hookId;
    }

    public WebhookPing organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookPing repository(RepositoryWebhooks repository) {
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

    public WebhookPing sender(SimpleUser sender) {
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

    public WebhookPing zen(String zen) {
        this.zen = Optional.ofNullable(zen);
        return this;
    }

    /**
     * Random string of GitHub zen.
     * @return zen
     */
    @Schema(name = "zen", description = "Random string of GitHub zen.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("zen")
    public Optional<String> getZen() {
        return zen;
    }

    public void setZen(Optional<String> zen) {
        this.zen = zen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPing webhookPing = (WebhookPing) o;
        return Objects.equals(this.hook, webhookPing.hook)
                && Objects.equals(this.hookId, webhookPing.hookId)
                && Objects.equals(this.organization, webhookPing.organization)
                && Objects.equals(this.repository, webhookPing.repository)
                && Objects.equals(this.sender, webhookPing.sender)
                && Objects.equals(this.zen, webhookPing.zen);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hook, hookId, organization, repository, sender, zen);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPing {\n");
        sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    zen: ").append(toIndentedString(zen)).append("\n");
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
