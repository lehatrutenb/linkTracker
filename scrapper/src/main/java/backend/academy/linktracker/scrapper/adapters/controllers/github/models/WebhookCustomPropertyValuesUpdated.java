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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookCustomPropertyValuesUpdated
 */
@JsonTypeName("webhook-custom-property-values-updated")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCustomPropertyValuesUpdated {

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

    private RepositoryWebhooks repository;

    private OrganizationSimpleWebhooks organization;

    private SimpleUser sender;

    @Valid
    private List<@Valid CustomPropertyValue> newPropertyValues = new ArrayList<>();

    @Valid
    private List<@Valid CustomPropertyValue> oldPropertyValues = new ArrayList<>();

    public WebhookCustomPropertyValuesUpdated() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCustomPropertyValuesUpdated(
            ActionEnum action,
            RepositoryWebhooks repository,
            OrganizationSimpleWebhooks organization,
            List<@Valid CustomPropertyValue> newPropertyValues,
            List<@Valid CustomPropertyValue> oldPropertyValues) {
        this.action = action;
        this.repository = repository;
        this.organization = organization;
        this.newPropertyValues = newPropertyValues;
        this.oldPropertyValues = oldPropertyValues;
    }

    public WebhookCustomPropertyValuesUpdated action(ActionEnum action) {
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

    public WebhookCustomPropertyValuesUpdated enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookCustomPropertyValuesUpdated installation(SimpleInstallation installation) {
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

    public WebhookCustomPropertyValuesUpdated repository(RepositoryWebhooks repository) {
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

    public WebhookCustomPropertyValuesUpdated organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookCustomPropertyValuesUpdated sender(SimpleUser sender) {
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

    public WebhookCustomPropertyValuesUpdated newPropertyValues(List<@Valid CustomPropertyValue> newPropertyValues) {
        this.newPropertyValues = newPropertyValues;
        return this;
    }

    public WebhookCustomPropertyValuesUpdated addNewPropertyValuesItem(CustomPropertyValue newPropertyValuesItem) {
        if (this.newPropertyValues == null) {
            this.newPropertyValues = new ArrayList<>();
        }
        this.newPropertyValues.add(newPropertyValuesItem);
        return this;
    }

    /**
     * The new custom property values for the repository.
     * @return newPropertyValues
     */
    @NotNull
    @Valid
    @Schema(
            name = "new_property_values",
            description = "The new custom property values for the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("new_property_values")
    public List<@Valid CustomPropertyValue> getNewPropertyValues() {
        return newPropertyValues;
    }

    public void setNewPropertyValues(List<@Valid CustomPropertyValue> newPropertyValues) {
        this.newPropertyValues = newPropertyValues;
    }

    public WebhookCustomPropertyValuesUpdated oldPropertyValues(List<@Valid CustomPropertyValue> oldPropertyValues) {
        this.oldPropertyValues = oldPropertyValues;
        return this;
    }

    public WebhookCustomPropertyValuesUpdated addOldPropertyValuesItem(CustomPropertyValue oldPropertyValuesItem) {
        if (this.oldPropertyValues == null) {
            this.oldPropertyValues = new ArrayList<>();
        }
        this.oldPropertyValues.add(oldPropertyValuesItem);
        return this;
    }

    /**
     * The old custom property values for the repository.
     * @return oldPropertyValues
     */
    @NotNull
    @Valid
    @Schema(
            name = "old_property_values",
            description = "The old custom property values for the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("old_property_values")
    public List<@Valid CustomPropertyValue> getOldPropertyValues() {
        return oldPropertyValues;
    }

    public void setOldPropertyValues(List<@Valid CustomPropertyValue> oldPropertyValues) {
        this.oldPropertyValues = oldPropertyValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookCustomPropertyValuesUpdated webhookCustomPropertyValuesUpdated = (WebhookCustomPropertyValuesUpdated) o;
        return Objects.equals(this.action, webhookCustomPropertyValuesUpdated.action)
                && Objects.equals(this.enterprise, webhookCustomPropertyValuesUpdated.enterprise)
                && Objects.equals(this.installation, webhookCustomPropertyValuesUpdated.installation)
                && Objects.equals(this.repository, webhookCustomPropertyValuesUpdated.repository)
                && Objects.equals(this.organization, webhookCustomPropertyValuesUpdated.organization)
                && Objects.equals(this.sender, webhookCustomPropertyValuesUpdated.sender)
                && Objects.equals(this.newPropertyValues, webhookCustomPropertyValuesUpdated.newPropertyValues)
                && Objects.equals(this.oldPropertyValues, webhookCustomPropertyValuesUpdated.oldPropertyValues);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                enterprise,
                installation,
                repository,
                organization,
                sender,
                newPropertyValues,
                oldPropertyValues);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCustomPropertyValuesUpdated {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    newPropertyValues: ")
                .append(toIndentedString(newPropertyValues))
                .append("\n");
        sb.append("    oldPropertyValues: ")
                .append(toIndentedString(oldPropertyValues))
                .append("\n");
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
