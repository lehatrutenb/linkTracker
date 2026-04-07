package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhookProjectsV2StatusUpdateEditedChangesStartDate
 */
@JsonTypeName("webhook_projects_v2_status_update_edited_changes_start_date")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectsV2StatusUpdateEditedChangesStartDate {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private JsonNullable<LocalDate> from = JsonNullable.<LocalDate>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private JsonNullable<LocalDate> to = JsonNullable.<LocalDate>undefined();

    public WebhookProjectsV2StatusUpdateEditedChangesStartDate from(LocalDate from) {
        this.from = JsonNullable.of(from);
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @Valid
    @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("from")
    public JsonNullable<LocalDate> getFrom() {
        return from;
    }

    public void setFrom(JsonNullable<LocalDate> from) {
        this.from = from;
    }

    public WebhookProjectsV2StatusUpdateEditedChangesStartDate to(LocalDate to) {
        this.to = JsonNullable.of(to);
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @Valid
    @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("to")
    public JsonNullable<LocalDate> getTo() {
        return to;
    }

    public void setTo(JsonNullable<LocalDate> to) {
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
        return equalsNullable(this.from, webhookProjectsV2StatusUpdateEditedChangesStartDate.from)
                && equalsNullable(this.to, webhookProjectsV2StatusUpdateEditedChangesStartDate.to);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(from), hashCodeNullable(to));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
