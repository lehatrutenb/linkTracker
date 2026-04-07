package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * ActionsReRunJobForWorkflowRunRequest
 */
@JsonTypeName("actions_re_run_job_for_workflow_run_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsReRunJobForWorkflowRunRequest {

    private Optional<Boolean> enableDebugLogging = Optional.of(false);

    public ActionsReRunJobForWorkflowRunRequest enableDebugLogging(Boolean enableDebugLogging) {
        this.enableDebugLogging = Optional.ofNullable(enableDebugLogging);
        return this;
    }

    /**
     * Whether to enable debug logging for the re-run.
     * @return enableDebugLogging
     */
    @Schema(
            name = "enable_debug_logging",
            description = "Whether to enable debug logging for the re-run.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enable_debug_logging")
    public Optional<Boolean> getEnableDebugLogging() {
        return enableDebugLogging;
    }

    public void setEnableDebugLogging(Optional<Boolean> enableDebugLogging) {
        this.enableDebugLogging = enableDebugLogging;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsReRunJobForWorkflowRunRequest actionsReRunJobForWorkflowRunRequest =
                (ActionsReRunJobForWorkflowRunRequest) o;
        return Objects.equals(this.enableDebugLogging, actionsReRunJobForWorkflowRunRequest.enableDebugLogging);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableDebugLogging);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsReRunJobForWorkflowRunRequest {\n");
        sb.append("    enableDebugLogging: ")
                .append(toIndentedString(enableDebugLogging))
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
