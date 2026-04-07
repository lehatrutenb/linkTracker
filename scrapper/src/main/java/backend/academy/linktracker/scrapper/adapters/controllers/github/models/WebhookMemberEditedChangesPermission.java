package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookMemberEditedChangesPermission
 */
@JsonTypeName("webhook_member_edited_changes_permission")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMemberEditedChangesPermission {

    private JsonNullable<String> from = JsonNullable.<String>undefined();

    private JsonNullable<String> to = JsonNullable.<String>undefined();

    public WebhookMemberEditedChangesPermission from(String from) {
        this.from = JsonNullable.of(from);
        return this;
    }

    /**
     * Get from
     * @return from
     */
    @Schema(name = "from", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("from")
    public JsonNullable<String> getFrom() {
        return from;
    }

    public void setFrom(JsonNullable<String> from) {
        this.from = from;
    }

    public WebhookMemberEditedChangesPermission to(String to) {
        this.to = JsonNullable.of(to);
        return this;
    }

    /**
     * Get to
     * @return to
     */
    @Schema(name = "to", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("to")
    public JsonNullable<String> getTo() {
        return to;
    }

    public void setTo(JsonNullable<String> to) {
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
        WebhookMemberEditedChangesPermission webhookMemberEditedChangesPermission =
                (WebhookMemberEditedChangesPermission) o;
        return equalsNullable(this.from, webhookMemberEditedChangesPermission.from)
                && equalsNullable(this.to, webhookMemberEditedChangesPermission.to);
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
        sb.append("class WebhookMemberEditedChangesPermission {\n");
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
