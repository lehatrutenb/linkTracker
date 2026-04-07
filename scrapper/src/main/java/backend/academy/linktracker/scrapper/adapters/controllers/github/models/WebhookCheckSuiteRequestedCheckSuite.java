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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The [check_suite](https://docs.github.com/rest/checks/suites#get-a-check-suite).
 */
@Schema(
        name = "webhook_check_suite_requested_check_suite",
        description = "The [check_suite](https://docs.github.com/rest/checks/suites#get-a-check-suite).")
@JsonTypeName("webhook_check_suite_requested_check_suite")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCheckSuiteRequestedCheckSuite {

    private JsonNullable<String> after = JsonNullable.<String>undefined();

    private App3 app;

    private JsonNullable<String> before = JsonNullable.<String>undefined();

    private URI checkRunsUrl;

    /**
     * The summary conclusion for all check runs that are part of the check suite. This value will be `null` until the check run has completed.
     */
    public enum ConclusionEnum {
        SUCCESS("success"),

        FAILURE("failure"),

        NEUTRAL("neutral"),

        CANCELLED("cancelled"),

        TIMED_OUT("timed_out"),

        ACTION_REQUIRED("action_required"),

        STALE("stale"),

        SKIPPED("skipped");

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

    private JsonNullable<String> headBranch = JsonNullable.<String>undefined();

    private SimpleCommit headCommit;

    private String headSha;

    private Long id;

    private Long latestCheckRunsCount;

    private String nodeId;

    @Valid
    private List<@Valid CheckRunPullRequest> pullRequests = new ArrayList<>();

    private Optional<Boolean> rerequestable = Optional.empty();

    private Optional<Boolean> runsRerequestable = Optional.empty();

    /**
     * The summary status for all check runs that are part of the check suite. Can be `requested`, `in_progress`, or `completed`.
     */
    public enum StatusEnum {
        REQUESTED("requested"),

        IN_PROGRESS("in_progress"),

        COMPLETED("completed"),

        QUEUED("queued");

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

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    public WebhookCheckSuiteRequestedCheckSuite() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCheckSuiteRequestedCheckSuite(
            String after,
            App3 app,
            String before,
            URI checkRunsUrl,
            ConclusionEnum conclusion,
            OffsetDateTime createdAt,
            String headBranch,
            SimpleCommit headCommit,
            String headSha,
            Long id,
            Long latestCheckRunsCount,
            String nodeId,
            List<@Valid CheckRunPullRequest> pullRequests,
            StatusEnum status,
            OffsetDateTime updatedAt,
            URI url) {
        this.after = JsonNullable.of(after);
        this.app = app;
        this.before = JsonNullable.of(before);
        this.checkRunsUrl = checkRunsUrl;
        this.conclusion = JsonNullable.of(conclusion);
        this.createdAt = createdAt;
        this.headBranch = JsonNullable.of(headBranch);
        this.headCommit = headCommit;
        this.headSha = headSha;
        this.id = id;
        this.latestCheckRunsCount = latestCheckRunsCount;
        this.nodeId = nodeId;
        this.pullRequests = pullRequests;
        this.status = JsonNullable.of(status);
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public WebhookCheckSuiteRequestedCheckSuite after(String after) {
        this.after = JsonNullable.of(after);
        return this;
    }

    /**
     * Get after
     * @return after
     */
    @NotNull
    @Schema(name = "after", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("after")
    public JsonNullable<String> getAfter() {
        return after;
    }

    public void setAfter(JsonNullable<String> after) {
        this.after = after;
    }

    public WebhookCheckSuiteRequestedCheckSuite app(App3 app) {
        this.app = app;
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
    public App3 getApp() {
        return app;
    }

    public void setApp(App3 app) {
        this.app = app;
    }

    public WebhookCheckSuiteRequestedCheckSuite before(String before) {
        this.before = JsonNullable.of(before);
        return this;
    }

    /**
     * Get before
     * @return before
     */
    @NotNull
    @Schema(name = "before", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("before")
    public JsonNullable<String> getBefore() {
        return before;
    }

    public void setBefore(JsonNullable<String> before) {
        this.before = before;
    }

    public WebhookCheckSuiteRequestedCheckSuite checkRunsUrl(URI checkRunsUrl) {
        this.checkRunsUrl = checkRunsUrl;
        return this;
    }

    /**
     * Get checkRunsUrl
     * @return checkRunsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "check_runs_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_runs_url")
    public URI getCheckRunsUrl() {
        return checkRunsUrl;
    }

    public void setCheckRunsUrl(URI checkRunsUrl) {
        this.checkRunsUrl = checkRunsUrl;
    }

    public WebhookCheckSuiteRequestedCheckSuite conclusion(ConclusionEnum conclusion) {
        this.conclusion = JsonNullable.of(conclusion);
        return this;
    }

    /**
     * The summary conclusion for all check runs that are part of the check suite. This value will be `null` until the check run has completed.
     * @return conclusion
     */
    @NotNull
    @Schema(
            name = "conclusion",
            description =
                    "The summary conclusion for all check runs that are part of the check suite. This value will be `null` until the check run has completed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public JsonNullable<ConclusionEnum> getConclusion() {
        return conclusion;
    }

    public void setConclusion(JsonNullable<ConclusionEnum> conclusion) {
        this.conclusion = conclusion;
    }

    public WebhookCheckSuiteRequestedCheckSuite createdAt(OffsetDateTime createdAt) {
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

    public WebhookCheckSuiteRequestedCheckSuite headBranch(String headBranch) {
        this.headBranch = JsonNullable.of(headBranch);
        return this;
    }

    /**
     * The head branch name the changes are on.
     * @return headBranch
     */
    @NotNull
    @Schema(
            name = "head_branch",
            description = "The head branch name the changes are on.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_branch")
    public JsonNullable<String> getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(JsonNullable<String> headBranch) {
        this.headBranch = headBranch;
    }

    public WebhookCheckSuiteRequestedCheckSuite headCommit(SimpleCommit headCommit) {
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

    public WebhookCheckSuiteRequestedCheckSuite headSha(String headSha) {
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
            description = "The SHA of the head commit that is being checked.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public WebhookCheckSuiteRequestedCheckSuite id(Long id) {
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

    public WebhookCheckSuiteRequestedCheckSuite latestCheckRunsCount(Long latestCheckRunsCount) {
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

    public WebhookCheckSuiteRequestedCheckSuite nodeId(String nodeId) {
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

    public WebhookCheckSuiteRequestedCheckSuite pullRequests(List<@Valid CheckRunPullRequest> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public WebhookCheckSuiteRequestedCheckSuite addPullRequestsItem(CheckRunPullRequest pullRequestsItem) {
        if (this.pullRequests == null) {
            this.pullRequests = new ArrayList<>();
        }
        this.pullRequests.add(pullRequestsItem);
        return this;
    }

    /**
     * An array of pull requests that match this check suite. A pull request matches a check suite if they have the same `head_sha` and `head_branch`. When the check suite's `head_branch` is in a forked repository it will be `null` and the `pull_requests` array will be empty.
     * @return pullRequests
     */
    @NotNull
    @Valid
    @Schema(
            name = "pull_requests",
            description =
                    "An array of pull requests that match this check suite. A pull request matches a check suite if they have the same `head_sha` and `head_branch`. When the check suite's `head_branch` is in a forked repository it will be `null` and the `pull_requests` array will be empty.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_requests")
    public List<@Valid CheckRunPullRequest> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<@Valid CheckRunPullRequest> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public WebhookCheckSuiteRequestedCheckSuite rerequestable(Boolean rerequestable) {
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

    public WebhookCheckSuiteRequestedCheckSuite runsRerequestable(Boolean runsRerequestable) {
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

    public WebhookCheckSuiteRequestedCheckSuite status(StatusEnum status) {
        this.status = JsonNullable.of(status);
        return this;
    }

    /**
     * The summary status for all check runs that are part of the check suite. Can be `requested`, `in_progress`, or `completed`.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            description =
                    "The summary status for all check runs that are part of the check suite. Can be `requested`, `in_progress`, or `completed`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public JsonNullable<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(JsonNullable<StatusEnum> status) {
        this.status = status;
    }

    public WebhookCheckSuiteRequestedCheckSuite updatedAt(OffsetDateTime updatedAt) {
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

    public WebhookCheckSuiteRequestedCheckSuite url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * URL that points to the check suite API resource.
     * @return url
     */
    @NotNull
    @Valid
    @Schema(
            name = "url",
            description = "URL that points to the check suite API resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        WebhookCheckSuiteRequestedCheckSuite webhookCheckSuiteRequestedCheckSuite =
                (WebhookCheckSuiteRequestedCheckSuite) o;
        return Objects.equals(this.after, webhookCheckSuiteRequestedCheckSuite.after)
                && Objects.equals(this.app, webhookCheckSuiteRequestedCheckSuite.app)
                && Objects.equals(this.before, webhookCheckSuiteRequestedCheckSuite.before)
                && Objects.equals(this.checkRunsUrl, webhookCheckSuiteRequestedCheckSuite.checkRunsUrl)
                && Objects.equals(this.conclusion, webhookCheckSuiteRequestedCheckSuite.conclusion)
                && Objects.equals(this.createdAt, webhookCheckSuiteRequestedCheckSuite.createdAt)
                && Objects.equals(this.headBranch, webhookCheckSuiteRequestedCheckSuite.headBranch)
                && Objects.equals(this.headCommit, webhookCheckSuiteRequestedCheckSuite.headCommit)
                && Objects.equals(this.headSha, webhookCheckSuiteRequestedCheckSuite.headSha)
                && Objects.equals(this.id, webhookCheckSuiteRequestedCheckSuite.id)
                && Objects.equals(this.latestCheckRunsCount, webhookCheckSuiteRequestedCheckSuite.latestCheckRunsCount)
                && Objects.equals(this.nodeId, webhookCheckSuiteRequestedCheckSuite.nodeId)
                && Objects.equals(this.pullRequests, webhookCheckSuiteRequestedCheckSuite.pullRequests)
                && Objects.equals(this.rerequestable, webhookCheckSuiteRequestedCheckSuite.rerequestable)
                && Objects.equals(this.runsRerequestable, webhookCheckSuiteRequestedCheckSuite.runsRerequestable)
                && Objects.equals(this.status, webhookCheckSuiteRequestedCheckSuite.status)
                && Objects.equals(this.updatedAt, webhookCheckSuiteRequestedCheckSuite.updatedAt)
                && Objects.equals(this.url, webhookCheckSuiteRequestedCheckSuite.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                after,
                app,
                before,
                checkRunsUrl,
                conclusion,
                createdAt,
                headBranch,
                headCommit,
                headSha,
                id,
                latestCheckRunsCount,
                nodeId,
                pullRequests,
                rerequestable,
                runsRerequestable,
                status,
                updatedAt,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookCheckSuiteRequestedCheckSuite {\n");
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    checkRunsUrl: ").append(toIndentedString(checkRunsUrl)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
        sb.append("    headCommit: ").append(toIndentedString(headCommit)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    latestCheckRunsCount: ")
                .append(toIndentedString(latestCheckRunsCount))
                .append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
        sb.append("    rerequestable: ").append(toIndentedString(rerequestable)).append("\n");
        sb.append("    runsRerequestable: ")
                .append(toIndentedString(runsRerequestable))
                .append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
