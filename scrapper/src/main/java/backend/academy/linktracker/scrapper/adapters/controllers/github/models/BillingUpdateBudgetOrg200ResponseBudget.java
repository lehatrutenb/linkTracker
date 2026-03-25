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
 * BillingUpdateBudgetOrg200ResponseBudget
 */
@JsonTypeName("billing_update_budget_org_200_response_budget")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingUpdateBudgetOrg200ResponseBudget {

    private String id;

    private Float budgetAmount;

    private Boolean preventFurtherUsage;

    private BillingUpdateBudgetOrg200ResponseBudgetBudgetAlerting budgetAlerting;

    /**
     * The scope of the budget
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

    private String budgetEntityName = "";

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

    private String budgetProductSku;

    public BillingUpdateBudgetOrg200ResponseBudget id(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID of the budget.
     * @return id
     */
    @Schema(name = "id", description = "ID of the budget.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BillingUpdateBudgetOrg200ResponseBudget budgetAmount(Float budgetAmount) {
        this.budgetAmount = budgetAmount;
        return this;
    }

    /**
     * The budget amount in whole dollars. For license-based products, this represents the number of licenses.
     * @return budgetAmount
     */
    @Schema(
            name = "budget_amount",
            description =
                    "The budget amount in whole dollars. For license-based products, this represents the number of licenses.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("budget_amount")
    public Float getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(Float budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    public BillingUpdateBudgetOrg200ResponseBudget preventFurtherUsage(Boolean preventFurtherUsage) {
        this.preventFurtherUsage = preventFurtherUsage;
        return this;
    }

    /**
     * Whether to prevent additional spending once the budget is exceeded
     * @return preventFurtherUsage
     */
    @Schema(
            name = "prevent_further_usage",
            description = "Whether to prevent additional spending once the budget is exceeded",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("prevent_further_usage")
    public Boolean getPreventFurtherUsage() {
        return preventFurtherUsage;
    }

    public void setPreventFurtherUsage(Boolean preventFurtherUsage) {
        this.preventFurtherUsage = preventFurtherUsage;
    }

    public BillingUpdateBudgetOrg200ResponseBudget budgetAlerting(
            BillingUpdateBudgetOrg200ResponseBudgetBudgetAlerting budgetAlerting) {
        this.budgetAlerting = budgetAlerting;
        return this;
    }

    /**
     * Get budgetAlerting
     * @return budgetAlerting
     */
    @Valid
    @Schema(name = "budget_alerting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("budget_alerting")
    public BillingUpdateBudgetOrg200ResponseBudgetBudgetAlerting getBudgetAlerting() {
        return budgetAlerting;
    }

    public void setBudgetAlerting(BillingUpdateBudgetOrg200ResponseBudgetBudgetAlerting budgetAlerting) {
        this.budgetAlerting = budgetAlerting;
    }

    public BillingUpdateBudgetOrg200ResponseBudget budgetScope(BudgetScopeEnum budgetScope) {
        this.budgetScope = budgetScope;
        return this;
    }

    /**
     * The scope of the budget
     * @return budgetScope
     */
    @Schema(
            name = "budget_scope",
            description = "The scope of the budget",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("budget_scope")
    public BudgetScopeEnum getBudgetScope() {
        return budgetScope;
    }

    public void setBudgetScope(BudgetScopeEnum budgetScope) {
        this.budgetScope = budgetScope;
    }

    public BillingUpdateBudgetOrg200ResponseBudget budgetEntityName(String budgetEntityName) {
        this.budgetEntityName = budgetEntityName;
        return this;
    }

    /**
     * The name of the entity to apply the budget to
     * @return budgetEntityName
     */
    @Schema(
            name = "budget_entity_name",
            description = "The name of the entity to apply the budget to",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("budget_entity_name")
    public String getBudgetEntityName() {
        return budgetEntityName;
    }

    public void setBudgetEntityName(String budgetEntityName) {
        this.budgetEntityName = budgetEntityName;
    }

    public BillingUpdateBudgetOrg200ResponseBudget budgetType(BudgetTypeEnum budgetType) {
        this.budgetType = budgetType;
        return this;
    }

    /**
     * The type of pricing for the budget
     * @return budgetType
     */
    @Schema(
            name = "budget_type",
            description = "The type of pricing for the budget",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("budget_type")
    public BudgetTypeEnum getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(BudgetTypeEnum budgetType) {
        this.budgetType = budgetType;
    }

    public BillingUpdateBudgetOrg200ResponseBudget budgetProductSku(String budgetProductSku) {
        this.budgetProductSku = budgetProductSku;
        return this;
    }

    /**
     * A single product or SKU that will be covered in the budget
     * @return budgetProductSku
     */
    @Schema(
            name = "budget_product_sku",
            description = "A single product or SKU that will be covered in the budget",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("budget_product_sku")
    public String getBudgetProductSku() {
        return budgetProductSku;
    }

    public void setBudgetProductSku(String budgetProductSku) {
        this.budgetProductSku = budgetProductSku;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingUpdateBudgetOrg200ResponseBudget billingUpdateBudgetOrg200ResponseBudget =
                (BillingUpdateBudgetOrg200ResponseBudget) o;
        return Objects.equals(this.id, billingUpdateBudgetOrg200ResponseBudget.id)
                && Objects.equals(this.budgetAmount, billingUpdateBudgetOrg200ResponseBudget.budgetAmount)
                && Objects.equals(this.preventFurtherUsage, billingUpdateBudgetOrg200ResponseBudget.preventFurtherUsage)
                && Objects.equals(this.budgetAlerting, billingUpdateBudgetOrg200ResponseBudget.budgetAlerting)
                && Objects.equals(this.budgetScope, billingUpdateBudgetOrg200ResponseBudget.budgetScope)
                && Objects.equals(this.budgetEntityName, billingUpdateBudgetOrg200ResponseBudget.budgetEntityName)
                && Objects.equals(this.budgetType, billingUpdateBudgetOrg200ResponseBudget.budgetType)
                && Objects.equals(this.budgetProductSku, billingUpdateBudgetOrg200ResponseBudget.budgetProductSku);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                budgetAmount,
                preventFurtherUsage,
                budgetAlerting,
                budgetScope,
                budgetEntityName,
                budgetType,
                budgetProductSku);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingUpdateBudgetOrg200ResponseBudget {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
        sb.append("    preventFurtherUsage: ")
                .append(toIndentedString(preventFurtherUsage))
                .append("\n");
        sb.append("    budgetAlerting: ")
                .append(toIndentedString(budgetAlerting))
                .append("\n");
        sb.append("    budgetScope: ").append(toIndentedString(budgetScope)).append("\n");
        sb.append("    budgetEntityName: ")
                .append(toIndentedString(budgetEntityName))
                .append("\n");
        sb.append("    budgetType: ").append(toIndentedString(budgetType)).append("\n");
        sb.append("    budgetProductSku: ")
                .append(toIndentedString(budgetProductSku))
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
