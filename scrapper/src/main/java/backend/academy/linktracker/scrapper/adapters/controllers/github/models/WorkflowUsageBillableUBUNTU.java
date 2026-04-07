package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * WorkflowUsageBillableUBUNTU
 */
@JsonTypeName("workflow_usage_billable_UBUNTU")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowUsageBillableUBUNTU {

    private Optional<Long> totalMs = Optional.empty();

    public WorkflowUsageBillableUBUNTU totalMs(Long totalMs) {
        this.totalMs = Optional.ofNullable(totalMs);
        return this;
    }

    /**
     * Get totalMs
     * @return totalMs
     */
    @Schema(name = "total_ms", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_ms")
    public Optional<Long> getTotalMs() {
        return totalMs;
    }

    public void setTotalMs(Optional<Long> totalMs) {
        this.totalMs = totalMs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowUsageBillableUBUNTU workflowUsageBillableUBUNTU = (WorkflowUsageBillableUBUNTU) o;
        return Objects.equals(this.totalMs, workflowUsageBillableUBUNTU.totalMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowUsageBillableUBUNTU {\n");
        sb.append("    totalMs: ").append(toIndentedString(totalMs)).append("\n");
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
