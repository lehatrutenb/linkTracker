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
 * IssueLabelsInnerOneOf
 */
@JsonTypeName("issue_labels_inner_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueLabelsInnerOneOf implements IssueLabelsInner {

    private Long id;

    private String nodeId;

    private URI url;

    private String name;

    private String description = null;

    private String color = null;

    private Boolean _default;

    public IssueLabelsInnerOneOf id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IssueLabelsInnerOneOf nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public IssueLabelsInnerOneOf url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public IssueLabelsInnerOneOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueLabelsInnerOneOf description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public IssueLabelsInnerOneOf color(String color) {
        this.color = color;
        return this;
    }

    /**
     * Get color
     * @return color
     */
    @Schema(name = "color", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public IssueLabelsInnerOneOf _default(Boolean _default) {
        this._default = _default;
        return this;
    }

    /**
     * Get _default
     * @return _default
     */
    @Schema(name = "default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        IssueLabelsInnerOneOf issueLabelsInnerOneOf = (IssueLabelsInnerOneOf) o;
        return Objects.equals(this.id, issueLabelsInnerOneOf.id)
                && Objects.equals(this.nodeId, issueLabelsInnerOneOf.nodeId)
                && Objects.equals(this.url, issueLabelsInnerOneOf.url)
                && Objects.equals(this.name, issueLabelsInnerOneOf.name)
                && Objects.equals(this.description, issueLabelsInnerOneOf.description)
                && Objects.equals(this.color, issueLabelsInnerOneOf.color)
                && Objects.equals(this._default, issueLabelsInnerOneOf._default);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, url, name, description, color, _default);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueLabelsInnerOneOf {\n");
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
