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
 * WebhookProjectsV2ProjectDeleted
 */
@JsonTypeName("webhook-projects-v2-project-deleted")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ProjectDeleted {

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

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private ProjectsV2 projectsV2;

    private SimpleUser sender;

    public WebhookProjectsV2ProjectDeleted() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectsV2ProjectDeleted(
            ActionEnum action, OrganizationSimpleWebhooks organization, ProjectsV2 projectsV2, SimpleUser sender) {
        this.action = action;
        this.organization = organization;
        this.projectsV2 = projectsV2;
        this.sender = sender;
    }

    public WebhookProjectsV2ProjectDeleted action(ActionEnum action) {
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

    public WebhookProjectsV2ProjectDeleted installation(SimpleInstallation installation) {
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

    public WebhookProjectsV2ProjectDeleted organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookProjectsV2ProjectDeleted projectsV2(ProjectsV2 projectsV2) {
        this.projectsV2 = projectsV2;
        return this;
    }

    /**
     * Get projectsV2
     * @return projectsV2
     */
    @NotNull
    @Valid
    @Schema(name = "projects_v2", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("projects_v2")
    public ProjectsV2 getProjectsV2() {
        return projectsV2;
    }

    public void setProjectsV2(ProjectsV2 projectsV2) {
        this.projectsV2 = projectsV2;
    }

    public WebhookProjectsV2ProjectDeleted sender(SimpleUser sender) {
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
        WebhookProjectsV2ProjectDeleted webhookProjectsV2ProjectDeleted = (WebhookProjectsV2ProjectDeleted) o;
        return Objects.equals(this.action, webhookProjectsV2ProjectDeleted.action)
                && Objects.equals(this.installation, webhookProjectsV2ProjectDeleted.installation)
                && Objects.equals(this.organization, webhookProjectsV2ProjectDeleted.organization)
                && Objects.equals(this.projectsV2, webhookProjectsV2ProjectDeleted.projectsV2)
                && Objects.equals(this.sender, webhookProjectsV2ProjectDeleted.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, installation, organization, projectsV2, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ProjectDeleted {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    projectsV2: ").append(toIndentedString(projectsV2)).append("\n");
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
