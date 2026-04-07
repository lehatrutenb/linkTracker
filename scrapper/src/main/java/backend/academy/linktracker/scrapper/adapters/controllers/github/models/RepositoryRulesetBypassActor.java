package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An actor that can bypass rules in a ruleset
 */
@Schema(name = "repository-ruleset-bypass-actor", description = "An actor that can bypass rules in a ruleset")
@JsonTypeName("repository-ruleset-bypass-actor")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRulesetBypassActor {

    private JsonNullable<Long> actorId = JsonNullable.<Long>undefined();

    /**
     * The type of actor that can bypass a ruleset.
     */
    public enum ActorTypeEnum {
        INTEGRATION("Integration"),

        ORGANIZATION_ADMIN("OrganizationAdmin"),

        REPOSITORY_ROLE("RepositoryRole"),

        TEAM("Team"),

        DEPLOY_KEY("DeployKey");

        private final String value;

        ActorTypeEnum(String value) {
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
        public static ActorTypeEnum fromValue(String value) {
            for (ActorTypeEnum b : ActorTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ActorTypeEnum actorType;

    /**
     * When the specified actor can bypass the ruleset. `pull_request` means that an actor can only bypass rules on pull requests. `pull_request` is not applicable for the `DeployKey` actor type. Also, `pull_request` is only applicable to branch rulesets. When `bypass_mode` is `exempt`, rules will not be run for that actor and a bypass audit entry will not be created.
     */
    public enum BypassModeEnum {
        ALWAYS("always"),

        PULL_REQUEST("pull_request"),

        EXEMPT("exempt");

        private final String value;

        BypassModeEnum(String value) {
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
        public static BypassModeEnum fromValue(String value) {
            for (BypassModeEnum b : BypassModeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<BypassModeEnum> bypassMode = Optional.of(BypassModeEnum.ALWAYS);

    public RepositoryRulesetBypassActor() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRulesetBypassActor(ActorTypeEnum actorType) {
        this.actorType = actorType;
    }

    public RepositoryRulesetBypassActor actorId(Long actorId) {
        this.actorId = JsonNullable.of(actorId);
        return this;
    }

    /**
     * The ID of the actor that can bypass a ruleset. Required for `Integration`, `RepositoryRole`, and `Team` actor types. If `actor_type` is `OrganizationAdmin`, `actor_id` is ignored. If `actor_type` is `DeployKey`, this should be null. `OrganizationAdmin` is not applicable for personal repositories.
     * @return actorId
     */
    @Schema(
            name = "actor_id",
            description =
                    "The ID of the actor that can bypass a ruleset. Required for `Integration`, `RepositoryRole`, and `Team` actor types. If `actor_type` is `OrganizationAdmin`, `actor_id` is ignored. If `actor_type` is `DeployKey`, this should be null. `OrganizationAdmin` is not applicable for personal repositories.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor_id")
    public JsonNullable<Long> getActorId() {
        return actorId;
    }

    public void setActorId(JsonNullable<Long> actorId) {
        this.actorId = actorId;
    }

    public RepositoryRulesetBypassActor actorType(ActorTypeEnum actorType) {
        this.actorType = actorType;
        return this;
    }

    /**
     * The type of actor that can bypass a ruleset.
     * @return actorType
     */
    @NotNull
    @Schema(
            name = "actor_type",
            description = "The type of actor that can bypass a ruleset.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("actor_type")
    public ActorTypeEnum getActorType() {
        return actorType;
    }

    public void setActorType(ActorTypeEnum actorType) {
        this.actorType = actorType;
    }

    public RepositoryRulesetBypassActor bypassMode(BypassModeEnum bypassMode) {
        this.bypassMode = Optional.ofNullable(bypassMode);
        return this;
    }

    /**
     * When the specified actor can bypass the ruleset. `pull_request` means that an actor can only bypass rules on pull requests. `pull_request` is not applicable for the `DeployKey` actor type. Also, `pull_request` is only applicable to branch rulesets. When `bypass_mode` is `exempt`, rules will not be run for that actor and a bypass audit entry will not be created.
     * @return bypassMode
     */
    @Schema(
            name = "bypass_mode",
            description =
                    "When the specified actor can bypass the ruleset. `pull_request` means that an actor can only bypass rules on pull requests. `pull_request` is not applicable for the `DeployKey` actor type. Also, `pull_request` is only applicable to branch rulesets. When `bypass_mode` is `exempt`, rules will not be run for that actor and a bypass audit entry will not be created.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bypass_mode")
    public Optional<BypassModeEnum> getBypassMode() {
        return bypassMode;
    }

    public void setBypassMode(Optional<BypassModeEnum> bypassMode) {
        this.bypassMode = bypassMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryRulesetBypassActor repositoryRulesetBypassActor = (RepositoryRulesetBypassActor) o;
        return equalsNullable(this.actorId, repositoryRulesetBypassActor.actorId)
                && Objects.equals(this.actorType, repositoryRulesetBypassActor.actorType)
                && Objects.equals(this.bypassMode, repositoryRulesetBypassActor.bypassMode);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(actorId), actorType, bypassMode);
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
        sb.append("class RepositoryRulesetBypassActor {\n");
        sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
        sb.append("    actorType: ").append(toIndentedString(actorType)).append("\n");
        sb.append("    bypassMode: ").append(toIndentedString(bypassMode)).append("\n");
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
