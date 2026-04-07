package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * IssueLabelsInnerOneOf
 */
@JsonTypeName("Issue_labels_inner_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IssueLabelsInnerOneOf implements IssueLabelsInner {

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<URI> url = Optional.empty();

    private Optional<String> name = Optional.empty();

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private JsonNullable<String> color = JsonNullable.<String>undefined();

    private Optional<Boolean> _default = Optional.empty();

    public IssueLabelsInnerOneOf id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public IssueLabelsInnerOneOf nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public IssueLabelsInnerOneOf url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    public IssueLabelsInnerOneOf name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public IssueLabelsInnerOneOf description(String description) {
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

    public IssueLabelsInnerOneOf color(String color) {
        this.color = JsonNullable.of(color);
        return this;
    }

    /**
     * Get color
     * @return color
     */
    @Schema(name = "color", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("color")
    public JsonNullable<String> getColor() {
        return color;
    }

    public void setColor(JsonNullable<String> color) {
        this.color = color;
    }

    public IssueLabelsInnerOneOf _default(Boolean _default) {
        this._default = Optional.ofNullable(_default);
        return this;
    }

    /**
     * Get _default
     * @return _default
     */
    @Schema(name = "default", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("default")
    public Optional<Boolean> getDefault() {
        return _default;
    }

    public void setDefault(Optional<Boolean> _default) {
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
                && equalsNullable(this.description, issueLabelsInnerOneOf.description)
                && equalsNullable(this.color, issueLabelsInnerOneOf.color)
                && Objects.equals(this._default, issueLabelsInnerOneOf._default);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, url, name, hashCodeNullable(description), hashCodeNullable(color), _default);
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
