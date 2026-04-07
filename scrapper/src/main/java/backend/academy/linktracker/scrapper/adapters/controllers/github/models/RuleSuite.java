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
 * Response
 */
@Schema(name = "rule-suite", description = "Response")
@JsonTypeName("rule-suite")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuite {

    private Optional<Long> id = Optional.empty();

    private JsonNullable<Long> actorId = JsonNullable.<Long>undefined();

    private JsonNullable<String> actorName = JsonNullable.<String>undefined();

    private Optional<String> beforeSha = Optional.empty();

    private Optional<String> afterSha = Optional.empty();

    private Optional<String> ref = Optional.empty();

    private Optional<Long> repositoryId = Optional.empty();

    private Optional<String> repositoryName = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> pushedAt = Optional.empty();

    /**
     * The result of the rule evaluations for rules with the `active` enforcement status.
     */
    public enum ResultEnum {
        PASS("pass"),

        FAIL("fail"),

        BYPASS("bypass");

        private final String value;

        ResultEnum(String value) {
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
        public static ResultEnum fromValue(String value) {
            for (ResultEnum b : ResultEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<ResultEnum> result = Optional.empty();

    /**
     * The result of the rule evaluations for rules with the `active` and `evaluate` enforcement statuses, demonstrating whether rules would pass or fail if all rules in the rule suite were `active`. Null if no rules with `evaluate` enforcement status were run.
     */
    public enum EvaluationResultEnum {
        PASS("pass"),

        FAIL("fail"),

        BYPASS("bypass");

        private final String value;

        EvaluationResultEnum(String value) {
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
        public static EvaluationResultEnum fromValue(String value) {
            for (EvaluationResultEnum b : EvaluationResultEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private JsonNullable<EvaluationResultEnum> evaluationResult = JsonNullable.<EvaluationResultEnum>undefined();

    @Valid
    private List<@Valid RuleSuiteRuleEvaluationsInner> ruleEvaluations = new ArrayList<>();

    public RuleSuite id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier of the rule insight.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the rule insight.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public RuleSuite actorId(Long actorId) {
        this.actorId = JsonNullable.of(actorId);
        return this;
    }

    /**
     * The number that identifies the user.
     * @return actorId
     */
    @Schema(
            name = "actor_id",
            description = "The number that identifies the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor_id")
    public JsonNullable<Long> getActorId() {
        return actorId;
    }

    public void setActorId(JsonNullable<Long> actorId) {
        this.actorId = actorId;
    }

    public RuleSuite actorName(String actorName) {
        this.actorName = JsonNullable.of(actorName);
        return this;
    }

    /**
     * The handle for the GitHub user account.
     * @return actorName
     */
    @Schema(
            name = "actor_name",
            description = "The handle for the GitHub user account.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor_name")
    public JsonNullable<String> getActorName() {
        return actorName;
    }

    public void setActorName(JsonNullable<String> actorName) {
        this.actorName = actorName;
    }

    public RuleSuite beforeSha(String beforeSha) {
        this.beforeSha = Optional.ofNullable(beforeSha);
        return this;
    }

    /**
     * The previous commit SHA of the ref.
     * @return beforeSha
     */
    @Schema(
            name = "before_sha",
            description = "The previous commit SHA of the ref.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("before_sha")
    public Optional<String> getBeforeSha() {
        return beforeSha;
    }

    public void setBeforeSha(Optional<String> beforeSha) {
        this.beforeSha = beforeSha;
    }

    public RuleSuite afterSha(String afterSha) {
        this.afterSha = Optional.ofNullable(afterSha);
        return this;
    }

    /**
     * The new commit SHA of the ref.
     * @return afterSha
     */
    @Schema(
            name = "after_sha",
            description = "The new commit SHA of the ref.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("after_sha")
    public Optional<String> getAfterSha() {
        return afterSha;
    }

    public void setAfterSha(Optional<String> afterSha) {
        this.afterSha = afterSha;
    }

    public RuleSuite ref(String ref) {
        this.ref = Optional.ofNullable(ref);
        return this;
    }

    /**
     * The ref name that the evaluation ran on.
     * @return ref
     */
    @Schema(
            name = "ref",
            description = "The ref name that the evaluation ran on.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ref")
    public Optional<String> getRef() {
        return ref;
    }

    public void setRef(Optional<String> ref) {
        this.ref = ref;
    }

    public RuleSuite repositoryId(Long repositoryId) {
        this.repositoryId = Optional.ofNullable(repositoryId);
        return this;
    }

    /**
     * The ID of the repository associated with the rule evaluation.
     * @return repositoryId
     */
    @Schema(
            name = "repository_id",
            description = "The ID of the repository associated with the rule evaluation.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_id")
    public Optional<Long> getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Optional<Long> repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RuleSuite repositoryName(String repositoryName) {
        this.repositoryName = Optional.ofNullable(repositoryName);
        return this;
    }

    /**
     * The name of the repository without the `.git` extension.
     * @return repositoryName
     */
    @Schema(
            name = "repository_name",
            description = "The name of the repository without the `.git` extension.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository_name")
    public Optional<String> getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(Optional<String> repositoryName) {
        this.repositoryName = repositoryName;
    }

    public RuleSuite pushedAt(OffsetDateTime pushedAt) {
        this.pushedAt = Optional.ofNullable(pushedAt);
        return this;
    }

    /**
     * Get pushedAt
     * @return pushedAt
     */
    @Valid
    @Schema(name = "pushed_at", example = "2011-01-26T19:06:43Z", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("pushed_at")
    public Optional<OffsetDateTime> getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(Optional<OffsetDateTime> pushedAt) {
        this.pushedAt = pushedAt;
    }

    public RuleSuite result(ResultEnum result) {
        this.result = Optional.ofNullable(result);
        return this;
    }

    /**
     * The result of the rule evaluations for rules with the `active` enforcement status.
     * @return result
     */
    @Schema(
            name = "result",
            description = "The result of the rule evaluations for rules with the `active` enforcement status.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("result")
    public Optional<ResultEnum> getResult() {
        return result;
    }

    public void setResult(Optional<ResultEnum> result) {
        this.result = result;
    }

    public RuleSuite evaluationResult(EvaluationResultEnum evaluationResult) {
        this.evaluationResult = JsonNullable.of(evaluationResult);
        return this;
    }

    /**
     * The result of the rule evaluations for rules with the `active` and `evaluate` enforcement statuses, demonstrating whether rules would pass or fail if all rules in the rule suite were `active`. Null if no rules with `evaluate` enforcement status were run.
     * @return evaluationResult
     */
    @Schema(
            name = "evaluation_result",
            description =
                    "The result of the rule evaluations for rules with the `active` and `evaluate` enforcement statuses, demonstrating whether rules would pass or fail if all rules in the rule suite were `active`. Null if no rules with `evaluate` enforcement status were run.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("evaluation_result")
    public JsonNullable<EvaluationResultEnum> getEvaluationResult() {
        return evaluationResult;
    }

    public void setEvaluationResult(JsonNullable<EvaluationResultEnum> evaluationResult) {
        this.evaluationResult = evaluationResult;
    }

    public RuleSuite ruleEvaluations(List<@Valid RuleSuiteRuleEvaluationsInner> ruleEvaluations) {
        this.ruleEvaluations = ruleEvaluations;
        return this;
    }

    public RuleSuite addRuleEvaluationsItem(RuleSuiteRuleEvaluationsInner ruleEvaluationsItem) {
        if (this.ruleEvaluations == null) {
            this.ruleEvaluations = new ArrayList<>();
        }
        this.ruleEvaluations.add(ruleEvaluationsItem);
        return this;
    }

    /**
     * Details on the evaluated rules.
     * @return ruleEvaluations
     */
    @Valid
    @Schema(
            name = "rule_evaluations",
            description = "Details on the evaluated rules.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rule_evaluations")
    public List<@Valid RuleSuiteRuleEvaluationsInner> getRuleEvaluations() {
        return ruleEvaluations;
    }

    public void setRuleEvaluations(List<@Valid RuleSuiteRuleEvaluationsInner> ruleEvaluations) {
        this.ruleEvaluations = ruleEvaluations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleSuite ruleSuite = (RuleSuite) o;
        return Objects.equals(this.id, ruleSuite.id)
                && equalsNullable(this.actorId, ruleSuite.actorId)
                && equalsNullable(this.actorName, ruleSuite.actorName)
                && Objects.equals(this.beforeSha, ruleSuite.beforeSha)
                && Objects.equals(this.afterSha, ruleSuite.afterSha)
                && Objects.equals(this.ref, ruleSuite.ref)
                && Objects.equals(this.repositoryId, ruleSuite.repositoryId)
                && Objects.equals(this.repositoryName, ruleSuite.repositoryName)
                && Objects.equals(this.pushedAt, ruleSuite.pushedAt)
                && Objects.equals(this.result, ruleSuite.result)
                && equalsNullable(this.evaluationResult, ruleSuite.evaluationResult)
                && Objects.equals(this.ruleEvaluations, ruleSuite.ruleEvaluations);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                hashCodeNullable(actorId),
                hashCodeNullable(actorName),
                beforeSha,
                afterSha,
                ref,
                repositoryId,
                repositoryName,
                pushedAt,
                result,
                hashCodeNullable(evaluationResult),
                ruleEvaluations);
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
        sb.append("class RuleSuite {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
        sb.append("    actorName: ").append(toIndentedString(actorName)).append("\n");
        sb.append("    beforeSha: ").append(toIndentedString(beforeSha)).append("\n");
        sb.append("    afterSha: ").append(toIndentedString(afterSha)).append("\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    repositoryName: ")
                .append(toIndentedString(repositoryName))
                .append("\n");
        sb.append("    pushedAt: ").append(toIndentedString(pushedAt)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    evaluationResult: ")
                .append(toIndentedString(evaluationResult))
                .append("\n");
        sb.append("    ruleEvaluations: ")
                .append(toIndentedString(ruleEvaluations))
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
