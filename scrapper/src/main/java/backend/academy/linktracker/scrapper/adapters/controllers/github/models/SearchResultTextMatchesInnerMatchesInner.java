package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * SearchResultTextMatchesInnerMatchesInner
 */
@JsonTypeName("search_result_text_matches_inner_matches_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SearchResultTextMatchesInnerMatchesInner {

    private Optional<String> text = Optional.empty();

    @Valid
    private List<Long> indices = new ArrayList<>();

    public SearchResultTextMatchesInnerMatchesInner text(String text) {
        this.text = Optional.ofNullable(text);
        return this;
    }

    /**
     * Get text
     * @return text
     */
    @Schema(name = "text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text")
    public Optional<String> getText() {
        return text;
    }

    public void setText(Optional<String> text) {
        this.text = text;
    }

    public SearchResultTextMatchesInnerMatchesInner indices(List<Long> indices) {
        this.indices = indices;
        return this;
    }

    public SearchResultTextMatchesInnerMatchesInner addIndicesItem(Long indicesItem) {
        if (this.indices == null) {
            this.indices = new ArrayList<>();
        }
        this.indices.add(indicesItem);
        return this;
    }

    /**
     * Get indices
     * @return indices
     */
    @Schema(name = "indices", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("indices")
    public List<Long> getIndices() {
        return indices;
    }

    public void setIndices(List<Long> indices) {
        this.indices = indices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchResultTextMatchesInnerMatchesInner searchResultTextMatchesInnerMatchesInner =
                (SearchResultTextMatchesInnerMatchesInner) o;
        return Objects.equals(this.text, searchResultTextMatchesInnerMatchesInner.text)
                && Objects.equals(this.indices, searchResultTextMatchesInnerMatchesInner.indices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, indices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResultTextMatchesInnerMatchesInner {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    indices: ").append(toIndentedString(indices)).append("\n");
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
