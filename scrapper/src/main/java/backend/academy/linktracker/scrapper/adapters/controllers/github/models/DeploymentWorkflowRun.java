package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

/**
 * DeploymentWorkflowRun
 */
@JsonTypeName("Deployment_Workflow_Run")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentWorkflowRun {

    private User actor = null;

    private String artifactsUrl;

    private String cancelUrl;

    private Long checkSuiteId;

    private String checkSuiteNodeId;

    private String checkSuiteUrl;

    /**
     * Gets or Sets conclusion
     */
    public enum ConclusionEnum {
        SUCCESS("success"),

        FAILURE("failure"),

        NEUTRAL("neutral"),

        CANCELLED("cancelled"),

        TIMED_OUT("timed_out"),

        ACTION_REQUIRED("action_required"),

        STALE("stale");

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

    private String displayTitle;

    private String event;

    private String headBranch;

    private @Nullable Object headCommit = null;

    private DeploymentWorkflowRunHeadRepository headRepository;

    private String headSha;

    private URI htmlUrl;

    private Long id;

    private String jobsUrl;

    private String logsUrl;

    private String name;

    private String nodeId;

    private String path;

    private @Nullable Object previousAttemptUrl = null;

    @Valid
    private List<@Valid CheckRunPullRequest> pullRequests = new ArrayList<>();

    @Valid
    private List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner> referencedWorkflows;

    private DeploymentWorkflowRunHeadRepository repository;

    private String rerunUrl;

    private Long runAttempt;

    private Long runNumber;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime runStartedAt;

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        REQUESTED("requested"),

        IN_PROGRESS("in_progress"),

        COMPLETED("completed"),

        QUEUED("queued"),

        WAITING("waiting"),

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

    private User triggeringActor = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private Long workflowId;

    private String workflowUrl;

    public DeploymentWorkflowRun() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeploymentWorkflowRun(
            User actor,
            Long checkSuiteId,
            String checkSuiteNodeId,
            ConclusionEnum conclusion,
            OffsetDateTime createdAt,
            String displayTitle,
            String event,
            String headBranch,
            String headSha,
            URI htmlUrl,
            Long id,
            String name,
            String nodeId,
            String path,
            List<@Valid CheckRunPullRequest> pullRequests,
            Long runAttempt,
            Long runNumber,
            OffsetDateTime runStartedAt,
            StatusEnum status,
            OffsetDateTime updatedAt,
            URI url,
            Long workflowId) {
        this.actor = actor;
        this.checkSuiteId = checkSuiteId;
        this.checkSuiteNodeId = checkSuiteNodeId;
        this.conclusion = conclusion;
        this.createdAt = createdAt;
        this.displayTitle = displayTitle;
        this.event = event;
        this.headBranch = headBranch;
        this.headSha = headSha;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.path = path;
        this.pullRequests = pullRequests;
        this.runAttempt = runAttempt;
        this.runNumber = runNumber;
        this.runStartedAt = runStartedAt;
        this.status = status;
        this.updatedAt = updatedAt;
        this.url = url;
        this.workflowId = workflowId;
    }

    public DeploymentWorkflowRun actor(User actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Get actor
     * @return actor
     */
    @NotNull
    @Valid
    @Schema(name = "actor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("actor")
    public User getActor() {
        return actor;
    }

    public void setActor(User actor) {
        this.actor = actor;
    }

    public DeploymentWorkflowRun artifactsUrl(String artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
        return this;
    }

    /**
     * Get artifactsUrl
     * @return artifactsUrl
     */
    @Schema(name = "artifacts_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifacts_url")
    public String getArtifactsUrl() {
        return artifactsUrl;
    }

    public void setArtifactsUrl(String artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
    }

    public DeploymentWorkflowRun cancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
        return this;
    }

    /**
     * Get cancelUrl
     * @return cancelUrl
     */
    @Schema(name = "cancel_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cancel_url")
    public String getCancelUrl() {
        return cancelUrl;
    }

    public void setCancelUrl(String cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    public DeploymentWorkflowRun checkSuiteId(Long checkSuiteId) {
        this.checkSuiteId = checkSuiteId;
        return this;
    }

    /**
     * Get checkSuiteId
     * @return checkSuiteId
     */
    @NotNull
    @Schema(name = "check_suite_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_suite_id")
    public Long getCheckSuiteId() {
        return checkSuiteId;
    }

    public void setCheckSuiteId(Long checkSuiteId) {
        this.checkSuiteId = checkSuiteId;
    }

    public DeploymentWorkflowRun checkSuiteNodeId(String checkSuiteNodeId) {
        this.checkSuiteNodeId = checkSuiteNodeId;
        return this;
    }

    /**
     * Get checkSuiteNodeId
     * @return checkSuiteNodeId
     */
    @NotNull
    @Schema(name = "check_suite_node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_suite_node_id")
    public String getCheckSuiteNodeId() {
        return checkSuiteNodeId;
    }

    public void setCheckSuiteNodeId(String checkSuiteNodeId) {
        this.checkSuiteNodeId = checkSuiteNodeId;
    }

    public DeploymentWorkflowRun checkSuiteUrl(String checkSuiteUrl) {
        this.checkSuiteUrl = checkSuiteUrl;
        return this;
    }

    /**
     * Get checkSuiteUrl
     * @return checkSuiteUrl
     */
    @Schema(name = "check_suite_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("check_suite_url")
    public String getCheckSuiteUrl() {
        return checkSuiteUrl;
    }

    public void setCheckSuiteUrl(String checkSuiteUrl) {
        this.checkSuiteUrl = checkSuiteUrl;
    }

    public DeploymentWorkflowRun conclusion(ConclusionEnum conclusion) {
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

    public DeploymentWorkflowRun createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DeploymentWorkflowRun displayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
        return this;
    }

    /**
     * Get displayTitle
     * @return displayTitle
     */
    @NotNull
    @Schema(name = "display_title", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("display_title")
    public String getDisplayTitle() {
        return displayTitle;
    }

    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    public DeploymentWorkflowRun event(String event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @NotNull
    @Schema(name = "event", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public DeploymentWorkflowRun headBranch(String headBranch) {
        this.headBranch = headBranch;
        return this;
    }

    /**
     * Get headBranch
     * @return headBranch
     */
    @NotNull
    @Schema(name = "head_branch", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_branch")
    public String getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
    }

    public DeploymentWorkflowRun headCommit(@Nullable Object headCommit) {
        this.headCommit = headCommit;
        return this;
    }

    /**
     * Get headCommit
     * @return headCommit
     */
    @Schema(name = "head_commit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_commit")
    public @Nullable Object getHeadCommit() {
        return headCommit;
    }

    public void setHeadCommit(@Nullable Object headCommit) {
        this.headCommit = headCommit;
    }

    public DeploymentWorkflowRun headRepository(DeploymentWorkflowRunHeadRepository headRepository) {
        this.headRepository = headRepository;
        return this;
    }

    /**
     * Get headRepository
     * @return headRepository
     */
    @Valid
    @Schema(name = "head_repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_repository")
    public DeploymentWorkflowRunHeadRepository getHeadRepository() {
        return headRepository;
    }

    public void setHeadRepository(DeploymentWorkflowRunHeadRepository headRepository) {
        this.headRepository = headRepository;
    }

    public DeploymentWorkflowRun headSha(String headSha) {
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

    public DeploymentWorkflowRun htmlUrl(URI htmlUrl) {
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

    public DeploymentWorkflowRun id(Long id) {
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

    public DeploymentWorkflowRun jobsUrl(String jobsUrl) {
        this.jobsUrl = jobsUrl;
        return this;
    }

    /**
     * Get jobsUrl
     * @return jobsUrl
     */
    @Schema(name = "jobs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("jobs_url")
    public String getJobsUrl() {
        return jobsUrl;
    }

    public void setJobsUrl(String jobsUrl) {
        this.jobsUrl = jobsUrl;
    }

    public DeploymentWorkflowRun logsUrl(String logsUrl) {
        this.logsUrl = logsUrl;
        return this;
    }

    /**
     * Get logsUrl
     * @return logsUrl
     */
    @Schema(name = "logs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("logs_url")
    public String getLogsUrl() {
        return logsUrl;
    }

    public void setLogsUrl(String logsUrl) {
        this.logsUrl = logsUrl;
    }

    public DeploymentWorkflowRun name(String name) {
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

    public DeploymentWorkflowRun nodeId(String nodeId) {
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

    public DeploymentWorkflowRun path(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get path
     * @return path
     */
    @NotNull
    @Schema(name = "path", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public DeploymentWorkflowRun previousAttemptUrl(@Nullable Object previousAttemptUrl) {
        this.previousAttemptUrl = previousAttemptUrl;
        return this;
    }

    /**
     * Get previousAttemptUrl
     * @return previousAttemptUrl
     */
    @Schema(name = "previous_attempt_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous_attempt_url")
    public @Nullable Object getPreviousAttemptUrl() {
        return previousAttemptUrl;
    }

    public void setPreviousAttemptUrl(@Nullable Object previousAttemptUrl) {
        this.previousAttemptUrl = previousAttemptUrl;
    }

    public DeploymentWorkflowRun pullRequests(List<@Valid CheckRunPullRequest> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public DeploymentWorkflowRun addPullRequestsItem(CheckRunPullRequest pullRequestsItem) {
        if (this.pullRequests == null) {
            this.pullRequests = new ArrayList<>();
        }
        this.pullRequests.add(pullRequestsItem);
        return this;
    }

    /**
     * Get pullRequests
     * @return pullRequests
     */
    @NotNull
    @Valid
    @Schema(name = "pull_requests", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_requests")
    public List<@Valid CheckRunPullRequest> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<@Valid CheckRunPullRequest> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public DeploymentWorkflowRun referencedWorkflows(
            List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner> referencedWorkflows) {
        this.referencedWorkflows = referencedWorkflows;
        return this;
    }

    public DeploymentWorkflowRun addReferencedWorkflowsItem(
            DeploymentWorkflowRunReferencedWorkflowsInner referencedWorkflowsItem) {
        if (this.referencedWorkflows == null) {
            this.referencedWorkflows = new ArrayList<>();
        }
        this.referencedWorkflows.add(referencedWorkflowsItem);
        return this;
    }

    /**
     * Get referencedWorkflows
     * @return referencedWorkflows
     */
    @Valid
    @Schema(name = "referenced_workflows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("referenced_workflows")
    public List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner> getReferencedWorkflows() {
        return referencedWorkflows;
    }

    public void setReferencedWorkflows(List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner> referencedWorkflows) {
        this.referencedWorkflows = referencedWorkflows;
    }

    public DeploymentWorkflowRun repository(DeploymentWorkflowRunHeadRepository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public DeploymentWorkflowRunHeadRepository getRepository() {
        return repository;
    }

    public void setRepository(DeploymentWorkflowRunHeadRepository repository) {
        this.repository = repository;
    }

    public DeploymentWorkflowRun rerunUrl(String rerunUrl) {
        this.rerunUrl = rerunUrl;
        return this;
    }

    /**
     * Get rerunUrl
     * @return rerunUrl
     */
    @Schema(name = "rerun_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rerun_url")
    public String getRerunUrl() {
        return rerunUrl;
    }

    public void setRerunUrl(String rerunUrl) {
        this.rerunUrl = rerunUrl;
    }

    public DeploymentWorkflowRun runAttempt(Long runAttempt) {
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

    public DeploymentWorkflowRun runNumber(Long runNumber) {
        this.runNumber = runNumber;
        return this;
    }

    /**
     * Get runNumber
     * @return runNumber
     */
    @NotNull
    @Schema(name = "run_number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_number")
    public Long getRunNumber() {
        return runNumber;
    }

    public void setRunNumber(Long runNumber) {
        this.runNumber = runNumber;
    }

    public DeploymentWorkflowRun runStartedAt(OffsetDateTime runStartedAt) {
        this.runStartedAt = runStartedAt;
        return this;
    }

    /**
     * Get runStartedAt
     * @return runStartedAt
     */
    @NotNull
    @Valid
    @Schema(name = "run_started_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_started_at")
    public OffsetDateTime getRunStartedAt() {
        return runStartedAt;
    }

    public void setRunStartedAt(OffsetDateTime runStartedAt) {
        this.runStartedAt = runStartedAt;
    }

    public DeploymentWorkflowRun status(StatusEnum status) {
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

    public DeploymentWorkflowRun triggeringActor(User triggeringActor) {
        this.triggeringActor = triggeringActor;
        return this;
    }

    /**
     * Get triggeringActor
     * @return triggeringActor
     */
    @Valid
    @Schema(name = "triggering_actor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("triggering_actor")
    public User getTriggeringActor() {
        return triggeringActor;
    }

    public void setTriggeringActor(User triggeringActor) {
        this.triggeringActor = triggeringActor;
    }

    public DeploymentWorkflowRun updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DeploymentWorkflowRun url(URI url) {
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

    public DeploymentWorkflowRun workflowId(Long workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * Get workflowId
     * @return workflowId
     */
    @NotNull
    @Schema(name = "workflow_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow_id")
    public Long getWorkflowId() {
        return workflowId;
    }

    public void setWorkflowId(Long workflowId) {
        this.workflowId = workflowId;
    }

    public DeploymentWorkflowRun workflowUrl(String workflowUrl) {
        this.workflowUrl = workflowUrl;
        return this;
    }

    /**
     * Get workflowUrl
     * @return workflowUrl
     */
    @Schema(name = "workflow_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflow_url")
    public String getWorkflowUrl() {
        return workflowUrl;
    }

    public void setWorkflowUrl(String workflowUrl) {
        this.workflowUrl = workflowUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentWorkflowRun deploymentWorkflowRun = (DeploymentWorkflowRun) o;
        return Objects.equals(this.actor, deploymentWorkflowRun.actor)
                && Objects.equals(this.artifactsUrl, deploymentWorkflowRun.artifactsUrl)
                && Objects.equals(this.cancelUrl, deploymentWorkflowRun.cancelUrl)
                && Objects.equals(this.checkSuiteId, deploymentWorkflowRun.checkSuiteId)
                && Objects.equals(this.checkSuiteNodeId, deploymentWorkflowRun.checkSuiteNodeId)
                && Objects.equals(this.checkSuiteUrl, deploymentWorkflowRun.checkSuiteUrl)
                && Objects.equals(this.conclusion, deploymentWorkflowRun.conclusion)
                && Objects.equals(this.createdAt, deploymentWorkflowRun.createdAt)
                && Objects.equals(this.displayTitle, deploymentWorkflowRun.displayTitle)
                && Objects.equals(this.event, deploymentWorkflowRun.event)
                && Objects.equals(this.headBranch, deploymentWorkflowRun.headBranch)
                && Objects.equals(this.headCommit, deploymentWorkflowRun.headCommit)
                && Objects.equals(this.headRepository, deploymentWorkflowRun.headRepository)
                && Objects.equals(this.headSha, deploymentWorkflowRun.headSha)
                && Objects.equals(this.htmlUrl, deploymentWorkflowRun.htmlUrl)
                && Objects.equals(this.id, deploymentWorkflowRun.id)
                && Objects.equals(this.jobsUrl, deploymentWorkflowRun.jobsUrl)
                && Objects.equals(this.logsUrl, deploymentWorkflowRun.logsUrl)
                && Objects.equals(this.name, deploymentWorkflowRun.name)
                && Objects.equals(this.nodeId, deploymentWorkflowRun.nodeId)
                && Objects.equals(this.path, deploymentWorkflowRun.path)
                && Objects.equals(this.previousAttemptUrl, deploymentWorkflowRun.previousAttemptUrl)
                && Objects.equals(this.pullRequests, deploymentWorkflowRun.pullRequests)
                && Objects.equals(this.referencedWorkflows, deploymentWorkflowRun.referencedWorkflows)
                && Objects.equals(this.repository, deploymentWorkflowRun.repository)
                && Objects.equals(this.rerunUrl, deploymentWorkflowRun.rerunUrl)
                && Objects.equals(this.runAttempt, deploymentWorkflowRun.runAttempt)
                && Objects.equals(this.runNumber, deploymentWorkflowRun.runNumber)
                && Objects.equals(this.runStartedAt, deploymentWorkflowRun.runStartedAt)
                && Objects.equals(this.status, deploymentWorkflowRun.status)
                && Objects.equals(this.triggeringActor, deploymentWorkflowRun.triggeringActor)
                && Objects.equals(this.updatedAt, deploymentWorkflowRun.updatedAt)
                && Objects.equals(this.url, deploymentWorkflowRun.url)
                && Objects.equals(this.workflowId, deploymentWorkflowRun.workflowId)
                && Objects.equals(this.workflowUrl, deploymentWorkflowRun.workflowUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                actor,
                artifactsUrl,
                cancelUrl,
                checkSuiteId,
                checkSuiteNodeId,
                checkSuiteUrl,
                conclusion,
                createdAt,
                displayTitle,
                event,
                headBranch,
                headCommit,
                headRepository,
                headSha,
                htmlUrl,
                id,
                jobsUrl,
                logsUrl,
                name,
                nodeId,
                path,
                previousAttemptUrl,
                pullRequests,
                referencedWorkflows,
                repository,
                rerunUrl,
                runAttempt,
                runNumber,
                runStartedAt,
                status,
                triggeringActor,
                updatedAt,
                url,
                workflowId,
                workflowUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentWorkflowRun {\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    artifactsUrl: ").append(toIndentedString(artifactsUrl)).append("\n");
        sb.append("    cancelUrl: ").append(toIndentedString(cancelUrl)).append("\n");
        sb.append("    checkSuiteId: ").append(toIndentedString(checkSuiteId)).append("\n");
        sb.append("    checkSuiteNodeId: ")
                .append(toIndentedString(checkSuiteNodeId))
                .append("\n");
        sb.append("    checkSuiteUrl: ").append(toIndentedString(checkSuiteUrl)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    displayTitle: ").append(toIndentedString(displayTitle)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
        sb.append("    headCommit: ").append(toIndentedString(headCommit)).append("\n");
        sb.append("    headRepository: ")
                .append(toIndentedString(headRepository))
                .append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobsUrl: ").append(toIndentedString(jobsUrl)).append("\n");
        sb.append("    logsUrl: ").append(toIndentedString(logsUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    previousAttemptUrl: ")
                .append(toIndentedString(previousAttemptUrl))
                .append("\n");
        sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
        sb.append("    referencedWorkflows: ")
                .append(toIndentedString(referencedWorkflows))
                .append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    rerunUrl: ").append(toIndentedString(rerunUrl)).append("\n");
        sb.append("    runAttempt: ").append(toIndentedString(runAttempt)).append("\n");
        sb.append("    runNumber: ").append(toIndentedString(runNumber)).append("\n");
        sb.append("    runStartedAt: ").append(toIndentedString(runStartedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggeringActor: ")
                .append(toIndentedString(triggeringActor))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
        sb.append("    workflowUrl: ").append(toIndentedString(workflowUrl)).append("\n");
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
