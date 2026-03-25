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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ReposUpdateRepoRulesetRequest
 */
@JsonTypeName("repos_update_repo_ruleset_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateRepoRulesetRequest {

    private String name;

    /**
     * The target of the ruleset
     */
    public enum TargetEnum {
        BRANCH("branch"),

        TAG("tag"),

        PUSH("push");

        private final String value;

        TargetEnum(String value) {
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
        public static TargetEnum fromValue(String value) {
            for (TargetEnum b : TargetEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TargetEnum target;

    private RepositoryRuleEnforcement enforcement;

    @Valid
    private List<@Valid RepositoryRulesetBypassActor> bypassActors = new ArrayList<>();

    private RepositoryRulesetConditions conditions;

    @Valid
    private List<@Valid RepositoryRule> rules = new ArrayList<>();

    public ReposUpdateRepoRulesetRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the ruleset.
     * @return name
     */
    @Schema(name = "name", description = "The name of the ruleset.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReposUpdateRepoRulesetRequest target(TargetEnum target) {
        this.target = target;
        return this;
    }

    /**
     * The target of the ruleset
     * @return target
     */
    @Schema(name = "target", description = "The target of the ruleset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target")
    public TargetEnum getTarget() {
        return target;
    }

    public void setTarget(TargetEnum target) {
        this.target = target;
    }

    public ReposUpdateRepoRulesetRequest enforcement(RepositoryRuleEnforcement enforcement) {
        this.enforcement = enforcement;
        return this;
    }

    /**
     * Get enforcement
     * @return enforcement
     */
    @Valid
    @Schema(name = "enforcement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enforcement")
    public RepositoryRuleEnforcement getEnforcement() {
        return enforcement;
    }

    public void setEnforcement(RepositoryRuleEnforcement enforcement) {
        this.enforcement = enforcement;
    }

    public ReposUpdateRepoRulesetRequest bypassActors(List<@Valid RepositoryRulesetBypassActor> bypassActors) {
        this.bypassActors = bypassActors;
        return this;
    }

    public ReposUpdateRepoRulesetRequest addBypassActorsItem(RepositoryRulesetBypassActor bypassActorsItem) {
        if (this.bypassActors == null) {
            this.bypassActors = new ArrayList<>();
        }
        this.bypassActors.add(bypassActorsItem);
        return this;
    }

    /**
     * The actors that can bypass the rules in this ruleset
     * @return bypassActors
     */
    @Valid
    @Schema(
            name = "bypass_actors",
            description = "The actors that can bypass the rules in this ruleset",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bypass_actors")
    public List<@Valid RepositoryRulesetBypassActor> getBypassActors() {
        return bypassActors;
    }

    public void setBypassActors(List<@Valid RepositoryRulesetBypassActor> bypassActors) {
        this.bypassActors = bypassActors;
    }

    public ReposUpdateRepoRulesetRequest conditions(RepositoryRulesetConditions conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get conditions
     * @return conditions
     */
    @Valid
    @Schema(name = "conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("conditions")
    public RepositoryRulesetConditions getConditions() {
        return conditions;
    }

    public void setConditions(RepositoryRulesetConditions conditions) {
        this.conditions = conditions;
    }

    public ReposUpdateRepoRulesetRequest rules(List<@Valid RepositoryRule> rules) {
        this.rules = rules;
        return this;
    }

    public ReposUpdateRepoRulesetRequest addRulesItem(RepositoryRule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    /**
     * An array of rules within the ruleset.
     * @return rules
     */
    @Valid
    @Schema(
            name = "rules",
            description = "An array of rules within the ruleset.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rules")
    public List<@Valid RepositoryRule> getRules() {
        return rules;
    }

    public void setRules(List<@Valid RepositoryRule> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposUpdateRepoRulesetRequest reposUpdateRepoRulesetRequest = (ReposUpdateRepoRulesetRequest) o;
        return Objects.equals(this.name, reposUpdateRepoRulesetRequest.name)
                && Objects.equals(this.target, reposUpdateRepoRulesetRequest.target)
                && Objects.equals(this.enforcement, reposUpdateRepoRulesetRequest.enforcement)
                && Objects.equals(this.bypassActors, reposUpdateRepoRulesetRequest.bypassActors)
                && Objects.equals(this.conditions, reposUpdateRepoRulesetRequest.conditions)
                && Objects.equals(this.rules, reposUpdateRepoRulesetRequest.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, target, enforcement, bypassActors, conditions, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateRepoRulesetRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    enforcement: ").append(toIndentedString(enforcement)).append("\n");
        sb.append("    bypassActors: ").append(toIndentedString(bypassActors)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
