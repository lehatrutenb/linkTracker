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
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhookWorkflowJobWaitingWorkflowJob
 */
@JsonTypeName("webhook_workflow_job_waiting_workflow_job")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookWorkflowJobWaitingWorkflowJob {

    private URI checkRunUrl;

    private String completedAt = null;

    private String conclusion = null;

    private String createdAt;

    private String headSha;

    private URI htmlUrl;

    private Long id;

    @Valid
    private List<String> labels = new ArrayList<>();

    private String name;

    private String nodeId;

    private Long runAttempt;

    private BigDecimal runId;

    private URI runUrl;

    private Long runnerGroupId = null;

    private String runnerGroupName = null;

    private Long runnerId = null;

    private String runnerName = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt;

    private String headBranch = null;

    private String workflowName = null;

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        QUEUED("queued"),

        IN_PROGRESS("in_progress"),

        COMPLETED("completed"),

        WAITING("waiting");

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

    @Valid
    private List<@Valid WorkflowStep4> steps = new ArrayList<>();

    private URI url;

    public WebhookWorkflowJobWaitingWorkflowJob() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookWorkflowJobWaitingWorkflowJob(
            URI checkRunUrl,
            String completedAt,
            String conclusion,
            String createdAt,
            String headSha,
            URI htmlUrl,
            Long id,
            List<String> labels,
            String name,
            String nodeId,
            Long runAttempt,
            BigDecimal runId,
            URI runUrl,
            Long runnerGroupId,
            String runnerGroupName,
            Long runnerId,
            String runnerName,
            OffsetDateTime startedAt,
            String headBranch,
            String workflowName,
            StatusEnum status,
            List<@Valid WorkflowStep4> steps,
            URI url) {
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
        this.headBranch = headBranch;
        this.workflowName = workflowName;
        this.status = status;
        this.steps = steps;
        this.url = url;
    }

    public WebhookWorkflowJobWaitingWorkflowJob checkRunUrl(URI checkRunUrl) {
        this.checkRunUrl = checkRunUrl;
        return this;
    }

    /**
     * Get checkRunUrl
     * @return checkRunUrl
     */
    @NotNull
    @Valid
    @Schema(name = "check_run_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_run_url")
    public URI getCheckRunUrl() {
        return checkRunUrl;
    }

    public void setCheckRunUrl(URI checkRunUrl) {
        this.checkRunUrl = checkRunUrl;
    }

    public WebhookWorkflowJobWaitingWorkflowJob completedAt(String completedAt) {
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

    public WebhookWorkflowJobWaitingWorkflowJob conclusion(String conclusion) {
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
    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public WebhookWorkflowJobWaitingWorkflowJob createdAt(String createdAt) {
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

    public WebhookWorkflowJobWaitingWorkflowJob headSha(String headSha) {
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

    public WebhookWorkflowJobWaitingWorkflowJob htmlUrl(URI htmlUrl) {
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

    public WebhookWorkflowJobWaitingWorkflowJob id(Long id) {
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

    public WebhookWorkflowJobWaitingWorkflowJob labels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public WebhookWorkflowJobWaitingWorkflowJob addLabelsItem(String labelsItem) {
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

    public WebhookWorkflowJobWaitingWorkflowJob name(String name) {
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

    public WebhookWorkflowJobWaitingWorkflowJob nodeId(String nodeId) {
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

    public WebhookWorkflowJobWaitingWorkflowJob runAttempt(Long runAttempt) {
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

    public WebhookWorkflowJobWaitingWorkflowJob runId(BigDecimal runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get runId
     * @return runId
     */
    @NotNull
    @Valid
    @Schema(name = "run_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_id")
    public BigDecimal getRunId() {
        return runId;
    }

    public void setRunId(BigDecimal runId) {
        this.runId = runId;
    }

    public WebhookWorkflowJobWaitingWorkflowJob runUrl(URI runUrl) {
        this.runUrl = runUrl;
        return this;
    }

    /**
     * Get runUrl
     * @return runUrl
     */
    @NotNull
    @Valid
    @Schema(name = "run_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_url")
    public URI getRunUrl() {
        return runUrl;
    }

    public void setRunUrl(URI runUrl) {
        this.runUrl = runUrl;
    }

    public WebhookWorkflowJobWaitingWorkflowJob runnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
        return this;
    }

    /**
     * Get runnerGroupId
     * @return runnerGroupId
     */
    @NotNull
    @Schema(name = "runner_group_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_group_id")
    public Long getRunnerGroupId() {
        return runnerGroupId;
    }

    public void setRunnerGroupId(Long runnerGroupId) {
        this.runnerGroupId = runnerGroupId;
    }

    public WebhookWorkflowJobWaitingWorkflowJob runnerGroupName(String runnerGroupName) {
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

    public WebhookWorkflowJobWaitingWorkflowJob runnerId(Long runnerId) {
        this.runnerId = runnerId;
        return this;
    }

    /**
     * Get runnerId
     * @return runnerId
     */
    @NotNull
    @Schema(name = "runner_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("runner_id")
    public Long getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(Long runnerId) {
        this.runnerId = runnerId;
    }

    public WebhookWorkflowJobWaitingWorkflowJob runnerName(String runnerName) {
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

    public WebhookWorkflowJobWaitingWorkflowJob startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * Get startedAt
     * @return startedAt
     */
    @NotNull
    @Valid
    @Schema(name = "started_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public WebhookWorkflowJobWaitingWorkflowJob headBranch(String headBranch) {
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

    public WebhookWorkflowJobWaitingWorkflowJob workflowName(String workflowName) {
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

    public WebhookWorkflowJobWaitingWorkflowJob status(StatusEnum status) {
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
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public WebhookWorkflowJobWaitingWorkflowJob steps(List<@Valid WorkflowStep4> steps) {
        this.steps = steps;
        return this;
    }

    public WebhookWorkflowJobWaitingWorkflowJob addStepsItem(WorkflowStep4 stepsItem) {
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
    @Valid
    @Schema(name = "steps", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("steps")
    public List<@Valid WorkflowStep4> getSteps() {
        return steps;
    }

    public void setSteps(List<@Valid WorkflowStep4> steps) {
        this.steps = steps;
    }

    public WebhookWorkflowJobWaitingWorkflowJob url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
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
        WebhookWorkflowJobWaitingWorkflowJob webhookWorkflowJobWaitingWorkflowJob =
                (WebhookWorkflowJobWaitingWorkflowJob) o;
        return Objects.equals(this.checkRunUrl, webhookWorkflowJobWaitingWorkflowJob.checkRunUrl)
                && Objects.equals(this.completedAt, webhookWorkflowJobWaitingWorkflowJob.completedAt)
                && Objects.equals(this.conclusion, webhookWorkflowJobWaitingWorkflowJob.conclusion)
                && Objects.equals(this.createdAt, webhookWorkflowJobWaitingWorkflowJob.createdAt)
                && Objects.equals(this.headSha, webhookWorkflowJobWaitingWorkflowJob.headSha)
                && Objects.equals(this.htmlUrl, webhookWorkflowJobWaitingWorkflowJob.htmlUrl)
                && Objects.equals(this.id, webhookWorkflowJobWaitingWorkflowJob.id)
                && Objects.equals(this.labels, webhookWorkflowJobWaitingWorkflowJob.labels)
                && Objects.equals(this.name, webhookWorkflowJobWaitingWorkflowJob.name)
                && Objects.equals(this.nodeId, webhookWorkflowJobWaitingWorkflowJob.nodeId)
                && Objects.equals(this.runAttempt, webhookWorkflowJobWaitingWorkflowJob.runAttempt)
                && Objects.equals(this.runId, webhookWorkflowJobWaitingWorkflowJob.runId)
                && Objects.equals(this.runUrl, webhookWorkflowJobWaitingWorkflowJob.runUrl)
                && Objects.equals(this.runnerGroupId, webhookWorkflowJobWaitingWorkflowJob.runnerGroupId)
                && Objects.equals(this.runnerGroupName, webhookWorkflowJobWaitingWorkflowJob.runnerGroupName)
                && Objects.equals(this.runnerId, webhookWorkflowJobWaitingWorkflowJob.runnerId)
                && Objects.equals(this.runnerName, webhookWorkflowJobWaitingWorkflowJob.runnerName)
                && Objects.equals(this.startedAt, webhookWorkflowJobWaitingWorkflowJob.startedAt)
                && Objects.equals(this.headBranch, webhookWorkflowJobWaitingWorkflowJob.headBranch)
                && Objects.equals(this.workflowName, webhookWorkflowJobWaitingWorkflowJob.workflowName)
                && Objects.equals(this.status, webhookWorkflowJobWaitingWorkflowJob.status)
                && Objects.equals(this.steps, webhookWorkflowJobWaitingWorkflowJob.steps)
                && Objects.equals(this.url, webhookWorkflowJobWaitingWorkflowJob.url);
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
                headBranch,
                workflowName,
                status,
                steps,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookWorkflowJobWaitingWorkflowJob {\n");
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
        sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
