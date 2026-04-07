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
 * WebhookProjectsV2ItemReordered
 */
@JsonTypeName("webhook-projects-v2-item-reordered")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ItemReordered {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REORDERED("reordered");

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

    private WebhookProjectsV2ItemReorderedChanges changes;

    private Optional<SimpleInstallation> installation = Optional.empty();

    private OrganizationSimpleWebhooks organization;

    private ProjectsV2Item projectsV2Item;

    private SimpleUser sender;

    public WebhookProjectsV2ItemReordered() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectsV2ItemReordered(
            ActionEnum action,
            WebhookProjectsV2ItemReorderedChanges changes,
            OrganizationSimpleWebhooks organization,
            ProjectsV2Item projectsV2Item,
            SimpleUser sender) {
        this.action = action;
        this.changes = changes;
        this.organization = organization;
        this.projectsV2Item = projectsV2Item;
        this.sender = sender;
    }

    public WebhookProjectsV2ItemReordered action(ActionEnum action) {
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

    public WebhookProjectsV2ItemReordered changes(WebhookProjectsV2ItemReorderedChanges changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Get changes
     * @return changes
     */
    @NotNull
    @Valid
    @Schema(name = "changes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("changes")
    public WebhookProjectsV2ItemReorderedChanges getChanges() {
        return changes;
    }

    public void setChanges(WebhookProjectsV2ItemReorderedChanges changes) {
        this.changes = changes;
    }

    public WebhookProjectsV2ItemReordered installation(SimpleInstallation installation) {
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

    public WebhookProjectsV2ItemReordered organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookProjectsV2ItemReordered projectsV2Item(ProjectsV2Item projectsV2Item) {
        this.projectsV2Item = projectsV2Item;
        return this;
    }

    /**
     * Get projectsV2Item
     * @return projectsV2Item
     */
    @NotNull
    @Valid
    @Schema(name = "projects_v2_item", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("projects_v2_item")
    public ProjectsV2Item getProjectsV2Item() {
        return projectsV2Item;
    }

    public void setProjectsV2Item(ProjectsV2Item projectsV2Item) {
        this.projectsV2Item = projectsV2Item;
    }

    public WebhookProjectsV2ItemReordered sender(SimpleUser sender) {
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
        WebhookProjectsV2ItemReordered webhookProjectsV2ItemReordered = (WebhookProjectsV2ItemReordered) o;
        return Objects.equals(this.action, webhookProjectsV2ItemReordered.action)
                && Objects.equals(this.changes, webhookProjectsV2ItemReordered.changes)
                && Objects.equals(this.installation, webhookProjectsV2ItemReordered.installation)
                && Objects.equals(this.organization, webhookProjectsV2ItemReordered.organization)
                && Objects.equals(this.projectsV2Item, webhookProjectsV2ItemReordered.projectsV2Item)
                && Objects.equals(this.sender, webhookProjectsV2ItemReordered.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, changes, installation, organization, projectsV2Item, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ItemReordered {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    projectsV2Item: ")
                .append(toIndentedString(projectsV2Item))
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
