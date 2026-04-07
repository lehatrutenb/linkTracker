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
 * WebhookProjectDeleted
 */
@JsonTypeName("webhook-project-deleted")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectDeleted {

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

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private WebhooksProject project;

    private JsonNullable<NullableRepositoryWebhooks> repository = JsonNullable.<NullableRepositoryWebhooks>undefined();

    private Optional<SimpleUser> sender = Optional.empty();

    public WebhookProjectDeleted() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectDeleted(ActionEnum action, WebhooksProject project) {
        this.action = action;
        this.project = project;
    }

    public WebhookProjectDeleted action(ActionEnum action) {
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

    public WebhookProjectDeleted enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookProjectDeleted installation(SimpleInstallation installation) {
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

    public WebhookProjectDeleted organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookProjectDeleted project(WebhooksProject project) {
        this.project = project;
        return this;
    }

    /**
     * Get project
     * @return project
     */
    @NotNull
    @Valid
    @Schema(name = "project", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("project")
    public WebhooksProject getProject() {
        return project;
    }

    public void setProject(WebhooksProject project) {
        this.project = project;
    }

    public WebhookProjectDeleted repository(NullableRepositoryWebhooks repository) {
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

    public WebhookProjectDeleted sender(SimpleUser sender) {
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
        WebhookProjectDeleted webhookProjectDeleted = (WebhookProjectDeleted) o;
        return Objects.equals(this.action, webhookProjectDeleted.action)
                && Objects.equals(this.enterprise, webhookProjectDeleted.enterprise)
                && Objects.equals(this.installation, webhookProjectDeleted.installation)
                && Objects.equals(this.organization, webhookProjectDeleted.organization)
                && Objects.equals(this.project, webhookProjectDeleted.project)
                && equalsNullable(this.repository, webhookProjectDeleted.repository)
                && Objects.equals(this.sender, webhookProjectDeleted.sender);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, enterprise, installation, organization, project, hashCodeNullable(repository), sender);
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
        sb.append("class WebhookProjectDeleted {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
