package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Workflow Usage
 */
@Schema(name = "workflow-usage", description = "Workflow Usage")
@JsonTypeName("workflow-usage")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowUsage {

    private WorkflowUsageBillable billable;

    public WorkflowUsage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WorkflowUsage(WorkflowUsageBillable billable) {
        this.billable = billable;
    }

    public WorkflowUsage billable(WorkflowUsageBillable billable) {
        this.billable = billable;
        return this;
    }

    /**
     * Get billable
     * @return billable
     */
    @NotNull
    @Valid
    @Schema(name = "billable", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("billable")
    public WorkflowUsageBillable getBillable() {
        return billable;
    }

    public void setBillable(WorkflowUsageBillable billable) {
        this.billable = billable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowUsage workflowUsage = (WorkflowUsage) o;
        return Objects.equals(this.billable, workflowUsage.billable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowUsage {\n");
        sb.append("    billable: ").append(toIndentedString(billable)).append("\n");
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
