package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RuleSuiteRuleEvaluationsInner
 */
@JsonTypeName("rule_suite_rule_evaluations_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuiteRuleEvaluationsInner {

    private Optional<RuleSuiteRuleEvaluationsInnerRuleSource> ruleSource = Optional.empty();

    /**
     * The enforcement level of this rule source.
     */
    public enum EnforcementEnum {
        ACTIVE("active"),

        EVALUATE("evaluate"),

        DELETED_RULESET("deleted ruleset");

        private final String value;

        EnforcementEnum(String value) {
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
        public static EnforcementEnum fromValue(String value) {
            for (EnforcementEnum b : EnforcementEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<EnforcementEnum> enforcement = Optional.empty();

    /**
     * The result of the evaluation of the individual rule.
     */
    public enum ResultEnum {
        PASS("pass"),

        FAIL("fail");

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

    private Optional<String> ruleType = Optional.empty();

    private JsonNullable<String> details = JsonNullable.<String>undefined();

    public RuleSuiteRuleEvaluationsInner ruleSource(RuleSuiteRuleEvaluationsInnerRuleSource ruleSource) {
        this.ruleSource = Optional.ofNullable(ruleSource);
        return this;
    }

    /**
     * Get ruleSource
     * @return ruleSource
     */
    @Valid
    @Schema(name = "rule_source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rule_source")
    public Optional<RuleSuiteRuleEvaluationsInnerRuleSource> getRuleSource() {
        return ruleSource;
    }

    public void setRuleSource(Optional<RuleSuiteRuleEvaluationsInnerRuleSource> ruleSource) {
        this.ruleSource = ruleSource;
    }

    public RuleSuiteRuleEvaluationsInner enforcement(EnforcementEnum enforcement) {
        this.enforcement = Optional.ofNullable(enforcement);
        return this;
    }

    /**
     * The enforcement level of this rule source.
     * @return enforcement
     */
    @Schema(
            name = "enforcement",
            description = "The enforcement level of this rule source.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforcement")
    public Optional<EnforcementEnum> getEnforcement() {
        return enforcement;
    }

    public void setEnforcement(Optional<EnforcementEnum> enforcement) {
        this.enforcement = enforcement;
    }

    public RuleSuiteRuleEvaluationsInner result(ResultEnum result) {
        this.result = Optional.ofNullable(result);
        return this;
    }

    /**
     * The result of the evaluation of the individual rule.
     * @return result
     */
    @Schema(
            name = "result",
            description = "The result of the evaluation of the individual rule.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("result")
    public Optional<ResultEnum> getResult() {
        return result;
    }

    public void setResult(Optional<ResultEnum> result) {
        this.result = result;
    }

    public RuleSuiteRuleEvaluationsInner ruleType(String ruleType) {
        this.ruleType = Optional.ofNullable(ruleType);
        return this;
    }

    /**
     * The type of rule.
     * @return ruleType
     */
    @Schema(name = "rule_type", description = "The type of rule.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rule_type")
    public Optional<String> getRuleType() {
        return ruleType;
    }

    public void setRuleType(Optional<String> ruleType) {
        this.ruleType = ruleType;
    }

    public RuleSuiteRuleEvaluationsInner details(String details) {
        this.details = JsonNullable.of(details);
        return this;
    }

    /**
     * The detailed failure message for the rule. Null if the rule passed.
     * @return details
     */
    @Schema(
            name = "details",
            description = "The detailed failure message for the rule. Null if the rule passed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("details")
    public JsonNullable<String> getDetails() {
        return details;
    }

    public void setDetails(JsonNullable<String> details) {
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleSuiteRuleEvaluationsInner ruleSuiteRuleEvaluationsInner = (RuleSuiteRuleEvaluationsInner) o;
        return Objects.equals(this.ruleSource, ruleSuiteRuleEvaluationsInner.ruleSource)
                && Objects.equals(this.enforcement, ruleSuiteRuleEvaluationsInner.enforcement)
                && Objects.equals(this.result, ruleSuiteRuleEvaluationsInner.result)
                && Objects.equals(this.ruleType, ruleSuiteRuleEvaluationsInner.ruleType)
                && equalsNullable(this.details, ruleSuiteRuleEvaluationsInner.details);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleSource, enforcement, result, ruleType, hashCodeNullable(details));
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
        sb.append("class RuleSuiteRuleEvaluationsInner {\n");
        sb.append("    ruleSource: ").append(toIndentedString(ruleSource)).append("\n");
        sb.append("    enforcement: ").append(toIndentedString(enforcement)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
