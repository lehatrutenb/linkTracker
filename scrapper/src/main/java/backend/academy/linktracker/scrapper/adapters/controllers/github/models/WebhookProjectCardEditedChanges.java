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
 * WebhookProjectCardEditedChanges
 */
@JsonTypeName("webhook_project_card_edited_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectCardEditedChanges {

    private WebhookProjectCardEditedChangesNote note;

    public WebhookProjectCardEditedChanges() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectCardEditedChanges(WebhookProjectCardEditedChangesNote note) {
        this.note = note;
    }

    public WebhookProjectCardEditedChanges note(WebhookProjectCardEditedChangesNote note) {
        this.note = note;
        return this;
    }

    /**
     * Get note
     * @return note
     */
    @NotNull
    @Valid
    @Schema(name = "note", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("note")
    public WebhookProjectCardEditedChangesNote getNote() {
        return note;
    }

    public void setNote(WebhookProjectCardEditedChangesNote note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectCardEditedChanges webhookProjectCardEditedChanges = (WebhookProjectCardEditedChanges) o;
        return Objects.equals(this.note, webhookProjectCardEditedChanges.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(note);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectCardEditedChanges {\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
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
