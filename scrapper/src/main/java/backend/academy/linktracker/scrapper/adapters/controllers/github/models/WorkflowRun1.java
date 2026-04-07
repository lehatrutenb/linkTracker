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
 * WorkflowRun1
 */
@JsonTypeName("Workflow_Run_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowRun1 {

    private JsonNullable<User2> actor = JsonNullable.<User2>undefined();

    private URI artifactsUrl;

    private URI cancelUrl;

    private Long checkSuiteId;

    private String checkSuiteNodeId;

    private URI checkSuiteUrl;

    /**
     * Gets or Sets conclusion
     */
    public enum ConclusionEnum {
        ACTION_REQUIRED("action_required"),

        CANCELLED("cancelled"),

        FAILURE("failure"),

        NEUTRAL("neutral"),

        SKIPPED("skipped"),

        STALE("stale"),

        SUCCESS("success"),

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
            return null;
        }
    }

    private JsonNullable<ConclusionEnum> conclusion = JsonNullable.<ConclusionEnum>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private String event;

    private JsonNullable<String> headBranch = JsonNullable.<String>undefined();

    private SimpleCommit headCommit;

    private RepositoryLite1 headRepository;

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
    private List<@Valid WorkflowRunPullRequestsInner> pullRequests = new ArrayList<>();

    @Valid
    private JsonNullable<List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner>> referencedWorkflows =
            JsonNullable.<List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner>>undefined();

    private RepositoryLite2 repository;

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

    private JsonNullable<User2> triggeringActor = JsonNullable.<User2>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private Long workflowId;

    private URI workflowUrl;

    public WorkflowRun1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WorkflowRun1(
            User2 actor,
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
            RepositoryLite1 headRepository,
            String headSha,
            URI htmlUrl,
            Long id,
            URI jobsUrl,
            URI logsUrl,
            String name,
            String nodeId,
            String path,
            URI previousAttemptUrl,
            List<@Valid WorkflowRunPullRequestsInner> pullRequests,
            RepositoryLite2 repository,
            URI rerunUrl,
            Long runAttempt,
            Long runNumber,
            OffsetDateTime runStartedAt,
            StatusEnum status,
            User2 triggeringActor,
            OffsetDateTime updatedAt,
            URI url,
            Long workflowId,
            URI workflowUrl) {
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
    }

    public WorkflowRun1 actor(User2 actor) {
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
    public JsonNullable<User2> getActor() {
        return actor;
    }

    public void setActor(JsonNullable<User2> actor) {
        this.actor = actor;
    }

    public WorkflowRun1 artifactsUrl(URI artifactsUrl) {
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

    public WorkflowRun1 cancelUrl(URI cancelUrl) {
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

    public WorkflowRun1 checkSuiteId(Long checkSuiteId) {
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

    public WorkflowRun1 checkSuiteNodeId(String checkSuiteNodeId) {
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

    public WorkflowRun1 checkSuiteUrl(URI checkSuiteUrl) {
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

    public WorkflowRun1 conclusion(ConclusionEnum conclusion) {
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

    public WorkflowRun1 createdAt(OffsetDateTime createdAt) {
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

    public WorkflowRun1 event(String event) {
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

    public WorkflowRun1 headBranch(String headBranch) {
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

    public WorkflowRun1 headCommit(SimpleCommit headCommit) {
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

    public WorkflowRun1 headRepository(RepositoryLite1 headRepository) {
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
    public RepositoryLite1 getHeadRepository() {
        return headRepository;
    }

    public void setHeadRepository(RepositoryLite1 headRepository) {
        this.headRepository = headRepository;
    }

    public WorkflowRun1 headSha(String headSha) {
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

    public WorkflowRun1 htmlUrl(URI htmlUrl) {
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

    public WorkflowRun1 id(Long id) {
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

    public WorkflowRun1 jobsUrl(URI jobsUrl) {
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

    public WorkflowRun1 logsUrl(URI logsUrl) {
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

    public WorkflowRun1 name(String name) {
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

    public WorkflowRun1 nodeId(String nodeId) {
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

    public WorkflowRun1 path(String path) {
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

    public WorkflowRun1 previousAttemptUrl(URI previousAttemptUrl) {
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

    public WorkflowRun1 pullRequests(List<@Valid WorkflowRunPullRequestsInner> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public WorkflowRun1 addPullRequestsItem(WorkflowRunPullRequestsInner pullRequestsItem) {
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
    public List<@Valid WorkflowRunPullRequestsInner> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<@Valid WorkflowRunPullRequestsInner> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public WorkflowRun1 referencedWorkflows(
            List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner> referencedWorkflows) {
        this.referencedWorkflows = JsonNullable.of(referencedWorkflows);
        return this;
    }

    public WorkflowRun1 addReferencedWorkflowsItem(
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

    public WorkflowRun1 repository(RepositoryLite2 repository) {
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
    public RepositoryLite2 getRepository() {
        return repository;
    }

    public void setRepository(RepositoryLite2 repository) {
        this.repository = repository;
    }

    public WorkflowRun1 rerunUrl(URI rerunUrl) {
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

    public WorkflowRun1 runAttempt(Long runAttempt) {
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

    public WorkflowRun1 runNumber(Long runNumber) {
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

    public WorkflowRun1 runStartedAt(OffsetDateTime runStartedAt) {
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

    public WorkflowRun1 status(StatusEnum status) {
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

    public WorkflowRun1 triggeringActor(User2 triggeringActor) {
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
    public JsonNullable<User2> getTriggeringActor() {
        return triggeringActor;
    }

    public void setTriggeringActor(JsonNullable<User2> triggeringActor) {
        this.triggeringActor = triggeringActor;
    }

    public WorkflowRun1 updatedAt(OffsetDateTime updatedAt) {
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

    public WorkflowRun1 url(URI url) {
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

    public WorkflowRun1 workflowId(Long workflowId) {
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

    public WorkflowRun1 workflowUrl(URI workflowUrl) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowRun1 workflowRun1 = (WorkflowRun1) o;
        return Objects.equals(this.actor, workflowRun1.actor)
                && Objects.equals(this.artifactsUrl, workflowRun1.artifactsUrl)
                && Objects.equals(this.cancelUrl, workflowRun1.cancelUrl)
                && Objects.equals(this.checkSuiteId, workflowRun1.checkSuiteId)
                && Objects.equals(this.checkSuiteNodeId, workflowRun1.checkSuiteNodeId)
                && Objects.equals(this.checkSuiteUrl, workflowRun1.checkSuiteUrl)
                && Objects.equals(this.conclusion, workflowRun1.conclusion)
                && Objects.equals(this.createdAt, workflowRun1.createdAt)
                && Objects.equals(this.event, workflowRun1.event)
                && Objects.equals(this.headBranch, workflowRun1.headBranch)
                && Objects.equals(this.headCommit, workflowRun1.headCommit)
                && Objects.equals(this.headRepository, workflowRun1.headRepository)
                && Objects.equals(this.headSha, workflowRun1.headSha)
                && Objects.equals(this.htmlUrl, workflowRun1.htmlUrl)
                && Objects.equals(this.id, workflowRun1.id)
                && Objects.equals(this.jobsUrl, workflowRun1.jobsUrl)
                && Objects.equals(this.logsUrl, workflowRun1.logsUrl)
                && Objects.equals(this.name, workflowRun1.name)
                && Objects.equals(this.nodeId, workflowRun1.nodeId)
                && Objects.equals(this.path, workflowRun1.path)
                && Objects.equals(this.previousAttemptUrl, workflowRun1.previousAttemptUrl)
                && Objects.equals(this.pullRequests, workflowRun1.pullRequests)
                && equalsNullable(this.referencedWorkflows, workflowRun1.referencedWorkflows)
                && Objects.equals(this.repository, workflowRun1.repository)
                && Objects.equals(this.rerunUrl, workflowRun1.rerunUrl)
                && Objects.equals(this.runAttempt, workflowRun1.runAttempt)
                && Objects.equals(this.runNumber, workflowRun1.runNumber)
                && Objects.equals(this.runStartedAt, workflowRun1.runStartedAt)
                && Objects.equals(this.status, workflowRun1.status)
                && Objects.equals(this.triggeringActor, workflowRun1.triggeringActor)
                && Objects.equals(this.updatedAt, workflowRun1.updatedAt)
                && Objects.equals(this.url, workflowRun1.url)
                && Objects.equals(this.workflowId, workflowRun1.workflowId)
                && Objects.equals(this.workflowUrl, workflowRun1.workflowUrl);
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
                workflowUrl);
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
        sb.append("class WorkflowRun1 {\n");
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
