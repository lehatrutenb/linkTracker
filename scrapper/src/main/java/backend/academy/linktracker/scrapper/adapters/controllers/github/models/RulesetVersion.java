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
 * The historical version of a ruleset
 */
@Schema(name = "ruleset-version", description = "The historical version of a ruleset")
@JsonTypeName("ruleset-version")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RulesetVersion {

    private Long versionId;

    private RulesetVersionActor actor;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public RulesetVersion() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RulesetVersion(Long versionId, RulesetVersionActor actor, OffsetDateTime updatedAt) {
        this.versionId = versionId;
        this.actor = actor;
        this.updatedAt = updatedAt;
    }

    public RulesetVersion versionId(Long versionId) {
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

    public RulesetVersion actor(RulesetVersionActor actor) {
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

    public RulesetVersion updatedAt(OffsetDateTime updatedAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RulesetVersion rulesetVersion = (RulesetVersion) o;
        return Objects.equals(this.versionId, rulesetVersion.versionId)
                && Objects.equals(this.actor, rulesetVersion.actor)
                && Objects.equals(this.updatedAt, rulesetVersion.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versionId, actor, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RulesetVersion {\n");
        sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
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
