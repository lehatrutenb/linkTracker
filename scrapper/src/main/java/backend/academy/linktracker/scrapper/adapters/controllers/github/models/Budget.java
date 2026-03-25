package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Budget
 */
@JsonTypeName("budget")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Budget {

    private String id;

    /**
     * The type of pricing for the budget
     */
    public enum BudgetTypeEnum {
        SKU_PRICING("SkuPricing"),

        PRODUCT_PRICING("ProductPricing");

        private final String value;

        BudgetTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BudgetTypeEnum fromValue(String value) {
            for (BudgetTypeEnum b : BudgetTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private BudgetTypeEnum budgetType;

    private Long budgetAmount;

    private Boolean preventFurtherUsage;

    private String budgetScope;

    private String budgetEntityName;

    private String budgetProductSku;

    private BudgetBudgetAlerting budgetAlerting;

    public Budget() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Budget(
            String id,
            BudgetTypeEnum budgetType,
            Long budgetAmount,
            Boolean preventFurtherUsage,
            String budgetScope,
            String budgetProductSku,
            BudgetBudgetAlerting budgetAlerting) {
        this.id = id;
        this.budgetType = budgetType;
        this.budgetAmount = budgetAmount;
        this.preventFurtherUsage = preventFurtherUsage;
        this.budgetScope = budgetScope;
        this.budgetProductSku = budgetProductSku;
        this.budgetAlerting = budgetAlerting;
    }

    public Budget id(String id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier for the budget
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "2066deda-923f-43f9-88d2-62395a28c0cdd",
            description = "The unique identifier for the budget",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Budget budgetType(BudgetTypeEnum budgetType) {
        this.budgetType = budgetType;
        return this;
    }

    /**
     * The type of pricing for the budget
     * @return budgetType
     */
    @NotNull
    @Schema(
            name = "budget_type",
            example = "SkuPricing",
            description = "The type of pricing for the budget",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_type")
    public BudgetTypeEnum getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetTypeEnum budgetType) {
        this.budgetType = budgetType;
    }

    public Budget budgetAmount(Long budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }

    /**
     * The budget amount limit in whole dollars. For license-based products, this represents the number of licenses.
     * @return budgetAmount
     */
    @NotNull
    @Schema(
            name = "budget_amount",
            description =
                    "The budget amount limit in whole dollars. For license-based products, this represents the number of licenses.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_amount")
    public Long getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(Long budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public Budget preventFurtherUsage(Boolean preventFurtherUsage) {
        this.preventFurtherUsage = preventFurtherUsage;
        return this;
    }

    /**
     * The type of limit enforcement for the budget
     * @return preventFurtherUsage
     */
    @NotNull
    @Schema(
            name = "prevent_further_usage",
            example = "true",
            description = "The type of limit enforcement for the budget",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("prevent_further_usage")
    public Boolean getPreventFurtherUsage() {
        return preventFurtherUsage;
    }

    public void setPreventFurtherUsage(Boolean preventFurtherUsage) {
        this.preventFurtherUsage = preventFurtherUsage;
    }

    public Budget budgetScope(String budgetScope) {
        this.budgetScope = budgetScope;
        return this;
    }

    /**
     * The scope of the budget (enterprise, organization, repository, cost center)
     * @return budgetScope
     */
    @NotNull
    @Schema(
            name = "budget_scope",
            example = "enterprise",
            description = "The scope of the budget (enterprise, organization, repository, cost center)",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_scope")
    public String getBudgetScope() {
        return budgetScope;
    }

    public void setBudgetScope(String budgetScope) {
        this.budgetScope = budgetScope;
    }

    public Budget budgetEntityName(String budgetEntityName) {
        this.budgetEntityName = budgetEntityName;
        return this;
    }

    /**
     * The name of the entity for the budget (enterprise does not require a name).
     * @return budgetEntityName
     */
    @Schema(
            name = "budget_entity_name",
            example = "octocat/hello-world",
            description = "The name of the entity for the budget (enterprise does not require a name).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("budget_entity_name")
    public String getBudgetEntityName() {
        return budgetEntityName;
    }

    public void setBudgetEntityName(String budgetEntityName) {
        this.budgetEntityName = budgetEntityName;
    }

    public Budget budgetProductSku(String budgetProductSku) {
        this.budgetProductSku = budgetProductSku;
        return this;
    }

    /**
     * A single product or sku to apply the budget to.
     * @return budgetProductSku
     */
    @NotNull
    @Schema(
            name = "budget_product_sku",
            description = "A single product or sku to apply the budget to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_product_sku")
    public String getBudgetProductSku() {
        return budgetProductSku;
    }

    public void setBudgetProductSku(String budgetProductSku) {
        this.budgetProductSku = budgetProductSku;
    }

    public Budget budgetAlerting(BudgetBudgetAlerting budgetAlerting) {
        this.budgetAlerting = budgetAlerting;
        return this;
    }

    /**
     * Get budgetAlerting
     * @return budgetAlerting
     */
    @NotNull
    @Valid
    @Schema(name = "budget_alerting", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_alerting")
    public BudgetBudgetAlerting getBudgetAlerting() {
        return budgetAlerting;
    }

    public void setBudgetAlerting(BudgetBudgetAlerting budgetAlerting) {
        this.budgetAlerting = budgetAlerting;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Budget budget = (Budget) o;
        return Objects.equals(this.id, budget.id)
                && Objects.equals(this.budgetType, budget.budgetType)
                && Objects.equals(this.budgetAmount, budget.budgetAmount)
                && Objects.equals(this.preventFurtherUsage, budget.preventFurtherUsage)
                && Objects.equals(this.budgetScope, budget.budgetScope)
                && Objects.equals(this.budgetEntityName, budget.budgetEntityName)
                && Objects.equals(this.budgetProductSku, budget.budgetProductSku)
                && Objects.equals(this.budgetAlerting, budget.budgetAlerting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                budgetType,
                budgetAmount,
                preventFurtherUsage,
                budgetScope,
                budgetEntityName,
                budgetProductSku,
                budgetAlerting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Budget {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    preventFurtherUsage: ")
                .append(toIndentedString(preventFurtherUsage))
                .append("\n");
        sb.append("    budgetScope: ").append(toIndentedString(budgetScope)).append("\n");
        sb.append("    budgetEntityName: ")
                .append(toIndentedString(budgetEntityName))
                .append("\n");
        sb.append("    budgetProductSku: ")
                .append(toIndentedString(budgetProductSku))
                .append("\n");
        sb.append("    budgetAlerting: ")
                .append(toIndentedString(budgetAlerting))
                .append("\n");
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
