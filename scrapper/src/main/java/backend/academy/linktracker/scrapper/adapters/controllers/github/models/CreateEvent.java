package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CreateEvent
 */
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CreateEvent implements EventPayload {

    private String ref;

    private String refType;

    private String fullRef;

    private String masterBranch;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private String pusherType;

    public CreateEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CreateEvent(String ref, String refType, String fullRef, String masterBranch, String pusherType) {
        this.ref = ref;
        this.refType = refType;
        this.fullRef = fullRef;
        this.masterBranch = masterBranch;
        this.pusherType = pusherType;
    }

    public CreateEvent ref(String ref) {
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

    public CreateEvent refType(String refType) {
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

    public CreateEvent fullRef(String fullRef) {
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

    public CreateEvent masterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
        return this;
    }

    /**
     * Get masterBranch
     * @return masterBranch
     */
    @NotNull
    @Schema(name = "master_branch", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("master_branch")
    public String getMasterBranch() {
        return masterBranch;
    }

    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    public CreateEvent description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public CreateEvent pusherType(String pusherType) {
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
        CreateEvent createEvent = (CreateEvent) o;
        return Objects.equals(this.ref, createEvent.ref)
                && Objects.equals(this.refType, createEvent.refType)
                && Objects.equals(this.fullRef, createEvent.fullRef)
                && Objects.equals(this.masterBranch, createEvent.masterBranch)
                && equalsNullable(this.description, createEvent.description)
                && Objects.equals(this.pusherType, createEvent.pusherType);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, refType, fullRef, masterBranch, hashCodeNullable(description), pusherType);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEvent {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    refType: ").append(toIndentedString(refType)).append("\n");
        sb.append("    fullRef: ").append(toIndentedString(fullRef)).append("\n");
        sb.append("    masterBranch: ").append(toIndentedString(masterBranch)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
