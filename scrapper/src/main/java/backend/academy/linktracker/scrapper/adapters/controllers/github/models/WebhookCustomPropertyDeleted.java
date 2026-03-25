package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookCustomPropertyDeleted
 */
@JsonTypeName("webhook-custom-property-deleted")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCustomPropertyDeleted {

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

    private WebhookCustomPropertyDeletedDefinition definition;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private SimpleUser sender;

    public WebhookCustomPropertyDeleted() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCustomPropertyDeleted(ActionEnum action, WebhookCustomPropertyDeletedDefinition definition) {
        this.action = action;
        this.definition = definition;
    }

    public WebhookCustomPropertyDeleted action(ActionEnum action) {
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

    public WebhookCustomPropertyDeleted definition(WebhookCustomPropertyDeletedDefinition definition) {
        this.definition = definition;
        return this;
    }

    /**
     * Get definition
     * @return definition
     */
    @NotNull
    @Valid
    @Schema(name = "definition", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("definition")
    public WebhookCustomPropertyDeletedDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(WebhookCustomPropertyDeletedDefinition definition) {
        this.definition = definition;
    }

    public WebhookCustomPropertyDeleted enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public EnterpriseWebhooks getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookCustomPropertyDeleted installation(SimpleInstallation installation) {
        this.installation = installation;
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public SimpleInstallation getInstallation() {
        return installation;
    }

    public void setInstallation(SimpleInstallation installation) {
        this.installation = installation;
    }

    public WebhookCustomPropertyDeleted organization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public OrganizationSimpleWebhooks getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
    }

    public WebhookCustomPropertyDeleted sender(SimpleUser sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sender")
    public SimpleUser getSender() {
        return sender;
    }

    public void setSender(SimpleUser sender) {
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
        WebhookCustomPropertyDeleted webhookCustomPropertyDeleted = (WebhookCustomPropertyDeleted) o;
        return Objects.equals(this.action, webhookCustomPropertyDeleted.action)
                && Objects.equals(this.definition, webhookCustomPropertyDeleted.definition)
                && Objects.equals(this.enterprise, webhookCustomPropertyDeleted.enterprise)
                && Objects.equals(this.installation, webhookCustomPropertyDeleted.installation)
                && Objects.equals(this.organization, webhookCustomPropertyDeleted.organization)
                && Objects.equals(this.sender, webhookCustomPropertyDeleted.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, definition, enterprise, installation, organization, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCustomPropertyDeleted {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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
