package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * Response containing the workflow run ID and URLs.
 */
@Schema(name = "workflow-dispatch-response", description = "Response containing the workflow run ID and URLs.")
@JsonTypeName("workflow-dispatch-response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowDispatchResponse {

    private Long workflowRunId;

    private URI runUrl;

    private URI htmlUrl;

    public WorkflowDispatchResponse() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WorkflowDispatchResponse(Long workflowRunId, URI runUrl, URI htmlUrl) {
        this.workflowRunId = workflowRunId;
        this.runUrl = runUrl;
        this.htmlUrl = htmlUrl;
    }

    public WorkflowDispatchResponse workflowRunId(Long workflowRunId) {
        this.workflowRunId = workflowRunId;
        return this;
    }

    /**
     * The ID of the workflow run.
     * @return workflowRunId
     */
    @NotNull
    @Schema(
            name = "workflow_run_id",
            description = "The ID of the workflow run.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow_run_id")
    public Long getWorkflowRunId() {
        return workflowRunId;
    }

    public void setWorkflowRunId(Long workflowRunId) {
        this.workflowRunId = workflowRunId;
    }

    public WorkflowDispatchResponse runUrl(URI runUrl) {
        this.runUrl = runUrl;
        return this;
    }

    /**
     * The URL to the workflow run.
     * @return runUrl
     */
    @NotNull
    @Valid
    @Schema(name = "run_url", description = "The URL to the workflow run.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_url")
    public URI getRunUrl() {
        return runUrl;
    }

    public void setRunUrl(URI runUrl) {
        this.runUrl = runUrl;
    }

    public WorkflowDispatchResponse htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowDispatchResponse workflowDispatchResponse = (WorkflowDispatchResponse) o;
        return Objects.equals(this.workflowRunId, workflowDispatchResponse.workflowRunId)
                && Objects.equals(this.runUrl, workflowDispatchResponse.runUrl)
                && Objects.equals(this.htmlUrl, workflowDispatchResponse.htmlUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowRunId, runUrl, htmlUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowDispatchResponse {\n");
        sb.append("    workflowRunId: ").append(toIndentedString(workflowRunId)).append("\n");
        sb.append("    runUrl: ").append(toIndentedString(runUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
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
