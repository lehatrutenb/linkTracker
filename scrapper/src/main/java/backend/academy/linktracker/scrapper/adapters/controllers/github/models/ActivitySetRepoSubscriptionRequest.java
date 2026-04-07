package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * ActivitySetRepoSubscriptionRequest
 */
@JsonTypeName("activity_set_repo_subscription_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActivitySetRepoSubscriptionRequest {

    private Optional<Boolean> subscribed = Optional.empty();

    private Optional<Boolean> ignored = Optional.empty();

    public ActivitySetRepoSubscriptionRequest subscribed(Boolean subscribed) {
        this.subscribed = Optional.ofNullable(subscribed);
        return this;
    }

    /**
     * Determines if notifications should be received from this repository.
     * @return subscribed
     */
    @Schema(
            name = "subscribed",
            description = "Determines if notifications should be received from this repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscribed")
    public Optional<Boolean> getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Optional<Boolean> subscribed) {
        this.subscribed = subscribed;
    }

    public ActivitySetRepoSubscriptionRequest ignored(Boolean ignored) {
        this.ignored = Optional.ofNullable(ignored);
        return this;
    }

    /**
     * Determines if all notifications should be blocked from this repository.
     * @return ignored
     */
    @Schema(
            name = "ignored",
            description = "Determines if all notifications should be blocked from this repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ignored")
    public Optional<Boolean> getIgnored() {
        return ignored;
    }

    public void setIgnored(Optional<Boolean> ignored) {
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
        ActivitySetRepoSubscriptionRequest activitySetRepoSubscriptionRequest = (ActivitySetRepoSubscriptionRequest) o;
        return Objects.equals(this.subscribed, activitySetRepoSubscriptionRequest.subscribed)
                && Objects.equals(this.ignored, activitySetRepoSubscriptionRequest.ignored);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscribed, ignored);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivitySetRepoSubscriptionRequest {\n");
        sb.append("    subscribed: ").append(toIndentedString(subscribed)).append("\n");
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
