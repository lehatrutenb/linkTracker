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
 * WebhookProjectEdited
 */
@JsonTypeName("webhook-project-edited")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectEdited {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        EDITED("edited");

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

    private WebhookProjectEditedChanges changes;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private WebhooksProject project;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookProjectEdited() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectEdited(ActionEnum action, WebhooksProject project) {
        this.action = action;
        this.project = project;
    }

    public WebhookProjectEdited action(ActionEnum action) {
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

    public WebhookProjectEdited changes(WebhookProjectEditedChanges changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Get changes
     * @return changes
     */
    @Valid
    @Schema(name = "changes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("changes")
    public WebhookProjectEditedChanges getChanges() {
        return changes;
    }

    public void setChanges(WebhookProjectEditedChanges changes) {
        this.changes = changes;
    }

    public WebhookProjectEdited enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookProjectEdited installation(SimpleInstallation installation) {
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

    public WebhookProjectEdited organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookProjectEdited project(WebhooksProject project) {
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

    public WebhookProjectEdited repository(RepositoryWebhooks repository) {
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

    public WebhookProjectEdited sender(SimpleUser sender) {
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
        WebhookProjectEdited webhookProjectEdited = (WebhookProjectEdited) o;
        return Objects.equals(this.action, webhookProjectEdited.action)
                && Objects.equals(this.changes, webhookProjectEdited.changes)
                && Objects.equals(this.enterprise, webhookProjectEdited.enterprise)
                && Objects.equals(this.installation, webhookProjectEdited.installation)
                && Objects.equals(this.organization, webhookProjectEdited.organization)
                && Objects.equals(this.project, webhookProjectEdited.project)
                && Objects.equals(this.repository, webhookProjectEdited.repository)
                && Objects.equals(this.sender, webhookProjectEdited.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, changes, enterprise, installation, organization, project, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectEdited {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
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
