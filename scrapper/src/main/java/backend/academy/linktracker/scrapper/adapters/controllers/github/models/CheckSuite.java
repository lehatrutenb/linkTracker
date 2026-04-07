package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A suite of checks performed on the code of a given code change
 */
@Schema(name = "check-suite", description = "A suite of checks performed on the code of a given code change")
@JsonTypeName("check-suite")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckSuite {

    private Long id;

    private String nodeId;

    private JsonNullable<String> headBranch = JsonNullable.<String>undefined();

    private String headSha;

    /**
     * The phase of the lifecycle that the check suite is currently in. Statuses of waiting, requested, and pending are reserved for GitHub Actions check suites.
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
            return null;
        }
    }

    private JsonNullable<StatusEnum> status = JsonNullable.<StatusEnum>undefined();

    /**
     * Gets or Sets conclusion
     */
    public enum ConclusionEnum {
        SUCCESS("success"),

        FAILURE("failure"),

        NEUTRAL("neutral"),

        CANCELLED("cancelled"),

        SKIPPED("skipped"),

        TIMED_OUT("timed_out"),

        ACTION_REQUIRED("action_required"),

        STARTUP_FAILURE("startup_failure"),

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

    private JsonNullable<String> url = JsonNullable.<String>undefined();

    private JsonNullable<String> before = JsonNullable.<String>undefined();

    private JsonNullable<String> after = JsonNullable.<String>undefined();

    @Valid
    private JsonNullable<List<@Valid PullRequestMinimal>> pullRequests =
            JsonNullable.<List<@Valid PullRequestMinimal>>undefined();

    private JsonNullable<NullableIntegration> app = JsonNullable.<NullableIntegration>undefined();

    private MinimalRepository repository;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    private SimpleCommit headCommit;

    private Long latestCheckRunsCount;

    private String checkRunsUrl;

    private Optional<Boolean> rerequestable = Optional.empty();

    private Optional<Boolean> runsRerequestable = Optional.empty();

    public CheckSuite() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckSuite(
            Long id,
            String nodeId,
            String headBranch,
            String headSha,
            StatusEnum status,
            ConclusionEnum conclusion,
            String url,
            String before,
            String after,
            List<@Valid PullRequestMinimal> pullRequests,
            NullableIntegration app,
            MinimalRepository repository,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            SimpleCommit headCommit,
            Long latestCheckRunsCount,
            String checkRunsUrl) {
        this.id = id;
        this.nodeId = nodeId;
        this.headBranch = JsonNullable.of(headBranch);
        this.headSha = headSha;
        this.status = JsonNullable.of(status);
        this.conclusion = JsonNullable.of(conclusion);
        this.url = JsonNullable.of(url);
        this.before = JsonNullable.of(before);
        this.after = JsonNullable.of(after);
        this.pullRequests = JsonNullable.of(pullRequests);
        this.app = JsonNullable.of(app);
        this.repository = repository;
        this.createdAt = JsonNullable.of(createdAt);
        this.updatedAt = JsonNullable.of(updatedAt);
        this.headCommit = headCommit;
        this.latestCheckRunsCount = latestCheckRunsCount;
        this.checkRunsUrl = checkRunsUrl;
    }

    public CheckSuite id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CheckSuite nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEwOkNoZWNrU3VpdGU1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CheckSuite headBranch(String headBranch) {
        this.headBranch = JsonNullable.of(headBranch);
        return this;
    }

    /**
     * Get headBranch
     * @return headBranch
     */
    @NotNull
    @Schema(name = "head_branch", example = "master", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_branch")
    public JsonNullable<String> getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(JsonNullable<String> headBranch) {
        this.headBranch = headBranch;
    }

    public CheckSuite headSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * The SHA of the head commit that is being checked.
     * @return headSha
     */
    @NotNull
    @Schema(
            name = "head_sha",
            example = "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
            description = "The SHA of the head commit that is being checked.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public CheckSuite status(StatusEnum status) {
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * The phase of the lifecycle that the check suite is currently in. Statuses of waiting, requested, and pending are reserved for GitHub Actions check suites.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            example = "completed",
            description =
                    "The phase of the lifecycle that the check suite is currently in. Statuses of waiting, requested, and pending are reserved for GitHub Actions check suites.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public JsonNullable<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(JsonNullable<StatusEnum> status) {
        this.status = status;
    }

    public CheckSuite conclusion(ConclusionEnum conclusion) {
        this.conclusion = JsonNullable.of(conclusion);
        return this;
    }

    /**
     * Get conclusion
     * @return conclusion
     */
    @NotNull
    @Schema(name = "conclusion", example = "neutral", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public JsonNullable<ConclusionEnum> getConclusion() {
        return conclusion;
    }

    public void setConclusion(JsonNullable<ConclusionEnum> conclusion) {
        this.conclusion = conclusion;
    }

    public CheckSuite url(String url) {
        this.url = JsonNullable.of(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/github/hello-world/check-suites/5",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public JsonNullable<String> getUrl() {
        return url;
    }

    public void setUrl(JsonNullable<String> url) {
        this.url = url;
    }

    public CheckSuite before(String before) {
        this.before = JsonNullable.of(before);
        return this;
    }

    /**
     * Get before
     * @return before
     */
    @NotNull
    @Schema(
            name = "before",
            example = "146e867f55c26428e5f9fade55a9bbf5e95a7912",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("before")
    public JsonNullable<String> getBefore() {
        return before;
    }

    public void setBefore(JsonNullable<String> before) {
        this.before = before;
    }

    public CheckSuite after(String after) {
        this.after = JsonNullable.of(after);
        return this;
    }

    /**
     * Get after
     * @return after
     */
    @NotNull
    @Schema(
            name = "after",
            example = "d6fde92930d4715a2b49857d24b940956b26d2d3",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("after")
    public JsonNullable<String> getAfter() {
        return after;
    }

    public void setAfter(JsonNullable<String> after) {
        this.after = after;
    }

    public CheckSuite pullRequests(List<@Valid PullRequestMinimal> pullRequests) {
        this.pullRequests = JsonNullable.of(pullRequests);
        return this;
    }

    public CheckSuite addPullRequestsItem(PullRequestMinimal pullRequestsItem) {
        if (this.pullRequests == null || !this.pullRequests.isPresent()) {
            this.pullRequests = JsonNullable.of(new ArrayList<>());
        }
        this.pullRequests.get().add(pullRequestsItem);
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
    public JsonNullable<List<@Valid PullRequestMinimal>> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(JsonNullable<List<@Valid PullRequestMinimal>> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public CheckSuite app(NullableIntegration app) {
        this.app = JsonNullable.of(app);
        return this;
    }

    /**
     * Get app
     * @return app
     */
    @NotNull
    @Valid
    @Schema(name = "app", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("app")
    public JsonNullable<NullableIntegration> getApp() {
        return app;
    }

    public void setApp(JsonNullable<NullableIntegration> app) {
        this.app = app;
    }

    public CheckSuite repository(MinimalRepository repository) {
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
    public MinimalRepository getRepository() {
        return repository;
    }

    public void setRepository(MinimalRepository repository) {
        this.repository = repository;
    }

    public CheckSuite createdAt(OffsetDateTime createdAt) {
        this.createdAt = JsonNullable.of(createdAt);
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
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public CheckSuite updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
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
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CheckSuite headCommit(SimpleCommit headCommit) {
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

    public CheckSuite latestCheckRunsCount(Long latestCheckRunsCount) {
        this.latestCheckRunsCount = latestCheckRunsCount;
        return this;
    }

    /**
     * Get latestCheckRunsCount
     * @return latestCheckRunsCount
     */
    @NotNull
    @Schema(name = "latest_check_runs_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("latest_check_runs_count")
    public Long getLatestCheckRunsCount() {
        return latestCheckRunsCount;
    }

    public void setLatestCheckRunsCount(Long latestCheckRunsCount) {
        this.latestCheckRunsCount = latestCheckRunsCount;
    }

    public CheckSuite checkRunsUrl(String checkRunsUrl) {
        this.checkRunsUrl = checkRunsUrl;
        return this;
    }

    /**
     * Get checkRunsUrl
     * @return checkRunsUrl
     */
    @NotNull
    @Schema(name = "check_runs_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_runs_url")
    public String getCheckRunsUrl() {
        return checkRunsUrl;
    }

    public void setCheckRunsUrl(String checkRunsUrl) {
        this.checkRunsUrl = checkRunsUrl;
    }

    public CheckSuite rerequestable(Boolean rerequestable) {
        this.rerequestable = Optional.ofNullable(rerequestable);
        return this;
    }

    /**
     * Get rerequestable
     * @return rerequestable
     */
    @Schema(name = "rerequestable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rerequestable")
    public Optional<Boolean> getRerequestable() {
        return rerequestable;
    }

    public void setRerequestable(Optional<Boolean> rerequestable) {
        this.rerequestable = rerequestable;
    }

    public CheckSuite runsRerequestable(Boolean runsRerequestable) {
        this.runsRerequestable = Optional.ofNullable(runsRerequestable);
        return this;
    }

    /**
     * Get runsRerequestable
     * @return runsRerequestable
     */
    @Schema(name = "runs_rerequestable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runs_rerequestable")
    public Optional<Boolean> getRunsRerequestable() {
        return runsRerequestable;
    }

    public void setRunsRerequestable(Optional<Boolean> runsRerequestable) {
        this.runsRerequestable = runsRerequestable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckSuite checkSuite = (CheckSuite) o;
        return Objects.equals(this.id, checkSuite.id)
                && Objects.equals(this.nodeId, checkSuite.nodeId)
                && Objects.equals(this.headBranch, checkSuite.headBranch)
                && Objects.equals(this.headSha, checkSuite.headSha)
                && Objects.equals(this.status, checkSuite.status)
                && Objects.equals(this.conclusion, checkSuite.conclusion)
                && Objects.equals(this.url, checkSuite.url)
                && Objects.equals(this.before, checkSuite.before)
                && Objects.equals(this.after, checkSuite.after)
                && Objects.equals(this.pullRequests, checkSuite.pullRequests)
                && Objects.equals(this.app, checkSuite.app)
                && Objects.equals(this.repository, checkSuite.repository)
                && Objects.equals(this.createdAt, checkSuite.createdAt)
                && Objects.equals(this.updatedAt, checkSuite.updatedAt)
                && Objects.equals(this.headCommit, checkSuite.headCommit)
                && Objects.equals(this.latestCheckRunsCount, checkSuite.latestCheckRunsCount)
                && Objects.equals(this.checkRunsUrl, checkSuite.checkRunsUrl)
                && Objects.equals(this.rerequestable, checkSuite.rerequestable)
                && Objects.equals(this.runsRerequestable, checkSuite.runsRerequestable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                headBranch,
                headSha,
                status,
                conclusion,
                url,
                before,
                after,
                pullRequests,
                app,
                repository,
                createdAt,
                updatedAt,
                headCommit,
                latestCheckRunsCount,
                checkRunsUrl,
                rerequestable,
                runsRerequestable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckSuite {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    headCommit: ").append(toIndentedString(headCommit)).append("\n");
        sb.append("    latestCheckRunsCount: ")
                .append(toIndentedString(latestCheckRunsCount))
                .append("\n");
        sb.append("    checkRunsUrl: ").append(toIndentedString(checkRunsUrl)).append("\n");
        sb.append("    rerequestable: ").append(toIndentedString(rerequestable)).append("\n");
        sb.append("    runsRerequestable: ")
                .append(toIndentedString(runsRerequestable))
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
