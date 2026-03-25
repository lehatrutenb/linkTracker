package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SearchResultTextMatchesInner
 */
@JsonTypeName("search_result_text_matches_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SearchResultTextMatchesInner {

    private String objectUrl;

    private String objectType = null;

    private String property;

    private String fragment;

    @Valid
    private List<@Valid SearchResultTextMatchesInnerMatchesInner> matches = new ArrayList<>();

    public SearchResultTextMatchesInner objectUrl(String objectUrl) {
        this.objectUrl = objectUrl;
        return this;
    }

    /**
     * Get objectUrl
     * @return objectUrl
     */
    @Schema(name = "object_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("object_url")
    public String getObjectUrl() {
        return objectUrl;
    }

    public void setObjectUrl(String objectUrl) {
        this.objectUrl = objectUrl;
    }

    public SearchResultTextMatchesInner objectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    /**
     * Get objectType
     * @return objectType
     */
    @Schema(name = "object_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("object_type")
    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public SearchResultTextMatchesInner property(String property) {
        this.property = property;
        return this;
    }

    /**
     * Get property
     * @return property
     */
    @Schema(name = "property", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("property")
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public SearchResultTextMatchesInner fragment(String fragment) {
        this.fragment = fragment;
        return this;
    }

    /**
     * Get fragment
     * @return fragment
     */
    @Schema(name = "fragment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fragment")
    public String getFragment() {
        return fragment;
    }

    public void setFragment(String fragment) {
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
                && Objects.equals(this.objectType, searchResultTextMatchesInner.objectType)
                && Objects.equals(this.property, searchResultTextMatchesInner.property)
                && Objects.equals(this.fragment, searchResultTextMatchesInner.fragment)
                && Objects.equals(this.matches, searchResultTextMatchesInner.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objectUrl, objectType, property, fragment, matches);
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
