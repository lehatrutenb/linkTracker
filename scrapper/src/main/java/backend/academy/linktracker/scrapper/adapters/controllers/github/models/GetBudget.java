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
 * GetBudget
 */
@JsonTypeName("get-budget")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GetBudget {

    private String id;

    /**
     * The type of scope for the budget
     */
    public enum BudgetScopeEnum {
        ENTERPRISE("enterprise"),

        ORGANIZATION("organization"),

        REPOSITORY("repository"),

        COST_CENTER("cost_center");

        private final String value;

        BudgetScopeEnum(String value) {
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
        public static BudgetScopeEnum fromValue(String value) {
            for (BudgetScopeEnum b : BudgetScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private BudgetScopeEnum budgetScope;

    private String budgetEntityName;

    private Long budgetAmount;

    private Boolean preventFurtherUsage;

    private String budgetProductSku;

    /**
     * The type of pricing for the budget
     */
    public enum BudgetTypeEnum {
        PRODUCT_PRICING("ProductPricing"),

        SKU_PRICING("SkuPricing");

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

    private GetBudgetBudgetAlerting budgetAlerting;

    public GetBudget() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GetBudget(
            String id,
            BudgetScopeEnum budgetScope,
            String budgetEntityName,
            Long budgetAmount,
            Boolean preventFurtherUsage,
            String budgetProductSku,
            BudgetTypeEnum budgetType,
            GetBudgetBudgetAlerting budgetAlerting) {
        this.id = id;
        this.budgetScope = budgetScope;
        this.budgetEntityName = budgetEntityName;
        this.budgetAmount = budgetAmount;
        this.preventFurtherUsage = preventFurtherUsage;
        this.budgetProductSku = budgetProductSku;
        this.budgetType = budgetType;
        this.budgetAlerting = budgetAlerting;
    }

    public GetBudget id(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the budget.
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "ID of the budget.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GetBudget budgetScope(BudgetScopeEnum budgetScope) {
        this.budgetScope = budgetScope;
        return this;
    }

    /**
     * The type of scope for the budget
     * @return budgetScope
     */
    @NotNull
    @Schema(
            name = "budget_scope",
            example = "enterprise",
            description = "The type of scope for the budget",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_scope")
    public BudgetScopeEnum getBudgetScope() {
        return budgetScope;
    }

    public void setBudgetScope(BudgetScopeEnum budgetScope) {
        this.budgetScope = budgetScope;
    }

    public GetBudget budgetEntityName(String budgetEntityName) {
        this.budgetEntityName = budgetEntityName;
        return this;
    }

    /**
     * The name of the entity to apply the budget to
     * @return budgetEntityName
     */
    @NotNull
    @Schema(
            name = "budget_entity_name",
            example = "octocat/hello-world",
            description = "The name of the entity to apply the budget to",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_entity_name")
    public String getBudgetEntityName() {
        return budgetEntityName;
    }

    public void setBudgetEntityName(String budgetEntityName) {
        this.budgetEntityName = budgetEntityName;
    }

    public GetBudget budgetAmount(Long budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }

    /**
     * The budget amount in whole dollars. For license-based products, this represents the number of licenses.
     * @return budgetAmount
     */
    @NotNull
    @Schema(
            name = "budget_amount",
            description =
                    "The budget amount in whole dollars. For license-based products, this represents the number of licenses.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_amount")
    public Long getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(Long budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public GetBudget preventFurtherUsage(Boolean preventFurtherUsage) {
        this.preventFurtherUsage = preventFurtherUsage;
        return this;
    }

    /**
     * Whether to prevent additional spending once the budget is exceeded
     * @return preventFurtherUsage
     */
    @NotNull
    @Schema(
            name = "prevent_further_usage",
            example = "true",
            description = "Whether to prevent additional spending once the budget is exceeded",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("prevent_further_usage")
    public Boolean getPreventFurtherUsage() {
        return preventFurtherUsage;
    }

    public void setPreventFurtherUsage(Boolean preventFurtherUsage) {
        this.preventFurtherUsage = preventFurtherUsage;
    }

    public GetBudget budgetProductSku(String budgetProductSku) {
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
            example = "actions_linux",
            description = "A single product or sku to apply the budget to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_product_sku")
    public String getBudgetProductSku() {
        return budgetProductSku;
    }

    public void setBudgetProductSku(String budgetProductSku) {
        this.budgetProductSku = budgetProductSku;
    }

    public GetBudget budgetType(BudgetTypeEnum budgetType) {
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
            example = "ProductPricing",
            description = "The type of pricing for the budget",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("budget_type")
    public BudgetTypeEnum getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetTypeEnum budgetType) {
        this.budgetType = budgetType;
    }

    public GetBudget budgetAlerting(GetBudgetBudgetAlerting budgetAlerting) {
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
    public GetBudgetBudgetAlerting getBudgetAlerting() {
        return budgetAlerting;
    }

    public void setBudgetAlerting(GetBudgetBudgetAlerting budgetAlerting) {
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
        GetBudget getBudget = (GetBudget) o;
        return Objects.equals(this.id, getBudget.id)
                && Objects.equals(this.budgetScope, getBudget.budgetScope)
                && Objects.equals(this.budgetEntityName, getBudget.budgetEntityName)
                && Objects.equals(this.budgetAmount, getBudget.budgetAmount)
                && Objects.equals(this.preventFurtherUsage, getBudget.preventFurtherUsage)
                && Objects.equals(this.budgetProductSku, getBudget.budgetProductSku)
                && Objects.equals(this.budgetType, getBudget.budgetType)
                && Objects.equals(this.budgetAlerting, getBudget.budgetAlerting);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                budgetScope,
                budgetEntityName,
                budgetAmount,
                preventFurtherUsage,
                budgetProductSku,
                budgetType,
                budgetAlerting);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBudget {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    budgetScope: ").append(toIndentedString(budgetScope)).append("\n");
        sb.append("    budgetEntityName: ")
                .append(toIndentedString(budgetEntityName))
                .append("\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    preventFurtherUsage: ")
                .append(toIndentedString(preventFurtherUsage))
                .append("\n");
        sb.append("    budgetProductSku: ")
                .append(toIndentedString(budgetProductSku))
                .append("\n");
        sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
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
