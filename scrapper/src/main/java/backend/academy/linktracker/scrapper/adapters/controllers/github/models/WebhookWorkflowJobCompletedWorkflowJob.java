package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookWorkflowJobCompletedWorkflowJob
 */
@JsonTypeName("webhook_workflow_job_completed_workflow_job")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookWorkflowJobCompletedWorkflowJob {

    private String checkRunUrl;

    private String completedAt;

    /**
     * Gets or Sets conclusion
     */
    public enum ConclusionEnum {
        SUCCESS("success"),

        FAILURE("failure"),

        SKIPPED("skipped"),

        CANCELLED("cancelled"),

        ACTION_REQUIRED("action_required"),

        NEUTRAL("neutral"),

        TIMED_OUT("timed_out");

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
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ConclusionEnum conclusion;

    private String createdAt;

    private String headSha;

    private String htmlUrl;

    private Long id;

    @Valid
    private List<String> labels = new ArrayList<>();

    private String name;

    private String nodeId;

    private Long runAttempt;

    private Long runId;

    private String runUrl;

    private BigDecimal runnerGroupId = null;

    private String runnerGroupName = null;

    private BigDecimal runnerId = null;

    private String runnerName = null;

    private String startedAt;

    private String status;

    private String headBranch = null;

    private String workflowName = null;

    @Valid
    private List<Object> steps = new ArrayList<>();

    private String url;

    public WebhookWorkflowJobCompletedWorkflowJob() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookWorkflowJobCompletedWorkflowJob(
            String checkRunUrl,
            String completedAt,
            ConclusionEnum conclusion,
            String createdAt,
            String headSha,
            String htmlUrl,
            Long id,
            List<String> labels,
            String name,
            String nodeId,
            Long runAttempt,
            Long runId,
            String runUrl,
            BigDecimal runnerGroupId,
            String runnerGroupName,
            BigDecimal runnerId,
            String runnerName,
            String startedAt,
            String status,
            String headBranch,
            String workflowName,
            List<Object> steps,
            String url) {
        this.checkRunUrl = checkRunUrl;
        this.completedAt = completedAt;
        this.conclusion = conclusion;
        this.createdAt = createdAt;
        this.headSha = headSha;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.nodeId = nodeId;
        this.runAttempt = runAttempt;
        this.runId = runId;
        this.runUrl = runUrl;
        this.runnerGroupId = runnerGroupId;
        this.runnerGroupName = runnerGroupName;
        this.runnerId = runnerId;
        this.runnerName = runnerName;
        this.startedAt = startedAt;
        this.status = status;
        this.headBranch = headBranch;
        this.workflowName = workflowName;
        this.steps = steps;
        this.url = url;
    }

    public WebhookWorkflowJobCompletedWorkflowJob checkRunUrl(String checkRunUrl) {
        this.checkRunUrl = checkRunUrl;
        return this;
    }

    /**
     * Get checkRunUrl
     * @return checkRunUrl
     */
    @NotNull
    @Schema(name = "check_run_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_run_url")
    public String getCheckRunUrl() {
        return checkRunUrl;
    }

    public void setCheckRunUrl(String checkRunUrl) {
        this.checkRunUrl = checkRunUrl;
    }

    public WebhookWorkflowJobCompletedWorkflowJob completedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * Get completedAt
     * @return completedAt
     */
    @NotNull
    @Schema(name = "completed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("completed_at")
    public String getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
    }

    public WebhookWorkflowJobCompletedWorkflowJob conclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    /**
     * Get conclusion
     * @return conclusion
     */
    @NotNull
    @Schema(name = "conclusion", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public ConclusionEnum getConclusion() {
        return conclusion;
    }

    public void setConclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
    }

    public WebhookWorkflowJobCompletedWorkflowJob createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time that the job created.
     * @return createdAt
     */
    @NotNull
    @Schema(
            name = "created_at",
            description = "The time that the job created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookWorkflowJobCompletedWorkflowJob headSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * Get headSha
     * @return headSha
     */
    @NotNull
    @Schema(name = "head_sha", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public WebhookWorkflowJobCompletedWorkflowJob htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookWorkflowJobCompletedWorkflowJob id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookWorkflowJobCompletedWorkflowJob labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public WebhookWorkflowJobCompletedWorkflowJob addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    @NotNull
    @Schema(name = "labels", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("labels")
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public WebhookWorkflowJobCompletedWorkflowJob name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookWorkflowJobCompletedWorkflowJob nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public WebhookWorkflowJobCompletedWorkflowJob runAttempt(Long runAttempt) {
        this.runAttempt = runAttempt;
        return this;
    }

    /**
     * Get runAttempt
     * @return runAttempt
     */
    @NotNull
    @Schema(name = "run_attempt", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_attempt")
    public Long getRunAttempt() {
        return runAttempt;
    }

    public void setRunAttempt(Long runAttempt) {
        this.runAttempt = runAttempt;
    }

    public WebhookWorkflowJobCompletedWorkflowJob runId(Long runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get runId
     * @return runId
     */
    @NotNull
    @Schema(name = "run_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_id")
    public Long getRunId() {
        return runId;
    }

    public void setRunId(Long runId) {
        this.runId = runId;
    }

    public WebhookWorkflowJobCompletedWorkflowJob runUrl(String runUrl) {
        this.runUrl = runUrl;
        return this;
    }

    /**
     * Get runUrl
     * @return runUrl
     */
    @NotNull
    @Schema(name = "run_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_url")
    public String getRunUrl() {
        return runUrl;
    }

    public void setRunUrl(String runUrl) {
        this.runUrl = runUrl;
    }

    public WebhookWorkflowJobCompletedWorkflowJob runnerGroupId(BigDecimal runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
        return this;
    }

    /**
     * Get runnerGroupId
     * @return runnerGroupId
     */
    @NotNull
    @Valid
    @Schema(name = "runner_group_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_group_id")
    public BigDecimal getRunnerGroupId() {
        return runnerGroupId;
    }

    public void setRunnerGroupId(BigDecimal runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
    }

    public WebhookWorkflowJobCompletedWorkflowJob runnerGroupName(String runnerGroupName) {
        this.runnerGroupName = runnerGroupName;
        return this;
    }

    /**
     * Get runnerGroupName
     * @return runnerGroupName
     */
    @NotNull
    @Schema(name = "runner_group_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_group_name")
    public String getRunnerGroupName() {
        return runnerGroupName;
    }

    public void setRunnerGroupName(String runnerGroupName) {
        this.runnerGroupName = runnerGroupName;
    }

    public WebhookWorkflowJobCompletedWorkflowJob runnerId(BigDecimal runnerId) {
        this.runnerId = runnerId;
        return this;
    }

    /**
     * Get runnerId
     * @return runnerId
     */
    @NotNull
    @Valid
    @Schema(name = "runner_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_id")
    public BigDecimal getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(BigDecimal runnerId) {
        this.runnerId = runnerId;
    }

    public WebhookWorkflowJobCompletedWorkflowJob runnerName(String runnerName) {
        this.runnerName = runnerName;
        return this;
    }

    /**
     * Get runnerName
     * @return runnerName
     */
    @NotNull
    @Schema(name = "runner_name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_name")
    public String getRunnerName() {
        return runnerName;
    }

    public void setRunnerName(String runnerName) {
        this.runnerName = runnerName;
    }

    public WebhookWorkflowJobCompletedWorkflowJob startedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     * @return startedAt
     */
    @NotNull
    @Schema(name = "started_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("started_at")
    public String getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(String startedAt) {
        this.startedAt = startedAt;
    }

    public WebhookWorkflowJobCompletedWorkflowJob status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public WebhookWorkflowJobCompletedWorkflowJob headBranch(String headBranch) {
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
            description = "The name of the current branch.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_branch")
    public String getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
    }

    public WebhookWorkflowJobCompletedWorkflowJob workflowName(String workflowName) {
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
            description = "The name of the workflow.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow_name")
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public WebhookWorkflowJobCompletedWorkflowJob steps(List<Object> steps) {
        this.steps = steps;
        return this;
    }

    public WebhookWorkflowJobCompletedWorkflowJob addStepsItem(Object stepsItem) {
        if (this.steps == null) {
            this.steps = new ArrayList<>();
        }
        this.steps.add(stepsItem);
        return this;
    }

    /**
     * Get steps
     * @return steps
     */
    @NotNull
    @Schema(name = "steps", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("steps")
    public List<Object> getSteps() {
        return steps;
    }

    public void setSteps(List<Object> steps) {
        this.steps = steps;
    }

    public WebhookWorkflowJobCompletedWorkflowJob url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookWorkflowJobCompletedWorkflowJob webhookWorkflowJobCompletedWorkflowJob =
                (WebhookWorkflowJobCompletedWorkflowJob) o;
        return Objects.equals(this.checkRunUrl, webhookWorkflowJobCompletedWorkflowJob.checkRunUrl)
                && Objects.equals(this.completedAt, webhookWorkflowJobCompletedWorkflowJob.completedAt)
                && Objects.equals(this.conclusion, webhookWorkflowJobCompletedWorkflowJob.conclusion)
                && Objects.equals(this.createdAt, webhookWorkflowJobCompletedWorkflowJob.createdAt)
                && Objects.equals(this.headSha, webhookWorkflowJobCompletedWorkflowJob.headSha)
                && Objects.equals(this.htmlUrl, webhookWorkflowJobCompletedWorkflowJob.htmlUrl)
                && Objects.equals(this.id, webhookWorkflowJobCompletedWorkflowJob.id)
                && Objects.equals(this.labels, webhookWorkflowJobCompletedWorkflowJob.labels)
                && Objects.equals(this.name, webhookWorkflowJobCompletedWorkflowJob.name)
                && Objects.equals(this.nodeId, webhookWorkflowJobCompletedWorkflowJob.nodeId)
                && Objects.equals(this.runAttempt, webhookWorkflowJobCompletedWorkflowJob.runAttempt)
                && Objects.equals(this.runId, webhookWorkflowJobCompletedWorkflowJob.runId)
                && Objects.equals(this.runUrl, webhookWorkflowJobCompletedWorkflowJob.runUrl)
                && Objects.equals(this.runnerGroupId, webhookWorkflowJobCompletedWorkflowJob.runnerGroupId)
                && Objects.equals(this.runnerGroupName, webhookWorkflowJobCompletedWorkflowJob.runnerGroupName)
                && Objects.equals(this.runnerId, webhookWorkflowJobCompletedWorkflowJob.runnerId)
                && Objects.equals(this.runnerName, webhookWorkflowJobCompletedWorkflowJob.runnerName)
                && Objects.equals(this.startedAt, webhookWorkflowJobCompletedWorkflowJob.startedAt)
                && Objects.equals(this.status, webhookWorkflowJobCompletedWorkflowJob.status)
                && Objects.equals(this.headBranch, webhookWorkflowJobCompletedWorkflowJob.headBranch)
                && Objects.equals(this.workflowName, webhookWorkflowJobCompletedWorkflowJob.workflowName)
                && Objects.equals(this.steps, webhookWorkflowJobCompletedWorkflowJob.steps)
                && Objects.equals(this.url, webhookWorkflowJobCompletedWorkflowJob.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                checkRunUrl,
                completedAt,
                conclusion,
                createdAt,
                headSha,
                htmlUrl,
                id,
                labels,
                name,
                nodeId,
                runAttempt,
                runId,
                runUrl,
                runnerGroupId,
                runnerGroupName,
                runnerId,
                runnerName,
                startedAt,
                status,
                headBranch,
                workflowName,
                steps,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookWorkflowJobCompletedWorkflowJob {\n");
        sb.append("    checkRunUrl: ").append(toIndentedString(checkRunUrl)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    runAttempt: ").append(toIndentedString(runAttempt)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    runUrl: ").append(toIndentedString(runUrl)).append("\n");
        sb.append("    runnerGroupId: ").append(toIndentedString(runnerGroupId)).append("\n");
        sb.append("    runnerGroupName: ")
                .append(toIndentedString(runnerGroupName))
                .append("\n");
        sb.append("    runnerId: ").append(toIndentedString(runnerId)).append("\n");
        sb.append("    runnerName: ").append(toIndentedString(runnerName)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
