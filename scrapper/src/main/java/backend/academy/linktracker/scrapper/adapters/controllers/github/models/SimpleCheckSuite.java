package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A suite of checks performed on the code of a given code change
 */
@Schema(name = "simple-check-suite", description = "A suite of checks performed on the code of a given code change")
@JsonTypeName("simple-check-suite")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleCheckSuite {

    private JsonNullable<String> after = JsonNullable.<String>undefined();

    private JsonNullable<Integration> app = JsonNullable.<Integration>undefined();

    private JsonNullable<String> before = JsonNullable.<String>undefined();

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

        STALE("stale"),

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
    private Optional<OffsetDateTime> createdAt = Optional.empty();

    private JsonNullable<String> headBranch = JsonNullable.<String>undefined();

    private Optional<String> headSha = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    @Valid
    private List<@Valid PullRequestMinimal> pullRequests = new ArrayList<>();

    private Optional<MinimalRepository> repository = Optional.empty();

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        QUEUED("queued"),

        IN_PROGRESS("in_progress"),

        COMPLETED("completed"),

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

    private Optional<StatusEnum> status = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> updatedAt = Optional.empty();

    private Optional<String> url = Optional.empty();

    public SimpleCheckSuite after(String after) {
        this.after = JsonNullable.of(after);
        return this;
    }

    /**
     * Get after
     * @return after
     */
    @Schema(
            name = "after",
            example = "d6fde92930d4715a2b49857d24b940956b26d2d3",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("after")
    public JsonNullable<String> getAfter() {
        return after;
    }

    public void setAfter(JsonNullable<String> after) {
        this.after = after;
    }

    public SimpleCheckSuite app(Integration app) {
        this.app = JsonNullable.of(app);
        return this;
    }

    /**
     * Get app
     * @return app
     */
    @Valid
    @Schema(name = "app", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("app")
    public JsonNullable<Integration> getApp() {
        return app;
    }

    public void setApp(JsonNullable<Integration> app) {
        this.app = app;
    }

    public SimpleCheckSuite before(String before) {
        this.before = JsonNullable.of(before);
        return this;
    }

    /**
     * Get before
     * @return before
     */
    @Schema(
            name = "before",
            example = "146e867f55c26428e5f9fade55a9bbf5e95a7912",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("before")
    public JsonNullable<String> getBefore() {
        return before;
    }

    public void setBefore(JsonNullable<String> before) {
        this.before = before;
    }

    public SimpleCheckSuite conclusion(ConclusionEnum conclusion) {
        this.conclusion = JsonNullable.of(conclusion);
        return this;
    }

    /**
     * Get conclusion
     * @return conclusion
     */
    @Schema(name = "conclusion", example = "neutral", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("conclusion")
    public JsonNullable<ConclusionEnum> getConclusion() {
        return conclusion;
    }

    public void setConclusion(JsonNullable<ConclusionEnum> conclusion) {
        this.conclusion = conclusion;
    }

    public SimpleCheckSuite createdAt(OffsetDateTime createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public SimpleCheckSuite headBranch(String headBranch) {
        this.headBranch = JsonNullable.of(headBranch);
        return this;
    }

    /**
     * Get headBranch
     * @return headBranch
     */
    @Schema(name = "head_branch", example = "master", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_branch")
    public JsonNullable<String> getHeadBranch() {
        return headBranch;
    }

    public void setHeadBranch(JsonNullable<String> headBranch) {
        this.headBranch = headBranch;
    }

    public SimpleCheckSuite headSha(String headSha) {
        this.headSha = Optional.ofNullable(headSha);
        return this;
    }

    /**
     * The SHA of the head commit that is being checked.
     * @return headSha
     */
    @Schema(
            name = "head_sha",
            example = "009b8a3a9ccbb128af87f9b1c0f4c62e8a304f6d",
            description = "The SHA of the head commit that is being checked.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("head_sha")
    public Optional<String> getHeadSha() {
        return headSha;
    }

    public void setHeadSha(Optional<String> headSha) {
        this.headSha = headSha;
    }

    public SimpleCheckSuite id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", example = "5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public SimpleCheckSuite nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", example = "MDEwOkNoZWNrU3VpdGU1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public SimpleCheckSuite pullRequests(List<@Valid PullRequestMinimal> pullRequests) {
        this.pullRequests = pullRequests;
        return this;
    }

    public SimpleCheckSuite addPullRequestsItem(PullRequestMinimal pullRequestsItem) {
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
    @Valid
    @Schema(name = "pull_requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pull_requests")
    public List<@Valid PullRequestMinimal> getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(List<@Valid PullRequestMinimal> pullRequests) {
        this.pullRequests = pullRequests;
    }

    public SimpleCheckSuite repository(MinimalRepository repository) {
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
    public Optional<MinimalRepository> getRepository() {
        return repository;
    }

    public void setRepository(Optional<MinimalRepository> repository) {
        this.repository = repository;
    }

    public SimpleCheckSuite status(StatusEnum status) {
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Schema(name = "status", example = "completed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public Optional<StatusEnum> getStatus() {
        return status;
    }

    public void setStatus(Optional<StatusEnum> status) {
        this.status = status;
    }

    public SimpleCheckSuite updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public SimpleCheckSuite url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(
            name = "url",
            example = "https://api.github.com/repos/github/hello-world/check-suites/5",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
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
        SimpleCheckSuite simpleCheckSuite = (SimpleCheckSuite) o;
        return equalsNullable(this.after, simpleCheckSuite.after)
                && equalsNullable(this.app, simpleCheckSuite.app)
                && equalsNullable(this.before, simpleCheckSuite.before)
                && equalsNullable(this.conclusion, simpleCheckSuite.conclusion)
                && Objects.equals(this.createdAt, simpleCheckSuite.createdAt)
                && equalsNullable(this.headBranch, simpleCheckSuite.headBranch)
                && Objects.equals(this.headSha, simpleCheckSuite.headSha)
                && Objects.equals(this.id, simpleCheckSuite.id)
                && Objects.equals(this.nodeId, simpleCheckSuite.nodeId)
                && Objects.equals(this.pullRequests, simpleCheckSuite.pullRequests)
                && Objects.equals(this.repository, simpleCheckSuite.repository)
                && Objects.equals(this.status, simpleCheckSuite.status)
                && Objects.equals(this.updatedAt, simpleCheckSuite.updatedAt)
                && Objects.equals(this.url, simpleCheckSuite.url);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(after),
                hashCodeNullable(app),
                hashCodeNullable(before),
                hashCodeNullable(conclusion),
                createdAt,
                hashCodeNullable(headBranch),
                headSha,
                id,
                nodeId,
                pullRequests,
                repository,
                status,
                updatedAt,
                url);
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
        sb.append("class SimpleCheckSuite {\n");
        sb.append("    after: ").append(toIndentedString(after)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    before: ").append(toIndentedString(before)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    headBranch: ").append(toIndentedString(headBranch)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    pullRequests: ").append(toIndentedString(pullRequests)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
