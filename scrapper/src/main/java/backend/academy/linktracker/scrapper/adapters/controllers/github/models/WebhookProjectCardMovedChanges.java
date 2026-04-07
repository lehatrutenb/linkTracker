package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookProjectCardMovedChanges
 */
@JsonTypeName("webhook_project_card_moved_changes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectCardMovedChanges {

    private WebhookProjectCardMovedChangesColumnId columnId;

    public WebhookProjectCardMovedChanges() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectCardMovedChanges(WebhookProjectCardMovedChangesColumnId columnId) {
        this.columnId = columnId;
    }

    public WebhookProjectCardMovedChanges columnId(WebhookProjectCardMovedChangesColumnId columnId) {
        this.columnId = columnId;
        return this;
    }

    /**
     * Get columnId
     * @return columnId
     */
    @NotNull
    @Valid
    @Schema(name = "column_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("column_id")
    public WebhookProjectCardMovedChangesColumnId getColumnId() {
        return columnId;
    }

    public void setColumnId(WebhookProjectCardMovedChangesColumnId columnId) {
        this.columnId = columnId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectCardMovedChanges webhookProjectCardMovedChanges = (WebhookProjectCardMovedChanges) o;
        return Objects.equals(this.columnId, webhookProjectCardMovedChanges.columnId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectCardMovedChanges {\n");
        sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
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
