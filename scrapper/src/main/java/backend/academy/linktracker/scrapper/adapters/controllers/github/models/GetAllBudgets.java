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
 * GetAllBudgets
 */
@JsonTypeName("get_all_budgets")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GetAllBudgets {

    @Valid
    private List<@Valid Budget> budgets = new ArrayList<>();

    private Boolean hasNextPage;

    private Long totalCount;

    public GetAllBudgets() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GetAllBudgets(List<@Valid Budget> budgets) {
        this.budgets = budgets;
    }

    public GetAllBudgets budgets(List<@Valid Budget> budgets) {
        this.budgets = budgets;
        return this;
    }

    public GetAllBudgets addBudgetsItem(Budget budgetsItem) {
        if (this.budgets == null) {
            this.budgets = new ArrayList<>();
        }
        this.budgets.add(budgetsItem);
        return this;
    }

    /**
     * Array of budget objects for the enterprise
     * @return budgets
     */
    @NotNull
    @Valid
    @Schema(
            name = "budgets",
            description = "Array of budget objects for the enterprise",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budgets")
    public List<@Valid Budget> getBudgets() {
        return budgets;
    }

    public void setBudgets(List<@Valid Budget> budgets) {
        this.budgets = budgets;
    }

    public GetAllBudgets hasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
        return this;
    }

    /**
     * Indicates if there are more pages of results available (maps to hasNextPage from billing platform)
     * @return hasNextPage
     */
    @Schema(
            name = "has_next_page",
            description =
                    "Indicates if there are more pages of results available (maps to hasNextPage from billing platform)",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_next_page")
    public Boolean getHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public GetAllBudgets totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Total number of budgets matching the query
     * @return totalCount
     */
    @Schema(
            name = "total_count",
            description = "Total number of budgets matching the query",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAllBudgets getAllBudgets = (GetAllBudgets) o;
        return Objects.equals(this.budgets, getAllBudgets.budgets)
                && Objects.equals(this.hasNextPage, getAllBudgets.hasNextPage)
                && Objects.equals(this.totalCount, getAllBudgets.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(budgets, hasNextPage, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAllBudgets {\n");
        sb.append("    budgets: ").append(toIndentedString(budgets)).append("\n");
        sb.append("    hasNextPage: ").append(toIndentedString(hasNextPage)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
