package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * RulesetVersionWithState
 */
@JsonTypeName("ruleset-version-with-state")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RulesetVersionWithState {

    private Long versionId;

    private RulesetVersionActor actor;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Object state;

    public RulesetVersionWithState() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RulesetVersionWithState(Long versionId, RulesetVersionActor actor, OffsetDateTime updatedAt, Object state) {
        this.versionId = versionId;
        this.actor = actor;
        this.updatedAt = updatedAt;
        this.state = state;
    }

    public RulesetVersionWithState versionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }

    /**
     * The ID of the previous version of the ruleset
     * @return versionId
     */
    @NotNull
    @Schema(
            name = "version_id",
            description = "The ID of the previous version of the ruleset",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version_id")
    public Long getVersionId() {
        return versionId;
    }

    public void setVersionId(Long versionId) {
        this.versionId = versionId;
    }

    public RulesetVersionWithState actor(RulesetVersionActor actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Get actor
     * @return actor
     */
    @NotNull
    @Valid
    @Schema(name = "actor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("actor")
    public RulesetVersionActor getActor() {
        return actor;
    }

    public void setActor(RulesetVersionActor actor) {
        this.actor = actor;
    }

    public RulesetVersionWithState updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RulesetVersionWithState state(Object state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the ruleset version
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description = "The state of the ruleset version",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public Object getState() {
        return state;
    }

    public void setState(Object state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RulesetVersionWithState rulesetVersionWithState = (RulesetVersionWithState) o;
        return Objects.equals(this.versionId, rulesetVersionWithState.versionId)
                && Objects.equals(this.actor, rulesetVersionWithState.actor)
                && Objects.equals(this.updatedAt, rulesetVersionWithState.updatedAt)
                && Objects.equals(this.state, rulesetVersionWithState.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, actor, updatedAt, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RulesetVersionWithState {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
