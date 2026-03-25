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
 * BudgetBudgetAlerting
 */
@JsonTypeName("budget_budget_alerting")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BudgetBudgetAlerting {

    private Boolean willAlert;

    @Valid
    private List<String> alertRecipients = new ArrayList<>();

    public BudgetBudgetAlerting() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BudgetBudgetAlerting(Boolean willAlert, List<String> alertRecipients) {
        this.willAlert = willAlert;
        this.alertRecipients = alertRecipients;
    }

    public BudgetBudgetAlerting willAlert(Boolean willAlert) {
        this.willAlert = willAlert;
        return this;
    }

    /**
     * Whether alerts are enabled for this budget
     * @return willAlert
     */
    @NotNull
    @Schema(
            name = "will_alert",
            example = "true",
            description = "Whether alerts are enabled for this budget",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("will_alert")
    public Boolean getWillAlert() {
        return willAlert;
    }

    public void setWillAlert(Boolean willAlert) {
        this.willAlert = willAlert;
    }

    public BudgetBudgetAlerting alertRecipients(List<String> alertRecipients) {
        this.alertRecipients = alertRecipients;
        return this;
    }

    public BudgetBudgetAlerting addAlertRecipientsItem(String alertRecipientsItem) {
        if (this.alertRecipients == null) {
            this.alertRecipients = new ArrayList<>();
        }
        this.alertRecipients.add(alertRecipientsItem);
        return this;
    }

    /**
     * Array of user login names who will receive alerts
     * @return alertRecipients
     */
    @NotNull
    @Schema(
            name = "alert_recipients",
            example = "[\"mona\",\"lisa\"]",
            description = "Array of user login names who will receive alerts",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("alert_recipients")
    public List<String> getAlertRecipients() {
        return alertRecipients;
    }

    public void setAlertRecipients(List<String> alertRecipients) {
        this.alertRecipients = alertRecipients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BudgetBudgetAlerting budgetBudgetAlerting = (BudgetBudgetAlerting) o;
        return Objects.equals(this.willAlert, budgetBudgetAlerting.willAlert)
                && Objects.equals(this.alertRecipients, budgetBudgetAlerting.alertRecipients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(willAlert, alertRecipients);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BudgetBudgetAlerting {\n");
        sb.append("    willAlert: ").append(toIndentedString(willAlert)).append("\n");
        sb.append("    alertRecipients: ")
                .append(toIndentedString(alertRecipients))
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
