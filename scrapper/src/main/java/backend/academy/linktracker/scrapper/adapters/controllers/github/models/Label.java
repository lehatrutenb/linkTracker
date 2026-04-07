package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Color-coded labels help you categorize and filter your issues (just like labels in Gmail).
 */
@Schema(
        name = "Label",
        description = "Color-coded labels help you categorize and filter your issues (just like labels in Gmail).")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Label {

    private Long id;

    private String nodeId;

    private URI url;

    private String name;

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private String color;

    private Boolean _default;

    public Label() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Label(Long id, String nodeId, URI url, String name, String description, String color, Boolean _default) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.name = name;
        this.description = JsonNullable.of(description);
        this.color = color;
        this._default = _default;
    }

    public Label id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier for the label.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "Unique identifier for the label.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Label nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Label url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL for the label
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", description = "URL for the label", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public Label name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the label.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the label.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Label description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Optional description of the label, such as its purpose.
     * @return description
     */
    @NotNull
    @Schema(
            name = "description",
            description = "Optional description of the label, such as its purpose.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public Label color(String color) {
        this.color = color;
        return this;
    }

    /**
     * 6-character hex code, without the leading #, identifying the color
     * @return color
     */
    @NotNull
    @Schema(
            name = "color",
            description = "6-character hex code, without the leading #, identifying the color",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Label _default(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * Whether this label comes by default in a new repository.
     * @return _default
     */
    @NotNull
    @Schema(
            name = "default",
            description = "Whether this label comes by default in a new repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default")
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Label label = (Label) o;
        return Objects.equals(this.id, label.id)
                && Objects.equals(this.nodeId, label.nodeId)
                && Objects.equals(this.url, label.url)
                && Objects.equals(this.name, label.name)
                && Objects.equals(this.description, label.description)
                && Objects.equals(this.color, label.color)
                && Objects.equals(this._default, label._default);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, url, name, description, color, _default);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Label {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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
