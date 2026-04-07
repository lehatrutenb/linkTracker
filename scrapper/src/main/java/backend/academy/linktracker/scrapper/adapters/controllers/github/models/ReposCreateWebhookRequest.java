package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;

/**
 * ReposCreateWebhookRequest
 */
@JsonTypeName("repos_create_webhook_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateWebhookRequest {

    private Optional<String> name = Optional.empty();

    private Optional<ReposCreateWebhookRequestConfig> config = Optional.empty();

    @Valid
    private List<String> events = new ArrayList<>(Arrays.asList("push"));

    private Optional<Boolean> active = Optional.of(true);

    public ReposCreateWebhookRequest name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Use `web` to create a webhook. Default: `web`. This parameter only accepts the value `web`.
     * @return name
     */
    @Schema(
            name = "name",
            description = "Use `web` to create a webhook. Default: `web`. This parameter only accepts the value `web`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public ReposCreateWebhookRequest config(ReposCreateWebhookRequestConfig config) {
        this.config = Optional.ofNullable(config);
        return this;
    }

    /**
     * Get config
     * @return config
     */
    @Valid
    @Schema(name = "config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("config")
    public Optional<ReposCreateWebhookRequestConfig> getConfig() {
        return config;
    }

    public void setConfig(Optional<ReposCreateWebhookRequestConfig> config) {
        this.config = config;
    }

    public ReposCreateWebhookRequest events(List<String> events) {
        this.events = events;
        return this;
    }

    public ReposCreateWebhookRequest addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>(Arrays.asList("push"));
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for.
     * @return events
     */
    @Schema(
            name = "events",
            description =
                    "Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public ReposCreateWebhookRequest active(Boolean active) {
        this.active = Optional.ofNullable(active);
        return this;
    }

    /**
     * Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.
     * @return active
     */
    @Schema(
            name = "active",
            description =
                    "Determines if notifications are sent when the webhook is triggered. Set to `true` to send notifications.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("active")
    public Optional<Boolean> getActive() {
        return active;
    }

    public void setActive(Optional<Boolean> active) {
        this.active = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateWebhookRequest reposCreateWebhookRequest = (ReposCreateWebhookRequest) o;
        return Objects.equals(this.name, reposCreateWebhookRequest.name)
                && Objects.equals(this.config, reposCreateWebhookRequest.config)
                && Objects.equals(this.events, reposCreateWebhookRequest.events)
                && Objects.equals(this.active, reposCreateWebhookRequest.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, config, events, active);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateWebhookRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
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
