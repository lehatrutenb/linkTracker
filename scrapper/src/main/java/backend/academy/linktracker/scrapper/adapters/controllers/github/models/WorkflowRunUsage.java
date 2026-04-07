package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * Workflow Run Usage
 */
@Schema(name = "workflow-run-usage", description = "Workflow Run Usage")
@JsonTypeName("workflow-run-usage")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowRunUsage {

    private WorkflowRunUsageBillable billable;

    private Optional<Long> runDurationMs = Optional.empty();

    public WorkflowRunUsage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WorkflowRunUsage(WorkflowRunUsageBillable billable) {
        this.billable = billable;
    }

    public WorkflowRunUsage billable(WorkflowRunUsageBillable billable) {
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
    public WorkflowRunUsageBillable getBillable() {
        return billable;
    }

    public void setBillable(WorkflowRunUsageBillable billable) {
        this.billable = billable;
    }

    public WorkflowRunUsage runDurationMs(Long runDurationMs) {
        this.runDurationMs = Optional.ofNullable(runDurationMs);
        return this;
    }

    /**
     * Get runDurationMs
     * @return runDurationMs
     */
    @Schema(name = "run_duration_ms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("run_duration_ms")
    public Optional<Long> getRunDurationMs() {
        return runDurationMs;
    }

    public void setRunDurationMs(Optional<Long> runDurationMs) {
        this.runDurationMs = runDurationMs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowRunUsage workflowRunUsage = (WorkflowRunUsage) o;
        return Objects.equals(this.billable, workflowRunUsage.billable)
                && Objects.equals(this.runDurationMs, workflowRunUsage.runDurationMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(billable, runDurationMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRunUsage {\n");
        sb.append("    billable: ").append(toIndentedString(billable)).append("\n");
        sb.append("    runDurationMs: ").append(toIndentedString(runDurationMs)).append("\n");
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
