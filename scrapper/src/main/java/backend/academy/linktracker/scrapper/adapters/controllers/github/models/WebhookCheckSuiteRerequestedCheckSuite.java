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

/**
 * The [check_suite](https://docs.github.com/rest/checks/suites#get-a-check-suite).
 */
@Schema(
        name = "webhook_check_suite_rerequested_check_suite",
        description = "The [check_suite](https://docs.github.com/rest/checks/suites#get-a-check-suite).")
@JsonTypeName("webhook_check_suite_rerequested_check_suite")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCheckSuiteRerequestedCheckSuite {

    private String after = null;

    private App4 app;

    private String before = null;

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

    private String headBranch = null;

    private SimpleCommit headCommit;

    private String headSha;

    private Long id;

    private Long latestCheckRunsCount;

    private String nodeId;

    @Valid
    private List<@Valid CheckRunPullRequest> pullRequests = new ArrayList<>();

    private Boolean rerequestable;

    private Boolean runsRerequestable;

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

    private StatusEnum status = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    public WebhookCheckSuiteRerequestedCheckSuite() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCheckSuiteRerequestedCheckSuite(
            String after,
            App4 app,
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
        this.after = after;
        this.app = app;
        this.before = before;
        this.checkRunsUrl = checkRunsUrl;
        this.conclusion = conclusion;
        this.createdAt = createdAt;
        this.headBranch = headBranch;
        this.headCommit = headCommit;
        this.headSha = headSha;
        this.id = id;
        this.latestCheckRunsCount = latestCheckRunsCount;
        this.nodeId = nodeId;
        this.pullRequests = pullRequests;
        this.status = status;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public WebhookCheckSuiteRerequestedCheckSuite after(String after) {
        this.after = after;
        return this;
    }

    /**
     * Get after
     * @return after
     */
    @NotNull
    @Schema(name = "after", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("after")
    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public WebhookCheckSuiteRerequestedCheckSuite app(App4 app) {
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
    public App4 getApp() {
        return app;
    }

    public void setApp(App4 app) {
        this.app = app;
    }

    public WebhookCheckSuiteRerequestedCheckSuite before(String before) {
        this.before = before;
        return this;
    }

    /**
     * Get before
     * @return before
     */
    @NotNull
    @Schema(name = "before", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("before")
    public String getBefore() {
        return before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    public WebhookCheckSuiteRerequestedCheckSuite checkRunsUrl(URI checkRunsUrl) {
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

    public WebhookCheckSuiteRerequestedCheckSuite conclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
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
    public ConclusionEnum getConclusion() {
        return conclusion;
    }

    public void setConclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
    }

    public WebhookCheckSuiteRerequestedCheckSuite createdAt(OffsetDateTime createdAt) {
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

    public WebhookCheckSuiteRerequestedCheckSuite headBranch(String headBranch) {
        this.headBranch = headBranch;
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
    public String getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(String headBranch) {
        this.headBranch = headBranch;
    }

    public WebhookCheckSuiteRerequestedCheckSuite headCommit(SimpleCommit headCommit) {
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

    public WebhookCheckSuiteRerequestedCheckSuite headSha(String headSha) {
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

    public WebhookCheckSuiteRerequestedCheckSuite id(Long id) {
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

    public WebhookCheckSuiteRerequestedCheckSuite latestCheckRunsCount(Long latestCheckRunsCount) {
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

    public WebhookCheckSuiteRerequestedCheckSuite nodeId(String nodeId) {
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

    public WebhookCheckSuiteRerequestedCheckSuite pullRequests(List<@Valid CheckRunPullRequest> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public WebhookCheckSuiteRerequestedCheckSuite addPullRequestsItem(CheckRunPullRequest pullRequestsItem) {
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

    public WebhookCheckSuiteRerequestedCheckSuite rerequestable(Boolean rerequestable) {
        this.rerequestable = rerequestable;
        return this;
    }

    /**
     * Get rerequestable
     * @return rerequestable
     */
    @Schema(name = "rerequestable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rerequestable")
    public Boolean getRerequestable() {
        return rerequestable;
    }

    public void setRerequestable(Boolean rerequestable) {
        this.rerequestable = rerequestable;
    }

    public WebhookCheckSuiteRerequestedCheckSuite runsRerequestable(Boolean runsRerequestable) {
        this.runsRerequestable = runsRerequestable;
        return this;
    }

    /**
     * Get runsRerequestable
     * @return runsRerequestable
     */
    @Schema(name = "runs_rerequestable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("runs_rerequestable")
    public Boolean getRunsRerequestable() {
        return runsRerequestable;
    }

    public void setRunsRerequestable(Boolean runsRerequestable) {
        this.runsRerequestable = runsRerequestable;
    }

    public WebhookCheckSuiteRerequestedCheckSuite status(StatusEnum status) {
        this.status = status;
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
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public WebhookCheckSuiteRerequestedCheckSuite updatedAt(OffsetDateTime updatedAt) {
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

    public WebhookCheckSuiteRerequestedCheckSuite url(URI url) {
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
        WebhookCheckSuiteRerequestedCheckSuite webhookCheckSuiteRerequestedCheckSuite =
                (WebhookCheckSuiteRerequestedCheckSuite) o;
        return Objects.equals(this.after, webhookCheckSuiteRerequestedCheckSuite.after)
                && Objects.equals(this.app, webhookCheckSuiteRerequestedCheckSuite.app)
                && Objects.equals(this.before, webhookCheckSuiteRerequestedCheckSuite.before)
                && Objects.equals(this.checkRunsUrl, webhookCheckSuiteRerequestedCheckSuite.checkRunsUrl)
                && Objects.equals(this.conclusion, webhookCheckSuiteRerequestedCheckSuite.conclusion)
                && Objects.equals(this.createdAt, webhookCheckSuiteRerequestedCheckSuite.createdAt)
                && Objects.equals(this.headBranch, webhookCheckSuiteRerequestedCheckSuite.headBranch)
                && Objects.equals(this.headCommit, webhookCheckSuiteRerequestedCheckSuite.headCommit)
                && Objects.equals(this.headSha, webhookCheckSuiteRerequestedCheckSuite.headSha)
                && Objects.equals(this.id, webhookCheckSuiteRerequestedCheckSuite.id)
                && Objects.equals(
                        this.latestCheckRunsCount, webhookCheckSuiteRerequestedCheckSuite.latestCheckRunsCount)
                && Objects.equals(this.nodeId, webhookCheckSuiteRerequestedCheckSuite.nodeId)
                && Objects.equals(this.pullRequests, webhookCheckSuiteRerequestedCheckSuite.pullRequests)
                && Objects.equals(this.rerequestable, webhookCheckSuiteRerequestedCheckSuite.rerequestable)
                && Objects.equals(this.runsRerequestable, webhookCheckSuiteRerequestedCheckSuite.runsRerequestable)
                && Objects.equals(this.status, webhookCheckSuiteRerequestedCheckSuite.status)
                && Objects.equals(this.updatedAt, webhookCheckSuiteRerequestedCheckSuite.updatedAt)
                && Objects.equals(this.url, webhookCheckSuiteRerequestedCheckSuite.url);
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
        sb.append("class WebhookCheckSuiteRerequestedCheckSuite {\n");
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
