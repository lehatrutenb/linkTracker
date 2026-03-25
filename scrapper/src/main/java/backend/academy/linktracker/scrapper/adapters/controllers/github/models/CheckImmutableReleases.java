package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Check immutable releases
 */
@Schema(name = "check-immutable-releases", description = "Check immutable releases")
@JsonTypeName("check-immutable-releases")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckImmutableReleases {

    private Boolean enabled;

    private Boolean enforcedByOwner;

    public CheckImmutableReleases() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckImmutableReleases(Boolean enabled, Boolean enforcedByOwner) {
        this.enabled = enabled;
        this.enforcedByOwner = enforcedByOwner;
    }

    public CheckImmutableReleases enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Whether immutable releases are enabled for the repository.
     * @return enabled
     */
    @NotNull
    @Schema(
            name = "enabled",
            example = "true",
            description = "Whether immutable releases are enabled for the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CheckImmutableReleases enforcedByOwner(Boolean enforcedByOwner) {
        this.enforcedByOwner = enforcedByOwner;
        return this;
    }

    /**
     * Whether immutable releases are enforced by the repository owner.
     * @return enforcedByOwner
     */
    @NotNull
    @Schema(
            name = "enforced_by_owner",
            example = "false",
            description = "Whether immutable releases are enforced by the repository owner.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enforced_by_owner")
    public Boolean getEnforcedByOwner() {
        return enforcedByOwner;
    }

    public void setEnforcedByOwner(Boolean enforcedByOwner) {
        this.enforcedByOwner = enforcedByOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckImmutableReleases checkImmutableReleases = (CheckImmutableReleases) o;
        return Objects.equals(this.enabled, checkImmutableReleases.enabled)
                && Objects.equals(this.enforcedByOwner, checkImmutableReleases.enforcedByOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, enforcedByOwner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckImmutableReleases {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    enforcedByOwner: ")
                .append(toIndentedString(enforcedByOwner))
                .append("\n");
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
