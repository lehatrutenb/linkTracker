package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * WebhooksLabel
 */
@JsonTypeName("webhooks_label")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksLabel {

    private String color;

    private Boolean _default;

    private String description = null;

    private Long id;

    private String name;

    private String nodeId;

    private URI url;

    public WebhooksLabel() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksLabel(
            String color, Boolean _default, String description, Long id, String name, String nodeId, URI url) {
        this.color = color;
        this._default = _default;
        this.description = description;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.url = url;
    }

    public WebhooksLabel color(String color) {
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

    public WebhooksLabel _default(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * Get _default
     * @return _default
     */
    @NotNull
    @Schema(name = "default", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default")
    public Boolean getDefault() {
        return _default;
    }

    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public WebhooksLabel description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhooksLabel id(Long id) {
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksLabel name(String name) {
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

    public WebhooksLabel nodeId(String nodeId) {
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

    public WebhooksLabel url(URI url) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksLabel webhooksLabel = (WebhooksLabel) o;
        return Objects.equals(this.color, webhooksLabel.color)
                && Objects.equals(this._default, webhooksLabel._default)
                && Objects.equals(this.description, webhooksLabel.description)
                && Objects.equals(this.id, webhooksLabel.id)
                && Objects.equals(this.name, webhooksLabel.name)
                && Objects.equals(this.nodeId, webhooksLabel.nodeId)
                && Objects.equals(this.url, webhooksLabel.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, _default, description, id, name, nodeId, url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksLabel {\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
