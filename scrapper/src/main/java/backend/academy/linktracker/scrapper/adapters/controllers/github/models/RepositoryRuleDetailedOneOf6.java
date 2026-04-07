package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * RepositoryRuleDetailedOneOf6
 */
@JsonTypeName("repository_rule_detailed_oneOf_6")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleDetailedOneOf6 implements RepositoryRuleDetailed {

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        REQUIRED_SIGNATURES("required_signatures");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    /**
     * The type of source for the ruleset that includes this rule.
     */
    public enum RulesetSourceTypeEnum {
        REPOSITORY("Repository"),

        ORGANIZATION("Organization");

        private final String value;

        RulesetSourceTypeEnum(String value) {
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
        public static RulesetSourceTypeEnum fromValue(String value) {
            for (RulesetSourceTypeEnum b : RulesetSourceTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<RulesetSourceTypeEnum> rulesetSourceType = Optional.empty();

    private Optional<String> rulesetSource = Optional.empty();

    private Optional<Long> rulesetId = Optional.empty();

    public RepositoryRuleDetailedOneOf6() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleDetailedOneOf6(TypeEnum type) {
        this.type = type;
    }

    public RepositoryRuleDetailedOneOf6 type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RepositoryRuleDetailedOneOf6 rulesetSourceType(RulesetSourceTypeEnum rulesetSourceType) {
        this.rulesetSourceType = Optional.ofNullable(rulesetSourceType);
        return this;
    }

    /**
     * The type of source for the ruleset that includes this rule.
     * @return rulesetSourceType
     */
    @Schema(
            name = "ruleset_source_type",
            description = "The type of source for the ruleset that includes this rule.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ruleset_source_type")
    public Optional<RulesetSourceTypeEnum> getRulesetSourceType() {
        return rulesetSourceType;
    }

    public void setRulesetSourceType(Optional<RulesetSourceTypeEnum> rulesetSourceType) {
        this.rulesetSourceType = rulesetSourceType;
    }

    public RepositoryRuleDetailedOneOf6 rulesetSource(String rulesetSource) {
        this.rulesetSource = Optional.ofNullable(rulesetSource);
        return this;
    }

    /**
     * The name of the source of the ruleset that includes this rule.
     * @return rulesetSource
     */
    @Schema(
            name = "ruleset_source",
            description = "The name of the source of the ruleset that includes this rule.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ruleset_source")
    public Optional<String> getRulesetSource() {
        return rulesetSource;
    }

    public void setRulesetSource(Optional<String> rulesetSource) {
        this.rulesetSource = rulesetSource;
    }

    public RepositoryRuleDetailedOneOf6 rulesetId(Long rulesetId) {
        this.rulesetId = Optional.ofNullable(rulesetId);
        return this;
    }

    /**
     * The ID of the ruleset that includes this rule.
     * @return rulesetId
     */
    @Schema(
            name = "ruleset_id",
            description = "The ID of the ruleset that includes this rule.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ruleset_id")
    public Optional<Long> getRulesetId() {
        return rulesetId;
    }

    public void setRulesetId(Optional<Long> rulesetId) {
        this.rulesetId = rulesetId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleDetailedOneOf6 repositoryRuleDetailedOneOf6 = (RepositoryRuleDetailedOneOf6) o;
        return Objects.equals(this.type, repositoryRuleDetailedOneOf6.type)
                && Objects.equals(this.rulesetSourceType, repositoryRuleDetailedOneOf6.rulesetSourceType)
                && Objects.equals(this.rulesetSource, repositoryRuleDetailedOneOf6.rulesetSource)
                && Objects.equals(this.rulesetId, repositoryRuleDetailedOneOf6.rulesetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, rulesetSourceType, rulesetSource, rulesetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleDetailedOneOf6 {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    rulesetSourceType: ")
                .append(toIndentedString(rulesetSourceType))
                .append("\n");
        sb.append("    rulesetSource: ").append(toIndentedString(rulesetSource)).append("\n");
        sb.append("    rulesetId: ").append(toIndentedString(rulesetId)).append("\n");
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
