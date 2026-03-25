package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * RepositoryRuleCommitMessagePatternParameters
 */
@JsonTypeName("repository_rule_commit_message_pattern_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleCommitMessagePatternParameters {

    private String name;

    private Boolean negate;

    /**
     * The operator to use for matching.
     */
    public enum OperatorEnum {
        STARTS_WITH("starts_with"),

        ENDS_WITH("ends_with"),

        CONTAINS("contains"),

        REGEX("regex");

        private final String value;

        OperatorEnum(String value) {
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
        public static OperatorEnum fromValue(String value) {
            for (OperatorEnum b : OperatorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private OperatorEnum operator;

    private String pattern;

    public RepositoryRuleCommitMessagePatternParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleCommitMessagePatternParameters(OperatorEnum operator, String pattern) {
        this.operator = operator;
        this.pattern = pattern;
    }

    public RepositoryRuleCommitMessagePatternParameters name(String name) {
        this.name = name;
        return this;
    }

    /**
     * How this rule appears when configuring it.
     * @return name
     */
    @Schema(
            name = "name",
            description = "How this rule appears when configuring it.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryRuleCommitMessagePatternParameters negate(Boolean negate) {
        this.negate = negate;
        return this;
    }

    /**
     * If true, the rule will fail if the pattern matches.
     * @return negate
     */
    @Schema(
            name = "negate",
            description = "If true, the rule will fail if the pattern matches.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("negate")
    public Boolean getNegate() {
        return negate;
    }

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    public RepositoryRuleCommitMessagePatternParameters operator(OperatorEnum operator) {
        this.operator = operator;
        return this;
    }

    /**
     * The operator to use for matching.
     * @return operator
     */
    @NotNull
    @Schema(
            name = "operator",
            description = "The operator to use for matching.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("operator")
    public OperatorEnum getOperator() {
        return operator;
    }

    public void setOperator(OperatorEnum operator) {
        this.operator = operator;
    }

    public RepositoryRuleCommitMessagePatternParameters pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * The pattern to match with.
     * @return pattern
     */
    @NotNull
    @Schema(name = "pattern", description = "The pattern to match with.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pattern")
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleCommitMessagePatternParameters repositoryRuleCommitMessagePatternParameters =
                (RepositoryRuleCommitMessagePatternParameters) o;
        return Objects.equals(this.name, repositoryRuleCommitMessagePatternParameters.name)
                && Objects.equals(this.negate, repositoryRuleCommitMessagePatternParameters.negate)
                && Objects.equals(this.operator, repositoryRuleCommitMessagePatternParameters.operator)
                && Objects.equals(this.pattern, repositoryRuleCommitMessagePatternParameters.pattern);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, negate, operator, pattern);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleCommitMessagePatternParameters {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    negate: ").append(toIndentedString(negate)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
