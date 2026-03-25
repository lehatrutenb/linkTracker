package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * DeleteEvent
 */
@JsonTypeName("delete-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeleteEvent implements EventPayload {

    private String ref;

    private String refType;

    private String fullRef;

    private String pusherType;

    public DeleteEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeleteEvent(String ref, String refType, String fullRef, String pusherType) {
        this.ref = ref;
        this.refType = refType;
        this.fullRef = fullRef;
        this.pusherType = pusherType;
    }

    public DeleteEvent ref(String ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @NotNull
    @Schema(name = "ref", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public DeleteEvent refType(String refType) {
        this.refType = refType;
        return this;
    }

    /**
     * Get refType
     * @return refType
     */
    @NotNull
    @Schema(name = "ref_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref_type")
    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public DeleteEvent fullRef(String fullRef) {
        this.fullRef = fullRef;
        return this;
    }

    /**
     * Get fullRef
     * @return fullRef
     */
    @NotNull
    @Schema(name = "full_ref", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("full_ref")
    public String getFullRef() {
        return fullRef;
    }

    public void setFullRef(String fullRef) {
        this.fullRef = fullRef;
    }

    public DeleteEvent pusherType(String pusherType) {
        this.pusherType = pusherType;
        return this;
    }

    /**
     * Get pusherType
     * @return pusherType
     */
    @NotNull
    @Schema(name = "pusher_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pusher_type")
    public String getPusherType() {
        return pusherType;
    }

    public void setPusherType(String pusherType) {
        this.pusherType = pusherType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteEvent deleteEvent = (DeleteEvent) o;
        return Objects.equals(this.ref, deleteEvent.ref)
                && Objects.equals(this.refType, deleteEvent.refType)
                && Objects.equals(this.fullRef, deleteEvent.fullRef)
                && Objects.equals(this.pusherType, deleteEvent.pusherType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, refType, fullRef, pusherType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEvent {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
        sb.append("    fullRef: ").append(toIndentedString(fullRef)).append("\n");
        sb.append("    pusherType: ").append(toIndentedString(pusherType)).append("\n");
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
