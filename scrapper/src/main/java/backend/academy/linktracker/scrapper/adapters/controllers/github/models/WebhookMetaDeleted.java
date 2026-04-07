package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookMetaDeleted
 */
@JsonTypeName("webhook-meta-deleted")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMetaDeleted {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        DELETED("deleted");

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

    private ActionEnum action;

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private WebhookMetaDeletedHook hook;

    private Long hookId;

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private JsonNullable<NullableRepositoryWebhooks> repository = JsonNullable.<NullableRepositoryWebhooks>undefined();

    private Optional<SimpleUser> sender = Optional.empty();

    public WebhookMetaDeleted() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMetaDeleted(ActionEnum action, WebhookMetaDeletedHook hook, Long hookId) {
        this.action = action;
        this.hook = hook;
        this.hookId = hookId;
    }

    public WebhookMetaDeleted action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @NotNull
    @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public WebhookMetaDeleted enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = Optional.ofNullable(enterprise);
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public Optional<EnterpriseWebhooks> getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Optional<EnterpriseWebhooks> enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookMetaDeleted hook(WebhookMetaDeletedHook hook) {
        this.hook = hook;
        return this;
    }

    /**
     * Get hook
     * @return hook
     */
    @NotNull
    @Valid
    @Schema(name = "hook", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hook")
    public WebhookMetaDeletedHook getHook() {
        return hook;
    }

    public void setHook(WebhookMetaDeletedHook hook) {
        this.hook = hook;
    }

    public WebhookMetaDeleted hookId(Long hookId) {
        this.hookId = hookId;
        return this;
    }

    /**
     * The id of the modified webhook.
     * @return hookId
     */
    @NotNull
    @Schema(
            name = "hook_id",
            description = "The id of the modified webhook.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hook_id")
    public Long getHookId() {
        return hookId;
    }

    public void setHookId(Long hookId) {
        this.hookId = hookId;
    }

    public WebhookMetaDeleted installation(SimpleInstallation installation) {
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

    public WebhookMetaDeleted organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookMetaDeleted repository(NullableRepositoryWebhooks repository) {
        this.repository = JsonNullable.of(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public JsonNullable<NullableRepositoryWebhooks> getRepository() {
        return repository;
    }

    public void setRepository(JsonNullable<NullableRepositoryWebhooks> repository) {
        this.repository = repository;
    }

    public WebhookMetaDeleted sender(SimpleUser sender) {
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
        WebhookMetaDeleted webhookMetaDeleted = (WebhookMetaDeleted) o;
        return Objects.equals(this.action, webhookMetaDeleted.action)
                && Objects.equals(this.enterprise, webhookMetaDeleted.enterprise)
                && Objects.equals(this.hook, webhookMetaDeleted.hook)
                && Objects.equals(this.hookId, webhookMetaDeleted.hookId)
                && Objects.equals(this.installation, webhookMetaDeleted.installation)
                && Objects.equals(this.organization, webhookMetaDeleted.organization)
                && equalsNullable(this.repository, webhookMetaDeleted.repository)
                && Objects.equals(this.sender, webhookMetaDeleted.sender);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, enterprise, hook, hookId, installation, organization, hashCodeNullable(repository), sender);
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
        sb.append("class WebhookMetaDeleted {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    hook: ").append(toIndentedString(hook)).append("\n");
        sb.append("    hookId: ").append(toIndentedString(hookId)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
