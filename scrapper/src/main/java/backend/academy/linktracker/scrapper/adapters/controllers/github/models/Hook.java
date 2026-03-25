package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Webhooks for repositories.
 */
@Schema(name = "hook", description = "Webhooks for repositories.")
@JsonTypeName("hook")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Hook {

    private String type;

    private Long id;

    private String name;

    private Boolean active;

    @Valid
    private List<String> events = new ArrayList<>();

    private WebhookConfig config;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private URI url;

    private URI testUrl;

    private URI pingUrl;

    private URI deliveriesUrl;

    private HookResponse lastResponse;

    public Hook() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Hook(
            String type,
            Long id,
            String name,
            Boolean active,
            List<String> events,
            WebhookConfig config,
            OffsetDateTime updatedAt,
            OffsetDateTime createdAt,
            URI url,
            URI testUrl,
            URI pingUrl,
            HookResponse lastResponse) {
        this.type = type;
        this.id = id;
        this.name = name;
        this.active = active;
        this.events = events;
        this.config = config;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.url = url;
        this.testUrl = testUrl;
        this.pingUrl = pingUrl;
        this.lastResponse = lastResponse;
    }

    public Hook type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hook id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the webhook.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the webhook.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hook name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of a valid service, use 'web' for a webhook.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "web",
            description = "The name of a valid service, use 'web' for a webhook.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hook active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Determines whether the hook is actually triggered on pushes.
     * @return active
     */
    @NotNull
    @Schema(
            name = "active",
            example = "true",
            description = "Determines whether the hook is actually triggered on pushes.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Hook events(List<String> events) {
        this.events = events;
        return this;
    }

    public Hook addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Determines what events the hook is triggered for. Default: ['push'].
     * @return events
     */
    @NotNull
    @Schema(
            name = "events",
            example = "[\"push\",\"pull_request\"]",
            description = "Determines what events the hook is triggered for. Default: ['push'].",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public Hook config(WebhookConfig config) {
        this.config = config;
        return this;
    }

    /**
     * Get config
     * @return config
     */
    @NotNull
    @Valid
    @Schema(name = "config", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("config")
    public WebhookConfig getConfig() {
        return config;
    }

    public void setConfig(WebhookConfig config) {
        this.config = config;
    }

    public Hook updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2011-09-06T20:39:23Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Hook createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2011-09-06T17:26:27Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Hook url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/octocat/Hello-World/hooks/1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public Hook testUrl(URI testUrl) {
        this.testUrl = testUrl;
        return this;
    }

    /**
     * Get testUrl
     * @return testUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "test_url",
            example = "https://api.github.com/repos/octocat/Hello-World/hooks/1/test",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("test_url")
    public URI getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(URI testUrl) {
        this.testUrl = testUrl;
    }

    public Hook pingUrl(URI pingUrl) {
        this.pingUrl = pingUrl;
        return this;
    }

    /**
     * Get pingUrl
     * @return pingUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "ping_url",
            example = "https://api.github.com/repos/octocat/Hello-World/hooks/1/pings",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ping_url")
    public URI getPingUrl() {
        return pingUrl;
    }

    public void setPingUrl(URI pingUrl) {
        this.pingUrl = pingUrl;
    }

    public Hook deliveriesUrl(URI deliveriesUrl) {
        this.deliveriesUrl = deliveriesUrl;
        return this;
    }

    /**
     * Get deliveriesUrl
     * @return deliveriesUrl
     */
    @Valid
    @Schema(
            name = "deliveries_url",
            example = "https://api.github.com/repos/octocat/Hello-World/hooks/1/deliveries",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deliveries_url")
    public URI getDeliveriesUrl() {
        return deliveriesUrl;
    }

    public void setDeliveriesUrl(URI deliveriesUrl) {
        this.deliveriesUrl = deliveriesUrl;
    }

    public Hook lastResponse(HookResponse lastResponse) {
        this.lastResponse = lastResponse;
        return this;
    }

    /**
     * Get lastResponse
     * @return lastResponse
     */
    @NotNull
    @Valid
    @Schema(name = "last_response", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("last_response")
    public HookResponse getLastResponse() {
        return lastResponse;
    }

    public void setLastResponse(HookResponse lastResponse) {
        this.lastResponse = lastResponse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Hook hook = (Hook) o;
        return Objects.equals(this.type, hook.type)
                && Objects.equals(this.id, hook.id)
                && Objects.equals(this.name, hook.name)
                && Objects.equals(this.active, hook.active)
                && Objects.equals(this.events, hook.events)
                && Objects.equals(this.config, hook.config)
                && Objects.equals(this.updatedAt, hook.updatedAt)
                && Objects.equals(this.createdAt, hook.createdAt)
                && Objects.equals(this.url, hook.url)
                && Objects.equals(this.testUrl, hook.testUrl)
                && Objects.equals(this.pingUrl, hook.pingUrl)
                && Objects.equals(this.deliveriesUrl, hook.deliveriesUrl)
                && Objects.equals(this.lastResponse, hook.lastResponse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                type,
                id,
                name,
                active,
                events,
                config,
                updatedAt,
                createdAt,
                url,
                testUrl,
                pingUrl,
                deliveriesUrl,
                lastResponse);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Hook {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    testUrl: ").append(toIndentedString(testUrl)).append("\n");
        sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
        sb.append("    deliveriesUrl: ").append(toIndentedString(deliveriesUrl)).append("\n");
        sb.append("    lastResponse: ").append(toIndentedString(lastResponse)).append("\n");
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
