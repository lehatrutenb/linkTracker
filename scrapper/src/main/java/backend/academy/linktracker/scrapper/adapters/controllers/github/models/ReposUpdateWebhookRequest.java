package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * ReposUpdateWebhookRequest
 */
@JsonTypeName("repos_update_webhook_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateWebhookRequest {

    private WebhookConfig config;

    @Valid
    private List<String> events = new ArrayList<>(Arrays.asList("push"));

    @Valid
    private List<String> addEvents = new ArrayList<>();

    @Valid
    private List<String> removeEvents = new ArrayList<>();

    private Boolean active = true;

    public ReposUpdateWebhookRequest config(WebhookConfig config) {
        this.config = config;
        return this;
    }

    /**
     * Get config
     * @return config
     */
    @Valid
    @Schema(name = "config", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("config")
    public WebhookConfig getConfig() {
        return config;
    }

    public void setConfig(WebhookConfig config) {
        this.config = config;
    }

    public ReposUpdateWebhookRequest events(List<String> events) {
        this.events = events;
        return this;
    }

    public ReposUpdateWebhookRequest addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>(Arrays.asList("push"));
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. This replaces the entire array of events.
     * @return events
     */
    @Schema(
            name = "events",
            description =
                    "Determines what [events](https://docs.github.com/webhooks/event-payloads) the hook is triggered for. This replaces the entire array of events.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public ReposUpdateWebhookRequest addEvents(List<String> addEvents) {
        this.addEvents = addEvents;
        return this;
    }

    public ReposUpdateWebhookRequest addAddEventsItem(String addEventsItem) {
        if (this.addEvents == null) {
            this.addEvents = new ArrayList<>();
        }
        this.addEvents.add(addEventsItem);
        return this;
    }

    /**
     * Determines a list of events to be added to the list of events that the Hook triggers for.
     * @return addEvents
     */
    @Schema(
            name = "add_events",
            description = "Determines a list of events to be added to the list of events that the Hook triggers for.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("add_events")
    public List<String> getAddEvents() {
        return addEvents;
    }

    public void setAddEvents(List<String> addEvents) {
        this.addEvents = addEvents;
    }

    public ReposUpdateWebhookRequest removeEvents(List<String> removeEvents) {
        this.removeEvents = removeEvents;
        return this;
    }

    public ReposUpdateWebhookRequest addRemoveEventsItem(String removeEventsItem) {
        if (this.removeEvents == null) {
            this.removeEvents = new ArrayList<>();
        }
        this.removeEvents.add(removeEventsItem);
        return this;
    }

    /**
     * Determines a list of events to be removed from the list of events that the Hook triggers for.
     * @return removeEvents
     */
    @Schema(
            name = "remove_events",
            description =
                    "Determines a list of events to be removed from the list of events that the Hook triggers for.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("remove_events")
    public List<String> getRemoveEvents() {
        return removeEvents;
    }

    public void setRemoveEvents(List<String> removeEvents) {
        this.removeEvents = removeEvents;
    }

    public ReposUpdateWebhookRequest active(Boolean active) {
        this.active = active;
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
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
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
        ReposUpdateWebhookRequest reposUpdateWebhookRequest = (ReposUpdateWebhookRequest) o;
        return Objects.equals(this.config, reposUpdateWebhookRequest.config)
                && Objects.equals(this.events, reposUpdateWebhookRequest.events)
                && Objects.equals(this.addEvents, reposUpdateWebhookRequest.addEvents)
                && Objects.equals(this.removeEvents, reposUpdateWebhookRequest.removeEvents)
                && Objects.equals(this.active, reposUpdateWebhookRequest.active);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, events, addEvents, removeEvents, active);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateWebhookRequest {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    addEvents: ").append(toIndentedString(addEvents)).append("\n");
        sb.append("    removeEvents: ").append(toIndentedString(removeEvents)).append("\n");
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
