package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhookProjectsV2StatusUpdateEditedChangesStartDate
 */
@JsonTypeName("webhook_projects_v2_status_update_edited_changes_start_date")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2StatusUpdateEditedChangesStartDate {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate from = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate to = null;

    public WebhookProjectsV2StatusUpdateEditedChangesStartDate from(LocalDate from) {
        this.from = from;
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @Valid
    @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("from")
    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public WebhookProjectsV2StatusUpdateEditedChangesStartDate to(LocalDate to) {
        this.to = to;
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @Valid
    @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("to")
    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectsV2StatusUpdateEditedChangesStartDate webhookProjectsV2StatusUpdateEditedChangesStartDate =
                (WebhookProjectsV2StatusUpdateEditedChangesStartDate) o;
        return Objects.equals(this.from, webhookProjectsV2StatusUpdateEditedChangesStartDate.from)
                && Objects.equals(this.to, webhookProjectsV2StatusUpdateEditedChangesStartDate.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectsV2StatusUpdateEditedChangesStartDate {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
