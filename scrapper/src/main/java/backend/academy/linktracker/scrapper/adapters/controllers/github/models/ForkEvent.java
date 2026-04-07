package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ForkEvent
 */
@JsonTypeName("fork-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ForkEvent implements EventPayload {

    private String action;

    private ForkEventForkee forkee;

    public ForkEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ForkEvent(String action, ForkEventForkee forkee) {
        this.action = action;
        this.forkee = forkee;
    }

    public ForkEvent action(String action) {
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

    public ForkEvent forkee(ForkEventForkee forkee) {
        this.forkee = forkee;
        return this;
    }

    /**
     * Get forkee
     * @return forkee
     */
    @NotNull
    @Valid
    @Schema(name = "forkee", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("forkee")
    public ForkEventForkee getForkee() {
        return forkee;
    }

    public void setForkee(ForkEventForkee forkee) {
        this.forkee = forkee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ForkEvent forkEvent = (ForkEvent) o;
        return Objects.equals(this.action, forkEvent.action) && Objects.equals(this.forkee, forkEvent.forkee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, forkee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForkEvent {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    forkee: ").append(toIndentedString(forkee)).append("\n");
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
