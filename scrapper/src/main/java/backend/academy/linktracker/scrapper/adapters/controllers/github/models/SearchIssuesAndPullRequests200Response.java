package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SearchIssuesAndPullRequests200Response
 */
@JsonTypeName("search_issues_and_pull_requests_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SearchIssuesAndPullRequests200Response {

    private Long totalCount;

    private Boolean incompleteResults;

    @Valid
    private List<@Valid IssueSearchResultItem> items = new ArrayList<>();

    public SearchIssuesAndPullRequests200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SearchIssuesAndPullRequests200Response(
            Long totalCount, Boolean incompleteResults, List<@Valid IssueSearchResultItem> items) {
        this.totalCount = totalCount;
        this.incompleteResults = incompleteResults;
        this.items = items;
    }

    public SearchIssuesAndPullRequests200Response totalCount(Long totalCount) {
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

    public SearchIssuesAndPullRequests200Response incompleteResults(Boolean incompleteResults) {
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

    public SearchIssuesAndPullRequests200Response items(List<@Valid IssueSearchResultItem> items) {
        this.items = items;
        return this;
    }

    public SearchIssuesAndPullRequests200Response addItemsItem(IssueSearchResultItem itemsItem) {
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
    public List<@Valid IssueSearchResultItem> getItems() {
        return items;
    }

    public void setItems(List<@Valid IssueSearchResultItem> items) {
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
        SearchIssuesAndPullRequests200Response searchIssuesAndPullRequests200Response =
                (SearchIssuesAndPullRequests200Response) o;
        return Objects.equals(this.totalCount, searchIssuesAndPullRequests200Response.totalCount)
                && Objects.equals(this.incompleteResults, searchIssuesAndPullRequests200Response.incompleteResults)
                && Objects.equals(this.items, searchIssuesAndPullRequests200Response.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, incompleteResults, items);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchIssuesAndPullRequests200Response {\n");
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
