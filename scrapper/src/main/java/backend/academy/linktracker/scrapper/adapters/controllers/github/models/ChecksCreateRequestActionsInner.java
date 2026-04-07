package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.util.Objects;

/**
 * ChecksCreateRequestActionsInner
 */
@JsonTypeName("checks_create_request_actions_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksCreateRequestActionsInner {

    private String label;

    private String description;

    private String identifier;

    public ChecksCreateRequestActionsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ChecksCreateRequestActionsInner(String label, String description, String identifier) {
        this.label = label;
        this.description = description;
        this.identifier = identifier;
    }

    public ChecksCreateRequestActionsInner label(String label) {
        this.label = label;
        return this;
    }

    /**
     * The text to be displayed on a button in the web UI. The maximum size is 20 characters.
     * @return label
     */
    @NotNull
    @Size(max = 20)
    @Schema(
            name = "label",
            description = "The text to be displayed on a button in the web UI. The maximum size is 20 characters.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ChecksCreateRequestActionsInner description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A short explanation of what this action would do. The maximum size is 40 characters.
     * @return description
     */
    @NotNull
    @Size(max = 40)
    @Schema(
            name = "description",
            description = "A short explanation of what this action would do. The maximum size is 40 characters.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChecksCreateRequestActionsInner identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * A reference for the action on the integrator's system. The maximum size is 20 characters.
     * @return identifier
     */
    @NotNull
    @Size(max = 20)
    @Schema(
            name = "identifier",
            description = "A reference for the action on the integrator's system. The maximum size is 20 characters.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("identifier")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChecksCreateRequestActionsInner checksCreateRequestActionsInner = (ChecksCreateRequestActionsInner) o;
        return Objects.equals(this.label, checksCreateRequestActionsInner.label)
                && Objects.equals(this.description, checksCreateRequestActionsInner.description)
                && Objects.equals(this.identifier, checksCreateRequestActionsInner.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, description, identifier);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksCreateRequestActionsInner {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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
