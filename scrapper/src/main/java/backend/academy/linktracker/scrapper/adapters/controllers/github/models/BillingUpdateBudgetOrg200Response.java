package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * BillingUpdateBudgetOrg200Response
 */
@JsonTypeName("billing_update_budget_org_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingUpdateBudgetOrg200Response {

    private String message;

    private BillingUpdateBudgetOrg200ResponseBudget budget;

    public BillingUpdateBudgetOrg200Response message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @Schema(name = "message", example = "Budget successfully updated.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BillingUpdateBudgetOrg200Response budget(BillingUpdateBudgetOrg200ResponseBudget budget) {
        this.budget = budget;
        return this;
    }

    /**
     * Get budget
     * @return budget
     */
    @Valid
    @Schema(name = "budget", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("budget")
    public BillingUpdateBudgetOrg200ResponseBudget getBudget() {
        return budget;
    }

    public void setBudget(BillingUpdateBudgetOrg200ResponseBudget budget) {
        this.budget = budget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingUpdateBudgetOrg200Response billingUpdateBudgetOrg200Response = (BillingUpdateBudgetOrg200Response) o;
        return Objects.equals(this.message, billingUpdateBudgetOrg200Response.message)
                && Objects.equals(this.budget, billingUpdateBudgetOrg200Response.budget);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, budget);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingUpdateBudgetOrg200Response {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
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
