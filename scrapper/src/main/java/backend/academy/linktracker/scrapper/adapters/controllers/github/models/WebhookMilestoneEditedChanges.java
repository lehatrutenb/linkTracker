package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * The changes to the milestone if the action was &#x60;edited&#x60;.
 */
@Schema(
        name = "webhook_milestone_edited_changes",
        description = "The changes to the milestone if the action was `edited`.")
@JsonTypeName("webhook_milestone_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMilestoneEditedChanges {

    private Optional<WebhookLabelEditedChangesDescription> description = Optional.empty();

    private Optional<WebhookMilestoneEditedChangesDueOn> dueOn = Optional.empty();

    private Optional<WebhookMilestoneEditedChangesTitle> title = Optional.empty();

    public WebhookMilestoneEditedChanges description(WebhookLabelEditedChangesDescription description) {
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

    public WebhookMilestoneEditedChanges dueOn(WebhookMilestoneEditedChangesDueOn dueOn) {
        this.dueOn = Optional.ofNullable(dueOn);
        return this;
    }

    /**
     * Get dueOn
     * @return dueOn
     */
    @Valid
    @Schema(name = "due_on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("due_on")
    public Optional<WebhookMilestoneEditedChangesDueOn> getDueOn() {
        return dueOn;
    }

    public void setDueOn(Optional<WebhookMilestoneEditedChangesDueOn> dueOn) {
        this.dueOn = dueOn;
    }

    public WebhookMilestoneEditedChanges title(WebhookMilestoneEditedChangesTitle title) {
        this.title = Optional.ofNullable(title);
        return this;
    }

    /**
     * Get title
     * @return title
     */
    @Valid
    @Schema(name = "title", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public Optional<WebhookMilestoneEditedChangesTitle> getTitle() {
        return title;
    }

    public void setTitle(Optional<WebhookMilestoneEditedChangesTitle> title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookMilestoneEditedChanges webhookMilestoneEditedChanges = (WebhookMilestoneEditedChanges) o;
        return Objects.equals(this.description, webhookMilestoneEditedChanges.description)
                && Objects.equals(this.dueOn, webhookMilestoneEditedChanges.dueOn)
                && Objects.equals(this.title, webhookMilestoneEditedChanges.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, dueOn, title);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMilestoneEditedChanges {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    dueOn: ").append(toIndentedString(dueOn)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
