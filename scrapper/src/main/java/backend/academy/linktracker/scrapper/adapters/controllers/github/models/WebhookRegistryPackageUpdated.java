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
 * WebhookRegistryPackageUpdated
 */
@JsonTypeName("webhook-registry-package-updated")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackageUpdated {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        UPDATED("updated");

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

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private WebhookRegistryPackageUpdatedRegistryPackage registryPackage;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookRegistryPackageUpdated() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRegistryPackageUpdated(
            ActionEnum action, WebhookRegistryPackageUpdatedRegistryPackage registryPackage, SimpleUser sender) {
        this.action = action;
        this.registryPackage = registryPackage;
        this.sender = sender;
    }

    public WebhookRegistryPackageUpdated action(ActionEnum action) {
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

    public WebhookRegistryPackageUpdated enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookRegistryPackageUpdated installation(SimpleInstallation installation) {
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

    public WebhookRegistryPackageUpdated organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookRegistryPackageUpdated registryPackage(WebhookRegistryPackageUpdatedRegistryPackage registryPackage) {
        this.registryPackage = registryPackage;
        return this;
    }

    /**
     * Get registryPackage
     * @return registryPackage
     */
    @NotNull
    @Valid
    @Schema(name = "registry_package", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("registry_package")
    public WebhookRegistryPackageUpdatedRegistryPackage getRegistryPackage() {
        return registryPackage;
    }

    public void setRegistryPackage(WebhookRegistryPackageUpdatedRegistryPackage registryPackage) {
        this.registryPackage = registryPackage;
    }

    public WebhookRegistryPackageUpdated repository(RepositoryWebhooks repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookRegistryPackageUpdated sender(SimpleUser sender) {
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
        WebhookRegistryPackageUpdated webhookRegistryPackageUpdated = (WebhookRegistryPackageUpdated) o;
        return Objects.equals(this.action, webhookRegistryPackageUpdated.action)
                && Objects.equals(this.enterprise, webhookRegistryPackageUpdated.enterprise)
                && Objects.equals(this.installation, webhookRegistryPackageUpdated.installation)
                && Objects.equals(this.organization, webhookRegistryPackageUpdated.organization)
                && Objects.equals(this.registryPackage, webhookRegistryPackageUpdated.registryPackage)
                && Objects.equals(this.repository, webhookRegistryPackageUpdated.repository)
                && Objects.equals(this.sender, webhookRegistryPackageUpdated.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enterprise, installation, organization, registryPackage, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookRegistryPackageUpdated {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    registryPackage: ")
                .append(toIndentedString(registryPackage))
                .append("\n");
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
