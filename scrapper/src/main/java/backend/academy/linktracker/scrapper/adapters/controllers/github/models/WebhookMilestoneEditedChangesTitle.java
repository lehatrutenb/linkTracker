package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookMilestoneEditedChangesTitle
 */
@JsonTypeName("webhook_milestone_edited_changes_title")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMilestoneEditedChangesTitle {

    private String from;

    public WebhookMilestoneEditedChangesTitle() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMilestoneEditedChangesTitle(String from) {
        this.from = from;
    }

    public WebhookMilestoneEditedChangesTitle from(String from) {
        this.from = from;
        return this;
    }

    /**
     * The previous version of the title if the action was `edited`.
     * @return from
     */
    @NotNull
    @Schema(
            name = "from",
            description = "The previous version of the title if the action was `edited`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookMilestoneEditedChangesTitle webhookMilestoneEditedChangesTitle = (WebhookMilestoneEditedChangesTitle) o;
        return Objects.equals(this.from, webhookMilestoneEditedChangesTitle.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMilestoneEditedChangesTitle {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
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
