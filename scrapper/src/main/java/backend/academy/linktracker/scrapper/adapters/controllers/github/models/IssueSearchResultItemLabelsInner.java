package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * IssueSearchResultItemLabelsInner
 */
@JsonTypeName("issue_search_result_item_labels_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueSearchResultItemLabelsInner {

    private Long id;

    private String nodeId;

    private String url;

    private String name;

    private String color;

    private Boolean _default;

    private String description = null;

    public IssueSearchResultItemLabelsInner id(Long id) {
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

    public IssueSearchResultItemLabelsInner nodeId(String nodeId) {
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

    public IssueSearchResultItemLabelsInner url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public IssueSearchResultItemLabelsInner name(String name) {
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

    public IssueSearchResultItemLabelsInner color(String color) {
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

    public IssueSearchResultItemLabelsInner _default(Boolean _default) {
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

    public IssueSearchResultItemLabelsInner description(String description) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IssueSearchResultItemLabelsInner issueSearchResultItemLabelsInner = (IssueSearchResultItemLabelsInner) o;
        return Objects.equals(this.id, issueSearchResultItemLabelsInner.id)
                && Objects.equals(this.nodeId, issueSearchResultItemLabelsInner.nodeId)
                && Objects.equals(this.url, issueSearchResultItemLabelsInner.url)
                && Objects.equals(this.name, issueSearchResultItemLabelsInner.name)
                && Objects.equals(this.color, issueSearchResultItemLabelsInner.color)
                && Objects.equals(this._default, issueSearchResultItemLabelsInner._default)
                && Objects.equals(this.description, issueSearchResultItemLabelsInner.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, url, name, color, _default, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IssueSearchResultItemLabelsInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
