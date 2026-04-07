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
 * WebhookProjectsV2ProjectReopened
 */
@JsonTypeName("webhook-projects-v2-project-reopened")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2ProjectReopened {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        REOPENED("reopened");

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

    private Optional<SimpleInstallation> installation = Optional.empty();

    private OrganizationSimpleWebhooks organization;

    private ProjectsV2 projectsV2;

    private SimpleUser sender;

    public WebhookProjectsV2ProjectReopened() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectsV2ProjectReopened(
            ActionEnum action, OrganizationSimpleWebhooks organization, ProjectsV2 projectsV2, SimpleUser sender) {
        this.action = action;
        this.organization = organization;
        this.projectsV2 = projectsV2;
        this.sender = sender;
    }

    public WebhookProjectsV2ProjectReopened action(ActionEnum action) {
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

    public WebhookProjectsV2ProjectReopened installation(SimpleInstallation installation) {
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

    public WebhookProjectsV2ProjectReopened organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookProjectsV2ProjectReopened projectsV2(ProjectsV2 projectsV2) {
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

    public WebhookProjectsV2ProjectReopened sender(SimpleUser sender) {
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
        WebhookProjectsV2ProjectReopened webhookProjectsV2ProjectReopened = (WebhookProjectsV2ProjectReopened) o;
        return Objects.equals(this.action, webhookProjectsV2ProjectReopened.action)
                && Objects.equals(this.installation, webhookProjectsV2ProjectReopened.installation)
                && Objects.equals(this.organization, webhookProjectsV2ProjectReopened.organization)
                && Objects.equals(this.projectsV2, webhookProjectsV2ProjectReopened.projectsV2)
                && Objects.equals(this.sender, webhookProjectsV2ProjectReopened.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, installation, organization, projectsV2, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2ProjectReopened {\n");
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
