package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * HovercardContextsInner
 */
@JsonTypeName("hovercard_contexts_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class HovercardContextsInner {

    private String message;

    private String octicon;

    public HovercardContextsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public HovercardContextsInner(String message, String octicon) {
        this.message = message;
        this.octicon = octicon;
    }

    public HovercardContextsInner message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @NotNull
    @Schema(name = "message", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HovercardContextsInner octicon(String octicon) {
        this.octicon = octicon;
        return this;
    }

    /**
     * Get octicon
     * @return octicon
     */
    @NotNull
    @Schema(name = "octicon", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("octicon")
    public String getOcticon() {
        return octicon;
    }

    public void setOcticon(String octicon) {
        this.octicon = octicon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HovercardContextsInner hovercardContextsInner = (HovercardContextsInner) o;
        return Objects.equals(this.message, hovercardContextsInner.message)
                && Objects.equals(this.octicon, hovercardContextsInner.octicon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, octicon);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HovercardContextsInner {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    octicon: ").append(toIndentedString(octicon)).append("\n");
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
