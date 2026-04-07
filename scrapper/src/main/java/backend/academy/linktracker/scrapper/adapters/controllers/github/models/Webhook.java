package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The webhook that is being pinged
 */
@Schema(name = "Webhook", description = "The webhook that is being pinged")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Webhook {

    private Boolean active;

    private Optional<Long> appId = Optional.empty();

    private WebhookConfig config;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Optional<URI> deliveriesUrl = Optional.empty();

    @Valid
    private List<String> events = new ArrayList<>();

    private Long id;

    private Optional<HookResponse> lastResponse = Optional.empty();

    /**
     * The type of webhook. The only valid value is 'web'.
     */
    public enum NameEnum {
        WEB("web");

        private final String value;

        NameEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NameEnum fromValue(String value) {
            for (NameEnum b : NameEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private NameEnum name;

    private Optional<URI> pingUrl = Optional.empty();

    private Optional<URI> testUrl = Optional.empty();

    private String type;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Optional<URI> url = Optional.empty();

    public Webhook() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Webhook(
            Boolean active,
            WebhookConfig config,
            OffsetDateTime createdAt,
            List<String> events,
            Long id,
            NameEnum name,
            String type,
            OffsetDateTime updatedAt) {
        this.active = active;
        this.config = config;
        this.createdAt = createdAt;
        this.events = events;
        this.id = id;
        this.name = name;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    public Webhook active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Determines whether the hook is actually triggered for the events it subscribes to.
     * @return active
     */
    @NotNull
    @Schema(
            name = "active",
            description = "Determines whether the hook is actually triggered for the events it subscribes to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Webhook appId(Long appId) {
        this.appId = Optional.ofNullable(appId);
        return this;
    }

    /**
     * Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event to the webhook URL you specified during registration. The GitHub App ID sent in this field is required for authenticating an app.
     * @return appId
     */
    @Schema(
            name = "app_id",
            description =
                    "Only included for GitHub Apps. When you register a new GitHub App, GitHub sends a ping event to the webhook URL you specified during registration. The GitHub App ID sent in this field is required for authenticating an app.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("app_id")
    public Optional<Long> getAppId() {
        return appId;
    }

    public void setAppId(Optional<Long> appId) {
        this.appId = appId;
    }

    public Webhook config(WebhookConfig config) {
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

    public Webhook createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Webhook deliveriesUrl(URI deliveriesUrl) {
        this.deliveriesUrl = Optional.ofNullable(deliveriesUrl);
        return this;
    }

    /**
     * Get deliveriesUrl
     * @return deliveriesUrl
     */
    @Valid
    @Schema(name = "deliveries_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deliveries_url")
    public Optional<URI> getDeliveriesUrl() {
        return deliveriesUrl;
    }

    public void setDeliveriesUrl(Optional<URI> deliveriesUrl) {
        this.deliveriesUrl = deliveriesUrl;
    }

    public Webhook events(List<String> events) {
        this.events = events;
        return this;
    }

    public Webhook addEventsItem(String eventsItem) {
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
            description = "Determines what events the hook is triggered for. Default: ['push'].",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public Webhook id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the webhook.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "Unique identifier of the webhook.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Webhook lastResponse(HookResponse lastResponse) {
        this.lastResponse = Optional.ofNullable(lastResponse);
        return this;
    }

    /**
     * Get lastResponse
     * @return lastResponse
     */
    @Valid
    @Schema(name = "last_response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_response")
    public Optional<HookResponse> getLastResponse() {
        return lastResponse;
    }

    public void setLastResponse(Optional<HookResponse> lastResponse) {
        this.lastResponse = lastResponse;
    }

    public Webhook name(NameEnum name) {
        this.name = name;
        return this;
    }

    /**
     * The type of webhook. The only valid value is 'web'.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description = "The type of webhook. The only valid value is 'web'.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public NameEnum getName() {
        return name;
    }

    public void setName(NameEnum name) {
        this.name = name;
    }

    public Webhook pingUrl(URI pingUrl) {
        this.pingUrl = Optional.ofNullable(pingUrl);
        return this;
    }

    /**
     * Get pingUrl
     * @return pingUrl
     */
    @Valid
    @Schema(name = "ping_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ping_url")
    public Optional<URI> getPingUrl() {
        return pingUrl;
    }

    public void setPingUrl(Optional<URI> pingUrl) {
        this.pingUrl = pingUrl;
    }

    public Webhook testUrl(URI testUrl) {
        this.testUrl = Optional.ofNullable(testUrl);
        return this;
    }

    /**
     * Get testUrl
     * @return testUrl
     */
    @Valid
    @Schema(name = "test_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("test_url")
    public Optional<URI> getTestUrl() {
        return testUrl;
    }

    public void setTestUrl(Optional<URI> testUrl) {
        this.testUrl = testUrl;
    }

    public Webhook type(String type) {
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

    public Webhook updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Webhook url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
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
        Webhook webhook = (Webhook) o;
        return Objects.equals(this.active, webhook.active)
                && Objects.equals(this.appId, webhook.appId)
                && Objects.equals(this.config, webhook.config)
                && Objects.equals(this.createdAt, webhook.createdAt)
                && Objects.equals(this.deliveriesUrl, webhook.deliveriesUrl)
                && Objects.equals(this.events, webhook.events)
                && Objects.equals(this.id, webhook.id)
                && Objects.equals(this.lastResponse, webhook.lastResponse)
                && Objects.equals(this.name, webhook.name)
                && Objects.equals(this.pingUrl, webhook.pingUrl)
                && Objects.equals(this.testUrl, webhook.testUrl)
                && Objects.equals(this.type, webhook.type)
                && Objects.equals(this.updatedAt, webhook.updatedAt)
                && Objects.equals(this.url, webhook.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                active,
                appId,
                config,
                createdAt,
                deliveriesUrl,
                events,
                id,
                lastResponse,
                name,
                pingUrl,
                testUrl,
                type,
                updatedAt,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Webhook {\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    deliveriesUrl: ").append(toIndentedString(deliveriesUrl)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastResponse: ").append(toIndentedString(lastResponse)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
        sb.append("    testUrl: ").append(toIndentedString(testUrl)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
