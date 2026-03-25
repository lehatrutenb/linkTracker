package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Event
 */
@Schema(name = "event", description = "Event")
@JsonTypeName("event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Event {

    private String id;

    private String type = null;

    private Actor actor;

    private EventRepo repo;

    private Actor org;

    private EventPayload payload;

    private Boolean _public;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt = null;

    public Event() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Event(
            String id,
            String type,
            Actor actor,
            EventRepo repo,
            EventPayload payload,
            Boolean _public,
            OffsetDateTime createdAt) {
        this.id = id;
        this.type = type;
        this.actor = actor;
        this.repo = repo;
        this.payload = payload;
        this._public = _public;
        this.createdAt = createdAt;
    }

    public Event id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Event type(String type) {
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

    public Event actor(Actor actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Get actor
     * @return actor
     */
    @NotNull
    @Valid
    @Schema(name = "actor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("actor")
    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Event repo(EventRepo repo) {
        this.repo = repo;
        return this;
    }

    /**
     * Get repo
     * @return repo
     */
    @NotNull
    @Valid
    @Schema(name = "repo", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repo")
    public EventRepo getRepo() {
        return repo;
    }

    public void setRepo(EventRepo repo) {
        this.repo = repo;
    }

    public Event org(Actor org) {
        this.org = org;
        return this;
    }

    /**
     * Get org
     * @return org
     */
    @Valid
    @Schema(name = "org", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("org")
    public Actor getOrg() {
        return org;
    }

    public void setOrg(Actor org) {
        this.org = org;
    }

    public Event payload(EventPayload payload) {
        this.payload = payload;
        return this;
    }

    /**
     * Get payload
     * @return payload
     */
    @NotNull
    @Valid
    @Schema(name = "payload", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("payload")
    public EventPayload getPayload() {
        return payload;
    }

    public void setPayload(EventPayload payload) {
        this.payload = payload;
    }

    public Event _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    /**
     * Get _public
     * @return _public
     */
    @NotNull
    @Schema(name = "public", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public")
    public Boolean getPublic() {
        return _public;
    }

    public void setPublic(Boolean _public) {
        this._public = _public;
    }

    public Event createdAt(OffsetDateTime createdAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Event event = (Event) o;
        return Objects.equals(this.id, event.id)
                && Objects.equals(this.type, event.type)
                && Objects.equals(this.actor, event.actor)
                && Objects.equals(this.repo, event.repo)
                && Objects.equals(this.org, event.org)
                && Objects.equals(this.payload, event.payload)
                && Objects.equals(this._public, event._public)
                && Objects.equals(this.createdAt, event.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, actor, repo, org, payload, _public, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Event {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
        sb.append("    org: ").append(toIndentedString(org)).append("\n");
        sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
        sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
