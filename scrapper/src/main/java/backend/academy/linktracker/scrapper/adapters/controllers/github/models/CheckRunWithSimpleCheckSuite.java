package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A check performed on the code of a given code change
 */
@Schema(
        name = "check-run-with-simple-check-suite",
        description = "A check performed on the code of a given code change")
@JsonTypeName("check-run-with-simple-check-suite")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckRunWithSimpleCheckSuite {

    private Integration app = null;

    private SimpleCheckSuite checkSuite;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime completedAt = null;

    /**
     * Gets or Sets conclusion
     */
    public enum ConclusionEnum {
        WAITING("waiting"),

        PENDING("pending"),

        STARTUP_FAILURE("startup_failure"),

        STALE("stale"),

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

    private ConclusionEnum conclusion = null;

    private DeploymentSimple deployment;

    private String detailsUrl;

    private String externalId;

    private String headSha;

    private String htmlUrl;

    private Long id;

    private String name;

    private String nodeId;

    private CheckRunWithSimpleCheckSuiteOutput output;

    @Valid
    private List<@Valid PullRequestMinimal> pullRequests = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt;

    /**
     * The phase of the lifecycle that the check is currently in.
     */
    public enum StatusEnum {
        QUEUED("queued"),

        IN_PROGRESS("in_progress"),

        COMPLETED("completed"),

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

    private String url;

    public CheckRunWithSimpleCheckSuite() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckRunWithSimpleCheckSuite(
            Integration app,
            SimpleCheckSuite checkSuite,
            OffsetDateTime completedAt,
            ConclusionEnum conclusion,
            String detailsUrl,
            String externalId,
            String headSha,
            String htmlUrl,
            Long id,
            String name,
            String nodeId,
            CheckRunWithSimpleCheckSuiteOutput output,
            List<@Valid PullRequestMinimal> pullRequests,
            OffsetDateTime startedAt,
            StatusEnum status,
            String url) {
        this.app = app;
        this.checkSuite = checkSuite;
        this.completedAt = completedAt;
        this.conclusion = conclusion;
        this.detailsUrl = detailsUrl;
        this.externalId = externalId;
        this.headSha = headSha;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.output = output;
        this.pullRequests = pullRequests;
        this.startedAt = startedAt;
        this.status = status;
        this.url = url;
    }

    public CheckRunWithSimpleCheckSuite app(Integration app) {
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
    public Integration getApp() {
        return app;
    }

    public void setApp(Integration app) {
        this.app = app;
    }

    public CheckRunWithSimpleCheckSuite checkSuite(SimpleCheckSuite checkSuite) {
        this.checkSuite = checkSuite;
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
    public SimpleCheckSuite getCheckSuite() {
        return checkSuite;
    }

    public void setCheckSuite(SimpleCheckSuite checkSuite) {
        this.checkSuite = checkSuite;
    }

    public CheckRunWithSimpleCheckSuite completedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
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
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public CheckRunWithSimpleCheckSuite conclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    /**
     * Get conclusion
     * @return conclusion
     */
    @NotNull
    @Schema(name = "conclusion", example = "neutral", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public ConclusionEnum getConclusion() {
        return conclusion;
    }

    public void setConclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
    }

    public CheckRunWithSimpleCheckSuite deployment(DeploymentSimple deployment) {
        this.deployment = deployment;
        return this;
    }

    /**
     * Get deployment
     * @return deployment
     */
    @Valid
    @Schema(name = "deployment", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment")
    public DeploymentSimple getDeployment() {
        return deployment;
    }

    public void setDeployment(DeploymentSimple deployment) {
        this.deployment = deployment;
    }

    public CheckRunWithSimpleCheckSuite detailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
        return this;
    }

    /**
     * Get detailsUrl
     * @return detailsUrl
     */
    @NotNull
    @Schema(name = "details_url", example = "https://example.com", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("details_url")
    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public CheckRunWithSimpleCheckSuite externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Get externalId
     * @return externalId
     */
    @NotNull
    @Schema(name = "external_id", example = "42", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public CheckRunWithSimpleCheckSuite headSha(String headSha) {
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

    public CheckRunWithSimpleCheckSuite htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
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
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public CheckRunWithSimpleCheckSuite id(Long id) {
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

    public CheckRunWithSimpleCheckSuite name(String name) {
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

    public CheckRunWithSimpleCheckSuite nodeId(String nodeId) {
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

    public CheckRunWithSimpleCheckSuite output(CheckRunWithSimpleCheckSuiteOutput output) {
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
    public CheckRunWithSimpleCheckSuiteOutput getOutput() {
        return output;
    }

    public void setOutput(CheckRunWithSimpleCheckSuiteOutput output) {
        this.output = output;
    }

    public CheckRunWithSimpleCheckSuite pullRequests(List<@Valid PullRequestMinimal> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public CheckRunWithSimpleCheckSuite addPullRequestsItem(PullRequestMinimal pullRequestsItem) {
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
    public List<@Valid PullRequestMinimal> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<@Valid PullRequestMinimal> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public CheckRunWithSimpleCheckSuite startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
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
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public CheckRunWithSimpleCheckSuite status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The phase of the lifecycle that the check is currently in.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            example = "queued",
            description = "The phase of the lifecycle that the check is currently in.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public CheckRunWithSimpleCheckSuite url(String url) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckRunWithSimpleCheckSuite checkRunWithSimpleCheckSuite = (CheckRunWithSimpleCheckSuite) o;
        return Objects.equals(this.app, checkRunWithSimpleCheckSuite.app)
                && Objects.equals(this.checkSuite, checkRunWithSimpleCheckSuite.checkSuite)
                && Objects.equals(this.completedAt, checkRunWithSimpleCheckSuite.completedAt)
                && Objects.equals(this.conclusion, checkRunWithSimpleCheckSuite.conclusion)
                && Objects.equals(this.deployment, checkRunWithSimpleCheckSuite.deployment)
                && Objects.equals(this.detailsUrl, checkRunWithSimpleCheckSuite.detailsUrl)
                && Objects.equals(this.externalId, checkRunWithSimpleCheckSuite.externalId)
                && Objects.equals(this.headSha, checkRunWithSimpleCheckSuite.headSha)
                && Objects.equals(this.htmlUrl, checkRunWithSimpleCheckSuite.htmlUrl)
                && Objects.equals(this.id, checkRunWithSimpleCheckSuite.id)
                && Objects.equals(this.name, checkRunWithSimpleCheckSuite.name)
                && Objects.equals(this.nodeId, checkRunWithSimpleCheckSuite.nodeId)
                && Objects.equals(this.output, checkRunWithSimpleCheckSuite.output)
                && Objects.equals(this.pullRequests, checkRunWithSimpleCheckSuite.pullRequests)
                && Objects.equals(this.startedAt, checkRunWithSimpleCheckSuite.startedAt)
                && Objects.equals(this.status, checkRunWithSimpleCheckSuite.status)
                && Objects.equals(this.url, checkRunWithSimpleCheckSuite.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                app,
                checkSuite,
                completedAt,
                conclusion,
                deployment,
                detailsUrl,
                externalId,
                headSha,
                htmlUrl,
                id,
                name,
                nodeId,
                output,
                pullRequests,
                startedAt,
                status,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckRunWithSimpleCheckSuite {\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    checkSuite: ").append(toIndentedString(checkSuite)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    deployment: ").append(toIndentedString(deployment)).append("\n");
        sb.append("    detailsUrl: ").append(toIndentedString(detailsUrl)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
