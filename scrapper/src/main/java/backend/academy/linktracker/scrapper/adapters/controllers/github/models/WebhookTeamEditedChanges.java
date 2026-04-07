package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * The changes to the team if the action was &#x60;edited&#x60;.
 */
@Schema(name = "webhook_team_edited_changes", description = "The changes to the team if the action was `edited`.")
@JsonTypeName("webhook_team_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookTeamEditedChanges {

    private Optional<WebhookLabelEditedChangesDescription> description = Optional.empty();

    private Optional<WebhookLabelEditedChangesName> name = Optional.empty();

    private Optional<WebhookTeamEditedChangesPrivacy> privacy = Optional.empty();

    private Optional<WebhookTeamEditedChangesNotificationSetting> notificationSetting = Optional.empty();

    private Optional<WebhookTeamEditedChangesRepository> repository = Optional.empty();

    public WebhookTeamEditedChanges description(WebhookLabelEditedChangesDescription description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Valid
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<WebhookLabelEditedChangesDescription> getDescription() {
        return description;
    }

    public void setDescription(Optional<WebhookLabelEditedChangesDescription> description) {
        this.description = description;
    }

    public WebhookTeamEditedChanges name(WebhookLabelEditedChangesName name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Valid
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<WebhookLabelEditedChangesName> getName() {
        return name;
    }

    public void setName(Optional<WebhookLabelEditedChangesName> name) {
        this.name = name;
    }

    public WebhookTeamEditedChanges privacy(WebhookTeamEditedChangesPrivacy privacy) {
        this.privacy = Optional.ofNullable(privacy);
        return this;
    }

    /**
     * Get privacy
     * @return privacy
     */
    @Valid
    @Schema(name = "privacy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy")
    public Optional<WebhookTeamEditedChangesPrivacy> getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Optional<WebhookTeamEditedChangesPrivacy> privacy) {
        this.privacy = privacy;
    }

    public WebhookTeamEditedChanges notificationSetting(
            WebhookTeamEditedChangesNotificationSetting notificationSetting) {
        this.notificationSetting = Optional.ofNullable(notificationSetting);
        return this;
    }

    /**
     * Get notificationSetting
     * @return notificationSetting
     */
    @Valid
    @Schema(name = "notification_setting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public Optional<WebhookTeamEditedChangesNotificationSetting> getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(Optional<WebhookTeamEditedChangesNotificationSetting> notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public WebhookTeamEditedChanges repository(WebhookTeamEditedChangesRepository repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<WebhookTeamEditedChangesRepository> getRepository() {
        return repository;
    }

    public void setRepository(Optional<WebhookTeamEditedChangesRepository> repository) {
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
