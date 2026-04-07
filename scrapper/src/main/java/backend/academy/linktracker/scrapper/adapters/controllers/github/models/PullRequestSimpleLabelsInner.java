package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * PullRequestSimpleLabelsInner
 */
@JsonTypeName("pull_request_simple_labels_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PullRequestSimpleLabelsInner {

    private Long id;

    private String nodeId;

    private String url;

    private String name;

    private String description;

    private String color;

    private Boolean _default;

    public PullRequestSimpleLabelsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PullRequestSimpleLabelsInner(
            Long id, String nodeId, String url, String name, String description, String color, Boolean _default) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.name = name;
        this.description = description;
        this.color = color;
        this._default = _default;
    }

    public PullRequestSimpleLabelsInner id(Long id) {
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

    public PullRequestSimpleLabelsInner nodeId(String nodeId) {
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

    public PullRequestSimpleLabelsInner url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PullRequestSimpleLabelsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PullRequestSimpleLabelsInner description(String description) {
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

    public PullRequestSimpleLabelsInner color(String color) {
        this.color = color;
        return this;
    }

    /**
     * Get color
     * @return color
     */
    @NotNull
    @Schema(name = "color", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PullRequestSimpleLabelsInner _default(Boolean _default) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PullRequestSimpleLabelsInner pullRequestSimpleLabelsInner = (PullRequestSimpleLabelsInner) o;
        return Objects.equals(this.id, pullRequestSimpleLabelsInner.id)
                && Objects.equals(this.nodeId, pullRequestSimpleLabelsInner.nodeId)
                && Objects.equals(this.url, pullRequestSimpleLabelsInner.url)
                && Objects.equals(this.name, pullRequestSimpleLabelsInner.name)
                && Objects.equals(this.description, pullRequestSimpleLabelsInner.description)
                && Objects.equals(this.color, pullRequestSimpleLabelsInner.color)
                && Objects.equals(this._default, pullRequestSimpleLabelsInner._default);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, url, name, description, color, _default);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PullRequestSimpleLabelsInner {\n");
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
