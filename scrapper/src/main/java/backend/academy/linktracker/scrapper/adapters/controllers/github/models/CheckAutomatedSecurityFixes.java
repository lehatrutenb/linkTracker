package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Check Dependabot security updates
 */
@Schema(name = "check-automated-security-fixes", description = "Check Dependabot security updates")
@JsonTypeName("check-automated-security-fixes")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CheckAutomatedSecurityFixes {

    private Boolean enabled;

    private Boolean paused;

    public CheckAutomatedSecurityFixes() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CheckAutomatedSecurityFixes(Boolean enabled, Boolean paused) {
        this.enabled = enabled;
        this.paused = paused;
    }

    public CheckAutomatedSecurityFixes enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Whether Dependabot security updates are enabled for the repository.
     * @return enabled
     */
    @NotNull
    @Schema(
            name = "enabled",
            example = "true",
            description = "Whether Dependabot security updates are enabled for the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CheckAutomatedSecurityFixes paused(Boolean paused) {
        this.paused = paused;
        return this;
    }

    /**
     * Whether Dependabot security updates are paused for the repository.
     * @return paused
     */
    @NotNull
    @Schema(
            name = "paused",
            example = "false",
            description = "Whether Dependabot security updates are paused for the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("paused")
    public Boolean getPaused() {
        return paused;
    }

    public void setPaused(Boolean paused) {
        this.paused = paused;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckAutomatedSecurityFixes checkAutomatedSecurityFixes = (CheckAutomatedSecurityFixes) o;
        return Objects.equals(this.enabled, checkAutomatedSecurityFixes.enabled)
                && Objects.equals(this.paused, checkAutomatedSecurityFixes.paused);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, paused);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckAutomatedSecurityFixes {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
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
