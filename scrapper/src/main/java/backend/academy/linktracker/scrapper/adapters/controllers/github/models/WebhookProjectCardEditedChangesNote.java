package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookProjectCardEditedChangesNote
 */
@JsonTypeName("webhook_project_card_edited_changes_note")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectCardEditedChangesNote {

    private JsonNullable<String> from = JsonNullable.<String>undefined();

    public WebhookProjectCardEditedChangesNote() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectCardEditedChangesNote(String from) {
        this.from = JsonNullable.of(from);
    }

    public WebhookProjectCardEditedChangesNote from(String from) {
        this.from = JsonNullable.of(from);
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @NotNull
    @Schema(name = "from", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("from")
    public JsonNullable<String> getFrom() {
        return from;
    }

    public void setFrom(JsonNullable<String> from) {
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
        WebhookProjectCardEditedChangesNote webhookProjectCardEditedChangesNote =
                (WebhookProjectCardEditedChangesNote) o;
        return Objects.equals(this.from, webhookProjectCardEditedChangesNote.from);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectCardEditedChangesNote {\n");
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
