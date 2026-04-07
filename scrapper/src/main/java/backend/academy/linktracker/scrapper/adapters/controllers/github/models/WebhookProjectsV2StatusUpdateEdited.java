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
 * WebhookProjectsV2StatusUpdateEdited
 */
@JsonTypeName("webhook-projects-v2-status-update-edited")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2StatusUpdateEdited {

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

    private Optional<WebhookProjectsV2StatusUpdateEditedChanges> changes = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private OrganizationSimpleWebhooks organization;

    private ProjectsV2StatusUpdate projectsV2StatusUpdate;

    private SimpleUser sender;

    public WebhookProjectsV2StatusUpdateEdited() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectsV2StatusUpdateEdited(
            ActionEnum action,
            OrganizationSimpleWebhooks organization,
            ProjectsV2StatusUpdate projectsV2StatusUpdate,
            SimpleUser sender) {
        this.action = action;
        this.organization = organization;
        this.projectsV2StatusUpdate = projectsV2StatusUpdate;
        this.sender = sender;
    }

    public WebhookProjectsV2StatusUpdateEdited action(ActionEnum action) {
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

    public WebhookProjectsV2StatusUpdateEdited changes(WebhookProjectsV2StatusUpdateEditedChanges changes) {
        this.changes = Optional.ofNullable(changes);
        return this;
    }

    /**
     * Get changes
     * @return changes
     */
    @Valid
    @Schema(name = "changes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("changes")
    public Optional<WebhookProjectsV2StatusUpdateEditedChanges> getChanges() {
        return changes;
    }

    public void setChanges(Optional<WebhookProjectsV2StatusUpdateEditedChanges> changes) {
        this.changes = changes;
    }

    public WebhookProjectsV2StatusUpdateEdited installation(SimpleInstallation installation) {
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

    public WebhookProjectsV2StatusUpdateEdited organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookProjectsV2StatusUpdateEdited projectsV2StatusUpdate(ProjectsV2StatusUpdate projectsV2StatusUpdate) {
        this.projectsV2StatusUpdate = projectsV2StatusUpdate;
        return this;
    }

    /**
     * Get projectsV2StatusUpdate
     * @return projectsV2StatusUpdate
     */
    @NotNull
    @Valid
    @Schema(name = "projects_v2_status_update", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("projects_v2_status_update")
    public ProjectsV2StatusUpdate getProjectsV2StatusUpdate() {
        return projectsV2StatusUpdate;
    }

    public void setProjectsV2StatusUpdate(ProjectsV2StatusUpdate projectsV2StatusUpdate) {
        this.projectsV2StatusUpdate = projectsV2StatusUpdate;
    }

    public WebhookProjectsV2StatusUpdateEdited sender(SimpleUser sender) {
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
        WebhookProjectsV2StatusUpdateEdited webhookProjectsV2StatusUpdateEdited =
                (WebhookProjectsV2StatusUpdateEdited) o;
        return Objects.equals(this.action, webhookProjectsV2StatusUpdateEdited.action)
                && Objects.equals(this.changes, webhookProjectsV2StatusUpdateEdited.changes)
                && Objects.equals(this.installation, webhookProjectsV2StatusUpdateEdited.installation)
                && Objects.equals(this.organization, webhookProjectsV2StatusUpdateEdited.organization)
                && Objects.equals(
                        this.projectsV2StatusUpdate, webhookProjectsV2StatusUpdateEdited.projectsV2StatusUpdate)
                && Objects.equals(this.sender, webhookProjectsV2StatusUpdateEdited.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, changes, installation, organization, projectsV2StatusUpdate, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2StatusUpdateEdited {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    projectsV2StatusUpdate: ")
                .append(toIndentedString(projectsV2StatusUpdate))
                .append("\n");
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
