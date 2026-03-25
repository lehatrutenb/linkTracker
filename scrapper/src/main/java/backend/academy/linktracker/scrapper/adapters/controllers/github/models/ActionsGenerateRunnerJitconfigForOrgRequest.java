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
 * ActionsGenerateRunnerJitconfigForOrgRequest
 */
@JsonTypeName("actions_generate_runner_jitconfig_for_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsGenerateRunnerJitconfigForOrgRequest {

    private String name;

    private Long runnerGroupId;

    @Valid
    private List<String> labels = new ArrayList<>();

    private String workFolder = "_work";

    public ActionsGenerateRunnerJitconfigForOrgRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsGenerateRunnerJitconfigForOrgRequest(String name, Long runnerGroupId, List<String> labels) {
        this.name = name;
        this.runnerGroupId = runnerGroupId;
        this.labels = labels;
    }

    public ActionsGenerateRunnerJitconfigForOrgRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the new runner.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the new runner.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionsGenerateRunnerJitconfigForOrgRequest runnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
        return this;
    }

    /**
     * The ID of the runner group to register the runner to.
     * @return runnerGroupId
     */
    @NotNull
    @Schema(
            name = "runner_group_id",
            description = "The ID of the runner group to register the runner to.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_group_id")
    public Long getRunnerGroupId() {
        return runnerGroupId;
    }

    public void setRunnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
    }

    public ActionsGenerateRunnerJitconfigForOrgRequest labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ActionsGenerateRunnerJitconfigForOrgRequest addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * The names of the custom labels to add to the runner. **Minimum items**: 1. **Maximum items**: 100.
     * @return labels
     */
    @NotNull
    @Size(min = 1, max = 100)
    @Schema(
            name = "labels",
            description =
                    "The names of the custom labels to add to the runner. **Minimum items**: 1. **Maximum items**: 100.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ActionsGenerateRunnerJitconfigForOrgRequest workFolder(String workFolder) {
        this.workFolder = workFolder;
        return this;
    }

    /**
     * The working directory to be used for job execution, relative to the runner install directory.
     * @return workFolder
     */
    @Schema(
            name = "work_folder",
            description =
                    "The working directory to be used for job execution, relative to the runner install directory.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("work_folder")
    public String getWorkFolder() {
        return workFolder;
    }

    public void setWorkFolder(String workFolder) {
        this.workFolder = workFolder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsGenerateRunnerJitconfigForOrgRequest actionsGenerateRunnerJitconfigForOrgRequest =
                (ActionsGenerateRunnerJitconfigForOrgRequest) o;
        return Objects.equals(this.name, actionsGenerateRunnerJitconfigForOrgRequest.name)
                && Objects.equals(this.runnerGroupId, actionsGenerateRunnerJitconfigForOrgRequest.runnerGroupId)
                && Objects.equals(this.labels, actionsGenerateRunnerJitconfigForOrgRequest.labels)
                && Objects.equals(this.workFolder, actionsGenerateRunnerJitconfigForOrgRequest.workFolder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, runnerGroupId, labels, workFolder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsGenerateRunnerJitconfigForOrgRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    runnerGroupId: ").append(toIndentedString(runnerGroupId)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    workFolder: ").append(toIndentedString(workFolder)).append("\n");
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
