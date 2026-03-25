package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * RuleSuiteRuleEvaluationsInner
 */
@JsonTypeName("rule_suite_rule_evaluations_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuiteRuleEvaluationsInner {

    private RuleSuiteRuleEvaluationsInnerRuleSource ruleSource;

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

    private EnforcementEnum enforcement;

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

    private ResultEnum result;

    private String ruleType;

    private String details = null;

    public RuleSuiteRuleEvaluationsInner ruleSource(RuleSuiteRuleEvaluationsInnerRuleSource ruleSource) {
        this.ruleSource = ruleSource;
        return this;
    }

    /**
     * Get ruleSource
     * @return ruleSource
     */
    @Valid
    @Schema(name = "rule_source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rule_source")
    public RuleSuiteRuleEvaluationsInnerRuleSource getRuleSource() {
        return ruleSource;
    }

    public void setRuleSource(RuleSuiteRuleEvaluationsInnerRuleSource ruleSource) {
        this.ruleSource = ruleSource;
    }

    public RuleSuiteRuleEvaluationsInner enforcement(EnforcementEnum enforcement) {
        this.enforcement = enforcement;
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
    public EnforcementEnum getEnforcement() {
        return enforcement;
    }

    public void setEnforcement(EnforcementEnum enforcement) {
        this.enforcement = enforcement;
    }

    public RuleSuiteRuleEvaluationsInner result(ResultEnum result) {
        this.result = result;
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
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public RuleSuiteRuleEvaluationsInner ruleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * The type of rule.
     * @return ruleType
     */
    @Schema(name = "rule_type", description = "The type of rule.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rule_type")
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public RuleSuiteRuleEvaluationsInner details(String details) {
        this.details = details;
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
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
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
                && Objects.equals(this.details, ruleSuiteRuleEvaluationsInner.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleSource, enforcement, result, ruleType, details);
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
