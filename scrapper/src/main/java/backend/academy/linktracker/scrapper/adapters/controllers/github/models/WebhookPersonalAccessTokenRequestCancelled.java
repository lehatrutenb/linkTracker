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
 * WebhookPersonalAccessTokenRequestCancelled
 */
@JsonTypeName("webhook-personal-access-token-request-cancelled")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPersonalAccessTokenRequestCancelled {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        CANCELLED("cancelled");

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

    private PersonalAccessTokenRequest personalAccessTokenRequest;

    private EnterpriseWebhooks enterprise;

    private OrganizationSimpleWebhooks organization;

    private SimpleUser sender;

    private SimpleInstallation installation;

    public WebhookPersonalAccessTokenRequestCancelled() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPersonalAccessTokenRequestCancelled(
            ActionEnum action,
            PersonalAccessTokenRequest personalAccessTokenRequest,
            OrganizationSimpleWebhooks organization,
            SimpleUser sender,
            SimpleInstallation installation) {
        this.action = action;
        this.personalAccessTokenRequest = personalAccessTokenRequest;
        this.organization = organization;
        this.sender = sender;
        this.installation = installation;
    }

    public WebhookPersonalAccessTokenRequestCancelled action(ActionEnum action) {
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

    public WebhookPersonalAccessTokenRequestCancelled personalAccessTokenRequest(
            PersonalAccessTokenRequest personalAccessTokenRequest) {
        this.personalAccessTokenRequest = personalAccessTokenRequest;
        return this;
    }

    /**
     * Get personalAccessTokenRequest
     * @return personalAccessTokenRequest
     */
    @NotNull
    @Valid
    @Schema(name = "personal_access_token_request", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("personal_access_token_request")
    public PersonalAccessTokenRequest getPersonalAccessTokenRequest() {
        return personalAccessTokenRequest;
    }

    public void setPersonalAccessTokenRequest(PersonalAccessTokenRequest personalAccessTokenRequest) {
        this.personalAccessTokenRequest = personalAccessTokenRequest;
    }

    public WebhookPersonalAccessTokenRequestCancelled enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookPersonalAccessTokenRequestCancelled organization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @NotNull
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization")
    public OrganizationSimpleWebhooks getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
    }

    public WebhookPersonalAccessTokenRequestCancelled sender(SimpleUser sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @NotNull
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sender")
    public SimpleUser getSender() {
        return sender;
    }

    public void setSender(SimpleUser sender) {
        this.sender = sender;
    }

    public WebhookPersonalAccessTokenRequestCancelled installation(SimpleInstallation installation) {
        this.installation = installation;
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @NotNull
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("installation")
    public SimpleInstallation getInstallation() {
        return installation;
    }

    public void setInstallation(SimpleInstallation installation) {
        this.installation = installation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPersonalAccessTokenRequestCancelled webhookPersonalAccessTokenRequestCancelled =
                (WebhookPersonalAccessTokenRequestCancelled) o;
        return Objects.equals(this.action, webhookPersonalAccessTokenRequestCancelled.action)
                && Objects.equals(
                        this.personalAccessTokenRequest,
                        webhookPersonalAccessTokenRequestCancelled.personalAccessTokenRequest)
                && Objects.equals(this.enterprise, webhookPersonalAccessTokenRequestCancelled.enterprise)
                && Objects.equals(this.organization, webhookPersonalAccessTokenRequestCancelled.organization)
                && Objects.equals(this.sender, webhookPersonalAccessTokenRequestCancelled.sender)
                && Objects.equals(this.installation, webhookPersonalAccessTokenRequestCancelled.installation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, personalAccessTokenRequest, enterprise, organization, sender, installation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPersonalAccessTokenRequestCancelled {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    personalAccessTokenRequest: ")
                .append(toIndentedString(personalAccessTokenRequest))
                .append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
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
