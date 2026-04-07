package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * WorkflowRunUsageBillable
 */
@JsonTypeName("workflow_run_usage_billable")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowRunUsageBillable {

    private Optional<WorkflowRunUsageBillableUBUNTU> UBUNTU = Optional.empty();

    private Optional<WorkflowRunUsageBillableUBUNTU> MACOS = Optional.empty();

    private Optional<WorkflowRunUsageBillableUBUNTU> WINDOWS = Optional.empty();

    public WorkflowRunUsageBillable UBUNTU(WorkflowRunUsageBillableUBUNTU UBUNTU) {
        this.UBUNTU = Optional.ofNullable(UBUNTU);
        return this;
    }

    /**
     * Get UBUNTU
     * @return UBUNTU
     */
    @Valid
    @Schema(name = "UBUNTU", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("UBUNTU")
    public Optional<WorkflowRunUsageBillableUBUNTU> getUBUNTU() {
        return UBUNTU;
    }

    public void setUBUNTU(Optional<WorkflowRunUsageBillableUBUNTU> UBUNTU) {
        this.UBUNTU = UBUNTU;
    }

    public WorkflowRunUsageBillable MACOS(WorkflowRunUsageBillableUBUNTU MACOS) {
        this.MACOS = Optional.ofNullable(MACOS);
        return this;
    }

    /**
     * Get MACOS
     * @return MACOS
     */
    @Valid
    @Schema(name = "MACOS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MACOS")
    public Optional<WorkflowRunUsageBillableUBUNTU> getMACOS() {
        return MACOS;
    }

    public void setMACOS(Optional<WorkflowRunUsageBillableUBUNTU> MACOS) {
        this.MACOS = MACOS;
    }

    public WorkflowRunUsageBillable WINDOWS(WorkflowRunUsageBillableUBUNTU WINDOWS) {
        this.WINDOWS = Optional.ofNullable(WINDOWS);
        return this;
    }

    /**
     * Get WINDOWS
     * @return WINDOWS
     */
    @Valid
    @Schema(name = "WINDOWS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("WINDOWS")
    public Optional<WorkflowRunUsageBillableUBUNTU> getWINDOWS() {
        return WINDOWS;
    }

    public void setWINDOWS(Optional<WorkflowRunUsageBillableUBUNTU> WINDOWS) {
        this.WINDOWS = WINDOWS;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowRunUsageBillable workflowRunUsageBillable = (WorkflowRunUsageBillable) o;
        return Objects.equals(this.UBUNTU, workflowRunUsageBillable.UBUNTU)
                && Objects.equals(this.MACOS, workflowRunUsageBillable.MACOS)
                && Objects.equals(this.WINDOWS, workflowRunUsageBillable.WINDOWS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UBUNTU, MACOS, WINDOWS);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRunUsageBillable {\n");
        sb.append("    UBUNTU: ").append(toIndentedString(UBUNTU)).append("\n");
        sb.append("    MACOS: ").append(toIndentedString(MACOS)).append("\n");
        sb.append("    WINDOWS: ").append(toIndentedString(WINDOWS)).append("\n");
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
