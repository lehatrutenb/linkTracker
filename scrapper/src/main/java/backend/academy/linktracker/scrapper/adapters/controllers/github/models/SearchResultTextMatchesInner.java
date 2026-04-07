package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * SearchResultTextMatchesInner
 */
@JsonTypeName("search_result_text_matches_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SearchResultTextMatchesInner {

    private Optional<String> objectUrl = Optional.empty();

    private JsonNullable<String> objectType = JsonNullable.<String>undefined();

    private Optional<String> property = Optional.empty();

    private Optional<String> fragment = Optional.empty();

    @Valid
    private List<@Valid SearchResultTextMatchesInnerMatchesInner> matches = new ArrayList<>();

    public SearchResultTextMatchesInner objectUrl(String objectUrl) {
        this.objectUrl = Optional.ofNullable(objectUrl);
        return this;
    }

    /**
     * Get objectUrl
     * @return objectUrl
     */
    @Schema(name = "object_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("object_url")
    public Optional<String> getObjectUrl() {
        return objectUrl;
    }

    public void setObjectUrl(Optional<String> objectUrl) {
        this.objectUrl = objectUrl;
    }

    public SearchResultTextMatchesInner objectType(String objectType) {
        this.objectType = JsonNullable.of(objectType);
        return this;
    }

    /**
     * Get objectType
     * @return objectType
     */
    @Schema(name = "object_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("object_type")
    public JsonNullable<String> getObjectType() {
        return objectType;
    }

    public void setObjectType(JsonNullable<String> objectType) {
        this.objectType = objectType;
    }

    public SearchResultTextMatchesInner property(String property) {
        this.property = Optional.ofNullable(property);
        return this;
    }

    /**
     * Get property
     * @return property
     */
    @Schema(name = "property", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("property")
    public Optional<String> getProperty() {
        return property;
    }

    public void setProperty(Optional<String> property) {
        this.property = property;
    }

    public SearchResultTextMatchesInner fragment(String fragment) {
        this.fragment = Optional.ofNullable(fragment);
        return this;
    }

    /**
     * Get fragment
     * @return fragment
     */
    @Schema(name = "fragment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fragment")
    public Optional<String> getFragment() {
        return fragment;
    }

    public void setFragment(Optional<String> fragment) {
        this.fragment = fragment;
    }

    public SearchResultTextMatchesInner matches(List<@Valid SearchResultTextMatchesInnerMatchesInner> matches) {
        this.matches = matches;
        return this;
    }

    public SearchResultTextMatchesInner addMatchesItem(SearchResultTextMatchesInnerMatchesInner matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    /**
     * Get matches
     * @return matches
     */
    @Valid
    @Schema(name = "matches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("matches")
    public List<@Valid SearchResultTextMatchesInnerMatchesInner> getMatches() {
        return matches;
    }

    public void setMatches(List<@Valid SearchResultTextMatchesInnerMatchesInner> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchResultTextMatchesInner searchResultTextMatchesInner = (SearchResultTextMatchesInner) o;
        return Objects.equals(this.objectUrl, searchResultTextMatchesInner.objectUrl)
                && equalsNullable(this.objectType, searchResultTextMatchesInner.objectType)
                && Objects.equals(this.property, searchResultTextMatchesInner.property)
                && Objects.equals(this.fragment, searchResultTextMatchesInner.fragment)
                && Objects.equals(this.matches, searchResultTextMatchesInner.matches);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectUrl, hashCodeNullable(objectType), property, fragment, matches);
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
        sb.append("class SearchResultTextMatchesInner {\n");
        sb.append("    objectUrl: ").append(toIndentedString(objectUrl)).append("\n");
        sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
