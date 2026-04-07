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
 * DeploymentWorkflowRun2
 */
@JsonTypeName("Deployment_Workflow_Run_2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentWorkflowRun2 {

    private JsonNullable<User> actor = JsonNullable.<User>undefined();

    private Optional<String> artifactsUrl = Optional.empty();

    private Optional<String> cancelUrl = Optional.empty();

    private Long checkSuiteId;

    private String checkSuiteNodeId;

    private Optional<String> checkSuiteUrl = Optional.empty();

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

    private JsonNullable<ConclusionEnum> conclusion = JsonNullable.<ConclusionEnum>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private String event;

    private String headBranch;

    private JsonNullable<Object> headCommit = JsonNullable.<Object>undefined();

    private Optional<DeploymentWorkflowRun1HeadRepository> headRepository = Optional.empty();

    private String headSha;

    private URI htmlUrl;

    private Long id;

    private Optional<String> jobsUrl = Optional.empty();

    private Optional<String> logsUrl = Optional.empty();

    private String name;

    private String nodeId;

    private String path;

    private JsonNullable<String> previousAttemptUrl = JsonNullable.<String>undefined();

    @Valid
    private List<@Valid CheckRunPullRequest> pullRequests = new ArrayList<>();

    @Valid
    private JsonNullable<List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner>> referencedWorkflows =
            JsonNullable.<List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner>>undefined();

    private Optional<DeploymentWorkflowRun1HeadRepository> repository = Optional.empty();

    private Optional<String> rerunUrl = Optional.empty();

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

    private Optional<String> workflowUrl = Optional.empty();

    private String displayTitle;

    public DeploymentWorkflowRun2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DeploymentWorkflowRun2(
            User actor,
            Long checkSuiteId,
            String checkSuiteNodeId,
            ConclusionEnum conclusion,
            OffsetDateTime createdAt,
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
            User triggeringActor,
            OffsetDateTime updatedAt,
            URI url,
            Long workflowId,
            String displayTitle) {
        this.actor = JsonNullable.of(actor);
        this.checkSuiteId = checkSuiteId;
        this.checkSuiteNodeId = checkSuiteNodeId;
        this.conclusion = JsonNullable.of(conclusion);
        this.createdAt = createdAt;
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
        this.triggeringActor = JsonNullable.of(triggeringActor);
        this.updatedAt = updatedAt;
        this.url = url;
        this.workflowId = workflowId;
        this.displayTitle = displayTitle;
    }

    public DeploymentWorkflowRun2 actor(User actor) {
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

    public DeploymentWorkflowRun2 artifactsUrl(String artifactsUrl) {
        this.artifactsUrl = Optional.ofNullable(artifactsUrl);
        return this;
    }

    /**
     * Get artifactsUrl
     * @return artifactsUrl
     */
    @Schema(name = "artifacts_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("artifacts_url")
    public Optional<String> getArtifactsUrl() {
        return artifactsUrl;
    }

    public void setArtifactsUrl(Optional<String> artifactsUrl) {
        this.artifactsUrl = artifactsUrl;
    }

    public DeploymentWorkflowRun2 cancelUrl(String cancelUrl) {
        this.cancelUrl = Optional.ofNullable(cancelUrl);
        return this;
    }

    /**
     * Get cancelUrl
     * @return cancelUrl
     */
    @Schema(name = "cancel_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cancel_url")
    public Optional<String> getCancelUrl() {
        return cancelUrl;
    }

    public void setCancelUrl(Optional<String> cancelUrl) {
        this.cancelUrl = cancelUrl;
    }

    public DeploymentWorkflowRun2 checkSuiteId(Long checkSuiteId) {
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

    public DeploymentWorkflowRun2 checkSuiteNodeId(String checkSuiteNodeId) {
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

    public DeploymentWorkflowRun2 checkSuiteUrl(String checkSuiteUrl) {
        this.checkSuiteUrl = Optional.ofNullable(checkSuiteUrl);
        return this;
    }

    /**
     * Get checkSuiteUrl
     * @return checkSuiteUrl
     */
    @Schema(name = "check_suite_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("check_suite_url")
    public Optional<String> getCheckSuiteUrl() {
        return checkSuiteUrl;
    }

    public void setCheckSuiteUrl(Optional<String> checkSuiteUrl) {
        this.checkSuiteUrl = checkSuiteUrl;
    }

    public DeploymentWorkflowRun2 conclusion(ConclusionEnum conclusion) {
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

    public DeploymentWorkflowRun2 createdAt(OffsetDateTime createdAt) {
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

    public DeploymentWorkflowRun2 event(String event) {
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

    public DeploymentWorkflowRun2 headBranch(String headBranch) {
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

    public DeploymentWorkflowRun2 headCommit(Object headCommit) {
        this.headCommit = JsonNullable.of(headCommit);
        return this;
    }

    /**
     * Get headCommit
     * @return headCommit
     */
    @Schema(name = "head_commit", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_commit")
    public JsonNullable<Object> getHeadCommit() {
        return headCommit;
    }

    public void setHeadCommit(JsonNullable<Object> headCommit) {
        this.headCommit = headCommit;
    }

    public DeploymentWorkflowRun2 headRepository(DeploymentWorkflowRun1HeadRepository headRepository) {
        this.headRepository = Optional.ofNullable(headRepository);
        return this;
    }

    /**
     * Get headRepository
     * @return headRepository
     */
    @Valid
    @Schema(name = "head_repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_repository")
    public Optional<DeploymentWorkflowRun1HeadRepository> getHeadRepository() {
        return headRepository;
    }

    public void setHeadRepository(Optional<DeploymentWorkflowRun1HeadRepository> headRepository) {
        this.headRepository = headRepository;
    }

    public DeploymentWorkflowRun2 headSha(String headSha) {
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

    public DeploymentWorkflowRun2 htmlUrl(URI htmlUrl) {
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

    public DeploymentWorkflowRun2 id(Long id) {
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

    public DeploymentWorkflowRun2 jobsUrl(String jobsUrl) {
        this.jobsUrl = Optional.ofNullable(jobsUrl);
        return this;
    }

    /**
     * Get jobsUrl
     * @return jobsUrl
     */
    @Schema(name = "jobs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("jobs_url")
    public Optional<String> getJobsUrl() {
        return jobsUrl;
    }

    public void setJobsUrl(Optional<String> jobsUrl) {
        this.jobsUrl = jobsUrl;
    }

    public DeploymentWorkflowRun2 logsUrl(String logsUrl) {
        this.logsUrl = Optional.ofNullable(logsUrl);
        return this;
    }

    /**
     * Get logsUrl
     * @return logsUrl
     */
    @Schema(name = "logs_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("logs_url")
    public Optional<String> getLogsUrl() {
        return logsUrl;
    }

    public void setLogsUrl(Optional<String> logsUrl) {
        this.logsUrl = logsUrl;
    }

    public DeploymentWorkflowRun2 name(String name) {
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

    public DeploymentWorkflowRun2 nodeId(String nodeId) {
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

    public DeploymentWorkflowRun2 path(String path) {
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

    public DeploymentWorkflowRun2 previousAttemptUrl(String previousAttemptUrl) {
        this.previousAttemptUrl = JsonNullable.of(previousAttemptUrl);
        return this;
    }

    /**
     * Get previousAttemptUrl
     * @return previousAttemptUrl
     */
    @Schema(name = "previous_attempt_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous_attempt_url")
    public JsonNullable<String> getPreviousAttemptUrl() {
        return previousAttemptUrl;
    }

    public void setPreviousAttemptUrl(JsonNullable<String> previousAttemptUrl) {
        this.previousAttemptUrl = previousAttemptUrl;
    }

    public DeploymentWorkflowRun2 pullRequests(List<@Valid CheckRunPullRequest> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public DeploymentWorkflowRun2 addPullRequestsItem(CheckRunPullRequest pullRequestsItem) {
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

    public DeploymentWorkflowRun2 referencedWorkflows(
            List<@Valid DeploymentWorkflowRunReferencedWorkflowsInner> referencedWorkflows) {
        this.referencedWorkflows = JsonNullable.of(referencedWorkflows);
        return this;
    }

    public DeploymentWorkflowRun2 addReferencedWorkflowsItem(
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

    public DeploymentWorkflowRun2 repository(DeploymentWorkflowRun1HeadRepository repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<DeploymentWorkflowRun1HeadRepository> getRepository() {
        return repository;
    }

    public void setRepository(Optional<DeploymentWorkflowRun1HeadRepository> repository) {
        this.repository = repository;
    }

    public DeploymentWorkflowRun2 rerunUrl(String rerunUrl) {
        this.rerunUrl = Optional.ofNullable(rerunUrl);
        return this;
    }

    /**
     * Get rerunUrl
     * @return rerunUrl
     */
    @Schema(name = "rerun_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rerun_url")
    public Optional<String> getRerunUrl() {
        return rerunUrl;
    }

    public void setRerunUrl(Optional<String> rerunUrl) {
        this.rerunUrl = rerunUrl;
    }

    public DeploymentWorkflowRun2 runAttempt(Long runAttempt) {
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

    public DeploymentWorkflowRun2 runNumber(Long runNumber) {
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

    public DeploymentWorkflowRun2 runStartedAt(OffsetDateTime runStartedAt) {
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

    public DeploymentWorkflowRun2 status(StatusEnum status) {
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

    public DeploymentWorkflowRun2 triggeringActor(User triggeringActor) {
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

    public DeploymentWorkflowRun2 updatedAt(OffsetDateTime updatedAt) {
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

    public DeploymentWorkflowRun2 url(URI url) {
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

    public DeploymentWorkflowRun2 workflowId(Long workflowId) {
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

    public DeploymentWorkflowRun2 workflowUrl(String workflowUrl) {
        this.workflowUrl = Optional.ofNullable(workflowUrl);
        return this;
    }

    /**
     * Get workflowUrl
     * @return workflowUrl
     */
    @Schema(name = "workflow_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("workflow_url")
    public Optional<String> getWorkflowUrl() {
        return workflowUrl;
    }

    public void setWorkflowUrl(Optional<String> workflowUrl) {
        this.workflowUrl = workflowUrl;
    }

    public DeploymentWorkflowRun2 displayTitle(String displayTitle) {
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
        DeploymentWorkflowRun2 deploymentWorkflowRun2 = (DeploymentWorkflowRun2) o;
        return Objects.equals(this.actor, deploymentWorkflowRun2.actor)
                && Objects.equals(this.artifactsUrl, deploymentWorkflowRun2.artifactsUrl)
                && Objects.equals(this.cancelUrl, deploymentWorkflowRun2.cancelUrl)
                && Objects.equals(this.checkSuiteId, deploymentWorkflowRun2.checkSuiteId)
                && Objects.equals(this.checkSuiteNodeId, deploymentWorkflowRun2.checkSuiteNodeId)
                && Objects.equals(this.checkSuiteUrl, deploymentWorkflowRun2.checkSuiteUrl)
                && Objects.equals(this.conclusion, deploymentWorkflowRun2.conclusion)
                && Objects.equals(this.createdAt, deploymentWorkflowRun2.createdAt)
                && Objects.equals(this.event, deploymentWorkflowRun2.event)
                && Objects.equals(this.headBranch, deploymentWorkflowRun2.headBranch)
                && equalsNullable(this.headCommit, deploymentWorkflowRun2.headCommit)
                && Objects.equals(this.headRepository, deploymentWorkflowRun2.headRepository)
                && Objects.equals(this.headSha, deploymentWorkflowRun2.headSha)
                && Objects.equals(this.htmlUrl, deploymentWorkflowRun2.htmlUrl)
                && Objects.equals(this.id, deploymentWorkflowRun2.id)
                && Objects.equals(this.jobsUrl, deploymentWorkflowRun2.jobsUrl)
                && Objects.equals(this.logsUrl, deploymentWorkflowRun2.logsUrl)
                && Objects.equals(this.name, deploymentWorkflowRun2.name)
                && Objects.equals(this.nodeId, deploymentWorkflowRun2.nodeId)
                && Objects.equals(this.path, deploymentWorkflowRun2.path)
                && equalsNullable(this.previousAttemptUrl, deploymentWorkflowRun2.previousAttemptUrl)
                && Objects.equals(this.pullRequests, deploymentWorkflowRun2.pullRequests)
                && equalsNullable(this.referencedWorkflows, deploymentWorkflowRun2.referencedWorkflows)
                && Objects.equals(this.repository, deploymentWorkflowRun2.repository)
                && Objects.equals(this.rerunUrl, deploymentWorkflowRun2.rerunUrl)
                && Objects.equals(this.runAttempt, deploymentWorkflowRun2.runAttempt)
                && Objects.equals(this.runNumber, deploymentWorkflowRun2.runNumber)
                && Objects.equals(this.runStartedAt, deploymentWorkflowRun2.runStartedAt)
                && Objects.equals(this.status, deploymentWorkflowRun2.status)
                && Objects.equals(this.triggeringActor, deploymentWorkflowRun2.triggeringActor)
                && Objects.equals(this.updatedAt, deploymentWorkflowRun2.updatedAt)
                && Objects.equals(this.url, deploymentWorkflowRun2.url)
                && Objects.equals(this.workflowId, deploymentWorkflowRun2.workflowId)
                && Objects.equals(this.workflowUrl, deploymentWorkflowRun2.workflowUrl)
                && Objects.equals(this.displayTitle, deploymentWorkflowRun2.displayTitle);
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
                hashCodeNullable(headCommit),
                headRepository,
                headSha,
                htmlUrl,
                id,
                jobsUrl,
                logsUrl,
                name,
                nodeId,
                path,
                hashCodeNullable(previousAttemptUrl),
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
        sb.append("class DeploymentWorkflowRun2 {\n");
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
