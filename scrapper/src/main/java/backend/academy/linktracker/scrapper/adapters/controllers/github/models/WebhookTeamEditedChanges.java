package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The changes to the team if the action was &#x60;edited&#x60;.
 */
@Schema(name = "webhook_team_edited_changes", description = "The changes to the team if the action was `edited`.")
@JsonTypeName("webhook_team_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookTeamEditedChanges {

    private WebhookLabelEditedChangesDescription description;

    private WebhookLabelEditedChangesName name;

    private WebhookTeamEditedChangesPrivacy privacy;

    private WebhookTeamEditedChangesNotificationSetting notificationSetting;

    private WebhookTeamEditedChangesRepository repository;

    public WebhookTeamEditedChanges description(WebhookLabelEditedChangesDescription description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Valid
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public WebhookLabelEditedChangesDescription getDescription() {
        return description;
    }

    public void setDescription(WebhookLabelEditedChangesDescription description) {
        this.description = description;
    }

    public WebhookTeamEditedChanges name(WebhookLabelEditedChangesName name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Valid
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public WebhookLabelEditedChangesName getName() {
        return name;
    }

    public void setName(WebhookLabelEditedChangesName name) {
        this.name = name;
    }

    public WebhookTeamEditedChanges privacy(WebhookTeamEditedChangesPrivacy privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get privacy
     * @return privacy
     */
    @Valid
    @Schema(name = "privacy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy")
    public WebhookTeamEditedChangesPrivacy getPrivacy() {
        return privacy;
    }

    public void setPrivacy(WebhookTeamEditedChangesPrivacy privacy) {
        this.privacy = privacy;
    }

    public WebhookTeamEditedChanges notificationSetting(
            WebhookTeamEditedChangesNotificationSetting notificationSetting) {
        this.notificationSetting = notificationSetting;
        return this;
    }

    /**
     * Get notificationSetting
     * @return notificationSetting
     */
    @Valid
    @Schema(name = "notification_setting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public WebhookTeamEditedChangesNotificationSetting getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(WebhookTeamEditedChangesNotificationSetting notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public WebhookTeamEditedChanges repository(WebhookTeamEditedChangesRepository repository) {
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
    public WebhookTeamEditedChangesRepository getRepository() {
        return repository;
    }

    public void setRepository(WebhookTeamEditedChangesRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookTeamEditedChanges webhookTeamEditedChanges = (WebhookTeamEditedChanges) o;
        return Objects.equals(this.description, webhookTeamEditedChanges.description)
                && Objects.equals(this.name, webhookTeamEditedChanges.name)
                && Objects.equals(this.privacy, webhookTeamEditedChanges.privacy)
                && Objects.equals(this.notificationSetting, webhookTeamEditedChanges.notificationSetting)
                && Objects.equals(this.repository, webhookTeamEditedChanges.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name, privacy, notificationSetting, repository);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookTeamEditedChanges {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    notificationSetting: ")
                .append(toIndentedString(notificationSetting))
                .append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
