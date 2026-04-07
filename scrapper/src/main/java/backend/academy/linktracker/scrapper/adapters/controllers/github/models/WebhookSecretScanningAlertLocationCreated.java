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
 * WebhookSecretScanningAlertLocationCreated
 */
@JsonTypeName("webhook-secret-scanning-alert-location-created")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSecretScanningAlertLocationCreated {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        CREATED("created");

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

    private SecretScanningAlertWebhook alert;

    private Optional<SimpleInstallation> installation = Optional.empty();

    private SecretScanningLocation location;

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookSecretScanningAlertLocationCreated() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookSecretScanningAlertLocationCreated(
            SecretScanningAlertWebhook alert,
            SecretScanningLocation location,
            RepositoryWebhooks repository,
            SimpleUser sender) {
        this.alert = alert;
        this.location = location;
        this.repository = repository;
        this.sender = sender;
    }

    public WebhookSecretScanningAlertLocationCreated action(ActionEnum action) {
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

    public WebhookSecretScanningAlertLocationCreated alert(SecretScanningAlertWebhook alert) {
        this.alert = alert;
        return this;
    }

    /**
     * Get alert
     * @return alert
     */
    @NotNull
    @Valid
    @Schema(name = "alert", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("alert")
    public SecretScanningAlertWebhook getAlert() {
        return alert;
    }

    public void setAlert(SecretScanningAlertWebhook alert) {
        this.alert = alert;
    }

    public WebhookSecretScanningAlertLocationCreated installation(SimpleInstallation installation) {
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

    public WebhookSecretScanningAlertLocationCreated location(SecretScanningLocation location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
     * @return location
     */
    @NotNull
    @Valid
    @Schema(name = "location", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("location")
    public SecretScanningLocation getLocation() {
        return location;
    }

    public void setLocation(SecretScanningLocation location) {
        this.location = location;
    }

    public WebhookSecretScanningAlertLocationCreated organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookSecretScanningAlertLocationCreated repository(RepositoryWebhooks repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookSecretScanningAlertLocationCreated sender(SimpleUser sender) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSecretScanningAlertLocationCreated webhookSecretScanningAlertLocationCreated =
                (WebhookSecretScanningAlertLocationCreated) o;
        return Objects.equals(this.action, webhookSecretScanningAlertLocationCreated.action)
                && Objects.equals(this.alert, webhookSecretScanningAlertLocationCreated.alert)
                && Objects.equals(this.installation, webhookSecretScanningAlertLocationCreated.installation)
                && Objects.equals(this.location, webhookSecretScanningAlertLocationCreated.location)
                && Objects.equals(this.organization, webhookSecretScanningAlertLocationCreated.organization)
                && Objects.equals(this.repository, webhookSecretScanningAlertLocationCreated.repository)
                && Objects.equals(this.sender, webhookSecretScanningAlertLocationCreated.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, alert, installation, location, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSecretScanningAlertLocationCreated {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
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
