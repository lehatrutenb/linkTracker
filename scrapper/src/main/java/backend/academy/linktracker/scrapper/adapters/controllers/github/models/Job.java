package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Information of a job execution in a workflow run
 */
@Schema(name = "job", description = "Information of a job execution in a workflow run")
@JsonTypeName("job")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Job {

    private Long id;

    private Long runId;

    private String runUrl;

    private Long runAttempt;

    private String nodeId;

    private String headSha;

    private String url;

    private String htmlUrl = null;

    /**
     * The phase of the lifecycle that the job is currently in.
     */
    public enum StatusEnum {
        QUEUED("queued"),

        IN_PROGRESS("in_progress"),

        COMPLETED("completed"),

        WAITING("waiting"),

        REQUESTED("requested"),

        PENDING("pending");

        private final String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StatusEnum status;

    /**
     * The outcome of the job.
     */
    public enum ConclusionEnum {
        SUCCESS("success"),

        FAILURE("failure"),

        NEUTRAL("neutral"),

        CANCELLED("cancelled"),

        SKIPPED("skipped"),

        TIMED_OUT("timed_out"),

        ACTION_REQUIRED("action_required");

        private final String value;

        ConclusionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ConclusionEnum fromValue(String value) {
            for (ConclusionEnum b : ConclusionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private ConclusionEnum conclusion = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime completedAt = null;

    private String name;

    @Valid
    private List<@Valid JobStepsInner> steps = new ArrayList<>();

    private String checkRunUrl;

    @Valid
    private List<String> labels = new ArrayList<>();

    private Long runnerId = null;

    private String runnerName = null;

    private Long runnerGroupId = null;

    private String runnerGroupName = null;

    private String workflowName = null;

    private String headBranch = null;

    public Job() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Job(
            Long id,
            Long runId,
            String runUrl,
            String nodeId,
            String headSha,
            String url,
            String htmlUrl,
            StatusEnum status,
            ConclusionEnum conclusion,
            OffsetDateTime createdAt,
            OffsetDateTime startedAt,
            OffsetDateTime completedAt,
            String name,
            String checkRunUrl,
            List<String> labels,
            Long runnerId,
            String runnerName,
            Long runnerGroupId,
            String runnerGroupName,
            String workflowName,
            String headBranch) {
        this.id = id;
        this.runId = runId;
        this.runUrl = runUrl;
        this.nodeId = nodeId;
        this.headSha = headSha;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.status = status;
        this.conclusion = conclusion;
        this.createdAt = createdAt;
        this.startedAt = startedAt;
        this.completedAt = completedAt;
        this.name = name;
        this.checkRunUrl = checkRunUrl;
        this.labels = labels;
        this.runnerId = runnerId;
        this.runnerName = runnerName;
        this.runnerGroupId = runnerGroupId;
        this.runnerGroupName = runnerGroupName;
        this.workflowName = workflowName;
        this.headBranch = headBranch;
    }

    public Job id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the job.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "21",
            description = "The id of the job.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Job runId(Long runId) {
        this.runId = runId;
        return this;
    }

    /**
     * The id of the associated workflow run.
     * @return runId
     */
    @NotNull
    @Schema(
            name = "run_id",
            example = "5",
            description = "The id of the associated workflow run.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_id")
    public Long getRunId() {
        return runId;
    }

    public void setRunId(Long runId) {
        this.runId = runId;
    }

    public Job runUrl(String runUrl) {
        this.runUrl = runUrl;
        return this;
    }

    /**
     * Get runUrl
     * @return runUrl
     */
    @NotNull
    @Schema(
            name = "run_url",
            example = "https://api.github.com/repos/github/hello-world/actions/runs/5",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_url")
    public String getRunUrl() {
        return runUrl;
    }

    public void setRunUrl(String runUrl) {
        this.runUrl = runUrl;
    }

    public Job runAttempt(Long runAttempt) {
        this.runAttempt = runAttempt;
        return this;
    }

    /**
     * Attempt number of the associated workflow run, 1 for first attempt and higher if the workflow was re-run.
     * @return runAttempt
     */
    @Schema(
            name = "run_attempt",
            example = "1",
            description =
                    "Attempt number of the associated workflow run, 1 for first attempt and higher if the workflow was re-run.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("run_attempt")
    public Long getRunAttempt() {
        return runAttempt;
    }

    public void setRunAttempt(Long runAttempt) {
        this.runAttempt = runAttempt;
    }

    public Job nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDg6Q2hlY2tSdW40", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public Job headSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * The SHA of the commit that is being run.
     * @return headSha
     */
    @NotNull
    @Schema(
            name = "head_sha",
            example = "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
            description = "The SHA of the commit that is being run.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public Job url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/github/hello-world/actions/jobs/21",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Job htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(
            name = "html_url",
            example = "https://github.com/github/hello-world/runs/4",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Job status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The phase of the lifecycle that the job is currently in.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            example = "queued",
            description = "The phase of the lifecycle that the job is currently in.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Job conclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    /**
     * The outcome of the job.
     * @return conclusion
     */
    @NotNull
    @Schema(
            name = "conclusion",
            example = "success",
            description = "The outcome of the job.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public ConclusionEnum getConclusion() {
        return conclusion;
    }

    public void setConclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
    }

    public Job createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time that the job created, in ISO 8601 format.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            example = "2019-08-08T08:00-07:00",
            description = "The time that the job created, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Job startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * The time that the job started, in ISO 8601 format.
     * @return startedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "started_at",
            example = "2019-08-08T08:00-07:00",
            description = "The time that the job started, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public Job completedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * The time that the job finished, in ISO 8601 format.
     * @return completedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "completed_at",
            example = "2019-08-08T08:00-07:00",
            description = "The time that the job finished, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("completed_at")
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public Job name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the job.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "test-coverage",
            description = "The name of the job.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job steps(List<@Valid JobStepsInner> steps) {
        this.steps = steps;
        return this;
    }

    public Job addStepsItem(JobStepsInner stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    /**
     * Steps in this job.
     * @return steps
     */
    @Valid
    @Schema(name = "steps", description = "Steps in this job.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("steps")
    public List<@Valid JobStepsInner> getSteps() {
        return steps;
    }

    public void setSteps(List<@Valid JobStepsInner> steps) {
        this.steps = steps;
    }

    public Job checkRunUrl(String checkRunUrl) {
        this.checkRunUrl = checkRunUrl;
        return this;
    }

    /**
     * Get checkRunUrl
     * @return checkRunUrl
     */
    @NotNull
    @Schema(
            name = "check_run_url",
            example = "https://api.github.com/repos/github/hello-world/check-runs/4",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_run_url")
    public String getCheckRunUrl() {
        return checkRunUrl;
    }

    public void setCheckRunUrl(String checkRunUrl) {
        this.checkRunUrl = checkRunUrl;
    }

    public Job labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public Job addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Labels for the workflow job. Specified by the \"runs_on\" attribute in the action's workflow file.
     * @return labels
     */
    @NotNull
    @Schema(
            name = "labels",
            example = "[\"self-hosted\",\"foo\",\"bar\"]",
            description =
                    "Labels for the workflow job. Specified by the \"runs_on\" attribute in the action's workflow file.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Job runnerId(Long runnerId) {
        this.runnerId = runnerId;
        return this;
    }

    /**
     * The ID of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)
     * @return runnerId
     */
    @NotNull
    @Schema(
            name = "runner_id",
            example = "1",
            description =
                    "The ID of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_id")
    public Long getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(Long runnerId) {
        this.runnerId = runnerId;
    }

    public Job runnerName(String runnerName) {
        this.runnerName = runnerName;
        return this;
    }

    /**
     * The name of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)
     * @return runnerName
     */
    @NotNull
    @Schema(
            name = "runner_name",
            example = "my runner",
            description =
                    "The name of the runner to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_name")
    public String getRunnerName() {
        return runnerName;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public Job runnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
        return this;
    }

    /**
     * The ID of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)
     * @return runnerGroupId
     */
    @NotNull
    @Schema(
            name = "runner_group_id",
            example = "2",
            description =
                    "The ID of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_group_id")
    public Long getRunnerGroupId() {
        return runnerGroupId;
    }

    public void setRunnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
    }

    public Job runnerGroupName(String runnerGroupName) {
        this.runnerGroupName = runnerGroupName;
        return this;
    }

    /**
     * The name of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)
     * @return runnerGroupName
     */
    @NotNull
    @Schema(
            name = "runner_group_name",
            example = "my runner group",
            description =
                    "The name of the runner group to which this job has been assigned. (If a runner hasn't yet been assigned, this will be null.)",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_group_name")
    public String getRunnerGroupName() {
        return runnerGroupName;
    }

    public void setRunnerGroupName(String runnerGroupName) {
        this.runnerGroupName = runnerGroupName;
    }

    public Job workflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * The name of the workflow.
     * @return workflowName
     */
    @NotNull
    @Schema(
            name = "workflow_name",
            example = "Build",
            description = "The name of the workflow.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow_name")
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public Job headBranch(String headBranch) {
        this.headBranch = headBranch;
        return this;
    }

    /**
     * The name of the current branch.
     * @return headBranch
     */
    @NotNull
    @Schema(
            name = "head_branch",
            example = "main",
            description = "The name of the current branch.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_branch")
    public String getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return Objects.equals(this.id, job.id)
                && Objects.equals(this.runId, job.runId)
                && Objects.equals(this.runUrl, job.runUrl)
                && Objects.equals(this.runAttempt, job.runAttempt)
                && Objects.equals(this.nodeId, job.nodeId)
                && Objects.equals(this.headSha, job.headSha)
                && Objects.equals(this.url, job.url)
                && Objects.equals(this.htmlUrl, job.htmlUrl)
                && Objects.equals(this.status, job.status)
                && Objects.equals(this.conclusion, job.conclusion)
                && Objects.equals(this.createdAt, job.createdAt)
                && Objects.equals(this.startedAt, job.startedAt)
                && Objects.equals(this.completedAt, job.completedAt)
                && Objects.equals(this.name, job.name)
                && Objects.equals(this.steps, job.steps)
                && Objects.equals(this.checkRunUrl, job.checkRunUrl)
                && Objects.equals(this.labels, job.labels)
                && Objects.equals(this.runnerId, job.runnerId)
                && Objects.equals(this.runnerName, job.runnerName)
                && Objects.equals(this.runnerGroupId, job.runnerGroupId)
                && Objects.equals(this.runnerGroupName, job.runnerGroupName)
                && Objects.equals(this.workflowName, job.workflowName)
                && Objects.equals(this.headBranch, job.headBranch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                runId,
                runUrl,
                runAttempt,
                nodeId,
                headSha,
                url,
                htmlUrl,
                status,
                conclusion,
                createdAt,
                startedAt,
                completedAt,
                name,
                steps,
                checkRunUrl,
                labels,
                runnerId,
                runnerName,
                runnerGroupId,
                runnerGroupName,
                workflowName,
                headBranch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    runUrl: ").append(toIndentedString(runUrl)).append("\n");
        sb.append("    runAttempt: ").append(toIndentedString(runAttempt)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    checkRunUrl: ").append(toIndentedString(checkRunUrl)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
        sb.append("    runnerName: ").append(toIndentedString(runnerName)).append("\n");
        sb.append("    runnerGroupId: ").append(toIndentedString(runnerGroupId)).append("\n");
        sb.append("    runnerGroupName: ")
                .append(toIndentedString(runnerGroupName))
                .append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
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
