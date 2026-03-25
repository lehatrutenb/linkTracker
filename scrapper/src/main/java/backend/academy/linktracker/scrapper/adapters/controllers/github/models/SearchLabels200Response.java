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
 * SearchLabels200Response
 */
@JsonTypeName("search_labels_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SearchLabels200Response {

    private Long totalCount;

    private Boolean incompleteResults;

    @Valid
    private List<@Valid LabelSearchResultItem> items = new ArrayList<>();

    public SearchLabels200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SearchLabels200Response(
            Long totalCount, Boolean incompleteResults, List<@Valid LabelSearchResultItem> items) {
        this.totalCount = totalCount;
        this.incompleteResults = incompleteResults;
        this.items = items;
    }

    public SearchLabels200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public SearchLabels200Response incompleteResults(Boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
        return this;
    }

    /**
     * Get incompleteResults
     * @return incompleteResults
     */
    @NotNull
    @Schema(name = "incomplete_results", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("incomplete_results")
    public Boolean getIncompleteResults() {
        return incompleteResults;
    }

    public void setIncompleteResults(Boolean incompleteResults) {
        this.incompleteResults = incompleteResults;
    }

    public SearchLabels200Response items(List<@Valid LabelSearchResultItem> items) {
        this.items = items;
        return this;
    }

    public SearchLabels200Response addItemsItem(LabelSearchResultItem itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     * @return items
     */
    @NotNull
    @Valid
    @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("items")
    public List<@Valid LabelSearchResultItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid LabelSearchResultItem> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchLabels200Response searchLabels200Response = (SearchLabels200Response) o;
        return Objects.equals(this.totalCount, searchLabels200Response.totalCount)
                && Objects.equals(this.incompleteResults, searchLabels200Response.incompleteResults)
                && Objects.equals(this.items, searchLabels200Response.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incompleteResults, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchLabels200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    incompleteResults: ")
                .append(toIndentedString(incompleteResults))
                .append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
