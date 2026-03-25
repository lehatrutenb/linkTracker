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
 * OrgsUpdateWebhookRequest
 */
@JsonTypeName("orgs_update_webhook_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsUpdateWebhookRequest {

    private OrgsUpdateWebhookRequestConfig config;

    @Valid
    private List<String> events = new ArrayList<>(Arrays.asList("push"));

    private Boolean active = true;

    private String name;

    public OrgsUpdateWebhookRequest config(OrgsUpdateWebhookRequestConfig config) {
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
    public OrgsUpdateWebhookRequestConfig getConfig() {
        return config;
    }

    public void setConfig(OrgsUpdateWebhookRequestConfig config) {
        this.config = config;
    }

    public OrgsUpdateWebhookRequest events(List<String> events) {
        this.events = events;
        return this;
    }

    public OrgsUpdateWebhookRequest addEventsItem(String eventsItem) {
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

    public OrgsUpdateWebhookRequest active(Boolean active) {
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

    public OrgsUpdateWebhookRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", example = "\"web\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsUpdateWebhookRequest orgsUpdateWebhookRequest = (OrgsUpdateWebhookRequest) o;
        return Objects.equals(this.config, orgsUpdateWebhookRequest.config)
                && Objects.equals(this.events, orgsUpdateWebhookRequest.events)
                && Objects.equals(this.active, orgsUpdateWebhookRequest.active)
                && Objects.equals(this.name, orgsUpdateWebhookRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, events, active, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsUpdateWebhookRequest {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
