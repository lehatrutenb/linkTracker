package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Timeline Cross Referenced Event
 */
@Schema(name = "timeline-cross-referenced-event", description = "Timeline Cross Referenced Event")
@JsonTypeName("timeline-cross-referenced-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TimelineCrossReferencedEvent {

    private String event;

    private Optional<SimpleUser> actor = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private TimelineCrossReferencedEventSource source;

    public TimelineCrossReferencedEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TimelineCrossReferencedEvent(
            String event,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            TimelineCrossReferencedEventSource source) {
        this.event = event;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.source = source;
    }

    public TimelineCrossReferencedEvent event(String event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @NotNull
    @Schema(name = "event", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public TimelineCrossReferencedEvent actor(SimpleUser actor) {
        this.actor = Optional.ofNullable(actor);
        return this;
    }

    /**
     * Get actor
     * @return actor
     */
    @Valid
    @Schema(name = "actor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor")
    public Optional<SimpleUser> getActor() {
        return actor;
    }

    public void setActor(Optional<SimpleUser> actor) {
        this.actor = actor;
    }

    public TimelineCrossReferencedEvent createdAt(OffsetDateTime createdAt) {
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

    public TimelineCrossReferencedEvent updatedAt(OffsetDateTime updatedAt) {
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

    public TimelineCrossReferencedEvent source(TimelineCrossReferencedEventSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get source
     * @return source
     */
    @NotNull
    @Valid
    @Schema(name = "source", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source")
    public TimelineCrossReferencedEventSource getSource() {
        return source;
    }

    public void setSource(TimelineCrossReferencedEventSource source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimelineCrossReferencedEvent timelineCrossReferencedEvent = (TimelineCrossReferencedEvent) o;
        return Objects.equals(this.event, timelineCrossReferencedEvent.event)
                && Objects.equals(this.actor, timelineCrossReferencedEvent.actor)
                && Objects.equals(this.createdAt, timelineCrossReferencedEvent.createdAt)
                && Objects.equals(this.updatedAt, timelineCrossReferencedEvent.updatedAt)
                && Objects.equals(this.source, timelineCrossReferencedEvent.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, actor, createdAt, updatedAt, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimelineCrossReferencedEvent {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
