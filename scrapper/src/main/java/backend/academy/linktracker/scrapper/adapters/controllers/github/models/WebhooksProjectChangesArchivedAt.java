package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhooksProjectChangesArchivedAt
 */
@JsonTypeName("webhooks_project_changes_archived_at")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksProjectChangesArchivedAt {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime from = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime to = null;

    public WebhooksProjectChangesArchivedAt from(OffsetDateTime from) {
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
    public OffsetDateTime getFrom() {
        return from;
    }

    public void setFrom(OffsetDateTime from) {
        this.from = from;
    }

    public WebhooksProjectChangesArchivedAt to(OffsetDateTime to) {
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
    public OffsetDateTime getTo() {
        return to;
    }

    public void setTo(OffsetDateTime to) {
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
        WebhooksProjectChangesArchivedAt webhooksProjectChangesArchivedAt = (WebhooksProjectChangesArchivedAt) o;
        return Objects.equals(this.from, webhooksProjectChangesArchivedAt.from)
                && Objects.equals(this.to, webhooksProjectChangesArchivedAt.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksProjectChangesArchivedAt {\n");
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
