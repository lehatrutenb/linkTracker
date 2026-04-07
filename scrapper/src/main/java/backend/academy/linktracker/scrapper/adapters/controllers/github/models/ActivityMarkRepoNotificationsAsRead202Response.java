package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * ActivityMarkRepoNotificationsAsRead202Response
 */
@JsonTypeName("activity_mark_repo_notifications_as_read_202_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActivityMarkRepoNotificationsAsRead202Response {

    private Optional<String> message = Optional.empty();

    private Optional<String> url = Optional.empty();

    public ActivityMarkRepoNotificationsAsRead202Response message(String message) {
        this.message = Optional.ofNullable(message);
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public Optional<String> getMessage() {
        return message;
    }

    public void setMessage(Optional<String> message) {
        this.message = message;
    }

    public ActivityMarkRepoNotificationsAsRead202Response url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActivityMarkRepoNotificationsAsRead202Response activityMarkRepoNotificationsAsRead202Response =
                (ActivityMarkRepoNotificationsAsRead202Response) o;
        return Objects.equals(this.message, activityMarkRepoNotificationsAsRead202Response.message)
                && Objects.equals(this.url, activityMarkRepoNotificationsAsRead202Response.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActivityMarkRepoNotificationsAsRead202Response {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
