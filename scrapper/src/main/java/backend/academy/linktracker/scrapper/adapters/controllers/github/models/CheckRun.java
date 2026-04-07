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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A check performed on the code of a given code change
 */
@Schema(name = "check-run", description = "A check performed on the code of a given code change")
@JsonTypeName("check-run")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckRun {

    private Long id;

    private String headSha;

    private String nodeId;

    private JsonNullable<String> externalId = JsonNullable.<String>undefined();

    private String url;

    private JsonNullable<String> htmlUrl = JsonNullable.<String>undefined();

    private JsonNullable<String> detailsUrl = JsonNullable.<String>undefined();

    /**
     * The phase of the lifecycle that the check is currently in. Statuses of waiting, requested, and pending are reserved for GitHub Actions check runs.
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
     * Gets or Sets conclusion
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

    private JsonNullable<ConclusionEnum> conclusion = JsonNullable.<ConclusionEnum>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> startedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> completedAt = JsonNullable.<OffsetDateTime>undefined();

    private CheckRunOutput output;

    private String name;

    private JsonNullable<CheckRunCheckSuite> checkSuite = JsonNullable.<CheckRunCheckSuite>undefined();

    private JsonNullable<NullableIntegration> app = JsonNullable.<NullableIntegration>undefined();

    @Valid
    private List<@Valid PullRequestMinimal> pullRequests = new ArrayList<>();

    private Optional<DeploymentSimple> deployment = Optional.empty();

    public CheckRun() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckRun(
            Long id,
            String headSha,
            String nodeId,
            String externalId,
            String url,
            String htmlUrl,
            String detailsUrl,
            StatusEnum status,
            ConclusionEnum conclusion,
            OffsetDateTime startedAt,
            OffsetDateTime completedAt,
            CheckRunOutput output,
            String name,
            CheckRunCheckSuite checkSuite,
            NullableIntegration app,
            List<@Valid PullRequestMinimal> pullRequests) {
        this.id = id;
        this.headSha = headSha;
        this.nodeId = nodeId;
        this.externalId = JsonNullable.of(externalId);
        this.url = url;
        this.htmlUrl = JsonNullable.of(htmlUrl);
        this.detailsUrl = JsonNullable.of(detailsUrl);
        this.status = status;
        this.conclusion = JsonNullable.of(conclusion);
        this.startedAt = JsonNullable.of(startedAt);
        this.completedAt = JsonNullable.of(completedAt);
        this.output = output;
        this.name = name;
        this.checkSuite = JsonNullable.of(checkSuite);
        this.app = JsonNullable.of(app);
        this.pullRequests = pullRequests;
    }

    public CheckRun id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The id of the check.
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "21",
            description = "The id of the check.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CheckRun headSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * The SHA of the commit that is being checked.
     * @return headSha
     */
    @NotNull
    @Schema(
            name = "head_sha",
            example = "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
            description = "The SHA of the commit that is being checked.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public CheckRun nodeId(String nodeId) {
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

    public CheckRun externalId(String externalId) {
        this.externalId = JsonNullable.of(externalId);
        return this;
    }

    /**
     * Get externalId
     * @return externalId
     */
    @NotNull
    @Schema(name = "external_id", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("external_id")
    public JsonNullable<String> getExternalId() {
        return externalId;
    }

    public void setExternalId(JsonNullable<String> externalId) {
        this.externalId = externalId;
    }

    public CheckRun url(String url) {
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
            example = "https://api.github.com/repos/github/hello-world/check-runs/4",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CheckRun htmlUrl(String htmlUrl) {
        this.htmlUrl = JsonNullable.of(htmlUrl);
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
    public JsonNullable<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(JsonNullable<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public CheckRun detailsUrl(String detailsUrl) {
        this.detailsUrl = JsonNullable.of(detailsUrl);
        return this;
    }

    /**
     * Get detailsUrl
     * @return detailsUrl
     */
    @NotNull
    @Schema(name = "details_url", example = "https://example.com", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("details_url")
    public JsonNullable<String> getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(JsonNullable<String> detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public CheckRun status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The phase of the lifecycle that the check is currently in. Statuses of waiting, requested, and pending are reserved for GitHub Actions check runs.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            example = "queued",
            description =
                    "The phase of the lifecycle that the check is currently in. Statuses of waiting, requested, and pending are reserved for GitHub Actions check runs.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CheckRun conclusion(ConclusionEnum conclusion) {
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

    public CheckRun startedAt(OffsetDateTime startedAt) {
        this.startedAt = JsonNullable.of(startedAt);
        return this;
    }

    /**
     * Get startedAt
     * @return startedAt
     */
    @NotNull
    @Valid
    @Schema(name = "started_at", example = "2018-05-04T01:14:52Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("started_at")
    public JsonNullable<OffsetDateTime> getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(JsonNullable<OffsetDateTime> startedAt) {
        this.startedAt = startedAt;
    }

    public CheckRun completedAt(OffsetDateTime completedAt) {
        this.completedAt = JsonNullable.of(completedAt);
        return this;
    }

    /**
     * Get completedAt
     * @return completedAt
     */
    @NotNull
    @Valid
    @Schema(name = "completed_at", example = "2018-05-04T01:14:52Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("completed_at")
    public JsonNullable<OffsetDateTime> getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(JsonNullable<OffsetDateTime> completedAt) {
        this.completedAt = completedAt;
    }

    public CheckRun output(CheckRunOutput output) {
        this.output = output;
        return this;
    }

    /**
     * Get output
     * @return output
     */
    @NotNull
    @Valid
    @Schema(name = "output", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("output")
    public CheckRunOutput getOutput() {
        return output;
    }

    public void setOutput(CheckRunOutput output) {
        this.output = output;
    }

    public CheckRun name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the check.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "test-coverage",
            description = "The name of the check.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CheckRun checkSuite(CheckRunCheckSuite checkSuite) {
        this.checkSuite = JsonNullable.of(checkSuite);
        return this;
    }

    /**
     * Get checkSuite
     * @return checkSuite
     */
    @NotNull
    @Valid
    @Schema(name = "check_suite", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("check_suite")
    public JsonNullable<CheckRunCheckSuite> getCheckSuite() {
        return checkSuite;
    }

    public void setCheckSuite(JsonNullable<CheckRunCheckSuite> checkSuite) {
        this.checkSuite = checkSuite;
    }

    public CheckRun app(NullableIntegration app) {
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

    public CheckRun pullRequests(List<@Valid PullRequestMinimal> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public CheckRun addPullRequestsItem(PullRequestMinimal pullRequestsItem) {
        if (this.pullRequests == null) {
            this.pullRequests = new ArrayList<>();
        }
        this.pullRequests.add(pullRequestsItem);
        return this;
    }

    /**
     * Pull requests that are open with a `head_sha` or `head_branch` that matches the check. The returned pull requests do not necessarily indicate pull requests that triggered the check.
     * @return pullRequests
     */
    @NotNull
    @Valid
    @Schema(
            name = "pull_requests",
            description =
                    "Pull requests that are open with a `head_sha` or `head_branch` that matches the check. The returned pull requests do not necessarily indicate pull requests that triggered the check.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_requests")
    public List<@Valid PullRequestMinimal> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<@Valid PullRequestMinimal> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public CheckRun deployment(DeploymentSimple deployment) {
        this.deployment = Optional.ofNullable(deployment);
        return this;
    }

    /**
     * Get deployment
     * @return deployment
     */
    @Valid
    @Schema(name = "deployment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment")
    public Optional<DeploymentSimple> getDeployment() {
        return deployment;
    }

    public void setDeployment(Optional<DeploymentSimple> deployment) {
        this.deployment = deployment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRun checkRun = (CheckRun) o;
        return Objects.equals(this.id, checkRun.id)
                && Objects.equals(this.headSha, checkRun.headSha)
                && Objects.equals(this.nodeId, checkRun.nodeId)
                && Objects.equals(this.externalId, checkRun.externalId)
                && Objects.equals(this.url, checkRun.url)
                && Objects.equals(this.htmlUrl, checkRun.htmlUrl)
                && Objects.equals(this.detailsUrl, checkRun.detailsUrl)
                && Objects.equals(this.status, checkRun.status)
                && Objects.equals(this.conclusion, checkRun.conclusion)
                && Objects.equals(this.startedAt, checkRun.startedAt)
                && Objects.equals(this.completedAt, checkRun.completedAt)
                && Objects.equals(this.output, checkRun.output)
                && Objects.equals(this.name, checkRun.name)
                && Objects.equals(this.checkSuite, checkRun.checkSuite)
                && Objects.equals(this.app, checkRun.app)
                && Objects.equals(this.pullRequests, checkRun.pullRequests)
                && Objects.equals(this.deployment, checkRun.deployment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                headSha,
                nodeId,
                externalId,
                url,
                htmlUrl,
                detailsUrl,
                status,
                conclusion,
                startedAt,
                completedAt,
                output,
                name,
                checkSuite,
                app,
                pullRequests,
                deployment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRun {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    detailsUrl: ").append(toIndentedString(detailsUrl)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    checkSuite: ").append(toIndentedString(checkSuite)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
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
