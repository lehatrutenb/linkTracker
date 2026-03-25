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
 * ActivityMarkRepoNotificationsAsReadRequest
 */
@JsonTypeName("activity_mark_repo_notifications_as_read_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActivityMarkRepoNotificationsAsReadRequest {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime lastReadAt;

    public ActivityMarkRepoNotificationsAsReadRequest lastReadAt(OffsetDateTime lastReadAt) {
        this.lastReadAt = lastReadAt;
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
    public OffsetDateTime getLastReadAt() {
        return lastReadAt;
    }

    public void setLastReadAt(OffsetDateTime lastReadAt) {
        this.lastReadAt = lastReadAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivityMarkRepoNotificationsAsReadRequest activityMarkRepoNotificationsAsReadRequest =
                (ActivityMarkRepoNotificationsAsReadRequest) o;
        return Objects.equals(this.lastReadAt, activityMarkRepoNotificationsAsReadRequest.lastReadAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastReadAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityMarkRepoNotificationsAsReadRequest {\n");
        sb.append("    lastReadAt: ").append(toIndentedString(lastReadAt)).append("\n");
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
