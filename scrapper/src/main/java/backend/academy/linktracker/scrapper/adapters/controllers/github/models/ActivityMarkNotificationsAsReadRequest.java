package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * ActivityMarkNotificationsAsReadRequest
 */
@JsonTypeName("activity_mark_notifications_as_read_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActivityMarkNotificationsAsReadRequest {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> lastReadAt = Optional.empty();

    private Optional<Boolean> read = Optional.empty();

    public ActivityMarkNotificationsAsReadRequest lastReadAt(OffsetDateTime lastReadAt) {
        this.lastReadAt = Optional.ofNullable(lastReadAt);
        return this;
    }

    /**
     * Describes the last point that notifications were checked. Anything updated since this time will not be marked as read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.
     * @return lastReadAt
     */
    @Valid
    @Schema(
            name = "last_read_at",
            description =
                    "Describes the last point that notifications were checked. Anything updated since this time will not be marked as read. If you omit this parameter, all notifications are marked as read. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`. Default: The current timestamp.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_read_at")
    public Optional<OffsetDateTime> getLastReadAt() {
        return lastReadAt;
    }

    public void setLastReadAt(Optional<OffsetDateTime> lastReadAt) {
        this.lastReadAt = lastReadAt;
    }

    public ActivityMarkNotificationsAsReadRequest read(Boolean read) {
        this.read = Optional.ofNullable(read);
        return this;
    }

    /**
     * Whether the notification has been read.
     * @return read
     */
    @Schema(
            name = "read",
            description = "Whether the notification has been read.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("read")
    public Optional<Boolean> getRead() {
        return read;
    }

    public void setRead(Optional<Boolean> read) {
        this.read = read;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivityMarkNotificationsAsReadRequest activityMarkNotificationsAsReadRequest =
                (ActivityMarkNotificationsAsReadRequest) o;
        return Objects.equals(this.lastReadAt, activityMarkNotificationsAsReadRequest.lastReadAt)
                && Objects.equals(this.read, activityMarkNotificationsAsReadRequest.read);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastReadAt, read);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityMarkNotificationsAsReadRequest {\n");
        sb.append("    lastReadAt: ").append(toIndentedString(lastReadAt)).append("\n");
        sb.append("    read: ").append(toIndentedString(read)).append("\n");
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
