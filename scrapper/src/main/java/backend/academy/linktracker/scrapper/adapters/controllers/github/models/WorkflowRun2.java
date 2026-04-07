package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WorkflowRun2
 */
@JsonTypeName("Workflow_Run_2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowRun2 {

    private JsonNullable<User> actor = JsonNullable.<User>undefined();

    private URI artifactsUrl;

    private URI cancelUrl;

    private Long checkSuiteId;

    private String checkSuiteNodeId;

    private URI checkSuiteUrl;

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

        STALE("stale"),

        SKIPPED("skipped"),

        STARTUP_FAILURE("startup_failure");

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

    private JsonNullable<ConclusionEnum> conclusion = JsonNullable.<ConclusionEnum>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private String event;

    private JsonNullable<String> headBranch = JsonNullable.<String>undefined();

    private SimpleCommit headCommit;

    private RepositoryLite headRepository;

    private String headSha;

    private URI htmlUrl;

    private Long id;

    private URI jobsUrl;

    private URI logsUrl;

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private String nodeId;

    private String path;

    private JsonNullable<URI> previousAttemptUrl = JsonNullable.<URI>undefined();

    @Valid
    private List<@Valid WorkflowRun2PullRequestsInner> pullRequests = new ArrayList<>();

    @Valid
    private JsonNullable<List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner>> referencedWorkflows =
            JsonNullable.<List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner>>undefined();

    private RepositoryLite repository;

    private URI rerunUrl;

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

        PENDING("pending"),

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

    private JsonNullable<User> triggeringActor = JsonNullable.<User>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private Long workflowId;

    private URI workflowUrl;

    private String displayTitle;

    public WorkflowRun2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WorkflowRun2(
            User actor,
            URI artifactsUrl,
            URI cancelUrl,
            Long checkSuiteId,
            String checkSuiteNodeId,
            URI checkSuiteUrl,
            ConclusionEnum conclusion,
            OffsetDateTime createdAt,
            String event,
            String headBranch,
            SimpleCommit headCommit,
            RepositoryLite headRepository,
            String headSha,
            URI htmlUrl,
            Long id,
            URI jobsUrl,
            URI logsUrl,
            String name,
            String nodeId,
            String path,
            URI previousAttemptUrl,
            List<@Valid WorkflowRun2PullRequestsInner> pullRequests,
            RepositoryLite repository,
            URI rerunUrl,
            Long runAttempt,
            Long runNumber,
            OffsetDateTime runStartedAt,
            StatusEnum status,
            User triggeringActor,
            OffsetDateTime updatedAt,
            URI url,
            Long workflowId,
            URI workflowUrl,
            String displayTitle) {
        this.actor = JsonNullable.of(actor);
        this.artifactsUrl = artifactsUrl;
        this.cancelUrl = cancelUrl;
        this.checkSuiteId = checkSuiteId;
        this.checkSuiteNodeId = checkSuiteNodeId;
        this.checkSuiteUrl = checkSuiteUrl;
        this.conclusion = JsonNullable.of(conclusion);
        this.createdAt = createdAt;
        this.event = event;
        this.headBranch = JsonNullable.of(headBranch);
        this.headCommit = headCommit;
        this.headRepository = headRepository;
        this.headSha = headSha;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.jobsUrl = jobsUrl;
        this.logsUrl = logsUrl;
        this.name = JsonNullable.of(name);
        this.nodeId = nodeId;
        this.path = path;
        this.previousAttemptUrl = JsonNullable.of(previousAttemptUrl);
        this.pullRequests = pullRequests;
        this.repository = repository;
        this.rerunUrl = rerunUrl;
        this.runAttempt = runAttempt;
        this.runNumber = runNumber;
        this.runStartedAt = runStartedAt;
        this.status = status;
        this.triggeringActor = JsonNullable.of(triggeringActor);
        this.updatedAt = updatedAt;
        this.url = url;
        this.workflowId = workflowId;
        this.workflowUrl = workflowUrl;
        this.displayTitle = displayTitle;
    }

    public WorkflowRun2 actor(User actor) {
        this.actor = JsonNullable.of(actor);
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
    public JsonNullable<User> getActor() {
        return actor;
    }

    public void setActor(JsonNullable<User> actor) {
        this.actor = actor;
    }

    public WorkflowRun2 artifactsUrl(URI artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
        return this;
    }

    /**
     * Get artifactsUrl
     * @return artifactsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "artifacts_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("artifacts_url")
    public URI getArtifactsUrl() {
        return artifactsUrl;
    }

    public void setArtifactsUrl(URI artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
    }

    public WorkflowRun2 cancelUrl(URI cancelUrl) {
        this.cancelUrl = cancelUrl;
        return this;
    }

    /**
     * Get cancelUrl
     * @return cancelUrl
     */
    @NotNull
    @Valid
    @Schema(name = "cancel_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cancel_url")
    public URI getCancelUrl() {
        return cancelUrl;
    }

    public void setCancelUrl(URI cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    public WorkflowRun2 checkSuiteId(Long checkSuiteId) {
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

    public WorkflowRun2 checkSuiteNodeId(String checkSuiteNodeId) {
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

    public WorkflowRun2 checkSuiteUrl(URI checkSuiteUrl) {
        this.checkSuiteUrl = checkSuiteUrl;
        return this;
    }

    /**
     * Get checkSuiteUrl
     * @return checkSuiteUrl
     */
    @NotNull
    @Valid
    @Schema(name = "check_suite_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_suite_url")
    public URI getCheckSuiteUrl() {
        return checkSuiteUrl;
    }

    public void setCheckSuiteUrl(URI checkSuiteUrl) {
        this.checkSuiteUrl = checkSuiteUrl;
    }

    public WorkflowRun2 conclusion(ConclusionEnum conclusion) {
        this.conclusion = JsonNullable.of(conclusion);
        return this;
    }

    /**
     * Get conclusion
     * @return conclusion
     */
    @NotNull
    @Schema(name = "conclusion", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public JsonNullable<ConclusionEnum> getConclusion() {
        return conclusion;
    }

    public void setConclusion(JsonNullable<ConclusionEnum> conclusion) {
        this.conclusion = conclusion;
    }

    public WorkflowRun2 createdAt(OffsetDateTime createdAt) {
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

    public WorkflowRun2 event(String event) {
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

    public WorkflowRun2 headBranch(String headBranch) {
        this.headBranch = JsonNullable.of(headBranch);
        return this;
    }

    /**
     * Get headBranch
     * @return headBranch
     */
    @NotNull
    @Schema(name = "head_branch", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_branch")
    public JsonNullable<String> getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(JsonNullable<String> headBranch) {
        this.headBranch = headBranch;
    }

    public WorkflowRun2 headCommit(SimpleCommit headCommit) {
        this.headCommit = headCommit;
        return this;
    }

    /**
     * Get headCommit
     * @return headCommit
     */
    @NotNull
    @Valid
    @Schema(name = "head_commit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_commit")
    public SimpleCommit getHeadCommit() {
        return headCommit;
    }

    public void setHeadCommit(SimpleCommit headCommit) {
        this.headCommit = headCommit;
    }

    public WorkflowRun2 headRepository(RepositoryLite headRepository) {
        this.headRepository = headRepository;
        return this;
    }

    /**
     * Get headRepository
     * @return headRepository
     */
    @NotNull
    @Valid
    @Schema(name = "head_repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_repository")
    public RepositoryLite getHeadRepository() {
        return headRepository;
    }

    public void setHeadRepository(RepositoryLite headRepository) {
        this.headRepository = headRepository;
    }

    public WorkflowRun2 headSha(String headSha) {
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

    public WorkflowRun2 htmlUrl(URI htmlUrl) {
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

    public WorkflowRun2 id(Long id) {
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

    public WorkflowRun2 jobsUrl(URI jobsUrl) {
        this.jobsUrl = jobsUrl;
        return this;
    }

    /**
     * Get jobsUrl
     * @return jobsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "jobs_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("jobs_url")
    public URI getJobsUrl() {
        return jobsUrl;
    }

    public void setJobsUrl(URI jobsUrl) {
        this.jobsUrl = jobsUrl;
    }

    public WorkflowRun2 logsUrl(URI logsUrl) {
        this.logsUrl = logsUrl;
        return this;
    }

    /**
     * Get logsUrl
     * @return logsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "logs_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("logs_url")
    public URI getLogsUrl() {
        return logsUrl;
    }

    public void setLogsUrl(URI logsUrl) {
        this.logsUrl = logsUrl;
    }

    public WorkflowRun2 name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public WorkflowRun2 nodeId(String nodeId) {
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

    public WorkflowRun2 path(String path) {
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

    public WorkflowRun2 previousAttemptUrl(URI previousAttemptUrl) {
        this.previousAttemptUrl = JsonNullable.of(previousAttemptUrl);
        return this;
    }

    /**
     * Get previousAttemptUrl
     * @return previousAttemptUrl
     */
    @NotNull
    @Valid
    @Schema(name = "previous_attempt_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("previous_attempt_url")
    public JsonNullable<URI> getPreviousAttemptUrl() {
        return previousAttemptUrl;
    }

    public void setPreviousAttemptUrl(JsonNullable<URI> previousAttemptUrl) {
        this.previousAttemptUrl = previousAttemptUrl;
    }

    public WorkflowRun2 pullRequests(List<@Valid WorkflowRun2PullRequestsInner> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public WorkflowRun2 addPullRequestsItem(WorkflowRun2PullRequestsInner pullRequestsItem) {
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
    public List<@Valid WorkflowRun2PullRequestsInner> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<@Valid WorkflowRun2PullRequestsInner> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public WorkflowRun2 referencedWorkflows(
            List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner> referencedWorkflows) {
        this.referencedWorkflows = JsonNullable.of(referencedWorkflows);
        return this;
    }

    public WorkflowRun2 addReferencedWorkflowsItem(
            DeploymentWorkflowRunReferencedWorkflowsInner referencedWorkflowsItem) {
        if (this.referencedWorkflows == null || !this.referencedWorkflows.isPresent()) {
            this.referencedWorkflows = JsonNullable.of(new ArrayList<>());
        }
        this.referencedWorkflows.get().add(referencedWorkflowsItem);
        return this;
    }

    /**
     * Get referencedWorkflows
     * @return referencedWorkflows
     */
    @Valid
    @Schema(name = "referenced_workflows", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("referenced_workflows")
    public JsonNullable<List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner>> getReferencedWorkflows() {
        return referencedWorkflows;
    }

    public void setReferencedWorkflows(
            JsonNullable<List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner>> referencedWorkflows) {
        this.referencedWorkflows = referencedWorkflows;
    }

    public WorkflowRun2 repository(RepositoryLite repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public RepositoryLite getRepository() {
        return repository;
    }

    public void setRepository(RepositoryLite repository) {
        this.repository = repository;
    }

    public WorkflowRun2 rerunUrl(URI rerunUrl) {
        this.rerunUrl = rerunUrl;
        return this;
    }

    /**
     * Get rerunUrl
     * @return rerunUrl
     */
    @NotNull
    @Valid
    @Schema(name = "rerun_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("rerun_url")
    public URI getRerunUrl() {
        return rerunUrl;
    }

    public void setRerunUrl(URI rerunUrl) {
        this.rerunUrl = rerunUrl;
    }

    public WorkflowRun2 runAttempt(Long runAttempt) {
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

    public WorkflowRun2 runNumber(Long runNumber) {
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

    public WorkflowRun2 runStartedAt(OffsetDateTime runStartedAt) {
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

    public WorkflowRun2 status(StatusEnum status) {
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

    public WorkflowRun2 triggeringActor(User triggeringActor) {
        this.triggeringActor = JsonNullable.of(triggeringActor);
        return this;
    }

    /**
     * Get triggeringActor
     * @return triggeringActor
     */
    @NotNull
    @Valid
    @Schema(name = "triggering_actor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("triggering_actor")
    public JsonNullable<User> getTriggeringActor() {
        return triggeringActor;
    }

    public void setTriggeringActor(JsonNullable<User> triggeringActor) {
        this.triggeringActor = triggeringActor;
    }

    public WorkflowRun2 updatedAt(OffsetDateTime updatedAt) {
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

    public WorkflowRun2 url(URI url) {
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

    public WorkflowRun2 workflowId(Long workflowId) {
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

    public WorkflowRun2 workflowUrl(URI workflowUrl) {
        this.workflowUrl = workflowUrl;
        return this;
    }

    /**
     * Get workflowUrl
     * @return workflowUrl
     */
    @NotNull
    @Valid
    @Schema(name = "workflow_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow_url")
    public URI getWorkflowUrl() {
        return workflowUrl;
    }

    public void setWorkflowUrl(URI workflowUrl) {
        this.workflowUrl = workflowUrl;
    }

    public WorkflowRun2 displayTitle(String displayTitle) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowRun2 workflowRun2 = (WorkflowRun2) o;
        return Objects.equals(this.actor, workflowRun2.actor)
                && Objects.equals(this.artifactsUrl, workflowRun2.artifactsUrl)
                && Objects.equals(this.cancelUrl, workflowRun2.cancelUrl)
                && Objects.equals(this.checkSuiteId, workflowRun2.checkSuiteId)
                && Objects.equals(this.checkSuiteNodeId, workflowRun2.checkSuiteNodeId)
                && Objects.equals(this.checkSuiteUrl, workflowRun2.checkSuiteUrl)
                && Objects.equals(this.conclusion, workflowRun2.conclusion)
                && Objects.equals(this.createdAt, workflowRun2.createdAt)
                && Objects.equals(this.event, workflowRun2.event)
                && Objects.equals(this.headBranch, workflowRun2.headBranch)
                && Objects.equals(this.headCommit, workflowRun2.headCommit)
                && Objects.equals(this.headRepository, workflowRun2.headRepository)
                && Objects.equals(this.headSha, workflowRun2.headSha)
                && Objects.equals(this.htmlUrl, workflowRun2.htmlUrl)
                && Objects.equals(this.id, workflowRun2.id)
                && Objects.equals(this.jobsUrl, workflowRun2.jobsUrl)
                && Objects.equals(this.logsUrl, workflowRun2.logsUrl)
                && Objects.equals(this.name, workflowRun2.name)
                && Objects.equals(this.nodeId, workflowRun2.nodeId)
                && Objects.equals(this.path, workflowRun2.path)
                && Objects.equals(this.previousAttemptUrl, workflowRun2.previousAttemptUrl)
                && Objects.equals(this.pullRequests, workflowRun2.pullRequests)
                && equalsNullable(this.referencedWorkflows, workflowRun2.referencedWorkflows)
                && Objects.equals(this.repository, workflowRun2.repository)
                && Objects.equals(this.rerunUrl, workflowRun2.rerunUrl)
                && Objects.equals(this.runAttempt, workflowRun2.runAttempt)
                && Objects.equals(this.runNumber, workflowRun2.runNumber)
                && Objects.equals(this.runStartedAt, workflowRun2.runStartedAt)
                && Objects.equals(this.status, workflowRun2.status)
                && Objects.equals(this.triggeringActor, workflowRun2.triggeringActor)
                && Objects.equals(this.updatedAt, workflowRun2.updatedAt)
                && Objects.equals(this.url, workflowRun2.url)
                && Objects.equals(this.workflowId, workflowRun2.workflowId)
                && Objects.equals(this.workflowUrl, workflowRun2.workflowUrl)
                && Objects.equals(this.displayTitle, workflowRun2.displayTitle);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
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
                hashCodeNullable(referencedWorkflows),
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
                workflowUrl,
                displayTitle);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRun2 {\n");
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
        sb.append("    displayTitle: ").append(toIndentedString(displayTitle)).append("\n");
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
