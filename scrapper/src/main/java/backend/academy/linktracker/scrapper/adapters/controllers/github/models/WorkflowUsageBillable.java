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
 * WorkflowUsageBillable
 */
@JsonTypeName("workflow_usage_billable")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowUsageBillable {

    private WorkflowUsageBillableUBUNTU UBUNTU;

    private WorkflowUsageBillableUBUNTU MACOS;

    private WorkflowUsageBillableUBUNTU WINDOWS;

    public WorkflowUsageBillable UBUNTU(WorkflowUsageBillableUBUNTU UBUNTU) {
        this.UBUNTU = UBUNTU;
        return this;
    }

    /**
     * Get UBUNTU
     * @return UBUNTU
     */
    @Valid
    @Schema(name = "UBUNTU", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("UBUNTU")
    public WorkflowUsageBillableUBUNTU getUBUNTU() {
        return UBUNTU;
    }

    public void setUBUNTU(WorkflowUsageBillableUBUNTU UBUNTU) {
        this.UBUNTU = UBUNTU;
    }

    public WorkflowUsageBillable MACOS(WorkflowUsageBillableUBUNTU MACOS) {
        this.MACOS = MACOS;
        return this;
    }

    /**
     * Get MACOS
     * @return MACOS
     */
    @Valid
    @Schema(name = "MACOS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("MACOS")
    public WorkflowUsageBillableUBUNTU getMACOS() {
        return MACOS;
    }

    public void setMACOS(WorkflowUsageBillableUBUNTU MACOS) {
        this.MACOS = MACOS;
    }

    public WorkflowUsageBillable WINDOWS(WorkflowUsageBillableUBUNTU WINDOWS) {
        this.WINDOWS = WINDOWS;
        return this;
    }

    /**
     * Get WINDOWS
     * @return WINDOWS
     */
    @Valid
    @Schema(name = "WINDOWS", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("WINDOWS")
    public WorkflowUsageBillableUBUNTU getWINDOWS() {
        return WINDOWS;
    }

    public void setWINDOWS(WorkflowUsageBillableUBUNTU WINDOWS) {
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
        WorkflowUsageBillable workflowUsageBillable = (WorkflowUsageBillable) o;
        return Objects.equals(this.UBUNTU, workflowUsageBillable.UBUNTU)
                && Objects.equals(this.MACOS, workflowUsageBillable.MACOS)
                && Objects.equals(this.WINDOWS, workflowUsageBillable.WINDOWS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UBUNTU, MACOS, WINDOWS);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowUsageBillable {\n");
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
