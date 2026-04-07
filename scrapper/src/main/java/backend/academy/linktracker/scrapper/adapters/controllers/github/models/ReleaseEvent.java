package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ReleaseEvent
 */
@JsonTypeName("release-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReleaseEvent implements EventPayload {

    private String action;

    private ReleaseEventRelease release;

    public ReleaseEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReleaseEvent(String action, ReleaseEventRelease release) {
        this.action = action;
        this.release = release;
    }

    public ReleaseEvent action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @NotNull
    @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ReleaseEvent release(ReleaseEventRelease release) {
        this.release = release;
        return this;
    }

    /**
     * Get release
     * @return release
     */
    @NotNull
    @Valid
    @Schema(name = "release", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("release")
    public ReleaseEventRelease getRelease() {
        return release;
    }

    public void setRelease(ReleaseEventRelease release) {
        this.release = release;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReleaseEvent releaseEvent = (ReleaseEvent) o;
        return Objects.equals(this.action, releaseEvent.action) && Objects.equals(this.release, releaseEvent.release);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, release);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReleaseEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    release: ").append(toIndentedString(release)).append("\n");
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
