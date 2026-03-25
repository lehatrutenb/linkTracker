package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ActivitySetThreadSubscriptionRequest
 */
@JsonTypeName("activity_set_thread_subscription_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActivitySetThreadSubscriptionRequest {

    private Boolean ignored = false;

    public ActivitySetThreadSubscriptionRequest ignored(Boolean ignored) {
        this.ignored = ignored;
        return this;
    }

    /**
     * Whether to block all notifications from a thread.
     * @return ignored
     */
    @Schema(
            name = "ignored",
            description = "Whether to block all notifications from a thread.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ignored")
    public Boolean getIgnored() {
        return ignored;
    }

    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivitySetThreadSubscriptionRequest activitySetThreadSubscriptionRequest =
                (ActivitySetThreadSubscriptionRequest) o;
        return Objects.equals(this.ignored, activitySetThreadSubscriptionRequest.ignored);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ignored);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivitySetThreadSubscriptionRequest {\n");
        sb.append("    ignored: ").append(toIndentedString(ignored)).append("\n");
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
