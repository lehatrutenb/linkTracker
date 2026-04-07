package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * User-defined metadata to store domain-specific information limited to 8 keys with scalar values.
 */
@Schema(
        name = "repository-rule-ruleset-info",
        description =
                "User-defined metadata to store domain-specific information limited to 8 keys with scalar values.")
@JsonTypeName("repository-rule-ruleset-info")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleRulesetInfo {

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

    public RepositoryRuleRulesetInfo rulesetSourceType(RulesetSourceTypeEnum rulesetSourceType) {
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

    public RepositoryRuleRulesetInfo rulesetSource(String rulesetSource) {
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

    public RepositoryRuleRulesetInfo rulesetId(Long rulesetId) {
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
        RepositoryRuleRulesetInfo repositoryRuleRulesetInfo = (RepositoryRuleRulesetInfo) o;
        return Objects.equals(this.rulesetSourceType, repositoryRuleRulesetInfo.rulesetSourceType)
                && Objects.equals(this.rulesetSource, repositoryRuleRulesetInfo.rulesetSource)
                && Objects.equals(this.rulesetId, repositoryRuleRulesetInfo.rulesetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rulesetSourceType, rulesetSource, rulesetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleRulesetInfo {\n");
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
