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
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A set of rules to apply when specified conditions are met.
 */
@Schema(name = "repository-ruleset", description = "A set of rules to apply when specified conditions are met.")
@JsonTypeName("repository-ruleset")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleset {

    private Long id;

    private String name;

    /**
     * The target of the ruleset
     */
    public enum TargetEnum {
        BRANCH("branch"),

        TAG("tag"),

        PUSH("push"),

        REPOSITORY("repository");

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

    private Optional<TargetEnum> target = Optional.empty();

    /**
     * The type of the source of the ruleset
     */
    public enum SourceTypeEnum {
        REPOSITORY("Repository"),

        ORGANIZATION("Organization"),

        ENTERPRISE("Enterprise");

        private final String value;

        SourceTypeEnum(String value) {
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
        public static SourceTypeEnum fromValue(String value) {
            for (SourceTypeEnum b : SourceTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<SourceTypeEnum> sourceType = Optional.empty();

    private String source;

    private RepositoryRuleEnforcement enforcement;

    @Valid
    private List<@Valid RepositoryRulesetBypassActor> bypassActors = new ArrayList<>();

    /**
     * The bypass type of the user making the API request for this ruleset. This field is only returned when querying the repository-level endpoint.
     */
    public enum CurrentUserCanBypassEnum {
        ALWAYS("always"),

        PULL_REQUESTS_ONLY("pull_requests_only"),

        NEVER("never"),

        EXEMPT("exempt");

        private final String value;

        CurrentUserCanBypassEnum(String value) {
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
        public static CurrentUserCanBypassEnum fromValue(String value) {
            for (CurrentUserCanBypassEnum b : CurrentUserCanBypassEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<CurrentUserCanBypassEnum> currentUserCanBypass = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<RepositoryRulesetLinks> links = Optional.empty();

    private JsonNullable<RepositoryRulesetConditions> conditions =
            JsonNullable.<RepositoryRulesetConditions>undefined();

    @Valid
    private List<@Valid RepositoryRule> rules = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> createdAt = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> updatedAt = Optional.empty();

    public RepositoryRuleset() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleset(Long id, String name, String source, RepositoryRuleEnforcement enforcement) {
        this.id = id;
        this.name = name;
        this.source = source;
        this.enforcement = enforcement;
    }

    public RepositoryRuleset id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The ID of the ruleset
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The ID of the ruleset", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RepositoryRuleset name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the ruleset
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the ruleset", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryRuleset target(TargetEnum target) {
        this.target = Optional.ofNullable(target);
        return this;
    }

    /**
     * The target of the ruleset
     * @return target
     */
    @Schema(name = "target", description = "The target of the ruleset", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("target")
    public Optional<TargetEnum> getTarget() {
        return target;
    }

    public void setTarget(Optional<TargetEnum> target) {
        this.target = target;
    }

    public RepositoryRuleset sourceType(SourceTypeEnum sourceType) {
        this.sourceType = Optional.ofNullable(sourceType);
        return this;
    }

    /**
     * The type of the source of the ruleset
     * @return sourceType
     */
    @Schema(
            name = "source_type",
            description = "The type of the source of the ruleset",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("source_type")
    public Optional<SourceTypeEnum> getSourceType() {
        return sourceType;
    }

    public void setSourceType(Optional<SourceTypeEnum> sourceType) {
        this.sourceType = sourceType;
    }

    public RepositoryRuleset source(String source) {
        this.source = source;
        return this;
    }

    /**
     * The name of the source
     * @return source
     */
    @NotNull
    @Schema(name = "source", description = "The name of the source", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public RepositoryRuleset enforcement(RepositoryRuleEnforcement enforcement) {
        this.enforcement = enforcement;
        return this;
    }

    /**
     * Get enforcement
     * @return enforcement
     */
    @NotNull
    @Valid
    @Schema(name = "enforcement", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enforcement")
    public RepositoryRuleEnforcement getEnforcement() {
        return enforcement;
    }

    public void setEnforcement(RepositoryRuleEnforcement enforcement) {
        this.enforcement = enforcement;
    }

    public RepositoryRuleset bypassActors(List<@Valid RepositoryRulesetBypassActor> bypassActors) {
        this.bypassActors = bypassActors;
        return this;
    }

    public RepositoryRuleset addBypassActorsItem(RepositoryRulesetBypassActor bypassActorsItem) {
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

    public RepositoryRuleset currentUserCanBypass(CurrentUserCanBypassEnum currentUserCanBypass) {
        this.currentUserCanBypass = Optional.ofNullable(currentUserCanBypass);
        return this;
    }

    /**
     * The bypass type of the user making the API request for this ruleset. This field is only returned when querying the repository-level endpoint.
     * @return currentUserCanBypass
     */
    @Schema(
            name = "current_user_can_bypass",
            description =
                    "The bypass type of the user making the API request for this ruleset. This field is only returned when querying the repository-level endpoint.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("current_user_can_bypass")
    public Optional<CurrentUserCanBypassEnum> getCurrentUserCanBypass() {
        return currentUserCanBypass;
    }

    public void setCurrentUserCanBypass(Optional<CurrentUserCanBypassEnum> currentUserCanBypass) {
        this.currentUserCanBypass = currentUserCanBypass;
    }

    public RepositoryRuleset nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public RepositoryRuleset links(RepositoryRulesetLinks links) {
        this.links = Optional.ofNullable(links);
        return this;
    }

    /**
     * Get links
     * @return links
     */
    @Valid
    @Schema(name = "_links", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("_links")
    public Optional<RepositoryRulesetLinks> getLinks() {
        return links;
    }

    public void setLinks(Optional<RepositoryRulesetLinks> links) {
        this.links = links;
    }

    public RepositoryRuleset conditions(RepositoryRulesetConditions conditions) {
        this.conditions = JsonNullable.of(conditions);
        return this;
    }

    /**
     * Get conditions
     * @return conditions
     */
    @Valid
    @Schema(name = "conditions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("conditions")
    public JsonNullable<RepositoryRulesetConditions> getConditions() {
        return conditions;
    }

    public void setConditions(JsonNullable<RepositoryRulesetConditions> conditions) {
        this.conditions = conditions;
    }

    public RepositoryRuleset rules(List<@Valid RepositoryRule> rules) {
        this.rules = rules;
        return this;
    }

    public RepositoryRuleset addRulesItem(RepositoryRule rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    /**
     * Get rules
     * @return rules
     */
    @Valid
    @Schema(name = "rules", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rules")
    public List<@Valid RepositoryRule> getRules() {
        return rules;
    }

    public void setRules(List<@Valid RepositoryRule> rules) {
        this.rules = rules;
    }

    public RepositoryRuleset createdAt(OffsetDateTime createdAt) {
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

    public RepositoryRuleset updatedAt(OffsetDateTime updatedAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRuleset repositoryRuleset = (RepositoryRuleset) o;
        return Objects.equals(this.id, repositoryRuleset.id)
                && Objects.equals(this.name, repositoryRuleset.name)
                && Objects.equals(this.target, repositoryRuleset.target)
                && Objects.equals(this.sourceType, repositoryRuleset.sourceType)
                && Objects.equals(this.source, repositoryRuleset.source)
                && Objects.equals(this.enforcement, repositoryRuleset.enforcement)
                && Objects.equals(this.bypassActors, repositoryRuleset.bypassActors)
                && Objects.equals(this.currentUserCanBypass, repositoryRuleset.currentUserCanBypass)
                && Objects.equals(this.nodeId, repositoryRuleset.nodeId)
                && Objects.equals(this.links, repositoryRuleset.links)
                && equalsNullable(this.conditions, repositoryRuleset.conditions)
                && Objects.equals(this.rules, repositoryRuleset.rules)
                && Objects.equals(this.createdAt, repositoryRuleset.createdAt)
                && Objects.equals(this.updatedAt, repositoryRuleset.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                name,
                target,
                sourceType,
                source,
                enforcement,
                bypassActors,
                currentUserCanBypass,
                nodeId,
                links,
                hashCodeNullable(conditions),
                rules,
                createdAt,
                updatedAt);
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
        sb.append("class RepositoryRuleset {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    enforcement: ").append(toIndentedString(enforcement)).append("\n");
        sb.append("    bypassActors: ").append(toIndentedString(bypassActors)).append("\n");
        sb.append("    currentUserCanBypass: ")
                .append(toIndentedString(currentUserCanBypass))
                .append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
