package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.net.URI;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Label Search Result Item
 */
@Schema(name = "label-search-result-item", description = "Label Search Result Item")
@JsonTypeName("label-search-result-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class LabelSearchResultItem {

    private Long id;

    private String nodeId;

    private URI url;

    private String name;

    private String color;

    private Boolean _default;

    private String description = null;

    private BigDecimal score;

    @Valid
    private List<@Valid SearchResultTextMatchesInner> textMatches = new ArrayList<>();

    public LabelSearchResultItem() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public LabelSearchResultItem(
            Long id,
            String nodeId,
            URI url,
            String name,
            String color,
            Boolean _default,
            String description,
            BigDecimal score) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.name = name;
        this.color = color;
        this._default = _default;
        this.description = description;
        this.score = score;
    }

    public LabelSearchResultItem id(Long id) {
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

    public LabelSearchResultItem nodeId(String nodeId) {
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

    public LabelSearchResultItem url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public LabelSearchResultItem name(String name) {
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

    public LabelSearchResultItem color(String color) {
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

    public LabelSearchResultItem _default(Boolean _default) {
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

    public LabelSearchResultItem description(String description) {
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

    public LabelSearchResultItem score(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     */
    @NotNull
    @Valid
    @Schema(name = "score", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public LabelSearchResultItem textMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
        return this;
    }

    public LabelSearchResultItem addTextMatchesItem(SearchResultTextMatchesInner textMatchesItem) {
        if (this.textMatches == null) {
            this.textMatches = new ArrayList<>();
        }
        this.textMatches.add(textMatchesItem);
        return this;
    }

    /**
     * Get textMatches
     * @return textMatches
     */
    @Valid
    @Schema(name = "text_matches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text_matches")
    public List<@Valid SearchResultTextMatchesInner> getTextMatches() {
        return textMatches;
    }

    public void setTextMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LabelSearchResultItem labelSearchResultItem = (LabelSearchResultItem) o;
        return Objects.equals(this.id, labelSearchResultItem.id)
                && Objects.equals(this.nodeId, labelSearchResultItem.nodeId)
                && Objects.equals(this.url, labelSearchResultItem.url)
                && Objects.equals(this.name, labelSearchResultItem.name)
                && Objects.equals(this.color, labelSearchResultItem.color)
                && Objects.equals(this._default, labelSearchResultItem._default)
                && Objects.equals(this.description, labelSearchResultItem.description)
                && Objects.equals(this.score, labelSearchResultItem.score)
                && Objects.equals(this.textMatches, labelSearchResultItem.textMatches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, url, name, color, _default, description, score, textMatches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LabelSearchResultItem {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    textMatches: ").append(toIndentedString(textMatches)).append("\n");
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
