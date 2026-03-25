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
 * SearchCode200Response
 */
@JsonTypeName("search_code_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SearchCode200Response {

    private Long totalCount;

    private Boolean incompleteResults;

    @Valid
    private List<@Valid CodeSearchResultItem> items = new ArrayList<>();

    public SearchCode200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SearchCode200Response(Long totalCount, Boolean incompleteResults, List<@Valid CodeSearchResultItem> items) {
        this.totalCount = totalCount;
        this.incompleteResults = incompleteResults;
        this.items = items;
    }

    public SearchCode200Response totalCount(Long totalCount) {
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

    public SearchCode200Response incompleteResults(Boolean incompleteResults) {
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

    public SearchCode200Response items(List<@Valid CodeSearchResultItem> items) {
        this.items = items;
        return this;
    }

    public SearchCode200Response addItemsItem(CodeSearchResultItem itemsItem) {
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
    public List<@Valid CodeSearchResultItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid CodeSearchResultItem> items) {
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
        SearchCode200Response searchCode200Response = (SearchCode200Response) o;
        return Objects.equals(this.totalCount, searchCode200Response.totalCount)
                && Objects.equals(this.incompleteResults, searchCode200Response.incompleteResults)
                && Objects.equals(this.items, searchCode200Response.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incompleteResults, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchCode200Response {\n");
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
