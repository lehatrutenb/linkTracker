package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Hovercard
 */
@Schema(name = "hovercard", description = "Hovercard")
@JsonTypeName("hovercard")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Hovercard {

    @Valid
    private List<@Valid HovercardContextsInner> contexts = new ArrayList<>();

    public Hovercard() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Hovercard(List<@Valid HovercardContextsInner> contexts) {
        this.contexts = contexts;
    }

    public Hovercard contexts(List<@Valid HovercardContextsInner> contexts) {
        this.contexts = contexts;
        return this;
    }

    public Hovercard addContextsItem(HovercardContextsInner contextsItem) {
        if (this.contexts == null) {
            this.contexts = new ArrayList<>();
        }
        this.contexts.add(contextsItem);
        return this;
    }

    /**
     * Get contexts
     * @return contexts
     */
    @NotNull
    @Valid
    @Schema(name = "contexts", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("contexts")
    public List<@Valid HovercardContextsInner> getContexts() {
        return contexts;
    }

    public void setContexts(List<@Valid HovercardContextsInner> contexts) {
        this.contexts = contexts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Hovercard hovercard = (Hovercard) o;
        return Objects.equals(this.contexts, hovercard.contexts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contexts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Hovercard {\n");
        sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
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
