package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookCustomPropertyPromotedToEnterprise
 */
@JsonTypeName("webhook-custom-property-promoted-to-enterprise")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCustomPropertyPromotedToEnterprise {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        PROMOTE_TO_ENTERPRISE("promote_to_enterprise");

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

    private CustomProperty definition;

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private Optional<SimpleUser> sender = Optional.empty();

    public WebhookCustomPropertyPromotedToEnterprise() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCustomPropertyPromotedToEnterprise(ActionEnum action, CustomProperty definition) {
        this.action = action;
        this.definition = definition;
    }

    public WebhookCustomPropertyPromotedToEnterprise action(ActionEnum action) {
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

    public WebhookCustomPropertyPromotedToEnterprise definition(CustomProperty definition) {
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
    public CustomProperty getDefinition() {
        return definition;
    }

    public void setDefinition(CustomProperty definition) {
        this.definition = definition;
    }

    public WebhookCustomPropertyPromotedToEnterprise enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookCustomPropertyPromotedToEnterprise installation(SimpleInstallation installation) {
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

    public WebhookCustomPropertyPromotedToEnterprise organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookCustomPropertyPromotedToEnterprise sender(SimpleUser sender) {
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
        WebhookCustomPropertyPromotedToEnterprise webhookCustomPropertyPromotedToEnterprise =
                (WebhookCustomPropertyPromotedToEnterprise) o;
        return Objects.equals(this.action, webhookCustomPropertyPromotedToEnterprise.action)
                && Objects.equals(this.definition, webhookCustomPropertyPromotedToEnterprise.definition)
                && Objects.equals(this.enterprise, webhookCustomPropertyPromotedToEnterprise.enterprise)
                && Objects.equals(this.installation, webhookCustomPropertyPromotedToEnterprise.installation)
                && Objects.equals(this.organization, webhookCustomPropertyPromotedToEnterprise.organization)
                && Objects.equals(this.sender, webhookCustomPropertyPromotedToEnterprise.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, definition, enterprise, installation, organization, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCustomPropertyPromotedToEnterprise {\n");
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
