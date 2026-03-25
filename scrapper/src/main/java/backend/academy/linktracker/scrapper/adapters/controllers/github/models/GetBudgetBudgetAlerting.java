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
 * GetBudgetBudgetAlerting
 */
@JsonTypeName("get_budget_budget_alerting")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GetBudgetBudgetAlerting {

    private Boolean willAlert;

    @Valid
    private List<String> alertRecipients = new ArrayList<>();

    public GetBudgetBudgetAlerting willAlert(Boolean willAlert) {
        this.willAlert = willAlert;
        return this;
    }

    /**
     * Whether alerts are enabled for this budget
     * @return willAlert
     */
    @Schema(
            name = "will_alert",
            example = "true",
            description = "Whether alerts are enabled for this budget",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("will_alert")
    public Boolean getWillAlert() {
        return willAlert;
    }

    public void setWillAlert(Boolean willAlert) {
        this.willAlert = willAlert;
    }

    public GetBudgetBudgetAlerting alertRecipients(List<String> alertRecipients) {
        this.alertRecipients = alertRecipients;
        return this;
    }

    public GetBudgetBudgetAlerting addAlertRecipientsItem(String alertRecipientsItem) {
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
    @Schema(
            name = "alert_recipients",
            example = "[\"mona\",\"lisa\"]",
            description = "Array of user login names who will receive alerts",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        GetBudgetBudgetAlerting getBudgetBudgetAlerting = (GetBudgetBudgetAlerting) o;
        return Objects.equals(this.willAlert, getBudgetBudgetAlerting.willAlert)
                && Objects.equals(this.alertRecipients, getBudgetBudgetAlerting.alertRecipients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(willAlert, alertRecipients);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBudgetBudgetAlerting {\n");
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
