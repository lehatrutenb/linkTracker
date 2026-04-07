package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * Org Hook
 */
@Schema(name = "org-hook", description = "Org Hook")
@JsonTypeName("org-hook")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgHook {

    private Long id;

    private URI url;

    private URI pingUrl;

    private Optional<URI> deliveriesUrl = Optional.empty();

    private String name;

    @Valid
    private List<String> events = new ArrayList<>();

    private Boolean active;

    private OrgHookConfig config;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private String type;

    public OrgHook() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgHook(
            Long id,
            URI url,
            URI pingUrl,
            String name,
            List<String> events,
            Boolean active,
            OrgHookConfig config,
            OffsetDateTime updatedAt,
            OffsetDateTime createdAt,
            String type) {
        this.id = id;
        this.url = url;
        this.pingUrl = pingUrl;
        this.name = name;
        this.events = events;
        this.active = active;
        this.config = config;
        this.updatedAt = updatedAt;
        this.createdAt = createdAt;
        this.type = type;
    }

    public OrgHook id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrgHook url(URI url) {
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
            example = "https://api.github.com/orgs/octocat/hooks/1",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public OrgHook pingUrl(URI pingUrl) {
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
            example = "https://api.github.com/orgs/octocat/hooks/1/pings",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ping_url")
    public URI getPingUrl() {
        return pingUrl;
    }

    public void setPingUrl(URI pingUrl) {
        this.pingUrl = pingUrl;
    }

    public OrgHook deliveriesUrl(URI deliveriesUrl) {
        this.deliveriesUrl = Optional.ofNullable(deliveriesUrl);
        return this;
    }

    /**
     * Get deliveriesUrl
     * @return deliveriesUrl
     */
    @Valid
    @Schema(
            name = "deliveries_url",
            example = "https://api.github.com/orgs/octocat/hooks/1/deliveries",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deliveries_url")
    public Optional<URI> getDeliveriesUrl() {
        return deliveriesUrl;
    }

    public void setDeliveriesUrl(Optional<URI> deliveriesUrl) {
        this.deliveriesUrl = deliveriesUrl;
    }

    public OrgHook name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "web", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgHook events(List<String> events) {
        this.events = events;
        return this;
    }

    public OrgHook addEventsItem(String eventsItem) {
        if (this.events == null) {
            this.events = new ArrayList<>();
        }
        this.events.add(eventsItem);
        return this;
    }

    /**
     * Get events
     * @return events
     */
    @NotNull
    @Schema(name = "events", example = "[\"push\",\"pull_request\"]", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events")
    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public OrgHook active(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get active
     * @return active
     */
    @NotNull
    @Schema(name = "active", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public OrgHook config(OrgHookConfig config) {
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
    public OrgHookConfig getConfig() {
        return config;
    }

    public void setConfig(OrgHookConfig config) {
        this.config = config;
    }

    public OrgHook updatedAt(OffsetDateTime updatedAt) {
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

    public OrgHook createdAt(OffsetDateTime createdAt) {
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

    public OrgHook type(String type) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgHook orgHook = (OrgHook) o;
        return Objects.equals(this.id, orgHook.id)
                && Objects.equals(this.url, orgHook.url)
                && Objects.equals(this.pingUrl, orgHook.pingUrl)
                && Objects.equals(this.deliveriesUrl, orgHook.deliveriesUrl)
                && Objects.equals(this.name, orgHook.name)
                && Objects.equals(this.events, orgHook.events)
                && Objects.equals(this.active, orgHook.active)
                && Objects.equals(this.config, orgHook.config)
                && Objects.equals(this.updatedAt, orgHook.updatedAt)
                && Objects.equals(this.createdAt, orgHook.createdAt)
                && Objects.equals(this.type, orgHook.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, pingUrl, deliveriesUrl, name, events, active, config, updatedAt, createdAt, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgHook {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    pingUrl: ").append(toIndentedString(pingUrl)).append("\n");
        sb.append("    deliveriesUrl: ").append(toIndentedString(deliveriesUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    events: ").append(toIndentedString(events)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
